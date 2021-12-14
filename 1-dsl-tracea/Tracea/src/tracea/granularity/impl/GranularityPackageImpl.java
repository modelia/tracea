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
package tracea.granularity.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tracea.TraceaPackage;

import tracea.core.CorePackage;

import tracea.core.impl.CorePackageImpl;

import tracea.granularity.Classe;
import tracea.granularity.CodeArtefact;
import tracea.granularity.CodeFragment;
import tracea.granularity.Document;
import tracea.granularity.GranularityFactory;
import tracea.granularity.GranularityPackage;
import tracea.granularity.Model;
import tracea.granularity.ModelArtefact;
import tracea.granularity.ModelFragment;
import tracea.granularity.NamedElement;
import tracea.granularity.PartOfSpeech;
import tracea.granularity.Section;
import tracea.granularity.StructuralFeature;
import tracea.granularity.TestArtefact;
import tracea.granularity.TestFragment;
import tracea.granularity.TextArtefact;
import tracea.granularity.TextFragment;

import tracea.impl.TraceaPackageImpl;

import tracea.relationtyping.RelationtypingPackage;

import tracea.relationtyping.impl.RelationtypingPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GranularityPackageImpl extends EPackageImpl implements GranularityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textArtefactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelArtefactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeArtefactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testArtefactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partOfSpeechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

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
	 * @see tracea.granularity.GranularityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GranularityPackageImpl() {
		super(eNS_URI, GranularityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GranularityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GranularityPackage init() {
		if (isInited) return (GranularityPackage)EPackage.Registry.INSTANCE.getEPackage(GranularityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGranularityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GranularityPackageImpl theGranularityPackage = registeredGranularityPackage instanceof GranularityPackageImpl ? (GranularityPackageImpl)registeredGranularityPackage : new GranularityPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TraceaPackage.eNS_URI);
		TraceaPackageImpl theTraceaPackage = (TraceaPackageImpl)(registeredPackage instanceof TraceaPackageImpl ? registeredPackage : TraceaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationtypingPackage.eNS_URI);
		RelationtypingPackageImpl theRelationtypingPackage = (RelationtypingPackageImpl)(registeredPackage instanceof RelationtypingPackageImpl ? registeredPackage : RelationtypingPackage.eINSTANCE);

		// Create package meta-data objects
		theGranularityPackage.createPackageContents();
		theTraceaPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theRelationtypingPackage.createPackageContents();

		// Initialize created meta-data
		theGranularityPackage.initializePackageContents();
		theTraceaPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theRelationtypingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGranularityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GranularityPackage.eNS_URI, theGranularityPackage);
		return theGranularityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextArtefact() {
		return textArtefactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextArtefact_Textfragments() {
		return (EReference)textArtefactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelArtefact() {
		return modelArtefactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelArtefact_Modelfragments() {
		return (EReference)modelArtefactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeArtefact() {
		return codeArtefactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeArtefact_Codefragment() {
		return (EReference)codeArtefactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextFragment() {
		return textFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeFragment() {
		return codeFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestFragment() {
		return testFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFragment() {
		return modelFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFragment_NamedelementsDefined() {
		return (EReference)modelFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFragment_NamedelementsUsed() {
		return (EReference)modelFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestArtefact() {
		return testArtefactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Sections() {
		return (EReference)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Title() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_PartofspeechsDefined() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_PartofspeechsUsed() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Number() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartOfSpeech() {
		return partOfSpeechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartOfSpeech_Position() {
		return (EAttribute)partOfSpeechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Packages() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Classes() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClasse() {
		return classeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClasse_Structuralfeatures() {
		return (EReference)classeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GranularityFactory getGranularityFactory() {
		return (GranularityFactory)getEFactoryInstance();
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
		textArtefactEClass = createEClass(TEXT_ARTEFACT);
		createEReference(textArtefactEClass, TEXT_ARTEFACT__TEXTFRAGMENTS);

		modelArtefactEClass = createEClass(MODEL_ARTEFACT);
		createEReference(modelArtefactEClass, MODEL_ARTEFACT__MODELFRAGMENTS);

		codeArtefactEClass = createEClass(CODE_ARTEFACT);
		createEReference(codeArtefactEClass, CODE_ARTEFACT__CODEFRAGMENT);

		textFragmentEClass = createEClass(TEXT_FRAGMENT);

		codeFragmentEClass = createEClass(CODE_FRAGMENT);

		testFragmentEClass = createEClass(TEST_FRAGMENT);

		modelFragmentEClass = createEClass(MODEL_FRAGMENT);
		createEReference(modelFragmentEClass, MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED);
		createEReference(modelFragmentEClass, MODEL_FRAGMENT__NAMEDELEMENTS_USED);

		testArtefactEClass = createEClass(TEST_ARTEFACT);

		documentEClass = createEClass(DOCUMENT);
		createEReference(documentEClass, DOCUMENT__SECTIONS);
		createEAttribute(documentEClass, DOCUMENT__TITLE);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__PARTOFSPEECHS_DEFINED);
		createEReference(sectionEClass, SECTION__PARTOFSPEECHS_USED);
		createEAttribute(sectionEClass, SECTION__NUMBER);

		partOfSpeechEClass = createEClass(PART_OF_SPEECH);
		createEAttribute(partOfSpeechEClass, PART_OF_SPEECH__POSITION);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__PACKAGES);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__CLASSES);

		classeEClass = createEClass(CLASSE);
		createEReference(classeEClass, CLASSE__STRUCTURALFEATURES);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Add supertypes to classes
		textArtefactEClass.getESuperTypes().add(theCorePackage.getArtefact());
		modelArtefactEClass.getESuperTypes().add(theCorePackage.getArtefact());
		codeArtefactEClass.getESuperTypes().add(theCorePackage.getArtefact());
		textFragmentEClass.getESuperTypes().add(theCorePackage.getArtefactFragment());
		codeFragmentEClass.getESuperTypes().add(theCorePackage.getArtefactFragment());
		testFragmentEClass.getESuperTypes().add(theCorePackage.getArtefactFragment());
		modelFragmentEClass.getESuperTypes().add(theCorePackage.getArtefactFragment());
		testArtefactEClass.getESuperTypes().add(theCorePackage.getArtefact());
		documentEClass.getESuperTypes().add(this.getTextArtefact());
		sectionEClass.getESuperTypes().add(this.getTextFragment());
		partOfSpeechEClass.getESuperTypes().add(this.getTextFragment());
		modelEClass.getESuperTypes().add(this.getModelArtefact());
		packageEClass.getESuperTypes().add(this.getModelFragment());
		classeEClass.getESuperTypes().add(this.getModelFragment());
		structuralFeatureEClass.getESuperTypes().add(this.getModelFragment());
		namedElementEClass.getESuperTypes().add(this.getModelFragment());

		// Initialize classes and features; add operations and parameters
		initEClass(textArtefactEClass, TextArtefact.class, "TextArtefact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextArtefact_Textfragments(), this.getTextFragment(), null, "textfragments", null, 0, -1, TextArtefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelArtefactEClass, ModelArtefact.class, "ModelArtefact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelArtefact_Modelfragments(), this.getModelFragment(), null, "modelfragments", null, 0, -1, ModelArtefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeArtefactEClass, CodeArtefact.class, "CodeArtefact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeArtefact_Codefragment(), this.getCodeFragment(), null, "codefragment", null, 0, -1, CodeArtefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textFragmentEClass, TextFragment.class, "TextFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeFragmentEClass, CodeFragment.class, "CodeFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testFragmentEClass, TestFragment.class, "TestFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelFragmentEClass, ModelFragment.class, "ModelFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFragment_NamedelementsDefined(), this.getNamedElement(), null, "namedelementsDefined", null, 0, -1, ModelFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFragment_NamedelementsUsed(), this.getNamedElement(), null, "namedelementsUsed", null, 0, -1, ModelFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testArtefactEClass, TestArtefact.class, "TestArtefact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocument_Sections(), this.getSection(), null, "sections", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Title(), ecorePackage.getEString(), "title", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_PartofspeechsDefined(), this.getPartOfSpeech(), null, "partofspeechsDefined", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSection_PartofspeechsUsed(), this.getPartOfSpeech(), null, "partofspeechsUsed", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partOfSpeechEClass, PartOfSpeech.class, "PartOfSpeech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartOfSpeech_Position(), ecorePackage.getEString(), "position", null, 0, 1, PartOfSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Packages(), this.getPackage(), null, "packages", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, tracea.granularity.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Classes(), this.getClasse(), null, "classes", null, 0, -1, tracea.granularity.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classeEClass, Classe.class, "Classe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClasse_Structuralfeatures(), this.getStructuralFeature(), null, "structuralfeatures", null, 0, -1, Classe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //GranularityPackageImpl
