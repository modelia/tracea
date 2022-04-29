package edu.uoc.som.orchestrus.tracemodel;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import edu.uoc.som.orchestrus.parsing.ReferenceFactory.Protocol;
import edu.uoc.som.orchestrus.tracemodel.typing.ArtefactType;

public class ExternalLocationArtefact extends Artefact implements Serializable {

	private static final long serialVersionUID = -5452085829201113067L;
	private static Set<Artefact> knownLocations = new HashSet<>();
	public static Set<Artefact> getKnownLocations() {
		return knownLocations;
	}
	public static boolean addKnownLocation(Artefact a) {
		return knownLocations.add(a);
	}

	public ExternalLocationArtefact(String location, ArtefactType externalFolderArtefact,
			Protocol protocol) {
		super(location, externalFolderArtefact, location, null, false);
		setProtocol(protocol);
		
//		System.out.println("ExternalLocationArtefact.ExternalLocationArtefact()");
//		System.out.println(getHREF());
		
		
		
	}
	
}
