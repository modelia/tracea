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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tracea.core.ArtefactFragment;
import tracea.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artefact Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.impl.ArtefactFragmentImpl#getSubFragment <em>Sub Fragment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArtefactFragmentImpl extends TrustableElementImpl implements ArtefactFragment {
	/**
	 * The cached value of the '{@link #getSubFragment() <em>Sub Fragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFragment()
	 * @generated
	 * @ordered
	 */
	protected EList subFragment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtefactFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.ARTEFACT_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubFragment() {
		if (subFragment == null) {
			subFragment = new EObjectContainmentEList(ArtefactFragment.class, this, CorePackage.ARTEFACT_FRAGMENT__SUB_FRAGMENT);
		}
		return subFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ARTEFACT_FRAGMENT__SUB_FRAGMENT:
				return ((InternalEList)getSubFragment()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ARTEFACT_FRAGMENT__SUB_FRAGMENT:
				return getSubFragment();
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
			case CorePackage.ARTEFACT_FRAGMENT__SUB_FRAGMENT:
				getSubFragment().clear();
				getSubFragment().addAll((Collection)newValue);
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
			case CorePackage.ARTEFACT_FRAGMENT__SUB_FRAGMENT:
				getSubFragment().clear();
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
			case CorePackage.ARTEFACT_FRAGMENT__SUB_FRAGMENT:
				return subFragment != null && !subFragment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtefactFragmentImpl
