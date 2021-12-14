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
package tracea.relationtyping.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tracea.relationtyping.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tracea.relationtyping.RelationtypingPackage
 * @generated
 */
public class RelationtypingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RelationtypingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationtypingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RelationtypingPackage.eINSTANCE;
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
	protected RelationtypingSwitch modelSwitch =
		new RelationtypingSwitch() {
			public Object caseDomainType(DomainType object) {
				return createDomainTypeAdapter();
			}
			public Object caseEngineeringType(EngineeringType object) {
				return createEngineeringTypeAdapter();
			}
			public Object caseRelationshipType(RelationshipType object) {
				return createRelationshipTypeAdapter();
			}
			public Object caseTypedRelationship(TypedRelationship object) {
				return createTypedRelationshipAdapter();
			}
			public Object caseTransclusion(Transclusion object) {
				return createTransclusionAdapter();
			}
			public Object caseDoc2Section(Doc2Section object) {
				return createDoc2SectionAdapter();
			}
			public Object caseSection2PoS(Section2PoS object) {
				return createSection2PoSAdapter();
			}
			public Object casePoSSynonym(PoSSynonym object) {
				return createPoSSynonymAdapter();
			}
			public Object casePoS2NamedEntity(PoS2NamedEntity object) {
				return createPoS2NamedEntityAdapter();
			}
			public Object caseNamedEntitySynonym(NamedEntitySynonym object) {
				return createNamedEntitySynonymAdapter();
			}
			public Object caseNamedEntity2Class(NamedEntity2Class object) {
				return createNamedEntity2ClassAdapter();
			}
			public Object caseNameEntity2Package(NameEntity2Package object) {
				return createNameEntity2PackageAdapter();
			}
			public Object casePackage2Model(Package2Model object) {
				return createPackage2ModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.DomainType <em>Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.DomainType
	 * @generated
	 */
	public Adapter createDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.EngineeringType <em>Engineering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.EngineeringType
	 * @generated
	 */
	public Adapter createEngineeringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.RelationshipType
	 * @generated
	 */
	public Adapter createRelationshipTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.Transclusion <em>Transclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.Transclusion
	 * @generated
	 */
	public Adapter createTransclusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.Doc2Section <em>Doc2 Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.Doc2Section
	 * @generated
	 */
	public Adapter createDoc2SectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.Section2PoS <em>Section2 Po S</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.Section2PoS
	 * @generated
	 */
	public Adapter createSection2PoSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.PoSSynonym <em>Po SSynonym</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.PoSSynonym
	 * @generated
	 */
	public Adapter createPoSSynonymAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.PoS2NamedEntity <em>Po S2 Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.PoS2NamedEntity
	 * @generated
	 */
	public Adapter createPoS2NamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.NamedEntitySynonym <em>Named Entity Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.NamedEntitySynonym
	 * @generated
	 */
	public Adapter createNamedEntitySynonymAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.NamedEntity2Class <em>Named Entity2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.NamedEntity2Class
	 * @generated
	 */
	public Adapter createNamedEntity2ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.NameEntity2Package <em>Name Entity2 Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.NameEntity2Package
	 * @generated
	 */
	public Adapter createNameEntity2PackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.relationtyping.Package2Model <em>Package2 Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.relationtyping.Package2Model
	 * @generated
	 */
	public Adapter createPackage2ModelAdapter() {
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

} //RelationtypingAdapterFactory
