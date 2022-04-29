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

import java.io.Serializable;

import edu.uoc.som.orchestrus.tracemodel.TracingElement;

public abstract class TypedArtefact extends TracingElement implements Serializable {
	
	private static final long serialVersionUID = -637601823174390792L;
	private ArtefactType type;
	
	public TypedArtefact() {
		this(newName());
	}
	
	private static int counter = 0;
	private static String newName() {
		return "TA"+counter++;
	}
	
	public TypedArtefact(String name, ArtefactType type) {
		super(name);
		setType(type);
	}
	
	public TypedArtefact(String name) {
		super(name);
		setType(ArtefactType.UNDEFINED_TYPE);
	}

	public ArtefactType getType() {
		return type;
	}
	
	public void setType(ArtefactType type) {
		if(type == null)
			type = ArtefactType.UNDEFINED_TYPE;
		this.type = type;
	}
	
	public String getTypeUID() {
		return getType().getID();
	}

}
