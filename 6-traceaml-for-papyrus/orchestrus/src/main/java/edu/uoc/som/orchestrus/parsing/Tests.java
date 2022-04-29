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
import java.io.FileNotFoundException;
import java.io.IOException;
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

import edu.uoc.som.orchestrus.config.Config;
import edu.uoc.som.orchestrus.parsing.utils.DomUtil;
import edu.uoc.som.orchestrus.tracemodel.ArtefactFactory;
import edu.uoc.som.orchestrus.tracemodel.Trace;
import edu.uoc.som.orchestrus.tracemodel.TraceFactory;
import edu.uoc.som.orchestrus.tracemodel.typing.ArtefactTypeFactory;
import edu.uoc.som.orchestrus.utils.Utils;

public class Tests {

	public final static Logger LOGGER = Logger.getLogger(Tests.class.getName());

	public static void main(String[] args) throws IOException, ParserConfigurationException {
		System.out.println("    --  o· o - O ~ o - o ~ o · O ·--");
		System.out.println("    --                            --");
		System.out.println("    -- --      Orchestrus      -- --");
		System.out.println("    --       Parsing  tests       --");
		System.out.println("    --------------------------------\n");

		Config config = Config.getInstance();

		
		StaticExplorer ppse = new StaticExplorer(config);
		String interArtDependencies_JSON = ppse.getInterArtefactReferences_Json();
		Utils.storeDependencies_HC(interArtDependencies_JSON);

		ArtefactFactory aFactory = ArtefactFactory.getInstance();
		aFactory.buildArtefacts();
		
//		aFactory.printArtefactsByType();

		
		TraceFactory tFactory = TraceFactory.getInstance();

		// TODONE Connect fragments.
		TraceFactory.fragmentSourcesAndFolders();
		// TODONE connect artefacts with links.
		Trace t = TraceFactory.buildReferencesTrace();
		
		

		// TODO Decompose artefacts with XPath patterns.




		/*
		 * Check which files are left - Javas - Manifest & Pom - Class path &
		 * .properties - plugin.xml
		 */

		// Create artefacts
		// - Each file, with location (relative to project root vs absolute, urls??)

		// - Find which one are internal and which ones are external
		// - Group destinations
		// - Check protocol (ppe, platform, pathmap, relative path, ...)

		// - Classify elements
		//   - Check element types involved (widget, references, importedPackage,
		// importedElement, ...)
		//   - Cross with destination group (in/ext, SysML,UML,ECore, dependent library,
		// ...)

		// - Refine artefacts
		//   - High level Design/Code/Profile/...
		//   - Fragment for leaves (last XPath element) and group with "grouping"

		/*
		 * The 'grouping idea' is interesting. Like drawing a vertical map of the
		 * contingency of the artefacts
		 */

		// - Creat links
		//   - Explicit: Typed from source and target types (Engineering)
		//   - Implicit: Derived (and typed) from group provenance
		System.err.flush();
		System.out.println("\n\n-- Safe Exit o·~ !¡");
	}


	/**
	 * 
	 * @throws ParserConfigurationException
	 */
	@SuppressWarnings("unused")
	public static void testDesignTypesExtraction() throws ParserConfigurationException {
		LOGGER.info("");

		// Factories
		ArtefactTypeFactory atFactory = ArtefactTypeFactory.getInstance();

		// Trace
		Trace t = new Trace("testDesignTypesExtraction");

		// Config
		Config config = Config.getInstance();

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

		try {
			@SuppressWarnings("deprecation")
			File umlProfile = new File(config.getDomainModelFiles().get("uml"));
			LOGGER.info("UML Domain model file: " + umlProfile.getAbsolutePath());
			Document doc = builder.parse(umlProfile);

			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("importedPackage");
			for (int temp = 0; temp < nodeList.getLength(); temp++) {
				org.w3c.dom.Node node = nodeList.item(temp);
				System.out.println("\nCurrent element: " + node.getNodeName());
				if (node.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
					Element element = (Element) node;
					System.out.println("xmi:type: " + element.getAttribute("xmi:type"));
					System.out.println("href: " + element.getAttribute("href"));
				}
			}

			XPath xPath = XPathFactory.newInstance().newXPath();

			String expression = "//*[@href]";

			System.out.println("\n\nTests.testDesignTypesExtraction() ...");
			try {
				NodeList nodeList2 = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
				for (int i = 0; i < nodeList2.getLength(); i++) {
					Node nNode = nodeList2.item(i);
					System.out.println(nNode.getAttributes().getNamedItem("href"));
					System.out.println(nNode.getParentNode().getNodeName() + "->" + nNode.getNodeName());
					;
					System.out.println(DomUtil.getAbsolutePath((Element) nNode));
				}
			} catch (XPathExpressionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		/*
//		 * Link types from design to code and palette and EltTypeConfig + internal c2c: code to code.
//		 */
//		LinkType d2c = ltFactory.addType("Design2Code");
//		LinkType d2p = ltFactory.addType("Design2Palette");
//		LinkType p2c = ltFactory.addType("Palette2Code");
//		LinkType c2et = ltFactory.addType("Code2EltType");
//		LinkType c2c = ltFactory.addType("Code2");
//		LinkType p2p = ltFactory.addType("Palette2");
//		LinkType et2et = ltFactory.addType("EltType2");
//		
//		/*
//		 * Actual trace : 
//		 * src - name - tgt - type
//		 *  0  -  l1  -  3  -  d2c
//		 *  1  -  l2  -  5  -  d2p
//		 *  2  -  l3  -  5  -  d2p
//		 *  5  -  l4  -  6  -  p2p
//		 *  3  -  l5  -  4  -  c2c
//		 *  6  -  l6  -  4  -  p2c
//		 *  4  -  l7  -  7  -  c2et
//		 *  7  -  l8  -  8  -  et2et
//		 */
//		TraceLink l1 = new TraceLink("l1", d2c);
//		TraceLink l2 = new TraceLink("l2", d2p);
//		TraceLink l3 = new TraceLink("l3", d2p);
//		l1.setEnds(afs[0], afs[3]);
//		l2.setEnds(afs[1], afs[5]);
//		l3.setEnds(afs[2], afs[5]);
//		
//		TraceLink l4 = new TraceLink("l4", p2p);
//		l4.setEnds(afs[5], afs[6]);
//		
//		TraceLink l5 = new TraceLink("l5", c2c);
//		l5.setEnds(afs[3], afs[4]);
//
//		TraceLink l6 = new TraceLink("l6", p2c);
//		l6.setEnds(afs[6], afs[4]);
//
//		TraceLink l7 = new TraceLink("l7", c2et);
//		TraceLink l8 = new TraceLink("l8", et2et);
//		l7.setEnds(afs[4], afs[7]);
//		l8.setEnds(afs[7], afs[8]);
//		
//
//		t.addTraceLink(l1);
//		t.addTraceLink(l2);
//		t.addTraceLink(l3);
//		System.out.println("Closure of l1: (" +  l1.getClosure().size() + "/3) " + l1.getClosure());
//		System.out.println("Closure of t: (" +  t.getAllTraceLinks().size() + "/8) " + t.getAllTraceLinks());
//		
//		System.out.println(t.printJSon());
	}

}
