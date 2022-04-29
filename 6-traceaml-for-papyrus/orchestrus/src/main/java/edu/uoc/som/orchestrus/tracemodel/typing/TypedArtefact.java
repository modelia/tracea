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
