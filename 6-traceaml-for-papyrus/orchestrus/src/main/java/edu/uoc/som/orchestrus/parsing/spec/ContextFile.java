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


package edu.uoc.som.orchestrus.parsing.spec;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

import edu.uoc.som.orchestrus.parsing.Reference;
import edu.uoc.som.orchestrus.parsing.ReferenceFactory;
import edu.uoc.som.orchestrus.parsing.Source;
import edu.uoc.som.orchestrus.parsing.SpecificFileReferenceExtractor;
import edu.uoc.som.orchestrus.parsing.StaticExplorer;
import edu.uoc.som.orchestrus.parsing.utils.DomUtil;
import edu.uoc.som.orchestrus.utils.Utils;

public class ContextFile extends SpecificFileReferenceExtractor {
	
	public final static Logger LOGGER = Logger.getLogger(ContextFile.class.getName());
	
	List<Element> elements;
	public ContextFile(File f) {
		super(f);
		loadXMLTools();
		try {
			elements = getContextValuElementsFromFile(f);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private List<Element> getContextValuElementsFromFile(File xmlFile)
			throws SAXException, IOException {
		LOGGER.finest("XMI file: "+xmlFile.getAbsolutePath());

		Document doc = builder.parse(xmlFile);
		
		XPath xPath = XPathFactory.newInstance().newXPath();
		String expression = "//details[@key and @value]";
		List<Element> elts = new ArrayList<>();
		try {
			NodeList nodeList2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i < nodeList2.getLength(); i++) {
			   Node nNode = nodeList2.item(i);
			   elts.add((Element)nNode);
			   ((Element)nNode).setAttribute(StaticExplorer.XMI_SOURCE_PATH_REF, xmlFile.getAbsolutePath());
			   LOGGER.finest(" ->  "+((Element)nNode).getAttribute("value"));
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return elts;
	}
	
	public String getFilePath() {
		return f.getAbsolutePath();
	}
	
	@Override
	public String getHRefJSon() {
		return getJSonForCtxValues(elements);
	}
	
	/**
	 * For each element, extract the following information (JSON syntax)
	 * [ elt1: {XPath, Xpath with @names, [id,] key, value }]
	 * <br/>
	 * 
	 * Location are put with '/' in Json.
	 * 
	 * @param elts
	 * @return JSON
	 */
	private String getJSonForCtxValues(List<Element> elts) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		int i = 0;
		for (Element element : elts) {
			String sourceFile = element.getAttributes().getNamedItem(StaticExplorer.XMI_SOURCE_PATH_REF).getTextContent();
			String sourceInnerPath = DomUtil.getAbsolutePath(element);
			String sourceInnerPathNamed = DomUtil.getAbsolutePathNamed(element);
			Source source = new Source(sourceFile, sourceInnerPath, sourceInnerPathNamed);

			String cleanvalue = element.getAttributes().getNamedItem("value").getTextContent();
			
			/*
			 * Build and resolve references
			 */
			Reference r = ReferenceFactory.getReference(cleanvalue, source); 
			addReference(r);
			
			cleanvalue = Utils.cleanUrlsForJson(r.getHREF());
			
			String key = element.getAttributes().getNamedItem("key").getTextContent();
			
			Node elt = element.getAttributes().getNamedItem("xmi:id");
			String xmiid = elt != null ? "\n \"xmi:id\": \""+elt.getTextContent()+"\", ":"";
			sb.append("{"
					+ xmiid
					+ "\"xpath\": \""+sourceInnerPath+"\", "
					+ "\n \"xpathNamed\": \""+sourceInnerPathNamed+"\", "
					+ "\n \"key\": \"" + key +"\","
					+ "\n \"value\": \"" + cleanvalue +"\""
					+ "}");
			if(++i < elts.size()) sb.append(",");
			sb.append("\n");
		}
		sb.append("]");
		return sb.toString();
	}

}
