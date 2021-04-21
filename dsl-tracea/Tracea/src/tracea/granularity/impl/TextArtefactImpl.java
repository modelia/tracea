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

import tracea.granularity.GranularityPackage;
import tracea.granularity.TextArtefact;
import tracea.granularity.TextFragment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Artefact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.impl.TextArtefactImpl#getTextfragments <em>Textfragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextArtefactImpl extends ArtefactImpl implements TextArtefact {
	/**
	 * The cached value of the '{@link #getTextfragments() <em>Textfragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextfragments()
	 * @generated
	 * @ordered
	 */
	protected EList textfragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextArtefactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GranularityPackage.Literals.TEXT_ARTEFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTextfragments() {
		if (textfragments == null) {
			textfragments = new EObjectContainmentEList(TextFragment.class, this, GranularityPackage.TEXT_ARTEFACT__TEXTFRAGMENTS);
		}
		return textfragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GranularityPackage.TEXT_ARTEFACT__TEXTFRAGMENTS:
				return ((InternalEList)getTextfragments()).basicRemove(otherEnd, msgs);
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
			case GranularityPackage.TEXT_ARTEFACT__TEXTFRAGMENTS:
				return getTextfragments();
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
			case GranularityPackage.TEXT_ARTEFACT__TEXTFRAGMENTS:
				getTextfragments().clear();
				getTextfragments().addAll((Collection)newValue);
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
			case GranularityPackage.TEXT_ARTEFACT__TEXTFRAGMENTS:
				getTextfragments().clear();
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
			case GranularityPackage.TEXT_ARTEFACT__TEXTFRAGMENTS:
				return textfragments != null && !textfragments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TextArtefactImpl
