/**
 */
package tracea.relationtyping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.relationtyping.TypedRelationship#getRelationshiptype <em>Relationshiptype</em>}</li>
 * </ul>
 *
 * @see tracea.relationtyping.RelationtypingPackage#getTypedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface TypedRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationshiptype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationshiptype</em>' containment reference.
	 * @see #setRelationshiptype(RelationshipType)
	 * @see tracea.relationtyping.RelationtypingPackage#getTypedRelationship_Relationshiptype()
	 * @model containment="true"
	 * @generated
	 */
	RelationshipType getRelationshiptype();

	/**
	 * Sets the value of the '{@link tracea.relationtyping.TypedRelationship#getRelationshiptype <em>Relationshiptype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationshiptype</em>' containment reference.
	 * @see #getRelationshiptype()
	 * @generated
	 */
	void setRelationshiptype(RelationshipType value);

} // TypedRelationship
