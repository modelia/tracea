/*****************************************************************************

* Copyright (c) 2015, 2018 CEA LIST, Edouard Batot

*

* All rights reserved. This program and the accompanying materials

* are made available under the terms of the Eclipse Public License 2.0

* which accompanies this distribution, and is available at

* https://www.eclipse.org/legal/epl-2.0/

*

* SPDX-License-Identifier: EPL-2.0

*

* Contributors:

* CEA LIST - Initial API and implementation

* Edouard Batot (UOC SOM) ebatot@uoc.edu 

*****************************************************************************/


package metadev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;

public class CopyrightSpreader {
	public static void printLOC(){
		int[] i;
		try {
			i = countLOC(new File("./src"));
			System.out.println("Main.main(src:"+i[0]+") ("+i[1]+" classes)");
//			i = countLOC(new File("./test"));
//			System.out.println("Main.main(test:"+i[0]+")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static int[] countLOC(File f) throws IOException {
		int[] res = new int[] {0, 0};
		if(f.getName().endsWith(".java"))
			res[1]++;
		if(f.getName().startsWith("result"))
			return res;
		if(f.isDirectory()){
			for (File f2 : f.listFiles()) {
				res[0] += countLOC(f2)[0];
				res[1] += countLOC(f2)[1];
			}
//			System.out.println("Dir:"+f.getCanonicalPath()+" : "+res);
		} else {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = "";
			while((line = br.readLine()) != null){
				if(!line.isEmpty())
					res[0]++;
			}
			br.close();
//			System.out.println(f.getCanonicalPath()+" : "+res);
		}
		return res;
	}
	
	private static void addLicensesToAllFiles() throws IOException {
		addLicensesFileAndSubfiles(new File("./src"));
	}

	private static void addLicensesFileAndSubfiles(File f) throws IOException {
		if(f.getName().endsWith(".java")) {
			System.out.println("Lic. added: "+f.getAbsolutePath());
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = "";
			boolean fileHasLicense = false;
			int i = 0;
			
			while((line = br.readLine()) != null && i++ < 10){
				if(!line.isEmpty()) {
					if(line.trim().startsWith("/*****************************************************************************\r\n"
							+ "					+ \"\\r\\n\"\r\n"
							+ "					+ \"* Copyright (c) 2015, 2018 CEA LIST, Edouard Batot.\r\n\""))
						fileHasLicense = true;
				}
					
			}
			br.close();
			if(!fileHasLicense)
				prependPrefix(f, "/*****************************************************************************\r\n"
					+ "\r\n"
					+ "* Copyright (c) 2015, 2018 CEA LIST, Edouard Batot\r\n"
					+ "\r\n"
					+ "*\r\n"
					+ "\r\n"
					+ "* All rights reserved. This program and the accompanying materials\r\n"
					+ "\r\n"
					+ "* are made available under the terms of the Eclipse Public License 2.0\r\n"
					+ "\r\n"
					+ "* which accompanies this distribution, and is available at\r\n"
					+ "\r\n"
					+ "* https://www.eclipse.org/legal/epl-2.0/\r\n"
					+ "\r\n"
					+ "*\r\n"
					+ "\r\n"
					+ "* SPDX-License-Identifier: EPL-2.0\r\n"
					+ "\r\n"
					+ "*\r\n"
					+ "\r\n"
					+ "* Contributors:\r\n"
					+ "\r\n"
					+ "* CEA LIST - Initial API and implementation\r\n"
					+ "\r\n"
					+ "* Edouard Batot (UOC SOM) ebatot@uoc.edu \r\n"
					+ "\r\n"
					+ "*****************************************************************************/\n\n\n");
		}
		if(f.isDirectory()){
			for (File f2 : f.listFiles()) {
				addLicensesFileAndSubfiles(f2);
			}
		} 
	}
	
	public static void prependPrefix(File input, String prefix) throws IOException {
	    LineIterator li = FileUtils.lineIterator(input);
	    File tempFile = File.createTempFile("prependPrefix", ".tmp");
	    BufferedWriter w = new BufferedWriter(new FileWriter(tempFile));
	    try {
	        w.write(prefix);
	        while (li.hasNext()) {
	            w.write(li.next());
	            w.write("\n");
	        }
	    } finally {
	        IOUtils.closeQuietly(w);
	        LineIterator.closeQuietly(li);
	    }
	    FileUtils.deleteQuietly(input);
	    FileUtils.moveFile(tempFile, input);
	}
	
	public static void main(String[] args) throws IOException {
		addLicensesToAllFiles();
	}

}
