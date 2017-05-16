/**
 */
package Filter.impl;

import Filter.FilterPackage;
import Filter.Filterable;
import Filter.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filterable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Filter.impl.FilterableImpl#getAKey <em>AKey</em>}</li>
 *   <li>{@link Filter.impl.FilterableImpl#getRKey <em>RKey</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterableImpl extends MinimalEObjectImpl.Container implements Filterable {
	/**
	 * The default value of the '{@link #getAKey() <em>AKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAKey()
	 * @generated
	 * @ordered
	 */
	protected static final Object AKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAKey() <em>AKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAKey()
	 * @generated
	 * @ordered
	 */
	protected Object aKey = AKEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRKey() <em>RKey</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRKey()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> rKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilterPackage.Literals.FILTERABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAKey() {
		return aKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAKey(Object newAKey) {
		Object oldAKey = aKey;
		aKey = newAKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilterPackage.FILTERABLE__AKEY, oldAKey, aKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getRKey() {
		if (rKey == null) {
			rKey = new EObjectContainmentEList<Node>(Node.class, this, FilterPackage.FILTERABLE__RKEY);
		}
		return rKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilterPackage.FILTERABLE__RKEY:
				return ((InternalEList<?>)getRKey()).basicRemove(otherEnd, msgs);
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
			case FilterPackage.FILTERABLE__AKEY:
				return getAKey();
			case FilterPackage.FILTERABLE__RKEY:
				return getRKey();
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
			case FilterPackage.FILTERABLE__AKEY:
				setAKey(newValue);
				return;
			case FilterPackage.FILTERABLE__RKEY:
				getRKey().clear();
				getRKey().addAll((Collection<? extends Node>)newValue);
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
			case FilterPackage.FILTERABLE__AKEY:
				setAKey(AKEY_EDEFAULT);
				return;
			case FilterPackage.FILTERABLE__RKEY:
				getRKey().clear();
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
			case FilterPackage.FILTERABLE__AKEY:
				return AKEY_EDEFAULT == null ? aKey != null : !AKEY_EDEFAULT.equals(aKey);
			case FilterPackage.FILTERABLE__RKEY:
				return rKey != null && !rKey.isEmpty();
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
		result.append(" (aKey: ");
		result.append(aKey);
		result.append(')');
		return result.toString();
	}

} //FilterableImpl
