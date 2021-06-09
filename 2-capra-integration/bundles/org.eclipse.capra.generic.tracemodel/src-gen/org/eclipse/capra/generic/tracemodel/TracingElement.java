/**
 */
package org.eclipse.capra.generic.tracemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.TracingElement#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.TracingElement#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.TracingElement#getAgents <em>Agents</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getTracingElement()
 * @model abstract="true"
 * @generated
 */
public interface TracingElement extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getTracingElement_ID()
	 * @model unique="false"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.TracingElement#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(String)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getTracingElement_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	String getTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.TracingElement#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(String value);

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capra.generic.tracemodel.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getTracingElement_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

} // TracingElement
