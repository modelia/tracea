/**
 */
package GlossaryML;

import ReferenceML.Reference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GlossaryML.Term#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link GlossaryML.Term#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link GlossaryML.Term#getMeanings <em>Meanings</em>}</li>
 *   <li>{@link GlossaryML.Term#getCommonMeaning <em>Common Meaning</em>}</li>
 *   <li>{@link GlossaryML.Term#getHyponyms <em>Hyponyms</em>}</li>
 *   <li>{@link GlossaryML.Term#getHypernyms <em>Hypernyms</em>}</li>
 *   <li>{@link GlossaryML.Term#getSynonyms <em>Synonyms</em>}</li>
 *   <li>{@link GlossaryML.Term#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see GlossaryML.GlossaryMLPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see GlossaryML.GlossaryMLPackage#getTerm_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link GlossaryML.Term#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acronym</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acronym</em>' attribute.
	 * @see #setAcronym(String)
	 * @see GlossaryML.GlossaryMLPackage#getTerm_Acronym()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAcronym();

	/**
	 * Sets the value of the '{@link GlossaryML.Term#getAcronym <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acronym</em>' attribute.
	 * @see #getAcronym()
	 * @generated
	 */
	void setAcronym(String value);

	/**
	 * Returns the value of the '<em><b>Meanings</b></em>' reference list.
	 * The list contents are of type {@link GlossaryML.Definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The meanings atribute is a derived attribute. Its value is calculated as being the set of owned comments stereotyped as <<Definition>>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meanings</em>' reference list.
	 * @see GlossaryML.GlossaryMLPackage#getTerm_Meanings()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Definition> getMeanings();

	/**
	 * Returns the value of the '<em><b>Common Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The commonMeaning attribute is a derived property subetting the meanings attribute. The derivation rule shall be the following: the value of the commonMeaning attribute is calculated as being the Definition model element (i.e., owned comments stereotyped with &lt;&lt;Definition&gt;&gt; and annotating the owner element, in that case the Term itself).&nbsp;</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Common Meaning</em>' reference.
	 * @see GlossaryML.GlossaryMLPackage#getTerm_CommonMeaning()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Definition getCommonMeaning();

	/**
	 * Returns the value of the '<em><b>Hyponyms</b></em>' reference list.
	 * The list contents are of type {@link GlossaryML.Term}.
	 * It is bidirectional and its opposite is '{@link GlossaryML.Term#getHypernyms <em>Hypernyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hyponyms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyponyms</em>' reference list.
	 * @see GlossaryML.GlossaryMLPackage#getTerm_Hyponyms()
	 * @see GlossaryML.Term#getHypernyms
	 * @model opposite="hypernyms" ordered="false"
	 * @generated
	 */
	EList<Term> getHyponyms();

	/**
	 * Returns the value of the '<em><b>Hypernyms</b></em>' reference list.
	 * The list contents are of type {@link GlossaryML.Term}.
	 * It is bidirectional and its opposite is '{@link GlossaryML.Term#getHyponyms <em>Hyponyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypernyms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypernyms</em>' reference list.
	 * @see GlossaryML.GlossaryMLPackage#getTerm_Hypernyms()
	 * @see GlossaryML.Term#getHyponyms
	 * @model opposite="hyponyms" ordered="false"
	 * @generated
	 */
	EList<Term> getHypernyms();

	/**
	 * Returns the value of the '<em><b>Synonyms</b></em>' reference list.
	 * The list contents are of type {@link GlossaryML.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synonyms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonyms</em>' reference list.
	 * @see GlossaryML.GlossaryMLPackage#getTerm_Synonyms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Term> getSynonyms();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference list.
	 * The list contents are of type {@link ReferenceML.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference list.
	 * @see GlossaryML.GlossaryMLPackage#getTerm_Reference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Reference> getReference();

} // Term
