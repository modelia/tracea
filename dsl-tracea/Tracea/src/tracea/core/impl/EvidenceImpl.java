/**
 */
package tracea.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tracea.core.CorePackage;
import tracea.core.Evidence;
import tracea.core.TrustableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.impl.EvidenceImpl#getImpactedElements <em>Impacted Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceImpl extends TrustableElementImpl implements Evidence {
	/**
	 * The cached value of the '{@link #getImpactedElements() <em>Impacted Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactedElements()
	 * @generated
	 * @ordered
	 */
	protected EList impactedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CorePackage.Literals.EVIDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImpactedElements() {
		if (impactedElements == null) {
			impactedElements = new EObjectResolvingEList(TrustableElement.class, this, CorePackage.EVIDENCE__IMPACTED_ELEMENTS);
		}
		return impactedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.EVIDENCE__IMPACTED_ELEMENTS:
				return getImpactedElements();
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
			case CorePackage.EVIDENCE__IMPACTED_ELEMENTS:
				getImpactedElements().clear();
				getImpactedElements().addAll((Collection)newValue);
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
			case CorePackage.EVIDENCE__IMPACTED_ELEMENTS:
				getImpactedElements().clear();
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
			case CorePackage.EVIDENCE__IMPACTED_ELEMENTS:
				return impactedElements != null && !impactedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceImpl
