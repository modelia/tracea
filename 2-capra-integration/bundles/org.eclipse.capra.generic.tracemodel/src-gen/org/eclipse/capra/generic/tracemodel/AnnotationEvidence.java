/**
 */
package org.eclipse.capra.generic.tracemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.AnnotationEvidence#getExplanation <em>Explanation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getAnnotationEvidence()
 * @model
 * @generated
 */
public interface AnnotationEvidence extends Evidence {
	/**
	 * Returns the value of the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explanation</em>' attribute.
	 * @see #setExplanation(String)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getAnnotationEvidence_Explanation()
	 * @model unique="false"
	 * @generated
	 */
	String getExplanation();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.AnnotationEvidence#getExplanation <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation</em>' attribute.
	 * @see #getExplanation()
	 * @generated
	 */
	void setExplanation(String value);

} // AnnotationEvidence
