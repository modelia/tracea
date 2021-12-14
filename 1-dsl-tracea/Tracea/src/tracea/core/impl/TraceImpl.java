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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tracea.core.Artefact;
import tracea.core.ArtefactFragment;
import tracea.core.CorePackage;
import tracea.core.Evidence;
import tracea.core.Referee;
import tracea.core.Trace;
import tracea.core.TraceLink;
import tracea.core.TrustableElement;

import tracea.relationtyping.impl.TypedRelationshipImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.impl.TraceImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link tracea.core.impl.TraceImpl#getReferees <em>Referees</em>}</li>
 *   <li>{@link tracea.core.impl.TraceImpl#getName <em>Name</em>}</li>
 *   <li>{@link tracea.core.impl.TraceImpl#getSourceArtefacts <em>Source Artefacts</em>}</li>
 *   <li>{@link tracea.core.impl.TraceImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link tracea.core.impl.TraceImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link tracea.core.impl.TraceImpl#getEvidences <em>Evidences</em>}</li>
 *   <li>{@link tracea.core.impl.TraceImpl#getTargetArtefacts <em>Target Artefacts</em>}</li>
 *   <li>{@link tracea.core.impl.TraceImpl#getStarts <em>Starts</em>}</li>
 *   <li>{@link tracea.core.impl.TraceImpl#getTracelinks <em>Tracelinks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceImpl extends TypedRelationshipImpl implements Trace {
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
	 * The cached value of the '{@link #getSourceArtefacts() <em>Source Artefacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceArtefacts()
	 * @generated
	 * @ordered
	 */
	protected EList sourceArtefacts;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList targets;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList sources;

	/**
	 * The cached value of the '{@link #getEvidences() <em>Evidences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidences()
	 * @generated
	 * @ordered
	 */
	protected EList evidences;

	/**
	 * The cached value of the '{@link #getTargetArtefacts() <em>Target Artefacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetArtefacts()
	 * @generated
	 * @ordered
	 */
	protected EList targetArtefacts;

	/**
	 * The cached value of the '{@link #getStarts() <em>Starts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarts()
	 * @generated
	 * @ordered
	 */
	protected EList starts;

	/**
	 * The cached value of the '{@link #getTracelinks() <em>Tracelinks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracelinks()
	 * @generated
	 * @ordered
	 */
	protected EList tracelinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.TRACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRACE__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferees() {
		if (referees == null) {
			referees = new EObjectResolvingEList(Referee.class, this, CorePackage.TRACE__REFEREES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceArtefacts() {
		if (sourceArtefacts == null) {
			sourceArtefacts = new EObjectResolvingEList(Artefact.class, this, CorePackage.TRACE__SOURCE_ARTEFACTS);
		}
		return sourceArtefacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList(ArtefactFragment.class, this, CorePackage.TRACE__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList(ArtefactFragment.class, this, CorePackage.TRACE__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEvidences() {
		if (evidences == null) {
			evidences = new EObjectContainmentEList(Evidence.class, this, CorePackage.TRACE__EVIDENCES);
		}
		return evidences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetArtefacts() {
		if (targetArtefacts == null) {
			targetArtefacts = new EObjectResolvingEList(Artefact.class, this, CorePackage.TRACE__TARGET_ARTEFACTS);
		}
		return targetArtefacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStarts() {
		if (starts == null) {
			starts = new EObjectResolvingEList(TraceLink.class, this, CorePackage.TRACE__STARTS);
		}
		return starts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTracelinks() {
		if (tracelinks == null) {
			tracelinks = new EObjectContainmentEList(TraceLink.class, this, CorePackage.TRACE__TRACELINKS);
		}
		return tracelinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TRACE__EVIDENCES:
				return ((InternalEList)getEvidences()).basicRemove(otherEnd, msgs);
			case CorePackage.TRACE__TRACELINKS:
				return ((InternalEList)getTracelinks()).basicRemove(otherEnd, msgs);
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
			case CorePackage.TRACE__TIME_STAMP:
				return getTimeStamp();
			case CorePackage.TRACE__REFEREES:
				return getReferees();
			case CorePackage.TRACE__NAME:
				return getName();
			case CorePackage.TRACE__SOURCE_ARTEFACTS:
				return getSourceArtefacts();
			case CorePackage.TRACE__TARGETS:
				return getTargets();
			case CorePackage.TRACE__SOURCES:
				return getSources();
			case CorePackage.TRACE__EVIDENCES:
				return getEvidences();
			case CorePackage.TRACE__TARGET_ARTEFACTS:
				return getTargetArtefacts();
			case CorePackage.TRACE__STARTS:
				return getStarts();
			case CorePackage.TRACE__TRACELINKS:
				return getTracelinks();
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
			case CorePackage.TRACE__TIME_STAMP:
				setTimeStamp((String)newValue);
				return;
			case CorePackage.TRACE__REFEREES:
				getReferees().clear();
				getReferees().addAll((Collection)newValue);
				return;
			case CorePackage.TRACE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.TRACE__SOURCE_ARTEFACTS:
				getSourceArtefacts().clear();
				getSourceArtefacts().addAll((Collection)newValue);
				return;
			case CorePackage.TRACE__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection)newValue);
				return;
			case CorePackage.TRACE__SOURCES:
				getSources().clear();
				getSources().addAll((Collection)newValue);
				return;
			case CorePackage.TRACE__EVIDENCES:
				getEvidences().clear();
				getEvidences().addAll((Collection)newValue);
				return;
			case CorePackage.TRACE__TARGET_ARTEFACTS:
				getTargetArtefacts().clear();
				getTargetArtefacts().addAll((Collection)newValue);
				return;
			case CorePackage.TRACE__STARTS:
				getStarts().clear();
				getStarts().addAll((Collection)newValue);
				return;
			case CorePackage.TRACE__TRACELINKS:
				getTracelinks().clear();
				getTracelinks().addAll((Collection)newValue);
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
			case CorePackage.TRACE__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case CorePackage.TRACE__REFEREES:
				getReferees().clear();
				return;
			case CorePackage.TRACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.TRACE__SOURCE_ARTEFACTS:
				getSourceArtefacts().clear();
				return;
			case CorePackage.TRACE__TARGETS:
				getTargets().clear();
				return;
			case CorePackage.TRACE__SOURCES:
				getSources().clear();
				return;
			case CorePackage.TRACE__EVIDENCES:
				getEvidences().clear();
				return;
			case CorePackage.TRACE__TARGET_ARTEFACTS:
				getTargetArtefacts().clear();
				return;
			case CorePackage.TRACE__STARTS:
				getStarts().clear();
				return;
			case CorePackage.TRACE__TRACELINKS:
				getTracelinks().clear();
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
			case CorePackage.TRACE__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case CorePackage.TRACE__REFEREES:
				return referees != null && !referees.isEmpty();
			case CorePackage.TRACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.TRACE__SOURCE_ARTEFACTS:
				return sourceArtefacts != null && !sourceArtefacts.isEmpty();
			case CorePackage.TRACE__TARGETS:
				return targets != null && !targets.isEmpty();
			case CorePackage.TRACE__SOURCES:
				return sources != null && !sources.isEmpty();
			case CorePackage.TRACE__EVIDENCES:
				return evidences != null && !evidences.isEmpty();
			case CorePackage.TRACE__TARGET_ARTEFACTS:
				return targetArtefacts != null && !targetArtefacts.isEmpty();
			case CorePackage.TRACE__STARTS:
				return starts != null && !starts.isEmpty();
			case CorePackage.TRACE__TRACELINKS:
				return tracelinks != null && !tracelinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TrustableElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.TRACE__TIME_STAMP: return CorePackage.TRUSTABLE_ELEMENT__TIME_STAMP;
				case CorePackage.TRACE__REFEREES: return CorePackage.TRUSTABLE_ELEMENT__REFEREES;
				case CorePackage.TRACE__NAME: return CorePackage.TRUSTABLE_ELEMENT__NAME;
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
		if (baseClass == TrustableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.TRUSTABLE_ELEMENT__TIME_STAMP: return CorePackage.TRACE__TIME_STAMP;
				case CorePackage.TRUSTABLE_ELEMENT__REFEREES: return CorePackage.TRACE__REFEREES;
				case CorePackage.TRUSTABLE_ELEMENT__NAME: return CorePackage.TRACE__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //TraceImpl
