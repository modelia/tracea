/**
 */
package tracea;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tracea.TraceaFactory
 * @model kind="package"
 * @generated
 */
public interface TraceaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tracea";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tracea.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracea";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceaPackage eINSTANCE = tracea.impl.TraceaPackageImpl.init();

	/**
	 * The meta object id for the '{@link tracea.impl.TraceaImpl <em>Tracea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.impl.TraceaImpl
	 * @see tracea.impl.TraceaPackageImpl#getTracea()
	 * @generated
	 */
	int TRACEA = 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEA__TRACES = 0;

	/**
	 * The feature id for the '<em><b>Artefacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEA__ARTEFACTS = 1;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEA__REFEREES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEA__NAME = 3;

	/**
	 * The number of structural features of the '<em>Tracea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEA_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link tracea.Tracea <em>Tracea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tracea</em>'.
	 * @see tracea.Tracea
	 * @generated
	 */
	EClass getTracea();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.Tracea#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see tracea.Tracea#getTraces()
	 * @see #getTracea()
	 * @generated
	 */
	EReference getTracea_Traces();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.Tracea#getArtefacts <em>Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artefacts</em>'.
	 * @see tracea.Tracea#getArtefacts()
	 * @see #getTracea()
	 * @generated
	 */
	EReference getTracea_Artefacts();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.Tracea#getReferees <em>Referees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referees</em>'.
	 * @see tracea.Tracea#getReferees()
	 * @see #getTracea()
	 * @generated
	 */
	EReference getTracea_Referees();

	/**
	 * Returns the meta object for the attribute '{@link tracea.Tracea#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tracea.Tracea#getName()
	 * @see #getTracea()
	 * @generated
	 */
	EAttribute getTracea_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceaFactory getTraceaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tracea.impl.TraceaImpl <em>Tracea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.impl.TraceaImpl
		 * @see tracea.impl.TraceaPackageImpl#getTracea()
		 * @generated
		 */
		EClass TRACEA = eINSTANCE.getTracea();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEA__TRACES = eINSTANCE.getTracea_Traces();

		/**
		 * The meta object literal for the '<em><b>Artefacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEA__ARTEFACTS = eINSTANCE.getTracea_Artefacts();

		/**
		 * The meta object literal for the '<em><b>Referees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEA__REFEREES = eINSTANCE.getTracea_Referees();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEA__NAME = eINSTANCE.getTracea_Name();

	}

} //TraceaPackage
