/**
 */
package tracea.granularity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Of Speech</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.granularity.PartOfSpeech#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see tracea.granularity.GranularityPackage#getPartOfSpeech()
 * @model
 * @generated
 */
public interface PartOfSpeech extends TextFragment {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see tracea.granularity.GranularityPackage#getPartOfSpeech_Position()
	 * @model
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link tracea.granularity.PartOfSpeech#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

} // PartOfSpeech
