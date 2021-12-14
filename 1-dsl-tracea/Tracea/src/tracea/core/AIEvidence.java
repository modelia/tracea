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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.AIEvidence#getAlgorithmUsed <em>Algorithm Used</em>}</li>
 *   <li>{@link tracea.core.AIEvidence#getParameters <em>Parameters</em>}</li>
 *   <li>{@link tracea.core.AIEvidence#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link tracea.core.AIEvidence#getPrecision <em>Precision</em>}</li>
 *   <li>{@link tracea.core.AIEvidence#getRecall <em>Recall</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getAIEvidence()
 * @model
 * @generated
 */
public interface AIEvidence extends Evidence {
	/**
	 * Returns the value of the '<em><b>Algorithm Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Used</em>' attribute.
	 * @see #setAlgorithmUsed(String)
	 * @see tracea.core.CorePackage#getAIEvidence_AlgorithmUsed()
	 * @model
	 * @generated
	 */
	String getAlgorithmUsed();

	/**
	 * Sets the value of the '{@link tracea.core.AIEvidence#getAlgorithmUsed <em>Algorithm Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Used</em>' attribute.
	 * @see #getAlgorithmUsed()
	 * @generated
	 */
	void setAlgorithmUsed(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see tracea.core.CorePackage#getAIEvidence_Parameters()
	 * @model
	 * @generated
	 */
	EList getParameters();

	/**
	 * Returns the value of the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Date</em>' attribute.
	 * @see #setExecutionDate(Date)
	 * @see tracea.core.CorePackage#getAIEvidence_ExecutionDate()
	 * @model
	 * @generated
	 */
	Date getExecutionDate();

	/**
	 * Sets the value of the '{@link tracea.core.AIEvidence#getExecutionDate <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Date</em>' attribute.
	 * @see #getExecutionDate()
	 * @generated
	 */
	void setExecutionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(double)
	 * @see tracea.core.CorePackage#getAIEvidence_Precision()
	 * @model
	 * @generated
	 */
	double getPrecision();

	/**
	 * Sets the value of the '{@link tracea.core.AIEvidence#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(double value);

	/**
	 * Returns the value of the '<em><b>Recall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recall</em>' attribute.
	 * @see #setRecall(double)
	 * @see tracea.core.CorePackage#getAIEvidence_Recall()
	 * @model
	 * @generated
	 */
	double getRecall();

	/**
	 * Sets the value of the '{@link tracea.core.AIEvidence#getRecall <em>Recall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recall</em>' attribute.
	 * @see #getRecall()
	 * @generated
	 */
	void setRecall(double value);

} // AIEvidence
