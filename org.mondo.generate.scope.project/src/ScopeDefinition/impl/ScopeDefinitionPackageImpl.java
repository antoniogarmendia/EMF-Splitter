/**
 */
package ScopeDefinition.impl;

import ScopeDefinition.MetaModelScope;
import ScopeDefinition.ScopeDefinitionEnum;
import ScopeDefinition.ScopeDefinitionFactory;
import ScopeDefinition.ScopeDefinitionPackage;

import ScopeDefinition.ScopeRule;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScopeDefinitionPackageImpl extends EPackageImpl implements ScopeDefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaModelScopeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeRuleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeDefinitionEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ScopeDefinition.ScopeDefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScopeDefinitionPackageImpl() {
		super(eNS_URI, ScopeDefinitionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScopeDefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScopeDefinitionPackage init() {
		if (isInited) return (ScopeDefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(ScopeDefinitionPackage.eNS_URI);

		// Obtain or create and register package
		ScopeDefinitionPackageImpl theScopeDefinitionPackage = (ScopeDefinitionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScopeDefinitionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScopeDefinitionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theScopeDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theScopeDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScopeDefinitionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScopeDefinitionPackage.eNS_URI, theScopeDefinitionPackage);
		return theScopeDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaModelScope() {
		return metaModelScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaModelScope_MetaModel() {
		return (EAttribute)metaModelScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaModelScope_ScopeRules() {
		return (EReference)metaModelScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeRule() {
		return scopeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeRule_EClass() {
		return (EReference)scopeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopeRule_ScopeDefinition() {
		return (EAttribute)scopeRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeRule_EReference() {
		return (EReference)scopeRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScopeDefinitionEnum() {
		return scopeDefinitionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDefinitionFactory getScopeDefinitionFactory() {
		return (ScopeDefinitionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		metaModelScopeEClass = createEClass(META_MODEL_SCOPE);
		createEAttribute(metaModelScopeEClass, META_MODEL_SCOPE__META_MODEL);
		createEReference(metaModelScopeEClass, META_MODEL_SCOPE__SCOPE_RULES);

		scopeRuleEClass = createEClass(SCOPE_RULE);
		createEReference(scopeRuleEClass, SCOPE_RULE__ECLASS);
		createEAttribute(scopeRuleEClass, SCOPE_RULE__SCOPE_DEFINITION);
		createEReference(scopeRuleEClass, SCOPE_RULE__EREFERENCE);

		// Create enums
		scopeDefinitionEnumEEnum = createEEnum(SCOPE_DEFINITION_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(metaModelScopeEClass, MetaModelScope.class, "MetaModelScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaModelScope_MetaModel(), ecorePackage.getEString(), "metaModel", null, 0, 1, MetaModelScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaModelScope_ScopeRules(), this.getScopeRule(), null, "scopeRules", null, 0, -1, MetaModelScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeRuleEClass, ScopeRule.class, "ScopeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeRule_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 0, 1, ScopeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScopeRule_ScopeDefinition(), this.getScopeDefinitionEnum(), "scopeDefinition", null, 0, 1, ScopeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScopeRule_EReference(), theEcorePackage.getEReference(), null, "eReference", null, 0, 1, ScopeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(scopeDefinitionEnumEEnum, ScopeDefinitionEnum.class, "ScopeDefinitionEnum");
		addEEnumLiteral(scopeDefinitionEnumEEnum, ScopeDefinitionEnum.SAME_WORKSPACE);
		addEEnumLiteral(scopeDefinitionEnumEEnum, ScopeDefinitionEnum.SAME_PROJECT);
		addEEnumLiteral(scopeDefinitionEnumEEnum, ScopeDefinitionEnum.SAME_PACKAGE);
		addEEnumLiteral(scopeDefinitionEnumEEnum, ScopeDefinitionEnum.SAME_UNIT);

		// Create resource
		createResource(eNS_URI);
	}

} //ScopeDefinitionPackageImpl
