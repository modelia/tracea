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


package edu.uoc.som.orchestrus.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class BasicFormatter extends Formatter {
	
	
	@Override
	public String format(LogRecord record) {
		Date d = new Date(record.getMillis());
		SimpleDateFormat f3 = new SimpleDateFormat("H:m:s", Locale.FRANCE);
		
		String sourceClassName = record.getSourceClassName();
		if(sourceClassName.contains("."))
			sourceClassName = sourceClassName.substring("edu.uoc.som.orchestrus.".length());
		
		
		
		String lvl = "";
		String key = record.getLevel().getName();
		switch (key) {
		case "SEVERE":
			lvl = " ! Attention ! ";
			break;
		case "WARNING":
			lvl = " (!) ";
			break;
		case "CONFIG":
			lvl = "c ";
			break;
		case "FINE":
			lvl = "F ";
			break;
		case "FINER":
			lvl = "F1 ";
			break;
		case "FINEST":
			lvl = "F2 ";
			break;

		default:
			break;
		}
		
		return "["+f3.format(d)+"] "+lvl + ": "
	            + sourceClassName + "."
	            + record.getSourceMethodName() + ": "
	            + record.getMessage() + "\n";
	}
	
}
