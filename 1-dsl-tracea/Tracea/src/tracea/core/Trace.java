/**
 */
package tracea.core;

import org.eclipse.emf.common.util.EList;

import tracea.relationtyping.TypedRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.Trace#getSourceArtefacts <em>Source Artefacts</em>}</li>
 *   <li>{@link tracea.core.Trace#getTargets <em>Targets</em>}</li>
 *   <li>{@link tracea.core.Trace#getSources <em>Sources</em>}</li>
 *   <li>{@link tracea.core.Trace#getEvidences <em>Evidences</em>}</li>
 *   <li>{@link tracea.core.Trace#getTargetArtefacts <em>Target Artefacts</em>}</li>
 *   <li>{@link tracea.core.Trace#getStarts <em>Starts</em>}</li>
 *   <li>{@link tracea.core.Trace#getTracelinks <em>Tracelinks</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends TypedRelationship, TrustableElement {
	/**
	 * Returns the value of the '<em><b>Source Artefacts</b></em>' reference list.
	 * The list contents are of type {@link tracea.core.Artefact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Artefacts</em>' reference list.
	 * @see tracea.core.CorePackage#getTrace_SourceArtefacts()
	 * @model type="tracea.core.Artefact" derived="true"
	 * @generated
	 */
	EList getSourceArtefacts();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link tracea.core.ArtefactFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see tracea.core.CorePackage#getTrace_Targets()
	 * @model type="tracea.core.ArtefactFragment" derived="true"
	 * @generated
	 */
	EList getTargets();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link tracea.core.ArtefactFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see tracea.core.CorePackage#getTrace_Sources()
	 * @model type="tracea.core.ArtefactFragment" derived="true"
	 * @generated
	 */
	EList getSources();

	/**
	 * Returns the value of the '<em><b>Evidences</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.core.Evidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidences</em>' containment reference list.
	 * @see tracea.core.CorePackage#getTrace_Evidences()
	 * @model type="tracea.core.Evidence" containment="true"
	 * @generated
	 */
	EList getEvidences();

	/**
	 * Returns the value of the '<em><b>Target Artefacts</b></em>' reference list.
	 * The list contents are of type {@link tracea.core.Artefact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Artefacts</em>' reference list.
	 * @see tracea.core.CorePackage#getTrace_TargetArtefacts()
	 * @model type="tracea.core.Artefact" derived="true"
	 * @generated
	 */
	EList getTargetArtefacts();

	/**
	 * Returns the value of the '<em><b>Starts</b></em>' reference list.
	 * The list contents are of type {@link tracea.core.TraceLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starts</em>' reference list.
	 * @see tracea.core.CorePackage#getTrace_Starts()
	 * @model type="tracea.core.TraceLink"
	 * @generated
	 */
	EList getStarts();

	/**
	 * Returns the value of the '<em><b>Tracelinks</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.core.TraceLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracelinks</em>' containment reference list.
	 * @see tracea.core.CorePackage#getTrace_Tracelinks()
	 * @model type="tracea.core.TraceLink" containment="true"
	 * @generated
	 */
	EList getTracelinks();

} // Trace
