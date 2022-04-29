package edu.uoc.som.orchestrus.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import edu.uoc.som.orchestrus.tracemodel.Artefact;
import edu.uoc.som.orchestrus.tracemodel.Trace;
import edu.uoc.som.orchestrus.tracemodel.TraceLink;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

public class Config {
	public final static Logger LOGGER = Logger.getLogger(Config.class.getName());

	
//	String projectRoot = "R:\\Coding\\Git\\orchestrus\\data\\GlossaryML-ReferenceML";
//	String project = "com.cea.papyrus.glossary";
//	String projectName = "GlossaryML";
//	List<String> projectDependencies = Arrays.asList("com.cea.papyrus.referencemanagement");

	String projectFolder;// = "R:\\Coding\\Git\\orchestrus\\data\\GlossaryML-ReferenceML";
	String projectURI;// = "com.cea.papyrus.referencemanagement";
	String projectName;// = "ReferencesML";
	List<String> projectDependencies;// = Collections.emptyList();//Arrays.asList("com.cea.papyrus.referencemanagement");
	List<String> javaSourceFolders;// = Arrays.asList("src-custom");//Arrays.asList("com.cea.papyrus.referencemanagement");
	
	File configurationFile;// = new File("src/main/resources/configuration-glossary.json");




	private String deploymentLocation;
	static String DEFAULT_CONFIGURATION_FILE = "src/main/resources/configuration-glossary.json";
	static String DEFAULT_CLUSTERING_FILE = "src\\main\\resources\\clustering.json";
	static String DEFAULT_DEPLOY_LOCATION = "meta\\d3viewer\\data\\";

