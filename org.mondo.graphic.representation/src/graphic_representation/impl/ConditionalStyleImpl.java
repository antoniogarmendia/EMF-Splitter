/**
 */
package graphic_representation.impl;

import graphic_representation.ConditionalStyle;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.Shape;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.ConditionalStyleImpl#getEAttribute <em>EAttribute</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalStyleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalStyleImpl#getConditionalStyle <em>Conditional Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalStyleImpl extends MinimalEObjectImpl.Container implements ConditionalStyle {
	/**
	 * The cached value of the '{@link #getEAttribute() <em>EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute eAttribute;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionalStyle() <em>Conditional Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalStyle()
	 * @generated
	 * @ordered
	 */
	protected Shape conditionalStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.CONDITIONAL_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttribute() {
		if (eAttribute != null && eAttribute.eIsProxy()) {
			InternalEObject oldEAttribute = (InternalEObject)eAttribute;
			eAttribute = (EAttribute)eResolveProxy(oldEAttribute);
			if (eAttribute != oldEAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.CONDITIONAL_STYLE__EATTRIBUTE, oldEAttribute, eAttribute));
			}
		}
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetEAttribute() {
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute(EAttribute newEAttribute) {
		EAttribute oldEAttribute = eAttribute;
		eAttribute = newEAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_STYLE__EATTRIBUTE, oldEAttribute, eAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_STYLE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getConditionalStyle() {
		return conditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalStyle(Shape newConditionalStyle, NotificationChain msgs) {
		Shape oldConditionalStyle = conditionalStyle;
		conditionalStyle = newConditionalStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_STYLE__CONDITIONAL_STYLE, oldConditionalStyle, newConditionalStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalStyle(Shape newConditionalStyle) {
		if (newConditionalStyle != conditionalStyle) {
			NotificationChain msgs = null;
			if (conditionalStyle != null)
				msgs = ((InternalEObject)conditionalStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_STYLE__CONDITIONAL_STYLE, null, msgs);
			if (newConditionalStyle != null)
				msgs = ((InternalEObject)newConditionalStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_STYLE__CONDITIONAL_STYLE, null, msgs);
			msgs = basicSetConditionalStyle(newConditionalStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_STYLE__CONDITIONAL_STYLE, newConditionalStyle, newConditionalStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.CONDITIONAL_STYLE__CONDITIONAL_STYLE:
				return basicSetConditionalStyle(null, msgs);
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
			case Graphic_representationPackage.CONDITIONAL_STYLE__EATTRIBUTE:
				if (resolve) return getEAttribute();
				return basicGetEAttribute();
			case Graphic_representationPackage.CONDITIONAL_STYLE__VALUE:
				return getValue();
			case Graphic_representationPackage.CONDITIONAL_STYLE__CONDITIONAL_STYLE:
				return getConditionalStyle();
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
			case Graphic_representationPackage.CONDITIONAL_STYLE__EATTRIBUTE:
				setEAttribute((EAttribute)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_STYLE__VALUE:
				setValue((String)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_STYLE__CONDITIONAL_STYLE:
				setConditionalStyle((Shape)newValue);
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
			case Graphic_representationPackage.CONDITIONAL_STYLE__EATTRIBUTE:
				setEAttribute((EAttribute)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_STYLE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Graphic_representationPackage.CONDITIONAL_STYLE__CONDITIONAL_STYLE:
				setConditionalStyle((Shape)null);
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
			case Graphic_representationPackage.CONDITIONAL_STYLE__EATTRIBUTE:
				return eAttribute != null;
			case Graphic_representationPackage.CONDITIONAL_STYLE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Graphic_representationPackage.CONDITIONAL_STYLE__CONDITIONAL_STYLE:
				return conditionalStyle != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ConditionalStyleImpl
