/**
 */
package org.eclipse.capra.generic.tracemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.Agent#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getAgent()
 * @model abstract="true"
 * @generated
 */
public interface Agent extends TracingElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getAgent_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.Agent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Agent
