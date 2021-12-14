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

import tracea.core.Artefact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.ModelArtefact#getModelfragments <em>Modelfragments</em>}</li>
 * </ul>
 *
 * @see tracea.granularity.GranularityPackage#getModelArtefact()
 * @model
 * @generated
 */
public interface ModelArtefact extends Artefact {
	/**
	 * Returns the value of the '<em><b>Modelfragments</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.ModelFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelfragments</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getModelArtefact_Modelfragments()
	 * @model type="tracea.granularity.ModelFragment" containment="true"
	 * @generated
	 */
	EList getModelfragments();

} // ModelArtefact
