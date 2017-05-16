/**
 */
package graphic_representation.impl;

import graphic_representation.ChildrenPresentation;
import graphic_representation.ConditionalStyle;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.Node;
import graphic_representation.Node_Element;
import graphic_representation.Shape;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.NodeImpl#getNode_elements <em>Node elements</em>}</li>
 *   <li>{@link graphic_representation.impl.NodeImpl#getNode_shape <em>Node shape</em>}</li>
 *   <li>{@link graphic_representation.impl.NodeImpl#isExpandable <em>Expandable</em>}</li>
 *   <li>{@link graphic_representation.impl.NodeImpl#getConditionalStyle <em>Conditional Style</em>}</li>
 *   <li>{@link graphic_representation.impl.NodeImpl#getPresentation <em>Presentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends DiagramElementImpl implements Node {
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
	 * The cached value of the '{@link #getNode_shape() <em>Node shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_shape()
	 * @generated
	 * @ordered
	 */
	protected Shape node_shape;

	/**
	 * The default value of the '{@link #isExpandable() <em>Expandable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpandable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPANDABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExpandable() <em>Expandable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpandable()
	 * @generated
	 * @ordered
	 */
	protected boolean expandable = EXPANDABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionalStyle() <em>Conditional Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalStyle> conditionalStyle;

	/**
	 * The default value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected static final ChildrenPresentation PRESENTATION_EDEFAULT = ChildrenPresentation.FREEFORM;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected ChildrenPresentation presentation = PRESENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.NODE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.NODE__NODE_ELEMENTS, oldNode_elements, newNode_elements);
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
				msgs = ((InternalEObject)node_elements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.NODE__NODE_ELEMENTS, null, msgs);
			if (newNode_elements != null)
				msgs = ((InternalEObject)newNode_elements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.NODE__NODE_ELEMENTS, null, msgs);
			msgs = basicSetNode_elements(newNode_elements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.NODE__NODE_ELEMENTS, newNode_elements, newNode_elements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getNode_shape() {
		return node_shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode_shape(Shape newNode_shape, NotificationChain msgs) {
		Shape oldNode_shape = node_shape;
		node_shape = newNode_shape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.NODE__NODE_SHAPE, oldNode_shape, newNode_shape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode_shape(Shape newNode_shape) {
		if (newNode_shape != node_shape) {
			NotificationChain msgs = null;
			if (node_shape != null)
				msgs = ((InternalEObject)node_shape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.NODE__NODE_SHAPE, null, msgs);
			if (newNode_shape != null)
				msgs = ((InternalEObject)newNode_shape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.NODE__NODE_SHAPE, null, msgs);
			msgs = basicSetNode_shape(newNode_shape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.NODE__NODE_SHAPE, newNode_shape, newNode_shape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExpandable() {
		return expandable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpandable(boolean newExpandable) {
		boolean oldExpandable = expandable;
		expandable = newExpandable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.NODE__EXPANDABLE, oldExpandable, expandable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalStyle> getConditionalStyle() {
		if (conditionalStyle == null) {
			conditionalStyle = new EObjectContainmentEList<ConditionalStyle>(ConditionalStyle.class, this, Graphic_representationPackage.NODE__CONDITIONAL_STYLE);
		}
		return conditionalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildrenPresentation getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentation(ChildrenPresentation newPresentation) {
		ChildrenPresentation oldPresentation = presentation;
		presentation = newPresentation == null ? PRESENTATION_EDEFAULT : newPresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.NODE__PRESENTATION, oldPresentation, presentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.NODE__NODE_ELEMENTS:
				return basicSetNode_elements(null, msgs);
			case Graphic_representationPackage.NODE__NODE_SHAPE:
				return basicSetNode_shape(null, msgs);
			case Graphic_representationPackage.NODE__CONDITIONAL_STYLE:
				return ((InternalEList<?>)getConditionalStyle()).basicRemove(otherEnd, msgs);
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
			case Graphic_representationPackage.NODE__NODE_ELEMENTS:
				return getNode_elements();
			case Graphic_representationPackage.NODE__NODE_SHAPE:
				return getNode_shape();
			case Graphic_representationPackage.NODE__EXPANDABLE:
				return isExpandable();
			case Graphic_representationPackage.NODE__CONDITIONAL_STYLE:
				return getConditionalStyle();
			case Graphic_representationPackage.NODE__PRESENTATION:
				return getPresentation();
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
			case Graphic_representationPackage.NODE__NODE_ELEMENTS:
				setNode_elements((Node_Element)newValue);
				return;
			case Graphic_representationPackage.NODE__NODE_SHAPE:
				setNode_shape((Shape)newValue);
				return;
			case Graphic_representationPackage.NODE__EXPANDABLE:
				setExpandable((Boolean)newValue);
				return;
			case Graphic_representationPackage.NODE__CONDITIONAL_STYLE:
				getConditionalStyle().clear();
				getConditionalStyle().addAll((Collection<? extends ConditionalStyle>)newValue);
				return;
			case Graphic_representationPackage.NODE__PRESENTATION:
				setPresentation((ChildrenPresentation)newValue);
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
			case Graphic_representationPackage.NODE__NODE_ELEMENTS:
				setNode_elements((Node_Element)null);
				return;
			case Graphic_representationPackage.NODE__NODE_SHAPE:
				setNode_shape((Shape)null);
				return;
			case Graphic_representationPackage.NODE__EXPANDABLE:
				setExpandable(EXPANDABLE_EDEFAULT);
				return;
			case Graphic_representationPackage.NODE__CONDITIONAL_STYLE:
				getConditionalStyle().clear();
				return;
			case Graphic_representationPackage.NODE__PRESENTATION:
				setPresentation(PRESENTATION_EDEFAULT);
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
			case Graphic_representationPackage.NODE__NODE_ELEMENTS:
				return node_elements != null;
			case Graphic_representationPackage.NODE__NODE_SHAPE:
				return node_shape != null;
			case Graphic_representationPackage.NODE__EXPANDABLE:
				return expandable != EXPANDABLE_EDEFAULT;
			case Graphic_representationPackage.NODE__CONDITIONAL_STYLE:
				return conditionalStyle != null && !conditionalStyle.isEmpty();
			case Graphic_representationPackage.NODE__PRESENTATION:
				return presentation != PRESENTATION_EDEFAULT;
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
		result.append(" (expandable: ");
		result.append(expandable);
		result.append(", presentation: ");
		result.append(presentation);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
