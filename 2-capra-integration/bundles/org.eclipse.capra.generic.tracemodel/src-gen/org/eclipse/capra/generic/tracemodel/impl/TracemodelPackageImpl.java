/**
 */
package org.eclipse.capra.generic.tracemodel.impl;

import org.eclipse.capra.generic.tracemodel.AIEvidence;
import org.eclipse.capra.generic.tracemodel.Agent;
import org.eclipse.capra.generic.tracemodel.AnnotationEvidence;
import org.eclipse.capra.generic.tracemodel.Confidence;
import org.eclipse.capra.generic.tracemodel.Evidence;
import org.eclipse.capra.generic.tracemodel.GenericTraceModel;
import org.eclipse.capra.generic.tracemodel.HumanAgent;
import org.eclipse.capra.generic.tracemodel.MachineAgent;
import org.eclipse.capra.generic.tracemodel.RelatedTo;
import org.eclipse.capra.generic.tracemodel.RuleEvidence;
import org.eclipse.capra.generic.tracemodel.TraceLink;
import org.eclipse.capra.generic.tracemodel.TracemodelFactory;
import org.eclipse.capra.generic.tracemodel.TracemodelPackage;
import org.eclipse.capra.generic.tracemodel.TracingElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracemodelPackageImpl extends EPackageImpl implements TracemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericTraceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracingElementEClass = null;

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
	private EClass relatedToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confidenceEClass = null;

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
	private EClass aiEvidenceEClass = null;

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
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TracemodelPackageImpl() {
		super(eNS_URI, TracemodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TracemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TracemodelPackage init() {
		if (isInited) return (TracemodelPackage)EPackage.Registry.INSTANCE.getEPackage(TracemodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTracemodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TracemodelPackageImpl theTracemodelPackage = registeredTracemodelPackage instanceof TracemodelPackageImpl ? (TracemodelPackageImpl)registeredTracemodelPackage : new TracemodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTracemodelPackage.createPackageContents();

		// Initialize created meta-data
		theTracemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTracemodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TracemodelPackage.eNS_URI, theTracemodelPackage);
		return theTracemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericTraceModel() {
		return genericTraceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericTraceModel_Traces() {
		return (EReference)genericTraceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracingElement() {
		return tracingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracingElement_ID() {
		return (EAttribute)tracingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracingElement_Timestamp() {
		return (EAttribute)tracingElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracingElement_Agents() {
		return (EReference)tracingElementEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getTraceLink_Name() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceLink_ConfidenceValue() {
		return (EAttribute)traceLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceLink_Confidence() {
		return (EReference)traceLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedTo() {
		return relatedToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedTo_Origin() {
		return (EReference)relatedToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedTo_Targets() {
		return (EReference)relatedToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgent_Name() {
		return (EAttribute)agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumanAgent() {
		return humanAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHumanAgent_Role() {
		return (EAttribute)humanAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachineAgent() {
		return machineAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineAgent_MachineType() {
		return (EAttribute)machineAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfidence() {
		return confidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfidence_Evidence() {
		return (EReference)confidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfidence_Value() {
		return (EAttribute)confidenceEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getEvidence_Description() {
		return (EAttribute)evidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidence_SupportingElements() {
		return (EReference)evidenceEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getAIEvidence_Algorithm() {
		return (EAttribute)aiEvidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAIEvidence_DataSet() {
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
	public EAttribute getAnnotationEvidence_Explanation() {
		return (EAttribute)annotationEvidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracemodelFactory getTracemodelFactory() {
		return (TracemodelFactory)getEFactoryInstance();
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
		genericTraceModelEClass = createEClass(GENERIC_TRACE_MODEL);
		createEReference(genericTraceModelEClass, GENERIC_TRACE_MODEL__TRACES);

		tracingElementEClass = createEClass(TRACING_ELEMENT);
		createEAttribute(tracingElementEClass, TRACING_ELEMENT__ID);
		createEAttribute(tracingElementEClass, TRACING_ELEMENT__TIMESTAMP);
		createEReference(tracingElementEClass, TRACING_ELEMENT__AGENTS);

		traceLinkEClass = createEClass(TRACE_LINK);
		createEAttribute(traceLinkEClass, TRACE_LINK__NAME);
		createEAttribute(traceLinkEClass, TRACE_LINK__CONFIDENCE_VALUE);
		createEReference(traceLinkEClass, TRACE_LINK__CONFIDENCE);

		relatedToEClass = createEClass(RELATED_TO);
		createEReference(relatedToEClass, RELATED_TO__ORIGIN);
		createEReference(relatedToEClass, RELATED_TO__TARGETS);

		agentEClass = createEClass(AGENT);
		createEAttribute(agentEClass, AGENT__NAME);

		humanAgentEClass = createEClass(HUMAN_AGENT);
		createEAttribute(humanAgentEClass, HUMAN_AGENT__ROLE);

		machineAgentEClass = createEClass(MACHINE_AGENT);
		createEAttribute(machineAgentEClass, MACHINE_AGENT__MACHINE_TYPE);

		confidenceEClass = createEClass(CONFIDENCE);
		createEReference(confidenceEClass, CONFIDENCE__EVIDENCE);
		createEAttribute(confidenceEClass, CONFIDENCE__VALUE);

		evidenceEClass = createEClass(EVIDENCE);
		createEAttribute(evidenceEClass, EVIDENCE__DESCRIPTION);
		createEReference(evidenceEClass, EVIDENCE__SUPPORTING_ELEMENTS);

		aiEvidenceEClass = createEClass(AI_EVIDENCE);
		createEAttribute(aiEvidenceEClass, AI_EVIDENCE__ALGORITHM);
		createEAttribute(aiEvidenceEClass, AI_EVIDENCE__DATA_SET);
		createEAttribute(aiEvidenceEClass, AI_EVIDENCE__EXECUTION_DATE);
		createEAttribute(aiEvidenceEClass, AI_EVIDENCE__PRECISION);
		createEAttribute(aiEvidenceEClass, AI_EVIDENCE__RECALL);

		ruleEvidenceEClass = createEClass(RULE_EVIDENCE);
		createEAttribute(ruleEvidenceEClass, RULE_EVIDENCE__RULE);
		createEAttribute(ruleEvidenceEClass, RULE_EVIDENCE__EXECUTION_DATE);

		annotationEvidenceEClass = createEClass(ANNOTATION_EVIDENCE);
		createEAttribute(annotationEvidenceEClass, ANNOTATION_EVIDENCE__EXPLANATION);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		traceLinkEClass.getESuperTypes().add(this.getTracingElement());
		relatedToEClass.getESuperTypes().add(this.getTraceLink());
		agentEClass.getESuperTypes().add(this.getTracingElement());
		humanAgentEClass.getESuperTypes().add(this.getAgent());
		machineAgentEClass.getESuperTypes().add(this.getAgent());
		confidenceEClass.getESuperTypes().add(this.getTracingElement());
		evidenceEClass.getESuperTypes().add(this.getTracingElement());
		aiEvidenceEClass.getESuperTypes().add(this.getEvidence());
		ruleEvidenceEClass.getESuperTypes().add(this.getEvidence());
		annotationEvidenceEClass.getESuperTypes().add(this.getEvidence());

		// Initialize classes, features, and operations; add parameters
		initEClass(genericTraceModelEClass, GenericTraceModel.class, "GenericTraceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericTraceModel_Traces(), this.getRelatedTo(), null, "traces", null, 0, -1, GenericTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracingElementEClass, TracingElement.class, "TracingElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTracingElement_ID(), theEcorePackage.getEString(), "ID", null, 0, 1, TracingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTracingElement_Timestamp(), theEcorePackage.getEString(), "timestamp", null, 0, 1, TracingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracingElement_Agents(), this.getAgent(), null, "agents", null, 0, -1, TracingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceLinkEClass, TraceLink.class, "TraceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceLink_Name(), theEcorePackage.getEString(), "name", null, 0, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceLink_ConfidenceValue(), theEcorePackage.getEDouble(), "confidenceValue", null, 0, 1, TraceLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTraceLink_Confidence(), this.getConfidence(), null, "confidence", null, 0, 1, TraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatedToEClass, RelatedTo.class, "RelatedTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelatedTo_Origin(), theEcorePackage.getEObject(), null, "origin", null, 1, 1, RelatedTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedTo_Targets(), theEcorePackage.getEObject(), null, "targets", null, 1, -1, RelatedTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgent_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(humanAgentEClass, HumanAgent.class, "HumanAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHumanAgent_Role(), theEcorePackage.getEString(), "role", null, 0, 1, HumanAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineAgentEClass, MachineAgent.class, "MachineAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachineAgent_MachineType(), theEcorePackage.getEString(), "machineType", null, 0, 1, MachineAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confidenceEClass, Confidence.class, "Confidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfidence_Evidence(), this.getEvidence(), null, "evidence", null, 0, 1, Confidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfidence_Value(), theEcorePackage.getEDouble(), "value", "1.0", 0, 1, Confidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evidenceEClass, Evidence.class, "Evidence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvidence_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvidence_SupportingElements(), this.getTracingElement(), null, "supportingElements", null, 0, -1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiEvidenceEClass, AIEvidence.class, "AIEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAIEvidence_Algorithm(), theEcorePackage.getEString(), "algorithm", null, 0, 1, AIEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAIEvidence_DataSet(), theEcorePackage.getEString(), "dataSet", null, 0, 1, AIEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAIEvidence_ExecutionDate(), theEcorePackage.getEInt(), "executionDate", null, 0, 1, AIEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAIEvidence_Precision(), theEcorePackage.getEDouble(), "precision", null, 0, 1, AIEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAIEvidence_Recall(), theEcorePackage.getEDouble(), "recall", null, 0, 1, AIEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEvidenceEClass, RuleEvidence.class, "RuleEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleEvidence_Rule(), theEcorePackage.getEString(), "rule", null, 0, 1, RuleEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleEvidence_ExecutionDate(), theEcorePackage.getEInt(), "executionDate", null, 0, 1, RuleEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEvidenceEClass, AnnotationEvidence.class, "AnnotationEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationEvidence_Explanation(), theEcorePackage.getEString(), "explanation", null, 0, 1, AnnotationEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TracemodelPackageImpl
