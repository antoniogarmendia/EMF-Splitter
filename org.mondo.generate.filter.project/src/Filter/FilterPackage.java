/**
 */
package Filter;

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
 * @see Filter.FilterFactory
 * @model kind="package"
 * @generated
 */
public interface FilterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Filter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.dsl.org/mmPatterns/filter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "filter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilterPackage eINSTANCE = Filter.impl.FilterPackageImpl.init();

	/**
	 * The meta object id for the '{@link Filter.impl.FilterableImpl <em>Filterable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Filter.impl.FilterableImpl
	 * @see Filter.impl.FilterPackageImpl#getFilterable()
	 * @generated
	 */
	int FILTERABLE = 0;

	/**
	 * The feature id for the '<em><b>AKey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERABLE__AKEY = 0;

	/**
	 * The feature id for the '<em><b>RKey</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERABLE__RKEY = 1;

	/**
	 * The number of structural features of the '<em>Filterable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Filterable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Filter.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Filter.impl.NodeImpl
	 * @see Filter.impl.FilterPackageImpl#getNode()
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
	 * Returns the meta object for class '{@link Filter.Filterable <em>Filterable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filterable</em>'.
	 * @see Filter.Filterable
	 * @generated
	 */
	EClass getFilterable();

	/**
	 * Returns the meta object for the attribute '{@link Filter.Filterable#getAKey <em>AKey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AKey</em>'.
	 * @see Filter.Filterable#getAKey()
	 * @see #getFilterable()
	 * @generated
	 */
	EAttribute getFilterable_AKey();

	/**
	 * Returns the meta object for the containment reference list '{@link Filter.Filterable#getRKey <em>RKey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RKey</em>'.
	 * @see Filter.Filterable#getRKey()
	 * @see #getFilterable()
	 * @generated
	 */
	EReference getFilterable_RKey();

	/**
	 * Returns the meta object for class '{@link Filter.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see Filter.Node
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
	FilterFactory getFilterFactory();

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
		 * The meta object literal for the '{@link Filter.impl.FilterableImpl <em>Filterable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Filter.impl.FilterableImpl
		 * @see Filter.impl.FilterPackageImpl#getFilterable()
		 * @generated
		 */
		EClass FILTERABLE = eINSTANCE.getFilterable();

		/**
		 * The meta object literal for the '<em><b>AKey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERABLE__AKEY = eINSTANCE.getFilterable_AKey();

		/**
		 * The meta object literal for the '<em><b>RKey</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTERABLE__RKEY = eINSTANCE.getFilterable_RKey();

		/**
		 * The meta object literal for the '{@link Filter.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Filter.impl.NodeImpl
		 * @see Filter.impl.FilterPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

	}

} //FilterPackage
