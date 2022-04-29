package edu.uoc.som.orchestrus.tracemodel.typing;

import java.util.Collection;
import java.util.HashMap;

public class ArtefactTypeFactory {

	public static final ArtefactType EXTERNAL_FILE_ARTEFACT = getType("ExternalFile");
	public static final ArtefactType EXTERNAL_LOCATION_ARTEFACT = getType("ExternalLocation");
	public static final ArtefactType EXTERNAL_ROOT_ARTEFACT = getType("ExternalRoot");
	public static final ArtefactType LOCAL_FILE_ARTEFACT = getType("LocalFile");
	public static final ArtefactType SOURCE_FILE_ARTEFACT = getType("SourceFile");
	public static final ArtefactType LOCAL_FOLDER_ARTEFACT = getType("LocalFolder");
	public static final ArtefactType LOCAL_ROOT_ARTEFACT = getType("LocalRoot");
	public static final ArtefactType ELEMENT_ARTEFACT = getType("Element");
	public static final ArtefactType CUSTOM_JAVA_FOLDER_ARTEFACT =  getType("JavaFolder");
	public static final ArtefactType CUSTOM_JAVA_FILE_ARTEFACT =  getType("JavaFile");
	
	public static final ArtefactType GHOST_TYPE_FOR_DEV =  getType("DEV_TYPE");

	static ArtefactTypeFactory instance;

	public static ArtefactTypeFactory getInstance() {
		if (instance == null)
			instance = new ArtefactTypeFactory();
		return instance;
	}

	HashMap<String, ArtefactType> types = new HashMap<>();

	public static ArtefactType getType(String typeName) {
		ArtefactType add = getInstance().getTypes().get(typeName);
		if(add == null) {
			add = new ArtefactType(typeName);
			getInstance().getTypes().put(typeName, add);
		}
		return add;
	}
	
	public Collection<ArtefactType> getTypesValues() {
		return types.values();
	}

	public HashMap<String, ArtefactType> getTypes() {
		return types;
	}

	public static int getD3Size(ArtefactType type) {
		if(type == LOCAL_ROOT_ARTEFACT)
			return 100;
		if(type == LOCAL_FOLDER_ARTEFACT)
			return 34;
		if(type == LOCAL_FILE_ARTEFACT)
			return 38;
		if(type == SOURCE_FILE_ARTEFACT)
			return 38;
		if(type == EXTERNAL_LOCATION_ARTEFACT)
			return 30;
		if(type == EXTERNAL_FILE_ARTEFACT)
			return 34;
		if(type == ELEMENT_ARTEFACT)
			return 42;
		throw new IllegalArgumentException("Unrecognized type:" + type);
		
	}
}
