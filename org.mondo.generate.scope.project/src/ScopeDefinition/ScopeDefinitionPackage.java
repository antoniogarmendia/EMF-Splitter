/**
 */
package ScopeDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link ScopeDefinition.impl.MetaModelScopeImpl <em>Meta Model Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScopeDefinition.impl.MetaModelScopeImpl
	 * @see ScopeDefinition.impl.ScopeDefinitionPackageImpl#getMetaModelScope()
	 * @generated
	 */
	int META_MODEL_SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Meta Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_SCOPE__META_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Scope Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_SCOPE__SCOPE_RULES = 1;

	/**
	 * The number of structural features of the '<em>Meta Model Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_SCOPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Meta Model Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_MODEL_SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ScopeDefinition.impl.ScopeRuleImpl <em>Scope Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScopeDefinition.impl.ScopeRuleImpl
	 * @see ScopeDefinition.impl.ScopeDefinitionPackageImpl#getScopeRule()
	 * @generated
	 */
	int SCOPE_RULE = 1;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_RULE__ECLASS = 0;

	/**
	 * The feature id for the '<em><b>Scope Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_RULE__SCOPE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_RULE__EREFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Scope Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scope Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ScopeDefinition.ScopeDefinitionEnum <em>Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScopeDefinition.ScopeDefinitionEnum
	 * @see ScopeDefinition.impl.ScopeDefinitionPackageImpl#getScopeDefinitionEnum()
	 * @generated
	 */
	int SCOPE_DEFINITION_ENUM = 2;


	/**
	 * Returns the meta object for class '{@link ScopeDefinition.MetaModelScope <em>Meta Model Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Model Scope</em>'.
	 * @see ScopeDefinition.MetaModelScope
	 * @generated
	 */
	EClass getMetaModelScope();

	/**
	 * Returns the meta object for the attribute '{@link ScopeDefinition.MetaModelScope#getMetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Model</em>'.
	 * @see ScopeDefinition.MetaModelScope#getMetaModel()
	 * @see #getMetaModelScope()
	 * @generated
	 */
	EAttribute getMetaModelScope_MetaModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ScopeDefinition.MetaModelScope#getScopeRules <em>Scope Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scope Rules</em>'.
	 * @see ScopeDefinition.MetaModelScope#getScopeRules()
	 * @see #getMetaModelScope()
	 * @generated
	 */
	EReference getMetaModelScope_ScopeRules();

	/**
	 * Returns the meta object for class '{@link ScopeDefinition.ScopeRule <em>Scope Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Rule</em>'.
	 * @see ScopeDefinition.ScopeRule
	 * @generated
	 */
	EClass getScopeRule();

	/**
	 * Returns the meta object for the reference '{@link ScopeDefinition.ScopeRule#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see ScopeDefinition.ScopeRule#getEClass()
	 * @see #getScopeRule()
	 * @generated
	 */
	EReference getScopeRule_EClass();

	/**
	 * Returns the meta object for the attribute '{@link ScopeDefinition.ScopeRule#getScopeDefinition <em>Scope Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope Definition</em>'.
	 * @see ScopeDefinition.ScopeRule#getScopeDefinition()
	 * @see #getScopeRule()
	 * @generated
	 */
	EAttribute getScopeRule_ScopeDefinition();

	/**
	 * Returns the meta object for the reference '{@link ScopeDefinition.ScopeRule#getEReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference</em>'.
	 * @see ScopeDefinition.ScopeRule#getEReference()
	 * @see #getScopeRule()
	 * @generated
	 */
	EReference getScopeRule_EReference();

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
		 * The meta object literal for the '{@link ScopeDefinition.impl.MetaModelScopeImpl <em>Meta Model Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScopeDefinition.impl.MetaModelScopeImpl
		 * @see ScopeDefinition.impl.ScopeDefinitionPackageImpl#getMetaModelScope()
		 * @generated
		 */
		EClass META_MODEL_SCOPE = eINSTANCE.getMetaModelScope();
		/**
		 * The meta object literal for the '<em><b>Meta Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_MODEL_SCOPE__META_MODEL = eINSTANCE.getMetaModelScope_MetaModel();
		/**
		 * The meta object literal for the '<em><b>Scope Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_MODEL_SCOPE__SCOPE_RULES = eINSTANCE.getMetaModelScope_ScopeRules();
		/**
		 * The meta object literal for the '{@link ScopeDefinition.impl.ScopeRuleImpl <em>Scope Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScopeDefinition.impl.ScopeRuleImpl
		 * @see ScopeDefinition.impl.ScopeDefinitionPackageImpl#getScopeRule()
		 * @generated
		 */
		EClass SCOPE_RULE = eINSTANCE.getScopeRule();
		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_RULE__ECLASS = eINSTANCE.getScopeRule_EClass();
		/**
		 * The meta object literal for the '<em><b>Scope Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE_RULE__SCOPE_DEFINITION = eINSTANCE.getScopeRule_ScopeDefinition();
		/**
		 * The meta object literal for the '<em><b>EReference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_RULE__EREFERENCE = eINSTANCE.getScopeRule_EReference();
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
