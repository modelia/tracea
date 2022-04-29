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

public class Source {
	String path;
	String innerXPath;
	String innerXPathNamed;
	
	public Source(String path, String innerXPath, String innerXPathNamed) {
		this.path = path;
		this.innerXPath = innerXPath;
		this.innerXPathNamed = innerXPathNamed;
	}
	
	public String getPath() {
		return path;
	}
	
	public String getInnerXPath() {
		return innerXPath;
	}
	
	public String getInnerXPathNamed() {
		return innerXPathNamed;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return path+">>"+innerXPath;
	}
}
