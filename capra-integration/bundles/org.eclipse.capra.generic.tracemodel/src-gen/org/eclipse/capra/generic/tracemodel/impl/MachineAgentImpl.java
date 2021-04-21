/**
 */
package org.eclipse.capra.generic.tracemodel.impl;

import org.eclipse.capra.generic.tracemodel.MachineAgent;
import org.eclipse.capra.generic.tracemodel.TracemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.MachineAgentImpl#getMachineType <em>Machine Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineAgentImpl extends AgentImpl implements MachineAgent {
	/**
	 * The default value of the '{@link #getMachineType() <em>Machine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineType()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachineType() <em>Machine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineType()
	 * @generated
	 * @ordered
	 */
	protected String machineType = MACHINE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracemodelPackage.Literals.MACHINE_AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMachineType() {
		return machineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineType(String newMachineType) {
		String oldMachineType = machineType;
		machineType = newMachineType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.MACHINE_AGENT__MACHINE_TYPE, oldMachineType, machineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracemodelPackage.MACHINE_AGENT__MACHINE_TYPE:
				return getMachineType();
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
			case TracemodelPackage.MACHINE_AGENT__MACHINE_TYPE:
				setMachineType((String)newValue);
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
			case TracemodelPackage.MACHINE_AGENT__MACHINE_TYPE:
				setMachineType(MACHINE_TYPE_EDEFAULT);
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
			case TracemodelPackage.MACHINE_AGENT__MACHINE_TYPE:
				return MACHINE_TYPE_EDEFAULT == null ? machineType != null : !MACHINE_TYPE_EDEFAULT.equals(machineType);
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
		result.append(" (machineType: ");
		result.append(machineType);
		result.append(')');
		return result.toString();
	}

} //MachineAgentImpl
