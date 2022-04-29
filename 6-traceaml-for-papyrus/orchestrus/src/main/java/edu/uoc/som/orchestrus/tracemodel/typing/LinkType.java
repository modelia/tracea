package edu.uoc.som.orchestrus.tracemodel.typing;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import edu.uoc.som.orchestrus.tracemodel.Artefact;
import edu.uoc.som.orchestrus.tracemodel.TracingElement;

public class LinkType extends TracingElement implements Serializable {
	private static final long serialVersionUID = -5697906953500734703L;
	public static LinkType untyped = new LinkType("untyped");
	private static Map<String, LinkType> types = new HashMap<>();
	
	static int counter;
	int number;
	private LinkType(String name) {
		super(name);
		this.number = counter ++;
	}
	
	public LinkType() {
		this(newName());
	}
	
	private static String newName() {
		return "L" + counter;
	}

	public String getJSon() {
		String res = "{";
		res += "\"id\": \""+getID()+"\",";
		res += "\"name\": \""+getName()+"\"";
//		res += "\"sources\": "+Utils.getElementsIDsAsJsonCollection(sources)+",";
//		res += "\"targets\": "+Utils.getElementsIDsAsJsonCollection(targets)+",";
//		res += "\"type\": \""+getTypeUID()+"\"";
		return res +"}";
	}

	public static LinkType getType(Artefact a, Artefact aa) {
		String name = a.getType().getName()+"-"+aa.getType().getName();
		return getType(name);
	}

	public static Map<String, LinkType> getTypes() {
		return types;
	}

	public static LinkType getUntyped() {
		return untyped;
	}

	public static LinkType getType(String name) {
		LinkType res = types.get(name);
		if(res == null) {
			res = new LinkType(name);
			types.put(name, res);
		}
		return res;
	}

	public int getNumber() {
		return number;
	}
}
