/**
 */
package GlossaryML.impl;

import GlossaryML.Definition;
import GlossaryML.GlossaryMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GlossaryML.impl.DefinitionImpl#getBase_Comment <em>Base Comment</em>}</li>
 *   <li>{@link GlossaryML.impl.DefinitionImpl#isCommon <em>Is Common</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition {
	/**
	 * The cached value of the '{@link #getBase_Comment() <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Comment()
	 * @generated
	 * @ordered
	 */
	protected Comment base_Comment;

	/**
	 * The default value of the '{@link #isCommon() <em>Is Common</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMMON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCommon() <em>Is Common</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommon()
	 * @generated
	 * @ordered
	 */
	protected boolean isCommon = IS_COMMON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlossaryMLPackage.Literals.DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getBase_Comment() {
		if (base_Comment != null && base_Comment.eIsProxy()) {
			InternalEObject oldBase_Comment = (InternalEObject)base_Comment;
			base_Comment = (Comment)eResolveProxy(oldBase_Comment);
			if (base_Comment != oldBase_Comment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlossaryMLPackage.DEFINITION__BASE_COMMENT, oldBase_Comment, base_Comment));
			}
		}
		return base_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetBase_Comment() {
		return base_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Comment(Comment newBase_Comment) {
		Comment oldBase_Comment = base_Comment;
		base_Comment = newBase_Comment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossaryMLPackage.DEFINITION__BASE_COMMENT, oldBase_Comment, base_Comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCommon() {
		return isCommon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCommon(boolean newIsCommon) {
		boolean oldIsCommon = isCommon;
		isCommon = newIsCommon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossaryMLPackage.DEFINITION__IS_COMMON, oldIsCommon, isCommon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GlossaryMLPackage.DEFINITION__BASE_COMMENT:
				if (resolve) return getBase_Comment();
				return basicGetBase_Comment();
			case GlossaryMLPackage.DEFINITION__IS_COMMON:
				return isCommon();
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
			case GlossaryMLPackage.DEFINITION__BASE_COMMENT:
				setBase_Comment((Comment)newValue);
				return;
			case GlossaryMLPackage.DEFINITION__IS_COMMON:
				setIsCommon((Boolean)newValue);
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
			case GlossaryMLPackage.DEFINITION__BASE_COMMENT:
				setBase_Comment((Comment)null);
				return;
			case GlossaryMLPackage.DEFINITION__IS_COMMON:
				setIsCommon(IS_COMMON_EDEFAULT);
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
			case GlossaryMLPackage.DEFINITION__BASE_COMMENT:
				return base_Comment != null;
			case GlossaryMLPackage.DEFINITION__IS_COMMON:
				return isCommon != IS_COMMON_EDEFAULT;
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
		result.append(" (isCommon: ");
		result.append(isCommon);
		result.append(')');
		return result.toString();
	}

} //DefinitionImpl
