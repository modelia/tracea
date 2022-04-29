package edu.uoc.som.orchestrus.tracemodel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import edu.uoc.som.orchestrus.parsing.Reference;

public abstract class TracingElement  implements Serializable{
	private static final long serialVersionUID = -1638746559866381492L;

	static String UNNAMED = "UNNAMED";

	public static HashMap<String, TracingElement> elements = new HashMap<>();

	private String ID;

	public String getID() {
		return ID;
	}

	private String name;
	private String creationDate;
	private String modificationDate;
	private String deletionDate;

	public TracingElement() {
		this(UNNAMED);
	}

	public static TracingElement getElement(String ID) {
		return elements.get(ID);
	}

	static Set<Long> ids = new HashSet<>();
	
	static Random rnd = new Random(0);
	
	public TracingElement(String name) {
		this.name = name;
		
		/* Exclusive IDing. */
		long lID = rnd.nextLong();
		while(ids.contains(lID))
			lID = rnd.nextLong();
		
		this.ID = "" + lID;

		elements.put(ID, this);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public void setModificationDate(String modificationDate) {
		this.modificationDate = modificationDate;
	}

	public void setDeletionDate(String deletionDate) {
		this.deletionDate = deletionDate;
	}

	public String getName() {
		return name;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public String getModificationDate() {
		return modificationDate;
	}

	public String getDeletionDate() {
		return deletionDate;
	}

	public String toString() {
		return this.getClass().getName() + ":" + name;
	}

	public static void removeElement(Reference rr) {
		elements.remove(rr.getID());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!obj.getClass().equals(this.getClass())) return false;
		TracingElement rObj = (TracingElement)obj;
		return (!rObj.getID().equals(this.getID()));
	}

}
