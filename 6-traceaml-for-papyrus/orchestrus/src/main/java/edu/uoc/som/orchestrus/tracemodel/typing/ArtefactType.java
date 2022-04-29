package edu.uoc.som.orchestrus.tracemodel.typing;

import java.io.Serializable;

import edu.uoc.som.orchestrus.tracemodel.TracingElement;

public class ArtefactType extends TracingElement implements Serializable {
	private static final long serialVersionUID = 5198094678929275323L;

	public static final ArtefactType UNDEFINED_TYPE = new ArtefactType("Undefined");
	
	private static int counter = 0;
	private int number;

	public ArtefactType() {
		this(newName());
	}
	
	
	private static String newName() {
		return "A"+counter;
	}

	public ArtefactType(String name) {
		super(name);
		this.number = counter++;
	}

	public String getJSon() {
		String res = "{";
		res += "\"id\": \""+getID()+"\",";
		res += "\"name\": \""+getName()+"\"";
		return res +"}";
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	public int getNumber() {
		return number;
	}

	public static ArtefactType getUntyped() {
		return UNDEFINED_TYPE;
	}
}
