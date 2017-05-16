/**
 */
package dslFilter.impl;

import dslFilter.BasicCStringOperation;
import dslFilter.DslFilterPackage;
import dslFilter.EnumStringOperation;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic CString Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dslFilter.impl.BasicCStringOperationImpl#getAnEnumStringOperation <em>An Enum String Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicCStringOperationImpl extends MinimalEObjectImpl.Container implements BasicCStringOperation {
	/**
	 * The cached value of the '{@link #getAnEnumStringOperation() <em>An Enum String Operation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnEnumStringOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumStringOperation> anEnumStringOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BasicCStringOperationImpl() {
		super();
		anEnumStringOperation = new BasicEList<EnumStringOperation>(EnumStringOperation.VALUES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslFilterPackage.Literals.BASIC_CSTRING_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumStringOperation> getAnEnumStringOperation() {
		if (anEnumStringOperation == null) {
			anEnumStringOperation = new EDataTypeUniqueEList<EnumStringOperation>(EnumStringOperation.class, this, DslFilterPackage.BASIC_CSTRING_OPERATION__AN_ENUM_STRING_OPERATION);
		}
		return anEnumStringOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> EnumToStringArray() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		EList<String> list_enum = new BasicEList<String>(anEnumStringOperation.size());
		for (int i = 0; i < anEnumStringOperation.size(); i++) {
			list_enum.add(anEnumStringOperation.get(i).getLiteral());
		}
		return list_enum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslFilterPackage.BASIC_CSTRING_OPERATION__AN_ENUM_STRING_OPERATION:
				return getAnEnumStringOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslFilterPackage.BASIC_CSTRING_OPERATION__AN_ENUM_STRING_OPERATION:
				getAnEnumStringOperation().clear();
				getAnEnumStringOperation().addAll((Collection<? extends EnumStringOperation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DslFilterPackage.BASIC_CSTRING_OPERATION__AN_ENUM_STRING_OPERATION:
				getAnEnumStringOperation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DslFilterPackage.BASIC_CSTRING_OPERATION__AN_ENUM_STRING_OPERATION:
				return anEnumStringOperation != null && !anEnumStringOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DslFilterPackage.BASIC_CSTRING_OPERATION___ENUM_TO_STRING_ARRAY:
				return EnumToStringArray();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (anEnumStringOperation: ");
		result.append(anEnumStringOperation);
		result.append(')');
		return result.toString();
	}

} //BasicCStringOperationImpl
