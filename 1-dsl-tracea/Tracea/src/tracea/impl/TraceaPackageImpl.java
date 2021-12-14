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
package tracea.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tracea.Tracea;
import tracea.TraceaFactory;
import tracea.TraceaPackage;

import tracea.core.CorePackage;

import tracea.core.impl.CorePackageImpl;

import tracea.granularity.GranularityPackage;

import tracea.granularity.impl.GranularityPackageImpl;

import tracea.relationtyping.RelationtypingPackage;

import tracea.relationtyping.impl.RelationtypingPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceaPackageImpl extends EPackageImpl implements TraceaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceaEClass = null;

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
	 * @see tracea.TraceaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TraceaPackageImpl() {
		super(eNS_URI, TraceaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TraceaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TraceaPackage init() {
		if (isInited) return (TraceaPackage)EPackage.Registry.INSTANCE.getEPackage(TraceaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTraceaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TraceaPackageImpl theTraceaPackage = registeredTraceaPackage instanceof TraceaPackageImpl ? (TraceaPackageImpl)registeredTraceaPackage : new TraceaPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GranularityPackage.eNS_URI);
		GranularityPackageImpl theGranularityPackage = (GranularityPackageImpl)(registeredPackage instanceof GranularityPackageImpl ? registeredPackage : GranularityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationtypingPackage.eNS_URI);
		RelationtypingPackageImpl theRelationtypingPackage = (RelationtypingPackageImpl)(registeredPackage instanceof RelationtypingPackageImpl ? registeredPackage : RelationtypingPackage.eINSTANCE);

		// Create package meta-data objects
		theTraceaPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theGranularityPackage.createPackageContents();
		theRelationtypingPackage.createPackageContents();

		// Initialize created meta-data
		theTraceaPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theGranularityPackage.initializePackageContents();
		theRelationtypingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTraceaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TraceaPackage.eNS_URI, theTraceaPackage);
		return theTraceaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracea() {
		return traceaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracea_Traces() {
		return (EReference)traceaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracea_Artefacts() {
		return (EReference)traceaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracea_Referees() {
		return (EReference)traceaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracea_Name() {
		return (EAttribute)traceaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceaFactory getTraceaFactory() {
		return (TraceaFactory)getEFactoryInstance();
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
		traceaEClass = createEClass(TRACEA);
		createEReference(traceaEClass, TRACEA__TRACES);
		createEReference(traceaEClass, TRACEA__ARTEFACTS);
		createEReference(traceaEClass, TRACEA__REFEREES);
		createEAttribute(traceaEClass, TRACEA__NAME);
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
		GranularityPackage theGranularityPackage = (GranularityPackage)EPackage.Registry.INSTANCE.getEPackage(GranularityPackage.eNS_URI);
		RelationtypingPackage theRelationtypingPackage = (RelationtypingPackage)EPackage.Registry.INSTANCE.getEPackage(RelationtypingPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCorePackage);
		getESubpackages().add(theGranularityPackage);
		getESubpackages().add(theRelationtypingPackage);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(traceaEClass, Tracea.class, "Tracea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracea_Traces(), theCorePackage.getTrace(), null, "traces", null, 0, -1, Tracea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracea_Artefacts(), theCorePackage.getArtefact(), null, "artefacts", null, 0, -1, Tracea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracea_Referees(), theCorePackage.getReferee(), null, "referees", null, 0, -1, Tracea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTracea_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tracea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TraceaPackageImpl
