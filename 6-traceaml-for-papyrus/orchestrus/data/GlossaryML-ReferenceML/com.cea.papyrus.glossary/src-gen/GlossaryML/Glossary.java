/**
 */
package GlossaryML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GlossaryML.Glossary#getBase_Model <em>Base Model</em>}</li>
 *   <li>{@link GlossaryML.Glossary#getKnowledgeDomainName <em>Knowledge Domain Name</em>}</li>
 *   <li>{@link GlossaryML.Glossary#getKnowledgeDomainDescription <em>Knowledge Domain Description</em>}</li>
 *   <li>{@link GlossaryML.Glossary#getSubGlossaries <em>Sub Glossaries</em>}</li>
 * </ul>
 *
 * @see GlossaryML.GlossaryMLPackage#getGlossary()
 * @model
 * @generated
 */
public interface Glossary extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Model</em>' reference.
	 * @see #setBase_Model(Model)
	 * @see GlossaryML.GlossaryMLPackage#getGlossary_Base_Model()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Model getBase_Model();

	/**
	 * Sets the value of the '{@link GlossaryML.Glossary#getBase_Model <em>Base Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Model</em>' reference.
	 * @see #getBase_Model()
	 * @generated
	 */
	void setBase_Model(Model value);

	/**
	 * Returns the value of the '<em><b>Knowledge Domain Name</b></em>' attribute.
	 * The default value is <code>"\'Specify the name of the glossary knowledge domain.\'"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledge Domain Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Domain Name</em>' attribute.
	 * @see #setKnowledgeDomainName(String)
	 * @see GlossaryML.GlossaryMLPackage#getGlossary_KnowledgeDomainName()
	 * @model default="\'Specify the name of the glossary knowledge domain.\'" unique="false" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getKnowledgeDomainName();

	/**
	 * Sets the value of the '{@link GlossaryML.Glossary#getKnowledgeDomainName <em>Knowledge Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge Domain Name</em>' attribute.
	 * @see #getKnowledgeDomainName()
	 * @generated
	 */
	void setKnowledgeDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Knowledge Domain Description</b></em>' attribute.
	 * The default value is <code>"\'Insert here a text of the description of the glossary knowledge domain.\'"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledge Domain Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Domain Description</em>' attribute.
	 * @see #setKnowledgeDomainDescription(String)
	 * @see GlossaryML.GlossaryMLPackage#getGlossary_KnowledgeDomainDescription()
	 * @model default="\'Insert here a text of the description of the glossary knowledge domain.\'" unique="false" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getKnowledgeDomainDescription();

	/**
	 * Sets the value of the '{@link GlossaryML.Glossary#getKnowledgeDomainDescription <em>Knowledge Domain Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge Domain Description</em>' attribute.
	 * @see #getKnowledgeDomainDescription()
	 * @generated
	 */
	void setKnowledgeDomainDescription(String value);

	/**
	 * Returns the value of the '<em><b>Sub Glossaries</b></em>' reference list.
	 * The list contents are of type {@link GlossaryML.Glossary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Glossaries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Glossaries</em>' reference list.
	 * @see GlossaryML.GlossaryMLPackage#getGlossary_SubGlossaries()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Glossary> getSubGlossaries();

} // Glossary
