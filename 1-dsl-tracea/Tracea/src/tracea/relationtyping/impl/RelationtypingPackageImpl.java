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
package tracea.relationtyping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tracea.TraceaPackage;

import tracea.core.CorePackage;

import tracea.core.impl.CorePackageImpl;

import tracea.granularity.GranularityPackage;

import tracea.granularity.impl.GranularityPackageImpl;

import tracea.impl.TraceaPackageImpl;

import tracea.relationtyping.Doc2Section;
import tracea.relationtyping.DomainType;
import tracea.relationtyping.EngineeringType;
import tracea.relationtyping.NameEntity2Package;
import tracea.relationtyping.NamedEntity2Class;
import tracea.relationtyping.NamedEntitySynonym;
import tracea.relationtyping.Package2Model;
import tracea.relationtyping.PoS2NamedEntity;
import tracea.relationtyping.PoSSynonym;
import tracea.relationtyping.RelationshipType;
import tracea.relationtyping.RelationtypingFactory;
import tracea.relationtyping.RelationtypingPackage;
import tracea.relationtyping.Section2PoS;
import tracea.relationtyping.Transclusion;
import tracea.relationtyping.TypedRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationtypingPackageImpl extends EPackageImpl implements RelationtypingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doc2SectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass section2PoSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poSSynonymEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poS2NamedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEntitySynonymEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEntity2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEntity2PackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass package2ModelEClass = null;

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
	 * @see tracea.relationtyping.RelationtypingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationtypingPackageImpl() {
		super(eNS_URI, RelationtypingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationtypingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationtypingPackage init() {
		if (isInited) return (RelationtypingPackage)EPackage.Registry.INSTANCE.getEPackage(RelationtypingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationtypingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationtypingPackageImpl theRelationtypingPackage = registeredRelationtypingPackage instanceof RelationtypingPackageImpl ? (RelationtypingPackageImpl)registeredRelationtypingPackage : new RelationtypingPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TraceaPackage.eNS_URI);
		TraceaPackageImpl theTraceaPackage = (TraceaPackageImpl)(registeredPackage instanceof TraceaPackageImpl ? registeredPackage : TraceaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GranularityPackage.eNS_URI);
		GranularityPackageImpl theGranularityPackage = (GranularityPackageImpl)(registeredPackage instanceof GranularityPackageImpl ? registeredPackage : GranularityPackage.eINSTANCE);

		// Create package meta-data objects
		theRelationtypingPackage.createPackageContents();
		theTraceaPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theGranularityPackage.createPackageContents();

		// Initialize created meta-data
		theRelationtypingPackage.initializePackageContents();
		theTraceaPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theGranularityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationtypingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationtypingPackage.eNS_URI, theRelationtypingPackage);
		return theRelationtypingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainType() {
		return domainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineeringType() {
		return engineeringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipType() {
		return relationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedRelationship() {
		return typedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedRelationship_Relationshiptype() {
		return (EReference)typedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransclusion() {
		return transclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoc2Section() {
		return doc2SectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection2PoS() {
		return section2PoSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoSSynonym() {
		return poSSynonymEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoS2NamedEntity() {
		return poS2NamedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedEntitySynonym() {
		return namedEntitySynonymEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedEntity2Class() {
		return namedEntity2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameEntity2Package() {
		return nameEntity2PackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage2Model() {
		return package2ModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationtypingFactory getRelationtypingFactory() {
		return (RelationtypingFactory)getEFactoryInstance();
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
		domainTypeEClass = createEClass(DOMAIN_TYPE);

		engineeringTypeEClass = createEClass(ENGINEERING_TYPE);

		relationshipTypeEClass = createEClass(RELATIONSHIP_TYPE);

		typedRelationshipEClass = createEClass(TYPED_RELATIONSHIP);
		createEReference(typedRelationshipEClass, TYPED_RELATIONSHIP__RELATIONSHIPTYPE);

		transclusionEClass = createEClass(TRANSCLUSION);

		doc2SectionEClass = createEClass(DOC2_SECTION);

		section2PoSEClass = createEClass(SECTION2_PO_S);

		poSSynonymEClass = createEClass(PO_SSYNONYM);

		poS2NamedEntityEClass = createEClass(PO_S2_NAMED_ENTITY);

		namedEntitySynonymEClass = createEClass(NAMED_ENTITY_SYNONYM);

		namedEntity2ClassEClass = createEClass(NAMED_ENTITY2_CLASS);

		nameEntity2PackageEClass = createEClass(NAME_ENTITY2_PACKAGE);

		package2ModelEClass = createEClass(PACKAGE2_MODEL);
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

		// Add supertypes to classes
		domainTypeEClass.getESuperTypes().add(this.getRelationshipType());
		engineeringTypeEClass.getESuperTypes().add(this.getRelationshipType());
		transclusionEClass.getESuperTypes().add(this.getDomainType());
		doc2SectionEClass.getESuperTypes().add(this.getEngineeringType());
		section2PoSEClass.getESuperTypes().add(this.getEngineeringType());
		poSSynonymEClass.getESuperTypes().add(this.getDomainType());
		poS2NamedEntityEClass.getESuperTypes().add(this.getEngineeringType());
		namedEntitySynonymEClass.getESuperTypes().add(this.getDomainType());
		namedEntity2ClassEClass.getESuperTypes().add(this.getEngineeringType());
		nameEntity2PackageEClass.getESuperTypes().add(this.getEngineeringType());
		package2ModelEClass.getESuperTypes().add(this.getEngineeringType());

		// Initialize classes and features; add operations and parameters
		initEClass(domainTypeEClass, DomainType.class, "DomainType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(engineeringTypeEClass, EngineeringType.class, "EngineeringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipTypeEClass, RelationshipType.class, "RelationshipType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedRelationshipEClass, TypedRelationship.class, "TypedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedRelationship_Relationshiptype(), this.getRelationshipType(), null, "relationshiptype", null, 0, 1, TypedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transclusionEClass, Transclusion.class, "Transclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doc2SectionEClass, Doc2Section.class, "Doc2Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(section2PoSEClass, Section2PoS.class, "Section2PoS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(poSSynonymEClass, PoSSynonym.class, "PoSSynonym", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(poS2NamedEntityEClass, PoS2NamedEntity.class, "PoS2NamedEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedEntitySynonymEClass, NamedEntitySynonym.class, "NamedEntitySynonym", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedEntity2ClassEClass, NamedEntity2Class.class, "NamedEntity2Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameEntity2PackageEClass, NameEntity2Package.class, "NameEntity2Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(package2ModelEClass, Package2Model.class, "Package2Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //RelationtypingPackageImpl
