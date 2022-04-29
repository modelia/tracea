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


package edu.uoc.som.orchestrus.tracemodel;

import java.util.ArrayList;
import java.util.Collection;

public class TraceUtils {
	public static ArrayList<String> getElementsIDs(Collection<? extends TracingElement> tes){
		ArrayList<String> res = new ArrayList<>(tes.size());
		for (TracingElement te : tes) 
			res.add(te.getID());
		return res;
	}
	
	public static String getElementsIDsAsJsonCollection(Collection<? extends TracingElement> tes){
		String res = "[";
		for (TracingElement te : tes) 
			res += "\""+te.getID()+"\"," ;
		return (res.length()>1?res.substring(0,res.length()-1):res)+"]";
	}

}
