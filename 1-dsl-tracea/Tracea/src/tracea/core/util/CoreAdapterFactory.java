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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tracea.core.*;

import tracea.relationtyping.TypedRelationship;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tracea.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreSwitch modelSwitch =
		new CoreSwitch() {
			public Object caseTrace(Trace object) {
				return createTraceAdapter();
			}
			public Object caseTraceLink(TraceLink object) {
				return createTraceLinkAdapter();
			}
			public Object caseLeafTraceLink(LeafTraceLink object) {
				return createLeafTraceLinkAdapter();
			}
			public Object caseNodeTraceLink(NodeTraceLink object) {
				return createNodeTraceLinkAdapter();
			}
			public Object caseArtefact(Artefact object) {
				return createArtefactAdapter();
			}
			public Object caseArtefactFragment(ArtefactFragment object) {
				return createArtefactFragmentAdapter();
			}
			public Object caseEvidence(Evidence object) {
				return createEvidenceAdapter();
			}
			public Object caseReferee(Referee object) {
				return createRefereeAdapter();
			}
			public Object caseTrustableElement(TrustableElement object) {
				return createTrustableElementAdapter();
			}
			public Object caseRuleEvidence(RuleEvidence object) {
				return createRuleEvidenceAdapter();
			}
			public Object caseAnnotationEvidence(AnnotationEvidence object) {
				return createAnnotationEvidenceAdapter();
			}
			public Object caseAIEvidence(AIEvidence object) {
				return createAIEvidenceAdapter();
			}
			public Object caseTypedRelationship(TypedRelationship object) {
				return createTypedRelationshipAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tracea.core.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.core.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.core.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.core.TraceLink
	 * @generated
	 */
	public Adapter createTraceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.core.LeafTraceLink <em>Leaf Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.core.LeafTraceLink
	 * @generated
	 */
	public Adapter createLeafTraceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.core.NodeTraceLink <em>Node Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.core.NodeTraceLink
	 * @generated
	 */
	public Adapter createNodeTraceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.core.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.core.Artefact
	 * @generated
	 */
	public Adapter createArtefactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.core.ArtefactFragment <em>Artefact Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.core.ArtefactFragment
	 * @generated
	 */
	public Adapter createArtefactFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.core.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.core.Evidence
	 * @generated
	 */
	public Adapter createEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.core.Referee <em>Referee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.core.Referee
	 * @generated
	 */
	public Adapter createRefereeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.core.TrustableElement <em>Trustable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.core.TrustableElement
	 * @generated
	 */
	public Adapter createTrustableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.core.RuleEvidence <em>Rule Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.core.RuleEvidence
	 * @generated
	 */
	public Adapter createRuleEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.core.AnnotationEvidence <em>Annotation Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.core.AnnotationEvidence
	 * @generated
	 */
	public Adapter createAnnotationEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.core.AIEvidence <em>AI Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.core.AIEvidence
	 * @generated
	 */
	public Adapter createAIEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.TypedRelationship <em>Typed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.TypedRelationship
	 * @generated
	 */
	public Adapter createTypedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoreAdapterFactory
