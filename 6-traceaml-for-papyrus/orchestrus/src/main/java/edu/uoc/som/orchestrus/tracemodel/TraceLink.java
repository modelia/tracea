package edu.uoc.som.orchestrus.tracemodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import edu.uoc.som.orchestrus.tracemodel.typing.ArtefactType;
import edu.uoc.som.orchestrus.tracemodel.typing.ArtefactTypeFactory;
import edu.uoc.som.orchestrus.tracemodel.typing.LinkType;
import edu.uoc.som.orchestrus.tracemodel.typing.TypedLink;

public class TraceLink extends TypedLink implements Serializable{
	
	private static final long serialVersionUID = 2849795385809634439L;

	public static PrintLabelOptions D3_PRINT_LABEL_OPTION = PrintLabelOptions.NONE;
	public enum PrintLabelOptions {
		FULL, NAME, ID, NONE;
	}

	
	private double confidence = 100;
	private int numberOfOccurences = 1;
	ArrayList<Artefact> sources = new ArrayList<>();
	ArrayList<Artefact> targets = new ArrayList<>();

	public TraceLink(String name, LinkType type) {
		super(name);
		setType(type);
	}

	public TraceLink() {
		this(newName(), LinkType.getUntyped());
	}

	public TraceLink(LinkType type) {
		this(newName(), type);
	}

	public TraceLink(Artefact a, Artefact aa) {
		this(LinkType.getType(a, aa));
		setEnds(a, aa);
	}

	private static int counter = 0;
	private static String newName() {
		return "L" + counter++;
	}
	
	public int getNumberOfOccurences() {
		return numberOfOccurences;
	}
	
	public void incrementNumberOfOccurences() {
		numberOfOccurences++;
	}

	public void decrementNumberOfOccurences() {
		numberOfOccurences--;
	}

	public ArrayList<Artefact> getSources() {
		return sources;
	}

	public ArrayList<Artefact> getTargets() {
		return targets;
	}
	
	public double getConfidence() {
		return confidence;
	}
	
	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}
	
	@Override
	public String toString() {
		return getName() + sources + targets;
	}

//	public Collection<Artefact> getSourceArtefacts() {
//		HashSet<Artefact> res = new HashSet<>(sources.size());
//		for (Artefact af : sources) 
//			res.add(af.getParent());
//		return res;
//	}
//	
//	public Collection<Artefact> getTargetArtefacts() {
//		HashSet<Artefact> res = new HashSet<>(targets.size());
//		for (Artefact af : targets) 
//			res.add(af.getParent());
//		return res;
//	}

	public Collection<TraceLink> getSuccessors() {
		HashSet<TraceLink> res = new HashSet<>();
		for (Artefact af : targets) {
			if (af != null)
				res.addAll(af.getSourceOf());
		}
		return res;
	}

	public Collection<TraceLink> getPredecessors() {
		HashSet<TraceLink> res = new HashSet<>();
		for (Artefact af : sources)
			res.addAll(af.getTargetOf());
		return res;
	}

	public void setEnds(List<Artefact> sources, List<Artefact> targets) {
		this.sources = new ArrayList<>(sources.size());
		this.targets = new ArrayList<>(targets.size());
		addEnds(sources, targets);
	}

	public void addEnds(List<Artefact> sources, List<Artefact> targets) {
		this.sources.addAll(sources);
		this.targets.addAll(targets);
	}

	/**
	 * Set new ends to the link : prior source and target will be removed.
	 * 
	 * @param sources
	 * @param targets
	 */
	public void setEnds(Artefact sources, Artefact targets) {

		for (Artefact af : this.sources)
			af.removeSourceOf(this);
		for (Artefact af : this.targets)
			af.removeTargetOf(this);

		this.sources = new ArrayList<>(1);
		this.targets = new ArrayList<>(1);
		addEnds(sources, targets);
	}

	public void addEnds(Artefact source, Artefact target) {
		this.sources.add(source);
		source.addSourceOf(this);
		this.targets.add(target);
		target.addTargetOf(this);
	}

	public boolean addSource(Artefact newSource) {
		boolean res = this.sources.add(newSource);
		if (res)
			newSource.addSourceOf(this);
		return res;
	}

	public boolean addTarget(Artefact newTarget) {
		boolean res = this.targets.add(newTarget);
		if (res)
			newTarget.addTargetOf(this);
		return res;
	}

	public String renderJSon() {
		String res = "{";
		res += "\"id\": \"" + getID() + "\",";
		res += "\"name\": \"" + getName() + "\",";
		res += "\"sources\": " + edu.uoc.som.orchestrus.tracemodel.TraceUtils.getElementsIDsAsJsonCollection(sources) + ",";
		res += "\"targets\": " + edu.uoc.som.orchestrus.tracemodel.TraceUtils.getElementsIDsAsJsonCollection(targets) + ",";
		res += "\"confidence\": "+confidence+",";
		res += "\"intensity\": " + numberOfOccurences + ",";
		res += "\"type\": \"" + getTypeUID() + "\"";
		return res + "}";
	}
	
	public String getIdentificationJSon() {
		String res = "{";
		res += "\"id\": \"" + getID() + "\"";
		res += ",\"name\": \"" + getName() + "\"";
		
		String resSources = "";
		for (Artefact a : sources) 
			resSources += a.renderFragmentation(false, false)+",\n" ;
		if(!resSources.isBlank())
			resSources = resSources.substring(0, resSources.length()-2);
		resSources = ",\"sources\": [" + resSources + "]";
		res += resSources;
		
		String resTargets = "";
		for (Artefact a : targets) 
			resTargets += a.renderFragmentation(false, false)+",\n" ;
		if(!resTargets.isBlank())
			resTargets = resTargets.substring(0, resTargets.length()-2);
		resTargets = ",\"targets\": [" + resTargets + "]";
		res += resTargets;
		
		res += ",\"confidence\": "+confidence+"";
		res += ",\"type\": \"" + getType().getName() + "\"";
		return res + "}";
	}

	/**
	 * ONLY MONO ENDED !! Only first source and first target considered ! WARNING !
	 * 
	 * Confidence is tweaked with the number of occurence found.
	 * @return
	 */
	public String renderD3Json() {
		String label = "";
		switch (D3_PRINT_LABEL_OPTION) {
		case FULL:
			label += "\"label\": \"" +  getID() + " - " + edu.uoc.som.orchestrus.utils.Utils.cleanUrlsForJson(getName()) + "\",";
			break;
		case ID:
			label += "\"label\": \"" + getID() + "\",";
			break;

		case NONE:
			label += "\"label\": \"\",";
			break;

		case NAME:
		default:
			label += "\"label\": \"" + edu.uoc.som.orchestrus.utils.Utils.cleanUrlsForJson(getName()) + "\",";
			break;
		}
		
		
		
		String res = "{";
		res += "\"id\": \"" + getID() + "\",";
		res += "\"name\": \"" + confidence + "\",";
		res += label;	
		res += "\"source_id\": \"" + sources.get(0).getID() + "\",";
		res += "\"target_id\": \"" + targets.get(0).getID() + "\",";
		res += "\"type\": \"" + getType().getName() + "\",";
		res += "\"group\": " + getType().getNumber() + ",";
		res += "\"intensity\": " + numberOfOccurences + ",";
		res += "\"confidence\": " + numberOfOccurences /*TODO restore "confidence"*/ + ",";
		res += "\"energy\": 100";
		return res + "}";
	}
	
	/**
	 * 
	 * @param type
	 * @return <true> if the trace link has one end (source or target) that is of type, <false> otherwise.
	 */
	public boolean touchElementOfType(ArtefactType type) {
		for (Artefact a : sources) {
			if(a.isOfType(type))
				return true;
		}
		for (Artefact a : targets) {
			if(a.isOfType(type))
				return true;
		}
		
		return false;
	}

	public void computeTypeBasedDualityLocalVsExternal() {
		String sType = getType().getName();
		if(sType.endsWith("ExternalFile"))
			setType(LinkType.getType("Extern"));
		else {
			setType(LinkType.getType("Intern"));
		}
	}

	public void computeTypesBasedOnEndTypes() {
		ArtefactType atSource = sources.get(0).getType();
		ArtefactType atTarget = targets.get(0).getType();
		String source = atSource.getName();
		String res = source + "-" + atTarget.getName();

		if(atSource == atTarget)
			res = atSource.getName();
		if(atSource == ArtefactTypeFactory.LOCAL_ROOT_ARTEFACT)
			res = "LocalRoot";
		if(atSource == ArtefactTypeFactory.EXTERNAL_ROOT_ARTEFACT)
			res = "ExternalRoot";
		if(atSource == ArtefactTypeFactory.EXTERNAL_LOCATION_ARTEFACT)
			res = "ExternalLocation";
		
		setType(LinkType.getType(res));
	}


}
