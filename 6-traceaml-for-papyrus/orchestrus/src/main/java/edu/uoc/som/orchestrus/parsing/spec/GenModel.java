package edu.uoc.som.orchestrus.parsing.spec;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import edu.uoc.som.orchestrus.parsing.Reference;
import edu.uoc.som.orchestrus.parsing.ReferenceFactory;
import edu.uoc.som.orchestrus.parsing.Source;
import edu.uoc.som.orchestrus.parsing.SpecificFileReferenceExtractor;
import edu.uoc.som.orchestrus.parsing.utils.DomUtil;
import edu.uoc.som.orchestrus.utils.Utils;

public class GenModel extends SpecificFileReferenceExtractor {

	private String modelDirectory;
	private String modelPluginID;
	private String modelName;
	private String rootExtendsClass;
	private String importerID;
	private String[] usedGenPackages;
	
	
	private Element rootNode;
	private List<Element> foreignModels;
	
	public GenModel(File f) {
		super(f);
		loadXMLTools();
		init();
	}
	
	public void init() {
		try {
			rootNode = null;
			Document doc = builder.parse(f);
			XPath xPath = XPathFactory.newInstance().newXPath();
			NodeList nodeList2 = doc.getChildNodes();
			for (int i = 0; i < nodeList2.getLength(); i++) {
				Node nNode = nodeList2.item(i);
				if(rootNode == null)
					rootNode = (Element)nNode;
				else
					throw new IllegalAccessError("Only one genModel node (root) expected in genmodel file.");
			}
			affectRootValues(rootNode);
			
			foreignModels = new ArrayList<>();
			String expression = "//foreignModel";
			nodeList2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i < nodeList2.getLength(); i++) {
				Node nNode = nodeList2.item(i);
				foreignModels.add((Element)nNode);
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void affectRootValues(Element rootNode2) {
		this.modelDirectory = ((Element) rootNode).getAttribute("modelDirectory");
		this.modelPluginID = ((Element) rootNode).getAttribute("modelPluginID");
		this.modelName = ((Element) rootNode).getAttribute("modelName");
		this.rootExtendsClass = ((Element) rootNode).getAttribute("rootExtendsClass");
		this.importerID = ((Element) rootNode).getAttribute("importerID");
		this.usedGenPackages = ((Element) rootNode).getAttribute("usedGenPackages").split(" ");
		if(usedGenPackages == null)
			usedGenPackages = new String[0];
	}

	public String getFilePath() {
		return f.getAbsolutePath();
	}

	@Override
	public String getHRefJSon() {
		String res = "";
		res = getJSonForRootValues(res) + ", ";
		res += getJSonForForeignModels() + ", ";
		res += getJSonForGenClasses() + ", ";
		res += getJSonForGenFeatures();
		
		return "{" + res + "}";
	}

	private String getJSonForRootValues(String res) {
		res += "\"root\": {"
					+ "\"modelDirectory\": \""+modelDirectory+"\", "
					+ "\"modelPluginID\": \""+modelPluginID+"\", "
					+ "\"modelName\": \""+modelName+"\", "
					+ "\"rootExtendsClass\": \""+rootExtendsClass+"\", "
					+ "\"importerID\": \""+importerID+"\", "
					+ "\"usedGenPackages\": "+getUsegGenPackagesAsJSonArray() + "}"
				;
		Source source = new Source(getFilePath(), DomUtil.getAbsolutePath(rootNode), DomUtil.getAbsolutePathNamed(rootNode));
		// TODO Information required to resolve ??
		Reference r = ReferenceFactory.getReference(Utils.cleanUrlsForJson(modelDirectory), source);
		Reference r2 = ReferenceFactory.getReference(Utils.cleanUrlsForJson(modelPluginID), source);
		Reference r3 = ReferenceFactory.getReference(Utils.cleanUrlsForJson(rootExtendsClass), source);
		addReference(r);
		addReference(r2);
		addReference(r3);
		return res;
	}

	/**
	 * Return a JSon array with foreign model references. <br/>
	 * @return
	 */
	private String getJSonForForeignModels() {
		String resFMs = "";
		for (Element e : foreignModels) {
			resFMs += "\"" + ((Element) e).getTextContent() + "\",\n";

			// TODO Information required to resolve ??
			Source source = new Source(getFilePath(), DomUtil.getAbsolutePath(e), DomUtil.getAbsolutePathNamed(e));
			Reference r = ReferenceFactory.getReference(Utils.cleanUrlsForJson(e.getTextContent()), source);
			addReference(r);
		}
		resFMs = resFMs.trim();
		if (!resFMs.isBlank())
			resFMs = resFMs.substring(0, resFMs.length() - 1);
		resFMs = "\"foreignModels\": [" + resFMs + "] ";
		return resFMs;
	}
	
	private List<Element> collectElements(String xPathExpr) {

		List<Element> res = new ArrayList<>();
		try {
			Document doc = builder.parse(f);
			XPath xPath = XPathFactory.newInstance().newXPath();
			
			NodeList nodeList2 = (NodeList) xPath.compile(xPathExpr).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i < nodeList2.getLength(); i++) {
				Node nNode = nodeList2.item(i);
				res.add((Element) nNode);
			}
		} catch (SAXException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	/**
	 * Return a JSon array with all estructural feature in the EcoreModel.<br/>
	 * Create a reference for each estructuralfeature with its 'eTypePath' - to be discussed.
	 * @return
	 */
	private String getJSonForGenFeatures() {
		String res = "";
		
		List<Element> genFeatures = collectElements("//genFeatures");
		for (Element e : genFeatures) {
			String[] ecoreClassArray = ((Element)e).getAttribute("ecoreClass").split(" ");
			String ecoreClassType = "";
			String ecoreClassPath = "";					
			if(ecoreClassArray.length > 1) {
				ecoreClassType = (e).getAttribute("eType").split(" ")[0];
				ecoreClassPath = (e).getAttribute("eType").split(" ")[1];	
			} else {
				ecoreClassType = "local";
				ecoreClassPath = (e).getAttribute("eType").split(" ")[0];
			}
			
			res += "{\"type\": \"eStructuralFeature\", "
					+ "\"xpath\": \""+DomUtil.getAbsolutePath(e)+"\", "
					+ "\"xpathNamed\": \""+DomUtil.getAbsolutePathNamed(e)+"\", "
					+ "\"xsi:type\": \""+((Element)e).getAttribute("xsi:type")+"\", "
					+ "\"eTypePath\": \""+ecoreClassType+"\", "
					+ "\"eTypeType\": \""+ecoreClassPath+"\""
					+ "},";
			
			
			// TODO Information required to resolve ??
			Source source = new Source(getFilePath(), DomUtil.getAbsolutePath(e), DomUtil.getAbsolutePathNamed(e));
			Reference r = ReferenceFactory.getReference(Utils.cleanUrlsForJson(ecoreClassPath), source);
			addReference(r);
		}
		res = res.trim();
		if (!res.isBlank())
			res = res.substring(0, res.length() - 1);
		
		res = "\"genFeatures\": [" + res + "] ";
		return res;
	}
	
	private String getJSonForGenClasses() {
		String res = "";
		
		List<Element> genFeatures = collectElements("//genClasses");
		for (Element e : genFeatures) {
			String ecoreClass = ((Element)e).getAttribute("ecoreClass");
			res += "{\"type\": \"eStructuralFeature\", "
					+ "\"xpath\": \""+DomUtil.getAbsolutePath(e)+"\", "
					+ "\"xpathNamed\": \""+DomUtil.getAbsolutePathNamed(e)+"\", "
					+ "\"xsi:type\": \""+((Element)e).getAttribute("xsi:type")+"\", "
					+ "\"ecoreClass\": \""+ecoreClass+"\" "
					+ "},";
			
			
			// TODO Information required to resolve ??
			Source source = new Source(getFilePath(), DomUtil.getAbsolutePath(e), DomUtil.getAbsolutePathNamed(e));
			Reference r = ReferenceFactory.getReference(Utils.cleanUrlsForJson(ecoreClass), source);
			addReference(r);
		}
		res = res.trim();
		if (!res.isBlank())
			res = res.substring(0, res.length() - 1);
		
		res = "\"genClasses\": [" + res + "] ";
		return res;
	}


	/**
	 * Axtrude a list from the node's 'usedGenPackages' attribute.
	 * 
	 * @param nNode
	 * @return
	 */
	private String getUsegGenPackagesAsJSonArray() {
		String ugp = "";
		for (String gp : usedGenPackages)
			ugp += "\"" + gp + "\",";
		if (!ugp.isBlank())
			ugp = ugp.substring(0, ugp.length() - 1);
		ugp = "[" + ugp + "]";
		return ugp;
	}
}
