/*****************************************************************************
* Copyright (c) 2015, 2022 CEA-LIST & SOM-UOC, Edouard Batot
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
* UOC-SOM - Initial API and implementation
*  -> Edouard Batot (UOC SOM) ebatot@uoc.edu 
*****************************************************************************/


package edu.uoc.som.orchestrus.parsing;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import edu.uoc.som.orchestrus.config.Config;
import edu.uoc.som.orchestrus.parsing.spec.ContextFile;
import edu.uoc.som.orchestrus.parsing.spec.EcoreModelFile;
import edu.uoc.som.orchestrus.parsing.spec.GenModel;
import edu.uoc.som.orchestrus.parsing.spec.JavaFolder;
import edu.uoc.som.orchestrus.parsing.spec.PluginFile;
import edu.uoc.som.orchestrus.parsing.utils.DomUtil;
import edu.uoc.som.orchestrus.parsing.utils.XmlException;
import edu.uoc.som.orchestrus.tracemodel.Artefact;
import edu.uoc.som.orchestrus.tracemodel.ArtefactFactory;
import edu.uoc.som.orchestrus.tracemodel.typing.ArtefactTypeFactory;
import edu.uoc.som.orchestrus.utils.Utils;

public class StaticExplorer {
	public final static Logger LOGGER = Logger.getLogger(StaticExplorer.class.getName());
	public final static Logger LOGGER2 = Logger.getLogger(StaticExplorer.class.getName()+2);
	
	/** Internal temporary name for source file path of references */
	public static final String XMI_SOURCE_PATH_REF = "refSource";
	
	private DocumentBuilderFactory factory;
	private DocumentBuilder builder;
	
	private Config config;

	public StaticExplorer(Config config) {
		// TODO Externalize config parameters: project root in CmdLine...
		// TODO Derive config parameters: dependencies, project name, and uris... 
		this.config = config;
		try {
			factory = DocumentBuilderFactory.newInstance();
			builder = factory.newDocumentBuilder();
			factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
		} catch (ParserConfigurationException e) {
			throw new XmlException("Could not load the XML factory. (DEV)");
		}
	}
	
	
	/**
	 * Get XMI elements with an HREF attribute (see {@link #getHrefs_Json()}) <br/>
	 * and other elements with interdependencies (ctx.values) (see {@link #getJSonForCtxValues()}
	 * 
	 * <em> Collects on the fly references for later processing. </em>
	 * 
	 * (Note: ctx values are added in properties-editor-configurations under suffixed file name "Project.ctx-value")
	 * @return JSON
	 */
	@SuppressWarnings("deprecation")
	public String getInterArtefactReferences_Json() {
		LOGGER.info("Building References - JSon manipulation.");
		JsonParser parser = new JsonParser();
		
		
		// Root created with HREFS references
		String hrefs = getHrefs_Json();
		JsonElement elHrefs = parser.parse(hrefs);
		JsonObject obRoot = elHrefs.getAsJsonObject();
		
		
		// Plugin.xml references
		String pluginXmlRefs = getJSonForPluginXMLRefs();
		JsonElement elPlugin = parser.parse(pluginXmlRefs);
		obRoot.add(Config.PLUGIN_XML_FILENAME, elPlugin);
		
		// uml-profile/*.ecore definition and references
		String filePath = config.getEcoreFilePath();
		if(!filePath.isBlank()) {
			File f = new File(filePath);
			String ecoreFileName = f.getName();
			String ecoreRefs = getJSonForEcoreRefs();
			JsonArray obEcore = obRoot.getAsJsonObject(Config.getUmlprofilesfolder()).getAsJsonArray(ecoreFileName);
			JsonElement elEcore = parser.parse(ecoreRefs);
			obEcore.add(elEcore);
		}
		
		// TODO To lower ?! always ? or only for GlossaryML project..
		String genmodelFileName = new File(config.getGenmodelFilePath()).getName();
		String genmodRefs = getJsonForGenmodelRefs();
		JsonElement elGenmod = parser.parse(genmodRefs);
		JsonArray obGenmod = obRoot.getAsJsonObject(Config.getUmlprofilesfolder()).getAsJsonArray(genmodelFileName);
		if(obGenmod == null)
			obRoot.getAsJsonObject(Config.getUmlprofilesfolder()).add(genmodelFileName, elGenmod);
//		obGenmod.add(elGenmod);

		
		// Added extra context references
		String contextFileName = Config.getInstance().getProjectName() + ".ctx";
		String ctxValues = getJSonForCtxValues();
		JsonElement elCtx = parser.parse(ctxValues);
		JsonObject obEditorProperties = obRoot.getAsJsonObject(Config.getPropertiesEditorConfiguration());
		obEditorProperties.add(contextFileName+"-values", elCtx);
		
		
		for (File fCustom : Config.getInstance().getJavaCustomFolders()) {
			String customSourceFolder = fCustom.getName();
			String customJavaFolderJson = getJSonForJavaCustomFolder(fCustom);
			JsonElement elJavaCustom = parser.parse(customJavaFolderJson);
			obRoot.add(customSourceFolder, elJavaCustom);
		}
		
		/*
		 * Yet to parse:
		 * - CustomizationConfiguration.xmi
		 * - build.properties
		 * - .project
		 * - .classpath
		 * 
		 * - src-custom java files
		 * 
		 */
		
		
	
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(elHrefs);
	}
	
	
	Set<JavaFolder> javaFolders;
	
