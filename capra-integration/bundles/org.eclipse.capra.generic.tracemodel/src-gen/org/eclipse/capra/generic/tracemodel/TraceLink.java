/**
 */
package org.eclipse.capra.generic.tracemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.TraceLink#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.TraceLink#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.TraceLink#getConfidenceValue <em>Confidence Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getTraceLink()
 * @model abstract="true"
 * @generated
 */
public interface TraceLink extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getTraceLink_ID()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getID();

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
	 * @see #setConfidenceValue(double)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getTraceLink_ConfidenceValue()
	 * @model unique="false"
	 * @generated
	 */
	double getConfidenceValue();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.TraceLink#getConfidenceValue <em>Confidence Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence Value</em>' attribute.
	 * @see #getConfidenceValue()
	 * @generated
	 */
	void setConfidenceValue(double value);

} // TraceLink
