/**
 */
package ScopeDefinition.impl;

import ScopeDefinition.ScopeDefinitionEnum;
import ScopeDefinition.ScopeDefinitionFactory;
import ScopeDefinition.ScopeDefinitionPackage;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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

		// Initialize enums and add enum literals
		initEEnum(scopeDefinitionEnumEEnum, ScopeDefinitionEnum.class, "ScopeDefinitionEnum");
		addEEnumLiteral(scopeDefinitionEnumEEnum, ScopeDefinitionEnum.RSAME_WORK_SPACE);
		addEEnumLiteral(scopeDefinitionEnumEEnum, ScopeDefinitionEnum.RSAME_PROJECT);
		addEEnumLiteral(scopeDefinitionEnumEEnum, ScopeDefinitionEnum.RSAME_PACKAGE);
		addEEnumLiteral(scopeDefinitionEnumEEnum, ScopeDefinitionEnum.RSAME_UNIT);

		// Create resource
		createResource(eNS_URI);
	}

} //ScopeDefinitionPackageImpl
