package edu.uoc.som.orchestrus.tracemodel;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.logging.Logger;

import edu.uoc.som.orchestrus.config.Config;
import edu.uoc.som.orchestrus.parsing.ReferenceFactory.Protocol;
import edu.uoc.som.orchestrus.tracemodel.typing.ArtefactType;
import edu.uoc.som.orchestrus.tracemodel.typing.ArtefactTypeFactory;
import edu.uoc.som.orchestrus.tracemodel.typing.TypedArtefact;

public class Artefact extends TypedArtefact  implements Serializable{
	
	private static final long serialVersionUID = -671183405318232925L;

	public final static Logger LOGGER = Logger.getLogger(Artefact.class.getName());
	public static PrintLabelOptions D3_PRINT_LABEL_OPTION = PrintLabelOptions.NAME;
	public enum PrintLabelOptions {
		FULL, NAME, ID, NONE;
	}
	
	private String location;
	private Artefact parent;
	private boolean resolves;
	/**
	 * Default is NO PROTOCOL.
	 */
	private Protocol protocol = Protocol.no_protocol;


	private HashSet<Artefact> fragments = new HashSet<>();
	private ArrayList<TraceLink> sourceOf = new ArrayList<>();
	private ArrayList<TraceLink> targetOf = new ArrayList<>();
	
