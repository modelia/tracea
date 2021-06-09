/**
 */
package tracea.granularity;

import org.eclipse.emf.common.util.EList;

import tracea.core.Artefact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.TextArtefact#getTextfragments <em>Textfragments</em>}</li>
 * </ul>
 *
 * @see tracea.granularity.GranularityPackage#getTextArtefact()
 * @model
 * @generated
 */
public interface TextArtefact extends Artefact {
	/**
	 * Returns the value of the '<em><b>Textfragments</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.TextFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textfragments</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getTextArtefact_Textfragments()
	 * @model type="tracea.granularity.TextFragment" containment="true"
	 * @generated
	 */
	EList getTextfragments();

} // TextArtefact
