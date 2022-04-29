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
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import edu.uoc.som.orchestrus.config.Config;
import edu.uoc.som.orchestrus.parsing.Reference;
import edu.uoc.som.orchestrus.parsing.ReferenceFactory;
import edu.uoc.som.orchestrus.parsing.ReferenceFactory.Protocol;
import edu.uoc.som.orchestrus.parsing.Source;
import edu.uoc.som.orchestrus.parsing.StaticExplorer;
import edu.uoc.som.orchestrus.parsing.spec.JavaFile;
import edu.uoc.som.orchestrus.parsing.spec.JavaFolder;
import edu.uoc.som.orchestrus.tracemodel.typing.ArtefactType;
import edu.uoc.som.orchestrus.tracemodel.typing.ArtefactTypeFactory;

public class ArtefactFactory {
	public final static Logger LOGGER = Logger.getLogger(ArtefactFactory.class.getName());
	public final static Logger LOGGER_EXT = Logger.getLogger(ArtefactFactory.class.getName() + "_EXT");

	/**
	 * Root to project source and folders
	 */
	private Artefact projectRoot;

	/**
	 * Root to unresovleds and other weirdos of the cyber space.
	 */
	private Artefact unresolvedsRoot;

	static ArtefactFactory instance;

	public static ArtefactFactory getInstance() {
		if (instance == null)
			instance = new ArtefactFactory();
		return instance;
	}

	/**
	 * (location+name) -> artefact
	 */
	private Map<String, Artefact> artefacts;

	public ArtefactFactory() {
		artefacts = new HashMap<>();
	}

	/**
	 * WARNING missing some ExternalFOlderArtefacts....
	 * 
	 * @return
	 */
	public static Map<String, Artefact> getArtefacts() {
		return getInstance().artefacts;
	}

	public static HashSet<ArtefactType> getAllArtefactTypes() {
		HashSet<ArtefactType> ats = new HashSet<>();
		for (Artefact a : ArtefactFactory.getArtefacts().values()) {
			ats.add(a.getType());
		}
		return ats;
	}

	public Artefact getArtefact(File f) {
		String locationName = f.getParent() + f.getName();
		Protocol p = Protocol.no_protocol;
		if (f.exists())
			p = Protocol.local;
		return getArtefact(p + locationName);
	}

	/**
	 * See
	 * <ul>
	 * <li>{@link #newSourceFileArtefact(File)}</li>
	 * <li>{@link #newLocalFileArtefact(Reference)}</li>
	 * <li>{@link #newExternalFileArtefact(Reference)}</li>
	 * </ul>
	 * 
	 * for precions/cohesion on keys of the artefacts map.
	 * 
	 * @param r
	 * @return
	 */
	public Artefact getArtefact(Reference r) {
		String locationName = "";
		if (r.isLocal()) {
			File f = new File(r.getTargetFileArtefact());
			if (r.isResolved())
				locationName = f.getParent() + f.getName();
			else
				locationName = r.getTargetFileArtefact() + f.getName();
		} else {
			String location = r.getTargetFileArtefact();
			String name = location.substring(location.lastIndexOf("/") + 1);
			location = location.substring(0, location.length() - name.length());
			locationName = location + name;
		}
		return getArtefact(r.getProtocol() + locationName);
	}

	public Artefact getArtefact(Protocol p, String location, String name) {
		return getArtefact(p + location + name);
	}

	private Artefact getArtefact(String locationName) {
		return artefacts.get(locationName);
	}

	public Artefact getArtefactWithID(String ID) {
		for (Artefact a : artefacts.values()) {
			if (a.getID().equals(ID))
				return a;
		}
		return null;
	}

