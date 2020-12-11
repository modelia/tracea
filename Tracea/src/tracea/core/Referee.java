/**
 */
package tracea.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.Referee#getName <em>Name</em>}</li>
 *   <li>{@link tracea.core.Referee#getTrustableElements <em>Trustable Elements</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getReferee()
 * @model
 * @generated
 */
public interface Referee extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tracea.core.CorePackage#getReferee_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tracea.core.Referee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Trustable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trustable Elements</em>' reference.
	 * @see #setTrustableElements(TrustableElement)
	 * @see tracea.core.CorePackage#getReferee_TrustableElements()
	 * @model
	 * @generated
	 */
	TrustableElement getTrustableElements();

	/**
	 * Sets the value of the '{@link tracea.core.Referee#getTrustableElements <em>Trustable Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trustable Elements</em>' reference.
	 * @see #getTrustableElements()
	 * @generated
	 */
	void setTrustableElements(TrustableElement value);

} // Referee