	static int counter =0;
	private static String newName() {
		return "A"+counter++;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!obj.getClass().equals(this.getClass()))
			return false;
		Artefact rObj = (Artefact) obj;
		if (!rObj.getProtocol().equals(this.getProtocol()))
			return false;
		if (!rObj.getLocation().equals(this.getLocation()))
			return false;
		if (!rObj.getName().equals(this.getName()))
			return false;
		return true;
	}
	int hashCode;
	@Override
	public int hashCode() {
		return hashCode;
	}

	protected Artefact() {
		this(newName(), ArtefactType.getUntyped());
		sourceOf = new ArrayList<>();
		targetOf = new ArrayList<>();
		location = "";
		protocol = Protocol.no_protocol;
	}

	protected Artefact(String name, ArtefactType type, String location, Artefact parent, boolean resolved) {
		super(name, type);
		this.parent = parent;
		// if(parent != null)
		// addFragment(parent);
		this.location = location;
		sourceOf = new ArrayList<>();
		targetOf = new ArrayList<>();
		this.resolves = resolved;
		if (resolves)
			protocol = Protocol.local;

		hashCode = (getProtocol() + getLocation() + getName()).hashCode();
		computeTypeBasedOnSourceFolder();
	}

	protected void computeTypeBasedOnSourceFolder() {
		if(!this.isOfType(ArtefactTypeFactory.ELEMENT_ARTEFACT)) {
			for (String cf : Config.getInstance().getContentFoldersName()) {
				if(!cf.equals(".")) {
					if(location.contains(cf) || getName().equals(cf)) {
						cf = Config.getContentFoldersLifeCyclePhaseName(cf);
						setType(ArtefactTypeFactory.getType(cf));
					}
				}
			}
			for (File cf : Config.getInstance().getJavaCustomFolders()) {
				if(location.contains(cf.getName())) {
					setType(ArtefactTypeFactory.getType("SourceFile"));
				}
			}
		}
	}

	/**
	 * @param name
	 * @param type
	 * @param location
	 * @param parent
	 */
	protected Artefact(String name, ArtefactType type, String location, Artefact parent) {
		this(name, type, location, parent, false);
	}

	/**
	 * TEST PURPOSE
	 * @param name
	 * @param type
	 */
	protected Artefact(String name, ArtefactType type) {
		this(name, type, null, null, false);
	}
	
	public String getJSon() {
		String res = "{";
		res += "\"id\": \"" + getID() + "\",";
		res += "\"name\": \"" + getName() + "\",";
		res += "\"location\": \"" + edu.uoc.som.orchestrus.utils.Utils.cleanUrlsForJson(getLocation()) + "\",";
		res += getParent() == null ? "" : "\"parent\": \"" + getParent().getID() + "\",";
		res += "\"fragments\": " + TraceUtils.getElementsIDsAsJsonCollection(fragments) + ",";
		res += "\"type\": \"" + getTypeUID() + "\"";
		return res + "}";
	}
	
	/**
	 * 
	 * @return a JSon interpretable by TraceaD3.
	 */
	public String renderD3JSon() {
		String res = "{";
		res += "\"id\": \"" + getID() + "\",";
		res += "\"fanin\": \"" + getFragments().size() + "\",";
		// TODO Labelize better - with a "label" attribute independent to "name" attribute.
		switch (D3_PRINT_LABEL_OPTION) {
		case FULL:
			res += "\"name\": \"" + getProtocol() + "::"
					+ edu.uoc.som.orchestrus.utils.Utils.cleanUrlsForJson(getLocation()) + "::"
					+ edu.uoc.som.orchestrus.utils.Utils.cleanUrlsForJson(getName()) + "\",";
			break;
		case ID:
			res += "\"name\": \"" + getID() + "\",";
			break;

		case NONE:
			res += "\"name\": \"\",";
			break;

		case NAME:
		default:
			res += "\"name\": \"" + edu.uoc.som.orchestrus.utils.Utils.cleanUrlsForJson(getName()) + "\",";
			break;
		}

		res += "\"type\": \"" + getType().getName() + "\",";
		res += "\"size\": " + getFragments().size() * 10 + ",";
//		res += "\"size\": " + ArtefactTypeFactory.getD3Size(getType()) + ",";
		res += "\"group\": \"" + getType().getNumber() + "\"";
		return res + "}";
	}

	@Override
	public String toString() {
		return this.getType().getName()+"["+this.getName()+"]";
	}
	
	public String getHREF() {
		return protocol + "://" + getLocation() + File.separator+getName();
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}
	
	public Protocol getProtocol() {
		return protocol;
	}

	public Protocol getAncestorProtocol() {
		return getAncestor().getProtocol();
	}
	
	public ArtefactType getAncestorType() {
		return getAncestor().getType();
	}

	
	public Artefact getAncestor() {
		if(parent == null)
			return this;
		return parent.getAncestor();
	}

	public boolean isResolves() {
		return resolves;
	}

	public boolean hasParent() {
		return parent != null;
	}
	
	public void addFragment(Artefact af) {
//		System.out.println("Artefact.addFragment() "+fragments.size()+"---" + this);
		if(!fragments.contains(af)) {
			fragments.add(af);
			af.setParent(this);
//			System.out.println("    - : "+af.getProtocol());
//			System.out.println("    - : "+af.getLocation());
//			System.out.println("    - : "+af.getName());
			
			LOGGER.finest("Fragment: " + af + " ADDED to: " + this);
		}
	}

	public String getLocation() {
		return location;
	}
	
	public HashSet<Artefact> getFragments() {
		return fragments;
	}

	public Artefact getParent() {
		return parent;
	}

	private void setParent(Artefact artefact) {
		this.parent = artefact;
	}

	public ArrayList<TraceLink> getTargetOf() {
		return targetOf;
	}

	public ArrayList<TraceLink> getSourceOf() {
		return sourceOf;
	}

	public boolean removeTargetOf(TraceLink tl) {
		return targetOf.remove(tl);
	}

	public boolean removeTargetsOf(Collection<TraceLink> tls) {
		return targetOf.removeAll(tls);
	}

	public boolean removeSourceOf(TraceLink tl) {
		return sourceOf.remove(tl);
	}

	public boolean removeSourcesOf(Collection<TraceLink> tls) {
		return sourceOf.removeAll(tls);
	}

	public boolean addTargetOf(TraceLink tl) {
		return targetOf.add(tl);
	}

	public boolean addSourceOf(TraceLink tl) {
		return sourceOf.add(tl);
	}

	public boolean isOfType(ArtefactType at) {
		return getType().getName().equals(at.getName());
	}

	public boolean isOfType(String typeName) {
		return getType().getName().equals(typeName);
	}

	public boolean isLocal() {
		return protocol == Protocol.no_protocol || protocol == Protocol.local;
	}

	public String renderFragmentation(boolean recursive, boolean renderElements) {
		String res = "\"name\": \""+getName()+"\"" +
				",\"id\": \""+getID()+"\""+
				",\"type\": \""+getType().getName()+"\""+
				",\"location\": \""+edu.uoc.som.orchestrus.utils.Utils.cleanUrlsForJson(getLocation())+"\""+
				",\"numberofchildren\": \"" + getFragments().size() + "\""+
				"";
//				",\"references\": [\"Todo\"]";
		if(recursive) {
			String resChild = "";
			for (Artefact a : fragments) {
				if(renderElements || a.getType() != ArtefactTypeFactory.ELEMENT_ARTEFACT)
					resChild += a.renderFragmentation(recursive, renderElements)+",\n";
			}
			if(!resChild.isBlank())
				resChild = resChild.substring(0, resChild.length()-2);
			resChild = ",\n\"children\": [" + resChild + "]";
			res += resChild;
		}
		return "{"+res+"}";
	}
}
