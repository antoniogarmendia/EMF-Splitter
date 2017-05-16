/**
 */
package dslFilter.impl;

import dslFilter.*;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslFilterFactoryImpl extends EFactoryImpl implements DslFilterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DslFilterFactory init() {
		try {
			DslFilterFactory theDslFilterFactory = (DslFilterFactory)EPackage.Registry.INSTANCE.getEFactory(DslFilterPackage.eNS_URI);
			if (theDslFilterFactory != null) {
				return theDslFilterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DslFilterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFilterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DslFilterPackage.ALL_FILTERS: return createAllFilters();
			case DslFilterPackage.FILTER_GROUP: return createFilterGroup();
			case DslFilterPackage.FILTER: return createFilter();
			case DslFilterPackage.CNUMBER_OPERATION: return createCNumberOperation();
			case DslFilterPackage.CSTRING_OPERATION: return createCStringOperation();
			case DslFilterPackage.CSTRUCTURAL_EOBJECT: return createCStructuralEObject();
			case DslFilterPackage.CLOGIC_OPERATION: return createCLogicOperation();
			case DslFilterPackage.INT_TO_EOBJECT_MAP: return (EObject)createIntToEObjectMap();
			case DslFilterPackage.BASIC_CSTRING_OPERATION: return createBasicCStringOperation();
			case DslFilterPackage.BASIC_CNUMBER_OPERATION: return createBasicCNumberOperation();
			case DslFilterPackage.BASIC_CLOGIC_OPERATION: return createBasicCLogicOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DslFilterPackage.ENUM_LOGIC_OPERATION:
				return createEnumLogicOperationFromString(eDataType, initialValue);
			case DslFilterPackage.ENUM_NUMBER_OPERATION:
				return createEnumNumberOperationFromString(eDataType, initialValue);
			case DslFilterPackage.ENUM_STRING_OPERATION:
				return createEnumStringOperationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DslFilterPackage.ENUM_LOGIC_OPERATION:
				return convertEnumLogicOperationToString(eDataType, instanceValue);
			case DslFilterPackage.ENUM_NUMBER_OPERATION:
				return convertEnumNumberOperationToString(eDataType, instanceValue);
			case DslFilterPackage.ENUM_STRING_OPERATION:
				return convertEnumStringOperationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllFilters createAllFilters() {
		AllFiltersImpl allFilters = new AllFiltersImpl();
		return allFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterGroup createFilterGroup() {
		FilterGroupImpl filterGroup = new FilterGroupImpl();
		return filterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNumberOperation createCNumberOperation() {
		CNumberOperationImpl cNumberOperation = new CNumberOperationImpl();
		return cNumberOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CStringOperation createCStringOperation() {
		CStringOperationImpl cStringOperation = new CStringOperationImpl();
		return cStringOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CStructuralEObject createCStructuralEObject() {
		CStructuralEObjectImpl cStructuralEObject = new CStructuralEObjectImpl();
		return cStructuralEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLogicOperation createCLogicOperation() {
		CLogicOperationImpl cLogicOperation = new CLogicOperationImpl();
		return cLogicOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Integer, EList<EObject>> createIntToEObjectMap() {
		IntToEObjectMapImpl intToEObjectMap = new IntToEObjectMapImpl();
		return intToEObjectMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicCStringOperation createBasicCStringOperation() {
		BasicCStringOperationImpl basicCStringOperation = new BasicCStringOperationImpl();
		return basicCStringOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicCNumberOperation createBasicCNumberOperation() {
		BasicCNumberOperationImpl basicCNumberOperation = new BasicCNumberOperationImpl();
		return basicCNumberOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicCLogicOperation createBasicCLogicOperation() {
		BasicCLogicOperationImpl basicCLogicOperation = new BasicCLogicOperationImpl();
		return basicCLogicOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLogicOperation createEnumLogicOperationFromString(EDataType eDataType, String initialValue) {
		EnumLogicOperation result = EnumLogicOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumLogicOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumNumberOperation createEnumNumberOperationFromString(EDataType eDataType, String initialValue) {
		EnumNumberOperation result = EnumNumberOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumNumberOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumStringOperation createEnumStringOperationFromString(EDataType eDataType, String initialValue) {
		EnumStringOperation result = EnumStringOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumStringOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFilterPackage getDslFilterPackage() {
		return (DslFilterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DslFilterPackage getPackage() {
		return DslFilterPackage.eINSTANCE;
	}

} //DslFilterFactoryImpl
