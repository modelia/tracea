/**
 */
package org.eclipse.capra.generic.tracemodel.impl;

import org.eclipse.capra.generic.tracemodel.AIEvidence;
import org.eclipse.capra.generic.tracemodel.TracemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.AIEvidenceImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.AIEvidenceImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.AIEvidenceImpl#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.AIEvidenceImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.impl.AIEvidenceImpl#getRecall <em>Recall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIEvidenceImpl extends EvidenceImpl implements AIEvidence {
	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSet() <em>Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSet()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSet()
	 * @generated
	 * @ordered
	 */
	protected String dataSet = DATA_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionDate() <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionDate()
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTION_DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExecutionDate() <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionDate()
	 * @generated
	 * @ordered
	 */
	protected int executionDate = EXECUTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final double PRECISION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected double precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecall() <em>Recall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecall()
	 * @generated
	 * @ordered
	 */
	protected static final double RECALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRecall() <em>Recall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecall()
	 * @generated
	 * @ordered
	 */
	protected double recall = RECALL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIEvidenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracemodelPackage.Literals.AI_EVIDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.AI_EVIDENCE__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSet() {
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSet(String newDataSet) {
		String oldDataSet = dataSet;
		dataSet = newDataSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.AI_EVIDENCE__DATA_SET, oldDataSet, dataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExecutionDate() {
		return executionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionDate(int newExecutionDate) {
		int oldExecutionDate = executionDate;
		executionDate = newExecutionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.AI_EVIDENCE__EXECUTION_DATE, oldExecutionDate, executionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(double newPrecision) {
		double oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.AI_EVIDENCE__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRecall() {
		return recall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecall(double newRecall) {
		double oldRecall = recall;
		recall = newRecall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.AI_EVIDENCE__RECALL, oldRecall, recall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracemodelPackage.AI_EVIDENCE__ALGORITHM:
				return getAlgorithm();
			case TracemodelPackage.AI_EVIDENCE__DATA_SET:
				return getDataSet();
			case TracemodelPackage.AI_EVIDENCE__EXECUTION_DATE:
				return getExecutionDate();
			case TracemodelPackage.AI_EVIDENCE__PRECISION:
				return getPrecision();
			case TracemodelPackage.AI_EVIDENCE__RECALL:
				return getRecall();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracemodelPackage.AI_EVIDENCE__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case TracemodelPackage.AI_EVIDENCE__DATA_SET:
				setDataSet((String)newValue);
				return;
			case TracemodelPackage.AI_EVIDENCE__EXECUTION_DATE:
				setExecutionDate((Integer)newValue);
				return;
			case TracemodelPackage.AI_EVIDENCE__PRECISION:
				setPrecision((Double)newValue);
				return;
			case TracemodelPackage.AI_EVIDENCE__RECALL:
				setRecall((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TracemodelPackage.AI_EVIDENCE__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case TracemodelPackage.AI_EVIDENCE__DATA_SET:
				setDataSet(DATA_SET_EDEFAULT);
				return;
			case TracemodelPackage.AI_EVIDENCE__EXECUTION_DATE:
				setExecutionDate(EXECUTION_DATE_EDEFAULT);
				return;
			case TracemodelPackage.AI_EVIDENCE__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case TracemodelPackage.AI_EVIDENCE__RECALL:
				setRecall(RECALL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TracemodelPackage.AI_EVIDENCE__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case TracemodelPackage.AI_EVIDENCE__DATA_SET:
				return DATA_SET_EDEFAULT == null ? dataSet != null : !DATA_SET_EDEFAULT.equals(dataSet);
			case TracemodelPackage.AI_EVIDENCE__EXECUTION_DATE:
				return executionDate != EXECUTION_DATE_EDEFAULT;
			case TracemodelPackage.AI_EVIDENCE__PRECISION:
				return precision != PRECISION_EDEFAULT;
			case TracemodelPackage.AI_EVIDENCE__RECALL:
				return recall != RECALL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (algorithm: ");
		result.append(algorithm);
		result.append(", dataSet: ");
		result.append(dataSet);
		result.append(", executionDate: ");
		result.append(executionDate);
		result.append(", precision: ");
		result.append(precision);
		result.append(", recall: ");
		result.append(recall);
		result.append(')');
		return result.toString();
	}

} //AIEvidenceImpl
