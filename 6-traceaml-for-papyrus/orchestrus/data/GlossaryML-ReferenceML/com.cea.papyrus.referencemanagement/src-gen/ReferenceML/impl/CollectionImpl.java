/**
 */
package ReferenceML.impl;

import ReferenceML.Collection;
import ReferenceML.Reference;
import ReferenceML.ReferenceMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ReferenceML.impl.CollectionImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link ReferenceML.impl.CollectionImpl#getReferences <em>References</em>}</li>
 *   <li>{@link ReferenceML.impl.CollectionImpl#getSubcollection <em>Subcollection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionImpl extends MinimalEObjectImpl.Container implements Collection {
	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferenceMLPackage.Literals.COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject)base_Package;
			base_Package = (org.eclipse.uml2.uml.Package)eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferenceMLPackage.COLLECTION__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceMLPackage.COLLECTION__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		// TODO: implement this method to return the 'References' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Collection> getSubcollection() {
		return com.cea.papyrus.referencemanagement.CollectionDerivedOperationImpl.getSubcollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferenceMLPackage.COLLECTION__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
			case ReferenceMLPackage.COLLECTION__REFERENCES:
				return getReferences();
			case ReferenceMLPackage.COLLECTION__SUBCOLLECTION:
				return getSubcollection();
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
			case ReferenceMLPackage.COLLECTION__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
				return;
			case ReferenceMLPackage.COLLECTION__REFERENCES:
				getReferences().clear();
				getReferences().addAll((java.util.Collection<? extends Reference>)newValue);
				return;
			case ReferenceMLPackage.COLLECTION__SUBCOLLECTION:
				getSubcollection().clear();
				getSubcollection().addAll((java.util.Collection<? extends Collection>)newValue);
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
			case ReferenceMLPackage.COLLECTION__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
				return;
			case ReferenceMLPackage.COLLECTION__REFERENCES:
				getReferences().clear();
				return;
			case ReferenceMLPackage.COLLECTION__SUBCOLLECTION:
				getSubcollection().clear();
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
			case ReferenceMLPackage.COLLECTION__BASE_PACKAGE:
				return base_Package != null;
			case ReferenceMLPackage.COLLECTION__REFERENCES:
				return !getReferences().isEmpty();
			case ReferenceMLPackage.COLLECTION__SUBCOLLECTION:
				return !getSubcollection().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollectionImpl
