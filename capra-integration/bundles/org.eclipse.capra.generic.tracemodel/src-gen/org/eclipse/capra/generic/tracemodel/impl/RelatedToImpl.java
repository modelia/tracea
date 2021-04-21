/**
 */
package org.eclipse.capra.generic.tracemodel.impl;

import java.util.Collection;

import org.eclipse.capra.generic.tracemodel.Confidence;
import org.eclipse.capra.generic.tracemodel.RelatedTo;
import org.eclipse.capra.generic.tracemodel.TracemodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.RelatedToImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.RelatedToImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.RelatedToImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.RelatedToImpl#getConfidence <em>Confidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedToImpl extends TracingElementImpl implements RelatedTo {
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
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected EObject origin;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> targets;

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
	protected RelatedToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracemodelPackage.Literals.RELATED_TO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.RELATED_TO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracemodelPackage.RELATED_TO__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(EObject newOrigin) {
		EObject oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.RELATED_TO__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<EObject>(EObject.class, this, TracemodelPackage.RELATED_TO__TARGETS);
		}
		return targets;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracemodelPackage.RELATED_TO__CONFIDENCE, oldConfidence, newConfidence);
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
				msgs = ((InternalEObject)confidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracemodelPackage.RELATED_TO__CONFIDENCE, null, msgs);
			if (newConfidence != null)
				msgs = ((InternalEObject)newConfidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracemodelPackage.RELATED_TO__CONFIDENCE, null, msgs);
			msgs = basicSetConfidence(newConfidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.RELATED_TO__CONFIDENCE, newConfidence, newConfidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracemodelPackage.RELATED_TO__CONFIDENCE:
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
			case TracemodelPackage.RELATED_TO__NAME:
				return getName();
			case TracemodelPackage.RELATED_TO__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case TracemodelPackage.RELATED_TO__TARGETS:
				return getTargets();
			case TracemodelPackage.RELATED_TO__CONFIDENCE:
				return getConfidence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracemodelPackage.RELATED_TO__NAME:
				setName((String)newValue);
				return;
			case TracemodelPackage.RELATED_TO__ORIGIN:
				setOrigin((EObject)newValue);
				return;
			case TracemodelPackage.RELATED_TO__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends EObject>)newValue);
				return;
			case TracemodelPackage.RELATED_TO__CONFIDENCE:
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
			case TracemodelPackage.RELATED_TO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TracemodelPackage.RELATED_TO__ORIGIN:
				setOrigin((EObject)null);
				return;
			case TracemodelPackage.RELATED_TO__TARGETS:
				getTargets().clear();
				return;
			case TracemodelPackage.RELATED_TO__CONFIDENCE:
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
			case TracemodelPackage.RELATED_TO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TracemodelPackage.RELATED_TO__ORIGIN:
				return origin != null;
			case TracemodelPackage.RELATED_TO__TARGETS:
				return targets != null && !targets.isEmpty();
			case TracemodelPackage.RELATED_TO__CONFIDENCE:
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

} //RelatedToImpl
