package com.cea.papyrus.referencemanagement;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import ReferenceML.ReferenceLibrary;
import ReferenceML.Collection;

public class ReferenceLibraryDerivedOperationImpl {
	
	/**
	 * This operation implements the derived attribute collections of the stereotype <<ReferenceLibrary>>.
	 */
	public static EList<Collection> getCollections(final ReferenceLibrary pReferenceLibrary) {
		EList<Collection> collection_list = new BasicEList<>();
		Iterator<PackageableElement> it = pReferenceLibrary.getBase_Model().getPackagedElements().iterator();
		while (it.hasNext()) {
			PackageableElement p = it.next();
			if (UMLUtil.getStereotypeApplication(p, Collection.class) != null) {
				collection_list.add(UMLUtil.getStereotypeApplication(p, Collection.class));
			}
		}
		return collection_list;
	}

}
