/**
 */
package tracea.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.Artefact#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getArtefact()
 * @model abstract="true"
 * @generated
 */
public interface Artefact extends TrustableElement {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.core.ArtefactFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see tracea.core.CorePackage#getArtefact_Fragments()
	 * @model type="tracea.core.ArtefactFragment" containment="true"
	 * @generated
	 */
	EList getFragments();

} // Artefact
