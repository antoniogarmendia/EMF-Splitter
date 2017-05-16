/**
 */
package Scope;

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
 * @see Scope.ScopeFactory
 * @model kind="package"
 * @generated
 */
public interface ScopePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Scope";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.dsl.org/mmPatterns/scope";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scope";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScopePackage eINSTANCE = Scope.impl.ScopePackageImpl.init();

	/**
	 * The meta object id for the '{@link Scope.impl.ScopeClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Scope.impl.ScopeClassImpl
	 * @see Scope.impl.ScopePackageImpl#getScopeClass()
	 * @generated
	 */
	int SCOPE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>RSame Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CLASS__RSAME_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>RSame Project</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CLASS__RSAME_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>RSame Work Space</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CLASS__RSAME_WORK_SPACE = 2;

	/**
	 * The feature id for the '<em><b>RSame Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CLASS__RSAME_UNIT = 3;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CLASS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Scope.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Scope.impl.NodeImpl
	 * @see Scope.impl.ScopePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Scope.ScopeClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see Scope.ScopeClass
	 * @generated
	 */
	EClass getScopeClass();

	/**
	 * Returns the meta object for the reference list '{@link Scope.ScopeClass#getRSamePackage <em>RSame Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RSame Package</em>'.
	 * @see Scope.ScopeClass#getRSamePackage()
	 * @see #getScopeClass()
	 * @generated
	 */
	EReference getScopeClass_RSamePackage();

	/**
	 * Returns the meta object for the reference list '{@link Scope.ScopeClass#getRSameProject <em>RSame Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RSame Project</em>'.
	 * @see Scope.ScopeClass#getRSameProject()
	 * @see #getScopeClass()
	 * @generated
	 */
	EReference getScopeClass_RSameProject();

	/**
	 * Returns the meta object for the reference list '{@link Scope.ScopeClass#getRSameWorkSpace <em>RSame Work Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RSame Work Space</em>'.
	 * @see Scope.ScopeClass#getRSameWorkSpace()
	 * @see #getScopeClass()
	 * @generated
	 */
	EReference getScopeClass_RSameWorkSpace();

	/**
	 * Returns the meta object for the reference list '{@link Scope.ScopeClass#getRSameUnit <em>RSame Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RSame Unit</em>'.
	 * @see Scope.ScopeClass#getRSameUnit()
	 * @see #getScopeClass()
	 * @generated
	 */
	EReference getScopeClass_RSameUnit();

	/**
	 * Returns the meta object for class '{@link Scope.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see Scope.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScopeFactory getScopeFactory();

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
		 * The meta object literal for the '{@link Scope.impl.ScopeClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Scope.impl.ScopeClassImpl
		 * @see Scope.impl.ScopePackageImpl#getScopeClass()
		 * @generated
		 */
		EClass SCOPE_CLASS = eINSTANCE.getScopeClass();

		/**
		 * The meta object literal for the '<em><b>RSame Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_CLASS__RSAME_PACKAGE = eINSTANCE.getScopeClass_RSamePackage();

		/**
		 * The meta object literal for the '<em><b>RSame Project</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_CLASS__RSAME_PROJECT = eINSTANCE.getScopeClass_RSameProject();

		/**
		 * The meta object literal for the '<em><b>RSame Work Space</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_CLASS__RSAME_WORK_SPACE = eINSTANCE.getScopeClass_RSameWorkSpace();

		/**
		 * The meta object literal for the '<em><b>RSame Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_CLASS__RSAME_UNIT = eINSTANCE.getScopeClass_RSameUnit();

		/**
		 * The meta object literal for the '{@link Scope.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Scope.impl.NodeImpl
		 * @see Scope.impl.ScopePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

	}

} //ScopePackage
