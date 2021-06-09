/**
 */
package tracea.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.NodeTraceLink#getSuccessors <em>Successors</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getNodeTraceLink()
 * @model
 * @generated
 */
public interface NodeTraceLink extends TraceLink {
	/**
	 * Returns the value of the '<em><b>Successors</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.core.TraceLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' containment reference list.
	 * @see tracea.core.CorePackage#getNodeTraceLink_Successors()
	 * @model type="tracea.core.TraceLink" containment="true"
	 * @generated
	 */
	EList getSuccessors();

} // NodeTraceLink
