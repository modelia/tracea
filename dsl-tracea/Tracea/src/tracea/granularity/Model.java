/**
 */
package tracea.granularity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.Model#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see tracea.granularity.GranularityPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends ModelArtefact {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getModel_Packages()
	 * @model type="tracea.granularity.Package" containment="true"
	 * @generated
	 */
	EList getPackages();

} // Model
