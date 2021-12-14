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
package tracea.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tracea.Tracea;
import tracea.TraceaPackage;

import tracea.core.Artefact;
import tracea.core.Referee;
import tracea.core.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracea</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracea.impl.TraceaImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link tracea.impl.TraceaImpl#getArtefacts <em>Artefacts</em>}</li>
 *   <li>{@link tracea.impl.TraceaImpl#getReferees <em>Referees</em>}</li>
 *   <li>{@link tracea.impl.TraceaImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceaImpl extends MinimalEObjectImpl.Container implements Tracea {
	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList traces;

	/**
	 * The cached value of the '{@link #getArtefacts() <em>Artefacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefacts()
	 * @generated
	 * @ordered
	 */
	protected EList artefacts;

	/**
	 * The cached value of the '{@link #getReferees() <em>Referees</em>}' containment reference list.
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
	protected TraceaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TraceaPackage.Literals.TRACEA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTraces() {
		if (traces == null) {
			traces = new EObjectContainmentEList(Trace.class, this, TraceaPackage.TRACEA__TRACES);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArtefacts() {
		if (artefacts == null) {
			artefacts = new EObjectContainmentEList(Artefact.class, this, TraceaPackage.TRACEA__ARTEFACTS);
		}
		return artefacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferees() {
		if (referees == null) {
			referees = new EObjectContainmentEList(Referee.class, this, TraceaPackage.TRACEA__REFEREES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TraceaPackage.TRACEA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceaPackage.TRACEA__TRACES:
				return ((InternalEList)getTraces()).basicRemove(otherEnd, msgs);
			case TraceaPackage.TRACEA__ARTEFACTS:
				return ((InternalEList)getArtefacts()).basicRemove(otherEnd, msgs);
			case TraceaPackage.TRACEA__REFEREES:
				return ((InternalEList)getReferees()).basicRemove(otherEnd, msgs);
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
			case TraceaPackage.TRACEA__TRACES:
				return getTraces();
			case TraceaPackage.TRACEA__ARTEFACTS:
				return getArtefacts();
			case TraceaPackage.TRACEA__REFEREES:
				return getReferees();
			case TraceaPackage.TRACEA__NAME:
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
			case TraceaPackage.TRACEA__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection)newValue);
				return;
			case TraceaPackage.TRACEA__ARTEFACTS:
				getArtefacts().clear();
				getArtefacts().addAll((Collection)newValue);
				return;
			case TraceaPackage.TRACEA__REFEREES:
				getReferees().clear();
				getReferees().addAll((Collection)newValue);
				return;
			case TraceaPackage.TRACEA__NAME:
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
			case TraceaPackage.TRACEA__TRACES:
				getTraces().clear();
				return;
			case TraceaPackage.TRACEA__ARTEFACTS:
				getArtefacts().clear();
				return;
			case TraceaPackage.TRACEA__REFEREES:
				getReferees().clear();
				return;
			case TraceaPackage.TRACEA__NAME:
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
			case TraceaPackage.TRACEA__TRACES:
				return traces != null && !traces.isEmpty();
			case TraceaPackage.TRACEA__ARTEFACTS:
				return artefacts != null && !artefacts.isEmpty();
			case TraceaPackage.TRACEA__REFEREES:
				return referees != null && !referees.isEmpty();
			case TraceaPackage.TRACEA__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TraceaImpl
