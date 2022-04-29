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


package edu.uoc.som.orchestrus.tracemodel.typing;

import edu.uoc.som.orchestrus.tracemodel.TracingElement;

public abstract class TypedLink extends TracingElement {
	
	private static final long serialVersionUID = -7006125672753582575L;
	LinkType type;
	
	public TypedLink() {
		this(LinkType.untyped.getName());
	}
	
	public TypedLink(String name) {
		super(name);
	}

	public LinkType getType() {
		return type;
	}
	
	public void setType(LinkType type) {
		this.type = type;
	}
	
	public String getTypeUID() {
		return getType().getID();
	}
	
}
