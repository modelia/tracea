/**
 */
package ReferenceML.impl;

import ReferenceML.Collection;
import ReferenceML.ReferenceLibrary;
import ReferenceML.ReferenceMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Model;

import com.cea.papyrus.referencemanagement.ReferenceLibraryDerivedOperationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ReferenceML.impl.ReferenceLibraryImpl#getBase_Model <em>Base Model</em>}</li>
 *   <li>{@link ReferenceML.impl.ReferenceLibraryImpl#getCollections <em>Collections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceLibraryImpl extends MinimalEObjectImpl.Container implements ReferenceLibrary {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferenceMLPackage.Literals.REFERENCE_LIBRARY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferenceMLPackage.REFERENCE_LIBRARY__BASE_MODEL, oldBase_Model, base_Model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferenceMLPackage.REFERENCE_LIBRARY__BASE_MODEL, oldBase_Model, base_Model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Collection> getCollections() {
		return ReferenceLibraryDerivedOperationImpl.getCollections(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferenceMLPackage.REFERENCE_LIBRARY__BASE_MODEL:
				if (resolve) return getBase_Model();
				return basicGetBase_Model();
			case ReferenceMLPackage.REFERENCE_LIBRARY__COLLECTIONS:
				return getCollections();
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
			case ReferenceMLPackage.REFERENCE_LIBRARY__BASE_MODEL:
				setBase_Model((Model)newValue);
				return;
			case ReferenceMLPackage.REFERENCE_LIBRARY__COLLECTIONS:
				getCollections().clear();
				getCollections().addAll((java.util.Collection<? extends Collection>)newValue);
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
			case ReferenceMLPackage.REFERENCE_LIBRARY__BASE_MODEL:
				setBase_Model((Model)null);
				return;
			case ReferenceMLPackage.REFERENCE_LIBRARY__COLLECTIONS:
				getCollections().clear();
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
			case ReferenceMLPackage.REFERENCE_LIBRARY__BASE_MODEL:
				return base_Model != null;
			case ReferenceMLPackage.REFERENCE_LIBRARY__COLLECTIONS:
				return !getCollections().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferenceLibraryImpl
