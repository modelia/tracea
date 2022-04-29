/**
 */
package GlossaryML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GlossaryML.GlossaryMLFactory
 * @model kind="package"
 * @generated
 */
public interface GlossaryMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GlossaryML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.cea.papyrus.glossaryml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GlossaryML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlossaryMLPackage eINSTANCE = GlossaryML.impl.GlossaryMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link GlossaryML.impl.GlossaryImpl <em>Glossary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GlossaryML.impl.GlossaryImpl
	 * @see GlossaryML.impl.GlossaryMLPackageImpl#getGlossary()
	 * @generated
	 */
	int GLOSSARY = 0;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__BASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Knowledge Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__KNOWLEDGE_DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Knowledge Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__KNOWLEDGE_DOMAIN_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Sub Glossaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__SUB_GLOSSARIES = 3;

	/**
	 * The number of structural features of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GlossaryML.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GlossaryML.impl.TermImpl
	 * @see GlossaryML.impl.GlossaryMLPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ACRONYM = 1;

	/**
	 * The feature id for the '<em><b>Meanings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__MEANINGS = 2;

	/**
	 * The feature id for the '<em><b>Common Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__COMMON_MEANING = 3;

	/**
	 * The feature id for the '<em><b>Hyponyms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__HYPONYMS = 4;

	/**
	 * The feature id for the '<em><b>Hypernyms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__HYPERNYMS = 5;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__SYNONYMS = 6;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__REFERENCE = 7;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GlossaryML.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GlossaryML.impl.DefinitionImpl
	 * @see GlossaryML.impl.GlossaryMLPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__BASE_COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Is Common</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__IS_COMMON = 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link GlossaryML.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary</em>'.
	 * @see GlossaryML.Glossary
	 * @generated
	 */
	EClass getGlossary();

	/**
	 * Returns the meta object for the reference '{@link GlossaryML.Glossary#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see GlossaryML.Glossary#getBase_Model()
	 * @see #getGlossary()
	 * @generated
	 */
	EReference getGlossary_Base_Model();

	/**
	 * Returns the meta object for the attribute '{@link GlossaryML.Glossary#getKnowledgeDomainName <em>Knowledge Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Knowledge Domain Name</em>'.
	 * @see GlossaryML.Glossary#getKnowledgeDomainName()
	 * @see #getGlossary()
	 * @generated
	 */
	EAttribute getGlossary_KnowledgeDomainName();

	/**
	 * Returns the meta object for the attribute '{@link GlossaryML.Glossary#getKnowledgeDomainDescription <em>Knowledge Domain Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Knowledge Domain Description</em>'.
	 * @see GlossaryML.Glossary#getKnowledgeDomainDescription()
	 * @see #getGlossary()
	 * @generated
	 */
	EAttribute getGlossary_KnowledgeDomainDescription();

	/**
	 * Returns the meta object for the reference list '{@link GlossaryML.Glossary#getSubGlossaries <em>Sub Glossaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Glossaries</em>'.
	 * @see GlossaryML.Glossary#getSubGlossaries()
	 * @see #getGlossary()
	 * @generated
	 */
	EReference getGlossary_SubGlossaries();

	/**
	 * Returns the meta object for class '{@link GlossaryML.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see GlossaryML.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the reference '{@link GlossaryML.Term#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see GlossaryML.Term#getBase_Class()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link GlossaryML.Term#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acronym</em>'.
	 * @see GlossaryML.Term#getAcronym()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Acronym();

	/**
	 * Returns the meta object for the reference list '{@link GlossaryML.Term#getMeanings <em>Meanings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meanings</em>'.
	 * @see GlossaryML.Term#getMeanings()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Meanings();

	/**
	 * Returns the meta object for the reference '{@link GlossaryML.Term#getCommonMeaning <em>Common Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Common Meaning</em>'.
	 * @see GlossaryML.Term#getCommonMeaning()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_CommonMeaning();

	/**
	 * Returns the meta object for the reference list '{@link GlossaryML.Term#getHyponyms <em>Hyponyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hyponyms</em>'.
	 * @see GlossaryML.Term#getHyponyms()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Hyponyms();

	/**
	 * Returns the meta object for the reference list '{@link GlossaryML.Term#getHypernyms <em>Hypernyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hypernyms</em>'.
	 * @see GlossaryML.Term#getHypernyms()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Hypernyms();

	/**
	 * Returns the meta object for the reference list '{@link GlossaryML.Term#getSynonyms <em>Synonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synonyms</em>'.
	 * @see GlossaryML.Term#getSynonyms()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Synonyms();

	/**
	 * Returns the meta object for the reference list '{@link GlossaryML.Term#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see GlossaryML.Term#getReference()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Reference();

	/**
	 * Returns the meta object for class '{@link GlossaryML.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see GlossaryML.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the reference '{@link GlossaryML.Definition#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see GlossaryML.Definition#getBase_Comment()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Base_Comment();

	/**
	 * Returns the meta object for the attribute '{@link GlossaryML.Definition#isCommon <em>Is Common</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Common</em>'.
	 * @see GlossaryML.Definition#isCommon()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_IsCommon();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GlossaryMLFactory getGlossaryMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GlossaryML.impl.GlossaryImpl <em>Glossary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GlossaryML.impl.GlossaryImpl
		 * @see GlossaryML.impl.GlossaryMLPackageImpl#getGlossary()
		 * @generated
		 */
		EClass GLOSSARY = eINSTANCE.getGlossary();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY__BASE_MODEL = eINSTANCE.getGlossary_Base_Model();

		/**
		 * The meta object literal for the '<em><b>Knowledge Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY__KNOWLEDGE_DOMAIN_NAME = eINSTANCE.getGlossary_KnowledgeDomainName();

		/**
		 * The meta object literal for the '<em><b>Knowledge Domain Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY__KNOWLEDGE_DOMAIN_DESCRIPTION = eINSTANCE.getGlossary_KnowledgeDomainDescription();

		/**
		 * The meta object literal for the '<em><b>Sub Glossaries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY__SUB_GLOSSARIES = eINSTANCE.getGlossary_SubGlossaries();

		/**
		 * The meta object literal for the '{@link GlossaryML.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GlossaryML.impl.TermImpl
		 * @see GlossaryML.impl.GlossaryMLPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__BASE_CLASS = eINSTANCE.getTerm_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__ACRONYM = eINSTANCE.getTerm_Acronym();

		/**
		 * The meta object literal for the '<em><b>Meanings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__MEANINGS = eINSTANCE.getTerm_Meanings();

		/**
		 * The meta object literal for the '<em><b>Common Meaning</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__COMMON_MEANING = eINSTANCE.getTerm_CommonMeaning();

		/**
		 * The meta object literal for the '<em><b>Hyponyms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__HYPONYMS = eINSTANCE.getTerm_Hyponyms();

		/**
		 * The meta object literal for the '<em><b>Hypernyms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__HYPERNYMS = eINSTANCE.getTerm_Hypernyms();

		/**
		 * The meta object literal for the '<em><b>Synonyms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__SYNONYMS = eINSTANCE.getTerm_Synonyms();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__REFERENCE = eINSTANCE.getTerm_Reference();

		/**
		 * The meta object literal for the '{@link GlossaryML.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GlossaryML.impl.DefinitionImpl
		 * @see GlossaryML.impl.GlossaryMLPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__BASE_COMMENT = eINSTANCE.getDefinition_Base_Comment();

		/**
		 * The meta object literal for the '<em><b>Is Common</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__IS_COMMON = eINSTANCE.getDefinition_IsCommon();

	}

} //GlossaryMLPackage
