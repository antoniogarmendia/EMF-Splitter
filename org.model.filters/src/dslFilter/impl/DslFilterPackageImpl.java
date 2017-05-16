/**
 */
package dslFilter.impl;

import dslFilter.AllFilters;
import dslFilter.BasicCLogicOperation;
import dslFilter.BasicCNumberOperation;
import dslFilter.BasicCStringOperation;
import dslFilter.CLogicOperation;
import dslFilter.CNumberOperation;
import dslFilter.CStringOperation;
import dslFilter.CStructuralEObject;
import dslFilter.DslFilterFactory;
import dslFilter.DslFilterPackage;
import dslFilter.EnumLogicOperation;
import dslFilter.EnumNumberOperation;
import dslFilter.EnumStringOperation;
import dslFilter.Filter;
import dslFilter.FilterAttributes;
import dslFilter.FilterContent;
import dslFilter.FilterGroup;
import dslFilter.Rule;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
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
public class DslFilterPackageImpl extends EPackageImpl implements DslFilterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allFiltersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cNumberOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cStringOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cStructuralEObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cLogicOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intToEObjectMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicCStringOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicCNumberOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicCLogicOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLogicOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumNumberOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumStringOperationEEnum = null;

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
	 * @see dslFilter.DslFilterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DslFilterPackageImpl() {
		super(eNS_URI, DslFilterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DslFilterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DslFilterPackage init() {
		if (isInited) return (DslFilterPackage)EPackage.Registry.INSTANCE.getEPackage(DslFilterPackage.eNS_URI);

		// Obtain or create and register package
		DslFilterPackageImpl theDslFilterPackage = (DslFilterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DslFilterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DslFilterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDslFilterPackage.createPackageContents();

		// Initialize created meta-data
		theDslFilterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDslFilterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DslFilterPackage.eNS_URI, theDslFilterPackage);
		return theDslFilterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllFilters() {
		return allFiltersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllFilters_Negative() {
		return (EAttribute)allFiltersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllFilters_Groupfilters() {
		return (EReference)allFiltersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllFilters_ModelURI() {
		return (EAttribute)allFiltersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllFilters_List_EClasses() {
		return (EReference)allFiltersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllFilters_Name() {
		return (EAttribute)allFiltersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllFilters__Execute__TreeIterator() {
		return allFiltersEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllFilters__InitAllFilters() {
		return allFiltersEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllFilters__AllEObjectsSatifiesCondition() {
		return allFiltersEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllFilters__DeleteAllEObjectsSatisfiesCondition() {
		return allFiltersEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterGroup() {
		return filterGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterGroup_Contents() {
		return (EReference)filterGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterGroup_ListSatifiesCondition() {
		return (EReference)filterGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterGroup_AnEClass() {
		return (EReference)filterGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFilterGroup__InitFilterGroup__Integer() {
		return filterGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFilterGroup__IsClassInterfaceEObject__EObject() {
		return filterGroupEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_AnRule() {
		return (EReference)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_AnEStructuralFeature() {
		return (EReference)filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFilter__GetRules() {
		return filterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFilter__GetObjectReferences() {
		return filterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFilter__InitFilter() {
		return filterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_AnExp() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRule__SatifiesRule__Object() {
		return ruleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCNumberOperation() {
		return cNumberOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCNumberOperation_AnNumberOperation() {
		return (EAttribute)cNumberOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCStringOperation() {
		return cStringOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCStringOperation_AnStringOperation() {
		return (EAttribute)cStringOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCStructuralEObject() {
		return cStructuralEObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCStructuralEObject_AnNumberOperation() {
		return (EAttribute)cStructuralEObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCLogicOperation() {
		return cLogicOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCLogicOperation_AnLogicOperation() {
		return (EAttribute)cLogicOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntToEObjectMap() {
		return intToEObjectMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntToEObjectMap_Key() {
		return (EAttribute)intToEObjectMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntToEObjectMap_Value() {
		return (EReference)intToEObjectMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterContent() {
		return filterContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterContent_Negative() {
		return (EAttribute)filterContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterContent_Execute() {
		return (EAttribute)filterContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFilterContent__Execute__EObject() {
		return filterContentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterAttributes() {
		return filterAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterAttributes_Name() {
		return (EAttribute)filterAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterAttributes_AnLogicOperation() {
		return (EReference)filterAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicCStringOperation() {
		return basicCStringOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicCStringOperation_AnEnumStringOperation() {
		return (EAttribute)basicCStringOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasicCStringOperation__EnumToStringArray() {
		return basicCStringOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicCNumberOperation() {
		return basicCNumberOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicCNumberOperation_AnEnumNumberOperation() {
		return (EAttribute)basicCNumberOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasicCNumberOperation__EnumToStringArray() {
		return basicCNumberOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicCLogicOperation() {
		return basicCLogicOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicCLogicOperation_AnEnumLogicOperation() {
		return (EAttribute)basicCLogicOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasicCLogicOperation__EnumToStringArray() {
		return basicCLogicOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumLogicOperation() {
		return enumLogicOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumNumberOperation() {
		return enumNumberOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumStringOperation() {
		return enumStringOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFilterFactory getDslFilterFactory() {
		return (DslFilterFactory)getEFactoryInstance();
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
		allFiltersEClass = createEClass(ALL_FILTERS);
		createEAttribute(allFiltersEClass, ALL_FILTERS__NEGATIVE);
		createEReference(allFiltersEClass, ALL_FILTERS__GROUPFILTERS);
		createEAttribute(allFiltersEClass, ALL_FILTERS__MODEL_URI);
		createEReference(allFiltersEClass, ALL_FILTERS__LIST_ECLASSES);
		createEAttribute(allFiltersEClass, ALL_FILTERS__NAME);
		createEOperation(allFiltersEClass, ALL_FILTERS___EXECUTE__TREEITERATOR);
		createEOperation(allFiltersEClass, ALL_FILTERS___INIT_ALL_FILTERS);
		createEOperation(allFiltersEClass, ALL_FILTERS___ALL_EOBJECTS_SATIFIES_CONDITION);
		createEOperation(allFiltersEClass, ALL_FILTERS___DELETE_ALL_EOBJECTS_SATISFIES_CONDITION);

		filterGroupEClass = createEClass(FILTER_GROUP);
		createEReference(filterGroupEClass, FILTER_GROUP__CONTENTS);
		createEReference(filterGroupEClass, FILTER_GROUP__LIST_SATIFIES_CONDITION);
		createEReference(filterGroupEClass, FILTER_GROUP__AN_ECLASS);
		createEOperation(filterGroupEClass, FILTER_GROUP___INIT_FILTER_GROUP__INTEGER);
		createEOperation(filterGroupEClass, FILTER_GROUP___IS_CLASS_INTERFACE_EOBJECT__EOBJECT);

		filterEClass = createEClass(FILTER);
		createEReference(filterEClass, FILTER__AN_RULE);
		createEReference(filterEClass, FILTER__AN_ESTRUCTURAL_FEATURE);
		createEOperation(filterEClass, FILTER___GET_RULES);
		createEOperation(filterEClass, FILTER___GET_OBJECT_REFERENCES);
		createEOperation(filterEClass, FILTER___INIT_FILTER);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__AN_EXP);
		createEOperation(ruleEClass, RULE___SATIFIES_RULE__OBJECT);

		cNumberOperationEClass = createEClass(CNUMBER_OPERATION);
		createEAttribute(cNumberOperationEClass, CNUMBER_OPERATION__AN_NUMBER_OPERATION);

		cStringOperationEClass = createEClass(CSTRING_OPERATION);
		createEAttribute(cStringOperationEClass, CSTRING_OPERATION__AN_STRING_OPERATION);

		cStructuralEObjectEClass = createEClass(CSTRUCTURAL_EOBJECT);
		createEAttribute(cStructuralEObjectEClass, CSTRUCTURAL_EOBJECT__AN_NUMBER_OPERATION);

		cLogicOperationEClass = createEClass(CLOGIC_OPERATION);
		createEAttribute(cLogicOperationEClass, CLOGIC_OPERATION__AN_LOGIC_OPERATION);

		intToEObjectMapEClass = createEClass(INT_TO_EOBJECT_MAP);
		createEAttribute(intToEObjectMapEClass, INT_TO_EOBJECT_MAP__KEY);
		createEReference(intToEObjectMapEClass, INT_TO_EOBJECT_MAP__VALUE);

		filterContentEClass = createEClass(FILTER_CONTENT);
		createEAttribute(filterContentEClass, FILTER_CONTENT__NEGATIVE);
		createEAttribute(filterContentEClass, FILTER_CONTENT__EXECUTE);
		createEOperation(filterContentEClass, FILTER_CONTENT___EXECUTE__EOBJECT);

		filterAttributesEClass = createEClass(FILTER_ATTRIBUTES);
		createEAttribute(filterAttributesEClass, FILTER_ATTRIBUTES__NAME);
		createEReference(filterAttributesEClass, FILTER_ATTRIBUTES__AN_LOGIC_OPERATION);

		basicCStringOperationEClass = createEClass(BASIC_CSTRING_OPERATION);
		createEAttribute(basicCStringOperationEClass, BASIC_CSTRING_OPERATION__AN_ENUM_STRING_OPERATION);
		createEOperation(basicCStringOperationEClass, BASIC_CSTRING_OPERATION___ENUM_TO_STRING_ARRAY);

		basicCNumberOperationEClass = createEClass(BASIC_CNUMBER_OPERATION);
		createEAttribute(basicCNumberOperationEClass, BASIC_CNUMBER_OPERATION__AN_ENUM_NUMBER_OPERATION);
		createEOperation(basicCNumberOperationEClass, BASIC_CNUMBER_OPERATION___ENUM_TO_STRING_ARRAY);

		basicCLogicOperationEClass = createEClass(BASIC_CLOGIC_OPERATION);
		createEAttribute(basicCLogicOperationEClass, BASIC_CLOGIC_OPERATION__AN_ENUM_LOGIC_OPERATION);
		createEOperation(basicCLogicOperationEClass, BASIC_CLOGIC_OPERATION___ENUM_TO_STRING_ARRAY);

		// Create enums
		enumLogicOperationEEnum = createEEnum(ENUM_LOGIC_OPERATION);
		enumNumberOperationEEnum = createEEnum(ENUM_NUMBER_OPERATION);
		enumStringOperationEEnum = createEEnum(ENUM_STRING_OPERATION);
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
		filterGroupEClass.getESuperTypes().add(this.getFilterContent());
		filterGroupEClass.getESuperTypes().add(this.getFilterAttributes());
		filterEClass.getESuperTypes().add(this.getFilterContent());
		cNumberOperationEClass.getESuperTypes().add(this.getRule());
		cStringOperationEClass.getESuperTypes().add(this.getRule());
		cStructuralEObjectEClass.getESuperTypes().add(this.getRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(allFiltersEClass, AllFilters.class, "AllFilters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllFilters_Negative(), ecorePackage.getEBoolean(), "negative", "false", 0, 1, AllFilters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllFilters_Groupfilters(), this.getFilterGroup(), null, "groupfilters", null, 0, -1, AllFilters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllFilters_ModelURI(), ecorePackage.getEString(), "modelURI", null, 0, 1, AllFilters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllFilters_List_EClasses(), theEcorePackage.getEClass(), null, "List_EClasses", null, 0, -1, AllFilters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllFilters_Name(), ecorePackage.getEString(), "name", null, 0, 1, AllFilters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAllFilters__Execute__TreeIterator(), ecorePackage.getEBoolean(), "Execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getETreeIterator());
		EGenericType g2 = createEGenericType(theEcorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "tree", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAllFilters__InitAllFilters(), ecorePackage.getEBoolean(), "InitAllFilters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAllFilters__AllEObjectsSatifiesCondition(), this.getIntToEObjectMap(), "AllEObjectsSatifiesCondition", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAllFilters__DeleteAllEObjectsSatisfiesCondition(), ecorePackage.getEBoolean(), "DeleteAllEObjectsSatisfiesCondition", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(filterGroupEClass, FilterGroup.class, "FilterGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterGroup_Contents(), this.getFilterContent(), null, "contents", null, 0, -1, FilterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterGroup_ListSatifiesCondition(), ecorePackage.getEObject(), null, "ListSatifiesCondition", null, 0, -1, FilterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterGroup_AnEClass(), theEcorePackage.getEClass(), null, "anEClass", null, 0, 1, FilterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFilterGroup__InitFilterGroup__Integer(), ecorePackage.getEBoolean(), "InitFilterGroup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEIntegerObject(), "count", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFilterGroup__IsClassInterfaceEObject__EObject(), ecorePackage.getEBoolean(), "isClassInterfaceEObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "anEObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilter_AnRule(), this.getRule(), null, "anRule", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilter_AnEStructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "anEStructuralFeature", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFilter__GetRules(), ecorePackage.getEString(), "GetRules", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFilter__GetObjectReferences(), ecorePackage.getEString(), "GetObjectReferences", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFilter__InitFilter(), ecorePackage.getEBoolean(), "InitFilter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_AnExp(), ecorePackage.getEString(), "anExp", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRule__SatifiesRule__Object(), ecorePackage.getEBoolean(), "SatifiesRule", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cNumberOperationEClass, CNumberOperation.class, "CNumberOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCNumberOperation_AnNumberOperation(), this.getEnumNumberOperation(), "anNumberOperation", null, 0, 1, CNumberOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cStringOperationEClass, CStringOperation.class, "CStringOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCStringOperation_AnStringOperation(), this.getEnumStringOperation(), "anStringOperation", null, 0, 1, CStringOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cStructuralEObjectEClass, CStructuralEObject.class, "CStructuralEObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCStructuralEObject_AnNumberOperation(), this.getEnumNumberOperation(), "anNumberOperation", null, 0, 1, CStructuralEObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cLogicOperationEClass, CLogicOperation.class, "CLogicOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCLogicOperation_AnLogicOperation(), this.getEnumLogicOperation(), "anLogicOperation", "AND", 0, 1, CLogicOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intToEObjectMapEClass, Map.Entry.class, "IntToEObjectMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntToEObjectMap_Key(), ecorePackage.getEIntegerObject(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntToEObjectMap_Value(), ecorePackage.getEObject(), null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterContentEClass, FilterContent.class, "FilterContent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterContent_Negative(), ecorePackage.getEBoolean(), "negative", null, 0, 1, FilterContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterContent_Execute(), ecorePackage.getEBoolean(), "execute", null, 0, 1, FilterContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFilterContent__Execute__EObject(), ecorePackage.getEBoolean(), "Execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "anEObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(filterAttributesEClass, FilterAttributes.class, "FilterAttributes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterAttributes_Name(), ecorePackage.getEString(), "name", "Filters", 0, 1, FilterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterAttributes_AnLogicOperation(), this.getCLogicOperation(), null, "anLogicOperation", null, 0, 1, FilterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicCStringOperationEClass, BasicCStringOperation.class, "BasicCStringOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicCStringOperation_AnEnumStringOperation(), this.getEnumStringOperation(), "anEnumStringOperation", null, 0, -1, BasicCStringOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBasicCStringOperation__EnumToStringArray(), ecorePackage.getEString(), "EnumToStringArray", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(basicCNumberOperationEClass, BasicCNumberOperation.class, "BasicCNumberOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicCNumberOperation_AnEnumNumberOperation(), this.getEnumNumberOperation(), "anEnumNumberOperation", null, 0, -1, BasicCNumberOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBasicCNumberOperation__EnumToStringArray(), ecorePackage.getEString(), "EnumToStringArray", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(basicCLogicOperationEClass, BasicCLogicOperation.class, "BasicCLogicOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicCLogicOperation_AnEnumLogicOperation(), this.getEnumLogicOperation(), "anEnumLogicOperation", null, 0, -1, BasicCLogicOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBasicCLogicOperation__EnumToStringArray(), ecorePackage.getEString(), "EnumToStringArray", 0, -1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumLogicOperationEEnum, EnumLogicOperation.class, "EnumLogicOperation");
		addEEnumLiteral(enumLogicOperationEEnum, EnumLogicOperation.AND);
		addEEnumLiteral(enumLogicOperationEEnum, EnumLogicOperation.OR);

		initEEnum(enumNumberOperationEEnum, EnumNumberOperation.class, "EnumNumberOperation");
		addEEnumLiteral(enumNumberOperationEEnum, EnumNumberOperation.EQUALTO);
		addEEnumLiteral(enumNumberOperationEEnum, EnumNumberOperation.NOTEQUALTO);
		addEEnumLiteral(enumNumberOperationEEnum, EnumNumberOperation.LESSTHAN);
		addEEnumLiteral(enumNumberOperationEEnum, EnumNumberOperation.GREATERTHAN);
		addEEnumLiteral(enumNumberOperationEEnum, EnumNumberOperation.LESSTHANOREQUALTO);
		addEEnumLiteral(enumNumberOperationEEnum, EnumNumberOperation.GREATERTHANOREQUALTO);

		initEEnum(enumStringOperationEEnum, EnumStringOperation.class, "EnumStringOperation");
		addEEnumLiteral(enumStringOperationEEnum, EnumStringOperation.CONTAINS);
		addEEnumLiteral(enumStringOperationEEnum, EnumStringOperation.STARTSWITH);
		addEEnumLiteral(enumStringOperationEEnum, EnumStringOperation.ENDSWITH);
		addEEnumLiteral(enumStringOperationEEnum, EnumStringOperation.REGULAREXPRESSION);

		// Create resource
		createResource(eNS_URI);
	}

} //DslFilterPackageImpl
