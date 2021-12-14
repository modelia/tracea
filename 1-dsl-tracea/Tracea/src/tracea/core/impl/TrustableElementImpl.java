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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tracea.core.CorePackage;
import tracea.core.Referee;
import tracea.core.TrustableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trustable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.impl.TrustableElementImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link tracea.core.impl.TrustableElementImpl#getReferees <em>Referees</em>}</li>
 *   <li>{@link tracea.core.impl.TrustableElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TrustableElementImpl extends MinimalEObjectImpl.Container implements TrustableElement {
	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferees() <em>Referees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferees()
	 * @generated
	 * @ordered
	 */
	protected EList referees;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.TRUSTABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(String newTimeStamp) {
		String oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRUSTABLE_ELEMENT__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferees() {
		if (referees == null) {
			referees = new EObjectResolvingEList(Referee.class, this, CorePackage.TRUSTABLE_ELEMENT__REFEREES);
		}
		return referees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRUSTABLE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.TRUSTABLE_ELEMENT__TIME_STAMP:
				return getTimeStamp();
			case CorePackage.TRUSTABLE_ELEMENT__REFEREES:
				return getReferees();
			case CorePackage.TRUSTABLE_ELEMENT__NAME:
				return getName();
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
			case CorePackage.TRUSTABLE_ELEMENT__TIME_STAMP:
				setTimeStamp((String)newValue);
				return;
			case CorePackage.TRUSTABLE_ELEMENT__REFEREES:
				getReferees().clear();
				getReferees().addAll((Collection)newValue);
				return;
			case CorePackage.TRUSTABLE_ELEMENT__NAME:
				setName((String)newValue);
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
			case CorePackage.TRUSTABLE_ELEMENT__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case CorePackage.TRUSTABLE_ELEMENT__REFEREES:
				getReferees().clear();
				return;
			case CorePackage.TRUSTABLE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case CorePackage.TRUSTABLE_ELEMENT__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case CorePackage.TRUSTABLE_ELEMENT__REFEREES:
				return referees != null && !referees.isEmpty();
			case CorePackage.TRUSTABLE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (timeStamp: ");
		result.append(timeStamp);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TrustableElementImpl
