/**
 */
package ReferenceML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a package that gathers a set external document placeholders.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ReferenceML.ReferenceLibrary#getBase_Model <em>Base Model</em>}</li>
 *   <li>{@link ReferenceML.ReferenceLibrary#getCollections <em>Collections</em>}</li>
 * </ul>
 *
 * @see ReferenceML.ReferenceMLPackage#getReferenceLibrary()
 * @model
 * @generated
 */
public interface ReferenceLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Model</em>' reference.
	 * @see #setBase_Model(Model)
	 * @see ReferenceML.ReferenceMLPackage#getReferenceLibrary_Base_Model()
	 * @model ordered="false"
	 * @generated
	 */
	Model getBase_Model();

	/**
	 * Sets the value of the '{@link ReferenceML.ReferenceLibrary#getBase_Model <em>Base Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Model</em>' reference.
	 * @see #getBase_Model()
	 * @generated
	 */
	void setBase_Model(Model value);

	/**
	 * Returns the value of the '<em><b>Collections</b></em>' reference list.
	 * The list contents are of type {@link ReferenceML.Collection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' reference list.
	 * @see ReferenceML.ReferenceMLPackage#getReferenceLibrary_Collections()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Collection> getCollections();

} // ReferenceLibrary
