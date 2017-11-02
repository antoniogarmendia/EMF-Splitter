/**
 */
package dataStructureContain.impl;

import dataStructureContain.ContainStructure;
import dataStructureContain.DataStructureContainFactory;
import dataStructureContain.DataStructureContainPackage;
import dataStructureContain.PackageUnit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataStructureContainPackageImpl extends EPackageImpl implements DataStructureContainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containStructureEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageUnitEClass = null;

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
	 * @see dataStructureContain.DataStructureContainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataStructureContainPackageImpl() {
		super(eNS_URI, DataStructureContainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataStructureContainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataStructureContainPackage init() {
		if (isInited) return (DataStructureContainPackage)EPackage.Registry.INSTANCE.getEPackage(DataStructureContainPackage.eNS_URI);

		// Obtain or create and register package
		DataStructureContainPackageImpl theDataStructureContainPackage = (DataStructureContainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataStructureContainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataStructureContainPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDataStructureContainPackage.createPackageContents();

		// Initialize created meta-data
		theDataStructureContainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataStructureContainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataStructureContainPackage.eNS_URI, theDataStructureContainPackage);
		return theDataStructureContainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainStructure() {
		return containStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainStructure_PackagesUnits() {
		return (EReference)containStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageUnit() {
		return packageUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageUnit_AnEClass() {
		return (EReference)packageUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageUnit_Contains() {
		return (EReference)packageUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageUnit_Unit() {
		return (EAttribute)packageUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStructureContainFactory getDataStructureContainFactory() {
		return (DataStructureContainFactory)getEFactoryInstance();
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
		containStructureEClass = createEClass(CONTAIN_STRUCTURE);
		createEReference(containStructureEClass, CONTAIN_STRUCTURE__PACKAGES_UNITS);

		packageUnitEClass = createEClass(PACKAGE_UNIT);
		createEReference(packageUnitEClass, PACKAGE_UNIT__AN_ECLASS);
		createEReference(packageUnitEClass, PACKAGE_UNIT__CONTAINS);
		createEAttribute(packageUnitEClass, PACKAGE_UNIT__UNIT);
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
		initEClass(containStructureEClass, ContainStructure.class, "ContainStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainStructure_PackagesUnits(), this.getPackageUnit(), null, "packagesUnits", null, 0, -1, ContainStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageUnitEClass, PackageUnit.class, "PackageUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageUnit_AnEClass(), ecorePackage.getEClass(), null, "anEClass", null, 0, 1, PackageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageUnit_Contains(), ecorePackage.getEClass(), null, "contains", null, 0, -1, PackageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageUnit_Unit(), ecorePackage.getEBoolean(), "unit", "true", 0, 1, PackageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DataStructureContainPackageImpl
