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
package tracea.relationtyping.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tracea.relationtyping.RelationshipType;
import tracea.relationtyping.RelationtypingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class RelationshipTypeImpl extends MinimalEObjectImpl.Container implements RelationshipType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RelationtypingPackage.Literals.RELATIONSHIP_TYPE;
	}

} //RelationshipTypeImpl
