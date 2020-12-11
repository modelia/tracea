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

import tracea.core.impl.ArtefactImpl;

import tracea.granularity.CodeArtefact;
import tracea.granularity.CodeFragment;
import tracea.granularity.GranularityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Artefact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.impl.CodeArtefactImpl#getCodefragment <em>Codefragment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeArtefactImpl extends ArtefactImpl implements CodeArtefact {
	/**
	 * The cached value of the '{@link #getCodefragment() <em>Codefragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodefragment()
	 * @generated
	 * @ordered
	 */
	protected EList codefragment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeArtefactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GranularityPackage.Literals.CODE_ARTEFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCodefragment() {
		if (codefragment == null) {
			codefragment = new EObjectContainmentEList(CodeFragment.class, this, GranularityPackage.CODE_ARTEFACT__CODEFRAGMENT);
		}
		return codefragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GranularityPackage.CODE_ARTEFACT__CODEFRAGMENT:
				return ((InternalEList)getCodefragment()).basicRemove(otherEnd, msgs);
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
			case GranularityPackage.CODE_ARTEFACT__CODEFRAGMENT:
				return getCodefragment();
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
			case GranularityPackage.CODE_ARTEFACT__CODEFRAGMENT:
				getCodefragment().clear();
				getCodefragment().addAll((Collection)newValue);
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
			case GranularityPackage.CODE_ARTEFACT__CODEFRAGMENT:
				getCodefragment().clear();
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
			case GranularityPackage.CODE_ARTEFACT__CODEFRAGMENT:
				return codefragment != null && !codefragment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeArtefactImpl
