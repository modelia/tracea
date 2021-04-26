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
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.TraceLinkImpl <em>Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.TraceLinkImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getTraceLink()
	 * @generated
	 */
	int TRACE_LINK = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Confidence Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__CONFIDENCE_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.RelatedToImpl <em>Related To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.RelatedToImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getRelatedTo()
	 * @generated
	 */
	int RELATED_TO = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__ID = TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__NAME = TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Confidence Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__CONFIDENCE_VALUE = TRACE_LINK__CONFIDENCE_VALUE;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__ORIGIN = TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__TARGETS = TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Related To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO_FEATURE_COUNT = TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Related To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO_OPERATION_COUNT = TRACE_LINK_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link org.eclipse.capra.generic.tracemodel.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Link</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.TraceLink
	 * @generated
	 */
	EClass getTraceLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.TraceLink#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.TraceLink#getID()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.TraceLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.TraceLink#getName()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.TraceLink#getConfidenceValue <em>Confidence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence Value</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.TraceLink#getConfidenceValue()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_ConfidenceValue();

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
	 * Returns the meta object for the reference '{@link org.eclipse.capra.generic.tracemodel.RelatedTo#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.RelatedTo#getOrigin()
	 * @see #getRelatedTo()
	 * @generated
	 */
	EReference getRelatedTo_Origin();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.capra.generic.tracemodel.RelatedTo#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.RelatedTo#getTargets()
	 * @see #getRelatedTo()
	 * @generated
	 */
	EReference getRelatedTo_Targets();

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
		 * The meta object literal for the '{@link org.eclipse.capra.generic.tracemodel.impl.TraceLinkImpl <em>Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.generic.tracemodel.impl.TraceLinkImpl
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getTraceLink()
		 * @generated
		 */
		EClass TRACE_LINK = eINSTANCE.getTraceLink();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__ID = eINSTANCE.getTraceLink_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__NAME = eINSTANCE.getTraceLink_Name();

		/**
		 * The meta object literal for the '<em><b>Confidence Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__CONFIDENCE_VALUE = eINSTANCE.getTraceLink_ConfidenceValue();

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
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_TO__ORIGIN = eINSTANCE.getRelatedTo_Origin();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_TO__TARGETS = eINSTANCE.getRelatedTo_Targets();

	}

} //TracemodelPackage
