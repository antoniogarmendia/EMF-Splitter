/**
 */
package dslFilter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see dslFilter.DslFilterFactory
 * @model kind="package"
 * @generated
 */
public interface DslFilterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dslFilter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.org/Filter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dslFilter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslFilterPackage eINSTANCE = dslFilter.impl.DslFilterPackageImpl.init();

	/**
	 * The meta object id for the '{@link dslFilter.impl.FilterAttributesImpl <em>Filter Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.impl.FilterAttributesImpl
	 * @see dslFilter.impl.DslFilterPackageImpl#getFilterAttributes()
	 * @generated
	 */
	int FILTER_ATTRIBUTES = 10;

	/**
	 * The meta object id for the '{@link dslFilter.impl.AllFiltersImpl <em>All Filters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.impl.AllFiltersImpl
	 * @see dslFilter.impl.DslFilterPackageImpl#getAllFilters()
	 * @generated
	 */
	int ALL_FILTERS = 0;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FILTERS__NEGATIVE = 0;

	/**
	 * The feature id for the '<em><b>Groupfilters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FILTERS__GROUPFILTERS = 1;

	/**
	 * The feature id for the '<em><b>Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FILTERS__MODEL_URI = 2;

	/**
	 * The feature id for the '<em><b>List EClasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FILTERS__LIST_ECLASSES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FILTERS__NAME = 4;

	/**
	 * The number of structural features of the '<em>All Filters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FILTERS_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FILTERS___EXECUTE__TREEITERATOR = 0;

	/**
	 * The operation id for the '<em>Init All Filters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FILTERS___INIT_ALL_FILTERS = 1;

	/**
	 * The operation id for the '<em>All EObjects Satifies Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FILTERS___ALL_EOBJECTS_SATIFIES_CONDITION = 2;

	/**
	 * The operation id for the '<em>Delete All EObjects Satisfies Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FILTERS___DELETE_ALL_EOBJECTS_SATISFIES_CONDITION = 3;

	/**
	 * The number of operations of the '<em>All Filters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FILTERS_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link dslFilter.FilterContent <em>Filter Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.FilterContent
	 * @see dslFilter.impl.DslFilterPackageImpl#getFilterContent()
	 * @generated
	 */
	int FILTER_CONTENT = 9;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONTENT__NEGATIVE = 0;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONTENT__EXECUTE = 1;

	/**
	 * The number of structural features of the '<em>Filter Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONTENT___EXECUTE__EOBJECT = 0;

	/**
	 * The number of operations of the '<em>Filter Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONTENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslFilter.impl.FilterGroupImpl <em>Filter Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.impl.FilterGroupImpl
	 * @see dslFilter.impl.DslFilterPackageImpl#getFilterGroup()
	 * @generated
	 */
	int FILTER_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP__NEGATIVE = FILTER_CONTENT__NEGATIVE;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP__EXECUTE = FILTER_CONTENT__EXECUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP__NAME = FILTER_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>An Logic Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP__AN_LOGIC_OPERATION = FILTER_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP__CONTENTS = FILTER_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>List Satifies Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP__LIST_SATIFIES_CONDITION = FILTER_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>An EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP__AN_ECLASS = FILTER_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Filter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP_FEATURE_COUNT = FILTER_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP___EXECUTE__EOBJECT = FILTER_CONTENT___EXECUTE__EOBJECT;

	/**
	 * The operation id for the '<em>Init Filter Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP___INIT_FILTER_GROUP__INTEGER = FILTER_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Class Interface EObject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP___IS_CLASS_INTERFACE_EOBJECT__EOBJECT = FILTER_CONTENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP_OPERATION_COUNT = FILTER_CONTENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link dslFilter.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.impl.FilterImpl
	 * @see dslFilter.impl.DslFilterPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 2;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NEGATIVE = FILTER_CONTENT__NEGATIVE;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__EXECUTE = FILTER_CONTENT__EXECUTE;

	/**
	 * The feature id for the '<em><b>An Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__AN_RULE = FILTER_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>An EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__AN_ESTRUCTURAL_FEATURE = FILTER_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = FILTER_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___EXECUTE__EOBJECT = FILTER_CONTENT___EXECUTE__EOBJECT;

	/**
	 * The operation id for the '<em>Get Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___GET_RULES = FILTER_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Object References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___GET_OBJECT_REFERENCES = FILTER_CONTENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Init Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___INIT_FILTER = FILTER_CONTENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = FILTER_CONTENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link dslFilter.Rule <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.Rule
	 * @see dslFilter.impl.DslFilterPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 3;

	/**
	 * The feature id for the '<em><b>An Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__AN_EXP = 0;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Satifies Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___SATIFIES_RULE__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslFilter.impl.CNumberOperationImpl <em>CNumber Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.impl.CNumberOperationImpl
	 * @see dslFilter.impl.DslFilterPackageImpl#getCNumberOperation()
	 * @generated
	 */
	int CNUMBER_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>An Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNUMBER_OPERATION__AN_EXP = RULE__AN_EXP;

	/**
	 * The feature id for the '<em><b>An Number Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNUMBER_OPERATION__AN_NUMBER_OPERATION = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CNumber Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNUMBER_OPERATION_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Satifies Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNUMBER_OPERATION___SATIFIES_RULE__OBJECT = RULE___SATIFIES_RULE__OBJECT;

	/**
	 * The number of operations of the '<em>CNumber Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNUMBER_OPERATION_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslFilter.impl.CStringOperationImpl <em>CString Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.impl.CStringOperationImpl
	 * @see dslFilter.impl.DslFilterPackageImpl#getCStringOperation()
	 * @generated
	 */
	int CSTRING_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>An Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING_OPERATION__AN_EXP = RULE__AN_EXP;

	/**
	 * The feature id for the '<em><b>An String Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING_OPERATION__AN_STRING_OPERATION = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CString Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING_OPERATION_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Satifies Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING_OPERATION___SATIFIES_RULE__OBJECT = RULE___SATIFIES_RULE__OBJECT;

	/**
	 * The number of operations of the '<em>CString Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING_OPERATION_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslFilter.impl.CStructuralEObjectImpl <em>CStructural EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.impl.CStructuralEObjectImpl
	 * @see dslFilter.impl.DslFilterPackageImpl#getCStructuralEObject()
	 * @generated
	 */
	int CSTRUCTURAL_EOBJECT = 6;

	/**
	 * The feature id for the '<em><b>An Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRUCTURAL_EOBJECT__AN_EXP = RULE__AN_EXP;

	/**
	 * The feature id for the '<em><b>An Number Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRUCTURAL_EOBJECT__AN_NUMBER_OPERATION = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CStructural EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRUCTURAL_EOBJECT_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Satifies Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRUCTURAL_EOBJECT___SATIFIES_RULE__OBJECT = RULE___SATIFIES_RULE__OBJECT;

	/**
	 * The number of operations of the '<em>CStructural EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRUCTURAL_EOBJECT_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dslFilter.impl.CLogicOperationImpl <em>CLogic Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.impl.CLogicOperationImpl
	 * @see dslFilter.impl.DslFilterPackageImpl#getCLogicOperation()
	 * @generated
	 */
	int CLOGIC_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>An Logic Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGIC_OPERATION__AN_LOGIC_OPERATION = 0;

	/**
	 * The number of structural features of the '<em>CLogic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGIC_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CLogic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGIC_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dslFilter.impl.IntToEObjectMapImpl <em>Int To EObject Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.impl.IntToEObjectMapImpl
	 * @see dslFilter.impl.DslFilterPackageImpl#getIntToEObjectMap()
	 * @generated
	 */
	int INT_TO_EOBJECT_MAP = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_EOBJECT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_EOBJECT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Int To EObject Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_EOBJECT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Int To EObject Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_EOBJECT_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ATTRIBUTES__NAME = 0;

	/**
	 * The feature id for the '<em><b>An Logic Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ATTRIBUTES__AN_LOGIC_OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Filter Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Filter Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dslFilter.impl.BasicCStringOperationImpl <em>Basic CString Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.impl.BasicCStringOperationImpl
	 * @see dslFilter.impl.DslFilterPackageImpl#getBasicCStringOperation()
	 * @generated
	 */
	int BASIC_CSTRING_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>An Enum String Operation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CSTRING_OPERATION__AN_ENUM_STRING_OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Basic CString Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CSTRING_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Enum To String Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CSTRING_OPERATION___ENUM_TO_STRING_ARRAY = 0;

	/**
	 * The number of operations of the '<em>Basic CString Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CSTRING_OPERATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslFilter.impl.BasicCNumberOperationImpl <em>Basic CNumber Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.impl.BasicCNumberOperationImpl
	 * @see dslFilter.impl.DslFilterPackageImpl#getBasicCNumberOperation()
	 * @generated
	 */
	int BASIC_CNUMBER_OPERATION = 12;

	/**
	 * The feature id for the '<em><b>An Enum Number Operation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CNUMBER_OPERATION__AN_ENUM_NUMBER_OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Basic CNumber Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CNUMBER_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Enum To String Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CNUMBER_OPERATION___ENUM_TO_STRING_ARRAY = 0;

	/**
	 * The number of operations of the '<em>Basic CNumber Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CNUMBER_OPERATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslFilter.impl.BasicCLogicOperationImpl <em>Basic CLogic Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.impl.BasicCLogicOperationImpl
	 * @see dslFilter.impl.DslFilterPackageImpl#getBasicCLogicOperation()
	 * @generated
	 */
	int BASIC_CLOGIC_OPERATION = 13;

	/**
	 * The feature id for the '<em><b>An Enum Logic Operation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOGIC_OPERATION__AN_ENUM_LOGIC_OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Basic CLogic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOGIC_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Enum To String Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOGIC_OPERATION___ENUM_TO_STRING_ARRAY = 0;

	/**
	 * The number of operations of the '<em>Basic CLogic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CLOGIC_OPERATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dslFilter.EnumLogicOperation <em>Enum Logic Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.EnumLogicOperation
	 * @see dslFilter.impl.DslFilterPackageImpl#getEnumLogicOperation()
	 * @generated
	 */
	int ENUM_LOGIC_OPERATION = 14;

	/**
	 * The meta object id for the '{@link dslFilter.EnumNumberOperation <em>Enum Number Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.EnumNumberOperation
	 * @see dslFilter.impl.DslFilterPackageImpl#getEnumNumberOperation()
	 * @generated
	 */
	int ENUM_NUMBER_OPERATION = 15;

	/**
	 * The meta object id for the '{@link dslFilter.EnumStringOperation <em>Enum String Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dslFilter.EnumStringOperation
	 * @see dslFilter.impl.DslFilterPackageImpl#getEnumStringOperation()
	 * @generated
	 */
	int ENUM_STRING_OPERATION = 16;


	/**
	 * Returns the meta object for class '{@link dslFilter.AllFilters <em>All Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Filters</em>'.
	 * @see dslFilter.AllFilters
	 * @generated
	 */
	EClass getAllFilters();

	/**
	 * Returns the meta object for the attribute '{@link dslFilter.AllFilters#isNegative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative</em>'.
	 * @see dslFilter.AllFilters#isNegative()
	 * @see #getAllFilters()
	 * @generated
	 */
	EAttribute getAllFilters_Negative();

	/**
	 * Returns the meta object for the containment reference list '{@link dslFilter.AllFilters#getGroupfilters <em>Groupfilters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groupfilters</em>'.
	 * @see dslFilter.AllFilters#getGroupfilters()
	 * @see #getAllFilters()
	 * @generated
	 */
	EReference getAllFilters_Groupfilters();

	/**
	 * Returns the meta object for the attribute '{@link dslFilter.AllFilters#getModelURI <em>Model URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model URI</em>'.
	 * @see dslFilter.AllFilters#getModelURI()
	 * @see #getAllFilters()
	 * @generated
	 */
	EAttribute getAllFilters_ModelURI();

	/**
	 * Returns the meta object for the reference list '{@link dslFilter.AllFilters#getList_EClasses <em>List EClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List EClasses</em>'.
	 * @see dslFilter.AllFilters#getList_EClasses()
	 * @see #getAllFilters()
	 * @generated
	 */
	EReference getAllFilters_List_EClasses();

	/**
	 * Returns the meta object for the attribute '{@link dslFilter.AllFilters#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dslFilter.AllFilters#getName()
	 * @see #getAllFilters()
	 * @generated
	 */
	EAttribute getAllFilters_Name();

	/**
	 * Returns the meta object for the '{@link dslFilter.AllFilters#Execute(org.eclipse.emf.common.util.TreeIterator) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see dslFilter.AllFilters#Execute(org.eclipse.emf.common.util.TreeIterator)
	 * @generated
	 */
	EOperation getAllFilters__Execute__TreeIterator();

	/**
	 * Returns the meta object for the '{@link dslFilter.AllFilters#InitAllFilters() <em>Init All Filters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init All Filters</em>' operation.
	 * @see dslFilter.AllFilters#InitAllFilters()
	 * @generated
	 */
	EOperation getAllFilters__InitAllFilters();

	/**
	 * Returns the meta object for the '{@link dslFilter.AllFilters#AllEObjectsSatifiesCondition() <em>All EObjects Satifies Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All EObjects Satifies Condition</em>' operation.
	 * @see dslFilter.AllFilters#AllEObjectsSatifiesCondition()
	 * @generated
	 */
	EOperation getAllFilters__AllEObjectsSatifiesCondition();

	/**
	 * Returns the meta object for the '{@link dslFilter.AllFilters#DeleteAllEObjectsSatisfiesCondition() <em>Delete All EObjects Satisfies Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete All EObjects Satisfies Condition</em>' operation.
	 * @see dslFilter.AllFilters#DeleteAllEObjectsSatisfiesCondition()
	 * @generated
	 */
	EOperation getAllFilters__DeleteAllEObjectsSatisfiesCondition();

	/**
	 * Returns the meta object for class '{@link dslFilter.FilterGroup <em>Filter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Group</em>'.
	 * @see dslFilter.FilterGroup
	 * @generated
	 */
	EClass getFilterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link dslFilter.FilterGroup#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see dslFilter.FilterGroup#getContents()
	 * @see #getFilterGroup()
	 * @generated
	 */
	EReference getFilterGroup_Contents();

	/**
	 * Returns the meta object for the containment reference list '{@link dslFilter.FilterGroup#getListSatifiesCondition <em>List Satifies Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Satifies Condition</em>'.
	 * @see dslFilter.FilterGroup#getListSatifiesCondition()
	 * @see #getFilterGroup()
	 * @generated
	 */
	EReference getFilterGroup_ListSatifiesCondition();

	/**
	 * Returns the meta object for the reference '{@link dslFilter.FilterGroup#getAnEClass <em>An EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>An EClass</em>'.
	 * @see dslFilter.FilterGroup#getAnEClass()
	 * @see #getFilterGroup()
	 * @generated
	 */
	EReference getFilterGroup_AnEClass();

	/**
	 * Returns the meta object for the '{@link dslFilter.FilterGroup#InitFilterGroup(java.lang.Integer) <em>Init Filter Group</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Filter Group</em>' operation.
	 * @see dslFilter.FilterGroup#InitFilterGroup(java.lang.Integer)
	 * @generated
	 */
	EOperation getFilterGroup__InitFilterGroup__Integer();

	/**
	 * Returns the meta object for the '{@link dslFilter.FilterGroup#isClassInterfaceEObject(org.eclipse.emf.ecore.EObject) <em>Is Class Interface EObject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Class Interface EObject</em>' operation.
	 * @see dslFilter.FilterGroup#isClassInterfaceEObject(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFilterGroup__IsClassInterfaceEObject__EObject();

	/**
	 * Returns the meta object for class '{@link dslFilter.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see dslFilter.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the containment reference '{@link dslFilter.Filter#getAnRule <em>An Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>An Rule</em>'.
	 * @see dslFilter.Filter#getAnRule()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_AnRule();

	/**
	 * Returns the meta object for the reference '{@link dslFilter.Filter#getAnEStructuralFeature <em>An EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>An EStructural Feature</em>'.
	 * @see dslFilter.Filter#getAnEStructuralFeature()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_AnEStructuralFeature();

	/**
	 * Returns the meta object for the '{@link dslFilter.Filter#GetRules() <em>Get Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rules</em>' operation.
	 * @see dslFilter.Filter#GetRules()
	 * @generated
	 */
	EOperation getFilter__GetRules();

	/**
	 * Returns the meta object for the '{@link dslFilter.Filter#GetObjectReferences() <em>Get Object References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Object References</em>' operation.
	 * @see dslFilter.Filter#GetObjectReferences()
	 * @generated
	 */
	EOperation getFilter__GetObjectReferences();

	/**
	 * Returns the meta object for the '{@link dslFilter.Filter#InitFilter() <em>Init Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Filter</em>' operation.
	 * @see dslFilter.Filter#InitFilter()
	 * @generated
	 */
	EOperation getFilter__InitFilter();

	/**
	 * Returns the meta object for class '{@link dslFilter.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see dslFilter.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link dslFilter.Rule#getAnExp <em>An Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>An Exp</em>'.
	 * @see dslFilter.Rule#getAnExp()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_AnExp();

	/**
	 * Returns the meta object for the '{@link dslFilter.Rule#SatifiesRule(java.lang.Object) <em>Satifies Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Satifies Rule</em>' operation.
	 * @see dslFilter.Rule#SatifiesRule(java.lang.Object)
	 * @generated
	 */
	EOperation getRule__SatifiesRule__Object();

	/**
	 * Returns the meta object for class '{@link dslFilter.CNumberOperation <em>CNumber Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CNumber Operation</em>'.
	 * @see dslFilter.CNumberOperation
	 * @generated
	 */
	EClass getCNumberOperation();

	/**
	 * Returns the meta object for the attribute '{@link dslFilter.CNumberOperation#getAnNumberOperation <em>An Number Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>An Number Operation</em>'.
	 * @see dslFilter.CNumberOperation#getAnNumberOperation()
	 * @see #getCNumberOperation()
	 * @generated
	 */
	EAttribute getCNumberOperation_AnNumberOperation();

	/**
	 * Returns the meta object for class '{@link dslFilter.CStringOperation <em>CString Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CString Operation</em>'.
	 * @see dslFilter.CStringOperation
	 * @generated
	 */
	EClass getCStringOperation();

	/**
	 * Returns the meta object for the attribute '{@link dslFilter.CStringOperation#getAnStringOperation <em>An String Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>An String Operation</em>'.
	 * @see dslFilter.CStringOperation#getAnStringOperation()
	 * @see #getCStringOperation()
	 * @generated
	 */
	EAttribute getCStringOperation_AnStringOperation();

	/**
	 * Returns the meta object for class '{@link dslFilter.CStructuralEObject <em>CStructural EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CStructural EObject</em>'.
	 * @see dslFilter.CStructuralEObject
	 * @generated
	 */
	EClass getCStructuralEObject();

	/**
	 * Returns the meta object for the attribute '{@link dslFilter.CStructuralEObject#getAnNumberOperation <em>An Number Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>An Number Operation</em>'.
	 * @see dslFilter.CStructuralEObject#getAnNumberOperation()
	 * @see #getCStructuralEObject()
	 * @generated
	 */
	EAttribute getCStructuralEObject_AnNumberOperation();

	/**
	 * Returns the meta object for class '{@link dslFilter.CLogicOperation <em>CLogic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CLogic Operation</em>'.
	 * @see dslFilter.CLogicOperation
	 * @generated
	 */
	EClass getCLogicOperation();

	/**
	 * Returns the meta object for the attribute '{@link dslFilter.CLogicOperation#getAnLogicOperation <em>An Logic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>An Logic Operation</em>'.
	 * @see dslFilter.CLogicOperation#getAnLogicOperation()
	 * @see #getCLogicOperation()
	 * @generated
	 */
	EAttribute getCLogicOperation_AnLogicOperation();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Int To EObject Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int To EObject Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EIntegerObject"
	 *        valueType="org.eclipse.emf.ecore.EObject" valueMany="true"
	 * @generated
	 */
	EClass getIntToEObjectMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntToEObjectMap()
	 * @generated
	 */
	EAttribute getIntToEObjectMap_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntToEObjectMap()
	 * @generated
	 */
	EReference getIntToEObjectMap_Value();

	/**
	 * Returns the meta object for class '{@link dslFilter.FilterContent <em>Filter Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Content</em>'.
	 * @see dslFilter.FilterContent
	 * @generated
	 */
	EClass getFilterContent();

	/**
	 * Returns the meta object for the attribute '{@link dslFilter.FilterContent#isNegative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative</em>'.
	 * @see dslFilter.FilterContent#isNegative()
	 * @see #getFilterContent()
	 * @generated
	 */
	EAttribute getFilterContent_Negative();

	/**
	 * Returns the meta object for the attribute '{@link dslFilter.FilterContent#isExecute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execute</em>'.
	 * @see dslFilter.FilterContent#isExecute()
	 * @see #getFilterContent()
	 * @generated
	 */
	EAttribute getFilterContent_Execute();

	/**
	 * Returns the meta object for the '{@link dslFilter.FilterContent#Execute(org.eclipse.emf.ecore.EObject) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see dslFilter.FilterContent#Execute(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getFilterContent__Execute__EObject();

	/**
	 * Returns the meta object for class '{@link dslFilter.FilterAttributes <em>Filter Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Attributes</em>'.
	 * @see dslFilter.FilterAttributes
	 * @generated
	 */
	EClass getFilterAttributes();

	/**
	 * Returns the meta object for the attribute '{@link dslFilter.FilterAttributes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dslFilter.FilterAttributes#getName()
	 * @see #getFilterAttributes()
	 * @generated
	 */
	EAttribute getFilterAttributes_Name();

	/**
	 * Returns the meta object for the reference '{@link dslFilter.FilterAttributes#getAnLogicOperation <em>An Logic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>An Logic Operation</em>'.
	 * @see dslFilter.FilterAttributes#getAnLogicOperation()
	 * @see #getFilterAttributes()
	 * @generated
	 */
	EReference getFilterAttributes_AnLogicOperation();

	/**
	 * Returns the meta object for class '{@link dslFilter.BasicCStringOperation <em>Basic CString Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic CString Operation</em>'.
	 * @see dslFilter.BasicCStringOperation
	 * @generated
	 */
	EClass getBasicCStringOperation();

	/**
	 * Returns the meta object for the attribute list '{@link dslFilter.BasicCStringOperation#getAnEnumStringOperation <em>An Enum String Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>An Enum String Operation</em>'.
	 * @see dslFilter.BasicCStringOperation#getAnEnumStringOperation()
	 * @see #getBasicCStringOperation()
	 * @generated
	 */
	EAttribute getBasicCStringOperation_AnEnumStringOperation();

	/**
	 * Returns the meta object for the '{@link dslFilter.BasicCStringOperation#EnumToStringArray() <em>Enum To String Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enum To String Array</em>' operation.
	 * @see dslFilter.BasicCStringOperation#EnumToStringArray()
	 * @generated
	 */
	EOperation getBasicCStringOperation__EnumToStringArray();

	/**
	 * Returns the meta object for class '{@link dslFilter.BasicCNumberOperation <em>Basic CNumber Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic CNumber Operation</em>'.
	 * @see dslFilter.BasicCNumberOperation
	 * @generated
	 */
	EClass getBasicCNumberOperation();

	/**
	 * Returns the meta object for the attribute list '{@link dslFilter.BasicCNumberOperation#getAnEnumNumberOperation <em>An Enum Number Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>An Enum Number Operation</em>'.
	 * @see dslFilter.BasicCNumberOperation#getAnEnumNumberOperation()
	 * @see #getBasicCNumberOperation()
	 * @generated
	 */
	EAttribute getBasicCNumberOperation_AnEnumNumberOperation();

	/**
	 * Returns the meta object for the '{@link dslFilter.BasicCNumberOperation#EnumToStringArray() <em>Enum To String Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enum To String Array</em>' operation.
	 * @see dslFilter.BasicCNumberOperation#EnumToStringArray()
	 * @generated
	 */
	EOperation getBasicCNumberOperation__EnumToStringArray();

	/**
	 * Returns the meta object for class '{@link dslFilter.BasicCLogicOperation <em>Basic CLogic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic CLogic Operation</em>'.
	 * @see dslFilter.BasicCLogicOperation
	 * @generated
	 */
	EClass getBasicCLogicOperation();

	/**
	 * Returns the meta object for the attribute list '{@link dslFilter.BasicCLogicOperation#getAnEnumLogicOperation <em>An Enum Logic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>An Enum Logic Operation</em>'.
	 * @see dslFilter.BasicCLogicOperation#getAnEnumLogicOperation()
	 * @see #getBasicCLogicOperation()
	 * @generated
	 */
	EAttribute getBasicCLogicOperation_AnEnumLogicOperation();

	/**
	 * Returns the meta object for the '{@link dslFilter.BasicCLogicOperation#EnumToStringArray() <em>Enum To String Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enum To String Array</em>' operation.
	 * @see dslFilter.BasicCLogicOperation#EnumToStringArray()
	 * @generated
	 */
	EOperation getBasicCLogicOperation__EnumToStringArray();

	/**
	 * Returns the meta object for enum '{@link dslFilter.EnumLogicOperation <em>Enum Logic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Logic Operation</em>'.
	 * @see dslFilter.EnumLogicOperation
	 * @generated
	 */
	EEnum getEnumLogicOperation();

	/**
	 * Returns the meta object for enum '{@link dslFilter.EnumNumberOperation <em>Enum Number Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Number Operation</em>'.
	 * @see dslFilter.EnumNumberOperation
	 * @generated
	 */
	EEnum getEnumNumberOperation();

	/**
	 * Returns the meta object for enum '{@link dslFilter.EnumStringOperation <em>Enum String Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum String Operation</em>'.
	 * @see dslFilter.EnumStringOperation
	 * @generated
	 */
	EEnum getEnumStringOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslFilterFactory getDslFilterFactory();

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
		 * The meta object literal for the '{@link dslFilter.impl.AllFiltersImpl <em>All Filters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.impl.AllFiltersImpl
		 * @see dslFilter.impl.DslFilterPackageImpl#getAllFilters()
		 * @generated
		 */
		EClass ALL_FILTERS = eINSTANCE.getAllFilters();

		/**
		 * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_FILTERS__NEGATIVE = eINSTANCE.getAllFilters_Negative();

		/**
		 * The meta object literal for the '<em><b>Groupfilters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_FILTERS__GROUPFILTERS = eINSTANCE.getAllFilters_Groupfilters();

		/**
		 * The meta object literal for the '<em><b>Model URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_FILTERS__MODEL_URI = eINSTANCE.getAllFilters_ModelURI();

		/**
		 * The meta object literal for the '<em><b>List EClasses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_FILTERS__LIST_ECLASSES = eINSTANCE.getAllFilters_List_EClasses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_FILTERS__NAME = eINSTANCE.getAllFilters_Name();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALL_FILTERS___EXECUTE__TREEITERATOR = eINSTANCE.getAllFilters__Execute__TreeIterator();

		/**
		 * The meta object literal for the '<em><b>Init All Filters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALL_FILTERS___INIT_ALL_FILTERS = eINSTANCE.getAllFilters__InitAllFilters();

		/**
		 * The meta object literal for the '<em><b>All EObjects Satifies Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALL_FILTERS___ALL_EOBJECTS_SATIFIES_CONDITION = eINSTANCE.getAllFilters__AllEObjectsSatifiesCondition();

		/**
		 * The meta object literal for the '<em><b>Delete All EObjects Satisfies Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALL_FILTERS___DELETE_ALL_EOBJECTS_SATISFIES_CONDITION = eINSTANCE.getAllFilters__DeleteAllEObjectsSatisfiesCondition();

		/**
		 * The meta object literal for the '{@link dslFilter.impl.FilterGroupImpl <em>Filter Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.impl.FilterGroupImpl
		 * @see dslFilter.impl.DslFilterPackageImpl#getFilterGroup()
		 * @generated
		 */
		EClass FILTER_GROUP = eINSTANCE.getFilterGroup();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_GROUP__CONTENTS = eINSTANCE.getFilterGroup_Contents();

		/**
		 * The meta object literal for the '<em><b>List Satifies Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_GROUP__LIST_SATIFIES_CONDITION = eINSTANCE.getFilterGroup_ListSatifiesCondition();

		/**
		 * The meta object literal for the '<em><b>An EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_GROUP__AN_ECLASS = eINSTANCE.getFilterGroup_AnEClass();

		/**
		 * The meta object literal for the '<em><b>Init Filter Group</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILTER_GROUP___INIT_FILTER_GROUP__INTEGER = eINSTANCE.getFilterGroup__InitFilterGroup__Integer();

		/**
		 * The meta object literal for the '<em><b>Is Class Interface EObject</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILTER_GROUP___IS_CLASS_INTERFACE_EOBJECT__EOBJECT = eINSTANCE.getFilterGroup__IsClassInterfaceEObject__EObject();

		/**
		 * The meta object literal for the '{@link dslFilter.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.impl.FilterImpl
		 * @see dslFilter.impl.DslFilterPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>An Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__AN_RULE = eINSTANCE.getFilter_AnRule();

		/**
		 * The meta object literal for the '<em><b>An EStructural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__AN_ESTRUCTURAL_FEATURE = eINSTANCE.getFilter_AnEStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Get Rules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILTER___GET_RULES = eINSTANCE.getFilter__GetRules();

		/**
		 * The meta object literal for the '<em><b>Get Object References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILTER___GET_OBJECT_REFERENCES = eINSTANCE.getFilter__GetObjectReferences();

		/**
		 * The meta object literal for the '<em><b>Init Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILTER___INIT_FILTER = eINSTANCE.getFilter__InitFilter();

		/**
		 * The meta object literal for the '{@link dslFilter.Rule <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.Rule
		 * @see dslFilter.impl.DslFilterPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>An Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__AN_EXP = eINSTANCE.getRule_AnExp();

		/**
		 * The meta object literal for the '<em><b>Satifies Rule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULE___SATIFIES_RULE__OBJECT = eINSTANCE.getRule__SatifiesRule__Object();

		/**
		 * The meta object literal for the '{@link dslFilter.impl.CNumberOperationImpl <em>CNumber Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.impl.CNumberOperationImpl
		 * @see dslFilter.impl.DslFilterPackageImpl#getCNumberOperation()
		 * @generated
		 */
		EClass CNUMBER_OPERATION = eINSTANCE.getCNumberOperation();

		/**
		 * The meta object literal for the '<em><b>An Number Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CNUMBER_OPERATION__AN_NUMBER_OPERATION = eINSTANCE.getCNumberOperation_AnNumberOperation();

		/**
		 * The meta object literal for the '{@link dslFilter.impl.CStringOperationImpl <em>CString Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.impl.CStringOperationImpl
		 * @see dslFilter.impl.DslFilterPackageImpl#getCStringOperation()
		 * @generated
		 */
		EClass CSTRING_OPERATION = eINSTANCE.getCStringOperation();

		/**
		 * The meta object literal for the '<em><b>An String Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSTRING_OPERATION__AN_STRING_OPERATION = eINSTANCE.getCStringOperation_AnStringOperation();

		/**
		 * The meta object literal for the '{@link dslFilter.impl.CStructuralEObjectImpl <em>CStructural EObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.impl.CStructuralEObjectImpl
		 * @see dslFilter.impl.DslFilterPackageImpl#getCStructuralEObject()
		 * @generated
		 */
		EClass CSTRUCTURAL_EOBJECT = eINSTANCE.getCStructuralEObject();

		/**
		 * The meta object literal for the '<em><b>An Number Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSTRUCTURAL_EOBJECT__AN_NUMBER_OPERATION = eINSTANCE.getCStructuralEObject_AnNumberOperation();

		/**
		 * The meta object literal for the '{@link dslFilter.impl.CLogicOperationImpl <em>CLogic Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.impl.CLogicOperationImpl
		 * @see dslFilter.impl.DslFilterPackageImpl#getCLogicOperation()
		 * @generated
		 */
		EClass CLOGIC_OPERATION = eINSTANCE.getCLogicOperation();

		/**
		 * The meta object literal for the '<em><b>An Logic Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOGIC_OPERATION__AN_LOGIC_OPERATION = eINSTANCE.getCLogicOperation_AnLogicOperation();

		/**
		 * The meta object literal for the '{@link dslFilter.impl.IntToEObjectMapImpl <em>Int To EObject Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.impl.IntToEObjectMapImpl
		 * @see dslFilter.impl.DslFilterPackageImpl#getIntToEObjectMap()
		 * @generated
		 */
		EClass INT_TO_EOBJECT_MAP = eINSTANCE.getIntToEObjectMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_TO_EOBJECT_MAP__KEY = eINSTANCE.getIntToEObjectMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_TO_EOBJECT_MAP__VALUE = eINSTANCE.getIntToEObjectMap_Value();

		/**
		 * The meta object literal for the '{@link dslFilter.FilterContent <em>Filter Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.FilterContent
		 * @see dslFilter.impl.DslFilterPackageImpl#getFilterContent()
		 * @generated
		 */
		EClass FILTER_CONTENT = eINSTANCE.getFilterContent();

		/**
		 * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_CONTENT__NEGATIVE = eINSTANCE.getFilterContent_Negative();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_CONTENT__EXECUTE = eINSTANCE.getFilterContent_Execute();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILTER_CONTENT___EXECUTE__EOBJECT = eINSTANCE.getFilterContent__Execute__EObject();

		/**
		 * The meta object literal for the '{@link dslFilter.impl.FilterAttributesImpl <em>Filter Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.impl.FilterAttributesImpl
		 * @see dslFilter.impl.DslFilterPackageImpl#getFilterAttributes()
		 * @generated
		 */
		EClass FILTER_ATTRIBUTES = eINSTANCE.getFilterAttributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_ATTRIBUTES__NAME = eINSTANCE.getFilterAttributes_Name();

		/**
		 * The meta object literal for the '<em><b>An Logic Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_ATTRIBUTES__AN_LOGIC_OPERATION = eINSTANCE.getFilterAttributes_AnLogicOperation();

		/**
		 * The meta object literal for the '{@link dslFilter.impl.BasicCStringOperationImpl <em>Basic CString Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.impl.BasicCStringOperationImpl
		 * @see dslFilter.impl.DslFilterPackageImpl#getBasicCStringOperation()
		 * @generated
		 */
		EClass BASIC_CSTRING_OPERATION = eINSTANCE.getBasicCStringOperation();

		/**
		 * The meta object literal for the '<em><b>An Enum String Operation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_CSTRING_OPERATION__AN_ENUM_STRING_OPERATION = eINSTANCE.getBasicCStringOperation_AnEnumStringOperation();

		/**
		 * The meta object literal for the '<em><b>Enum To String Array</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASIC_CSTRING_OPERATION___ENUM_TO_STRING_ARRAY = eINSTANCE.getBasicCStringOperation__EnumToStringArray();

		/**
		 * The meta object literal for the '{@link dslFilter.impl.BasicCNumberOperationImpl <em>Basic CNumber Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.impl.BasicCNumberOperationImpl
		 * @see dslFilter.impl.DslFilterPackageImpl#getBasicCNumberOperation()
		 * @generated
		 */
		EClass BASIC_CNUMBER_OPERATION = eINSTANCE.getBasicCNumberOperation();

		/**
		 * The meta object literal for the '<em><b>An Enum Number Operation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_CNUMBER_OPERATION__AN_ENUM_NUMBER_OPERATION = eINSTANCE.getBasicCNumberOperation_AnEnumNumberOperation();

		/**
		 * The meta object literal for the '<em><b>Enum To String Array</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASIC_CNUMBER_OPERATION___ENUM_TO_STRING_ARRAY = eINSTANCE.getBasicCNumberOperation__EnumToStringArray();

		/**
		 * The meta object literal for the '{@link dslFilter.impl.BasicCLogicOperationImpl <em>Basic CLogic Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.impl.BasicCLogicOperationImpl
		 * @see dslFilter.impl.DslFilterPackageImpl#getBasicCLogicOperation()
		 * @generated
		 */
		EClass BASIC_CLOGIC_OPERATION = eINSTANCE.getBasicCLogicOperation();

		/**
		 * The meta object literal for the '<em><b>An Enum Logic Operation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_CLOGIC_OPERATION__AN_ENUM_LOGIC_OPERATION = eINSTANCE.getBasicCLogicOperation_AnEnumLogicOperation();

		/**
		 * The meta object literal for the '<em><b>Enum To String Array</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASIC_CLOGIC_OPERATION___ENUM_TO_STRING_ARRAY = eINSTANCE.getBasicCLogicOperation__EnumToStringArray();

		/**
		 * The meta object literal for the '{@link dslFilter.EnumLogicOperation <em>Enum Logic Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.EnumLogicOperation
		 * @see dslFilter.impl.DslFilterPackageImpl#getEnumLogicOperation()
		 * @generated
		 */
		EEnum ENUM_LOGIC_OPERATION = eINSTANCE.getEnumLogicOperation();

		/**
		 * The meta object literal for the '{@link dslFilter.EnumNumberOperation <em>Enum Number Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.EnumNumberOperation
		 * @see dslFilter.impl.DslFilterPackageImpl#getEnumNumberOperation()
		 * @generated
		 */
		EEnum ENUM_NUMBER_OPERATION = eINSTANCE.getEnumNumberOperation();

		/**
		 * The meta object literal for the '{@link dslFilter.EnumStringOperation <em>Enum String Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dslFilter.EnumStringOperation
		 * @see dslFilter.impl.DslFilterPackageImpl#getEnumStringOperation()
		 * @generated
		 */
		EEnum ENUM_STRING_OPERATION = eINSTANCE.getEnumStringOperation();

	}

} //DslFilterPackage
