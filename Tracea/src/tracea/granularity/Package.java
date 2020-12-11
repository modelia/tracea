/**
 */
package tracea.granularity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.Package#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see tracea.granularity.GranularityPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ModelFragment {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.granularity.Classe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see tracea.granularity.GranularityPackage#getPackage_Classes()
	 * @model type="tracea.granularity.Classe" containment="true"
	 * @generated
	 */
	EList getClasses();

} // Package
