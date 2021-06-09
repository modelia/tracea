/**
 */
package tracea.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artefact Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.ArtefactFragment#getSubFragment <em>Sub Fragment</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getArtefactFragment()
 * @model abstract="true"
 * @generated
 */
public interface ArtefactFragment extends TrustableElement {
	/**
	 * Returns the value of the '<em><b>Sub Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.core.ArtefactFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Fragment</em>' containment reference list.
	 * @see tracea.core.CorePackage#getArtefactFragment_SubFragment()
	 * @model type="tracea.core.ArtefactFragment" containment="true"
	 * @generated
	 */
	EList getSubFragment();

} // ArtefactFragment
