/**
 */
package tracea.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tracea.TraceaPackage;

import tracea.core.AIEvidence;
import tracea.core.AnnotationEvidence;
import tracea.core.Artefact;
import tracea.core.ArtefactFragment;
import tracea.core.CoreFactory;
import tracea.core.CorePackage;
import tracea.core.Evidence;
import tracea.core.LeafTraceLink;
import tracea.core.NodeTraceLink;
import tracea.core.Referee;
import tracea.core.RuleEvidence;
import tracea.core.Trace;
import tracea.core.TraceLink;
import tracea.core.TrustableElement;

import tracea.granularity.GranularityPackage;

import tracea.granularity.impl.GranularityPackageImpl;

import tracea.impl.TraceaPackageImpl;

import tracea.relationtyping.RelationtypingPackage;

import tracea.relationtyping.impl.RelationtypingPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafTraceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeTraceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artefactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artefactFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refereeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiEvidenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tracea.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorePackageImpl theCorePackage = registeredCorePackage instanceof CorePackageImpl ? (CorePackageImpl)registeredCorePackage : new CorePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TraceaPackage.eNS_URI);
		TraceaPackageImpl theTraceaPackage = (TraceaPackageImpl)(registeredPackage instanceof TraceaPackageImpl ? registeredPackage : TraceaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GranularityPackage.eNS_URI);
		GranularityPackageImpl theGranularityPackage = (GranularityPackageImpl)(registeredPackage instanceof GranularityPackageImpl ? registeredPackage : GranularityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationtypingPackage.eNS_URI);
		RelationtypingPackageImpl theRelationtypingPackage = (RelationtypingPackageImpl)(registeredPackage instanceof RelationtypingPackageImpl ? registeredPackage : RelationtypingPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theTraceaPackage.createPackageContents();
		theGranularityPackage.createPackageContents();
		theRelationtypingPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theTraceaPackage.initializePackageContents();
		theGranularityPackage.initializePackageContents();
		theRelationtypingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_SourceArtefacts() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Targets() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Sources() {
		return (EReference)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Evidences() {
		return (EReference)traceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_TargetArtefacts() {
		return (EReference)traceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Starts() {
		return (EReference)traceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Tracelinks() {
		return (EReference)traceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceLink() {
		return traceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceLink_Source() {
		return (EReference)traceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceLink_Target() {
		return (EReference)traceLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeafTraceLink() {
		return leafTraceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeTraceLink() {
		return nodeTraceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeTraceLink_Successors() {
		return (EReference)nodeTraceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtefact() {
		return artefactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtefact_Fragments() {
		return (EReference)artefactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtefactFragment() {
		return artefactFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtefactFragment_SubFragment() {
		return (EReference)artefactFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidence() {
		return evidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidence_ImpactedElements() {
		return (EReference)evidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferee() {
		return refereeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferee_Name() {
		return (EAttribute)refereeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferee_TrustableElements() {
		return (EReference)refereeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustableElement() {
		return trustableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrustableElement_TimeStamp() {
		return (EAttribute)trustableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrustableElement_Referees() {
		return (EReference)trustableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrustableElement_Name() {
		return (EAttribute)trustableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleEvidence() {
		return ruleEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleEvidence_Rule() {
		return (EAttribute)ruleEvidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleEvidence_ExecutionDate() {
		return (EAttribute)ruleEvidenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationEvidence() {
		return annotationEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationEvidence_Content() {
		return (EAttribute)annotationEvidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAIEvidence() {
		return aiEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAIEvidence_AlgorithmUsed() {
		return (EAttribute)aiEvidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAIEvidence_Parameters() {
		return (EAttribute)aiEvidenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAIEvidence_ExecutionDate() {
		return (EAttribute)aiEvidenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAIEvidence_Precision() {
		return (EAttribute)aiEvidenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAIEvidence_Recall() {
		return (EAttribute)aiEvidenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__SOURCE_ARTEFACTS);
		createEReference(traceEClass, TRACE__TARGETS);
		createEReference(traceEClass, TRACE__SOURCES);
		createEReference(traceEClass, TRACE__EVIDENCES);
		createEReference(traceEClass, TRACE__TARGET_ARTEFACTS);
		createEReference(traceEClass, TRACE__STARTS);
		createEReference(traceEClass, TRACE__TRACELINKS);

		traceLinkEClass = createEClass(TRACE_LINK);
		createEReference(traceLinkEClass, TRACE_LINK__SOURCE);
		createEReference(traceLinkEClass, TRACE_LINK__TARGET);

		leafTraceLinkEClass = createEClass(LEAF_TRACE_LINK);

		nodeTraceLinkEClass = createEClass(NODE_TRACE_LINK);
		createEReference(nodeTraceLinkEClass, NODE_TRACE_LINK__SUCCESSORS);

		artefactEClass = createEClass(ARTEFACT);
		createEReference(artefactEClass, ARTEFACT__FRAGMENTS);

		artefactFragmentEClass = createEClass(ARTEFACT_FRAGMENT);
		createEReference(artefactFragmentEClass, ARTEFACT_FRAGMENT__SUB_FRAGMENT);

		evidenceEClass = createEClass(EVIDENCE);
		createEReference(evidenceEClass, EVIDENCE__IMPACTED_ELEMENTS);

		refereeEClass = createEClass(REFEREE);
		createEAttribute(refereeEClass, REFEREE__NAME);
		createEReference(refereeEClass, REFEREE__TRUSTABLE_ELEMENTS);

		trustableElementEClass = createEClass(TRUSTABLE_ELEMENT);
		createEAttribute(trustableElementEClass, TRUSTABLE_ELEMENT__TIME_STAMP);
		createEReference(trustableElementEClass, TRUSTABLE_ELEMENT__REFEREES);
		createEAttribute(trustableElementEClass, TRUSTABLE_ELEMENT__NAME);

		ruleEvidenceEClass = createEClass(RULE_EVIDENCE);
		createEAttribute(ruleEvidenceEClass, RULE_EVIDENCE__RULE);
		createEAttribute(ruleEvidenceEClass, RULE_EVIDENCE__EXECUTION_DATE);

		annotationEvidenceEClass = createEClass(ANNOTATION_EVIDENCE);
		createEAttribute(annotationEvidenceEClass, ANNOTATION_EVIDENCE__CONTENT);

		aiEvidenceEClass = createEClass(AI_EVIDENCE);
		createEAttribute(aiEvidenceEClass, AI_EVIDENCE__ALGORITHM_USED);
		createEAttribute(aiEvidenceEClass, AI_EVIDENCE__PARAMETERS);
		createEAttribute(aiEvidenceEClass, AI_EVIDENCE__EXECUTION_DATE);
		createEAttribute(aiEvidenceEClass, AI_EVIDENCE__PRECISION);
		createEAttribute(aiEvidenceEClass, AI_EVIDENCE__RECALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RelationtypingPackage theRelationtypingPackage = (RelationtypingPackage)EPackage.Registry.INSTANCE.getEPackage(RelationtypingPackage.eNS_URI);

		// Add supertypes to classes
		traceEClass.getESuperTypes().add(theRelationtypingPackage.getTypedRelationship());
		traceEClass.getESuperTypes().add(this.getTrustableElement());
		traceLinkEClass.getESuperTypes().add(this.getTrustableElement());
		traceLinkEClass.getESuperTypes().add(theRelationtypingPackage.getTypedRelationship());
		leafTraceLinkEClass.getESuperTypes().add(this.getTraceLink());
		nodeTraceLinkEClass.getESuperTypes().add(this.getTraceLink());
		artefactEClass.getESuperTypes().add(this.getTrustableElement());
		artefactFragmentEClass.getESuperTypes().add(this.getTrustableElement());
		evidenceEClass.getESuperTypes().add(this.getTrustableElement());
		ruleEvidenceEClass.getESuperTypes().add(this.getEvidence());
		annotationEvidenceEClass.getESuperTypes().add(this.getEvidence());
		aiEvidenceEClass.getESuperTypes().add(this.getEvidence());

		// Initialize classes and features; add operations and parameters
		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_SourceArtefacts(), this.getArtefact(), null, "sourceArtefacts", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Targets(), this.getArtefactFragment(), null, "targets", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Sources(), this.getArtefactFragment(), null, "sources", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Evidences(), this.getEvidence(), null, "evidences", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_TargetArtefacts(), this.getArtefact(), null, "targetArtefacts", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Starts(), this.getTraceLink(), null, "starts", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Tracelinks(), this.getTraceLink(), null, "tracelinks", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceLinkEClass, TraceLink.class, "TraceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceLink_Source(), this.getArtefactFragment(), null, "source", null, 0, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceLink_Target(), this.getArtefactFragment(), null, "target", null, 0, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leafTraceLinkEClass, LeafTraceLink.class, "LeafTraceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeTraceLinkEClass, NodeTraceLink.class, "NodeTraceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeTraceLink_Successors(), this.getTraceLink(), null, "successors", null, 0, -1, NodeTraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artefactEClass, Artefact.class, "Artefact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtefact_Fragments(), this.getArtefactFragment(), null, "fragments", null, 0, -1, Artefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artefactFragmentEClass, ArtefactFragment.class, "ArtefactFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtefactFragment_SubFragment(), this.getArtefactFragment(), null, "subFragment", null, 0, -1, ArtefactFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evidenceEClass, Evidence.class, "Evidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvidence_ImpactedElements(), this.getTrustableElement(), null, "impactedElements", null, 0, -1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refereeEClass, Referee.class, "Referee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferee_Name(), ecorePackage.getEString(), "name", null, 0, 1, Referee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferee_TrustableElements(), this.getTrustableElement(), null, "trustableElements", null, 0, 1, Referee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trustableElementEClass, TrustableElement.class, "TrustableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrustableElement_TimeStamp(), ecorePackage.getEString(), "timeStamp", null, 0, 1, TrustableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrustableElement_Referees(), this.getReferee(), null, "referees", null, 0, -1, TrustableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrustableElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TrustableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEvidenceEClass, RuleEvidence.class, "RuleEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleEvidence_Rule(), ecorePackage.getEString(), "rule", null, 0, 1, RuleEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleEvidence_ExecutionDate(), ecorePackage.getEDate(), "executionDate", null, 0, 1, RuleEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEvidenceEClass, AnnotationEvidence.class, "AnnotationEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationEvidence_Content(), ecorePackage.getEString(), "content", null, 0, 1, AnnotationEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiEvidenceEClass, AIEvidence.class, "AIEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAIEvidence_AlgorithmUsed(), ecorePackage.getEString(), "algorithmUsed", null, 0, 1, AIEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAIEvidence_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, AIEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAIEvidence_ExecutionDate(), ecorePackage.getEDate(), "executionDate", null, 0, 1, AIEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAIEvidence_Precision(), ecorePackage.getEDouble(), "precision", null, 0, 1, AIEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAIEvidence_Recall(), ecorePackage.getEDouble(), "recall", null, 0, 1, AIEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CorePackageImpl
