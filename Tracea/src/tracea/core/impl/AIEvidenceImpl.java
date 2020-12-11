/**
 */
package tracea.core.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import tracea.core.AIEvidence;
import tracea.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.impl.AIEvidenceImpl#getAlgorithmUsed <em>Algorithm Used</em>}</li>
 *   <li>{@link tracea.core.impl.AIEvidenceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link tracea.core.impl.AIEvidenceImpl#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link tracea.core.impl.AIEvidenceImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link tracea.core.impl.AIEvidenceImpl#getRecall <em>Recall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIEvidenceImpl extends EvidenceImpl implements AIEvidence {
	/**
	 * The default value of the '{@link #getAlgorithmUsed() <em>Algorithm Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmUsed()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmUsed() <em>Algorithm Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmUsed()
	 * @generated
	 * @ordered
	 */
	protected String algorithmUsed = ALGORITHM_USED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList parameters;

	/**
	 * The default value of the '{@link #getExecutionDate() <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXECUTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionDate() <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionDate()
	 * @generated
	 * @ordered
	 */
	protected Date executionDate = EXECUTION_DATE_EDEFAULT;

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
	protected EClass eStaticClass() {
		return CorePackage.Literals.AI_EVIDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithmUsed() {
		return algorithmUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmUsed(String newAlgorithmUsed) {
		String oldAlgorithmUsed = algorithmUsed;
		algorithmUsed = newAlgorithmUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.AI_EVIDENCE__ALGORITHM_USED, oldAlgorithmUsed, algorithmUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeUniqueEList(String.class, this, CorePackage.AI_EVIDENCE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExecutionDate() {
		return executionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionDate(Date newExecutionDate) {
		Date oldExecutionDate = executionDate;
		executionDate = newExecutionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.AI_EVIDENCE__EXECUTION_DATE, oldExecutionDate, executionDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.AI_EVIDENCE__PRECISION, oldPrecision, precision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.AI_EVIDENCE__RECALL, oldRecall, recall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.AI_EVIDENCE__ALGORITHM_USED:
				return getAlgorithmUsed();
			case CorePackage.AI_EVIDENCE__PARAMETERS:
				return getParameters();
			case CorePackage.AI_EVIDENCE__EXECUTION_DATE:
				return getExecutionDate();
			case CorePackage.AI_EVIDENCE__PRECISION:
				return new Double(getPrecision());
			case CorePackage.AI_EVIDENCE__RECALL:
				return new Double(getRecall());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.AI_EVIDENCE__ALGORITHM_USED:
				setAlgorithmUsed((String)newValue);
				return;
			case CorePackage.AI_EVIDENCE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case CorePackage.AI_EVIDENCE__EXECUTION_DATE:
				setExecutionDate((Date)newValue);
				return;
			case CorePackage.AI_EVIDENCE__PRECISION:
				setPrecision(((Double)newValue).doubleValue());
				return;
			case CorePackage.AI_EVIDENCE__RECALL:
				setRecall(((Double)newValue).doubleValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.AI_EVIDENCE__ALGORITHM_USED:
				setAlgorithmUsed(ALGORITHM_USED_EDEFAULT);
				return;
			case CorePackage.AI_EVIDENCE__PARAMETERS:
				getParameters().clear();
				return;
			case CorePackage.AI_EVIDENCE__EXECUTION_DATE:
				setExecutionDate(EXECUTION_DATE_EDEFAULT);
				return;
			case CorePackage.AI_EVIDENCE__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case CorePackage.AI_EVIDENCE__RECALL:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.AI_EVIDENCE__ALGORITHM_USED:
				return ALGORITHM_USED_EDEFAULT == null ? algorithmUsed != null : !ALGORITHM_USED_EDEFAULT.equals(algorithmUsed);
			case CorePackage.AI_EVIDENCE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case CorePackage.AI_EVIDENCE__EXECUTION_DATE:
				return EXECUTION_DATE_EDEFAULT == null ? executionDate != null : !EXECUTION_DATE_EDEFAULT.equals(executionDate);
			case CorePackage.AI_EVIDENCE__PRECISION:
				return precision != PRECISION_EDEFAULT;
			case CorePackage.AI_EVIDENCE__RECALL:
				return recall != RECALL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (algorithmUsed: ");
		result.append(algorithmUsed);
		result.append(", parameters: ");
		result.append(parameters);
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
