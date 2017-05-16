/**
 */
package dslFilter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dslFilter.DslFilterPackage
 * @generated
 */
public interface DslFilterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslFilterFactory eINSTANCE = dslFilter.impl.DslFilterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>All Filters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Filters</em>'.
	 * @generated
	 */
	AllFilters createAllFilters();

	/**
	 * Returns a new object of class '<em>Filter Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Group</em>'.
	 * @generated
	 */
	FilterGroup createFilterGroup();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	Filter createFilter();

	/**
	 * Returns a new object of class '<em>CNumber Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CNumber Operation</em>'.
	 * @generated
	 */
	CNumberOperation createCNumberOperation();

	/**
	 * Returns a new object of class '<em>CString Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CString Operation</em>'.
	 * @generated
	 */
	CStringOperation createCStringOperation();

	/**
	 * Returns a new object of class '<em>CStructural EObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CStructural EObject</em>'.
	 * @generated
	 */
	CStructuralEObject createCStructuralEObject();

	/**
	 * Returns a new object of class '<em>CLogic Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CLogic Operation</em>'.
	 * @generated
	 */
	CLogicOperation createCLogicOperation();

	/**
	 * Returns a new object of class '<em>Basic CString Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic CString Operation</em>'.
	 * @generated
	 */
	BasicCStringOperation createBasicCStringOperation();

	/**
	 * Returns a new object of class '<em>Basic CNumber Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic CNumber Operation</em>'.
	 * @generated
	 */
	BasicCNumberOperation createBasicCNumberOperation();

	/**
	 * Returns a new object of class '<em>Basic CLogic Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic CLogic Operation</em>'.
	 * @generated
	 */
	BasicCLogicOperation createBasicCLogicOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DslFilterPackage getDslFilterPackage();

} //DslFilterFactory
