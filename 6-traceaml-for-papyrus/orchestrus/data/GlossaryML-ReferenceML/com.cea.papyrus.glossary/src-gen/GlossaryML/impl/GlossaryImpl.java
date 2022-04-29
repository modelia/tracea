/**
 */
package GlossaryML.impl;

import GlossaryML.Glossary;
import GlossaryML.GlossaryMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GlossaryML.impl.GlossaryImpl#getBase_Model <em>Base Model</em>}</li>
 *   <li>{@link GlossaryML.impl.GlossaryImpl#getKnowledgeDomainName <em>Knowledge Domain Name</em>}</li>
 *   <li>{@link GlossaryML.impl.GlossaryImpl#getKnowledgeDomainDescription <em>Knowledge Domain Description</em>}</li>
 *   <li>{@link GlossaryML.impl.GlossaryImpl#getSubGlossaries <em>Sub Glossaries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlossaryImpl extends MinimalEObjectImpl.Container implements Glossary {
	/**
	 * The cached value of the '{@link #getBase_Model() <em>Base Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Model()
	 * @generated
	 * @ordered
	 */
	protected Model base_Model;

	/**
	 * The default value of the '{@link #getKnowledgeDomainName() <em>Knowledge Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String KNOWLEDGE_DOMAIN_NAME_EDEFAULT = "\'Specify the name of the glossary knowledge domain.\'";

	/**
	 * The cached value of the '{@link #getKnowledgeDomainName() <em>Knowledge Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeDomainName()
	 * @generated
	 * @ordered
	 */
	protected String knowledgeDomainName = KNOWLEDGE_DOMAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKnowledgeDomainDescription() <em>Knowledge Domain Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeDomainDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String KNOWLEDGE_DOMAIN_DESCRIPTION_EDEFAULT = "\'Insert here a text of the description of the glossary knowledge domain.\'";

	/**
	 * The cached value of the '{@link #getKnowledgeDomainDescription() <em>Knowledge Domain Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeDomainDescription()
	 * @generated
	 * @ordered
	 */
	protected String knowledgeDomainDescription = KNOWLEDGE_DOMAIN_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlossaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlossaryMLPackage.Literals.GLOSSARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getBase_Model() {
		if (base_Model != null && base_Model.eIsProxy()) {
			InternalEObject oldBase_Model = (InternalEObject)base_Model;
			base_Model = (Model)eResolveProxy(oldBase_Model);
			if (base_Model != oldBase_Model) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlossaryMLPackage.GLOSSARY__BASE_MODEL, oldBase_Model, base_Model));
			}
		}
		return base_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetBase_Model() {
		return base_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Model(Model newBase_Model) {
		Model oldBase_Model = base_Model;
		base_Model = newBase_Model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossaryMLPackage.GLOSSARY__BASE_MODEL, oldBase_Model, base_Model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKnowledgeDomainName() {
		return knowledgeDomainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnowledgeDomainName(String newKnowledgeDomainName) {
		String oldKnowledgeDomainName = knowledgeDomainName;
		knowledgeDomainName = newKnowledgeDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossaryMLPackage.GLOSSARY__KNOWLEDGE_DOMAIN_NAME, oldKnowledgeDomainName, knowledgeDomainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKnowledgeDomainDescription() {
		return knowledgeDomainDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnowledgeDomainDescription(String newKnowledgeDomainDescription) {
		String oldKnowledgeDomainDescription = knowledgeDomainDescription;
		knowledgeDomainDescription = newKnowledgeDomainDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossaryMLPackage.GLOSSARY__KNOWLEDGE_DOMAIN_DESCRIPTION, oldKnowledgeDomainDescription, knowledgeDomainDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Glossary> getSubGlossaries() {
		// TODO: implement this method to return the 'Sub Glossaries' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GlossaryMLPackage.GLOSSARY__BASE_MODEL:
				if (resolve) return getBase_Model();
				return basicGetBase_Model();
			case GlossaryMLPackage.GLOSSARY__KNOWLEDGE_DOMAIN_NAME:
				return getKnowledgeDomainName();
			case GlossaryMLPackage.GLOSSARY__KNOWLEDGE_DOMAIN_DESCRIPTION:
				return getKnowledgeDomainDescription();
			case GlossaryMLPackage.GLOSSARY__SUB_GLOSSARIES:
				return getSubGlossaries();
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
			case GlossaryMLPackage.GLOSSARY__BASE_MODEL:
				setBase_Model((Model)newValue);
				return;
			case GlossaryMLPackage.GLOSSARY__KNOWLEDGE_DOMAIN_NAME:
				setKnowledgeDomainName((String)newValue);
				return;
			case GlossaryMLPackage.GLOSSARY__KNOWLEDGE_DOMAIN_DESCRIPTION:
				setKnowledgeDomainDescription((String)newValue);
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
			case GlossaryMLPackage.GLOSSARY__BASE_MODEL:
				setBase_Model((Model)null);
				return;
			case GlossaryMLPackage.GLOSSARY__KNOWLEDGE_DOMAIN_NAME:
				setKnowledgeDomainName(KNOWLEDGE_DOMAIN_NAME_EDEFAULT);
				return;
			case GlossaryMLPackage.GLOSSARY__KNOWLEDGE_DOMAIN_DESCRIPTION:
				setKnowledgeDomainDescription(KNOWLEDGE_DOMAIN_DESCRIPTION_EDEFAULT);
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
			case GlossaryMLPackage.GLOSSARY__BASE_MODEL:
				return base_Model != null;
			case GlossaryMLPackage.GLOSSARY__KNOWLEDGE_DOMAIN_NAME:
				return KNOWLEDGE_DOMAIN_NAME_EDEFAULT == null ? knowledgeDomainName != null : !KNOWLEDGE_DOMAIN_NAME_EDEFAULT.equals(knowledgeDomainName);
			case GlossaryMLPackage.GLOSSARY__KNOWLEDGE_DOMAIN_DESCRIPTION:
				return KNOWLEDGE_DOMAIN_DESCRIPTION_EDEFAULT == null ? knowledgeDomainDescription != null : !KNOWLEDGE_DOMAIN_DESCRIPTION_EDEFAULT.equals(knowledgeDomainDescription);
			case GlossaryMLPackage.GLOSSARY__SUB_GLOSSARIES:
				return !getSubGlossaries().isEmpty();
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
		result.append(" (knowledgeDomainName: ");
		result.append(knowledgeDomainName);
		result.append(", knowledgeDomainDescription: ");
		result.append(knowledgeDomainDescription);
		result.append(')');
		return result.toString();
	}

} //GlossaryImpl
