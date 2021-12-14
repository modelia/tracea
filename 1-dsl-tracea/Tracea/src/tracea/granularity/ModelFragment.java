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

import tracea.core.ArtefactFragment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.ModelFragment#getNamedelementsDefined <em>Namedelements Defined</em>}</li>
 *   <li>{@link tracea.granularity.ModelFragment#getNamedelementsUsed <em>Namedelements Used</em>}</li>
 * </ul>
 *
 * @see tracea.granularity.GranularityPackage#getModelFragment()
 * @model
 * @generated
 */
public interface ModelFragment extends ArtefactFragment {
	/**
	 * Returns the value of the '<em><b>Namedelements Defined</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namedelements Defined</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getModelFragment_NamedelementsDefined()
	 * @model type="tracea.granularity.NamedElement" containment="true"
	 * @generated
	 */
	EList getNamedelementsDefined();

	/**
	 * Returns the value of the '<em><b>Namedelements Used</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namedelements Used</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getModelFragment_NamedelementsUsed()
	 * @model type="tracea.granularity.NamedElement" containment="true"
	 * @generated
	 */
	EList getNamedelementsUsed();

} // ModelFragment
