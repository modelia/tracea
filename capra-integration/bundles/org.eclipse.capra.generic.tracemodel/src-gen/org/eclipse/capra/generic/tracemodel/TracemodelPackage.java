/**
 */
package org.eclipse.capra.generic.tracemodel;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.capra.generic.tracemodel.TracemodelFactory
 * @model kind="package"
 * @generated
 */
public interface TracemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tracemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.capra.generic.tracemodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracemodelPackage eINSTANCE = org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.GenericTraceModelImpl <em>Generic Trace Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.GenericTraceModelImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getGenericTraceModel()
	 * @generated
	 */
	int GENERIC_TRACE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TRACE_MODEL__TRACES = 0;

	/**
	 * The number of structural features of the '<em>Generic Trace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TRACE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Generic Trace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TRACE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.RelatedToImpl <em>Related To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.RelatedToImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getRelatedTo()
	 * @generated
	 */
	int RELATED_TO = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__ITEM = 2;

	/**
	 * The number of structural features of the '<em>Related To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Related To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.capra.generic.tracemodel.GenericTraceModel <em>Generic Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Trace Model</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.GenericTraceModel
	 * @generated
	 */
	EClass getGenericTraceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capra.generic.tracemodel.GenericTraceModel#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.GenericTraceModel#getTraces()
	 * @see #getGenericTraceModel()
	 * @generated
	 */
	EReference getGenericTraceModel_Traces();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capra.generic.tracemodel.RelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related To</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.RelatedTo
	 * @generated
	 */
	EClass getRelatedTo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.RelatedTo#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.RelatedTo#getID()
	 * @see #getRelatedTo()
	 * @generated
	 */
	EAttribute getRelatedTo_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.RelatedTo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.RelatedTo#getName()
	 * @see #getRelatedTo()
	 * @generated
	 */
	EAttribute getRelatedTo_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.capra.generic.tracemodel.RelatedTo#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.RelatedTo#getItem()
	 * @see #getRelatedTo()
	 * @generated
	 */
	EReference getRelatedTo_Item();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TracemodelFactory getTracemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.capra.generic.tracemodel.impl.GenericTraceModelImpl <em>Generic Trace Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.generic.tracemodel.impl.GenericTraceModelImpl
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getGenericTraceModel()
		 * @generated
		 */
		EClass GENERIC_TRACE_MODEL = eINSTANCE.getGenericTraceModel();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TRACE_MODEL__TRACES = eINSTANCE.getGenericTraceModel_Traces();

		/**
		 * The meta object literal for the '{@link org.eclipse.capra.generic.tracemodel.impl.RelatedToImpl <em>Related To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.generic.tracemodel.impl.RelatedToImpl
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getRelatedTo()
		 * @generated
		 */
		EClass RELATED_TO = eINSTANCE.getRelatedTo();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATED_TO__ID = eINSTANCE.getRelatedTo_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATED_TO__NAME = eINSTANCE.getRelatedTo_Name();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_TO__ITEM = eINSTANCE.getRelatedTo_Item();

	}

} //TracemodelPackage
