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
package tracea.granularity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tracea.core.CorePackage;

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
 * @see tracea.granularity.GranularityFactory
 * @model kind="package"
 * @generated
 */
public interface GranularityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "granularity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tracea.ecore.granularity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "granularity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GranularityPackage eINSTANCE = tracea.granularity.impl.GranularityPackageImpl.init();

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.TextArtefactImpl <em>Text Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.TextArtefactImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getTextArtefact()
	 * @generated
	 */
	int TEXT_ARTEFACT = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ARTEFACT__TIME_STAMP = CorePackage.ARTEFACT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ARTEFACT__REFEREES = CorePackage.ARTEFACT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ARTEFACT__NAME = CorePackage.ARTEFACT__NAME;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ARTEFACT__FRAGMENTS = CorePackage.ARTEFACT__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Textfragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ARTEFACT__TEXTFRAGMENTS = CorePackage.ARTEFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ARTEFACT_FEATURE_COUNT = CorePackage.ARTEFACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.ModelArtefactImpl <em>Model Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.ModelArtefactImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getModelArtefact()
	 * @generated
	 */
	int MODEL_ARTEFACT = 1;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ARTEFACT__TIME_STAMP = CorePackage.ARTEFACT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ARTEFACT__REFEREES = CorePackage.ARTEFACT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ARTEFACT__NAME = CorePackage.ARTEFACT__NAME;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ARTEFACT__FRAGMENTS = CorePackage.ARTEFACT__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Modelfragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ARTEFACT__MODELFRAGMENTS = CorePackage.ARTEFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ARTEFACT_FEATURE_COUNT = CorePackage.ARTEFACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.CodeArtefactImpl <em>Code Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.CodeArtefactImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getCodeArtefact()
	 * @generated
	 */
	int CODE_ARTEFACT = 2;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ARTEFACT__TIME_STAMP = CorePackage.ARTEFACT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ARTEFACT__REFEREES = CorePackage.ARTEFACT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ARTEFACT__NAME = CorePackage.ARTEFACT__NAME;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ARTEFACT__FRAGMENTS = CorePackage.ARTEFACT__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Codefragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ARTEFACT__CODEFRAGMENT = CorePackage.ARTEFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ARTEFACT_FEATURE_COUNT = CorePackage.ARTEFACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.TextFragmentImpl <em>Text Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.TextFragmentImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getTextFragment()
	 * @generated
	 */
	int TEXT_FRAGMENT = 3;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT__TIME_STAMP = CorePackage.ARTEFACT_FRAGMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT__REFEREES = CorePackage.ARTEFACT_FRAGMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT__NAME = CorePackage.ARTEFACT_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT__SUB_FRAGMENT = CorePackage.ARTEFACT_FRAGMENT__SUB_FRAGMENT;

	/**
	 * The number of structural features of the '<em>Text Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT_FEATURE_COUNT = CorePackage.ARTEFACT_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.CodeFragmentImpl <em>Code Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.CodeFragmentImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getCodeFragment()
	 * @generated
	 */
	int CODE_FRAGMENT = 4;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FRAGMENT__TIME_STAMP = CorePackage.ARTEFACT_FRAGMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FRAGMENT__REFEREES = CorePackage.ARTEFACT_FRAGMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FRAGMENT__NAME = CorePackage.ARTEFACT_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FRAGMENT__SUB_FRAGMENT = CorePackage.ARTEFACT_FRAGMENT__SUB_FRAGMENT;

	/**
	 * The number of structural features of the '<em>Code Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FRAGMENT_FEATURE_COUNT = CorePackage.ARTEFACT_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.TestFragmentImpl <em>Test Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.TestFragmentImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getTestFragment()
	 * @generated
	 */
	int TEST_FRAGMENT = 5;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FRAGMENT__TIME_STAMP = CorePackage.ARTEFACT_FRAGMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FRAGMENT__REFEREES = CorePackage.ARTEFACT_FRAGMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FRAGMENT__NAME = CorePackage.ARTEFACT_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FRAGMENT__SUB_FRAGMENT = CorePackage.ARTEFACT_FRAGMENT__SUB_FRAGMENT;

	/**
	 * The number of structural features of the '<em>Test Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FRAGMENT_FEATURE_COUNT = CorePackage.ARTEFACT_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.ModelFragmentImpl <em>Model Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.ModelFragmentImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getModelFragment()
	 * @generated
	 */
	int MODEL_FRAGMENT = 6;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FRAGMENT__TIME_STAMP = CorePackage.ARTEFACT_FRAGMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FRAGMENT__REFEREES = CorePackage.ARTEFACT_FRAGMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FRAGMENT__NAME = CorePackage.ARTEFACT_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FRAGMENT__SUB_FRAGMENT = CorePackage.ARTEFACT_FRAGMENT__SUB_FRAGMENT;

	/**
	 * The feature id for the '<em><b>Namedelements Defined</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED = CorePackage.ARTEFACT_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namedelements Used</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FRAGMENT__NAMEDELEMENTS_USED = CorePackage.ARTEFACT_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FRAGMENT_FEATURE_COUNT = CorePackage.ARTEFACT_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.TestArtefactImpl <em>Test Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.TestArtefactImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getTestArtefact()
	 * @generated
	 */
	int TEST_ARTEFACT = 7;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ARTEFACT__TIME_STAMP = CorePackage.ARTEFACT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ARTEFACT__REFEREES = CorePackage.ARTEFACT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ARTEFACT__NAME = CorePackage.ARTEFACT__NAME;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ARTEFACT__FRAGMENTS = CorePackage.ARTEFACT__FRAGMENTS;

	/**
	 * The number of structural features of the '<em>Test Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ARTEFACT_FEATURE_COUNT = CorePackage.ARTEFACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.DocumentImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 8;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TIME_STAMP = TEXT_ARTEFACT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__REFEREES = TEXT_ARTEFACT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = TEXT_ARTEFACT__NAME;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__FRAGMENTS = TEXT_ARTEFACT__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Textfragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TEXTFRAGMENTS = TEXT_ARTEFACT__TEXTFRAGMENTS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SECTIONS = TEXT_ARTEFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TITLE = TEXT_ARTEFACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = TEXT_ARTEFACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.SectionImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 9;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TIME_STAMP = TEXT_FRAGMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__REFEREES = TEXT_FRAGMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = TEXT_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SUB_FRAGMENT = TEXT_FRAGMENT__SUB_FRAGMENT;

	/**
	 * The feature id for the '<em><b>Partofspeechs Defined</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PARTOFSPEECHS_DEFINED = TEXT_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Partofspeechs Used</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PARTOFSPEECHS_USED = TEXT_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NUMBER = TEXT_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = TEXT_FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.PartOfSpeechImpl <em>Part Of Speech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.PartOfSpeechImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getPartOfSpeech()
	 * @generated
	 */
	int PART_OF_SPEECH = 10;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH__TIME_STAMP = TEXT_FRAGMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH__REFEREES = TEXT_FRAGMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH__NAME = TEXT_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH__SUB_FRAGMENT = TEXT_FRAGMENT__SUB_FRAGMENT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH__POSITION = TEXT_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part Of Speech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OF_SPEECH_FEATURE_COUNT = TEXT_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.ModelImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 11;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TIME_STAMP = MODEL_ARTEFACT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REFEREES = MODEL_ARTEFACT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = MODEL_ARTEFACT__NAME;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FRAGMENTS = MODEL_ARTEFACT__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Modelfragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODELFRAGMENTS = MODEL_ARTEFACT__MODELFRAGMENTS;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGES = MODEL_ARTEFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = MODEL_ARTEFACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.PackageImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 12;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TIME_STAMP = MODEL_FRAGMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REFEREES = MODEL_FRAGMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = MODEL_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUB_FRAGMENT = MODEL_FRAGMENT__SUB_FRAGMENT;

	/**
	 * The feature id for the '<em><b>Namedelements Defined</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAMEDELEMENTS_DEFINED = MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED;

	/**
	 * The feature id for the '<em><b>Namedelements Used</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAMEDELEMENTS_USED = MODEL_FRAGMENT__NAMEDELEMENTS_USED;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLASSES = MODEL_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = MODEL_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.ClasseImpl <em>Classe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.ClasseImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getClasse()
	 * @generated
	 */
	int CLASSE = 13;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__TIME_STAMP = MODEL_FRAGMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__REFEREES = MODEL_FRAGMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__NAME = MODEL_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__SUB_FRAGMENT = MODEL_FRAGMENT__SUB_FRAGMENT;

	/**
	 * The feature id for the '<em><b>Namedelements Defined</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__NAMEDELEMENTS_DEFINED = MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED;

	/**
	 * The feature id for the '<em><b>Namedelements Used</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__NAMEDELEMENTS_USED = MODEL_FRAGMENT__NAMEDELEMENTS_USED;

	/**
	 * The feature id for the '<em><b>Structuralfeatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__STRUCTURALFEATURES = MODEL_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_FEATURE_COUNT = MODEL_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.StructuralFeatureImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getStructuralFeature()
	 * @generated
	 */
	int STRUCTURAL_FEATURE = 14;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__TIME_STAMP = MODEL_FRAGMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__REFEREES = MODEL_FRAGMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAME = MODEL_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__SUB_FRAGMENT = MODEL_FRAGMENT__SUB_FRAGMENT;

	/**
	 * The feature id for the '<em><b>Namedelements Defined</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAMEDELEMENTS_DEFINED = MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED;

	/**
	 * The feature id for the '<em><b>Namedelements Used</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAMEDELEMENTS_USED = MODEL_FRAGMENT__NAMEDELEMENTS_USED;

	/**
	 * The number of structural features of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_FEATURE_COUNT = MODEL_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link tracea.granularity.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tracea.granularity.impl.NamedElementImpl
	 * @see tracea.granularity.impl.GranularityPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__TIME_STAMP = MODEL_FRAGMENT__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Referees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__REFEREES = MODEL_FRAGMENT__REFEREES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = MODEL_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__SUB_FRAGMENT = MODEL_FRAGMENT__SUB_FRAGMENT;

	/**
	 * The feature id for the '<em><b>Namedelements Defined</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAMEDELEMENTS_DEFINED = MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED;

	/**
	 * The feature id for the '<em><b>Namedelements Used</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAMEDELEMENTS_USED = MODEL_FRAGMENT__NAMEDELEMENTS_USED;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = MODEL_FRAGMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tracea.granularity.TextArtefact <em>Text Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Artefact</em>'.
	 * @see tracea.granularity.TextArtefact
	 * @generated
	 */
	EClass getTextArtefact();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.granularity.TextArtefact#getTextfragments <em>Textfragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textfragments</em>'.
	 * @see tracea.granularity.TextArtefact#getTextfragments()
	 * @see #getTextArtefact()
	 * @generated
	 */
	EReference getTextArtefact_Textfragments();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.ModelArtefact <em>Model Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Artefact</em>'.
	 * @see tracea.granularity.ModelArtefact
	 * @generated
	 */
	EClass getModelArtefact();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.granularity.ModelArtefact#getModelfragments <em>Modelfragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelfragments</em>'.
	 * @see tracea.granularity.ModelArtefact#getModelfragments()
	 * @see #getModelArtefact()
	 * @generated
	 */
	EReference getModelArtefact_Modelfragments();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.CodeArtefact <em>Code Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Artefact</em>'.
	 * @see tracea.granularity.CodeArtefact
	 * @generated
	 */
	EClass getCodeArtefact();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.granularity.CodeArtefact#getCodefragment <em>Codefragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codefragment</em>'.
	 * @see tracea.granularity.CodeArtefact#getCodefragment()
	 * @see #getCodeArtefact()
	 * @generated
	 */
	EReference getCodeArtefact_Codefragment();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.TextFragment <em>Text Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Fragment</em>'.
	 * @see tracea.granularity.TextFragment
	 * @generated
	 */
	EClass getTextFragment();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.CodeFragment <em>Code Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Fragment</em>'.
	 * @see tracea.granularity.CodeFragment
	 * @generated
	 */
	EClass getCodeFragment();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.TestFragment <em>Test Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Fragment</em>'.
	 * @see tracea.granularity.TestFragment
	 * @generated
	 */
	EClass getTestFragment();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.ModelFragment <em>Model Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Fragment</em>'.
	 * @see tracea.granularity.ModelFragment
	 * @generated
	 */
	EClass getModelFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.granularity.ModelFragment#getNamedelementsDefined <em>Namedelements Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namedelements Defined</em>'.
	 * @see tracea.granularity.ModelFragment#getNamedelementsDefined()
	 * @see #getModelFragment()
	 * @generated
	 */
	EReference getModelFragment_NamedelementsDefined();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.granularity.ModelFragment#getNamedelementsUsed <em>Namedelements Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namedelements Used</em>'.
	 * @see tracea.granularity.ModelFragment#getNamedelementsUsed()
	 * @see #getModelFragment()
	 * @generated
	 */
	EReference getModelFragment_NamedelementsUsed();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.TestArtefact <em>Test Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Artefact</em>'.
	 * @see tracea.granularity.TestArtefact
	 * @generated
	 */
	EClass getTestArtefact();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see tracea.granularity.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.granularity.Document#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see tracea.granularity.Document#getSections()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Sections();

	/**
	 * Returns the meta object for the attribute '{@link tracea.granularity.Document#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see tracea.granularity.Document#getTitle()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Title();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see tracea.granularity.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.granularity.Section#getPartofspeechsDefined <em>Partofspeechs Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partofspeechs Defined</em>'.
	 * @see tracea.granularity.Section#getPartofspeechsDefined()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_PartofspeechsDefined();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.granularity.Section#getPartofspeechsUsed <em>Partofspeechs Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partofspeechs Used</em>'.
	 * @see tracea.granularity.Section#getPartofspeechsUsed()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_PartofspeechsUsed();

	/**
	 * Returns the meta object for the attribute '{@link tracea.granularity.Section#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see tracea.granularity.Section#getNumber()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Number();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.PartOfSpeech <em>Part Of Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Of Speech</em>'.
	 * @see tracea.granularity.PartOfSpeech
	 * @generated
	 */
	EClass getPartOfSpeech();

	/**
	 * Returns the meta object for the attribute '{@link tracea.granularity.PartOfSpeech#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see tracea.granularity.PartOfSpeech#getPosition()
	 * @see #getPartOfSpeech()
	 * @generated
	 */
	EAttribute getPartOfSpeech_Position();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see tracea.granularity.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.granularity.Model#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see tracea.granularity.Model#getPackages()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Packages();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see tracea.granularity.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.granularity.Package#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see tracea.granularity.Package#getClasses()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Classes();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.Classe <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classe</em>'.
	 * @see tracea.granularity.Classe
	 * @generated
	 */
	EClass getClasse();

	/**
	 * Returns the meta object for the containment reference list '{@link tracea.granularity.Classe#getStructuralfeatures <em>Structuralfeatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structuralfeatures</em>'.
	 * @see tracea.granularity.Classe#getStructuralfeatures()
	 * @see #getClasse()
	 * @generated
	 */
	EReference getClasse_Structuralfeatures();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature</em>'.
	 * @see tracea.granularity.StructuralFeature
	 * @generated
	 */
	EClass getStructuralFeature();

	/**
	 * Returns the meta object for class '{@link tracea.granularity.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see tracea.granularity.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GranularityFactory getGranularityFactory();

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
		 * The meta object literal for the '{@link tracea.granularity.impl.TextArtefactImpl <em>Text Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.TextArtefactImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getTextArtefact()
		 * @generated
		 */
		EClass TEXT_ARTEFACT = eINSTANCE.getTextArtefact();

		/**
		 * The meta object literal for the '<em><b>Textfragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_ARTEFACT__TEXTFRAGMENTS = eINSTANCE.getTextArtefact_Textfragments();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.ModelArtefactImpl <em>Model Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.ModelArtefactImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getModelArtefact()
		 * @generated
		 */
		EClass MODEL_ARTEFACT = eINSTANCE.getModelArtefact();

		/**
		 * The meta object literal for the '<em><b>Modelfragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ARTEFACT__MODELFRAGMENTS = eINSTANCE.getModelArtefact_Modelfragments();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.CodeArtefactImpl <em>Code Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.CodeArtefactImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getCodeArtefact()
		 * @generated
		 */
		EClass CODE_ARTEFACT = eINSTANCE.getCodeArtefact();

		/**
		 * The meta object literal for the '<em><b>Codefragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_ARTEFACT__CODEFRAGMENT = eINSTANCE.getCodeArtefact_Codefragment();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.TextFragmentImpl <em>Text Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.TextFragmentImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getTextFragment()
		 * @generated
		 */
		EClass TEXT_FRAGMENT = eINSTANCE.getTextFragment();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.CodeFragmentImpl <em>Code Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.CodeFragmentImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getCodeFragment()
		 * @generated
		 */
		EClass CODE_FRAGMENT = eINSTANCE.getCodeFragment();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.TestFragmentImpl <em>Test Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.TestFragmentImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getTestFragment()
		 * @generated
		 */
		EClass TEST_FRAGMENT = eINSTANCE.getTestFragment();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.ModelFragmentImpl <em>Model Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.ModelFragmentImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getModelFragment()
		 * @generated
		 */
		EClass MODEL_FRAGMENT = eINSTANCE.getModelFragment();

		/**
		 * The meta object literal for the '<em><b>Namedelements Defined</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FRAGMENT__NAMEDELEMENTS_DEFINED = eINSTANCE.getModelFragment_NamedelementsDefined();

		/**
		 * The meta object literal for the '<em><b>Namedelements Used</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FRAGMENT__NAMEDELEMENTS_USED = eINSTANCE.getModelFragment_NamedelementsUsed();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.TestArtefactImpl <em>Test Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.TestArtefactImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getTestArtefact()
		 * @generated
		 */
		EClass TEST_ARTEFACT = eINSTANCE.getTestArtefact();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.DocumentImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__SECTIONS = eINSTANCE.getDocument_Sections();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__TITLE = eINSTANCE.getDocument_Title();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.SectionImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Partofspeechs Defined</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PARTOFSPEECHS_DEFINED = eINSTANCE.getSection_PartofspeechsDefined();

		/**
		 * The meta object literal for the '<em><b>Partofspeechs Used</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PARTOFSPEECHS_USED = eINSTANCE.getSection_PartofspeechsUsed();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__NUMBER = eINSTANCE.getSection_Number();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.PartOfSpeechImpl <em>Part Of Speech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.PartOfSpeechImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getPartOfSpeech()
		 * @generated
		 */
		EClass PART_OF_SPEECH = eINSTANCE.getPartOfSpeech();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART_OF_SPEECH__POSITION = eINSTANCE.getPartOfSpeech_Position();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.ModelImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.PackageImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CLASSES = eINSTANCE.getPackage_Classes();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.ClasseImpl <em>Classe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.ClasseImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getClasse()
		 * @generated
		 */
		EClass CLASSE = eINSTANCE.getClasse();

		/**
		 * The meta object literal for the '<em><b>Structuralfeatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE__STRUCTURALFEATURES = eINSTANCE.getClasse_Structuralfeatures();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.StructuralFeatureImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getStructuralFeature()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

		/**
		 * The meta object literal for the '{@link tracea.granularity.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tracea.granularity.impl.NamedElementImpl
		 * @see tracea.granularity.impl.GranularityPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

	}

} //GranularityPackage