	/**
	 * Builds artefacts from an instanciated static explorer (see
	 * {@link StaticExplorer})
	 */
	public void buildArtefacts() {
		LOGGER.info("Building Artefacts ** Roots, Local, Files, Folders and Locations...");

		createExternalKnownLocations();
		createProjectRootArtefact();
		createUnresovledsStackArtefact();

		int deps = createLocalRootDependenciesArtefacts();
		LOGGER.info(2 + deps + " root location dependencies found (" + deps + " local" + (deps > 1 ? "s" : "")
				+ ", rootProject, and unresolvedsStack).");
		for (Artefact aDep : subsetsArtefactsByType(ArtefactTypeFactory.LOCAL_ROOT_ARTEFACT)) {
			LOGGER.finer("  - " + aDep + ": " + aDep.getLocation());
		}

		/* build Artefact from source files found in project folder */
		buildSourceFileArtefacts();
		LOGGER.info(subsetsArtefactsByType(ArtefactTypeFactory.SOURCE_FILE_ARTEFACT).size() + " SourceFile found and "
				+ subsetsArtefactsByType(ArtefactTypeFactory.LOCAL_FOLDER_ARTEFACT).size() + " LocalFolder.");
		for (Artefact a : subsetsArtefactsByType(ArtefactTypeFactory.SOURCE_FILE_ARTEFACT))
			LOGGER.finer("  - " + a + ": " + a.getHREF());

		/* build Artefact from source files found in project folder */
		buildLocalFilesArtefacts();
		LOGGER.info(subsetsArtefactsByType(ArtefactTypeFactory.LOCAL_FILE_ARTEFACT).size() + " LocalFile found ("
				+ subsetsArtefactsByType(ArtefactTypeFactory.LOCAL_FOLDER_ARTEFACT).size() + " LocalFolder).");
		if (LOGGER.getLevel().equals(Level.FINE)) {
			for (Artefact a : subsetsArtefactsByType(ArtefactTypeFactory.LOCAL_FOLDER_ARTEFACT))
				LOGGER.finer("  - " + a + ": " + a.getHREF());
			for (Artefact a : subsetsArtefactsByType(ArtefactTypeFactory.LOCAL_FILE_ARTEFACT))
				LOGGER.finer("  - " + a + ": " + a.getHREF());
		}
		LOGGER.info(unresolvedsRoot.getFragments().size() + " unresolved artefacts.");
		for (Artefact a : unresolvedsRoot.getFragments())
			LOGGER.finer("  - " + a + ": " + a.getHREF());

		/* build Artefact from source files found in project folder */
		buildExternalFilesArtefacts();
		LOGGER.info(subsetsArtefactsByType(ArtefactTypeFactory.EXTERNAL_FILE_ARTEFACT).size() + " ExternalFile and "
				+ subsetsArtefactsByType(ArtefactTypeFactory.EXTERNAL_LOCATION_ARTEFACT).size()
				+ " ExternalLocations found in " + ReferenceFactory.getReferences().size() + " references.");
		if (LOGGER.getLevel().equals(Level.FINE)) {
			for (Artefact a : subsetsArtefactsByType(ArtefactTypeFactory.EXTERNAL_LOCATION_ARTEFACT))
				LOGGER.finer("  - " + a + ": " + a.getHREF());
			for (Artefact a : subsetsArtefactsByType(ArtefactTypeFactory.EXTERNAL_FILE_ARTEFACT))
				LOGGER.finer("  - " + a + ": " + a.getHREF());
		}

		buildElementLevelArtefacts();
		LOGGER.info(subsetsArtefactsByType(ArtefactTypeFactory.ELEMENT_ARTEFACT).size() + " Elements in "
				+ ReferenceFactory.getReferences().size() + " references.");
		if (LOGGER.getLevel().equals(Level.FINE)) {
			for (Artefact a : subsetsArtefactsByType(ArtefactTypeFactory.ELEMENT_ARTEFACT))
				LOGGER.finer("  - " + a + ": " + a.getHREF());
		}

		buildJavaCustomArtefacts();
		LOGGER.info(
				subsetsArtefactsByType(ArtefactTypeFactory.CUSTOM_JAVA_FILE_ARTEFACT).size() + " CustomJava files in "
						+ subsetsArtefactsByType(ArtefactTypeFactory.CUSTOM_JAVA_FOLDER_ARTEFACT).size() + " folders.");
		if (LOGGER.getLevel().equals(Level.FINE)) {
			for (Artefact a : subsetsArtefactsByType(ArtefactTypeFactory.CUSTOM_JAVA_FOLDER_ARTEFACT))
				LOGGER.finer("  - " + a + ": " + a.getHREF());
			for (Artefact a : subsetsArtefactsByType(ArtefactTypeFactory.CUSTOM_JAVA_FILE_ARTEFACT))
				LOGGER.finer("  - " + a + ": " + a.getHREF());
		}

	}

