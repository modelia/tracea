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
package tracea.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tracea.core.ArtefactFragment;
import tracea.core.CorePackage;
import tracea.core.TraceLink;

import tracea.relationtyping.RelationshipType;
import tracea.relationtyping.RelationtypingPackage;
import tracea.relationtyping.TypedRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.impl.TraceLinkImpl#getRelationshiptype <em>Relationshiptype</em>}</li>
 *   <li>{@link tracea.core.impl.TraceLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link tracea.core.impl.TraceLinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TraceLinkImpl extends TrustableElementImpl implements TraceLink {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ArtefactFragment source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ArtefactFragment target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.TRACE_LINK;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TRACE_LINK__RELATIONSHIPTYPE, oldRelationshiptype, newRelationshiptype);
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
				msgs = ((InternalEObject)relationshiptype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.TRACE_LINK__RELATIONSHIPTYPE, null, msgs);
			if (newRelationshiptype != null)
				msgs = ((InternalEObject)newRelationshiptype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.TRACE_LINK__RELATIONSHIPTYPE, null, msgs);
			msgs = basicSetRelationshiptype(newRelationshiptype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRACE_LINK__RELATIONSHIPTYPE, newRelationshiptype, newRelationshiptype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactFragment getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ArtefactFragment)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TRACE_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactFragment basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ArtefactFragment newSource) {
		ArtefactFragment oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRACE_LINK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactFragment getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ArtefactFragment)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TRACE_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactFragment basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ArtefactFragment newTarget) {
		ArtefactFragment oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRACE_LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TRACE_LINK__RELATIONSHIPTYPE:
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
			case CorePackage.TRACE_LINK__RELATIONSHIPTYPE:
				return getRelationshiptype();
			case CorePackage.TRACE_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CorePackage.TRACE_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case CorePackage.TRACE_LINK__RELATIONSHIPTYPE:
				setRelationshiptype((RelationshipType)newValue);
				return;
			case CorePackage.TRACE_LINK__SOURCE:
				setSource((ArtefactFragment)newValue);
				return;
			case CorePackage.TRACE_LINK__TARGET:
				setTarget((ArtefactFragment)newValue);
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
			case CorePackage.TRACE_LINK__RELATIONSHIPTYPE:
				setRelationshiptype((RelationshipType)null);
				return;
			case CorePackage.TRACE_LINK__SOURCE:
				setSource((ArtefactFragment)null);
				return;
			case CorePackage.TRACE_LINK__TARGET:
				setTarget((ArtefactFragment)null);
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
			case CorePackage.TRACE_LINK__RELATIONSHIPTYPE:
				return relationshiptype != null;
			case CorePackage.TRACE_LINK__SOURCE:
				return source != null;
			case CorePackage.TRACE_LINK__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TypedRelationship.class) {
			switch (derivedFeatureID) {
				case CorePackage.TRACE_LINK__RELATIONSHIPTYPE: return RelationtypingPackage.TYPED_RELATIONSHIP__RELATIONSHIPTYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == TypedRelationship.class) {
			switch (baseFeatureID) {
				case RelationtypingPackage.TYPED_RELATIONSHIP__RELATIONSHIPTYPE: return CorePackage.TRACE_LINK__RELATIONSHIPTYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TraceLinkImpl
