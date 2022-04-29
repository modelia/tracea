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


package edu.uoc.som.orchestrus.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import edu.uoc.som.orchestrus.graph.TraceGraph;
import edu.uoc.som.orchestrus.graph.TraceGraph.Cluster;
import edu.uoc.som.orchestrus.tracemodel.Artefact;
import edu.uoc.som.orchestrus.tracemodel.Trace;
import edu.uoc.som.orchestrus.utils.Utils;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

public class ClusteringSetup {
	public final static Logger LOGGER = Logger.getLogger(ClusteringSetup.class.getName());

	Map<String, ClusteringAlgo> algos = new HashMap<>();

	public Map<String, ClusteringAlgo> getAlgos() {
		return algos;
	}

	public Set<String> getAlgosNames() {
		return algos.keySet();
	}

	class ClusteringAlgo {
		Map<String, Object> parameters = new HashMap<>();
		String name;

		public ClusteringAlgo(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Map<String, Object> getParameters() {
			return parameters;
		}

		public Object getParameter(String key) {
			return parameters.get(key);
		}

		public String getParameterAsString(String key) {
			return (String) parameters.get(key);
		}

		public int getParameterAsInt(String key) {
			return Integer.parseInt((String) parameters.get(key));
		}
	}

	public ClusteringSetup(File clusterSetupFile) {

		@SuppressWarnings("deprecation")
		JSONParser parser = new JSONParser();
		try {
			JSONArray a = (JSONArray) parser.parse(new FileReader(clusterSetupFile.getAbsoluteFile()));
			for (Object o : a) {
				JSONObject run = (JSONObject) o;
				String algoName = run.getAsString("algorithm.name");
				ClusteringAlgo ca = new ClusteringAlgo(algoName);
				algos.put(algoName, ca);
				for (String s : run.keySet())
					ca.parameters.put(s, run.getAsString(s));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Specify deployFOlderPath for deployment. If left null, means no deployement.
	 * 
	 * @param tg
	 * @param outputFolderPath
	 * @param deployFolderPath Can be null - ignored in such case
	 * @throws IllegalAccessError
	 */
	public static void storeAndDeployClustering(TraceGraph tg, String outputFolderPath, String deployFolderPath)
			throws IllegalAccessError {
		LOGGER.info("\n  output: " + outputFolderPath + "\n  deploy: " + deployFolderPath);
		File outputFolder = cleanFolder(outputFolderPath);
		String deployFolderClusters = deployFolderPath + File.separator + Config.getInstance().getProjectName() + "\\clusters";
		if (deployFolderPath != null) {
			cleanFolder(deployFolderClusters);
		}
		String clusterResults = "";

		String setup =  "\"project.name\": \"" + Config.getInstance().getProjectName() + "\","
				+ "\"algos\": [";

		ClusteringSetup clusteringSetup = Config.getInstance().getClusteringSetup();
		for (ClusteringAlgo ca : clusteringSetup.getAlgos().values()) {
			List<Cluster> traceClusters = null;
			switch (ca.getName()) {
			case "LabelPropagation":
				traceClusters = tg
						.getLabelPropagationClusters(Integer.parseInt((String) ca.parameters.get("maxIterations")));
//				setup += "{"
//							+ "\"name\": \"" + ca.getName()+ "\","
//							+ "\"maxIterations\": \"" + ca.parameters.get("maxIterations")+ "\""
//						+ "},";
				break;
			case "KSpan":
				traceClusters = tg.getKSpanClusters(Integer.parseInt((String) ca.parameters.get("k")));
				break;
			case "GirvenNewman":
				try {
					traceClusters = getGirvanNewmanClustersResult(tg, ca);
//					setup += "{"
//							+ "\"name\": \"" + ca.getName()+ "\","
//							+ "\"k\": \"" + ca.parameters.get("k")+ "\""
//						+ "},";
				} catch (NumberFormatException | TimeoutException e) {
					// traceClusters remains NULL, LOGGED below 
				} 
				break;
			default:
				throw new IllegalAccessError("Unrecognized algorithm name for clustering.");
			}
			
			String parameters = "";
			for (String k : ca.getParameters().keySet()) 
				parameters += "\"" + k + "\": \""+ca.getParameter(k)+"\",";
			if (parameters.endsWith(","))
				parameters = parameters.substring(0, parameters.length() - 1);
			setup += "{" + parameters + "},";
			
			if (traceClusters != null) {// we passed the time out.
				String clusterRes = printClusters(outputFolder.getAbsolutePath(), traceClusters, ca);
				
				String algo = ca.getParameterAsString("algorithm.name");
				clusterResults += "\"" + algo + "\":" + clusterRes + ",";
				String fileName = algo + ".tracea.setup.json";
				Utils.writeJSon(outputFolderPath + File.separator + fileName, clusterRes);
				LOGGER.finer(algo + " stored in '" + outputFolderPath + File.separator + fileName + "'");
				if (deployFolderClusters != null) {
					printClusters(deployFolderClusters, traceClusters, ca);
					Utils.writeJSon(deployFolderClusters + File.separator + fileName, clusterRes);
					LOGGER.finer(algo + " deployed in '" + deployFolderPath + File.separator + fileName + "'");
				}
			} else {
				LOGGER.warning(ca.getName() + " clustering algorithm timed out (" + ca.getParameterAsString("timeout") + "s).");
			}
		}

		if (clusterResults.endsWith(","))
			clusterResults = clusterResults.substring(0, clusterResults.length() - 1);
		if (setup.endsWith(","))
			setup = setup.substring(0, setup.length() - 1);
		
		setup += "]";

		clusterResults = "{" +"\"setup\": {" 
				+  setup + "}," + clusterResults + "}";

		Utils.writeJSon(outputFolderPath + File.separator + "clustering.tracea.json", clusterResults );
		LOGGER.finer("Clustering stored in '" + outputFolderPath + File.separator + "clustering.tracea.json" + "'");
		if (deployFolderPath != null) {
			Utils.writeJSon(deployFolderPath + File.separator + "clustering.tracea.json",  clusterResults );
			//Utils.writeJSon(deployFolderPath + File.separator + "setup.tracea.json", "{" + setup + "}" );
			LOGGER.finer("Clustering deployed in '" + deployFolderPath + File.separator + "clustering/setup.tracea.json" + "'");
		}
	}
	
	static ExecutorService threadPool = Executors.newCachedThreadPool();
	
	public static List<Cluster> getGirvanNewmanClustersResult(final TraceGraph tg, ClusteringAlgo ca) throws TimeoutException {
	    // should be a field, not a local variable

	    // Java 8:
	    Callable<List<Cluster>> callable = () -> tg.getGirvanNewmanClusters(ca.getParameterAsInt("k"));


	    Future<List<Cluster>> future = threadPool.submit(callable);
	    try {
	        // throws a TimeoutException after 1000 ms
	        return future.get(ca.getParameterAsInt("timeout"), TimeUnit.SECONDS);
	    } catch (ExecutionException e) {
	        throw new RuntimeException(e.getCause());
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	        throw new TimeoutException();
	    }
	}

	private static File cleanFolder(String outputFolder) {
		File folder = new File(outputFolder);
		if (folder.list() != null && folder.list().length != 0)
			for (File f : folder.listFiles()) {
				Utils.deleteFolder(f);
			}
		folder.mkdirs();
		return folder;
	}

	/**
	 * 
	 * @param algoName       Must fit the prefix of trace name -> used to browse
	 *                       json representation file names.
	 * @param traceClusters
	 * @param minSizeCluster
	 */
	private static String printClusters(String clusterFolderPath, List<Cluster> traceClusters, ClusteringAlgo ca) {
		int sClusters = traceClusters.size();
		int minSizeCluster = ca.getParameterAsInt("cluster.size.min");
		traceClusters = traceClusters.stream().filter(t -> t.getTrace().getTraceLinks().size() >= minSizeCluster-1) //Counting links
				.collect(Collectors.toList());
		;
		LOGGER.finer(sClusters + " clusters. " + traceClusters.size() + " with size >= " + minSizeCluster);
		String setup = "\"setup\": {";
		setup += "\"totalClusters\": \"" + sClusters + "\",";
		setup += "\"relevantClusters\": \"" + traceClusters.size() + "\",";
		for (String k : ca.getParameters().keySet()) {
			setup += "\"" + k + "\": \"" + ca.getParameterAsString(k) + "\",";
		}
		if (setup.endsWith(","))
			setup = setup.substring(0, setup.length() - 1);
		setup += "}";

		String clusters = "\"clusters\": [";

		for (Cluster tc : traceClusters) {
			clusters += "{ \"name\": \"" + tc.getTrace().getName() + "\", ";
			clusters += "  ";
			clusters += "\"size\":\"" + tc.getArtefacts().size() + "\",";
			
			clusters += "\"artefacts\": [ ";
			for (Artefact a : tc.getArtefacts()) {
				clusters += "{"
						+ "\"name\":" + "\"" + a.getName() + "\"," 
						+ "\"id\":" + "\"" + a.getID() + "\"," 
						+ "\"location\":" + " \""+ Utils.cleanUrlsForJson(a.getLocation()) + "\",";
			
//			clusters += "\"traceToRoot\": { ";
//			for (Artefact t : tc.getTracesToRoots().keySet()) {
				clusters += "\"tracetoroot\": " + tc.getTracesToRoots().get(a).stream()
						.map(at -> "\"" + at.getID() + "\"").collect(Collectors.joining(",", "[", "]")) ;
//			}
				clusters += "},";
			}
			if (clusters.endsWith(","))
				clusters = clusters.substring(0, clusters.length() - 1);
			clusters += "]";
		
			
			clusters += "},";

			String filePath = clusterFolderPath + File.separator + tc.getTrace().getName() + ".tracea.d3.json";
			Utils.writeJSon(filePath, tc.getTrace().renderD3JSon(Trace.PRINT_ELEMENTS));
			LOGGER.finer(tc.getTrace().getName() + " written in '" + filePath + "'");
		}
		if (clusters.endsWith(","))
			clusters = clusters.substring(0, clusters.length() - 1);
		clusters += "]";

		String res = "{" + setup + "," + clusters + "}";

		return res;
	}
}
