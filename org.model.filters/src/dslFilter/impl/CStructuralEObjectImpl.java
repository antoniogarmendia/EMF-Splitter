/**
 */
package dslFilter.impl;

import dslFilter.CStructuralEObject;
import dslFilter.DslFilterPackage;
import dslFilter.EnumNumberOperation;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CStructural EObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dslFilter.impl.CStructuralEObjectImpl#getAnExp <em>An Exp</em>}</li>
 *   <li>{@link dslFilter.impl.CStructuralEObjectImpl#getAnNumberOperation <em>An Number Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CStructuralEObjectImpl extends MinimalEObjectImpl.Container implements CStructuralEObject {
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
	 * The default value of the '{@link #getAnNumberOperation() <em>An Number Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnNumberOperation()
	 * @generated
	 * @ordered
	 */
	protected static final EnumNumberOperation AN_NUMBER_OPERATION_EDEFAULT = EnumNumberOperation.EQUALTO;
	/**
	 * The cached value of the '{@link #getAnNumberOperation() <em>An Number Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnNumberOperation()
	 * @generated
	 * @ordered
	 */
	protected EnumNumberOperation anNumberOperation = AN_NUMBER_OPERATION_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CStructuralEObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslFilterPackage.Literals.CSTRUCTURAL_EOBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.CSTRUCTURAL_EOBJECT__AN_EXP, oldAnExp, anExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumNumberOperation getAnNumberOperation() {
		return anNumberOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnNumberOperation(EnumNumberOperation newAnNumberOperation) {
		EnumNumberOperation oldAnNumberOperation = anNumberOperation;
		anNumberOperation = newAnNumberOperation == null ? AN_NUMBER_OPERATION_EDEFAULT : newAnNumberOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.CSTRUCTURAL_EOBJECT__AN_NUMBER_OPERATION, oldAnNumberOperation, anNumberOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean SatifiesRule(Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		int size = -1;
		if(value instanceof List){
			size = ((List<?>)value).size();			
		}
		if(size!=-1)
		{
			int int_exp = Integer.parseInt(getAnExp());
			switch (anNumberOperation) {
			case EQUALTO:
				if(size==int_exp)
					return true;
				break;			
			case NOTEQUALTO:
				if(size!=int_exp)
					return true;
				break;
			case LESSTHAN:
				if(size<int_exp)
					return true;
				break;
			case GREATERTHAN:
				if(size>int_exp)
					return true;
				break;
			case LESSTHANOREQUALTO:
				if(size<=int_exp)
					return true;
				break;
			case GREATERTHANOREQUALTO:
				if(size>=int_exp)
					return true;
				break;
			}			
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
			case DslFilterPackage.CSTRUCTURAL_EOBJECT__AN_EXP:
				return getAnExp();
			case DslFilterPackage.CSTRUCTURAL_EOBJECT__AN_NUMBER_OPERATION:
				return getAnNumberOperation();
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
			case DslFilterPackage.CSTRUCTURAL_EOBJECT__AN_EXP:
				setAnExp((String)newValue);
				return;
			case DslFilterPackage.CSTRUCTURAL_EOBJECT__AN_NUMBER_OPERATION:
				setAnNumberOperation((EnumNumberOperation)newValue);
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
			case DslFilterPackage.CSTRUCTURAL_EOBJECT__AN_EXP:
				setAnExp(AN_EXP_EDEFAULT);
				return;
			case DslFilterPackage.CSTRUCTURAL_EOBJECT__AN_NUMBER_OPERATION:
				setAnNumberOperation(AN_NUMBER_OPERATION_EDEFAULT);
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
			case DslFilterPackage.CSTRUCTURAL_EOBJECT__AN_EXP:
				return AN_EXP_EDEFAULT == null ? anExp != null : !AN_EXP_EDEFAULT.equals(anExp);
			case DslFilterPackage.CSTRUCTURAL_EOBJECT__AN_NUMBER_OPERATION:
				return anNumberOperation != AN_NUMBER_OPERATION_EDEFAULT;
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
			case DslFilterPackage.CSTRUCTURAL_EOBJECT___SATIFIES_RULE__OBJECT:
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
		result.append(", anNumberOperation: ");
		result.append(anNumberOperation);
		result.append(')');
		return result.toString();
	}

} //CStructuralEObjectImpl
