/**
 */
package tracea.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.AnnotationEvidence#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getAnnotationEvidence()
 * @model
 * @generated
 */
public interface AnnotationEvidence extends Evidence {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see tracea.core.CorePackage#getAnnotationEvidence_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link tracea.core.AnnotationEvidence#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // AnnotationEvidence
