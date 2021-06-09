/**
 */
package org.eclipse.capra.generic.tracemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.RelatedTo#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.capra.generic.tracemodel.RelatedTo#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getRelatedTo()
 * @model
 * @generated
 */
public interface RelatedTo extends TraceLink {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(EObject)
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getRelatedTo_Origin()
	 * @model required="true"
	 * @generated
	 */
	EObject getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.capra.generic.tracemodel.RelatedTo#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(EObject value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage#getRelatedTo_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<EObject> getTargets();

} // RelatedTo
