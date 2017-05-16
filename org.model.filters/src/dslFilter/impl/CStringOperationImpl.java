/**
 */
package dslFilter.impl;

import dslFilter.CStringOperation;
import dslFilter.DslFilterPackage;
import dslFilter.EnumStringOperation;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CString Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dslFilter.impl.CStringOperationImpl#getAnExp <em>An Exp</em>}</li>
 *   <li>{@link dslFilter.impl.CStringOperationImpl#getAnStringOperation <em>An String Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CStringOperationImpl extends MinimalEObjectImpl.Container implements CStringOperation {
	/**
	 * The default value of the '{@link #getAnExp() <em>An Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnExp()
	 * @generated
	 * @ordered
	 */
	protected static final String AN_EXP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnExp() <em>An Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnExp()
	 * @generated
	 * @ordered
	 */
	protected String anExp = AN_EXP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnStringOperation() <em>An String Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnStringOperation()
	 * @generated
	 * @ordered
	 */
	protected static final EnumStringOperation AN_STRING_OPERATION_EDEFAULT = EnumStringOperation.CONTAINS;

	/**
	 * The cached value of the '{@link #getAnStringOperation() <em>An String Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnStringOperation()
	 * @generated
	 * @ordered
	 */
	protected EnumStringOperation anStringOperation = AN_STRING_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CStringOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslFilterPackage.Literals.CSTRING_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnExp() {
		return anExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnExp(String newAnExp) {
		String oldAnExp = anExp;
		anExp = newAnExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.CSTRING_OPERATION__AN_EXP, oldAnExp, anExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumStringOperation getAnStringOperation() {
		return anStringOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnStringOperation(EnumStringOperation newAnStringOperation) {
		EnumStringOperation oldAnStringOperation = anStringOperation;
		anStringOperation = newAnStringOperation == null ? AN_STRING_OPERATION_EDEFAULT : newAnStringOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.CSTRING_OPERATION__AN_STRING_OPERATION, oldAnStringOperation, anStringOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean SatifiesRule(Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		if(value == null && getAnExp().isEmpty())
			return true;
		else if(value == null) 
			return false;
		
		String str_value = value.toString();
		switch(anStringOperation){
			case CONTAINS:
				if(str_value.contains(getAnExp()))
					return true;				
				break;
			case ENDSWITH:
				if(str_value.endsWith(getAnExp()))
					return true;
				break;
			case STARTSWITH:
				if(str_value.startsWith(getAnExp()))
					return true;
				break;
			case REGULAREXPRESSION:
				if(str_value.matches(getAnExp()))
					return true;
				break;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslFilterPackage.CSTRING_OPERATION__AN_EXP:
				return getAnExp();
			case DslFilterPackage.CSTRING_OPERATION__AN_STRING_OPERATION:
				return getAnStringOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslFilterPackage.CSTRING_OPERATION__AN_EXP:
				setAnExp((String)newValue);
				return;
			case DslFilterPackage.CSTRING_OPERATION__AN_STRING_OPERATION:
				setAnStringOperation((EnumStringOperation)newValue);
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
			case DslFilterPackage.CSTRING_OPERATION__AN_EXP:
				setAnExp(AN_EXP_EDEFAULT);
				return;
			case DslFilterPackage.CSTRING_OPERATION__AN_STRING_OPERATION:
				setAnStringOperation(AN_STRING_OPERATION_EDEFAULT);
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
			case DslFilterPackage.CSTRING_OPERATION__AN_EXP:
				return AN_EXP_EDEFAULT == null ? anExp != null : !AN_EXP_EDEFAULT.equals(anExp);
			case DslFilterPackage.CSTRING_OPERATION__AN_STRING_OPERATION:
				return anStringOperation != AN_STRING_OPERATION_EDEFAULT;
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
			case DslFilterPackage.CSTRING_OPERATION___SATIFIES_RULE__OBJECT:
				return SatifiesRule(arguments.get(0));
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
		result.append(" (anExp: ");
		result.append(anExp);
		result.append(", anStringOperation: ");
		result.append(anStringOperation);
		result.append(')');
		return result.toString();
	}

} //CStringOperationImpl
