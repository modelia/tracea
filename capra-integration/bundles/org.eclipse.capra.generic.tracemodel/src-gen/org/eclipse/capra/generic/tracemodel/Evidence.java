/**
 */
package org.eclipse.capra.generic.tracemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.Evidence#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.Evidence#getSupportingElements <em>Supporting Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getEvidence()
 * @model abstract="true"
 * @generated
 */
public interface Evidence extends TracingElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getEvidence_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.Evidence#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Supporting Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.capra.generic.tracemodel.TracingElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Elements</em>' reference list.
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getEvidence_SupportingElements()
	 * @model
	 * @generated
	 */
	EList<TracingElement> getSupportingElements();

} // Evidence
