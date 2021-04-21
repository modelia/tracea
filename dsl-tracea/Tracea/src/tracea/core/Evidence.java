/**
 */
package tracea.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.Evidence#getImpactedElements <em>Impacted Elements</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getEvidence()
 * @model
 * @generated
 */
public interface Evidence extends TrustableElement {
	/**
	 * Returns the value of the '<em><b>Impacted Elements</b></em>' reference list.
	 * The list contents are of type {@link tracea.core.TrustableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impacted Elements</em>' reference list.
	 * @see tracea.core.CorePackage#getEvidence_ImpactedElements()
	 * @model type="tracea.core.TrustableElement"
	 * @generated
	 */
	EList getImpactedElements();

} // Evidence
