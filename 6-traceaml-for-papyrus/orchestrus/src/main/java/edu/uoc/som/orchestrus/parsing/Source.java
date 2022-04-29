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
