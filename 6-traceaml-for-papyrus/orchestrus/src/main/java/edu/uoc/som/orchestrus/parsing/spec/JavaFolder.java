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


package edu.uoc.som.orchestrus.parsing.spec;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import edu.uoc.som.orchestrus.parsing.SpecificFileReferenceExtractor;
import edu.uoc.som.orchestrus.utils.Utils;

public class JavaFolder extends SpecificFileReferenceExtractor {

	public final static Logger LOGGER = Logger.getLogger(JavaFolder.class.getName());

	Set<JavaFile> javaFiles;

	public Set<JavaFile> getJavaFiles() {
		return javaFiles;
	}

	public JavaFolder(File folder) {
		super(folder);
		Set<File> files = listOfFiles(folder);
		javaFiles = new HashSet<JavaFile>(files.size());
		for (File f : files) {
			if (f.getName().endsWith(".java")) {
				JavaFile jf = new JavaFile(f);
				javaFiles.add(jf);
			}
		}
		LOGGER.fine(javaFiles.size() + " Java files found in '" + folder.getAbsolutePath() + "'.");
	}

	public static Set<File> listOfFiles(File dirPath) {
		Set<File> res = new HashSet<>();
		File filesList[] = dirPath.listFiles();
		for (File file : filesList) {
			if (file.isFile()) {
				res.add(file);
			} else {
				Set<File> subFoldersFiles = listOfFiles(file);
				res.addAll(subFoldersFiles);
			}
		}
		return res;
	}

	public Set<JavaFile> getClassFiles() {
		return javaFiles;
	}

	@Override
	public String getHRefJSon() {
		String res = "";

		String resTmp = "";
		for (JavaFile jf : javaFiles) {
			resTmp += "\"" + jf.getPackagePath() + "." + jf.getName() + "\" : \n" + jf.getHRefJSon() + ",\n";
		}
		if (!resTmp.isBlank())
			resTmp = resTmp.substring(0, resTmp.trim().length() - 1);

		res = "\"" + Utils.cleanUrlsForJson(f.getAbsolutePath()) + "\":{\n" + resTmp + "}";
		return "{" + res + "}";
	}

}
