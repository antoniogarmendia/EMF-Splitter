/**
 */
package dataStructureContain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see dataStructureContain.DataStructureContainFactory
 * @model kind="package"
 * @generated
 */
public interface DataStructureContainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataStructureContain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://miso.org/dataStructureContain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "struct";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataStructureContainPackage eINSTANCE = dataStructureContain.impl.DataStructureContainPackageImpl.init();

	/**
	 * The meta object id for the '{@link dataStructureContain.impl.ContainStructureImpl <em>Contain Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataStructureContain.impl.ContainStructureImpl
	 * @see dataStructureContain.impl.DataStructureContainPackageImpl#getContainStructure()
	 * @generated
	 */
	int CONTAIN_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Packages Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAIN_STRUCTURE__PACKAGES_UNITS = 0;

	/**
	 * The number of structural features of the '<em>Contain Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAIN_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contain Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAIN_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataStructureContain.impl.PackageUnitImpl <em>Package Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataStructureContain.impl.PackageUnitImpl
	 * @see dataStructureContain.impl.DataStructureContainPackageImpl#getPackageUnit()
	 * @generated
	 */
	int PACKAGE_UNIT = 1;

	/**
	 * The feature id for the '<em><b>An EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_UNIT__AN_ECLASS = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_UNIT__CONTAINS = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_UNIT__UNIT = 2;

	/**
	 * The number of structural features of the '<em>Package Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_UNIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Package Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_UNIT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link dataStructureContain.ContainStructure <em>Contain Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contain Structure</em>'.
	 * @see dataStructureContain.ContainStructure
	 * @generated
	 */
	EClass getContainStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link dataStructureContain.ContainStructure#getPackagesUnits <em>Packages Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages Units</em>'.
	 * @see dataStructureContain.ContainStructure#getPackagesUnits()
	 * @see #getContainStructure()
	 * @generated
	 */
	EReference getContainStructure_PackagesUnits();

	/**
	 * Returns the meta object for class '{@link dataStructureContain.PackageUnit <em>Package Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Unit</em>'.
	 * @see dataStructureContain.PackageUnit
	 * @generated
	 */
	EClass getPackageUnit();

	/**
	 * Returns the meta object for the reference '{@link dataStructureContain.PackageUnit#getAnEClass <em>An EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>An EClass</em>'.
	 * @see dataStructureContain.PackageUnit#getAnEClass()
	 * @see #getPackageUnit()
	 * @generated
	 */
	EReference getPackageUnit_AnEClass();

	/**
	 * Returns the meta object for the reference list '{@link dataStructureContain.PackageUnit#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see dataStructureContain.PackageUnit#getContains()
	 * @see #getPackageUnit()
	 * @generated
	 */
	EReference getPackageUnit_Contains();

	/**
	 * Returns the meta object for the attribute '{@link dataStructureContain.PackageUnit#isUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see dataStructureContain.PackageUnit#isUnit()
	 * @see #getPackageUnit()
	 * @generated
	 */
	EAttribute getPackageUnit_Unit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataStructureContainFactory getDataStructureContainFactory();

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
		 * The meta object literal for the '{@link dataStructureContain.impl.ContainStructureImpl <em>Contain Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataStructureContain.impl.ContainStructureImpl
		 * @see dataStructureContain.impl.DataStructureContainPackageImpl#getContainStructure()
		 * @generated
		 */
		EClass CONTAIN_STRUCTURE = eINSTANCE.getContainStructure();

		/**
		 * The meta object literal for the '<em><b>Packages Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAIN_STRUCTURE__PACKAGES_UNITS = eINSTANCE.getContainStructure_PackagesUnits();

		/**
		 * The meta object literal for the '{@link dataStructureContain.impl.PackageUnitImpl <em>Package Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataStructureContain.impl.PackageUnitImpl
		 * @see dataStructureContain.impl.DataStructureContainPackageImpl#getPackageUnit()
		 * @generated
		 */
		EClass PACKAGE_UNIT = eINSTANCE.getPackageUnit();

		/**
		 * The meta object literal for the '<em><b>An EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_UNIT__AN_ECLASS = eINSTANCE.getPackageUnit_AnEClass();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_UNIT__CONTAINS = eINSTANCE.getPackageUnit_Contains();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_UNIT__UNIT = eINSTANCE.getPackageUnit_Unit();

	}

} //DataStructureContainPackage
