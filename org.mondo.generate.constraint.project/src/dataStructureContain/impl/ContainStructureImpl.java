/**
 */
package dataStructureContain.impl;

import dataStructureContain.ContainStructure;
import dataStructureContain.DataStructureContainPackage;
import dataStructureContain.PackageUnit;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contain Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataStructureContain.impl.ContainStructureImpl#getPackagesUnits <em>Packages Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainStructureImpl extends MinimalEObjectImpl.Container implements ContainStructure {
	/**
	 * The cached value of the '{@link #getPackagesUnits() <em>Packages Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagesUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageUnit> packagesUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataStructureContainPackage.Literals.CONTAIN_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageUnit> getPackagesUnits() {
		if (packagesUnits == null) {
			packagesUnits = new EObjectContainmentEList<PackageUnit>(PackageUnit.class, this, DataStructureContainPackage.CONTAIN_STRUCTURE__PACKAGES_UNITS);
		}
		return packagesUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataStructureContainPackage.CONTAIN_STRUCTURE__PACKAGES_UNITS:
				return ((InternalEList<?>)getPackagesUnits()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataStructureContainPackage.CONTAIN_STRUCTURE__PACKAGES_UNITS:
				return getPackagesUnits();
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
			case DataStructureContainPackage.CONTAIN_STRUCTURE__PACKAGES_UNITS:
				getPackagesUnits().clear();
				getPackagesUnits().addAll((Collection<? extends PackageUnit>)newValue);
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
			case DataStructureContainPackage.CONTAIN_STRUCTURE__PACKAGES_UNITS:
				getPackagesUnits().clear();
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
			case DataStructureContainPackage.CONTAIN_STRUCTURE__PACKAGES_UNITS:
				return packagesUnits != null && !packagesUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainStructureImpl
