/**
 */
package dslFilter.impl;

import dslFilter.BasicCLogicOperation;
import dslFilter.DslFilterPackage;
import dslFilter.EnumLogicOperation;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic CLogic Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dslFilter.impl.BasicCLogicOperationImpl#getAnEnumLogicOperation <em>An Enum Logic Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicCLogicOperationImpl extends MinimalEObjectImpl.Container implements BasicCLogicOperation {
	/**
	 * The cached value of the '{@link #getAnEnumLogicOperation() <em>An Enum Logic Operation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnEnumLogicOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumLogicOperation> anEnumLogicOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BasicCLogicOperationImpl() {
		super();
		anEnumLogicOperation = new BasicEList<EnumLogicOperation>(EnumLogicOperation.VALUES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslFilterPackage.Literals.BASIC_CLOGIC_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumLogicOperation> getAnEnumLogicOperation() {
		if (anEnumLogicOperation == null) {
			anEnumLogicOperation = new EDataTypeUniqueEList<EnumLogicOperation>(EnumLogicOperation.class, this, DslFilterPackage.BASIC_CLOGIC_OPERATION__AN_ENUM_LOGIC_OPERATION);
		}
		return anEnumLogicOperation;
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
		EList<String> list_enum = new BasicEList<String>(anEnumLogicOperation.size());
		for (int i = 0; i < anEnumLogicOperation.size(); i++) {
			list_enum.add(anEnumLogicOperation.get(i).getLiteral());
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
			case DslFilterPackage.BASIC_CLOGIC_OPERATION__AN_ENUM_LOGIC_OPERATION:
				return getAnEnumLogicOperation();
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
			case DslFilterPackage.BASIC_CLOGIC_OPERATION__AN_ENUM_LOGIC_OPERATION:
				getAnEnumLogicOperation().clear();
				getAnEnumLogicOperation().addAll((Collection<? extends EnumLogicOperation>)newValue);
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
			case DslFilterPackage.BASIC_CLOGIC_OPERATION__AN_ENUM_LOGIC_OPERATION:
				getAnEnumLogicOperation().clear();
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
			case DslFilterPackage.BASIC_CLOGIC_OPERATION__AN_ENUM_LOGIC_OPERATION:
				return anEnumLogicOperation != null && !anEnumLogicOperation.isEmpty();
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
			case DslFilterPackage.BASIC_CLOGIC_OPERATION___ENUM_TO_STRING_ARRAY:
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
		result.append(" (anEnumLogicOperation: ");
		result.append(anEnumLogicOperation);
		result.append(')');
		return result.toString();
	}

} //BasicCLogicOperationImpl
