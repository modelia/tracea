package edu.uoc.som.orchestrus.parsing.spec;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import edu.uoc.som.orchestrus.config.Config;
import edu.uoc.som.orchestrus.parsing.Reference;
import edu.uoc.som.orchestrus.parsing.ReferenceFactory;
import edu.uoc.som.orchestrus.parsing.Source;
import edu.uoc.som.orchestrus.parsing.SpecificFileReferenceExtractor;
import edu.uoc.som.orchestrus.parsing.utils.DomUtil;
import edu.uoc.som.orchestrus.utils.Utils;

public class PluginFile extends SpecificFileReferenceExtractor {
	
	public final static Logger LOGGER = Logger.getLogger(PluginFile.class.getName());
	
	Document doc;
	XPath xPath;
	
	public PluginFile(File f) {
		super(f);
		loadXMLTools();
		try {
			doc = builder.parse(f);
			xPath = XPathFactory.newInstance().newXPath();
		} catch (SAXException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	@Override
	public String getFilePath() {
		return f.getAbsolutePath();
	}

	@Override
	public String getHRefJSon() {
		try {
			return getProfileExtensionPoints(doc, xPath, f);
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		throw new IllegalArgumentException("Error reading Plugin file at '"+f.getAbsolutePath()+"'");
	}
	
	private String getProfileExtensionPoints(Document doc, XPath xPath, File f) throws XPathExpressionException {
		String resElt = "{";

		String expression = "//extension[@point]";
		NodeList nodeList2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
		int i = 0;
		for (i = 0; i < nodeList2.getLength(); i++) {
			Node nNode = nodeList2.item(i);

			String pointStr = ((Element) nNode).getAttribute("point");
			String value = nNode.toString();
			ExtensionPoint point = ExtensionPoint.getExtensionPointFromName(pointStr);
			if(point != null) {
				switch (point) {
				case profile:
					value = getProfileExtension(doc, xPath, f);
					break;
				case generated_package:
					value = getPackageExtension(doc, xPath, f);
					break;
				case architecture:
					value = getArchitectureExtension(doc, xPath, f);
					break;
				case palette:
					value = getPaletteExtension(doc, xPath, f);
					break;
				case context:
					value = getContextExtension(doc, xPath, f);
					break;
				case factory:
					value = getFactoryExtension(doc, xPath, f);
					break;
				default:
					throw new IllegalArgumentException("Should never get there, unrecognized extension point: " + point);
				}
	
				resElt += "\"" + point + "\": " + value + ",\n";
			}
		}
		if (i > 0)
			resElt = resElt.substring(0, resElt.trim().length() - 1);
		LOGGER.finer(resElt);
		return resElt + "}";
	}

	static enum ExtensionPoint {
		profile("org.eclipse.papyrus.uml.extensionpoints.UMLProfile"),
		generated_package("org.eclipse.emf.ecore.generated_package"),
		architecture("org.eclipse.papyrus.infra.architecture.models"), 
		palette("org.eclipse.papyrus.infra.newchild"),
		context("org.eclipse.papyrus.infra.properties.contexts"), 
		factory("org.eclipse.emf.ecore.factory_override");

		ExtensionPoint(String name) {
			this.name = name;
		}

		static ExtensionPoint getExtensionPointFromName(String name) {
			for (ExtensionPoint ep : ExtensionPoint.values()) {
				if (ep.getName().equals(name))
					return ep;
			}
			LOGGER.warning("Extension point not found '"+name+"'");
			return null;
		}

		String name;

		public String getName() {
			return name;
		}
	}

	private String getProfileExtension(Document doc, XPath xPath, File f) {
		String res = "";
		String expression = "/plugin/extension/profile";
		try {
			NodeList nodeList2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i < nodeList2.getLength(); i++) {
				if (i > 1) {
					throw new IllegalArgumentException("Should never get there, only one extension profile by "
							+ Config.PLUGIN_XML_FILENAME + " file.");
				}
				Node nNode = nodeList2.item(i);
				res += "{ "
						+ "\"type\": \"profile\", "
						+ "\"xpath\": \""+DomUtil.getAbsolutePath((Element)nNode)+"\", "
						+ "\"name\": \""+((Element)nNode).getAttribute("name")+"\", "
						+ "\"path\": \""+((Element)nNode).getAttribute("path")+"\", "
						+ "\"iconpath\": \""+((Element)nNode).getAttribute("iconpath")+"\"}";
				
				LOGGER.finest(res);
				
				
				// TODO Information required to resolve ??
				// TODO what about NAME ???
				String path = ((Element)nNode).getAttribute("path");
				String iconpath = ((Element)nNode).getAttribute("iconpath");
				Source source = new Source(getFilePath(), DomUtil.getAbsolutePath((Element)nNode), DomUtil.getAbsolutePathNamed((Element)nNode));
				Reference r = ReferenceFactory.getReference(Utils.cleanUrlsForJson(path), source);
				Reference r2 = ReferenceFactory.getReference(Utils.cleanUrlsForJson(iconpath), source);
				addReference(r);
				addReference(r2);
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	private String getPackageExtension(Document doc, XPath xPath, File f) {
		String res = "";
		String expression = "/plugin/extension/package";
		try {
			NodeList nodeList2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i < nodeList2.getLength(); i++) {
				if ( i > 1 ) {
					throw new IllegalArgumentException("Should never get there, only one extension package by "+Config.PLUGIN_XML_FILENAME+" file.");
				}
				Node nNode = nodeList2.item(i);
				res += "{ "
						+ "\"type\": \"package\", "
						+ "\"xpath\": \""+DomUtil.getAbsolutePath((Element)nNode)+"\", "
						+ "\"uri\": \""+((Element)nNode).getAttribute("uri")+"\", "
						+ "\"class\": \""+((Element)nNode).getAttribute("class")+"\", "
						+ "\"genmodel\": \""+((Element)nNode).getAttribute("genmodel")+"\"}";
				LOGGER.finest(res);

				
				// TODO Information required to resolve ??
				// TODO what about URI and class ???
				String genmodel = ((Element)nNode).getAttribute("genmodel");
				String uri = ((Element)nNode).getAttribute("uri");
				Source source = new Source(getFilePath(), DomUtil.getAbsolutePath((Element)nNode), DomUtil.getAbsolutePathNamed((Element)nNode));
				Reference r = ReferenceFactory.getReference(Utils.cleanUrlsForJson(genmodel), source);
				Reference r2 = ReferenceFactory.getReference(Utils.cleanUrlsForJson(uri), source);
				addReference(r);
				addReference(r2);
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	private String getArchitectureExtension(Document doc, XPath xPath, File f) {
		String res = "";
		String expression = "/plugin/extension/model";
		try {
			NodeList nodeList2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i < nodeList2.getLength(); i++) {
				if ( i > 1 ) {
					throw new IllegalArgumentException("Should never get there, only one extension architecture by "+Config.PLUGIN_XML_FILENAME+" file.");
				}
				Node nNode = nodeList2.item(i);
				res += "{ "
						+ "\"type\": \"model\", "
						+ "\"xpath\": \""+DomUtil.getAbsolutePath((Element)nNode)+"\", "
						+ "\"path\": \""+((Element)nNode).getAttribute("path")+"\"}";
				LOGGER.finest(res);
				
				
				// TODO Information required to resolve ??
				String path = ((Element)nNode).getAttribute("path");
				Source source = new Source(getFilePath(), DomUtil.getAbsolutePath((Element)nNode), DomUtil.getAbsolutePathNamed((Element)nNode));
				Reference r = ReferenceFactory.getReference(Utils.cleanUrlsForJson(path), source);
				addReference(r);
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return res;
	}

	private String getPaletteExtension(Document doc, XPath xPath, File f) {
		String res = "";
		String expression = "/plugin/extension/menuCreationModel";
		try {
			NodeList nodeList2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i < nodeList2.getLength(); i++) {
				if ( i > 1 ) {
					throw new IllegalArgumentException("Should never get there, only one extension palette by "+Config.PLUGIN_XML_FILENAME+" file.");
				}
				Node nNode = nodeList2.item(i);
				res += "{ "
						+ "\"type\": \"palette\", "
						+ "\"xpath\": \""+DomUtil.getAbsolutePath((Element)nNode)+"\", "
						+ "\"model\": \""+((Element)nNode).getAttribute("model")+"\"}";
				LOGGER.finest(res);
				
				
				// TODO Information required to resolve ??
				String model = ((Element)nNode).getAttribute("model");
				Source source = new Source(getFilePath(), DomUtil.getAbsolutePath((Element)nNode), DomUtil.getAbsolutePathNamed((Element)nNode));
				Reference r = ReferenceFactory.getReference(Utils.cleanUrlsForJson(model), source);
				addReference(r);
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return res;
	}

	private String getContextExtension(Document doc, XPath xPath, File f) {
		String res = "";
		String expression = "/plugin/extension/context";
		try {
			NodeList nodeList2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i < nodeList2.getLength(); i++) {
				if ( i > 1 ) {
					throw new IllegalArgumentException("Should never get there, only one extension context by "+Config.PLUGIN_XML_FILENAME+" file.");
				}
				Node nNode = nodeList2.item(i);
				res += "{ "
						+ "\"type\": \"context\", "
						+ "\"xpath\": \""+DomUtil.getAbsolutePath((Element)nNode)+"\", "
						+ "\"contextModel\": \""+((Element)nNode).getAttribute("contextModel")+"\", "
						+ "\"isCustomizable\": \""+((Element)nNode).getAttribute("isCustomizable")+"\"}";
				LOGGER.finest(res);
				
				
				// TODO Information required to resolve ??
				String contextModel = ((Element)nNode).getAttribute("contextModel");
				Source source = new Source(getFilePath(), DomUtil.getAbsolutePath((Element)nNode), DomUtil.getAbsolutePathNamed((Element)nNode));
				Reference r = ReferenceFactory.getReference(Utils.cleanUrlsForJson(contextModel), source);
				addReference(r);
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return res;
	}

	private String getFactoryExtension(Document doc, XPath xPath, File f) {
		String res = "";
		String expression = "/plugin/extension/factory";
		try {
			NodeList nodeList2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i < nodeList2.getLength(); i++) {
				if ( i > 1 ) {
					throw new IllegalArgumentException("Should never get there, only one extension factory by "+Config.PLUGIN_XML_FILENAME+" file.");
				}
				Node nNode = nodeList2.item(i);
				res += "{ "
						+ "\"type\": \"factory\", "
						+ "\"xpath\": \""+DomUtil.getAbsolutePath((Element)nNode)+"\", "
						+ "\"class\": \""+((Element)nNode).getAttribute("class")+"\", "
						+ "\"uri\": \""+((Element)nNode).getAttribute("uri")+"\"}";

				
				// TODO Information required to resolve ??
				String uri = ((Element)nNode).getAttribute("uri");
				Source source = new Source(getFilePath(), DomUtil.getAbsolutePath((Element)nNode), DomUtil.getAbsolutePathNamed((Element)nNode));
				Reference r = ReferenceFactory.getReference(Utils.cleanUrlsForJson(uri), source);
				addReference(r);
				LOGGER.finest(res);
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return res;
	}


}
