/**
 */
package GlossaryML;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GlossaryML.Definition#getBase_Comment <em>Base Comment</em>}</li>
 *   <li>{@link GlossaryML.Definition#isCommon <em>Is Common</em>}</li>
 * </ul>
 *
 * @see GlossaryML.GlossaryMLPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Comment</em>' reference.
	 * @see #setBase_Comment(Comment)
	 * @see GlossaryML.GlossaryMLPackage#getDefinition_Base_Comment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Comment getBase_Comment();

	/**
	 * Sets the value of the '{@link GlossaryML.Definition#getBase_Comment <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Comment</em>' reference.
	 * @see #getBase_Comment()
	 * @generated
	 */
	void setBase_Comment(Comment value);

	/**
	 * Returns the value of the '<em><b>Is Common</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Common</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Common</em>' attribute.
	 * @see #setIsCommon(boolean)
	 * @see GlossaryML.GlossaryMLPackage#getDefinition_IsCommon()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCommon();

	/**
	 * Sets the value of the '{@link GlossaryML.Definition#isCommon <em>Is Common</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Common</em>' attribute.
	 * @see #isCommon()
	 * @generated
	 */
	void setIsCommon(boolean value);

} // Definition
