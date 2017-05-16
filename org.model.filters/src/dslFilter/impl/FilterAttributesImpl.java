/**
 */
package dslFilter.impl;

import dslFilter.CLogicOperation;
import dslFilter.DslFilterPackage;
import dslFilter.FilterAttributes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dslFilter.impl.FilterAttributesImpl#getName <em>Name</em>}</li>
 *   <li>{@link dslFilter.impl.FilterAttributesImpl#getAnLogicOperation <em>An Logic Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FilterAttributesImpl extends MinimalEObjectImpl.Container implements FilterAttributes {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Filters";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnLogicOperation() <em>An Logic Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnLogicOperation()
	 * @generated
	 * @ordered
	 */
	protected CLogicOperation anLogicOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslFilterPackage.Literals.FILTER_ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.FILTER_ATTRIBUTES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLogicOperation getAnLogicOperation() {
		if (anLogicOperation != null && anLogicOperation.eIsProxy()) {
			InternalEObject oldAnLogicOperation = (InternalEObject)anLogicOperation;
			anLogicOperation = (CLogicOperation)eResolveProxy(oldAnLogicOperation);
			if (anLogicOperation != oldAnLogicOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslFilterPackage.FILTER_ATTRIBUTES__AN_LOGIC_OPERATION, oldAnLogicOperation, anLogicOperation));
			}
		}
		return anLogicOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLogicOperation basicGetAnLogicOperation() {
		return anLogicOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnLogicOperation(CLogicOperation newAnLogicOperation) {
		CLogicOperation oldAnLogicOperation = anLogicOperation;
		anLogicOperation = newAnLogicOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslFilterPackage.FILTER_ATTRIBUTES__AN_LOGIC_OPERATION, oldAnLogicOperation, anLogicOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslFilterPackage.FILTER_ATTRIBUTES__NAME:
				return getName();
			case DslFilterPackage.FILTER_ATTRIBUTES__AN_LOGIC_OPERATION:
				if (resolve) return getAnLogicOperation();
				return basicGetAnLogicOperation();
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
			case DslFilterPackage.FILTER_ATTRIBUTES__NAME:
				setName((String)newValue);
				return;
			case DslFilterPackage.FILTER_ATTRIBUTES__AN_LOGIC_OPERATION:
				setAnLogicOperation((CLogicOperation)newValue);
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
			case DslFilterPackage.FILTER_ATTRIBUTES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslFilterPackage.FILTER_ATTRIBUTES__AN_LOGIC_OPERATION:
				setAnLogicOperation((CLogicOperation)null);
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
			case DslFilterPackage.FILTER_ATTRIBUTES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslFilterPackage.FILTER_ATTRIBUTES__AN_LOGIC_OPERATION:
				return anLogicOperation != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FilterAttributesImpl