	private void buildJavaCustomArtefacts() {
		Set<File> folders = Config.getInstance().getJavaCustomFolders();

		for (File folder : folders) {
			JavaFolder jf = new JavaFolder(folder);

			Artefact a = getArtefact(folder);
			if (a == null) {
				a = new Artefact(folder.getName(), ArtefactTypeFactory.CUSTOM_JAVA_FOLDER_ARTEFACT, folder.getParent(),
						null, true);
				addArtefact(a);

				// If the parent artefact exists, affects it.
				affectsLocalParentIfExists(a);
			}

			for (JavaFile f : jf.getJavaFiles()) {
				Artefact a2 = getArtefact(f.getFile());
				if (a2 == null) {
					a2 = new Artefact(f.getFile().getName(), ArtefactTypeFactory.CUSTOM_JAVA_FILE_ARTEFACT,
							f.getFile().getParent(), a, true);
					a2.setType(ArtefactTypeFactory.CUSTOM_JAVA_FILE_ARTEFACT);
					addArtefact(a2);
					a.addFragment(a2);
					// If the parent artefact exists, affects it.
					affectsLocalParentIfExists(a2);
				}
			}
		}
	}

	private void buildElementLevelArtefacts() {
		for (Reference r : ReferenceFactory.getReferences().values()) {
			Artefact a = getArtefact(r);
			Artefact aElt = new Artefact(r.getInnerLocation(), ArtefactTypeFactory.ELEMENT_ARTEFACT,
					r.getHREF().substring(0, r.getHREF().length() - r.getInnerLocation().length()), null);
			addArtefact(aElt);
			a.addFragment(aElt);
		}
	}

	private void createExternalKnownLocations() {

		////// Papyrus related
		ExternalLocationArtefact aPapyrus = new ExternalLocationArtefact("plugin/org.eclipse.papyrus",
				ArtefactTypeFactory.EXTERNAL_ROOT_ARTEFACT, Protocol.platform);
		addArtefact(aPapyrus);
		ExternalLocationArtefact.addKnownLocation(aPapyrus);

		Artefact aPapUML = new Artefact("uml", ArtefactTypeFactory.EXTERNAL_FILE_ARTEFACT, aPapyrus.getLocation(),
				aPapyrus);
		aPapUML.setProtocol(aPapyrus.getProtocol());
		addArtefact(aPapUML);
		aPapyrus.addFragment(aPapUML);
		ExternalLocationArtefact.addKnownLocation(aPapUML);

		Artefact aPapInfra = new Artefact("infra", ArtefactTypeFactory.EXTERNAL_FILE_ARTEFACT, aPapyrus.getLocation(),
				aPapyrus);
		aPapInfra.setProtocol(aPapyrus.getProtocol());
		addArtefact(aPapInfra);
		aPapyrus.addFragment(aPapInfra);
		ExternalLocationArtefact.addKnownLocation(aPapInfra);

		Artefact aPapSys16 = new Artefact("sysml16", ArtefactTypeFactory.EXTERNAL_FILE_ARTEFACT, aPapyrus.getLocation(),
				aPapyrus);
		aPapSys16.setProtocol(aPapyrus.getProtocol());
		addArtefact(aPapSys16);
		aPapyrus.addFragment(aPapSys16);
		ExternalLocationArtefact.addKnownLocation(aPapSys16);

		Artefact aPapSys14 = new Artefact("sysml14", ArtefactTypeFactory.EXTERNAL_FILE_ARTEFACT, aPapyrus.getLocation(),
				aPapyrus);
		aPapSys16.setProtocol(aPapyrus.getProtocol());
		addArtefact(aPapSys14);
		aPapyrus.addFragment(aPapSys14);
		ExternalLocationArtefact.addKnownLocation(aPapSys14);

		////// Glossary related
		ExternalLocationArtefact aGlossary = new ExternalLocationArtefact("plugin/com.cea.papyrus.glossary",
				ArtefactTypeFactory.EXTERNAL_ROOT_ARTEFACT, Protocol.platform);
		addArtefact(aGlossary);
		ExternalLocationArtefact.addKnownLocation(aGlossary);
	}

	/**
	 * Instantiate {@link #projectRoot}
	 */
	private void createProjectRootArtefact() {
		projectRoot = new Artefact("ProjectRoot", ArtefactTypeFactory.LOCAL_ROOT_ARTEFACT,
				Config.getInstance().getProjectFullPath(), null, true);
		projectRoot.setProtocol(Protocol.local);
		addArtefact(projectRoot);
	}

