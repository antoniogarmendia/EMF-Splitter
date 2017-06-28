/**
 */
package ScopeDefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ScopeDefinition.ScopeDefinitionPackage
 * @generated
 */
public interface ScopeDefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScopeDefinitionFactory eINSTANCE = ScopeDefinition.impl.ScopeDefinitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Meta Model Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Model Scope</em>'.
	 * @generated
	 */
	MetaModelScope createMetaModelScope();

	/**
	 * Returns a new object of class '<em>Scope Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Rule</em>'.
	 * @generated
	 */
	ScopeRule createScopeRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScopeDefinitionPackage getScopeDefinitionPackage();

} //ScopeDefinitionFactory
