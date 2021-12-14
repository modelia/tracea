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
package tracea;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.Tracea#getTraces <em>Traces</em>}</li>
 *   <li>{@link tracea.Tracea#getArtefacts <em>Artefacts</em>}</li>
 *   <li>{@link tracea.Tracea#getReferees <em>Referees</em>}</li>
 *   <li>{@link tracea.Tracea#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tracea.TraceaPackage#getTracea()
 * @model
 * @generated
 */
public interface Tracea extends EObject {
	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.core.Trace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see tracea.TraceaPackage#getTracea_Traces()
	 * @model type="tracea.core.Trace" containment="true"
	 * @generated
	 */
	EList getTraces();

	/**
	 * Returns the value of the '<em><b>Artefacts</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.core.Artefact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefacts</em>' containment reference list.
	 * @see tracea.TraceaPackage#getTracea_Artefacts()
	 * @model type="tracea.core.Artefact" containment="true"
	 * @generated
	 */
	EList getArtefacts();

	/**
	 * Returns the value of the '<em><b>Referees</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.core.Referee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referees</em>' containment reference list.
	 * @see tracea.TraceaPackage#getTracea_Referees()
	 * @model type="tracea.core.Referee" containment="true"
	 * @generated
	 */
	EList getReferees();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tracea.TraceaPackage#getTracea_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tracea.Tracea#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Tracea