	/**
	 * Instantiate {@link #unresolvedsRoot}
	 */
	private void createUnresovledsStackArtefact() {
		unresolvedsRoot = new Artefact("UnresolvedsStack", ArtefactTypeFactory.LOCAL_ROOT_ARTEFACT, "nowhere", null,
				true);
		unresolvedsRoot.setProtocol(Protocol.no_protocol);
		addArtefact(unresolvedsRoot);
	}

	/**
	 * For each dependencies (reported in
	 * {@link Config#getProjectDependenciesFull()}) create a local root artefact
	 * ({@link ArtefactTypeFactory#LOCAL_ROOT_ARTEFACT})
	 */
	private int createLocalRootDependenciesArtefacts() {
		List<String> deps = Config.getInstance().getProjectDependenciesFull();
		for (String depPath : deps) {
			createLocalRootArtefact(depPath);
		}
		return deps.size();
	}

	/**
	 * Returns existing {@link ArtefactTypeFactory#LOCAL_ROOT_ARTEFACT}s.
	 * 
	 * @return
	 */
	public List<Artefact> getLocalRootDependenciesArtefacts() {
		List<Artefact> arts = subsetsArtefactsByType(ArtefactTypeFactory.LOCAL_ROOT_ARTEFACT);
//		arts.remove(projectRoot);
		return arts;
	}

	private Artefact createLocalRootArtefact(String fullPath) {
		String name = fullPath.substring(fullPath.lastIndexOf(File.separator) + 1);
		Artefact depRoot = new Artefact(name, ArtefactTypeFactory.LOCAL_ROOT_ARTEFACT, fullPath, null, true);
		depRoot.setProtocol(Protocol.local);
		addArtefact(depRoot);
		return depRoot;
	}

	/**
	 * Browse {@link ReferenceFactory#getSourceFiles()} and create SourceFiles
	 * artefacts accordingly ({@link ArtefactTypeFactory#SOURCE_FILE_ARTEFACT}).
	 * <br/>
	 * These are the files found in the project repository.
	 */
	private void buildSourceFileArtefacts() {
		int iFile = 0;
		int iFolder = 0;
		for (Source sFile : StaticExplorer.getSourceFiles()) {
			File f = new File(sFile.getPath());
			Artefact a = newSourceFileArtefact(f);
			addArtefact(a);
			iFile++;
			boolean added = addLocalFolderArtefact(a);
			if (added)
				iFolder++;

			affectsLocalParentIfExists(a);
		}
		LOGGER.fine(iFile + " SourceFile and " + iFolder + " LocalFolder found in "
				+ StaticExplorer.getSourceFiles().size() + " files.");
	}

	/**
	 * Allocate its parent folder
	 * ({@link ArtefactTypeFactory#LOCAL_FOLDER_ARTEFACT}) to a Source/Local File
	 * artefact. <br/>
	 * 
	 * Warning. If parent does not resolve, the system will send an exception and
	 * stop.
	 * 
	 * @param a
	 * @param r (null when calling for a SourceFile artefact)
	 * @return
	 */
	private boolean addLocalFolderArtefact(Artefact a) {
		Artefact res;
		File f = new File(a.getLocation());
		try {
			f.getParentFile().getCanonicalPath();
		} catch (Exception e) {
			e.printStackTrace();// NO REASON we get there, sources were got from same env.
			LOGGER.severe("Location (of parent folder) not found: " + f.getAbsolutePath());
			System.exit(1);
		}

		res = getArtefact(f);
		if (res == null) {
			res = new Artefact(f.getName(), ArtefactTypeFactory.LOCAL_FOLDER_ARTEFACT, f.getParent(), null, true);
			addArtefact(res);

			// If the parent artefact exists, affects it.
			affectsLocalParentIfExists(res);

			return true;
		}
		res.addFragment(a);
		return false;
	}

