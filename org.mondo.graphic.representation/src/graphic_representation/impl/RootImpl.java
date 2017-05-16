/**
 */
package graphic_representation.impl;

import graphic_representation.Graphic_representationPackage;
import graphic_representation.Layer;
import graphic_representation.Node_Element;
import graphic_representation.Root;

import graphic_representation.Shape;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.RootImpl#getAnEClass <em>An EClass</em>}</li>
 *   <li>{@link graphic_representation.impl.RootImpl#getRoot_node_elements <em>Root node elements</em>}</li>
 *   <li>{@link graphic_representation.impl.RootImpl#getRoot_shape <em>Root shape</em>}</li>
 *   <li>{@link graphic_representation.impl.RootImpl#getRootLayer <em>Root Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
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
	 * The cached value of the '{@link #getRoot_node_elements() <em>Root node elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot_node_elements()
	 * @generated
	 * @ordered
	 */
	protected Node_Element root_node_elements;
	/**
	 * The cached value of the '{@link #getRoot_shape() <em>Root shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot_shape()
	 * @generated
	 * @ordered
	 */
	protected Shape root_shape;

	/**
	 * The cached value of the '{@link #getRootLayer() <em>Root Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootLayer()
	 * @generated
	 * @ordered
	 */
	protected Layer rootLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.ROOT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.ROOT__AN_ECLASS, oldAnEClass, anEClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ROOT__AN_ECLASS, oldAnEClass, anEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node_Element getRoot_node_elements() {
		return root_node_elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot_node_elements(Node_Element newRoot_node_elements, NotificationChain msgs) {
		Node_Element oldRoot_node_elements = root_node_elements;
		root_node_elements = newRoot_node_elements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ROOT__ROOT_NODE_ELEMENTS, oldRoot_node_elements, newRoot_node_elements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot_node_elements(Node_Element newRoot_node_elements) {
		if (newRoot_node_elements != root_node_elements) {
			NotificationChain msgs = null;
			if (root_node_elements != null)
				msgs = ((InternalEObject)root_node_elements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.ROOT__ROOT_NODE_ELEMENTS, null, msgs);
			if (newRoot_node_elements != null)
				msgs = ((InternalEObject)newRoot_node_elements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.ROOT__ROOT_NODE_ELEMENTS, null, msgs);
			msgs = basicSetRoot_node_elements(newRoot_node_elements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ROOT__ROOT_NODE_ELEMENTS, newRoot_node_elements, newRoot_node_elements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getRoot_shape() {
		return root_shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot_shape(Shape newRoot_shape, NotificationChain msgs) {
		Shape oldRoot_shape = root_shape;
		root_shape = newRoot_shape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ROOT__ROOT_SHAPE, oldRoot_shape, newRoot_shape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot_shape(Shape newRoot_shape) {
		if (newRoot_shape != root_shape) {
			NotificationChain msgs = null;
			if (root_shape != null)
				msgs = ((InternalEObject)root_shape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.ROOT__ROOT_SHAPE, null, msgs);
			if (newRoot_shape != null)
				msgs = ((InternalEObject)newRoot_shape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.ROOT__ROOT_SHAPE, null, msgs);
			msgs = basicSetRoot_shape(newRoot_shape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ROOT__ROOT_SHAPE, newRoot_shape, newRoot_shape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer getRootLayer() {
		if (rootLayer != null && rootLayer.eIsProxy()) {
			InternalEObject oldRootLayer = (InternalEObject)rootLayer;
			rootLayer = (Layer)eResolveProxy(oldRootLayer);
			if (rootLayer != oldRootLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.ROOT__ROOT_LAYER, oldRootLayer, rootLayer));
			}
		}
		return rootLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer basicGetRootLayer() {
		return rootLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootLayer(Layer newRootLayer) {
		Layer oldRootLayer = rootLayer;
		rootLayer = newRootLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ROOT__ROOT_LAYER, oldRootLayer, rootLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.ROOT__ROOT_NODE_ELEMENTS:
				return basicSetRoot_node_elements(null, msgs);
			case Graphic_representationPackage.ROOT__ROOT_SHAPE:
				return basicSetRoot_shape(null, msgs);
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
			case Graphic_representationPackage.ROOT__AN_ECLASS:
				if (resolve) return getAnEClass();
				return basicGetAnEClass();
			case Graphic_representationPackage.ROOT__ROOT_NODE_ELEMENTS:
				return getRoot_node_elements();
			case Graphic_representationPackage.ROOT__ROOT_SHAPE:
				return getRoot_shape();
			case Graphic_representationPackage.ROOT__ROOT_LAYER:
				if (resolve) return getRootLayer();
				return basicGetRootLayer();
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
			case Graphic_representationPackage.ROOT__AN_ECLASS:
				setAnEClass((EClass)newValue);
				return;
			case Graphic_representationPackage.ROOT__ROOT_NODE_ELEMENTS:
				setRoot_node_elements((Node_Element)newValue);
				return;
			case Graphic_representationPackage.ROOT__ROOT_SHAPE:
				setRoot_shape((Shape)newValue);
				return;
			case Graphic_representationPackage.ROOT__ROOT_LAYER:
				setRootLayer((Layer)newValue);
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
			case Graphic_representationPackage.ROOT__AN_ECLASS:
				setAnEClass((EClass)null);
				return;
			case Graphic_representationPackage.ROOT__ROOT_NODE_ELEMENTS:
				setRoot_node_elements((Node_Element)null);
				return;
			case Graphic_representationPackage.ROOT__ROOT_SHAPE:
				setRoot_shape((Shape)null);
				return;
			case Graphic_representationPackage.ROOT__ROOT_LAYER:
				setRootLayer((Layer)null);
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
			case Graphic_representationPackage.ROOT__AN_ECLASS:
				return anEClass != null;
			case Graphic_representationPackage.ROOT__ROOT_NODE_ELEMENTS:
				return root_node_elements != null;
			case Graphic_representationPackage.ROOT__ROOT_SHAPE:
				return root_shape != null;
			case Graphic_representationPackage.ROOT__ROOT_LAYER:
				return rootLayer != null;
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
