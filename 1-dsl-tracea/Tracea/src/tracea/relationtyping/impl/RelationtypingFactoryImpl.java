/**
 */
package tracea.relationtyping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tracea.relationtyping.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationtypingFactoryImpl extends EFactoryImpl implements RelationtypingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationtypingFactory init() {
		try {
			RelationtypingFactory theRelationtypingFactory = (RelationtypingFactory)EPackage.Registry.INSTANCE.getEFactory(RelationtypingPackage.eNS_URI);
			if (theRelationtypingFactory != null) {
				return theRelationtypingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationtypingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationtypingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RelationtypingPackage.DOMAIN_TYPE: return createDomainType();
			case RelationtypingPackage.ENGINEERING_TYPE: return createEngineeringType();
			case RelationtypingPackage.TRANSCLUSION: return createTransclusion();
			case RelationtypingPackage.DOC2_SECTION: return createDoc2Section();
			case RelationtypingPackage.SECTION2_PO_S: return createSection2PoS();
			case RelationtypingPackage.PO_SSYNONYM: return createPoSSynonym();
			case RelationtypingPackage.PO_S2_NAMED_ENTITY: return createPoS2NamedEntity();
			case RelationtypingPackage.NAMED_ENTITY_SYNONYM: return createNamedEntitySynonym();
			case RelationtypingPackage.NAMED_ENTITY2_CLASS: return createNamedEntity2Class();
			case RelationtypingPackage.NAME_ENTITY2_PACKAGE: return createNameEntity2Package();
			case RelationtypingPackage.PACKAGE2_MODEL: return createPackage2Model();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainType createDomainType() {
		DomainTypeImpl domainType = new DomainTypeImpl();
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringType createEngineeringType() {
		EngineeringTypeImpl engineeringType = new EngineeringTypeImpl();
		return engineeringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transclusion createTransclusion() {
		TransclusionImpl transclusion = new TransclusionImpl();
		return transclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doc2Section createDoc2Section() {
		Doc2SectionImpl doc2Section = new Doc2SectionImpl();
		return doc2Section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section2PoS createSection2PoS() {
		Section2PoSImpl section2PoS = new Section2PoSImpl();
		return section2PoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoSSynonym createPoSSynonym() {
		PoSSynonymImpl poSSynonym = new PoSSynonymImpl();
		return poSSynonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoS2NamedEntity createPoS2NamedEntity() {
		PoS2NamedEntityImpl poS2NamedEntity = new PoS2NamedEntityImpl();
		return poS2NamedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedEntitySynonym createNamedEntitySynonym() {
		NamedEntitySynonymImpl namedEntitySynonym = new NamedEntitySynonymImpl();
		return namedEntitySynonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedEntity2Class createNamedEntity2Class() {
		NamedEntity2ClassImpl namedEntity2Class = new NamedEntity2ClassImpl();
		return namedEntity2Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameEntity2Package createNameEntity2Package() {
		NameEntity2PackageImpl nameEntity2Package = new NameEntity2PackageImpl();
		return nameEntity2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Package2Model createPackage2Model() {
		Package2ModelImpl package2Model = new Package2ModelImpl();
		return package2Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationtypingPackage getRelationtypingPackage() {
		return (RelationtypingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static RelationtypingPackage getPackage() {
		return RelationtypingPackage.eINSTANCE;
	}

} //RelationtypingFactoryImpl
