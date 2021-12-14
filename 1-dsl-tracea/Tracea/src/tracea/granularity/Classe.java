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


/**
 */
package tracea.granularity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.Classe#getStructuralfeatures <em>Structuralfeatures</em>}</li>
 * </ul>
 *
 * @see tracea.granularity.GranularityPackage#getClasse()
 * @model
 * @generated
 */
public interface Classe extends ModelFragment {
	/**
	 * Returns the value of the '<em><b>Structuralfeatures</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.StructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structuralfeatures</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getClasse_Structuralfeatures()
	 * @model type="tracea.granularity.StructuralFeature" containment="true"
	 * @generated
	 */
	EList getStructuralfeatures();

} // Classe
