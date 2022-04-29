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
