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
package tracea.relationtyping;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tracea.relationtyping.RelationtypingFactory
 * @model kind="package"
 * @generated
 */
public interface RelationtypingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relationtyping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tracea.ecore.relationtyping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationtypingPackage eINSTANCE = tracea.relationtyping.impl.RelationtypingPackageImpl.init();

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.RelationshipTypeImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.DomainTypeImpl <em>Domain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.DomainTypeImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getDomainType()
	 * @generated
	 */
	int DOMAIN_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Domain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE_FEATURE_COUNT = RELATIONSHIP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.EngineeringTypeImpl <em>Engineering Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.EngineeringTypeImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getEngineeringType()
	 * @generated
	 */
	int ENGINEERING_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Engineering Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_TYPE_FEATURE_COUNT = RELATIONSHIP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.TypedRelationshipImpl <em>Typed Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.TypedRelationshipImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getTypedRelationship()
	 * @generated
	 */
	int TYPED_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Relationshiptype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_RELATIONSHIP__RELATIONSHIPTYPE = 0;

	/**
	 * The number of structural features of the '<em>Typed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_RELATIONSHIP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.TransclusionImpl <em>Transclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.TransclusionImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getTransclusion()
	 * @generated
	 */
	int TRANSCLUSION = 4;

	/**
	 * The number of structural features of the '<em>Transclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSCLUSION_FEATURE_COUNT = DOMAIN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.Doc2SectionImpl <em>Doc2 Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.Doc2SectionImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getDoc2Section()
	 * @generated
	 */
	int DOC2_SECTION = 5;

	/**
	 * The number of structural features of the '<em>Doc2 Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC2_SECTION_FEATURE_COUNT = ENGINEERING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.Section2PoSImpl <em>Section2 Po S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.Section2PoSImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getSection2PoS()
	 * @generated
	 */
	int SECTION2_PO_S = 6;

	/**
	 * The number of structural features of the '<em>Section2 Po S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION2_PO_S_FEATURE_COUNT = ENGINEERING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.PoSSynonymImpl <em>Po SSynonym</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.PoSSynonymImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getPoSSynonym()
	 * @generated
	 */
	int PO_SSYNONYM = 7;

	/**
	 * The number of structural features of the '<em>Po SSynonym</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_SSYNONYM_FEATURE_COUNT = DOMAIN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.PoS2NamedEntityImpl <em>Po S2 Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.PoS2NamedEntityImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getPoS2NamedEntity()
	 * @generated
	 */
	int PO_S2_NAMED_ENTITY = 8;

	/**
	 * The number of structural features of the '<em>Po S2 Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_S2_NAMED_ENTITY_FEATURE_COUNT = ENGINEERING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.NamedEntitySynonymImpl <em>Named Entity Synonym</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.NamedEntitySynonymImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getNamedEntitySynonym()
	 * @generated
	 */
	int NAMED_ENTITY_SYNONYM = 9;

	/**
	 * The number of structural features of the '<em>Named Entity Synonym</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_SYNONYM_FEATURE_COUNT = DOMAIN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.NamedEntity2ClassImpl <em>Named Entity2 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.NamedEntity2ClassImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getNamedEntity2Class()
	 * @generated
	 */
	int NAMED_ENTITY2_CLASS = 10;

	/**
	 * The number of structural features of the '<em>Named Entity2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY2_CLASS_FEATURE_COUNT = ENGINEERING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.NameEntity2PackageImpl <em>Name Entity2 Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.NameEntity2PackageImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getNameEntity2Package()
	 * @generated
	 */
	int NAME_ENTITY2_PACKAGE = 11;

	/**
	 * The number of structural features of the '<em>Name Entity2 Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ENTITY2_PACKAGE_FEATURE_COUNT = ENGINEERING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.relationtyping.impl.Package2ModelImpl <em>Package2 Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.relationtyping.impl.Package2ModelImpl
	 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getPackage2Model()
	 * @generated
	 */
	int PACKAGE2_MODEL = 12;

	/**
	 * The number of structural features of the '<em>Package2 Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE2_MODEL_FEATURE_COUNT = ENGINEERING_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.DomainType <em>Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Type</em>'.
	 * @see tracea.relationtyping.DomainType
	 * @generated
	 */
	EClass getDomainType();

	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.EngineeringType <em>Engineering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineering Type</em>'.
	 * @see tracea.relationtyping.EngineeringType
	 * @generated
	 */
	EClass getEngineeringType();

	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see tracea.relationtyping.RelationshipType
	 * @generated
	 */
	EClass getRelationshipType();

	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.TypedRelationship <em>Typed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Relationship</em>'.
	 * @see tracea.relationtyping.TypedRelationship
	 * @generated
	 */
	EClass getTypedRelationship();

	/**
	 * Returns the meta object for the containment reference '{@link tracea.relationtyping.TypedRelationship#getRelationshiptype <em>Relationshiptype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationshiptype</em>'.
	 * @see tracea.relationtyping.TypedRelationship#getRelationshiptype()
	 * @see #getTypedRelationship()
	 * @generated
	 */
	EReference getTypedRelationship_Relationshiptype();

	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.Transclusion <em>Transclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transclusion</em>'.
	 * @see tracea.relationtyping.Transclusion
	 * @generated
	 */
	EClass getTransclusion();

	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.Doc2Section <em>Doc2 Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc2 Section</em>'.
	 * @see tracea.relationtyping.Doc2Section
	 * @generated
	 */
	EClass getDoc2Section();

	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.Section2PoS <em>Section2 Po S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section2 Po S</em>'.
	 * @see tracea.relationtyping.Section2PoS
	 * @generated
	 */
	EClass getSection2PoS();

	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.PoSSynonym <em>Po SSynonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Po SSynonym</em>'.
	 * @see tracea.relationtyping.PoSSynonym
	 * @generated
	 */
	EClass getPoSSynonym();

	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.PoS2NamedEntity <em>Po S2 Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Po S2 Named Entity</em>'.
	 * @see tracea.relationtyping.PoS2NamedEntity
	 * @generated
	 */
	EClass getPoS2NamedEntity();

	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.NamedEntitySynonym <em>Named Entity Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity Synonym</em>'.
	 * @see tracea.relationtyping.NamedEntitySynonym
	 * @generated
	 */
	EClass getNamedEntitySynonym();

	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.NamedEntity2Class <em>Named Entity2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity2 Class</em>'.
	 * @see tracea.relationtyping.NamedEntity2Class
	 * @generated
	 */
	EClass getNamedEntity2Class();

	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.NameEntity2Package <em>Name Entity2 Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Entity2 Package</em>'.
	 * @see tracea.relationtyping.NameEntity2Package
	 * @generated
	 */
	EClass getNameEntity2Package();

	/**
	 * Returns the meta object for class '{@link tracea.relationtyping.Package2Model <em>Package2 Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package2 Model</em>'.
	 * @see tracea.relationtyping.Package2Model
	 * @generated
	 */
	EClass getPackage2Model();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelationtypingFactory getRelationtypingFactory();

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
		 * The meta object literal for the '{@link tracea.relationtyping.impl.DomainTypeImpl <em>Domain Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.DomainTypeImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getDomainType()
		 * @generated
		 */
		EClass DOMAIN_TYPE = eINSTANCE.getDomainType();

		/**
		 * The meta object literal for the '{@link tracea.relationtyping.impl.EngineeringTypeImpl <em>Engineering Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.EngineeringTypeImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getEngineeringType()
		 * @generated
		 */
		EClass ENGINEERING_TYPE = eINSTANCE.getEngineeringType();

		/**
		 * The meta object literal for the '{@link tracea.relationtyping.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.RelationshipTypeImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getRelationshipType()
		 * @generated
		 */
		EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '{@link tracea.relationtyping.impl.TypedRelationshipImpl <em>Typed Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.TypedRelationshipImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getTypedRelationship()
		 * @generated
		 */
		EClass TYPED_RELATIONSHIP = eINSTANCE.getTypedRelationship();

		/**
		 * The meta object literal for the '<em><b>Relationshiptype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_RELATIONSHIP__RELATIONSHIPTYPE = eINSTANCE.getTypedRelationship_Relationshiptype();

		/**
		 * The meta object literal for the '{@link tracea.relationtyping.impl.TransclusionImpl <em>Transclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.TransclusionImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getTransclusion()
		 * @generated
		 */
		EClass TRANSCLUSION = eINSTANCE.getTransclusion();

		/**
		 * The meta object literal for the '{@link tracea.relationtyping.impl.Doc2SectionImpl <em>Doc2 Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.Doc2SectionImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getDoc2Section()
		 * @generated
		 */
		EClass DOC2_SECTION = eINSTANCE.getDoc2Section();

		/**
		 * The meta object literal for the '{@link tracea.relationtyping.impl.Section2PoSImpl <em>Section2 Po S</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.Section2PoSImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getSection2PoS()
		 * @generated
		 */
		EClass SECTION2_PO_S = eINSTANCE.getSection2PoS();

		/**
		 * The meta object literal for the '{@link tracea.relationtyping.impl.PoSSynonymImpl <em>Po SSynonym</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.PoSSynonymImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getPoSSynonym()
		 * @generated
		 */
		EClass PO_SSYNONYM = eINSTANCE.getPoSSynonym();

		/**
		 * The meta object literal for the '{@link tracea.relationtyping.impl.PoS2NamedEntityImpl <em>Po S2 Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.PoS2NamedEntityImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getPoS2NamedEntity()
		 * @generated
		 */
		EClass PO_S2_NAMED_ENTITY = eINSTANCE.getPoS2NamedEntity();

		/**
		 * The meta object literal for the '{@link tracea.relationtyping.impl.NamedEntitySynonymImpl <em>Named Entity Synonym</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.NamedEntitySynonymImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getNamedEntitySynonym()
		 * @generated
		 */
		EClass NAMED_ENTITY_SYNONYM = eINSTANCE.getNamedEntitySynonym();

		/**
		 * The meta object literal for the '{@link tracea.relationtyping.impl.NamedEntity2ClassImpl <em>Named Entity2 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.NamedEntity2ClassImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getNamedEntity2Class()
		 * @generated
		 */
		EClass NAMED_ENTITY2_CLASS = eINSTANCE.getNamedEntity2Class();

		/**
		 * The meta object literal for the '{@link tracea.relationtyping.impl.NameEntity2PackageImpl <em>Name Entity2 Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.NameEntity2PackageImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getNameEntity2Package()
		 * @generated
		 */
		EClass NAME_ENTITY2_PACKAGE = eINSTANCE.getNameEntity2Package();

		/**
		 * The meta object literal for the '{@link tracea.relationtyping.impl.Package2ModelImpl <em>Package2 Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.relationtyping.impl.Package2ModelImpl
		 * @see tracea.relationtyping.impl.RelationtypingPackageImpl#getPackage2Model()
		 * @generated
		 */
		EClass PACKAGE2_MODEL = eINSTANCE.getPackage2Model();

	}

} //RelationtypingPackage
