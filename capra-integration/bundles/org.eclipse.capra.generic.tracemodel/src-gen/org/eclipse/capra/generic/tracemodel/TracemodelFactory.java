/**
 */
package org.eclipse.capra.generic.tracemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.capra.generic.tracemodel.TracemodelPackage
 * @generated
 */
public interface TracemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracemodelFactory eINSTANCE = org.eclipse.capra.generic.tracemodel.impl.TracemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Generic Trace Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Trace Model</em>'.
	 * @generated
	 */
	GenericTraceModel createGenericTraceModel();

	/**
	 * Returns a new object of class '<em>Related To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related To</em>'.
	 * @generated
	 */
	RelatedTo createRelatedTo();

	/**
	 * Returns a new object of class '<em>Human Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human Agent</em>'.
	 * @generated
	 */
	HumanAgent createHumanAgent();

	/**
	 * Returns a new object of class '<em>Machine Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Agent</em>'.
	 * @generated
	 */
	MachineAgent createMachineAgent();

	/**
	 * Returns a new object of class '<em>Confidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confidence</em>'.
	 * @generated
	 */
	Confidence createConfidence();

	/**
	 * Returns a new object of class '<em>AI Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Evidence</em>'.
	 * @generated
	 */
	AIEvidence createAIEvidence();

	/**
	 * Returns a new object of class '<em>Rule Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Evidence</em>'.
	 * @generated
	 */
	RuleEvidence createRuleEvidence();

	/**
	 * Returns a new object of class '<em>Annotation Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Evidence</em>'.
	 * @generated
	 */
	AnnotationEvidence createAnnotationEvidence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TracemodelPackage getTracemodelPackage();

} //TracemodelFactory
