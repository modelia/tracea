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
package tracea.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artefact Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.ArtefactFragment#getSubFragment <em>Sub Fragment</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getArtefactFragment()
 * @model abstract="true"
 * @generated
 */
public interface ArtefactFragment extends TrustableElement {
	/**
	 * Returns the value of the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.core.ArtefactFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Fragment</em>' containment reference list.
	 * @see tracea.core.CorePackage#getArtefactFragment_SubFragment()
	 * @model type="tracea.core.ArtefactFragment" containment="true"
	 * @generated
	 */
	EList getSubFragment();

} // ArtefactFragment
