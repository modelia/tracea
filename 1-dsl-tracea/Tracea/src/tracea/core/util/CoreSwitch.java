/*****************************************************************************

* Copyright (c) 2015, 2018 CEA LIST, Edouard Batot

*

* All rights reserved. This program and the accompanying materials

* are made available under the terms of the Eclipse Public License 2.0

* which accompanies this distribution, and is available at

* https://www.eclipse.org/legal/epl-2.0/

*

* SPDX-License-Identifier: EPL-2.0

*

* Contributors:

* CEA LIST - Initial API and implementation

* Edouard Batot (UOC SOM) ebatot@uoc.edu 

*****************************************************************************/


/**
 */
package tracea.core.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import tracea.core.*;

import tracea.relationtyping.TypedRelationship;

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
 * @see tracea.core.CorePackage
 * @generated
 */
public class CoreSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.TRACE: {
				Trace trace = (Trace)theEObject;
				Object result = caseTrace(trace);
				if (result == null) result = caseTypedRelationship(trace);
				if (result == null) result = caseTrustableElement(trace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRACE_LINK: {
				TraceLink traceLink = (TraceLink)theEObject;
				Object result = caseTraceLink(traceLink);
				if (result == null) result = caseTrustableElement(traceLink);
				if (result == null) result = caseTypedRelationship(traceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LEAF_TRACE_LINK: {
				LeafTraceLink leafTraceLink = (LeafTraceLink)theEObject;
				Object result = caseLeafTraceLink(leafTraceLink);
				if (result == null) result = caseTraceLink(leafTraceLink);
				if (result == null) result = caseTrustableElement(leafTraceLink);
				if (result == null) result = caseTypedRelationship(leafTraceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NODE_TRACE_LINK: {
				NodeTraceLink nodeTraceLink = (NodeTraceLink)theEObject;
				Object result = caseNodeTraceLink(nodeTraceLink);
				if (result == null) result = caseTraceLink(nodeTraceLink);
				if (result == null) result = caseTrustableElement(nodeTraceLink);
				if (result == null) result = caseTypedRelationship(nodeTraceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ARTEFACT: {
				Artefact artefact = (Artefact)theEObject;
				Object result = caseArtefact(artefact);
				if (result == null) result = caseTrustableElement(artefact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ARTEFACT_FRAGMENT: {
				ArtefactFragment artefactFragment = (ArtefactFragment)theEObject;
				Object result = caseArtefactFragment(artefactFragment);
				if (result == null) result = caseTrustableElement(artefactFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EVIDENCE: {
				Evidence evidence = (Evidence)theEObject;
				Object result = caseEvidence(evidence);
				if (result == null) result = caseTrustableElement(evidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REFEREE: {
				Referee referee = (Referee)theEObject;
				Object result = caseReferee(referee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRUSTABLE_ELEMENT: {
				TrustableElement trustableElement = (TrustableElement)theEObject;
				Object result = caseTrustableElement(trustableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RULE_EVIDENCE: {
				RuleEvidence ruleEvidence = (RuleEvidence)theEObject;
				Object result = caseRuleEvidence(ruleEvidence);
				if (result == null) result = caseEvidence(ruleEvidence);
				if (result == null) result = caseTrustableElement(ruleEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ANNOTATION_EVIDENCE: {
				AnnotationEvidence annotationEvidence = (AnnotationEvidence)theEObject;
				Object result = caseAnnotationEvidence(annotationEvidence);
				if (result == null) result = caseEvidence(annotationEvidence);
				if (result == null) result = caseTrustableElement(annotationEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.AI_EVIDENCE: {
				AIEvidence aiEvidence = (AIEvidence)theEObject;
				Object result = caseAIEvidence(aiEvidence);
				if (result == null) result = caseEvidence(aiEvidence);
				if (result == null) result = caseTrustableElement(aiEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTrace(Trace object) {
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
	public Object caseTraceLink(TraceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Trace Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Trace Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLeafTraceLink(LeafTraceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Trace Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Trace Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNodeTraceLink(NodeTraceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artefact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artefact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArtefact(Artefact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artefact Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artefact Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArtefactFragment(ArtefactFragment object) {
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
	public Object caseEvidence(Evidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReferee(Referee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trustable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trustable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTrustableElement(TrustableElement object) {
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
	public Object caseRuleEvidence(RuleEvidence object) {
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
	public Object caseAnnotationEvidence(AnnotationEvidence object) {
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
	public Object caseAIEvidence(AIEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypedRelationship(TypedRelationship object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
