/**
 */
package tracea.granularity.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tracea.core.Artefact;
import tracea.core.ArtefactFragment;
import tracea.core.TrustableElement;

import tracea.granularity.Classe;
import tracea.granularity.CodeArtefact;
import tracea.granularity.CodeFragment;
import tracea.granularity.Document;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tracea.granularity.GranularityPackage
 * @generated
 */
public class GranularityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GranularityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GranularityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GranularityPackage.eINSTANCE;
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
	protected GranularitySwitch modelSwitch =
		new GranularitySwitch() {
			public Object caseTextArtefact(TextArtefact object) {
				return createTextArtefactAdapter();
			}
			public Object caseModelArtefact(ModelArtefact object) {
				return createModelArtefactAdapter();
			}
			public Object caseCodeArtefact(CodeArtefact object) {
				return createCodeArtefactAdapter();
			}
			public Object caseTextFragment(TextFragment object) {
				return createTextFragmentAdapter();
			}
			public Object caseCodeFragment(CodeFragment object) {
				return createCodeFragmentAdapter();
			}
			public Object caseTestFragment(TestFragment object) {
				return createTestFragmentAdapter();
			}
			public Object caseModelFragment(ModelFragment object) {
				return createModelFragmentAdapter();
			}
			public Object caseTestArtefact(TestArtefact object) {
				return createTestArtefactAdapter();
			}
			public Object caseDocument(Document object) {
				return createDocumentAdapter();
			}
			public Object caseSection(Section object) {
				return createSectionAdapter();
			}
			public Object casePartOfSpeech(PartOfSpeech object) {
				return createPartOfSpeechAdapter();
			}
			public Object caseModel(Model object) {
				return createModelAdapter();
			}
			public Object casePackage(tracea.granularity.Package object) {
				return createPackageAdapter();
			}
			public Object caseClasse(Classe object) {
				return createClasseAdapter();
			}
			public Object caseStructuralFeature(StructuralFeature object) {
				return createStructuralFeatureAdapter();
			}
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object caseTrustableElement(TrustableElement object) {
				return createTrustableElementAdapter();
			}
			public Object caseArtefact(Artefact object) {
				return createArtefactAdapter();
			}
			public Object caseArtefactFragment(ArtefactFragment object) {
				return createArtefactFragmentAdapter();
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
	 * Creates a new adapter for an object of class '{@link tracea.granularity.TextArtefact <em>Text Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.TextArtefact
	 * @generated
	 */
	public Adapter createTextArtefactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.ModelArtefact <em>Model Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.ModelArtefact
	 * @generated
	 */
	public Adapter createModelArtefactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.CodeArtefact <em>Code Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.CodeArtefact
	 * @generated
	 */
	public Adapter createCodeArtefactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.TextFragment <em>Text Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.TextFragment
	 * @generated
	 */
	public Adapter createTextFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.CodeFragment <em>Code Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.CodeFragment
	 * @generated
	 */
	public Adapter createCodeFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.TestFragment <em>Test Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.TestFragment
	 * @generated
	 */
	public Adapter createTestFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.ModelFragment <em>Model Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.ModelFragment
	 * @generated
	 */
	public Adapter createModelFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.TestArtefact <em>Test Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.TestArtefact
	 * @generated
	 */
	public Adapter createTestArtefactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.PartOfSpeech <em>Part Of Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.PartOfSpeech
	 * @generated
	 */
	public Adapter createPartOfSpeechAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.Classe <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.Classe
	 * @generated
	 */
	public Adapter createClasseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tracea.granularity.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tracea.granularity.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
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

} //GranularityAdapterFactory