	private String getJSonForJavaCustomFolder(File fCustom) {
		String res = "";
		Set<File> folders = Config.getInstance().getJavaCustomFolders();
		javaFolders = new HashSet<JavaFolder>(folders.size());
		for (File folder : folders) {
			JavaFolder jf = new JavaFolder(folder);
			javaFolders.add(jf);
			res = jf.getHRefJSon() + ",";
			// TODO create references and stick JSON !
		}
		if(!res.isBlank())
			res = res.substring(0, res.length()-1);

		return ""+res+"";
	}


	private String getHrefs_Json() {
		String res ="{";
		int isf = 0;
		for (String sf : Config.getInstance().getContentFoldersFull()) {
			File f = new File(sf);
			res += "\"" + f.getName() + "\": \n";
			
			File[] files = f.listFiles(XMILikeFileFilter.getFilter());
			if(files == null || files.length == 0) {
				res += "{}";
			} else {
				String domainModelHrefs = "";
				try {
					if (files != null)
						domainModelHrefs = getJSonForHrefsFromFiles(Arrays.asList(files));
					res += domainModelHrefs;
				} catch (SAXException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (++isf < Config.getInstance().getContentFoldersName().size())
				res += ",\n";
		}
		return res + "}";
	}
	
	private String getJSonForHrefsFromFiles(Collection<File> files) throws SAXException, IOException {
		String res = "{";
		int i = 0;
		int countElts  = 0;
		for (File f : files) {
			List<Element> elts = getHREFElementsFromFile(f);
			countElts += elts.size();
			String hrefs = getJSonForHrefs(elts) ;
			res += "\n\""+f.getName()+"\": "+hrefs + (++i < files.size()?",":"");
		}
		res += "}";
		LOGGER.fine(countElts + " references found in " + files.size() + " files");
		return res;
	}

	private String getJSonForCtxValues() {
		String res = "";
		File fContext = new File(config.getPropertiesEditorConfigurationContext());
		if(fContext.exists() ) {
			ContextFile gm = new ContextFile(fContext);
			res = gm.getHRefJSon();
			LOGGER.fine(gm.getReferences().size() + " references found in '" + fContext + "'");
		} else {
			LOGGER.warning("No context file");			
		}
		return res;
	}

	/**
	 * Extract references from GenModel file. <br/>
	 * 
	 * <ul>
	 * <li>genModelDeclaration</li>
	 * <ul>
	 * <li>modelDirectory</li>
	 * 
	 * <li>modelPluginID</li>
	 * <li>modelName</li>
	 * <li>rootExtendsClass</li>
	 * <li>importerID</li>
	 * <li>usedGenPackages (list)</li>
	 * <ul>
	 * <li>Foreign models</li>
	 * <li>(genFeatures ? not yet implemented)</li>
	 * <ul>
	 * 
	 * @return JSON
	 */
	private String getJsonForGenmodelRefs() {
		String res = "";
		File f = new File(config.getGenmodelFilePath());
		if(f.exists()) {
			GenModel gm = new GenModel(f);
			res = gm.getHRefJSon();
			LOGGER.fine(gm.getReferences().size() + " references found in '" + f + "'");
		} else {
			LOGGER.warning("No genmodel file found");			
		}
		return res;
	}

	

	/**
	 * Extract references from Ecore project file (see
	 * {@link Config#getEcoreFilePath()}) <br/>
	 * <ul>
	 * <li>epackageDeclaration values,</li>
	 * <li>eStructuralFeature types (intra and inter model dependencies)</li>
	 * </ul>
	 * 
	 * @return JSON
	 */
	private String getJSonForEcoreRefs() {
		String res = "";
		File f = new File(config.getGenmodelFilePath());
		if(f.exists()) {
			EcoreModelFile ecoreModel = new EcoreModelFile(f);
			res = ecoreModel.getHRefJSon();
			LOGGER.fine(ecoreModel.getReferences().size() + " references found in '" + f + "'");
		} else {
			LOGGER.warning("No Ecore file found");			
		}
		return res;
	}

	/**
	 * 
	 * @return JSON containing references found in /plugin.xml file
	 */
	private String getJSonForPluginXMLRefs() {
		File f = Config.getInstance().getConfigFile(Config.PLUGIN_XML_FILENAME);
		PluginFile pf = new PluginFile(f);
		return pf.getHRefJSon();
	}

	
	
	/**
	 * For each element found with a "href" attribute, extract the following information (JSON syntax)
	 * [ elt1: { XPath-to-Elt ; XPath neamed ; xmi:type ; href }
	 * 
	 * @param elts
	 * @return JSON
	 */
	private static String getJSonForHrefs(List<Element> elts) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		int i = 0;
		for (Element element : elts) {
			String sourceFile = element.getAttributes().getNamedItem(XMI_SOURCE_PATH_REF).getTextContent();
			String sourceInnerPath = DomUtil.getAbsolutePath(element);
			String sourceInnerPathNamed = DomUtil.getAbsolutePathNamed(element);
			Source source = new Source(sourceFile, sourceInnerPath, sourceInnerPathNamed);
			
			String cleanhref = element.getAttributes().getNamedItem("href").getTextContent();
			
			/*
			 * Build and resolve references
			 */
			Reference r = ReferenceFactory.getReference(cleanhref, source);
			
			cleanhref = Utils.cleanUrlsForJson(r.getHREF());
			
			Node elt = element.getAttributes().getNamedItem("xmi:type");
			String xmitype = elt != null ? "\n \"xmi:type\": \""+elt.getTextContent()+"\", ":"";

			sb.append("{"
//					+ "\"sourceFile\": \""+Utils.cleanUrlsForJson(sourceFile)+"\", "
					+ "\"xpath\": \""+sourceInnerPath+"\", "
					+ "\n \"xpathNamed\": \""+sourceInnerPathNamed+"\", "
					+ xmitype
					+ "\n \"href\": \"" + cleanhref +"\""
					+ "}");
			if(++i < elts.size()) sb.append(",");
			sb.append("\n");
		}
		sb.append("]");
		return sb.toString();
	}


	



	private List<Element> getHREFElementsFromFile(File xmlFile)
			throws SAXException, IOException {
		LOGGER.finest("XMI file: "+xmlFile.getAbsolutePath());
		Document doc = builder.parse(xmlFile);
		
		XPath xPath = XPathFactory.newInstance().newXPath();
		String expression = "//*[@href]";
		List<Element> elts = new ArrayList<>();
		try {
			NodeList nodeList2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i < nodeList2.getLength(); i++) {
			   Node nNode = nodeList2.item(i);
			   elts.add((Element)nNode);
			   //Injects sourceFile in Element.
			   ((Element)nNode).setAttribute(XMI_SOURCE_PATH_REF, xmlFile.getAbsolutePath());
			   LOGGER.finest(" ->  "+((Element)nNode).getAttribute("href"));
			   
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return elts;
	}
	


	public static Set<Source> getSourceFiles() {
		return ReferenceFactory.getReferencesSourcesReversed().keySet();
	}
	
	/**
	 * 
	 * @return For each source file, its references.
	 */
	public static HashMap<Source, ArrayList<Reference>> getReferencesSourcesReversed() {
		return ReferenceFactory.getReferencesSourcesReversed();
	}


	/**
	 * NOT IMPLEMENTED !
	 * @param f
	 * @param id
	 * @return
	 */
	public Element getElementFromFile(File f, String id) {
		// TODO get element from xmi ID !
	
		try {
			Document doc = builder.parse(f);
			
			XPath xPath = XPathFactory.newInstance().newXPath();
			String expression = "//details[@xmi:id=\""+id+"\"]";
			List<Element> elts = new ArrayList<>();
				NodeList nodeList2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
				for (int i = 0; i < nodeList2.getLength(); i++) {
				   Node nNode = nodeList2.item(i);
				}
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new IllegalAccessError("NOT IMPLEMENTED !");
	}


	/**
	 * Warning. NOT IMPLEMENTED !
	 * Extract elements from XMI files using their xmi:ID.
	 */
	public void resolveElementIDs() {
		for (Artefact a : ArtefactFactory.subsetsArtefactsByType(ArtefactTypeFactory.ELEMENT_ARTEFACT)) {
			String name = a.getName(); 
			if(a.isResolves()) {
				if(name.length() == 23 && name.startsWith("_")) {
					File f = new File(a.getLocation() + File.separator + a.getName());
					
					Object elt = getElementFromFile(f, name);
					
				}
			}
		}
		throw new IllegalAccessError("NOT IMPLEMENTED !");
	}
}
	
