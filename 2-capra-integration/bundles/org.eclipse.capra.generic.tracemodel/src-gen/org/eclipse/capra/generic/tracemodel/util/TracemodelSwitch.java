/**
 */
package org.eclipse.capra.generic.tracemodel.util;

import org.eclipse.capra.generic.tracemodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage
 * @generated
 */
public class TracemodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TracemodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracemodelSwitch() {
		if (modelPackage == null) {
			modelPackage = TracemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TracemodelPackage.GENERIC_TRACE_MODEL: {
				GenericTraceModel genericTraceModel = (GenericTraceModel)theEObject;
				T result = caseGenericTraceModel(genericTraceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemodelPackage.TRACING_ELEMENT: {
				TracingElement tracingElement = (TracingElement)theEObject;
				T result = caseTracingElement(tracingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemodelPackage.TRACE_LINK: {
				TraceLink traceLink = (TraceLink)theEObject;
				T result = caseTraceLink(traceLink);
				if (result == null) result = caseTracingElement(traceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemodelPackage.RELATED_TO: {
				RelatedTo relatedTo = (RelatedTo)theEObject;
				T result = caseRelatedTo(relatedTo);
				if (result == null) result = caseTraceLink(relatedTo);
				if (result == null) result = caseTracingElement(relatedTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemodelPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = caseTracingElement(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemodelPackage.HUMAN_AGENT: {
				HumanAgent humanAgent = (HumanAgent)theEObject;
				T result = caseHumanAgent(humanAgent);
				if (result == null) result = caseAgent(humanAgent);
				if (result == null) result = caseTracingElement(humanAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemodelPackage.MACHINE_AGENT: {
				MachineAgent machineAgent = (MachineAgent)theEObject;
				T result = caseMachineAgent(machineAgent);
				if (result == null) result = caseAgent(machineAgent);
				if (result == null) result = caseTracingElement(machineAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemodelPackage.CONFIDENCE: {
				Confidence confidence = (Confidence)theEObject;
				T result = caseConfidence(confidence);
				if (result == null) result = caseTracingElement(confidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemodelPackage.EVIDENCE: {
				Evidence evidence = (Evidence)theEObject;
				T result = caseEvidence(evidence);
				if (result == null) result = caseTracingElement(evidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemodelPackage.AI_EVIDENCE: {
				AIEvidence aiEvidence = (AIEvidence)theEObject;
				T result = caseAIEvidence(aiEvidence);
				if (result == null) result = caseEvidence(aiEvidence);
				if (result == null) result = caseTracingElement(aiEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemodelPackage.RULE_EVIDENCE: {
				RuleEvidence ruleEvidence = (RuleEvidence)theEObject;
				T result = caseRuleEvidence(ruleEvidence);
				if (result == null) result = caseEvidence(ruleEvidence);
				if (result == null) result = caseTracingElement(ruleEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemodelPackage.ANNOTATION_EVIDENCE: {
				AnnotationEvidence annotationEvidence = (AnnotationEvidence)theEObject;
				T result = caseAnnotationEvidence(annotationEvidence);
				if (result == null) result = caseEvidence(annotationEvidence);
				if (result == null) result = caseTracingElement(annotationEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Trace Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Trace Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericTraceModel(GenericTraceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tracing Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tracing Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracingElement(TracingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceLink(TraceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedTo(RelatedTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanAgent(HumanAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachineAgent(MachineAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfidence(Confidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidence(Evidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIEvidence(AIEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleEvidence(RuleEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationEvidence(AnnotationEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TracemodelSwitch
