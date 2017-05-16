/**
 */
package IndexAttribute.impl;

import IndexAttribute.IndexAttributeFactory;
import IndexAttribute.IndexAttributePackage;
import IndexAttribute.IndexClass;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndexAttributePackageImpl extends EPackageImpl implements IndexAttributePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexClassEClass = null;

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
	 * @see IndexAttribute.IndexAttributePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IndexAttributePackageImpl() {
		super(eNS_URI, IndexAttributeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IndexAttributePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IndexAttributePackage init() {
		if (isInited) return (IndexAttributePackage)EPackage.Registry.INSTANCE.getEPackage(IndexAttributePackage.eNS_URI);

		// Obtain or create and register package
		IndexAttributePackageImpl theIndexAttributePackage = (IndexAttributePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IndexAttributePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IndexAttributePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIndexAttributePackage.createPackageContents();

		// Initialize created meta-data
		theIndexAttributePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIndexAttributePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IndexAttributePackage.eNS_URI, theIndexAttributePackage);
		return theIndexAttributePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexClass() {
		return indexClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexClass_IndexAttribute() {
		return (EAttribute)indexClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexAttributeFactory getIndexAttributeFactory() {
		return (IndexAttributeFactory)getEFactoryInstance();
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
		indexClassEClass = createEClass(INDEX_CLASS);
		createEAttribute(indexClassEClass, INDEX_CLASS__INDEX_ATTRIBUTE);
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
		initEClass(indexClassEClass, IndexClass.class, "IndexClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexClass_IndexAttribute(), ecorePackage.getEJavaObject(), "indexAttribute", null, 0, 1, IndexClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IndexAttributePackageImpl
