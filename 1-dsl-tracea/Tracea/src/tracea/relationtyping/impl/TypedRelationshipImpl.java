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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tracea.relationtyping.RelationshipType;
import tracea.relationtyping.RelationtypingPackage;
import tracea.relationtyping.TypedRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracea.relationtyping.impl.TypedRelationshipImpl#getRelationshiptype <em>Relationshiptype</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypedRelationshipImpl extends MinimalEObjectImpl.Container implements TypedRelationship {
	/**
	 * The cached value of the '{@link #getRelationshiptype() <em>Relationshiptype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshiptype()
	 * @generated
	 * @ordered
	 */
	protected RelationshipType relationshiptype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RelationtypingPackage.Literals.TYPED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType getRelationshiptype() {
		return relationshiptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationshiptype(RelationshipType newRelationshiptype, NotificationChain msgs) {
		RelationshipType oldRelationshiptype = relationshiptype;
		relationshiptype = newRelationshiptype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationtypingPackage.TYPED_RELATIONSHIP__RELATIONSHIPTYPE, oldRelationshiptype, newRelationshiptype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshiptype(RelationshipType newRelationshiptype) {
		if (newRelationshiptype != relationshiptype) {
			NotificationChain msgs = null;
			if (relationshiptype != null)
				msgs = ((InternalEObject)relationshiptype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RelationtypingPackage.TYPED_RELATIONSHIP__RELATIONSHIPTYPE, null, msgs);
			if (newRelationshiptype != null)
				msgs = ((InternalEObject)newRelationshiptype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RelationtypingPackage.TYPED_RELATIONSHIP__RELATIONSHIPTYPE, null, msgs);
			msgs = basicSetRelationshiptype(newRelationshiptype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationtypingPackage.TYPED_RELATIONSHIP__RELATIONSHIPTYPE, newRelationshiptype, newRelationshiptype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationtypingPackage.TYPED_RELATIONSHIP__RELATIONSHIPTYPE:
				return basicSetRelationshiptype(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationtypingPackage.TYPED_RELATIONSHIP__RELATIONSHIPTYPE:
				return getRelationshiptype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RelationtypingPackage.TYPED_RELATIONSHIP__RELATIONSHIPTYPE:
				setRelationshiptype((RelationshipType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case RelationtypingPackage.TYPED_RELATIONSHIP__RELATIONSHIPTYPE:
				setRelationshiptype((RelationshipType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RelationtypingPackage.TYPED_RELATIONSHIP__RELATIONSHIPTYPE:
				return relationshiptype != null;
		}
		return super.eIsSet(featureID);
	}

} //TypedRelationshipImpl
