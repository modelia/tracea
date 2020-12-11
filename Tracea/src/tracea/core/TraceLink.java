/**
 */
package tracea.core;

import tracea.relationtyping.TypedRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.TraceLink#getSource <em>Source</em>}</li>
 *   <li>{@link tracea.core.TraceLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getTraceLink()
 * @model abstract="true"
 * @generated
 */
public interface TraceLink extends TrustableElement, TypedRelationship {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ArtefactFragment)
	 * @see tracea.core.CorePackage#getTraceLink_Source()
	 * @model
	 * @generated
	 */
	ArtefactFragment getSource();

	/**
	 * Sets the value of the '{@link tracea.core.TraceLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ArtefactFragment value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ArtefactFragment)
	 * @see tracea.core.CorePackage#getTraceLink_Target()
	 * @model
	 * @generated
	 */
	ArtefactFragment getTarget();

	/**
	 * Sets the value of the '{@link tracea.core.TraceLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ArtefactFragment value);

} // TraceLink
