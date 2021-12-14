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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trustable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.TrustableElement#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link tracea.core.TrustableElement#getReferees <em>Referees</em>}</li>
 *   <li>{@link tracea.core.TrustableElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getTrustableElement()
 * @model abstract="true"
 * @generated
 */
public interface TrustableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(String)
	 * @see tracea.core.CorePackage#getTrustableElement_TimeStamp()
	 * @model
	 * @generated
	 */
	String getTimeStamp();

	/**
	 * Sets the value of the '{@link tracea.core.TrustableElement#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(String value);

	/**
	 * Returns the value of the '<em><b>Referees</b></em>' reference list.
	 * The list contents are of type {@link tracea.core.Referee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referees</em>' reference list.
	 * @see tracea.core.CorePackage#getTrustableElement_Referees()
	 * @model type="tracea.core.Referee"
	 * @generated
	 */
	EList getReferees();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tracea.core.CorePackage#getTrustableElement_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tracea.core.TrustableElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TrustableElement
