/**
 */
package org.eclipse.capra.generic.tracemodel.impl;

import org.eclipse.capra.generic.tracemodel.Confidence;
import org.eclipse.capra.generic.tracemodel.TraceLink;
import org.eclipse.capra.generic.tracemodel.TracemodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.TraceLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.TraceLinkImpl#getConfidenceValue <em>Confidence Value</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.TraceLinkImpl#getConfidence <em>Confidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TraceLinkImpl extends TracingElementImpl implements TraceLink {
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
	 * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected Confidence confidence;

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
		Confidence _confidence = this.getConfidence();
		boolean _tripleNotEquals = (_confidence != null);
		if (_tripleNotEquals) {
			return this.getConfidence().getValue();
		}
		else {
			return 1.0;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidence getConfidence() {
		return confidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidence(Confidence newConfidence, NotificationChain msgs) {
		Confidence oldConfidence = confidence;
		confidence = newConfidence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracemodelPackage.TRACE_LINK__CONFIDENCE, oldConfidence, newConfidence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidence(Confidence newConfidence) {
		if (newConfidence != confidence) {
			NotificationChain msgs = null;
			if (confidence != null)
				msgs = ((InternalEObject)confidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracemodelPackage.TRACE_LINK__CONFIDENCE, null, msgs);
			if (newConfidence != null)
				msgs = ((InternalEObject)newConfidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracemodelPackage.TRACE_LINK__CONFIDENCE, null, msgs);
			msgs = basicSetConfidence(newConfidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.TRACE_LINK__CONFIDENCE, newConfidence, newConfidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracemodelPackage.TRACE_LINK__CONFIDENCE:
				return basicSetConfidence(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracemodelPackage.TRACE_LINK__NAME:
				return getName();
			case TracemodelPackage.TRACE_LINK__CONFIDENCE_VALUE:
				return getConfidenceValue();
			case TracemodelPackage.TRACE_LINK__CONFIDENCE:
				return getConfidence();
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
			case TracemodelPackage.TRACE_LINK__CONFIDENCE:
				setConfidence((Confidence)newValue);
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
			case TracemodelPackage.TRACE_LINK__CONFIDENCE:
				setConfidence((Confidence)null);
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
			case TracemodelPackage.TRACE_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TracemodelPackage.TRACE_LINK__CONFIDENCE_VALUE:
				return getConfidenceValue() != CONFIDENCE_VALUE_EDEFAULT;
			case TracemodelPackage.TRACE_LINK__CONFIDENCE:
				return confidence != null;
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
		result.append(')');
		return result.toString();
	}

} //TraceLinkImpl
