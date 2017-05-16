/**
 */
package mobile_server.impl;

import java.util.Collection;

import mobile_server.EcoreMD;
import mobile_server.JSONMobile;
import mobile_server.Mobile_serverPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSON Mobile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mobile_server.impl.JSONMobileImpl#getListEcores <em>List Ecores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JSONMobileImpl extends MinimalEObjectImpl.Container implements JSONMobile {
	/**
	 * The cached value of the '{@link #getListEcores() <em>List Ecores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListEcores()
	 * @generated
	 * @ordered
	 */
	protected EList<EcoreMD> listEcores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JSONMobileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mobile_serverPackage.Literals.JSON_MOBILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EcoreMD> getListEcores() {
		if (listEcores == null) {
			listEcores = new EObjectContainmentEList<EcoreMD>(EcoreMD.class, this, Mobile_serverPackage.JSON_MOBILE__LIST_ECORES);
		}
		return listEcores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mobile_serverPackage.JSON_MOBILE__LIST_ECORES:
				return ((InternalEList<?>)getListEcores()).basicRemove(otherEnd, msgs);
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
			case Mobile_serverPackage.JSON_MOBILE__LIST_ECORES:
				return getListEcores();
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
			case Mobile_serverPackage.JSON_MOBILE__LIST_ECORES:
				getListEcores().clear();
				getListEcores().addAll((Collection<? extends EcoreMD>)newValue);
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
			case Mobile_serverPackage.JSON_MOBILE__LIST_ECORES:
				getListEcores().clear();
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
			case Mobile_serverPackage.JSON_MOBILE__LIST_ECORES:
				return listEcores != null && !listEcores.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JSONMobileImpl
