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
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.TracingElementImpl <em>Tracing Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracingElementImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getTracingElement()
	 * @generated
	 */
	int TRACING_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_ELEMENT__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_ELEMENT__AGENTS = 2;

	/**
	 * The number of structural features of the '<em>Tracing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tracing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.TraceLinkImpl <em>Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.TraceLinkImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getTraceLink()
	 * @generated
	 */
	int TRACE_LINK = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__ID = TRACING_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TIMESTAMP = TRACING_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__AGENTS = TRACING_ELEMENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__NAME = TRACING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confidence Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__CONFIDENCE_VALUE = TRACING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__CONFIDENCE = TRACING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_FEATURE_COUNT = TRACING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_OPERATION_COUNT = TRACING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.RelatedToImpl <em>Related To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.RelatedToImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getRelatedTo()
	 * @generated
	 */
	int RELATED_TO = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__ID = TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__TIMESTAMP = TRACE_LINK__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__AGENTS = TRACE_LINK__AGENTS;

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
	 * The feature id for the '<em><b>Confidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__CONFIDENCE = TRACE_LINK__CONFIDENCE;

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
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.AgentImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ID = TRACING_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__TIMESTAMP = TRACING_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__AGENTS = TRACING_ELEMENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = TRACING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = TRACING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = TRACING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.HumanAgentImpl <em>Human Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.HumanAgentImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getHumanAgent()
	 * @generated
	 */
	int HUMAN_AGENT = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__ID = AGENT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__TIMESTAMP = AGENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__AGENTS = AGENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__NAME = AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT__ROLE = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Human Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT_FEATURE_COUNT = AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Human Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_AGENT_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.MachineAgentImpl <em>Machine Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.MachineAgentImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getMachineAgent()
	 * @generated
	 */
	int MACHINE_AGENT = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AGENT__ID = AGENT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AGENT__TIMESTAMP = AGENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AGENT__AGENTS = AGENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AGENT__NAME = AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Machine Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AGENT__MACHINE_TYPE = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Machine Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AGENT_FEATURE_COUNT = AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Machine Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AGENT_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.ConfidenceImpl <em>Confidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.ConfidenceImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getConfidence()
	 * @generated
	 */
	int CONFIDENCE = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__ID = TRACING_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__TIMESTAMP = TRACING_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__AGENTS = TRACING_ELEMENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__EVIDENCE = TRACING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__VALUE = TRACING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Confidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_FEATURE_COUNT = TRACING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Confidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_OPERATION_COUNT = TRACING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.EvidenceImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ID = TRACING_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__TIMESTAMP = TRACING_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__AGENTS = TRACING_ELEMENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DESCRIPTION = TRACING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supporting Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__SUPPORTING_ELEMENTS = TRACING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_FEATURE_COUNT = TRACING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OPERATION_COUNT = TRACING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.AIEvidenceImpl <em>AI Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.AIEvidenceImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getAIEvidence()
	 * @generated
	 */
	int AI_EVIDENCE = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__ID = EVIDENCE__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__TIMESTAMP = EVIDENCE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__AGENTS = EVIDENCE__AGENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__DESCRIPTION = EVIDENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Supporting Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__SUPPORTING_ELEMENTS = EVIDENCE__SUPPORTING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__ALGORITHM = EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__DATA_SET = EVIDENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__EXECUTION_DATE = EVIDENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__PRECISION = EVIDENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Recall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__RECALL = EVIDENCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>AI Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE_FEATURE_COUNT = EVIDENCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>AI Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE_OPERATION_COUNT = EVIDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.RuleEvidenceImpl <em>Rule Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.RuleEvidenceImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getRuleEvidence()
	 * @generated
	 */
	int RULE_EVIDENCE = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE__ID = EVIDENCE__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE__TIMESTAMP = EVIDENCE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE__AGENTS = EVIDENCE__AGENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE__DESCRIPTION = EVIDENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Supporting Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE__SUPPORTING_ELEMENTS = EVIDENCE__SUPPORTING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE__RULE = EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE__EXECUTION_DATE = EVIDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE_FEATURE_COUNT = EVIDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rule Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE_OPERATION_COUNT = EVIDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.generic.tracemodel.impl.AnnotationEvidenceImpl <em>Annotation Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.generic.tracemodel.impl.AnnotationEvidenceImpl
	 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getAnnotationEvidence()
	 * @generated
	 */
	int ANNOTATION_EVIDENCE = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE__ID = EVIDENCE__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE__TIMESTAMP = EVIDENCE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE__AGENTS = EVIDENCE__AGENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE__DESCRIPTION = EVIDENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Supporting Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE__SUPPORTING_ELEMENTS = EVIDENCE__SUPPORTING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE__EXPLANATION = EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE_FEATURE_COUNT = EVIDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Annotation Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE_OPERATION_COUNT = EVIDENCE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link org.eclipse.capra.generic.tracemodel.TracingElement <em>Tracing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tracing Element</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.TracingElement
	 * @generated
	 */
	EClass getTracingElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.TracingElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.TracingElement#getID()
	 * @see #getTracingElement()
	 * @generated
	 */
	EAttribute getTracingElement_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.TracingElement#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.TracingElement#getTimestamp()
	 * @see #getTracingElement()
	 * @generated
	 */
	EAttribute getTracingElement_Timestamp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capra.generic.tracemodel.TracingElement#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.TracingElement#getAgents()
	 * @see #getTracingElement()
	 * @generated
	 */
	EReference getTracingElement_Agents();

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
	 * Returns the meta object for the containment reference '{@link org.eclipse.capra.generic.tracemodel.TraceLink#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidence</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.TraceLink#getConfidence()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Confidence();

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
	 * Returns the meta object for class '{@link org.eclipse.capra.generic.tracemodel.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.Agent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.Agent#getName()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capra.generic.tracemodel.HumanAgent <em>Human Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Agent</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.HumanAgent
	 * @generated
	 */
	EClass getHumanAgent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.HumanAgent#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.HumanAgent#getRole()
	 * @see #getHumanAgent()
	 * @generated
	 */
	EAttribute getHumanAgent_Role();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capra.generic.tracemodel.MachineAgent <em>Machine Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Agent</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.MachineAgent
	 * @generated
	 */
	EClass getMachineAgent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.MachineAgent#getMachineType <em>Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Type</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.MachineAgent#getMachineType()
	 * @see #getMachineAgent()
	 * @generated
	 */
	EAttribute getMachineAgent_MachineType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capra.generic.tracemodel.Confidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confidence</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.Confidence
	 * @generated
	 */
	EClass getConfidence();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.capra.generic.tracemodel.Confidence#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evidence</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.Confidence#getEvidence()
	 * @see #getConfidence()
	 * @generated
	 */
	EReference getConfidence_Evidence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.Confidence#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.Confidence#getValue()
	 * @see #getConfidence()
	 * @generated
	 */
	EAttribute getConfidence_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capra.generic.tracemodel.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.Evidence
	 * @generated
	 */
	EClass getEvidence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.Evidence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.Evidence#getDescription()
	 * @see #getEvidence()
	 * @generated
	 */
	EAttribute getEvidence_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.capra.generic.tracemodel.Evidence#getSupportingElements <em>Supporting Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supporting Elements</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.Evidence#getSupportingElements()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_SupportingElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capra.generic.tracemodel.AIEvidence <em>AI Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Evidence</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.AIEvidence
	 * @generated
	 */
	EClass getAIEvidence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.AIEvidence#getAlgorithm()
	 * @see #getAIEvidence()
	 * @generated
	 */
	EAttribute getAIEvidence_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Set</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.AIEvidence#getDataSet()
	 * @see #getAIEvidence()
	 * @generated
	 */
	EAttribute getAIEvidence_DataSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getExecutionDate <em>Execution Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Date</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.AIEvidence#getExecutionDate()
	 * @see #getAIEvidence()
	 * @generated
	 */
	EAttribute getAIEvidence_ExecutionDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.AIEvidence#getPrecision()
	 * @see #getAIEvidence()
	 * @generated
	 */
	EAttribute getAIEvidence_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.AIEvidence#getRecall <em>Recall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recall</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.AIEvidence#getRecall()
	 * @see #getAIEvidence()
	 * @generated
	 */
	EAttribute getAIEvidence_Recall();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capra.generic.tracemodel.RuleEvidence <em>Rule Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Evidence</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.RuleEvidence
	 * @generated
	 */
	EClass getRuleEvidence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.RuleEvidence#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.RuleEvidence#getRule()
	 * @see #getRuleEvidence()
	 * @generated
	 */
	EAttribute getRuleEvidence_Rule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.RuleEvidence#getExecutionDate <em>Execution Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Date</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.RuleEvidence#getExecutionDate()
	 * @see #getRuleEvidence()
	 * @generated
	 */
	EAttribute getRuleEvidence_ExecutionDate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capra.generic.tracemodel.AnnotationEvidence <em>Annotation Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Evidence</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.AnnotationEvidence
	 * @generated
	 */
	EClass getAnnotationEvidence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capra.generic.tracemodel.AnnotationEvidence#getExplanation <em>Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explanation</em>'.
	 * @see org.eclipse.capra.generic.tracemodel.AnnotationEvidence#getExplanation()
	 * @see #getAnnotationEvidence()
	 * @generated
	 */
	EAttribute getAnnotationEvidence_Explanation();

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
		 * The meta object literal for the '{@link org.eclipse.capra.generic.tracemodel.impl.TracingElementImpl <em>Tracing Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracingElementImpl
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getTracingElement()
		 * @generated
		 */
		EClass TRACING_ELEMENT = eINSTANCE.getTracingElement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_ELEMENT__ID = eINSTANCE.getTracingElement_ID();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_ELEMENT__TIMESTAMP = eINSTANCE.getTracingElement_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACING_ELEMENT__AGENTS = eINSTANCE.getTracingElement_Agents();

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
		 * The meta object literal for the '<em><b>Confidence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__CONFIDENCE = eINSTANCE.getTraceLink_Confidence();

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

		/**
		 * The meta object literal for the '{@link org.eclipse.capra.generic.tracemodel.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.generic.tracemodel.impl.AgentImpl
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.capra.generic.tracemodel.impl.HumanAgentImpl <em>Human Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.generic.tracemodel.impl.HumanAgentImpl
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getHumanAgent()
		 * @generated
		 */
		EClass HUMAN_AGENT = eINSTANCE.getHumanAgent();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_AGENT__ROLE = eINSTANCE.getHumanAgent_Role();

		/**
		 * The meta object literal for the '{@link org.eclipse.capra.generic.tracemodel.impl.MachineAgentImpl <em>Machine Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.generic.tracemodel.impl.MachineAgentImpl
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getMachineAgent()
		 * @generated
		 */
		EClass MACHINE_AGENT = eINSTANCE.getMachineAgent();

		/**
		 * The meta object literal for the '<em><b>Machine Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AGENT__MACHINE_TYPE = eINSTANCE.getMachineAgent_MachineType();

		/**
		 * The meta object literal for the '{@link org.eclipse.capra.generic.tracemodel.impl.ConfidenceImpl <em>Confidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.generic.tracemodel.impl.ConfidenceImpl
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getConfidence()
		 * @generated
		 */
		EClass CONFIDENCE = eINSTANCE.getConfidence();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENCE__EVIDENCE = eINSTANCE.getConfidence_Evidence();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIDENCE__VALUE = eINSTANCE.getConfidence_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.capra.generic.tracemodel.impl.EvidenceImpl <em>Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.generic.tracemodel.impl.EvidenceImpl
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getEvidence()
		 * @generated
		 */
		EClass EVIDENCE = eINSTANCE.getEvidence();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE__DESCRIPTION = eINSTANCE.getEvidence_Description();

		/**
		 * The meta object literal for the '<em><b>Supporting Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__SUPPORTING_ELEMENTS = eINSTANCE.getEvidence_SupportingElements();

		/**
		 * The meta object literal for the '{@link org.eclipse.capra.generic.tracemodel.impl.AIEvidenceImpl <em>AI Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.generic.tracemodel.impl.AIEvidenceImpl
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getAIEvidence()
		 * @generated
		 */
		EClass AI_EVIDENCE = eINSTANCE.getAIEvidence();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_EVIDENCE__ALGORITHM = eINSTANCE.getAIEvidence_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Data Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_EVIDENCE__DATA_SET = eINSTANCE.getAIEvidence_DataSet();

		/**
		 * The meta object literal for the '<em><b>Execution Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_EVIDENCE__EXECUTION_DATE = eINSTANCE.getAIEvidence_ExecutionDate();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_EVIDENCE__PRECISION = eINSTANCE.getAIEvidence_Precision();

		/**
		 * The meta object literal for the '<em><b>Recall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_EVIDENCE__RECALL = eINSTANCE.getAIEvidence_Recall();

		/**
		 * The meta object literal for the '{@link org.eclipse.capra.generic.tracemodel.impl.RuleEvidenceImpl <em>Rule Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.generic.tracemodel.impl.RuleEvidenceImpl
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getRuleEvidence()
		 * @generated
		 */
		EClass RULE_EVIDENCE = eINSTANCE.getRuleEvidence();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_EVIDENCE__RULE = eINSTANCE.getRuleEvidence_Rule();

		/**
		 * The meta object literal for the '<em><b>Execution Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_EVIDENCE__EXECUTION_DATE = eINSTANCE.getRuleEvidence_ExecutionDate();

		/**
		 * The meta object literal for the '{@link org.eclipse.capra.generic.tracemodel.impl.AnnotationEvidenceImpl <em>Annotation Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.generic.tracemodel.impl.AnnotationEvidenceImpl
		 * @see org.eclipse.capra.generic.tracemodel.impl.TracemodelPackageImpl#getAnnotationEvidence()
		 * @generated
		 */
		EClass ANNOTATION_EVIDENCE = eINSTANCE.getAnnotationEvidence();

		/**
		 * The meta object literal for the '<em><b>Explanation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_EVIDENCE__EXPLANATION = eINSTANCE.getAnnotationEvidence_Explanation();

	}

} //TracemodelPackage
