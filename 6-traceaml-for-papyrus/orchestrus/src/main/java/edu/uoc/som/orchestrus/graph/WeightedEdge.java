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