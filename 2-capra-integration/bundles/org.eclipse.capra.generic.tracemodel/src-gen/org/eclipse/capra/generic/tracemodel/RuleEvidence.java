/**
 */
package org.eclipse.capra.generic.tracemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.RuleEvidence#getRule <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.RuleEvidence#getExecutionDate <em>Execution Date</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getRuleEvidence()
 * @model
 * @generated
 */
public interface RuleEvidence extends Evidence {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' attribute.
	 * @see #setRule(String)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getRuleEvidence_Rule()
	 * @model unique="false"
	 * @generated
	 */
	String getRule();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.RuleEvidence#getRule <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' attribute.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(String value);

	/**
	 * Returns the value of the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Date</em>' attribute.
	 * @see #setExecutionDate(int)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getRuleEvidence_ExecutionDate()
	 * @model unique="false"
	 * @generated
	 */
	int getExecutionDate();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.RuleEvidence#getExecutionDate <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Date</em>' attribute.
	 * @see #getExecutionDate()
	 * @generated
	 */
	void setExecutionDate(int value);

} // RuleEvidence
