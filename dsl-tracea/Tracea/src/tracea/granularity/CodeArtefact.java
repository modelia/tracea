/**
 */
package tracea.granularity;

import org.eclipse.emf.common.util.EList;

import tracea.core.Artefact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.CodeArtefact#getCodefragment <em>Codefragment</em>}</li>
 * </ul>
 *
 * @see tracea.granularity.GranularityPackage#getCodeArtefact()
 * @model
 * @generated
 */
public interface CodeArtefact extends Artefact {
	/**
	 * Returns the value of the '<em><b>Codefragment</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.CodeFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codefragment</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getCodeArtefact_Codefragment()
	 * @model type="tracea.granularity.CodeFragment" containment="true"
	 * @generated
	 */
	EList getCodefragment();

} // CodeArtefact
