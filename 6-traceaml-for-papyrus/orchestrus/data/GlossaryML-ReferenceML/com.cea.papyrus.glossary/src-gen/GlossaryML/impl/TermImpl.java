/**
 */
package GlossaryML.impl;

import GlossaryML.Definition;
import GlossaryML.GlossaryMLPackage;
import GlossaryML.Term;

import ReferenceML.Reference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GlossaryML.impl.TermImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link GlossaryML.impl.TermImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link GlossaryML.impl.TermImpl#getMeanings <em>Meanings</em>}</li>
 *   <li>{@link GlossaryML.impl.TermImpl#getCommonMeaning <em>Common Meaning</em>}</li>
 *   <li>{@link GlossaryML.impl.TermImpl#getHyponyms <em>Hyponyms</em>}</li>
 *   <li>{@link GlossaryML.impl.TermImpl#getHypernyms <em>Hypernyms</em>}</li>
 *   <li>{@link GlossaryML.impl.TermImpl#getSynonyms <em>Synonyms</em>}</li>
 *   <li>{@link GlossaryML.impl.TermImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermImpl extends MinimalEObjectImpl.Container implements Term {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The default value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected static final String ACRONYM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected String acronym = ACRONYM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHyponyms() <em>Hyponyms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyponyms()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> hyponyms;

	/**
	 * The cached value of the '{@link #getHypernyms() <em>Hypernyms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypernyms()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> hypernyms;

	/**
	 * The cached value of the '{@link #getSynonyms() <em>Synonyms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonyms()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> synonyms;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlossaryMLPackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlossaryMLPackage.TERM__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossaryMLPackage.TERM__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcronym() {
		return acronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcronym(String newAcronym) {
		String oldAcronym = acronym;
		acronym = newAcronym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossaryMLPackage.TERM__ACRONYM, oldAcronym, acronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Definition> getMeanings() {
		// TODO: implement this method to return the 'Meanings' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition getCommonMeaning() {
		Definition commonMeaning = basicGetCommonMeaning();
		return commonMeaning != null && commonMeaning.eIsProxy() ? (Definition)eResolveProxy((InternalEObject)commonMeaning) : commonMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition basicGetCommonMeaning() {
		// TODO: implement this method to return the 'Common Meaning' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getHyponyms() {
		if (hyponyms == null) {
			hyponyms = new EObjectWithInverseResolvingEList.ManyInverse<Term>(Term.class, this, GlossaryMLPackage.TERM__HYPONYMS, GlossaryMLPackage.TERM__HYPERNYMS);
		}
		return hyponyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getHypernyms() {
		if (hypernyms == null) {
			hypernyms = new EObjectWithInverseResolvingEList.ManyInverse<Term>(Term.class, this, GlossaryMLPackage.TERM__HYPERNYMS, GlossaryMLPackage.TERM__HYPONYMS);
		}
		return hypernyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getSynonyms() {
		if (synonyms == null) {
			synonyms = new EObjectResolvingEList<Term>(Term.class, this, GlossaryMLPackage.TERM__SYNONYMS);
		}
		return synonyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectResolvingEList<Reference>(Reference.class, this, GlossaryMLPackage.TERM__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlossaryMLPackage.TERM__HYPONYMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHyponyms()).basicAdd(otherEnd, msgs);
			case GlossaryMLPackage.TERM__HYPERNYMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHypernyms()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlossaryMLPackage.TERM__HYPONYMS:
				return ((InternalEList<?>)getHyponyms()).basicRemove(otherEnd, msgs);
			case GlossaryMLPackage.TERM__HYPERNYMS:
				return ((InternalEList<?>)getHypernyms()).basicRemove(otherEnd, msgs);
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
			case GlossaryMLPackage.TERM__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case GlossaryMLPackage.TERM__ACRONYM:
				return getAcronym();
			case GlossaryMLPackage.TERM__MEANINGS:
				return getMeanings();
			case GlossaryMLPackage.TERM__COMMON_MEANING:
				if (resolve) return getCommonMeaning();
				return basicGetCommonMeaning();
			case GlossaryMLPackage.TERM__HYPONYMS:
				return getHyponyms();
			case GlossaryMLPackage.TERM__HYPERNYMS:
				return getHypernyms();
			case GlossaryMLPackage.TERM__SYNONYMS:
				return getSynonyms();
			case GlossaryMLPackage.TERM__REFERENCE:
				return getReference();
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
			case GlossaryMLPackage.TERM__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case GlossaryMLPackage.TERM__ACRONYM:
				setAcronym((String)newValue);
				return;
			case GlossaryMLPackage.TERM__HYPONYMS:
				getHyponyms().clear();
				getHyponyms().addAll((Collection<? extends Term>)newValue);
				return;
			case GlossaryMLPackage.TERM__HYPERNYMS:
				getHypernyms().clear();
				getHypernyms().addAll((Collection<? extends Term>)newValue);
				return;
			case GlossaryMLPackage.TERM__SYNONYMS:
				getSynonyms().clear();
				getSynonyms().addAll((Collection<? extends Term>)newValue);
				return;
			case GlossaryMLPackage.TERM__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Reference>)newValue);
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
			case GlossaryMLPackage.TERM__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case GlossaryMLPackage.TERM__ACRONYM:
				setAcronym(ACRONYM_EDEFAULT);
				return;
			case GlossaryMLPackage.TERM__HYPONYMS:
				getHyponyms().clear();
				return;
			case GlossaryMLPackage.TERM__HYPERNYMS:
				getHypernyms().clear();
				return;
			case GlossaryMLPackage.TERM__SYNONYMS:
				getSynonyms().clear();
				return;
			case GlossaryMLPackage.TERM__REFERENCE:
				getReference().clear();
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
			case GlossaryMLPackage.TERM__BASE_CLASS:
				return base_Class != null;
			case GlossaryMLPackage.TERM__ACRONYM:
				return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
			case GlossaryMLPackage.TERM__MEANINGS:
				return !getMeanings().isEmpty();
			case GlossaryMLPackage.TERM__COMMON_MEANING:
				return basicGetCommonMeaning() != null;
			case GlossaryMLPackage.TERM__HYPONYMS:
				return hyponyms != null && !hyponyms.isEmpty();
			case GlossaryMLPackage.TERM__HYPERNYMS:
				return hypernyms != null && !hypernyms.isEmpty();
			case GlossaryMLPackage.TERM__SYNONYMS:
				return synonyms != null && !synonyms.isEmpty();
			case GlossaryMLPackage.TERM__REFERENCE:
				return reference != null && !reference.isEmpty();
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
		result.append(" (acronym: ");
		result.append(acronym);
		result.append(')');
		return result.toString();
	}

} //TermImpl
