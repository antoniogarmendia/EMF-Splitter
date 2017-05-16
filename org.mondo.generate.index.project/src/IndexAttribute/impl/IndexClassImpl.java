/**
 */
package IndexAttribute.impl;

import IndexAttribute.IndexAttributePackage;
import IndexAttribute.IndexClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IndexAttribute.impl.IndexClassImpl#getIndexAttribute <em>Index Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexClassImpl extends MinimalEObjectImpl.Container implements IndexClass {
	/**
	 * The default value of the '{@link #getIndexAttribute() <em>Index Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final Object INDEX_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexAttribute() <em>Index Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexAttribute()
	 * @generated
	 * @ordered
	 */
	protected Object indexAttribute = INDEX_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IndexAttributePackage.Literals.INDEX_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIndexAttribute() {
		return indexAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexAttribute(Object newIndexAttribute) {
		Object oldIndexAttribute = indexAttribute;
		indexAttribute = newIndexAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndexAttributePackage.INDEX_CLASS__INDEX_ATTRIBUTE, oldIndexAttribute, indexAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IndexAttributePackage.INDEX_CLASS__INDEX_ATTRIBUTE:
				return getIndexAttribute();
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
			case IndexAttributePackage.INDEX_CLASS__INDEX_ATTRIBUTE:
				setIndexAttribute(newValue);
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
			case IndexAttributePackage.INDEX_CLASS__INDEX_ATTRIBUTE:
				setIndexAttribute(INDEX_ATTRIBUTE_EDEFAULT);
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
			case IndexAttributePackage.INDEX_CLASS__INDEX_ATTRIBUTE:
				return INDEX_ATTRIBUTE_EDEFAULT == null ? indexAttribute != null : !INDEX_ATTRIBUTE_EDEFAULT.equals(indexAttribute);
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
		result.append(" (indexAttribute: ");
		result.append(indexAttribute);
		result.append(')');
		return result.toString();
	}

} //IndexClassImpl
