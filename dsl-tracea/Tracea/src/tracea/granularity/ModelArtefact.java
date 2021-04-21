/**
 */
package tracea.granularity;

import org.eclipse.emf.common.util.EList;

import tracea.core.Artefact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.ModelArtefact#getModelfragments <em>Modelfragments</em>}</li>
 * </ul>
 *
 * @see tracea.granularity.GranularityPackage#getModelArtefact()
 * @model
 * @generated
 */
public interface ModelArtefact extends Artefact {
	/**
	 * Returns the value of the '<em><b>Modelfragments</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.ModelFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelfragments</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getModelArtefact_Modelfragments()
	 * @model type="tracea.granularity.ModelFragment" containment="true"
	 * @generated
	 */
	EList getModelfragments();

} // ModelArtefact
