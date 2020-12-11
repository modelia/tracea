/**
 */
package tracea.granularity.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GranularityFactoryImpl extends EFactoryImpl implements GranularityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GranularityFactory init() {
		try {
			GranularityFactory theGranularityFactory = (GranularityFactory)EPackage.Registry.INSTANCE.getEFactory(GranularityPackage.eNS_URI);
			if (theGranularityFactory != null) {
				return theGranularityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GranularityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GranularityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GranularityPackage.TEXT_ARTEFACT: return createTextArtefact();
			case GranularityPackage.MODEL_ARTEFACT: return createModelArtefact();
			case GranularityPackage.CODE_ARTEFACT: return createCodeArtefact();
			case GranularityPackage.TEXT_FRAGMENT: return createTextFragment();
			case GranularityPackage.CODE_FRAGMENT: return createCodeFragment();
			case GranularityPackage.TEST_FRAGMENT: return createTestFragment();
			case GranularityPackage.MODEL_FRAGMENT: return createModelFragment();
			case GranularityPackage.TEST_ARTEFACT: return createTestArtefact();
			case GranularityPackage.DOCUMENT: return createDocument();
			case GranularityPackage.SECTION: return createSection();
			case GranularityPackage.PART_OF_SPEECH: return createPartOfSpeech();
			case GranularityPackage.MODEL: return createModel();
			case GranularityPackage.PACKAGE: return createPackage();
			case GranularityPackage.CLASSE: return createClasse();
			case GranularityPackage.STRUCTURAL_FEATURE: return createStructuralFeature();
			case GranularityPackage.NAMED_ELEMENT: return createNamedElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextArtefact createTextArtefact() {
		TextArtefactImpl textArtefact = new TextArtefactImpl();
		return textArtefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelArtefact createModelArtefact() {
		ModelArtefactImpl modelArtefact = new ModelArtefactImpl();
		return modelArtefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeArtefact createCodeArtefact() {
		CodeArtefactImpl codeArtefact = new CodeArtefactImpl();
		return codeArtefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFragment createTextFragment() {
		TextFragmentImpl textFragment = new TextFragmentImpl();
		return textFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFragment createCodeFragment() {
		CodeFragmentImpl codeFragment = new CodeFragmentImpl();
		return codeFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFragment createTestFragment() {
		TestFragmentImpl testFragment = new TestFragmentImpl();
		return testFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFragment createModelFragment() {
		ModelFragmentImpl modelFragment = new ModelFragmentImpl();
		return modelFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestArtefact createTestArtefact() {
		TestArtefactImpl testArtefact = new TestArtefactImpl();
		return testArtefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartOfSpeech createPartOfSpeech() {
		PartOfSpeechImpl partOfSpeech = new PartOfSpeechImpl();
		return partOfSpeech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tracea.granularity.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classe createClasse() {
		ClasseImpl classe = new ClasseImpl();
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature createStructuralFeature() {
		StructuralFeatureImpl structuralFeature = new StructuralFeatureImpl();
		return structuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GranularityPackage getGranularityPackage() {
		return (GranularityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static GranularityPackage getPackage() {
		return GranularityPackage.eINSTANCE;
	}

} //GranularityFactoryImpl
