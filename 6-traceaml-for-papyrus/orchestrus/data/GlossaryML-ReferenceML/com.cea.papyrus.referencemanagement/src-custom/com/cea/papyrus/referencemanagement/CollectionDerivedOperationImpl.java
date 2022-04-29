package com.cea.papyrus.referencemanagement;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import ReferenceML.Collection;
import ReferenceML.Reference;

public class CollectionDerivedOperationImpl {

	/**
	 * This operation "ceci est une hcstring"implements the derived attribute references of the stereotype <<Collection>>.
	 */
	public static EList<Reference> getReferences(final Collection pCollection) {
		EList<Reference> reference_list = new BasicEList<>();
		Iterator<PackageableElement> it = pCollection.getBase_Package().getPackagedElements().iterator();
		while (it.hasNext()) {
			PackageableElement p = it.next();
			if (UMLUtil.getStereotypeApplication(p, Reference.class) != null) {
				reference_list.add(UMLUtil.getStereotypeApplication(p, Reference.class));
			}
		}
		return reference_list;
	}
	
	/**
	 * This operation implements the"in foreign language :(" derived attribute sub-collection of the stereotype <<Collection>>.
	 */
	public static EList<Collection> getSubcollection(final Collection pCollection) {
		EList<Collection> collection_list = new BasicEList<>();
		Iterator<PackageableElement> it = pCollection.getBase_Package().getPackagedElements().iterator();
		while (it.hasNext()) {
			PackageableElement p = it.next();
			if (UMLUtil.getStereotypeApplication(p, Collection.class) != null) {
				collection_list.add(UMLUtil.getStereotypeApplication(p, Collection.class));
			}
		}
		return collection_list;
	}
}