	/**
	 * If a there exists an artefact at parent location (location-path/..), makes
	 * the fragment.<br/>
	 * Also associate an artefact with its Local root folder
	 * 
	 * @param artefact (Resolving !) (see {@link Artefact#isResolves()}
	 * @return
	 */
	private Artefact affectsLocalParentIfExists(Artefact artefact) {
		if (!artefact.isLocal())
			throw new IllegalArgumentException(artefact + " is not local. Should not get here.");

		Artefact parent = null;
		if (artefact.isResolves()) {
			parent = getArtefact(new File(artefact.getLocation()));
			if (parent != null) {
				// Check dependencies paths to assign root.
				for (Artefact aDep : getLocalRootDependenciesArtefacts()) {
					String aDepPath = aDep.getLocation();
					if (parent.getLocation().equals(aDepPath)) {
						aDep.addFragment(parent);
					}
				}
			}
		} else {
			LOGGER.fine(artefact + " does not resolves. It is stored in the unresolveds stack.");
			unresolvedsRoot.addFragment(artefact);
		}
		if (parent != null)
			parent.addFragment(artefact);
		return parent;
	}

	/**
	 * Browse {@link ReferenceFactory#getExternalReferences()} and create
	 * ExternalFiles artefacts accordingly
	 * {@link ArtefactTypeFactory#EXTERNAL_FILE_ARTEFACT}. <br/>
	 * These are the files found as targets of references from the SourceFile that
	 * are not local <br/>
	 * WARNING: for now, the "external" are the ones that have a protocol). (i.e.,
	 * files in the project repository target other source/local files
	 * (Source/LocalFile artefacts).
	 */
	private void buildExternalFilesArtefacts() {
		for (Reference r : ReferenceFactory.getExternalReferences()) {
			Artefact a = newExternalFileArtefact(r);
			boolean success = addArtefact(a);
			if (success)
				LOGGER.finer("new: " + a);
		}
	}

	/**
	 * Browse {@link ReferenceFactory#getLocalReferences()} and create LocalFiles
	 * artefacts accordingly {@link ArtefactTypeFactory#LOCAL_FILE_ARTEFACT}. <br/>
	 * These are the files found as targets of references from the SourceFile.
	 * (i.e., files in the project repository target other local files (LocalFile
	 * artefacts).
	 */
	private void buildLocalFilesArtefacts() {
		int artefactsAdded = 0;
		int folderAdded = 0;
		for (Reference r : ReferenceFactory.getLocalReferences()) {
			Artefact a = newLocalFileArtefact(r);
			boolean success = addArtefact(a);
			if (success)
				artefactsAdded++;
			if (r.isResolved()) {
				boolean added = addLocalFolderArtefact(a);
				if (added)
					folderAdded++;
			}
			affectsLocalParentIfExists(a);
		}
		LOGGER.fine(artefactsAdded + " LocalFile and " + folderAdded + " LocalFolder found in "
				+ ReferenceFactory.getReferences().size() + " references.");
	}

	/**
	 * Creates a new Artefact of type
	 * {@link ArtefactTypeFactory#SOURCE_FILE_ARTEFACT}. It is located at the parent
	 * folder of the file passed in parameter
	 * 
	 * @param f
	 * @return a new Artefact of type
	 *         {@link ArtefactTypeFactory#SOURCE_FILE_ARTEFACT}
	 */
	private Artefact newSourceFileArtefact(File f) {
		Artefact res = getArtefact(f);
		if (res == null) {
			res = new Artefact(f.getName(), ArtefactTypeFactory.SOURCE_FILE_ARTEFACT, f.getParent(), null, true);
			LOGGER.finest("newR " + res);
		} else
			LOGGER.finest("Artefact '" + res + "' already exists.");
		return res;
	}

