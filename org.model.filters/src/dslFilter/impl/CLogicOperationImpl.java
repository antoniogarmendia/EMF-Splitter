/**
 */
package dslFilter.impl;

import dslFilter.CLogicOperation;
import dslFilter.DslFilterPackage;
import dslFilter.EnumLogicOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLogic Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dslFilter.impl.CLogicOperationImpl#getAnLogicOperation <em>An Logic Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CLogicOperationImpl extends MinimalEObjectImpl.Container implements CLogicOperation {
	/**
	 * The default value of the '{@link #getAnLogicOperation() <em>An Logic Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnLogicOperation()
	 * @generated
	 * @ordered
	 */
	protected static final EnumLogicOperation AN_LOGIC_OPERATION_EDEFAULT = EnumLogicOperation.AND;

	/**
	 * The cached value of the '{@link #getAnLogicOperation() <em>An Logic Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnLogicOperation()
	 * @generated
	 * @ordered
	 */
	protected EnumLogicOperation anLogicOperation = AN_LOGIC_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLogicOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslFilterPackage.Literals.CLOGIC_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLogicOperation getAnLogicOperation() {
		return anLogicOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnLogicOperation(EnumLogicOperation newAnLogicOperation) {
		EnumLogicOperation oldAnLogicOperation = anLogicOperation;
		anLogicOperation = newAnLogicOperation == null ? AN_LOGIC_OPERATION_EDEFAULT : newAnLogicOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.CLOGIC_OPERATION__AN_LOGIC_OPERATION, oldAnLogicOperation, anLogicOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslFilterPackage.CLOGIC_OPERATION__AN_LOGIC_OPERATION:
				return getAnLogicOperation();
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
			case DslFilterPackage.CLOGIC_OPERATION__AN_LOGIC_OPERATION:
				setAnLogicOperation((EnumLogicOperation)newValue);
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
			case DslFilterPackage.CLOGIC_OPERATION__AN_LOGIC_OPERATION:
				setAnLogicOperation(AN_LOGIC_OPERATION_EDEFAULT);
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
			case DslFilterPackage.CLOGIC_OPERATION__AN_LOGIC_OPERATION:
				return anLogicOperation != AN_LOGIC_OPERATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (anLogicOperation: ");
		result.append(anLogicOperation);
		result.append(')');
		return result.toString();
	}

} //CLogicOperationImpl
