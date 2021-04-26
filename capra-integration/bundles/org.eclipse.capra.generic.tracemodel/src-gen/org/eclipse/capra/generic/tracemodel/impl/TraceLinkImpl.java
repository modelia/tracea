/**
 */
package org.eclipse.capra.generic.tracemodel.impl;

import org.eclipse.capra.generic.tracemodel.TraceLink;
import org.eclipse.capra.generic.tracemodel.TracemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.TraceLinkImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.TraceLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.TraceLinkImpl#getConfidenceValue <em>Confidence Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TraceLinkImpl extends MinimalEObjectImpl.Container implements TraceLink {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

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
	 * The default value of the '{@link #getConfidenceValue() <em>Confidence Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidenceValue()
	 * @generated
	 * @ordered
	 */
	protected static final double CONFIDENCE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConfidenceValue() <em>Confidence Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidenceValue()
	 * @generated
	 * @ordered
	 */
	protected double confidenceValue = CONFIDENCE_VALUE_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return TracemodelPackage.Literals.TRACE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return EcoreUtil.generateUUID();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.TRACE_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConfidenceValue() {
		return confidenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidenceValue(double newConfidenceValue) {
		double oldConfidenceValue = confidenceValue;
		confidenceValue = newConfidenceValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.TRACE_LINK__CONFIDENCE_VALUE, oldConfidenceValue, confidenceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracemodelPackage.TRACE_LINK__ID:
				return getID();
			case TracemodelPackage.TRACE_LINK__NAME:
				return getName();
			case TracemodelPackage.TRACE_LINK__CONFIDENCE_VALUE:
				return getConfidenceValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracemodelPackage.TRACE_LINK__NAME:
				setName((String)newValue);
				return;
			case TracemodelPackage.TRACE_LINK__CONFIDENCE_VALUE:
				setConfidenceValue((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TracemodelPackage.TRACE_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TracemodelPackage.TRACE_LINK__CONFIDENCE_VALUE:
				setConfidenceValue(CONFIDENCE_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TracemodelPackage.TRACE_LINK__ID:
				return ID_EDEFAULT == null ? getID() != null : !ID_EDEFAULT.equals(getID());
			case TracemodelPackage.TRACE_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TracemodelPackage.TRACE_LINK__CONFIDENCE_VALUE:
				return confidenceValue != CONFIDENCE_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", confidenceValue: ");
		result.append(confidenceValue);
		result.append(')');
		return result.toString();
	}

} //TraceLinkImpl
