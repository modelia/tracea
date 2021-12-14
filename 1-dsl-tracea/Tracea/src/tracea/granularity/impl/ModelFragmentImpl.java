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
package tracea.granularity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tracea.core.impl.ArtefactFragmentImpl;

import tracea.granularity.GranularityPackage;
import tracea.granularity.ModelFragment;
import tracea.granularity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.impl.ModelFragmentImpl#getNamedelementsDefined <em>Namedelements Defined</em>}</li>
 *   <li>{@link tracea.granularity.impl.ModelFragmentImpl#getNamedelementsUsed <em>Namedelements Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFragmentImpl extends ArtefactFragmentImpl implements ModelFragment {
	/**
	 * The cached value of the '{@link #getNamedelementsDefined() <em>Namedelements Defined</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedelementsDefined()
	 * @generated
	 * @ordered
	 */
	protected EList namedelementsDefined;

	/**
	 * The cached value of the '{@link #getNamedelementsUsed() <em>Namedelements Used</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedelementsUsed()
	 * @generated
	 * @ordered
	 */
	protected EList namedelementsUsed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GranularityPackage.Literals.MODEL_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNamedelementsDefined() {
		if (namedelementsDefined == null) {
			namedelementsDefined = new EObjectContainmentEList(NamedElement.class, this, GranularityPackage.MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED);
		}
		return namedelementsDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNamedelementsUsed() {
		if (namedelementsUsed == null) {
			namedelementsUsed = new EObjectContainmentEList(NamedElement.class, this, GranularityPackage.MODEL_FRAGMENT__NAMEDELEMENTS_USED);
		}
		return namedelementsUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GranularityPackage.MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED:
				return ((InternalEList)getNamedelementsDefined()).basicRemove(otherEnd, msgs);
			case GranularityPackage.MODEL_FRAGMENT__NAMEDELEMENTS_USED:
				return ((InternalEList)getNamedelementsUsed()).basicRemove(otherEnd, msgs);
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
			case GranularityPackage.MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED:
				return getNamedelementsDefined();
			case GranularityPackage.MODEL_FRAGMENT__NAMEDELEMENTS_USED:
				return getNamedelementsUsed();
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
			case GranularityPackage.MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED:
				getNamedelementsDefined().clear();
				getNamedelementsDefined().addAll((Collection)newValue);
				return;
			case GranularityPackage.MODEL_FRAGMENT__NAMEDELEMENTS_USED:
				getNamedelementsUsed().clear();
				getNamedelementsUsed().addAll((Collection)newValue);
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
			case GranularityPackage.MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED:
				getNamedelementsDefined().clear();
				return;
			case GranularityPackage.MODEL_FRAGMENT__NAMEDELEMENTS_USED:
				getNamedelementsUsed().clear();
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
			case GranularityPackage.MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED:
				return namedelementsDefined != null && !namedelementsDefined.isEmpty();
			case GranularityPackage.MODEL_FRAGMENT__NAMEDELEMENTS_USED:
				return namedelementsUsed != null && !namedelementsUsed.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelFragmentImpl
