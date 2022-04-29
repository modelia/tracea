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
import java.util.HashSet;
import java.util.Set;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import edu.uoc.som.orchestrus.parsing.utils.XmlException;

public abstract class SpecificFileReferenceExtractor {
	
	private Set<Reference> references = new HashSet<>();;
	
	protected File f;
	protected DocumentBuilder builder;

	public SpecificFileReferenceExtractor(File f) {
		if(f == null)
			throw new IllegalArgumentException("File is null.");
		this.f = f;
		
	}
	
	public File getFile() {
		return f;
	}

	protected void loadXMLTools() {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			builder = factory.newDocumentBuilder();
			factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
		} catch (ParserConfigurationException e) {
			throw new XmlException("Could not load the XML factory. (DEV)");
		}
	}
	
	public DocumentBuilder getBuilder() {
		return builder;
	}
	
	public Set<Reference> getReferences() {
		return references;
	}
	
	public boolean addReference(Reference r) {
		return references.add(r);
	}

	public abstract String getHRefJSon();

	public String getFilePath() {
		return f.getAbsolutePath();
	}
}
