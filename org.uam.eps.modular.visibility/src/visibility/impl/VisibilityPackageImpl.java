/**
 */
package visibility.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import visibility.MetamodelVisibility;
import visibility.Visibility;
import visibility.VisibilityDefinition;
import visibility.VisibilityFactory;
import visibility.VisibilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisibilityPackageImpl extends EPackageImpl implements VisibilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelVisibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityDefinitionEEnum = null;

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
	 * @see visibility.VisibilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VisibilityPackageImpl() {
		super(eNS_URI, VisibilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VisibilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VisibilityPackage init() {
		if (isInited) return (VisibilityPackage)EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI);

		// Obtain or create and register package
		VisibilityPackageImpl theVisibilityPackage = (VisibilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VisibilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VisibilityPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVisibilityPackage.createPackageContents();

		// Initialize created meta-data
		theVisibilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVisibilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VisibilityPackage.eNS_URI, theVisibilityPackage);
		return theVisibilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelVisibility() {
		return metamodelVisibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelVisibility_MetaModel() {
		return (EAttribute)metamodelVisibilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelVisibility_VisibilityRules() {
		return (EReference)metamodelVisibilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibility() {
		return visibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibility_EClass() {
		return (EReference)visibilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibility_Visibility() {
		return (EAttribute)visibilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibility_Expression() {
		return (EAttribute)visibilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityDefinition() {
		return visibilityDefinitionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityFactory getVisibilityFactory() {
		return (VisibilityFactory)getEFactoryInstance();
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
		metamodelVisibilityEClass = createEClass(METAMODEL_VISIBILITY);
		createEAttribute(metamodelVisibilityEClass, METAMODEL_VISIBILITY__META_MODEL);
		createEReference(metamodelVisibilityEClass, METAMODEL_VISIBILITY__VISIBILITY_RULES);

		visibilityEClass = createEClass(VISIBILITY);
		createEReference(visibilityEClass, VISIBILITY__ECLASS);
		createEAttribute(visibilityEClass, VISIBILITY__VISIBILITY);
		createEAttribute(visibilityEClass, VISIBILITY__EXPRESSION);

		// Create enums
		visibilityDefinitionEEnum = createEEnum(VISIBILITY_DEFINITION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(metamodelVisibilityEClass, MetamodelVisibility.class, "MetamodelVisibility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodelVisibility_MetaModel(), ecorePackage.getEString(), "metaModel", null, 0, 1, MetamodelVisibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetamodelVisibility_VisibilityRules(), this.getVisibility(), null, "visibilityRules", null, 0, -1, MetamodelVisibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visibilityEClass, Visibility.class, "Visibility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisibility_EClass(), ecorePackage.getEClass(), null, "eClass", null, 0, 1, Visibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibility_Visibility(), this.getVisibilityDefinition(), "visibility", null, 0, 1, Visibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibility_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Visibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityDefinitionEEnum, VisibilityDefinition.class, "VisibilityDefinition");
		addEEnumLiteral(visibilityDefinitionEEnum, VisibilityDefinition.WORKSPACE);
		addEEnumLiteral(visibilityDefinitionEEnum, VisibilityDefinition.PROJECT);
		addEEnumLiteral(visibilityDefinitionEEnum, VisibilityDefinition.PACKAGE);
		addEEnumLiteral(visibilityDefinitionEEnum, VisibilityDefinition.UNIT);

		// Create resource
		createResource(eNS_URI);
	}

} //VisibilityPackageImpl
