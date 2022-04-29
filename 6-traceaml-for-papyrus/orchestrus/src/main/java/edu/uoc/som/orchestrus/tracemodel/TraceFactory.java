/*****************************************************************************
* Copyright (c) 2015, 2022 CEA-LIST & SOM-UOC, Edouard Batot
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
* UOC-SOM - Initial API and implementation
*  -> Edouard Batot (UOC SOM) ebatot@uoc.edu 
*****************************************************************************/


package edu.uoc.som.orchestrus.tracemodel;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import edu.uoc.som.orchestrus.parsing.Reference;
import edu.uoc.som.orchestrus.parsing.ReferenceFactory;
import edu.uoc.som.orchestrus.parsing.Source;
import edu.uoc.som.orchestrus.parsing.StaticExplorer;
import edu.uoc.som.orchestrus.tracemodel.typing.ArtefactTypeFactory;
import edu.uoc.som.orchestrus.tracemodel.typing.LinkType;

public class TraceFactory {
	public final static Logger LOGGER = Logger.getLogger(TraceFactory.class.getName());

	static TraceFactory instance;

	public static TraceFactory getInstance() {
		if (instance == null)
			instance = new TraceFactory();
		return instance;
	}

	public TraceFactory() {
		links = new HashSet<TraceLink>();
	}

	Set<TraceLink> links;
	
	public static void fragmentSourcesAndFolders() {
		Collection<Artefact> sourceArts = ArtefactFactory.subsetsArtefactsByType(ArtefactTypeFactory.SOURCE_FILE_ARTEFACT);
		for (Artefact sArt : sourceArts) {
			File f = new File(sArt.getLocation());
			Artefact parentArt = ArtefactFactory.getInstance().getArtefact(f);
			parentArt.addFragment(sArt);
		}
		LOGGER.fine("Done: Each file has its parent folder as parent.");
	}

	public static Trace buildReferencesTrace() {
		Trace t = new Trace("Links");
		LOGGER.info("Building trace '"+t.getName()+"'");
		LOGGER.info(ReferenceFactory.getReferences().size() + " references.");
		
		for (Reference r : ReferenceFactory.getReferences().values()) {

			Artefact target = ArtefactFactory.getInstance().getArtefact(r);
			if (target == null)
				throw new IllegalAccessError("¡ DEV ! Should not get there. Artefact not recognized from ref: " + r.getHREF());

			HashMap<Source, ArrayList<Reference>> sourcesToRef = StaticExplorer.getReferencesSourcesReversed();
			for (Source sSource : sourcesToRef.keySet()) {
				// Pour chaque source, chercher les references qui la contiennent
				if (r.containsSource(sSource)) {
					// l'ajouter au lien
					Artefact a = ArtefactFactory.getInstance().getArtefact(new File(sSource.getPath()));

					/// TODO ElementResolution: What about xpath etc. -> for TraceLink types ??
					LinkType lType = LinkType.getType(a, target);
					TraceLink tl = new TraceLink(lType);

					if (a == null) {
						throw new IllegalAccessError("Should not get there. Artefact not recognized.");
					}
					tl.addSource(a);
					tl.addTarget(target);
					
					boolean found = false;
					TraceLink tlFound = null;
					for (TraceLink tll : t.getTraceLinks()) {
						if (tll.getSources().containsAll(tl.getSources())
								&& tll.getTargets().containsAll(tl.getTargets())) {
							found = true;
							tlFound = tll;
						}
					}
					if (!found) {
						t.addTraceLink(tl);
						LOGGER.finer("Link added:" + tl + " sources:" + tl.getSources().size() + " targets:"
								+ tl.getTargets().size());
					} else {
						tlFound.incrementNumberOfOccurences();
						LOGGER.finer("Link alreday exists:" + tl + " increment number of occurences to "
								+ tl.getNumberOfOccurences() + ".");
					}
				}
			}

		}
		LOGGER.info(t.getTraceLinks().size() + " trace links added.");
		return t;
	}

	/**
	 * Builds a trace with all know artefacts in the universe linked by inclusion :
	 * location-folder-file-...-element
	 * 
	 * @return
	 */
	public static Trace buildFragmentationTrace() {
		Trace res = new Trace("Fragmentation");
		LOGGER.info("Building trace '"+res.getName()+"'");
		for (Artefact a : ArtefactFactory.getAncestors()) {
			List<TraceLink> aFragments = ArtefactFactory.getFragmentLinks(a);
			for (TraceLink traceLink : aFragments) {
				res.addTraceLink(traceLink);
			}
		}
		return res;
	}

}
