package edu.uoc.som.orchestrus.parsing;

import java.io.File;
import java.io.FilenameFilter;

class XMILikeFileFilter implements FilenameFilter {

	static XMILikeFileFilter getFilter() {
		return new XMILikeFileFilter();
	}
	
	@Override
	public boolean accept(File dir, String fileName) {
	    return (
	    		//custom generation
	    		fileName.endsWith(".xmi") || 
	    		//specificatiion-models and profiles
	    		fileName.endsWith(".uml") || 
	    		fileName.endsWith(".notation") || 
	    		fileName.endsWith(".di") || 
	    		// profile
	    		fileName.endsWith(".ecore") || 
	    		fileName.endsWith(".genmodel") || 
	    		//architecture-framework
	    		fileName.endsWith(".architecture") || 
	    		//Editor and elementtype related
	    		fileName.endsWith(".creationmenumodel") ||
	    		fileName.endsWith(".elementtypesconfigurations") ||
	    		fileName.endsWith(".paletteconfiguration") ||
	    		fileName.endsWith(".ctx") ||
	    		//nattable
	    		fileName.endsWith(".nattableconfiguration") 
	    		);
	  }
}