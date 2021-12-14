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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.Referee#getName <em>Name</em>}</li>
 *   <li>{@link tracea.core.Referee#getTrustableElements <em>Trustable Elements</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getReferee()
 * @model
 * @generated
 */
public interface Referee extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tracea.core.CorePackage#getReferee_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tracea.core.Referee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Trustable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trustable Elements</em>' reference.
	 * @see #setTrustableElements(TrustableElement)
	 * @see tracea.core.CorePackage#getReferee_TrustableElements()
	 * @model
	 * @generated
	 */
	TrustableElement getTrustableElements();

	/**
	 * Sets the value of the '{@link tracea.core.Referee#getTrustableElements <em>Trustable Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trustable Elements</em>' reference.
	 * @see #getTrustableElements()
	 * @generated
	 */
	void setTrustableElements(TrustableElement value);

} // Referee
