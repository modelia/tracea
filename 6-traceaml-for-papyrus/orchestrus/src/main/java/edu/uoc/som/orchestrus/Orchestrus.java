package edu.uoc.som.orchestrus;

import java.io.File;
import java.util.Arrays;
import java.util.logging.Logger;

import edu.uoc.som.orchestrus.config.Config;
import edu.uoc.som.orchestrus.graph.TraceGraph;
import edu.uoc.som.orchestrus.parsing.StaticExplorer;
import edu.uoc.som.orchestrus.tracemodel.Artefact;
import edu.uoc.som.orchestrus.tracemodel.ArtefactFactory;
import edu.uoc.som.orchestrus.tracemodel.Trace;
import edu.uoc.som.orchestrus.tracemodel.TraceFactory;
import edu.uoc.som.orchestrus.utils.Utils;

public class Orchestrus {
	public final static Logger LOGGER = Logger.getLogger(Orchestrus.class.getName());

	
	public static void main(String[] args) {
		System.out.println("    --  o· o - O ~ o - o ~ o · O ·--");
		System.out.println("    --                            --");
		System.out.println("    -- --      Orchestrus      -- --");
		System.out.println("    --                            --");
		System.out.println("    --------------------------------\n");


/*
 * Init.
 * builds references from source files, 
 * then builds artefacts as sources and targets of these references.		
 */
		String configurationFile = "src/main/resources/configuration-sample.json";
		if(args.length > 0) {
			configurationFile = args[0];
			if(new File("src/main/resources"+File.separator+configurationFile).exists())
				configurationFile = "src/main/resources"+File.separator+configurationFile;
		}
		Config config = Config.getInstance(configurationFile);
//		Config config = Config.getInstance("src/main/resources/configuration-references.json");
//		Config config = Config.getInstance("src/main/resources/configuration-glossary.json");
		StaticExplorer ppse = new StaticExplorer(config);
		String interArtDependencies_JSON = ppse.getInterArtefactReferences_Json();
		Utils.storeDependencies_HC(interArtDependencies_JSON);

		// Build artefacts from Sources and References
		ArtefactFactory aFactory = ArtefactFactory.getInstance();
		aFactory.buildArtefacts();
		aFactory.clusterExternalLocations(); 
		// Relates artefacts with fragmentation links.
		TraceFactory.fragmentSourcesAndFolders();
		LOGGER.info(ArtefactFactory.getArtefacts().size()+ " artefacts found.");
		
		// TODO resolve IDs from target file.
//		ppse.resolveElementIDs();
		// TODO Decompose artefacts with XPath patterns.
		
		// Store and deploy fragmentation
		Trace tFrag = TraceFactory.buildFragmentationTrace();
		tFrag.computeLinksTypesBasedOnEndTypes();
		tFrag.computeArtefactsTypesBasedOnSourceFolders();
		Utils.storeD3Tracea(tFrag, true);
		Utils.storeD3Tracea(tFrag, false, true, "R:\\Coding\\Git\\orchestrus\\meta\\d3viewer\\data\\input_data.json");
		Utils.storeD3Tracea(tFrag, true, true, "R:\\Coding\\Git\\orchestrus\\meta\\d3viewer\\data\\input_data_wth_elements.json");

		// Store and deploy tracelinks
		Trace tLinks = TraceFactory.buildReferencesTrace();
		tLinks.computeLinksTypesBasedOnEndTypes();
		//tLinks.computeArtefactsTypesBasedOnSourceFolders();
		Utils.storeD3Tracea(tLinks, true);
		Utils.storeD3Tracea(tLinks, false, true, "R:\\Coding\\Git\\orchestrus\\meta\\d3viewer\\data\\input_trace_data.json");
		Utils.storeD3Tracea(tLinks, true, true, "R:\\Coding\\Git\\orchestrus\\meta\\d3viewer\\data\\input_trace_data_wth_elements.json");
		
		//Store and deploy setup and adjacency matrix
		//Utils.storeMatrixTracea(tLinks, true, Trace.ADJACENCY_THRESHOLD);
		
		//Store full trace
		Utils.storeFullTraceJSon(tLinks, true);
		
		System.out.println("Graph work...");
		TraceGraph tg = new TraceGraph(tLinks, tFrag);
//		TraceGraph gt = new TraceGraph(tFrag, tFrag);
		
		System.out.println("Clustering...");
		Utils.storeAndDeployClustering(tg);
		
		Utils.storeSetup();
		
		System.out.println("Rendering...");
		//tg.detectCycles();
//		ShowGraph show = new ShowGraph(tg);
//		show.createAndShowGui();
		System.err.flush();
		System.out.println("\n\n-- Safe Exit o·~ !¡");
		System.exit(0);
	}

	/*
	 *  Arguments:
	 *  - Config file
	 *    - project = com.cea.papyrus.glossary
	 * 	  - projectRoot = R:\Coding\Git\orchestrus\data\GlossaryML-ReferenceML
	 * 	  - projectName = GlossaryML
	 * 	  - projectDependencies = com.cea.papyrus.referencemanagement
	 *    - File extensions ?

	 *  - Resolved conflictual FileArtefact paths
	 *  - Link type "translations"
	 *  
	 */

	public static void printArtefactSignatures() {
		System.out.println("Orchestrus.printArtefactSignatures()");
		String[] keys = (String[])  ArtefactFactory.getArtefacts().keySet().toArray(new String[ ArtefactFactory.getArtefacts().keySet().size()]);
		
		Arrays.sort(keys);
		
		for (String key : keys) {
			Artefact a = ArtefactFactory.getArtefacts().get(key);
			System.out.println(key + ":\t\t "+a);
		}
	}
	
	/*
	 * Run:
	 *  - Extract References (hrefs)
	 *  	o List folders (Config.sourceFiles)
	 *  	o Separate source/local/external (protocol?!)
	 *  	o Resolve source/local that can be solved
	 *  	o Sort out unresolvable -> UX for typing alternative ? (Storage ?)
	 *  - Extract Trace
	 *  	o Extract Source/Local/External File artefact
	 *  	  - Hardcoded typing ?
	 *  	o Build (multiended) links between Source/Local/External artefact
	 *  	  - Source and Local: solve and use Xpath to recover specific elements path
	 *   	  - What about externals ? UX alternative ?
	 *   	o Solve specific elements path 
	 *   	  - Directly where possible: source, resolvable File artefact.
	 *   	  - With UX for external ? 
	 *  - Store Trace in JSon
	 *  	o Trace init links (IDs)
	 *  	o Artefacts
	 * 		o Links
	 *  	o Typing: artefacts & links -> EngineeringDomain !! ("Translations" to ApplicationDomain ?!)
	 *  	o Fragmentation: cluster Paths to shows dependency nests - like common ancestor in the tree (X)path.
	 *  
	 *  	  - WOT ELSE broo ?!!?
	 *  
	 *  - Load trace
	 *  	o Types
	 */
	
}
