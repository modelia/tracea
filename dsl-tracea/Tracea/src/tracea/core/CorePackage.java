/**
 */
package tracea.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tracea.relationtyping.RelationtypingPackage;

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
 * @see tracea.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tracea.ecore.core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = tracea.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link tracea.core.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.core.impl.TraceImpl
	 * @see tracea.core.impl.CorePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Relationshiptype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__RELATIONSHIPTYPE = RelationtypingPackage.TYPED_RELATIONSHIP__RELATIONSHIPTYPE;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TIME_STAMP = RelationtypingPackage.TYPED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__REFEREES = RelationtypingPackage.TYPED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NAME = RelationtypingPackage.TYPED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Artefacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCE_ARTEFACTS = RelationtypingPackage.TYPED_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGETS = RelationtypingPackage.TYPED_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCES = RelationtypingPackage.TYPED_RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Evidences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__EVIDENCES = RelationtypingPackage.TYPED_RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Artefacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGET_ARTEFACTS = RelationtypingPackage.TYPED_RELATIONSHIP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Starts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STARTS = RelationtypingPackage.TYPED_RELATIONSHIP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tracelinks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TRACELINKS = RelationtypingPackage.TYPED_RELATIONSHIP_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = RelationtypingPackage.TYPED_RELATIONSHIP_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link tracea.core.impl.TrustableElementImpl <em>Trustable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.core.impl.TrustableElementImpl
	 * @see tracea.core.impl.CorePackageImpl#getTrustableElement()
	 * @generated
	 */
	int TRUSTABLE_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTABLE_ELEMENT__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTABLE_ELEMENT__REFEREES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTABLE_ELEMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Trustable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTABLE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link tracea.core.impl.TraceLinkImpl <em>Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.core.impl.TraceLinkImpl
	 * @see tracea.core.impl.CorePackageImpl#getTraceLink()
	 * @generated
	 */
	int TRACE_LINK = 1;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TIME_STAMP = TRUSTABLE_ELEMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__REFEREES = TRUSTABLE_ELEMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__NAME = TRUSTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationshiptype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__RELATIONSHIPTYPE = TRUSTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__SOURCE = TRUSTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TARGET = TRUSTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_FEATURE_COUNT = TRUSTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link tracea.core.impl.LeafTraceLinkImpl <em>Leaf Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.core.impl.LeafTraceLinkImpl
	 * @see tracea.core.impl.CorePackageImpl#getLeafTraceLink()
	 * @generated
	 */
	int LEAF_TRACE_LINK = 2;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TRACE_LINK__TIME_STAMP = TRACE_LINK__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TRACE_LINK__REFEREES = TRACE_LINK__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TRACE_LINK__NAME = TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Relationshiptype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TRACE_LINK__RELATIONSHIPTYPE = TRACE_LINK__RELATIONSHIPTYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TRACE_LINK__SOURCE = TRACE_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TRACE_LINK__TARGET = TRACE_LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Leaf Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_TRACE_LINK_FEATURE_COUNT = TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.core.impl.NodeTraceLinkImpl <em>Node Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.core.impl.NodeTraceLinkImpl
	 * @see tracea.core.impl.CorePackageImpl#getNodeTraceLink()
	 * @generated
	 */
	int NODE_TRACE_LINK = 3;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TRACE_LINK__TIME_STAMP = TRACE_LINK__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TRACE_LINK__REFEREES = TRACE_LINK__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TRACE_LINK__NAME = TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Relationshiptype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TRACE_LINK__RELATIONSHIPTYPE = TRACE_LINK__RELATIONSHIPTYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TRACE_LINK__SOURCE = TRACE_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TRACE_LINK__TARGET = TRACE_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TRACE_LINK__SUCCESSORS = TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TRACE_LINK_FEATURE_COUNT = TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tracea.core.impl.ArtefactImpl <em>Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.core.impl.ArtefactImpl
	 * @see tracea.core.impl.CorePackageImpl#getArtefact()
	 * @generated
	 */
	int ARTEFACT = 4;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__TIME_STAMP = TRUSTABLE_ELEMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__REFEREES = TRUSTABLE_ELEMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__NAME = TRUSTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__FRAGMENTS = TRUSTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_FEATURE_COUNT = TRUSTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tracea.core.impl.ArtefactFragmentImpl <em>Artefact Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.core.impl.ArtefactFragmentImpl
	 * @see tracea.core.impl.CorePackageImpl#getArtefactFragment()
	 * @generated
	 */
	int ARTEFACT_FRAGMENT = 5;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_FRAGMENT__TIME_STAMP = TRUSTABLE_ELEMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_FRAGMENT__REFEREES = TRUSTABLE_ELEMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_FRAGMENT__NAME = TRUSTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_FRAGMENT__SUB_FRAGMENT = TRUSTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artefact Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_FRAGMENT_FEATURE_COUNT = TRUSTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tracea.core.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.core.impl.EvidenceImpl
	 * @see tracea.core.impl.CorePackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 6;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__TIME_STAMP = TRUSTABLE_ELEMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__REFEREES = TRUSTABLE_ELEMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__NAME = TRUSTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Impacted Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__IMPACTED_ELEMENTS = TRUSTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_FEATURE_COUNT = TRUSTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tracea.core.impl.RefereeImpl <em>Referee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.core.impl.RefereeImpl
	 * @see tracea.core.impl.CorePackageImpl#getReferee()
	 * @generated
	 */
	int REFEREE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFEREE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Trustable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFEREE__TRUSTABLE_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Referee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFEREE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link tracea.core.impl.RuleEvidenceImpl <em>Rule Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.core.impl.RuleEvidenceImpl
	 * @see tracea.core.impl.CorePackageImpl#getRuleEvidence()
	 * @generated
	 */
	int RULE_EVIDENCE = 9;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE__TIME_STAMP = EVIDENCE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE__REFEREES = EVIDENCE__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE__NAME = EVIDENCE__NAME;

	/**
	 * The feature id for the '<em><b>Impacted Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EVIDENCE__IMPACTED_ELEMENTS = EVIDENCE__IMPACTED_ELEMENTS;

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
	 * The meta object id for the '{@link tracea.core.impl.AnnotationEvidenceImpl <em>Annotation Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.core.impl.AnnotationEvidenceImpl
	 * @see tracea.core.impl.CorePackageImpl#getAnnotationEvidence()
	 * @generated
	 */
	int ANNOTATION_EVIDENCE = 10;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE__TIME_STAMP = EVIDENCE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE__REFEREES = EVIDENCE__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE__NAME = EVIDENCE__NAME;

	/**
	 * The feature id for the '<em><b>Impacted Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE__IMPACTED_ELEMENTS = EVIDENCE__IMPACTED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE__CONTENT = EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EVIDENCE_FEATURE_COUNT = EVIDENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tracea.core.impl.AIEvidenceImpl <em>AI Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.core.impl.AIEvidenceImpl
	 * @see tracea.core.impl.CorePackageImpl#getAIEvidence()
	 * @generated
	 */
	int AI_EVIDENCE = 11;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__TIME_STAMP = EVIDENCE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__REFEREES = EVIDENCE__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__NAME = EVIDENCE__NAME;

	/**
	 * The feature id for the '<em><b>Impacted Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__IMPACTED_ELEMENTS = EVIDENCE__IMPACTED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Algorithm Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__ALGORITHM_USED = EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_EVIDENCE__PARAMETERS = EVIDENCE_FEATURE_COUNT + 1;

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
	 * Returns the meta object for class '{@link tracea.core.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see tracea.core.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link tracea.core.Trace#getSourceArtefacts <em>Source Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Artefacts</em>'.
	 * @see tracea.core.Trace#getSourceArtefacts()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_SourceArtefacts();

	/**
	 * Returns the meta object for the reference list '{@link tracea.core.Trace#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see tracea.core.Trace#getTargets()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Targets();

	/**
	 * Returns the meta object for the reference list '{@link tracea.core.Trace#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see tracea.core.Trace#getSources()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.core.Trace#getEvidences <em>Evidences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidences</em>'.
	 * @see tracea.core.Trace#getEvidences()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Evidences();

	/**
	 * Returns the meta object for the reference list '{@link tracea.core.Trace#getTargetArtefacts <em>Target Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Artefacts</em>'.
	 * @see tracea.core.Trace#getTargetArtefacts()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_TargetArtefacts();

	/**
	 * Returns the meta object for the reference list '{@link tracea.core.Trace#getStarts <em>Starts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Starts</em>'.
	 * @see tracea.core.Trace#getStarts()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Starts();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.core.Trace#getTracelinks <em>Tracelinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracelinks</em>'.
	 * @see tracea.core.Trace#getTracelinks()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Tracelinks();

	/**
	 * Returns the meta object for class '{@link tracea.core.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Link</em>'.
	 * @see tracea.core.TraceLink
	 * @generated
	 */
	EClass getTraceLink();

	/**
	 * Returns the meta object for the reference '{@link tracea.core.TraceLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see tracea.core.TraceLink#getSource()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Source();

	/**
	 * Returns the meta object for the reference '{@link tracea.core.TraceLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see tracea.core.TraceLink#getTarget()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Target();

	/**
	 * Returns the meta object for class '{@link tracea.core.LeafTraceLink <em>Leaf Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Trace Link</em>'.
	 * @see tracea.core.LeafTraceLink
	 * @generated
	 */
	EClass getLeafTraceLink();

	/**
	 * Returns the meta object for class '{@link tracea.core.NodeTraceLink <em>Node Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Trace Link</em>'.
	 * @see tracea.core.NodeTraceLink
	 * @generated
	 */
	EClass getNodeTraceLink();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.core.NodeTraceLink#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Successors</em>'.
	 * @see tracea.core.NodeTraceLink#getSuccessors()
	 * @see #getNodeTraceLink()
	 * @generated
	 */
	EReference getNodeTraceLink_Successors();

	/**
	 * Returns the meta object for class '{@link tracea.core.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefact</em>'.
	 * @see tracea.core.Artefact
	 * @generated
	 */
	EClass getArtefact();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.core.Artefact#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see tracea.core.Artefact#getFragments()
	 * @see #getArtefact()
	 * @generated
	 */
	EReference getArtefact_Fragments();

	/**
	 * Returns the meta object for class '{@link tracea.core.ArtefactFragment <em>Artefact Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefact Fragment</em>'.
	 * @see tracea.core.ArtefactFragment
	 * @generated
	 */
	EClass getArtefactFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.core.ArtefactFragment#getSubFragment <em>Sub Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Fragment</em>'.
	 * @see tracea.core.ArtefactFragment#getSubFragment()
	 * @see #getArtefactFragment()
	 * @generated
	 */
	EReference getArtefactFragment_SubFragment();

	/**
	 * Returns the meta object for class '{@link tracea.core.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence</em>'.
	 * @see tracea.core.Evidence
	 * @generated
	 */
	EClass getEvidence();

	/**
	 * Returns the meta object for the reference list '{@link tracea.core.Evidence#getImpactedElements <em>Impacted Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Impacted Elements</em>'.
	 * @see tracea.core.Evidence#getImpactedElements()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_ImpactedElements();

	/**
	 * Returns the meta object for class '{@link tracea.core.Referee <em>Referee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referee</em>'.
	 * @see tracea.core.Referee
	 * @generated
	 */
	EClass getReferee();

	/**
	 * Returns the meta object for the attribute '{@link tracea.core.Referee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tracea.core.Referee#getName()
	 * @see #getReferee()
	 * @generated
	 */
	EAttribute getReferee_Name();

	/**
	 * Returns the meta object for the reference '{@link tracea.core.Referee#getTrustableElements <em>Trustable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trustable Elements</em>'.
	 * @see tracea.core.Referee#getTrustableElements()
	 * @see #getReferee()
	 * @generated
	 */
	EReference getReferee_TrustableElements();

	/**
	 * Returns the meta object for class '{@link tracea.core.TrustableElement <em>Trustable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trustable Element</em>'.
	 * @see tracea.core.TrustableElement
	 * @generated
	 */
	EClass getTrustableElement();

	/**
	 * Returns the meta object for the attribute '{@link tracea.core.TrustableElement#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see tracea.core.TrustableElement#getTimeStamp()
	 * @see #getTrustableElement()
	 * @generated
	 */
	EAttribute getTrustableElement_TimeStamp();

	/**
	 * Returns the meta object for the reference list '{@link tracea.core.TrustableElement#getReferees <em>Referees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referees</em>'.
	 * @see tracea.core.TrustableElement#getReferees()
	 * @see #getTrustableElement()
	 * @generated
	 */
	EReference getTrustableElement_Referees();

	/**
	 * Returns the meta object for the attribute '{@link tracea.core.TrustableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tracea.core.TrustableElement#getName()
	 * @see #getTrustableElement()
	 * @generated
	 */
	EAttribute getTrustableElement_Name();

	/**
	 * Returns the meta object for class '{@link tracea.core.RuleEvidence <em>Rule Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Evidence</em>'.
	 * @see tracea.core.RuleEvidence
	 * @generated
	 */
	EClass getRuleEvidence();

	/**
	 * Returns the meta object for the attribute '{@link tracea.core.RuleEvidence#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule</em>'.
	 * @see tracea.core.RuleEvidence#getRule()
	 * @see #getRuleEvidence()
	 * @generated
	 */
	EAttribute getRuleEvidence_Rule();

	/**
	 * Returns the meta object for the attribute '{@link tracea.core.RuleEvidence#getExecutionDate <em>Execution Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Date</em>'.
	 * @see tracea.core.RuleEvidence#getExecutionDate()
	 * @see #getRuleEvidence()
	 * @generated
	 */
	EAttribute getRuleEvidence_ExecutionDate();

	/**
	 * Returns the meta object for class '{@link tracea.core.AnnotationEvidence <em>Annotation Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Evidence</em>'.
	 * @see tracea.core.AnnotationEvidence
	 * @generated
	 */
	EClass getAnnotationEvidence();

	/**
	 * Returns the meta object for the attribute '{@link tracea.core.AnnotationEvidence#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see tracea.core.AnnotationEvidence#getContent()
	 * @see #getAnnotationEvidence()
	 * @generated
	 */
	EAttribute getAnnotationEvidence_Content();

	/**
	 * Returns the meta object for class '{@link tracea.core.AIEvidence <em>AI Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Evidence</em>'.
	 * @see tracea.core.AIEvidence
	 * @generated
	 */
	EClass getAIEvidence();

	/**
	 * Returns the meta object for the attribute '{@link tracea.core.AIEvidence#getAlgorithmUsed <em>Algorithm Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm Used</em>'.
	 * @see tracea.core.AIEvidence#getAlgorithmUsed()
	 * @see #getAIEvidence()
	 * @generated
	 */
	EAttribute getAIEvidence_AlgorithmUsed();

	/**
	 * Returns the meta object for the attribute list '{@link tracea.core.AIEvidence#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see tracea.core.AIEvidence#getParameters()
	 * @see #getAIEvidence()
	 * @generated
	 */
	EAttribute getAIEvidence_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link tracea.core.AIEvidence#getExecutionDate <em>Execution Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Date</em>'.
	 * @see tracea.core.AIEvidence#getExecutionDate()
	 * @see #getAIEvidence()
	 * @generated
	 */
	EAttribute getAIEvidence_ExecutionDate();

	/**
	 * Returns the meta object for the attribute '{@link tracea.core.AIEvidence#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see tracea.core.AIEvidence#getPrecision()
	 * @see #getAIEvidence()
	 * @generated
	 */
	EAttribute getAIEvidence_Precision();

	/**
	 * Returns the meta object for the attribute '{@link tracea.core.AIEvidence#getRecall <em>Recall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recall</em>'.
	 * @see tracea.core.AIEvidence#getRecall()
	 * @see #getAIEvidence()
	 * @generated
	 */
	EAttribute getAIEvidence_Recall();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link tracea.core.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.core.impl.TraceImpl
		 * @see tracea.core.impl.CorePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Source Artefacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SOURCE_ARTEFACTS = eINSTANCE.getTrace_SourceArtefacts();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TARGETS = eINSTANCE.getTrace_Targets();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SOURCES = eINSTANCE.getTrace_Sources();

		/**
		 * The meta object literal for the '<em><b>Evidences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__EVIDENCES = eINSTANCE.getTrace_Evidences();

		/**
		 * The meta object literal for the '<em><b>Target Artefacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TARGET_ARTEFACTS = eINSTANCE.getTrace_TargetArtefacts();

		/**
		 * The meta object literal for the '<em><b>Starts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STARTS = eINSTANCE.getTrace_Starts();

		/**
		 * The meta object literal for the '<em><b>Tracelinks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TRACELINKS = eINSTANCE.getTrace_Tracelinks();

		/**
		 * The meta object literal for the '{@link tracea.core.impl.TraceLinkImpl <em>Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.core.impl.TraceLinkImpl
		 * @see tracea.core.impl.CorePackageImpl#getTraceLink()
		 * @generated
		 */
		EClass TRACE_LINK = eINSTANCE.getTraceLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__SOURCE = eINSTANCE.getTraceLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__TARGET = eINSTANCE.getTraceLink_Target();

		/**
		 * The meta object literal for the '{@link tracea.core.impl.LeafTraceLinkImpl <em>Leaf Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.core.impl.LeafTraceLinkImpl
		 * @see tracea.core.impl.CorePackageImpl#getLeafTraceLink()
		 * @generated
		 */
		EClass LEAF_TRACE_LINK = eINSTANCE.getLeafTraceLink();

		/**
		 * The meta object literal for the '{@link tracea.core.impl.NodeTraceLinkImpl <em>Node Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.core.impl.NodeTraceLinkImpl
		 * @see tracea.core.impl.CorePackageImpl#getNodeTraceLink()
		 * @generated
		 */
		EClass NODE_TRACE_LINK = eINSTANCE.getNodeTraceLink();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TRACE_LINK__SUCCESSORS = eINSTANCE.getNodeTraceLink_Successors();

		/**
		 * The meta object literal for the '{@link tracea.core.impl.ArtefactImpl <em>Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.core.impl.ArtefactImpl
		 * @see tracea.core.impl.CorePackageImpl#getArtefact()
		 * @generated
		 */
		EClass ARTEFACT = eINSTANCE.getArtefact();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTEFACT__FRAGMENTS = eINSTANCE.getArtefact_Fragments();

		/**
		 * The meta object literal for the '{@link tracea.core.impl.ArtefactFragmentImpl <em>Artefact Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.core.impl.ArtefactFragmentImpl
		 * @see tracea.core.impl.CorePackageImpl#getArtefactFragment()
		 * @generated
		 */
		EClass ARTEFACT_FRAGMENT = eINSTANCE.getArtefactFragment();

		/**
		 * The meta object literal for the '<em><b>Sub Fragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTEFACT_FRAGMENT__SUB_FRAGMENT = eINSTANCE.getArtefactFragment_SubFragment();

		/**
		 * The meta object literal for the '{@link tracea.core.impl.EvidenceImpl <em>Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.core.impl.EvidenceImpl
		 * @see tracea.core.impl.CorePackageImpl#getEvidence()
		 * @generated
		 */
		EClass EVIDENCE = eINSTANCE.getEvidence();

		/**
		 * The meta object literal for the '<em><b>Impacted Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__IMPACTED_ELEMENTS = eINSTANCE.getEvidence_ImpactedElements();

		/**
		 * The meta object literal for the '{@link tracea.core.impl.RefereeImpl <em>Referee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.core.impl.RefereeImpl
		 * @see tracea.core.impl.CorePackageImpl#getReferee()
		 * @generated
		 */
		EClass REFEREE = eINSTANCE.getReferee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFEREE__NAME = eINSTANCE.getReferee_Name();

		/**
		 * The meta object literal for the '<em><b>Trustable Elements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFEREE__TRUSTABLE_ELEMENTS = eINSTANCE.getReferee_TrustableElements();

		/**
		 * The meta object literal for the '{@link tracea.core.impl.TrustableElementImpl <em>Trustable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.core.impl.TrustableElementImpl
		 * @see tracea.core.impl.CorePackageImpl#getTrustableElement()
		 * @generated
		 */
		EClass TRUSTABLE_ELEMENT = eINSTANCE.getTrustableElement();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUSTABLE_ELEMENT__TIME_STAMP = eINSTANCE.getTrustableElement_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Referees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUSTABLE_ELEMENT__REFEREES = eINSTANCE.getTrustableElement_Referees();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUSTABLE_ELEMENT__NAME = eINSTANCE.getTrustableElement_Name();

		/**
		 * The meta object literal for the '{@link tracea.core.impl.RuleEvidenceImpl <em>Rule Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.core.impl.RuleEvidenceImpl
		 * @see tracea.core.impl.CorePackageImpl#getRuleEvidence()
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
		 * The meta object literal for the '{@link tracea.core.impl.AnnotationEvidenceImpl <em>Annotation Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.core.impl.AnnotationEvidenceImpl
		 * @see tracea.core.impl.CorePackageImpl#getAnnotationEvidence()
		 * @generated
		 */
		EClass ANNOTATION_EVIDENCE = eINSTANCE.getAnnotationEvidence();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_EVIDENCE__CONTENT = eINSTANCE.getAnnotationEvidence_Content();

		/**
		 * The meta object literal for the '{@link tracea.core.impl.AIEvidenceImpl <em>AI Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.core.impl.AIEvidenceImpl
		 * @see tracea.core.impl.CorePackageImpl#getAIEvidence()
		 * @generated
		 */
		EClass AI_EVIDENCE = eINSTANCE.getAIEvidence();

		/**
		 * The meta object literal for the '<em><b>Algorithm Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_EVIDENCE__ALGORITHM_USED = eINSTANCE.getAIEvidence_AlgorithmUsed();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_EVIDENCE__PARAMETERS = eINSTANCE.getAIEvidence_Parameters();

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

	}

} //CorePackage
