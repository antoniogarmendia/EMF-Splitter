/**
 */
package graphic_representation.impl;

import graphic_representation.AbstractElement;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.Node_Element;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.AbstractElementImpl#getAnEClass <em>An EClass</em>}</li>
 *   <li>{@link graphic_representation.impl.AbstractElementImpl#getNode_elements <em>Node elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractElementImpl extends AllElementsImpl implements AbstractElement {
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
	 * The cached value of the '{@link #getNode_elements() <em>Node elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_elements()
	 * @generated
	 * @ordered
	 */
	protected Node_Element node_elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.ABSTRACT_ELEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.ABSTRACT_ELEMENT__AN_ECLASS, oldAnEClass, anEClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ABSTRACT_ELEMENT__AN_ECLASS, oldAnEClass, anEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node_Element getNode_elements() {
		return node_elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode_elements(Node_Element newNode_elements, NotificationChain msgs) {
		Node_Element oldNode_elements = node_elements;
		node_elements = newNode_elements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ABSTRACT_ELEMENT__NODE_ELEMENTS, oldNode_elements, newNode_elements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode_elements(Node_Element newNode_elements) {
		if (newNode_elements != node_elements) {
			NotificationChain msgs = null;
			if (node_elements != null)
				msgs = ((InternalEObject)node_elements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.ABSTRACT_ELEMENT__NODE_ELEMENTS, null, msgs);
			if (newNode_elements != null)
				msgs = ((InternalEObject)newNode_elements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.ABSTRACT_ELEMENT__NODE_ELEMENTS, null, msgs);
			msgs = basicSetNode_elements(newNode_elements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ABSTRACT_ELEMENT__NODE_ELEMENTS, newNode_elements, newNode_elements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.ABSTRACT_ELEMENT__NODE_ELEMENTS:
				return basicSetNode_elements(null, msgs);
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
			case Graphic_representationPackage.ABSTRACT_ELEMENT__AN_ECLASS:
				if (resolve) return getAnEClass();
				return basicGetAnEClass();
			case Graphic_representationPackage.ABSTRACT_ELEMENT__NODE_ELEMENTS:
				return getNode_elements();
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
			case Graphic_representationPackage.ABSTRACT_ELEMENT__AN_ECLASS:
				setAnEClass((EClass)newValue);
				return;
			case Graphic_representationPackage.ABSTRACT_ELEMENT__NODE_ELEMENTS:
				setNode_elements((Node_Element)newValue);
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
			case Graphic_representationPackage.ABSTRACT_ELEMENT__AN_ECLASS:
				setAnEClass((EClass)null);
				return;
			case Graphic_representationPackage.ABSTRACT_ELEMENT__NODE_ELEMENTS:
				setNode_elements((Node_Element)null);
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
			case Graphic_representationPackage.ABSTRACT_ELEMENT__AN_ECLASS:
				return anEClass != null;
			case Graphic_representationPackage.ABSTRACT_ELEMENT__NODE_ELEMENTS:
				return node_elements != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractElementImpl
