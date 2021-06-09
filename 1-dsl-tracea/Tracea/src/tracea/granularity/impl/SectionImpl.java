/**
 */
package tracea.granularity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tracea.granularity.GranularityPackage;
import tracea.granularity.PartOfSpeech;
import tracea.granularity.Section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.impl.SectionImpl#getPartofspeechsDefined <em>Partofspeechs Defined</em>}</li>
 *   <li>{@link tracea.granularity.impl.SectionImpl#getPartofspeechsUsed <em>Partofspeechs Used</em>}</li>
 *   <li>{@link tracea.granularity.impl.SectionImpl#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends TextFragmentImpl implements Section {
	/**
	 * The cached value of the '{@link #getPartofspeechsDefined() <em>Partofspeechs Defined</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartofspeechsDefined()
	 * @generated
	 * @ordered
	 */
	protected EList partofspeechsDefined;

	/**
	 * The cached value of the '{@link #getPartofspeechsUsed() <em>Partofspeechs Used</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartofspeechsUsed()
	 * @generated
	 * @ordered
	 */
	protected EList partofspeechsUsed;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GranularityPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPartofspeechsDefined() {
		if (partofspeechsDefined == null) {
			partofspeechsDefined = new EObjectContainmentEList(PartOfSpeech.class, this, GranularityPackage.SECTION__PARTOFSPEECHS_DEFINED);
		}
		return partofspeechsDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPartofspeechsUsed() {
		if (partofspeechsUsed == null) {
			partofspeechsUsed = new EObjectContainmentEList(PartOfSpeech.class, this, GranularityPackage.SECTION__PARTOFSPEECHS_USED);
		}
		return partofspeechsUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GranularityPackage.SECTION__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GranularityPackage.SECTION__PARTOFSPEECHS_DEFINED:
				return ((InternalEList)getPartofspeechsDefined()).basicRemove(otherEnd, msgs);
			case GranularityPackage.SECTION__PARTOFSPEECHS_USED:
				return ((InternalEList)getPartofspeechsUsed()).basicRemove(otherEnd, msgs);
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
			case GranularityPackage.SECTION__PARTOFSPEECHS_DEFINED:
				return getPartofspeechsDefined();
			case GranularityPackage.SECTION__PARTOFSPEECHS_USED:
				return getPartofspeechsUsed();
			case GranularityPackage.SECTION__NUMBER:
				return new Integer(getNumber());
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
			case GranularityPackage.SECTION__PARTOFSPEECHS_DEFINED:
				getPartofspeechsDefined().clear();
				getPartofspeechsDefined().addAll((Collection)newValue);
				return;
			case GranularityPackage.SECTION__PARTOFSPEECHS_USED:
				getPartofspeechsUsed().clear();
				getPartofspeechsUsed().addAll((Collection)newValue);
				return;
			case GranularityPackage.SECTION__NUMBER:
				setNumber(((Integer)newValue).intValue());
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
			case GranularityPackage.SECTION__PARTOFSPEECHS_DEFINED:
				getPartofspeechsDefined().clear();
				return;
			case GranularityPackage.SECTION__PARTOFSPEECHS_USED:
				getPartofspeechsUsed().clear();
				return;
			case GranularityPackage.SECTION__NUMBER:
				setNumber(NUMBER_EDEFAULT);
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
			case GranularityPackage.SECTION__PARTOFSPEECHS_DEFINED:
				return partofspeechsDefined != null && !partofspeechsDefined.isEmpty();
			case GranularityPackage.SECTION__PARTOFSPEECHS_USED:
				return partofspeechsUsed != null && !partofspeechsUsed.isEmpty();
			case GranularityPackage.SECTION__NUMBER:
				return number != NUMBER_EDEFAULT;
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //SectionImpl