	/**
	 * Creates a new Artefact of type
	 * {@link ArtefactTypeFactory#LOCAL_FILE_ARTEFACT} named from the target file
	 * name extracted from {@link Reference#getTargetFileArtefact()}. <br/>
	 * If R resolves ({@link Reference#isResolved()}) the artefact is gona be
	 * located ({@link Artefact#location}) at the parent folder. (This will help
	 * cluster links' origins and targets) <br/>
	 * If not, the artefact will be located at the reference's target
	 * ({@link Reference#getTargetFileArtefact()}). <br/>
	 * ArtefactType: {@link ArtefactTypeFactory#LOCAL_FILE_ARTEFACT}
	 * 
	 * @param r
	 * @return a new Artefact of type
	 *         {@link ArtefactTypeFactory#LOCAL_FILE_ARTEFACT}
	 */
	private Artefact newLocalFileArtefact(Reference r) {
		Artefact res = null;

		File f = new File(r.getTargetFileArtefact());
		String name = f.getName();

		if (r.isResolved()) {
			// Resolved means that the ancestry of the file exists, we can use the parent to
			// precise the location
			res = getArtefact(f);
			if (res == null) {
				res = new Artefact(name + "", ArtefactTypeFactory.LOCAL_FILE_ARTEFACT, f.getParent(), null, true);
				LOGGER.finest("newR " + res);
			} else {
				LOGGER.finest("Artefact '" + res + "' already exists.");
			}

		} else { // R is not resolved
			String location = r.getTargetFileArtefact(); // Location is the target - we keep it full.

			res = getArtefact(r.getProtocol(), location, name);
			if (res == null) {
				res = new Artefact(name, ArtefactTypeFactory.LOCAL_FILE_ARTEFACT, location, null, false);
				LOGGER.finest("new " + res);
			} else {
				LOGGER.finest("Artefact '" + res + "' already exists.");
			}
		}
		return res;
	}

	/**
	 * Creates a new Artefact of type
	 * {@link ArtefactTypeFactory#EXTERNAL_FILE_ARTEFACT} named from the last path
	 * element of {@link Reference#getTargetFileArtefact()} and located at
	 * {@link Reference#getTargetFileArtefact()}. <br/>
	 * 
	 * @param r
	 * @return a new Artefact of type
	 *         {@link ArtefactTypeFactory#EXTERNAL_FILE_ARTEFACT}
	 */
	private Artefact newExternalFileArtefact(Reference r) {
		String location = r.getTargetFileArtefact();
		String name = location.substring(location.lastIndexOf("/") + 1);
		location = location.substring(0, location.length() - name.length());

		Artefact parent = getExternalLocation(location, r.getProtocol());

		Artefact res = getArtefact(r.getProtocol(), location, name);
		if (res == null) {
			res = new Artefact(name, ArtefactTypeFactory.EXTERNAL_FILE_ARTEFACT, location, null, false);
			res.setProtocol(r.getProtocol());//
			addArtefact(res);
			LOGGER_EXT.finest("new " + res);
		}
		parent.addFragment(res);
		return res;
	}

	/**
	 * 
	 * @param location
	 * @param p
	 */
	private Artefact getExternalLocation(String location, Protocol p) {
		Artefact resParent = getArtefact(p, location, location);
		if (resParent == null)
			resParent = new ExternalLocationArtefact(location, ArtefactTypeFactory.EXTERNAL_LOCATION_ARTEFACT, p);
		addArtefact(resParent);

		return resParent;
	}

	public Artefact[] sortArtefactsByType(Collection<Artefact> artefacts) {
		Artefact[] arts = (Artefact[]) artefacts.toArray(new Artefact[artefacts.size()]);
		Arrays.sort(arts, new Comparator<Artefact>() {
			@Override
			public int compare(Artefact o1, Artefact o2) {
				return o1.getType().getName().compareTo(o2.getType().getName());
			}
		});
		return arts;
	}

	public static Artefact[] sortArtefactsByLocation(Collection<Artefact> artefacts) {
		Artefact[] arts = (Artefact[]) artefacts.toArray(new Artefact[artefacts.size()]);
		Arrays.sort(arts, new Comparator<Artefact>() {
			@Override
			public int compare(Artefact o1, Artefact o2) {
				return o1.getLocation().compareTo(o2.getLocation());
			}
		});
		return arts;
	}

	public static List<Artefact> subsetsArtefactsByType(ArtefactType type) {
		return getArtefacts().values().stream().filter(a -> a.isOfType(type)).collect(Collectors.toList());
	}
	public static List<Artefact> subsetsArtefactsByType(Collection<Artefact> artefacts, ArtefactType type) {
		return artefacts.stream().filter(a -> a.isOfType(type)).collect(Collectors.toList());
	}

	public static List<Artefact> subsetsArtefactsByTypeName(String typeName) {
		return getArtefacts().values().stream().filter(a -> a.isOfType(typeName)).collect(Collectors.toList());
	}
	public static List<Artefact> subsetsArtefactsByTypeName(Collection<Artefact> artefacts, String typeName) {
		return artefacts.stream().filter(a -> a.isOfType(typeName)).collect(Collectors.toList());
	}

	public static List<Artefact> subsetsArtefactsByProtocol(Protocol p) {
		return getArtefacts().values().stream().filter(a -> a.getProtocol() == p).collect(Collectors.toList());
	}	
	public static List<Artefact> subsetsArtefactsByProtocol(Collection<Artefact> artefacts, Protocol p) {
		return artefacts.stream().filter(a -> a.getProtocol() == p).collect(Collectors.toList());
	}


	/**
	 * Wrong behavior - wrong start, ensues duplicate entries (descendants present
	 * in the list)
	 * 
	 * @return
	 */
	public static Set<Artefact> getAncestors() {
		HashSet<Artefact> res = new HashSet<>();
		for (Artefact a : getArtefacts().values()) {
			res.add(a.getAncestor());
		}
		return res;
	}

	public boolean addArtefact(Artefact a) {
		int size = artefacts.size();
		artefacts.put(a.getProtocol() + a.getLocation() + a.getName(), a);
		if (size != artefacts.size() - 1) {
			LOGGER.finest(a + " was not added.");
		}
		return size == artefacts.size() - 1;
	}

	public static void printArtefactsByType() {
		System.out.println();
		System.out.println(getArtefacts().size() + " artefacts built.");
		for (ArtefactType aType : ArtefactTypeFactory.getInstance().getTypesValues()) {
			Artefact[] arts = sortArtefactsByLocation(subsetsArtefactsByType(aType));
			System.out.println(aType.getName());
			for (Artefact a : arts)
				System.out.println(" - " + a.getJSon());// a.getLocation() + " " + a.getJSon());
		}
	}

	public static List<TraceLink> getFragmentLinks(Artefact a) {
		ArrayList<TraceLink> tls = new ArrayList<>();
		for (Artefact aa : a.getFragments()) {
			TraceLink tl = new TraceLink(a, aa);
			tls.add(tl);
			tls.addAll(getFragmentLinks(aa));
		}
		return tls;
	}

	public static String renderFragmentationJSon(boolean renderElements) {
		String resFrag = "";

		Set<Artefact> artsWithoutParents = new HashSet<>();
		for (Artefact a : getArtefacts().values())
			if (a.getParent() == null)
				artsWithoutParents.add(a);

		for (Artefact a : artsWithoutParents) {
			if (renderElements || a.getType() != ArtefactTypeFactory.ELEMENT_ARTEFACT)
				resFrag += a.renderFragmentation(true, renderElements) + ",\n";
		}
		if (!resFrag.isBlank())
			resFrag = resFrag.substring(0, resFrag.length() - 2);
		resFrag = "\"fragmentation\": [" + resFrag + "]";

		return resFrag;
	}

	/**
	 * Browse each External_LOCATION_ARTEFACTs and attribute an EXTERNAL ROOT if
	 * there is one that fits the location.
	 */
	public void clusterExternalLocations() {

		for (Artefact a : subsetsArtefactsByType(ArtefactTypeFactory.EXTERNAL_LOCATION_ARTEFACT)) {
			Artefact parent = null;
			int maxSize = 0;
			String test = "";
			String parentCut = "";
			for (Artefact aKnown : ExternalLocationArtefact.getKnownLocations()) {
				test = aKnown.getLocation() + "." + aKnown.getName();
				if (a.getLocation().startsWith(test)) {
					if (test.length() > maxSize) {
						maxSize = test.length();
						parent = aKnown;
						parentCut = aKnown.getLocation() + "." + aKnown.getName();
					}
				}
				if (parent == null) {
					test = aKnown.getLocation();
					if (a.getLocation().startsWith(test)) {
						if (test.length() > maxSize) {
							maxSize = test.length();
							parent = aKnown;
							parentCut = aKnown.getLocation();
						}
					}
				}
			}

			if (parent != null) {
				parent.addFragment(a);
				String newName = a.getName().substring(parentCut.length() + 1); // +1 +1 for 'points'
				if (!parent.isOfType(ArtefactTypeFactory.EXTERNAL_ROOT_ARTEFACT))
					parent.setType(ArtefactTypeFactory.EXTERNAL_LOCATION_ARTEFACT);
				// TODO a update of the keys in artefacts map ????¿¿¿¿
				a.setName(newName);
			}
		}

	}

}
