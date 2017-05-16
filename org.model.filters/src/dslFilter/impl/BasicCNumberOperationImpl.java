/**
 */
package dslFilter.impl;

import dslFilter.BasicCNumberOperation;
import dslFilter.DslFilterPackage;
import dslFilter.EnumNumberOperation;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic CNumber Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dslFilter.impl.BasicCNumberOperationImpl#getAnEnumNumberOperation <em>An Enum Number Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicCNumberOperationImpl extends MinimalEObjectImpl.Container implements BasicCNumberOperation {
	/**
	 * The cached value of the '{@link #getAnEnumNumberOperation() <em>An Enum Number Operation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnEnumNumberOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumNumberOperation> anEnumNumberOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BasicCNumberOperationImpl() {
		super();
		anEnumNumberOperation = new BasicEList<>(EnumNumberOperation.VALUES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslFilterPackage.Literals.BASIC_CNUMBER_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumNumberOperation> getAnEnumNumberOperation() {
		if (anEnumNumberOperation == null) {
			anEnumNumberOperation = new EDataTypeUniqueEList<EnumNumberOperation>(EnumNumberOperation.class, this, DslFilterPackage.BASIC_CNUMBER_OPERATION__AN_ENUM_NUMBER_OPERATION);
		}
		return anEnumNumberOperation;
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
		EList<String> list_enum = new BasicEList<String>(anEnumNumberOperation.size());
		for (int i = 0; i < anEnumNumberOperation.size(); i++) {
			list_enum.add(anEnumNumberOperation.get(i).getLiteral());
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
			case DslFilterPackage.BASIC_CNUMBER_OPERATION__AN_ENUM_NUMBER_OPERATION:
				return getAnEnumNumberOperation();
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
			case DslFilterPackage.BASIC_CNUMBER_OPERATION__AN_ENUM_NUMBER_OPERATION:
				getAnEnumNumberOperation().clear();
				getAnEnumNumberOperation().addAll((Collection<? extends EnumNumberOperation>)newValue);
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
			case DslFilterPackage.BASIC_CNUMBER_OPERATION__AN_ENUM_NUMBER_OPERATION:
				getAnEnumNumberOperation().clear();
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
			case DslFilterPackage.BASIC_CNUMBER_OPERATION__AN_ENUM_NUMBER_OPERATION:
				return anEnumNumberOperation != null && !anEnumNumberOperation.isEmpty();
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
			case DslFilterPackage.BASIC_CNUMBER_OPERATION___ENUM_TO_STRING_ARRAY:
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
		result.append(" (anEnumNumberOperation: ");
		result.append(anEnumNumberOperation);
		result.append(')');
		return result.toString();
	}

} //BasicCNumberOperationImpl
