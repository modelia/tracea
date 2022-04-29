/**
 */
package ReferenceML;

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
 * <!-- begin-model-doc -->
 * <p>Defines all the concepts needed to create a model libray of document references.</p>
 * 
 * <p>Changes History</p>
 * 
 * <!-- end-model-doc -->
 * @see ReferenceML.ReferenceMLFactory
 * @model kind="package"
 * @generated
 */
public interface ReferenceMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ReferenceML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.cea.papyrus.referenceml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ReferenceML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferenceMLPackage eINSTANCE = ReferenceML.impl.ReferenceMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link ReferenceML.impl.ReferenceLibraryImpl <em>Reference Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReferenceML.impl.ReferenceLibraryImpl
	 * @see ReferenceML.impl.ReferenceMLPackageImpl#getReferenceLibrary()
	 * @generated
	 */
	int REFERENCE_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIBRARY__BASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIBRARY__COLLECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Reference Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reference Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ReferenceML.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReferenceML.impl.CollectionImpl
	 * @see ReferenceML.impl.ReferenceMLPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__REFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Subcollection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__SUBCOLLECTION = 2;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ReferenceML.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReferenceML.impl.ReferenceImpl
	 * @see ReferenceML.impl.ReferenceMLPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>RDOI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__RDOI = 3;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ReferenceML.ReferenceLibrary <em>Reference Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Library</em>'.
	 * @see ReferenceML.ReferenceLibrary
	 * @generated
	 */
	EClass getReferenceLibrary();

	/**
	 * Returns the meta object for the reference '{@link ReferenceML.ReferenceLibrary#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see ReferenceML.ReferenceLibrary#getBase_Model()
	 * @see #getReferenceLibrary()
	 * @generated
	 */
	EReference getReferenceLibrary_Base_Model();

	/**
	 * Returns the meta object for the reference list '{@link ReferenceML.ReferenceLibrary#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collections</em>'.
	 * @see ReferenceML.ReferenceLibrary#getCollections()
	 * @see #getReferenceLibrary()
	 * @generated
	 */
	EReference getReferenceLibrary_Collections();

	/**
	 * Returns the meta object for class '{@link ReferenceML.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see ReferenceML.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the reference '{@link ReferenceML.Collection#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see ReferenceML.Collection#getBase_Package()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Base_Package();

	/**
	 * Returns the meta object for the reference list '{@link ReferenceML.Collection#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see ReferenceML.Collection#getReferences()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_References();

	/**
	 * Returns the meta object for the reference list '{@link ReferenceML.Collection#getSubcollection <em>Subcollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subcollection</em>'.
	 * @see ReferenceML.Collection#getSubcollection()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Subcollection();

	/**
	 * Returns the meta object for class '{@link ReferenceML.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see ReferenceML.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link ReferenceML.Reference#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ReferenceML.Reference#getBase_Class()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link ReferenceML.Reference#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see ReferenceML.Reference#getAbstract()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link ReferenceML.Reference#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see ReferenceML.Reference#getLocation()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Location();

	/**
	 * Returns the meta object for the attribute '{@link ReferenceML.Reference#getRDOI <em>RDOI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RDOI</em>'.
	 * @see ReferenceML.Reference#getRDOI()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_RDOI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReferenceMLFactory getReferenceMLFactory();

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
		 * The meta object literal for the '{@link ReferenceML.impl.ReferenceLibraryImpl <em>Reference Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReferenceML.impl.ReferenceLibraryImpl
		 * @see ReferenceML.impl.ReferenceMLPackageImpl#getReferenceLibrary()
		 * @generated
		 */
		EClass REFERENCE_LIBRARY = eINSTANCE.getReferenceLibrary();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_LIBRARY__BASE_MODEL = eINSTANCE.getReferenceLibrary_Base_Model();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_LIBRARY__COLLECTIONS = eINSTANCE.getReferenceLibrary_Collections();

		/**
		 * The meta object literal for the '{@link ReferenceML.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReferenceML.impl.CollectionImpl
		 * @see ReferenceML.impl.ReferenceMLPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__BASE_PACKAGE = eINSTANCE.getCollection_Base_Package();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__REFERENCES = eINSTANCE.getCollection_References();

		/**
		 * The meta object literal for the '<em><b>Subcollection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__SUBCOLLECTION = eINSTANCE.getCollection_Subcollection();

		/**
		 * The meta object literal for the '{@link ReferenceML.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReferenceML.impl.ReferenceImpl
		 * @see ReferenceML.impl.ReferenceMLPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__BASE_CLASS = eINSTANCE.getReference_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__ABSTRACT = eINSTANCE.getReference_Abstract();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__LOCATION = eINSTANCE.getReference_Location();

		/**
		 * The meta object literal for the '<em><b>RDOI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__RDOI = eINSTANCE.getReference_RDOI();

	}

} //ReferenceMLPackage
