/**
 */
package org.eclipse.capra.generic.tracemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.TraceLink#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.TraceLink#getConfidenceValue <em>Confidence Value</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.TraceLink#getConfidence <em>Confidence</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getTraceLink()
 * @model abstract="true"
 * @generated
 */
public interface TraceLink extends TracingElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getTraceLink_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.TraceLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Confidence Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence Value</em>' attribute.
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getTraceLink_ConfidenceValue()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getConfidenceValue();

	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence</em>' containment reference.
	 * @see #setConfidence(Confidence)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getTraceLink_Confidence()
	 * @model containment="true"
	 * @generated
	 */
	Confidence getConfidence();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.TraceLink#getConfidence <em>Confidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' containment reference.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(Confidence value);

} // TraceLink
