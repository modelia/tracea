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
