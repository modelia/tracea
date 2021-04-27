/**
 */
package org.eclipse.capra.generic.tracemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.MachineAgent#getMachineType <em>Machine Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getMachineAgent()
 * @model
 * @generated
 */
public interface MachineAgent extends Agent {
	/**
	 * Returns the value of the '<em><b>Machine Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Type</em>' attribute.
	 * @see #setMachineType(String)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getMachineAgent_MachineType()
	 * @model unique="false"
	 * @generated
	 */
	String getMachineType();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.MachineAgent#getMachineType <em>Machine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Type</em>' attribute.
	 * @see #getMachineType()
	 * @generated
	 */
	void setMachineType(String value);

} // MachineAgent
