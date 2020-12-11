/**
 */
package tracea.relationtyping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tracea.relationtyping.RelationtypingPackage
 * @generated
 */
public interface RelationtypingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationtypingFactory eINSTANCE = tracea.relationtyping.impl.RelationtypingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Type</em>'.
	 * @generated
	 */
	DomainType createDomainType();

	/**
	 * Returns a new object of class '<em>Engineering Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engineering Type</em>'.
	 * @generated
	 */
	EngineeringType createEngineeringType();

	/**
	 * Returns a new object of class '<em>Transclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transclusion</em>'.
	 * @generated
	 */
	Transclusion createTransclusion();

	/**
	 * Returns a new object of class '<em>Doc2 Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc2 Section</em>'.
	 * @generated
	 */
	Doc2Section createDoc2Section();

	/**
	 * Returns a new object of class '<em>Section2 Po S</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section2 Po S</em>'.
	 * @generated
	 */
	Section2PoS createSection2PoS();

	/**
	 * Returns a new object of class '<em>Po SSynonym</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Po SSynonym</em>'.
	 * @generated
	 */
	PoSSynonym createPoSSynonym();

	/**
	 * Returns a new object of class '<em>Po S2 Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Po S2 Named Entity</em>'.
	 * @generated
	 */
	PoS2NamedEntity createPoS2NamedEntity();

	/**
	 * Returns a new object of class '<em>Named Entity Synonym</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Entity Synonym</em>'.
	 * @generated
	 */
	NamedEntitySynonym createNamedEntitySynonym();

	/**
	 * Returns a new object of class '<em>Named Entity2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Entity2 Class</em>'.
	 * @generated
	 */
	NamedEntity2Class createNamedEntity2Class();

	/**
	 * Returns a new object of class '<em>Name Entity2 Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Entity2 Package</em>'.
	 * @generated
	 */
	NameEntity2Package createNameEntity2Package();

	/**
	 * Returns a new object of class '<em>Package2 Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package2 Model</em>'.
	 * @generated
	 */
	Package2Model createPackage2Model();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RelationtypingPackage getRelationtypingPackage();

} //RelationtypingFactory
