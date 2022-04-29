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


package edu.uoc.som.orchestrus.graph;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.nio.Attribute;
import org.jgrapht.nio.DefaultAttribute;


class WeightedEdge extends DefaultWeightedEdge {
	private static final long serialVersionUID = 1L;

	
	String ID;
	public WeightedEdge(String id) {
		super();
		this.ID = id;
	}

	@Override
	public String toString() {
		return super.toString() + "[" + getWeight() + "]";
	}
	
	public static Function<WeightedEdge, Map<String, Attribute>> getAttributeProvider() {
		Function<WeightedEdge, Map<String, Attribute>> edgeAttributeProvider = v -> {
		    Map<String, Attribute> map = new LinkedHashMap<>();
		    map.put("confidence", DefaultAttribute.createAttribute(v.getWeight()));
		    map.put("id", DefaultAttribute.createAttribute(v.getID()));
		    return map;
		};
		return edgeAttributeProvider;
	}
	
	
	@Override
	protected double getWeight() {
		return super.getWeight();
	}
	
	public String getID() {
		return ID;
	}
	

}
