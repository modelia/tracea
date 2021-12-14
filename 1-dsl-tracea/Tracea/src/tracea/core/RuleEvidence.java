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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.RuleEvidence#getRule <em>Rule</em>}</li>
 *   <li>{@link tracea.core.RuleEvidence#getExecutionDate <em>Execution Date</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getRuleEvidence()
 * @model
 * @generated
 */
public interface RuleEvidence extends Evidence {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' attribute.
	 * @see #setRule(String)
	 * @see tracea.core.CorePackage#getRuleEvidence_Rule()
	 * @model
	 * @generated
	 */
	String getRule();

	/**
	 * Sets the value of the '{@link tracea.core.RuleEvidence#getRule <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' attribute.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(String value);

	/**
	 * Returns the value of the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Date</em>' attribute.
	 * @see #setExecutionDate(Date)
	 * @see tracea.core.CorePackage#getRuleEvidence_ExecutionDate()
	 * @model
	 * @generated
	 */
	Date getExecutionDate();

	/**
	 * Sets the value of the '{@link tracea.core.RuleEvidence#getExecutionDate <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Date</em>' attribute.
	 * @see #getExecutionDate()
	 * @generated
	 */
	void setExecutionDate(Date value);

} // RuleEvidence
