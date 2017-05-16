/**
 */
package ScopeDefinition;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see ScopeDefinition.ScopeDefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface ScopeDefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ScopeDefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.org/ScopeDefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "def";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScopeDefinitionPackage eINSTANCE = ScopeDefinition.impl.ScopeDefinitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link ScopeDefinition.ScopeDefinitionEnum <em>Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScopeDefinition.ScopeDefinitionEnum
	 * @see ScopeDefinition.impl.ScopeDefinitionPackageImpl#getScopeDefinitionEnum()
	 * @generated
	 */
	int SCOPE_DEFINITION_ENUM = 0;


	/**
	 * Returns the meta object for enum '{@link ScopeDefinition.ScopeDefinitionEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum</em>'.
	 * @see ScopeDefinition.ScopeDefinitionEnum
	 * @generated
	 */
	EEnum getScopeDefinitionEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScopeDefinitionFactory getScopeDefinitionFactory();

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
		 * The meta object literal for the '{@link ScopeDefinition.ScopeDefinitionEnum <em>Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScopeDefinition.ScopeDefinitionEnum
		 * @see ScopeDefinition.impl.ScopeDefinitionPackageImpl#getScopeDefinitionEnum()
		 * @generated
		 */
		EEnum SCOPE_DEFINITION_ENUM = eINSTANCE.getScopeDefinitionEnum();

	}

} //ScopeDefinitionPackage
