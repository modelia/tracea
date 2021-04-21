/**
 */
package tracea.relationtyping.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import tracea.relationtyping.*;

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
 * @see tracea.relationtyping.RelationtypingPackage
 * @generated
 */
public class RelationtypingSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RelationtypingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationtypingSwitch() {
		if (modelPackage == null) {
			modelPackage = RelationtypingPackage.eINSTANCE;
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
			case RelationtypingPackage.DOMAIN_TYPE: {
				DomainType domainType = (DomainType)theEObject;
				Object result = caseDomainType(domainType);
				if (result == null) result = caseRelationshipType(domainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationtypingPackage.ENGINEERING_TYPE: {
				EngineeringType engineeringType = (EngineeringType)theEObject;
				Object result = caseEngineeringType(engineeringType);
				if (result == null) result = caseRelationshipType(engineeringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationtypingPackage.RELATIONSHIP_TYPE: {
				RelationshipType relationshipType = (RelationshipType)theEObject;
				Object result = caseRelationshipType(relationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationtypingPackage.TYPED_RELATIONSHIP: {
				TypedRelationship typedRelationship = (TypedRelationship)theEObject;
				Object result = caseTypedRelationship(typedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationtypingPackage.TRANSCLUSION: {
				Transclusion transclusion = (Transclusion)theEObject;
				Object result = caseTransclusion(transclusion);
				if (result == null) result = caseDomainType(transclusion);
				if (result == null) result = caseRelationshipType(transclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationtypingPackage.DOC2_SECTION: {
				Doc2Section doc2Section = (Doc2Section)theEObject;
				Object result = caseDoc2Section(doc2Section);
				if (result == null) result = caseEngineeringType(doc2Section);
				if (result == null) result = caseRelationshipType(doc2Section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationtypingPackage.SECTION2_PO_S: {
				Section2PoS section2PoS = (Section2PoS)theEObject;
				Object result = caseSection2PoS(section2PoS);
				if (result == null) result = caseEngineeringType(section2PoS);
				if (result == null) result = caseRelationshipType(section2PoS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationtypingPackage.PO_SSYNONYM: {
				PoSSynonym poSSynonym = (PoSSynonym)theEObject;
				Object result = casePoSSynonym(poSSynonym);
				if (result == null) result = caseDomainType(poSSynonym);
				if (result == null) result = caseRelationshipType(poSSynonym);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationtypingPackage.PO_S2_NAMED_ENTITY: {
				PoS2NamedEntity poS2NamedEntity = (PoS2NamedEntity)theEObject;
				Object result = casePoS2NamedEntity(poS2NamedEntity);
				if (result == null) result = caseEngineeringType(poS2NamedEntity);
				if (result == null) result = caseRelationshipType(poS2NamedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationtypingPackage.NAMED_ENTITY_SYNONYM: {
				NamedEntitySynonym namedEntitySynonym = (NamedEntitySynonym)theEObject;
				Object result = caseNamedEntitySynonym(namedEntitySynonym);
				if (result == null) result = caseDomainType(namedEntitySynonym);
				if (result == null) result = caseRelationshipType(namedEntitySynonym);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationtypingPackage.NAMED_ENTITY2_CLASS: {
				NamedEntity2Class namedEntity2Class = (NamedEntity2Class)theEObject;
				Object result = caseNamedEntity2Class(namedEntity2Class);
				if (result == null) result = caseEngineeringType(namedEntity2Class);
				if (result == null) result = caseRelationshipType(namedEntity2Class);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationtypingPackage.NAME_ENTITY2_PACKAGE: {
				NameEntity2Package nameEntity2Package = (NameEntity2Package)theEObject;
				Object result = caseNameEntity2Package(nameEntity2Package);
				if (result == null) result = caseEngineeringType(nameEntity2Package);
				if (result == null) result = caseRelationshipType(nameEntity2Package);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RelationtypingPackage.PACKAGE2_MODEL: {
				Package2Model package2Model = (Package2Model)theEObject;
				Object result = casePackage2Model(package2Model);
				if (result == null) result = caseEngineeringType(package2Model);
				if (result == null) result = caseRelationshipType(package2Model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDomainType(DomainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineering Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineering Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEngineeringType(EngineeringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRelationshipType(RelationshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypedRelationship(TypedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transclusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transclusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransclusion(Transclusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc2 Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc2 Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDoc2Section(Doc2Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section2 Po S</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section2 Po S</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSection2PoS(Section2PoS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Po SSynonym</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Po SSynonym</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePoSSynonym(PoSSynonym object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Po S2 Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Po S2 Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePoS2NamedEntity(PoS2NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity Synonym</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity Synonym</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedEntitySynonym(NamedEntitySynonym object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity2 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedEntity2Class(NamedEntity2Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Entity2 Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Entity2 Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNameEntity2Package(NameEntity2Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package2 Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package2 Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackage2Model(Package2Model object) {
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

} //RelationtypingSwitch