	public File getConfigurationFile() {
		return configurationFile;
	}
	public String getDeploymentLocation() {
		return deploymentLocation;
	}
	private void loadConfiguration(String configurationFilePath) {
		configurationFile = new File(configurationFilePath);
		LOGGER.info("Loading configuration from '"+configurationFilePath+"'");
		if(!configurationFile.exists())
			throw new IllegalArgumentException("Configuration file not found: '"+configurationFilePath+"'");
		
		@SuppressWarnings("deprecation")
		JSONParser parser = new JSONParser();
		try {
			JSONObject configJSon = (JSONObject) parser.parse(new FileReader(configurationFile.getAbsoluteFile()));
			
			JSONObject config = (JSONObject) configJSon.get("config");
			
			projectURI = config.getAsString("project.uri");
			projectFolder = config.getAsString("project.folder");
			projectName = config.getAsString("project.name");
			
			projectDependencies = getProjectDependenciesFromConfigJSonObject(config);
			javaSourceFolders = getProjectSourceFoldersFromConfigJSonObject(config);
	
			
			JSONObject clustering = (JSONObject) configJSon.get("clustering");
			clusteringSetupLocation = new File(clustering.getAsString("file"));
			if(clusteringSetupLocation == null)
				clusteringSetupLocation = new File(DEFAULT_CLUSTERING_FILE);
			if(clusteringSetupLocation.exists() == false) 
				throw new IllegalArgumentException("Clustering file not found: '+"+clusteringSetupLocation+"'");
			clusteringSetup = new ClusteringSetup(clusteringSetupLocation);
			
			JSONObject deploy = (JSONObject) configJSon.get("deploy");
			deploymentLocation = deploy.getAsString("location");
			if(deploymentLocation == null)
				deploymentLocation = DEFAULT_DEPLOY_LOCATION;
			if(new File(deploymentLocation).exists() == false) 
				throw new IllegalArgumentException("Deployment location not found: '+"+clusteringSetupLocation+"'");
			
			
			JSONObject generation = (JSONObject) configJSon.get("generation");
			Artefact.D3_PRINT_LABEL_OPTION = Artefact.PrintLabelOptions.valueOf(generation.getAsString("label.artefacts").toUpperCase());
			TraceLink.D3_PRINT_LABEL_OPTION = TraceLink.PrintLabelOptions.valueOf(generation.getAsString("label.links").toUpperCase());
			Trace.PRINT_ELEMENTS = generation.getAsString("show.elements").toLowerCase().equals("true");
			Trace.ADJACENCY_THRESHOLD = Double.parseDouble(generation.getAsString("matrix.adjacency.threshold"));
			
			
			LOGGER.info(""
					+ "\n   project name:    "+projectName
					+ "\n   project URI:     "+projectURI
					+ "\n   project folder:  "+projectFolder
					+ "\n   dependencies:    "+projectDependencies
					+ "\n   source folders:  "+javaSourceFolders
					+ "\n "
					+ "\n   clustering file:     "+clusteringSetupLocation
					+ "\n   deployment location: "+deploymentLocation
					+ "\n "
					+ "\n   leaf elements: "+(Trace.PRINT_ELEMENTS?"Displayed":"Hidden")
					+ "\n"
					);

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	private List<String> getStringListFromJSonOArray(JSONArray jsonArr) {
//		JSONArray arrDependencies = (JSONArray) config.get("dependencies");
		if(jsonArr == null || jsonArr.size() == 0)
			return Collections.emptyList();
		List<String> res = new ArrayList<>(jsonArr.size());
		for (Object o : jsonArr) {
			String d = (String) o;
			//String dep = d.toJSONString();
			res.add(d);
		}
		return res;
	}

	private List<String> getProjectDependenciesFromConfigJSonObject(JSONObject config) {
		return  getStringListFromJSonOArray((JSONArray) config.get("dependencies"));
	}
	
	private List<String> getProjectSourceFoldersFromConfigJSonObject(JSONObject config) {
		return  getStringListFromJSonOArray((JSONArray) config.get("sourceFolders"));
	}
	
	/*
	 * Hard coded config files (in project root folder)
	 */
	public static final String PLUGIN_XML_FILENAME = "plugin.xml";
	public static final String PROJECT_FILENAME = ".project";
	public static final String CLASSPATH_FILENAME = ".classpath";
	public static final String MANIFEST_FILENAME = "META-INF"+File.separator+"MANIFEST.MF";
	public static final String BUILD_PROPERTIES_FILENAME = "build.properties";
	List<String> configFiles = Arrays.asList(
			PLUGIN_XML_FILENAME, 
			PROJECT_FILENAME,
			CLASSPATH_FILENAME, 
			MANIFEST_FILENAME, 
			BUILD_PROPERTIES_FILENAME
		);

	/*
	 * Hard coded folders names
	 */
	
	static final String architectureFramework = "architecture-framework";
	static final String elementTypeConfiguration = "element-type-configurations";
	static final String paletteConfigurationsFolder = "palette-configurations";
	static final String propertiesEditorConfiguration = "properties-editor-configurations";
	static final String specificationModelsFolder = "specification-models";
	static final String tabularEditorConfiguration = "tabular-editors-configurations";
	static final String umlProfilesFolder = "uml-profiles";
	static final String rootFolder = ".";
	List<String> contentFolders = Arrays.asList(
			architectureFramework, 
			elementTypeConfiguration,
			paletteConfigurationsFolder, 
			propertiesEditorConfiguration, 
			specificationModelsFolder,
			tabularEditorConfiguration, 
			umlProfilesFolder,
			rootFolder
		);
	public static String getContentFoldersLifeCyclePhaseName(String cf) {
		switch (cf) {
		case Config.architectureFramework:
			cf = "Architecture";
			break;
		case Config.elementTypeConfiguration:
			cf = "ElementTypeConfiguration";
			break;
		case Config.paletteConfigurationsFolder:
		case Config.propertiesEditorConfiguration:
			cf = "Paletization";
			break;
		case Config.specificationModelsFolder:
			cf = "Model";
			break;
		case Config.tabularEditorConfiguration:
			cf = "Design";
			break;
		case Config.umlProfilesFolder:
			cf = "Profile";
		default:
			break;
		}
		return cf;
	}
	
	static String TOOL_REQ_MODEL_SUFFIX = "_ToolReqModel";
	static String DOMAIN_MODEL_SUFFIX = ".domainmodel";
	static String LANGUAGE_REQ_SUFFIX = ".LanguageReqModel";
	
	public static final double MATRIX_DEFAULT_THRESHOLD = 0.5;

	static Config instance;


	private File clusteringSetupLocation;
	
	public static Config getInstance(String configurationFilePath) {
		if(instance == null)
			instance = new Config(configurationFilePath);
		return instance;
	}
	
	public static Config getInstance() {
		if(instance == null)
			instance = new Config(DEFAULT_CONFIGURATION_FILE);
		return instance;
	}
	
	
	
	/** Name -> Artefact */
	HashMap<String, Artefact> artefacts = new HashMap<>();


	private Config() {
		this(DEFAULT_CONFIGURATION_FILE);
	}
	
	
	private Config(String configurationFilePath) {
		this.configurationFile = new File(configurationFilePath);
		
		if(!this.configurationFile.exists())
			throw new IllegalArgumentException("Configuration file not found: '"+configurationFilePath+"'");
		
		loadConfiguration(configurationFile.getAbsolutePath());
		
		boolean check = checkFolderNames();
		if(!check) {
			LOGGER.severe("Some folders were not found. Please check configuration.");
//			System.exit(1);
		} else {
			LOGGER.fine("Folders correct.");
		}
		

		check = checkConfigFilesNames();
		if(!check) {
			LOGGER.severe("Some config files were not found. Please check configuration.\nExit with errors.");
			System.exit(1);
		} else {
			LOGGER.fine("Config files correct.");
		}

		
		
		// Fragments instanciation 
		//  -> rebuild from XPath patterns
		//  -> contextualizes with file/artefact location
//		Artefact eltXmiType = new Artefact("xmiType", atFactory.getType("xmlElt"));
//		Artefact labelHref = new Artefact("labelHref", atFactory.getType("label"));
		
		// Fragments connexion (Links instanciation)
		//  - Which fragment connects -directly- with who, and -derively- with who
		/*
		 *   F1 - F2 - F3 
		 *    -> F1 connects directly to F2
		 *    -> F1 connects derively to F3 (derived attribute, transitive closure with sub fragments)
		 */
	}

	private boolean checkConfigFilesNames() {
		boolean res = true;
		
		for (String sf : configFiles) {
			boolean tmp = getConfigFile(sf).exists();
			if(!tmp)
				LOGGER.warning("Could not find file: "+getConfigFile(sf).getAbsolutePath());
			res &= tmp;
		}
		return res;
	}

	private boolean checkFolderNames() {
		boolean res = true;
		//Main /
		res &= checkExistsAndDirectory(getProjectRoot());
		//Project folder
		res &= checkExistsAndDirectory(getProjectFullPath());
		
		//Project denpendencies
		for (String pd : getProjectDependenciesFull()) 
			res &= checkExistsAndDirectory(pd);
		
		//sub folders
		for (String sf : contentFolders) 
			res &= checkExistsAndDirectory(getProjectFullPath() + File.separator + sf);
		
		return res;
	}

	private boolean checkExistsAndDirectory(String path) {
		boolean res = true;
		File f = new File(path);
		if(!f.exists() || !f.isDirectory()) {
			res = false;
			LOGGER.warning("Could not find folder: "+f.getAbsolutePath());
		}
		return res;
	}

	
	public List<String> getContentFoldersName() {
		return contentFolders;
	}
	
	public List<String> getContentFoldersFull() {
		ArrayList<String> res = new ArrayList<>(getContentFoldersName().size());
		for (String s : getContentFoldersName()) {
			res.add(getProjectFullPath() + File.separator + s);
		}
		return res;
	}
	
	
	public HashMap<String, Artefact> getArtefacts(){
		return artefacts;
	}
	
	
	public String getProjectRoot() {
		return projectFolder;
	}
	
	public String getProject() {
		return projectURI;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public String getProjectFullPath() {
		return projectFolder+ File.separator+ projectURI;
	}
	
	public List<String> getProjectDependencies() {
		return projectDependencies;
	}

	public List<String> getProjectDependenciesFull() {
		List<String> res = new ArrayList<>(projectDependencies.size());
		for (String pd : projectDependencies) {
			res.add(projectFolder + File.separator + pd);
		}
		return res;
	}

	public static String getPropertiesEditorConfiguration() {
		return propertiesEditorConfiguration;
	}
	public String getPropertiesEditorConfigurationContext() {
		return getProjectFullPath() + File.separator + propertiesEditorConfiguration + File.separator + getProjectName()+".ctx";
	}

	public String getSpecificationModelsFolderFull() {
		return getProjectFullPath() + File.separator + specificationModelsFolder;
	}
	
	public String getSpecificationModelsFolder() {
		return specificationModelsFolder;
	}

	public String getUmlProfilesFolderFull() {
		return getProjectFullPath() + File.separator + umlProfilesFolder;
	}

	public static String getUmlprofilesfolder() {
		return umlProfilesFolder;
	}
	
	public String getPaletteConfigurationsFolderFull() {
		return getProjectFullPath() + File.separator + paletteConfigurationsFolder;
	}
	
	public File getConfigFile(String fileName) {
		File f = new File(projectFolder + File.separator+projectURI+File.separator + fileName);
		return f;
	}

	public Set<File> getJavaCustomFolders() {
		HashSet<File> res = new HashSet<>(javaSourceFolders.size());
		for (String folder : javaSourceFolders) {
			File f = new File(projectFolder + File.separator+projectURI+File.separator + folder);
			res.add(f);
		}
		return res;
	}

	
	public String getEcoreFilePath() {
		File fEcore = new File(getUmlProfilesFolderFull()+File.separator+projectName+".ecore");
		if(fEcore.exists())
			return fEcore.getAbsolutePath();
		else {
			File folder = new File(getUmlProfilesFolderFull());
			File[] fs = folder.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".ecore");
				}
			});
			LOGGER.warning("Ecore file '"+fEcore.getName()+"' not found.");
			if(fs.length > 0) {
				LOGGER.warning("Ecore file '"+fs[0]+"' used instead.");
				return fs[0].getAbsolutePath();
			}
			return "";
		}
	}

	/**
	 * WARNING. "to lower case" as for the GlossaryML project, genmodel in lower case.
	 * @return
	 */
	public String getGenmodelFilePath() {
		File fEcore = new File(getUmlProfilesFolderFull()+File.separator+projectName.toLowerCase()+".genmodel");
		return fEcore.getAbsolutePath();
	}

	/**
	 * @deprecated
	 * @return
	 */
	public HashMap<String, String> getUmlProfileFiles() {
		HashMap<String, String> res = new HashMap<>(3);
		res.put("uml", getUmlProfilesFolderFull() + File.separator + getProjectName() + ".profile.uml");
		res.put("di", getUmlProfilesFolderFull() + File.separator + getProjectName() + ".profile.di");
		res.put("notation", getUmlProfilesFolderFull() + File.separator + getProjectName() +  ".profile.notation");
		res.put("ecore", getUmlProfilesFolderFull() + File.separator + getProjectName() + ".ecore");
		res.put("genmodel", getUmlProfilesFolderFull() + File.separator + getProjectName().toLowerCase() + ".genmodel");
		return res;
	}
	
	/**
	 * @deprecated
	 * @return
	 */
	public HashMap<String, String> getToolReqModelFiles(){
		HashMap<String, String> res = new HashMap<>(3);
		res.put("uml", getSpecificationModelsFolderFull() + File.separator + getProjectName() + TOOL_REQ_MODEL_SUFFIX + ".uml");
		res.put("di", getSpecificationModelsFolderFull() + File.separator + getProjectName() + TOOL_REQ_MODEL_SUFFIX + ".di");
		res.put("notation", getSpecificationModelsFolderFull() + File.separator + getProjectName() + TOOL_REQ_MODEL_SUFFIX + ".notation");
		return res;
	}
	
	/**
	 * @deprecated
	 * @return
	 */
	public HashMap<String, String> getDomainModelFiles(){
		HashMap<String, String> res = new HashMap<>(3);
		res.put("uml", getSpecificationModelsFolderFull() + File.separator + getProjectName() + DOMAIN_MODEL_SUFFIX + ".uml");
		res.put("di", getSpecificationModelsFolderFull() + File.separator + getProjectName() + DOMAIN_MODEL_SUFFIX + ".di");
		res.put("notation", getSpecificationModelsFolderFull() + File.separator + getProjectName() + DOMAIN_MODEL_SUFFIX + ".notation");
		return res;
	}
	
	/**
	 * @deprecated
	 * @return
	 */
	public HashMap<String, String> getLanguageReqModelFiles(){
		HashMap<String, String> res = new HashMap<>(3);
		res.put("uml", getSpecificationModelsFolderFull() + File.separator + getProjectName() + LANGUAGE_REQ_SUFFIX + ".uml");
		res.put("di", getSpecificationModelsFolderFull() + File.separator + getProjectName() + LANGUAGE_REQ_SUFFIX + ".di");
		res.put("notation", getSpecificationModelsFolderFull() + File.separator + getProjectName() + LANGUAGE_REQ_SUFFIX + ".notation");
		return res;
	}

	private static String RENDER_JSON = null;
	public static String renderSetupJSon() {
		if(RENDER_JSON == null) {
			
			String res = "\"setup\" : {" +
					"\"project.name\": \""+getInstance().getProjectName()+"\","+
					"\"project.folder\": \""+getInstance().getProjectFullPath()+"\","+
					"\"project.uri\": \""+getInstance().projectURI+"\"";
			
			@SuppressWarnings("deprecation")
			JSONParser parser = new JSONParser();
			try {
				JSONObject configJSon = (JSONObject) parser.parse(new FileReader(getInstance().getConfigurationFile().getAbsoluteFile()));
				res = "\"setup\" : " + configJSon.toJSONString();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

//			String resDep = "";
//			for (String d : getInstance().getProjectDependencies())
//				resDep += "\"" + Utils.cleanUrlsForJson(d) + "\",\n";
//			if (!resDep.isBlank())
//				resDep = resDep.substring(0, resDep.length() - 2);
//			resDep = ",\"dependencies\": [" + resDep + "]";
//
//			res += resDep;

			RENDER_JSON = res + "";
		}
		return RENDER_JSON;
	}

	public File getClusteringSetupLocation() {
		return clusteringSetupLocation;
	}
	
	ClusteringSetup clusteringSetup;
	
	public ClusteringSetup getClusteringSetup() {
		if(clusteringSetup == null)
			clusteringSetup = new ClusteringSetup(clusteringSetupLocation);
		return clusteringSetup;
	}

}
