/**
 */
package graphic_representation.impl;

import graphic_representation.EdgeLabelEAttribute;
import graphic_representation.Graphic_representationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Label EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.EdgeLabelEAttributeImpl#getLabelEAttribute <em>Label EAttribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeLabelEAttributeImpl extends MinimalEObjectImpl.Container implements EdgeLabelEAttribute {
	/**
	 * The cached value of the '{@link #getLabelEAttribute() <em>Label EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelEAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute labelEAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeLabelEAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.EDGE_LABEL_EATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelEAttribute() {
		if (labelEAttribute != null && labelEAttribute.eIsProxy()) {
			InternalEObject oldLabelEAttribute = (InternalEObject)labelEAttribute;
			labelEAttribute = (EAttribute)eResolveProxy(oldLabelEAttribute);
			if (labelEAttribute != oldLabelEAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.EDGE_LABEL_EATTRIBUTE__LABEL_EATTRIBUTE, oldLabelEAttribute, labelEAttribute));
			}
		}
		return labelEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetLabelEAttribute() {
		return labelEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelEAttribute(EAttribute newLabelEAttribute) {
		EAttribute oldLabelEAttribute = labelEAttribute;
		labelEAttribute = newLabelEAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.EDGE_LABEL_EATTRIBUTE__LABEL_EATTRIBUTE, oldLabelEAttribute, labelEAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Graphic_representationPackage.EDGE_LABEL_EATTRIBUTE__LABEL_EATTRIBUTE:
				if (resolve) return getLabelEAttribute();
				return basicGetLabelEAttribute();
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
			case Graphic_representationPackage.EDGE_LABEL_EATTRIBUTE__LABEL_EATTRIBUTE:
				setLabelEAttribute((EAttribute)newValue);
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
			case Graphic_representationPackage.EDGE_LABEL_EATTRIBUTE__LABEL_EATTRIBUTE:
				setLabelEAttribute((EAttribute)null);
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
			case Graphic_representationPackage.EDGE_LABEL_EATTRIBUTE__LABEL_EATTRIBUTE:
				return labelEAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //EdgeLabelEAttributeImpl
