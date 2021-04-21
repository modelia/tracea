/**
 */
package org.eclipse.capra.generic.tracemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getRecall <em>Recall</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getAIEvidence()
 * @model
 * @generated
 */
public interface AIEvidence extends Evidence {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getAIEvidence_Algorithm()
	 * @model unique="false"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Data Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' attribute.
	 * @see #setDataSet(String)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getAIEvidence_DataSet()
	 * @model unique="false"
	 * @generated
	 */
	String getDataSet();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getDataSet <em>Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set</em>' attribute.
	 * @see #getDataSet()
	 * @generated
	 */
	void setDataSet(String value);

	/**
	 * Returns the value of the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Date</em>' attribute.
	 * @see #setExecutionDate(int)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getAIEvidence_ExecutionDate()
	 * @model unique="false"
	 * @generated
	 */
	int getExecutionDate();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getExecutionDate <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Date</em>' attribute.
	 * @see #getExecutionDate()
	 * @generated
	 */
	void setExecutionDate(int value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(double)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getAIEvidence_Precision()
	 * @model unique="false"
	 * @generated
	 */
	double getPrecision();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(double value);

	/**
	 * Returns the value of the '<em><b>Recall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recall</em>' attribute.
	 * @see #setRecall(double)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getAIEvidence_Recall()
	 * @model unique="false"
	 * @generated
	 */
	double getRecall();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getRecall <em>Recall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recall</em>' attribute.
	 * @see #getRecall()
	 * @generated
	 */
	void setRecall(double value);

} // AIEvidence
