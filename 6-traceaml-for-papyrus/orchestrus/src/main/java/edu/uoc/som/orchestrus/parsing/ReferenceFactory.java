package edu.uoc.som.orchestrus.parsing;

import java.io.File;
import java.io.Serializable;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import edu.uoc.som.orchestrus.tracemodel.TracingElement;

public class ReferenceFactory {
	public final static Logger LOGGER = Logger.getLogger(ReferenceFactory.class.getName());

	/*
	 * INFO - regex pattern for urls :
	 * ^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]
	 * 
	 */

	/**
	 * HREF -> Reference
	 */
	private static HashMap<String, Reference> references = new HashMap<>();


	public static String extractInnerPath(String rawReference) {
		String res = "";
		if (rawReference.contains("#"))
			res = rawReference.substring(rawReference.indexOf("#") + 1);
		return res;
	}

	public static String extractLocation(String rawReference) {
		String res = Protocol.removeProtocol(rawReference);
		if (res.contains("#"))
			res = res.substring(0, res.indexOf("#"));
		return res;
	}

	public static Protocol extractProtocol(String rawReference) {
		return Protocol.getProtocol(rawReference);
	}

	/**
	 * @author Edouard Romari Batot 2022
	 *
	 * Default for local files : no_protocol. <br/>
	 * {@link Protocol#local} will be assignated when resolving a "no_protocol" href.
	 */
	public enum Protocol implements Serializable {
		http, pathmap, platform, ppe, bundleclass, local, no_protocol;

		/**
		 * Default for local files : no_protocol. <br/>
		 * {@link Protocol#local} will be assignated when resolving a "no_protocol" href.
		 * @param raw
		 * @return
		 */
		static Protocol getProtocol(String raw) {
			if (raw.startsWith("http"))
				return http;
			if (raw.startsWith("pathmap"))
				return pathmap;
			if (raw.startsWith("platform"))
				return platform;
			if (raw.startsWith("ppe"))
				return ppe;
			if (raw.startsWith("bundleclass"))
				return bundleclass;
			else
				return no_protocol;
		}

		static String removeProtocol(String rawReference) {
			Protocol p = getProtocol(rawReference);
			switch (p) {
			case http:
			case pathmap:
			case platform:
			case bundleclass:
			case ppe:
				return rawReference.substring(p.toString().length() + 2);

			case local:
			case no_protocol:
				return rawReference;
			default:
				throw new IllegalArgumentException("'" + p + " unknown.");
			}
		}
	}

	/**
	 * Resolve the location of a reference (if it is "no_protocol"). Direction uses
	 * '/' instead of '\' for JSon compatibility.
	 * 
	 * @param sourceFile
	 * @param r
	 * @return
	 */
	public static boolean resolveLocation(Source sourceFile, Reference r) {
		if (r.isLocal()) {
			boolean res = false;
			String resolvedLocation = "-resolvedLocation-";
			try {
				File source = new File(sourceFile.getPath());
				File folder = source.getParentFile();

				File f = Path.of(folder.getAbsolutePath(), r.getTargetFileArtefact()).toFile();
				resolvedLocation = f.getCanonicalPath();
				if (f.exists()) {
					r.setLocation(resolvedLocation);
					r.setResolved(true);
					res = true;
				} else {
					LOGGER.warning("Location '" + r.getTargetFileArtefact() + "' in '" + source.getAbsolutePath()
							+ "' did not resolve.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (res) {
				LOGGER.finest(" Resolved -  " + r.getTargetFileArtefact() + " -> " + resolvedLocation);
			} else {
				LOGGER.finest(" !Resolved - " + r.getTargetFileArtefact() + " -> " + resolvedLocation);
			}
			return res;
		}
		return false;
	}

	/**
	 * 
	 * @param href
	 * @return null if href do not exists in the stack of references.
	 */
	public static Reference getReference(String href) {
		return references.get(href);
	}

	/**
	 * Builds a new {@link Reference} from a href link (String) and a source file
	 * path if "href" does not match an existing reference. <br/>
	 * Href are compared <i>resolved</i> (See {@link Reference#isResolved()} and
	 * {@link #resolveLocation(String, Reference)})
	 * 
	 * @param href
	 * @param sourceFile Path to source file where the href was found.
	 * @return A new reference is "href" does not match an existing reference. <br/>
	 *         Href are compared <i>resolved</i>
	 */
	public static Reference getReference(String href, Source source) {

		// GHOST Create a ghost reference for resolution (not optimal, but working)
		Reference rr = new Reference(href, source);
		ReferenceFactory.resolveLocation(source, rr);

		Reference r = references.get(rr.getHREF());
		if (r == null) {// R is new
			references.put(rr.getHREF(), rr);
			LOGGER.finest("Add: " + rr.getHREF());
		} else {
			// GHOST Clean the stack of elements (ghost erase, because TracingElement.class
			// contains a map of {id:element})
			TracingElement.removeElement(rr);
			r.addSource(source);
			LOGGER.finest("Exists: " + rr.getHREF());
		}
		r = references.get(rr.getHREF());
		addReferenceSourceReversed(source, r);
		return r;
	}
	
	
	/**
	 * Source to reference
	 */
	private static HashMap<Source, ArrayList<Reference>> referencesSourcesReversed = new HashMap<>();
	protected static HashMap<Source, ArrayList<Reference>> getReferencesSourcesReversed() {
		return referencesSourcesReversed;
	}
	
	/**
	 * Adds a source-reference to the stock.
	 * @param sourceFile
	 * @param r
	 */
	private static void addReferenceSourceReversed(Source sourceFile, Reference r) {
		if (!referencesSourcesReversed.keySet().contains(sourceFile))
			referencesSourcesReversed.put(sourceFile, new ArrayList<Reference>());
		referencesSourcesReversed.get(sourceFile).add(r);
	}

	public static Collection<Reference> getReferencesValues() {
		return references.values();
	}

	public static HashMap<String, Reference> getReferences() {
		return references;
	}

	public static List<Reference> getLocalReferences() {
		return references.values().stream().filter(r -> r.isLocal()).collect(Collectors.toList());
	}

	public static List<Reference> getExternalReferences() {
		return references.values().stream().filter(r -> !r.isLocal()).collect(Collectors.toList());
	}

//	/**
//	 * @deprecated
//	 * @param interArtDependencies_JSON
//	 * @return
//	 */
//	public static Set<Reference> buildReferences(String interArtDependencies_JSON) {
//		JSONArray eltsRef = (JSONArray) JsonPath.read(interArtDependencies_JSON, "$..[?(@.href)]");
//
//		Set<Reference> hrefReferences = new HashSet<>(eltsRef.size());
//		for (Object eltRef : eltsRef) {
//			@SuppressWarnings("unchecked")
//			String href = ((HashMap<String, String>) eltRef).get("href");
//			Reference r = new Reference(href);
//			hrefReferences.add(r);
//			LOGGER.finest(r.toString());
//		}
//		LOGGER.fine(hrefReferences.size() + " href references found");
//
//		eltsRef = (JSONArray) JsonPath.read(interArtDependencies_JSON, "$..[?(@.value && @.key)]");
//
//		Set<Reference> ctxReferences = new HashSet<>(eltsRef.size());
//		for (Object eltRef : eltsRef) {
//			@SuppressWarnings("unchecked")
//			String href = ((HashMap<String, String>) eltRef).get("value");
//			Reference r = new Reference(href);
//			ctxReferences.add(r);
//			LOGGER.finest(r.toString());
//		}
//		LOGGER.fine(ctxReferences.size() + " ctx references found");
//
//		return hrefReferences;
//	}

}

//
///**
// * Where did the references where found
// */
//private static HashMap<Reference, ArrayList<String>> referencesSources = new HashMap<>();
//
///**
// * Source to reference
// */
//private static HashMap<String, ArrayList<Reference>> referencesSourcesReversed = new HashMap<>();
//
///**
// * Locations on this computer. (No protocol, resolved or not)
// */
//private static HashSet<String> locationsLocal = new HashSet<>();
//
///**
// * Locations external to this computer. (With protocol)
// */
//private static HashSet<String> locationsExternal = new HashSet<>();
