/**
 */
package tracea.granularity.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tracea.granularity.GranularityPackage
 * @generated
 */
public class GranularitySwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GranularityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GranularitySwitch() {
		if (modelPackage == null) {
			modelPackage = GranularityPackage.eINSTANCE;
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
			case GranularityPackage.TEXT_ARTEFACT: {
				TextArtefact textArtefact = (TextArtefact)theEObject;
				Object result = caseTextArtefact(textArtefact);
				if (result == null) result = caseArtefact(textArtefact);
				if (result == null) result = caseTrustableElement(textArtefact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.MODEL_ARTEFACT: {
				ModelArtefact modelArtefact = (ModelArtefact)theEObject;
				Object result = caseModelArtefact(modelArtefact);
				if (result == null) result = caseArtefact(modelArtefact);
				if (result == null) result = caseTrustableElement(modelArtefact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.CODE_ARTEFACT: {
				CodeArtefact codeArtefact = (CodeArtefact)theEObject;
				Object result = caseCodeArtefact(codeArtefact);
				if (result == null) result = caseArtefact(codeArtefact);
				if (result == null) result = caseTrustableElement(codeArtefact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.TEXT_FRAGMENT: {
				TextFragment textFragment = (TextFragment)theEObject;
				Object result = caseTextFragment(textFragment);
				if (result == null) result = caseArtefactFragment(textFragment);
				if (result == null) result = caseTrustableElement(textFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.CODE_FRAGMENT: {
				CodeFragment codeFragment = (CodeFragment)theEObject;
				Object result = caseCodeFragment(codeFragment);
				if (result == null) result = caseArtefactFragment(codeFragment);
				if (result == null) result = caseTrustableElement(codeFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.TEST_FRAGMENT: {
				TestFragment testFragment = (TestFragment)theEObject;
				Object result = caseTestFragment(testFragment);
				if (result == null) result = caseArtefactFragment(testFragment);
				if (result == null) result = caseTrustableElement(testFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.MODEL_FRAGMENT: {
				ModelFragment modelFragment = (ModelFragment)theEObject;
				Object result = caseModelFragment(modelFragment);
				if (result == null) result = caseArtefactFragment(modelFragment);
				if (result == null) result = caseTrustableElement(modelFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.TEST_ARTEFACT: {
				TestArtefact testArtefact = (TestArtefact)theEObject;
				Object result = caseTestArtefact(testArtefact);
				if (result == null) result = caseArtefact(testArtefact);
				if (result == null) result = caseTrustableElement(testArtefact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				Object result = caseDocument(document);
				if (result == null) result = caseTextArtefact(document);
				if (result == null) result = caseArtefact(document);
				if (result == null) result = caseTrustableElement(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.SECTION: {
				Section section = (Section)theEObject;
				Object result = caseSection(section);
				if (result == null) result = caseTextFragment(section);
				if (result == null) result = caseArtefactFragment(section);
				if (result == null) result = caseTrustableElement(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.PART_OF_SPEECH: {
				PartOfSpeech partOfSpeech = (PartOfSpeech)theEObject;
				Object result = casePartOfSpeech(partOfSpeech);
				if (result == null) result = caseTextFragment(partOfSpeech);
				if (result == null) result = caseArtefactFragment(partOfSpeech);
				if (result == null) result = caseTrustableElement(partOfSpeech);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.MODEL: {
				Model model = (Model)theEObject;
				Object result = caseModel(model);
				if (result == null) result = caseModelArtefact(model);
				if (result == null) result = caseArtefact(model);
				if (result == null) result = caseTrustableElement(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.PACKAGE: {
				tracea.granularity.Package package_ = (tracea.granularity.Package)theEObject;
				Object result = casePackage(package_);
				if (result == null) result = caseModelFragment(package_);
				if (result == null) result = caseArtefactFragment(package_);
				if (result == null) result = caseTrustableElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.CLASSE: {
				Classe classe = (Classe)theEObject;
				Object result = caseClasse(classe);
				if (result == null) result = caseModelFragment(classe);
				if (result == null) result = caseArtefactFragment(classe);
				if (result == null) result = caseTrustableElement(classe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.STRUCTURAL_FEATURE: {
				StructuralFeature structuralFeature = (StructuralFeature)theEObject;
				Object result = caseStructuralFeature(structuralFeature);
				if (result == null) result = caseModelFragment(structuralFeature);
				if (result == null) result = caseArtefactFragment(structuralFeature);
				if (result == null) result = caseTrustableElement(structuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GranularityPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				Object result = caseNamedElement(namedElement);
				if (result == null) result = caseModelFragment(namedElement);
				if (result == null) result = caseArtefactFragment(namedElement);
				if (result == null) result = caseTrustableElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Artefact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Artefact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTextArtefact(TextArtefact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Artefact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Artefact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelArtefact(ModelArtefact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Artefact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Artefact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCodeArtefact(CodeArtefact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTextFragment(TextFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCodeFragment(CodeFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTestFragment(TestFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelFragment(ModelFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Artefact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Artefact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTestArtefact(TestArtefact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Of Speech</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Of Speech</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePartOfSpeech(PartOfSpeech object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackage(tracea.granularity.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClasse(Classe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
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

} //GranularitySwitch
