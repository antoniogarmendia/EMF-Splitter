/**
 */
package dataStructureContain.impl;

import dataStructureContain.DataStructureContainPackage;
import dataStructureContain.PackageUnit;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataStructureContain.impl.PackageUnitImpl#getAnEClass <em>An EClass</em>}</li>
 *   <li>{@link dataStructureContain.impl.PackageUnitImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link dataStructureContain.impl.PackageUnitImpl#isUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageUnitImpl extends MinimalEObjectImpl.Container implements PackageUnit {
	/**
	 * The cached value of the '{@link #getAnEClass() <em>An EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass anEClass;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> contains;

	/**
	 * The default value of the '{@link #isUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnit()
	 * @generated
	 * @ordered
	 */
	protected boolean unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataStructureContainPackage.Literals.PACKAGE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnEClass() {
		if (anEClass != null && anEClass.eIsProxy()) {
			InternalEObject oldAnEClass = (InternalEObject)anEClass;
			anEClass = (EClass)eResolveProxy(oldAnEClass);
			if (anEClass != oldAnEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataStructureContainPackage.PACKAGE_UNIT__AN_ECLASS, oldAnEClass, anEClass));
			}
		}
		return anEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetAnEClass() {
		return anEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnEClass(EClass newAnEClass) {
		EClass oldAnEClass = anEClass;
		anEClass = newAnEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataStructureContainPackage.PACKAGE_UNIT__AN_ECLASS, oldAnEClass, anEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getContains() {
		if (contains == null) {
			contains = new EObjectResolvingEList<EClass>(EClass.class, this, DataStructureContainPackage.PACKAGE_UNIT__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(boolean newUnit) {
		boolean oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataStructureContainPackage.PACKAGE_UNIT__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataStructureContainPackage.PACKAGE_UNIT__AN_ECLASS:
				if (resolve) return getAnEClass();
				return basicGetAnEClass();
			case DataStructureContainPackage.PACKAGE_UNIT__CONTAINS:
				return getContains();
			case DataStructureContainPackage.PACKAGE_UNIT__UNIT:
				return isUnit();
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
			case DataStructureContainPackage.PACKAGE_UNIT__AN_ECLASS:
				setAnEClass((EClass)newValue);
				return;
			case DataStructureContainPackage.PACKAGE_UNIT__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends EClass>)newValue);
				return;
			case DataStructureContainPackage.PACKAGE_UNIT__UNIT:
				setUnit((Boolean)newValue);
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
			case DataStructureContainPackage.PACKAGE_UNIT__AN_ECLASS:
				setAnEClass((EClass)null);
				return;
			case DataStructureContainPackage.PACKAGE_UNIT__CONTAINS:
				getContains().clear();
				return;
			case DataStructureContainPackage.PACKAGE_UNIT__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case DataStructureContainPackage.PACKAGE_UNIT__AN_ECLASS:
				return anEClass != null;
			case DataStructureContainPackage.PACKAGE_UNIT__CONTAINS:
				return contains != null && !contains.isEmpty();
			case DataStructureContainPackage.PACKAGE_UNIT__UNIT:
				return unit != UNIT_EDEFAULT;
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //PackageUnitImpl
