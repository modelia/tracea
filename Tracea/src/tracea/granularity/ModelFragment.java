/**
 */
package tracea.granularity;

import org.eclipse.emf.common.util.EList;

import tracea.core.ArtefactFragment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.ModelFragment#getNamedelementsDefined <em>Namedelements Defined</em>}</li>
 *   <li>{@link tracea.granularity.ModelFragment#getNamedelementsUsed <em>Namedelements Used</em>}</li>
 * </ul>
 *
 * @see tracea.granularity.GranularityPackage#getModelFragment()
 * @model
 * @generated
 */
public interface ModelFragment extends ArtefactFragment {
	/**
	 * Returns the value of the '<em><b>Namedelements Defined</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namedelements Defined</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getModelFragment_NamedelementsDefined()
	 * @model type="tracea.granularity.NamedElement" containment="true"
	 * @generated
	 */
	EList getNamedelementsDefined();

	/**
	 * Returns the value of the '<em><b>Namedelements Used</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namedelements Used</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getModelFragment_NamedelementsUsed()
	 * @model type="tracea.granularity.NamedElement" containment="true"
	 * @generated
	 */
	EList getNamedelementsUsed();

} // ModelFragment
