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
package tracea.relationtyping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.relationtyping.TypedRelationship#getRelationshiptype <em>Relationshiptype</em>}</li>
 * </ul>
 *
 * @see tracea.relationtyping.RelationtypingPackage#getTypedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface TypedRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationshiptype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationshiptype</em>' containment reference.
	 * @see #setRelationshiptype(RelationshipType)
	 * @see tracea.relationtyping.RelationtypingPackage#getTypedRelationship_Relationshiptype()
	 * @model containment="true"
	 * @generated
	 */
	RelationshipType getRelationshiptype();

	/**
	 * Sets the value of the '{@link tracea.relationtyping.TypedRelationship#getRelationshiptype <em>Relationshiptype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationshiptype</em>' containment reference.
	 * @see #getRelationshiptype()
	 * @generated
	 */
	void setRelationshiptype(RelationshipType value);

} // TypedRelationship
