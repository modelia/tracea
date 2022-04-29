package edu.uoc.som.orchestrus.parsing.spec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.uoc.som.orchestrus.parsing.SpecificFileReferenceExtractor;
import edu.uoc.som.orchestrus.utils.Utils;

public class JavaFile extends SpecificFileReferenceExtractor {

	public final static Logger LOGGER = Logger.getLogger(JavaFile.class.getName());

	String REGX_FOR_HC_STRINGS = "\"(?:\\\\\"|[^\"])*?\"";
	String REGX_FOR_REFERENCE = "\"(\\w+:\\/)?[\\w+\\.\\/\\\\\\-_]+(#)?[\\w+\\/\\\\@\\-_]*\"";
	private String packagePath = null;
	private ArrayList<String> importStrings = null;
	private ArrayList<HardcodedString> hcStrings = null;

	public enum ACCEPT_STRINGS {
		ALL, NONE, REGEX, UX;
	};
	ACCEPT_STRINGS acceptsStringsMethod = ACCEPT_STRINGS.REGEX;

	private String name;

	public class HardcodedString {
		public HardcodedString(String s, File sourceFile, int lineNumber, int iStart, int iEnd) {
			this.string = s;
			this.lineNumber = lineNumber;
			this.iStart = iStart;
			this.iEnd = iEnd;
		}
		
		String string;
		int lineNumber, iStart, iEnd;
		
		public String getString() {
			return string;
		}
		
		@Override
		public String toString() {
			return "hsStr("+string+")";
		}
	}

	public String getPackagePath() {
		return packagePath;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return packagePath + "." + f.getName();
	}

	public JavaFile(File f) {
		super(f);
		name = f.getName().substring(0, f.getName().lastIndexOf("."));
		packagePath = getPackage();
		hcStrings = getHCStrings();
		importStrings = getImportStrings();
	}

	private ArrayList<HardcodedString> getHCStrings() {
		if (hcStrings == null) {
			hcStrings = new ArrayList<>();
			for (HardcodedString hcString : parseFileAndMatchHardCodedStrings()) {

				switch (acceptsStringsMethod) {
				case ALL:
					hcStrings.add(hcString);
					break;

				case NONE:
					break;

				case REGEX:
					// TODO automate uri recognition ?
					// TODO build a "known stack" for uris. parametered with Regex ???
					boolean b1 = Pattern.matches(REGX_FOR_REFERENCE, hcString.getString());
					if (b1) {
						hcStrings.add(hcString);
						LOGGER.finer(hcString.getString() + " matched !");
					} else {
						LOGGER.warning("'" + hcString.getString() + "' did not match as a reference.");
					}
					break;

				case UX:
					boolean b = Utils.askYesNpQuestionToUser("Keep string: " + hcString + "  ?");
					if (b) {
						hcStrings.add(hcString);
						LOGGER.finest(hcString + " included.");
						System.out.println(" -> Included.");
					} else {
						LOGGER.finest(hcString + " refused.");
						System.out.println(" -> Refused.");
					}
					break;

				default:
					throw new IllegalAccessError("Unrecognized ACCEPT_STRING method: " + acceptsStringsMethod);
				}
			}
			LOGGER.fine(hcStrings.size() + " hardcoded strings found in '" + getFilePath() + "'");
			LOGGER.fine("  Acceptance method is: " + acceptsStringsMethod);
		}
		return hcStrings;
	}

	private ArrayList<String> getImportStrings() {
		if (importStrings == null) {
			importStrings = new ArrayList<>();
			for (String iString : parseFileAndMatchImports()) {
				importStrings.add(iString);
			}
			LOGGER.fine(importStrings.size() + " imports found in '" + getFilePath() + "'");
		}
		return importStrings;
	}

	public String getPackage() {
		if (packagePath == null) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(f));
				String line;
				boolean notFound = true;
				while ((line = br.readLine()) != null && notFound) {
					if (line.trim().startsWith("package")) {
						packagePath = line.split(" ")[1]; // import package.path
						packagePath = packagePath.substring(0, packagePath.length() - 1); // Remove ';'
						LOGGER.finest("Package: " + packagePath);
						notFound = false;
						break;
					}
				}
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return packagePath;
	}

	private ArrayList<HardcodedString> parseFileAndMatchHardCodedStrings() {
		ArrayList<HardcodedString> strings = new ArrayList<>();
		try {
//			String fContent = readFile(f.getAbsolutePath(), Charset.defaultCharset());
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line;
			int i = 1;
			while ((line = br.readLine()) != null) {
				Pattern pattern = Pattern.compile(REGX_FOR_HC_STRINGS);
				Matcher matcher = pattern.matcher(line);
				while (matcher.find()) {
					String s = matcher.group();
					int iStart = matcher.start();
					int iEnd = matcher.end();
					HardcodedString hcString = new HardcodedString(s, f, i, iStart, iEnd);
					strings.add(hcString);
					LOGGER.finest(hcString.toString());
				}
				i++;
			}
			br.close();
		} catch (IOException e) {
			LOGGER.warning("Could not read file '" + f.getAbsolutePath() + "'");
			e.printStackTrace();
		}
		return strings;
	}

	private ArrayList<String> parseFileAndMatchImports() {
		ArrayList<String> strings = new ArrayList<>();
		try {
//			String fContent = readFile(f.getAbsolutePath(), Charset.defaultCharset());
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("import")) {
					String importString = line.split(" ")[1]; // import package.name
					importString = importString.substring(0, importString.length() - 1); // remove ';'
					LOGGER.finest("import: " + importString);
					strings.add(importString);
				} else if (line.startsWith("public class"))
					break;
			}
			br.close();
		} catch (IOException e) {
			LOGGER.warning("Could not read file '" + f.getAbsolutePath() + "'");
			e.printStackTrace();
		}
		return strings;
	}

	@Override
	public String getHRefJSon() {
		String res = "";

		res += "  \"package\": \"" + packagePath + "\",\n";

		String tmpRes = "";
		for (HardcodedString hcString : hcStrings)
			tmpRes += hcString.getString() + ",\n";
		tmpRes = tmpRes.trim();
		if (!tmpRes.isBlank())
			tmpRes = tmpRes.substring(0, tmpRes.length() - 1);
		res += "  \"hardCodedStrings\": [" + tmpRes + "],\n";

		tmpRes = "";
		for (String is : importStrings) {
			tmpRes += "\"" + is + "\",\n";
		}
		tmpRes = tmpRes.trim();
		if (!tmpRes.isBlank())
			tmpRes = tmpRes.substring(0, tmpRes.length() - 1);
		res += "  \"imports\": [" + tmpRes + "]\n";
		;

		return "{" + res + "}";
	}

}
