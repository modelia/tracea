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
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.Section#getPartofspeechsDefined <em>Partofspeechs Defined</em>}</li>
 *   <li>{@link tracea.granularity.Section#getPartofspeechsUsed <em>Partofspeechs Used</em>}</li>
 *   <li>{@link tracea.granularity.Section#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see tracea.granularity.GranularityPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends TextFragment {
	/**
	 * Returns the value of the '<em><b>Partofspeechs Defined</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.PartOfSpeech}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partofspeechs Defined</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getSection_PartofspeechsDefined()
	 * @model type="tracea.granularity.PartOfSpeech" containment="true"
	 * @generated
	 */
	EList getPartofspeechsDefined();

	/**
	 * Returns the value of the '<em><b>Partofspeechs Used</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.PartOfSpeech}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partofspeechs Used</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getSection_PartofspeechsUsed()
	 * @model type="tracea.granularity.PartOfSpeech" containment="true"
	 * @generated
	 */
	EList getPartofspeechsUsed();

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see tracea.granularity.GranularityPackage#getSection_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link tracea.granularity.Section#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

} // Section
