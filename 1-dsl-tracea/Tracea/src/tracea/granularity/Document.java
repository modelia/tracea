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
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.Document#getSections <em>Sections</em>}</li>
 *   <li>{@link tracea.granularity.Document#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see tracea.granularity.GranularityPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends TextArtefact {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getDocument_Sections()
	 * @model type="tracea.granularity.Section" containment="true"
	 * @generated
	 */
	EList getSections();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see tracea.granularity.GranularityPackage#getDocument_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link tracea.granularity.Document#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Document
