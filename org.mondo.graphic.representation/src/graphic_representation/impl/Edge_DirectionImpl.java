/**
 */
package graphic_representation.impl;

import graphic_representation.Edge_Direction;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.Link;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.Edge_DirectionImpl#getSourceLink <em>Source Link</em>}</li>
 *   <li>{@link graphic_representation.impl.Edge_DirectionImpl#getTargetLink <em>Target Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Edge_DirectionImpl extends MinimalEObjectImpl.Container implements Edge_Direction {
	/**
	 * The cached value of the '{@link #getSourceLink() <em>Source Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLink()
	 * @generated
	 * @ordered
	 */
	protected Link sourceLink;

	/**
	 * The cached value of the '{@link #getTargetLink() <em>Target Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLink()
	 * @generated
	 * @ordered
	 */
	protected Link targetLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Edge_DirectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.EDGE_DIRECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getSourceLink() {
		return sourceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceLink(Link newSourceLink, NotificationChain msgs) {
		Link oldSourceLink = sourceLink;
		sourceLink = newSourceLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.EDGE_DIRECTION__SOURCE_LINK, oldSourceLink, newSourceLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLink(Link newSourceLink) {
		if (newSourceLink != sourceLink) {
			NotificationChain msgs = null;
			if (sourceLink != null)
				msgs = ((InternalEObject)sourceLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.EDGE_DIRECTION__SOURCE_LINK, null, msgs);
			if (newSourceLink != null)
				msgs = ((InternalEObject)newSourceLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.EDGE_DIRECTION__SOURCE_LINK, null, msgs);
			msgs = basicSetSourceLink(newSourceLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.EDGE_DIRECTION__SOURCE_LINK, newSourceLink, newSourceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getTargetLink() {
		return targetLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetLink(Link newTargetLink, NotificationChain msgs) {
		Link oldTargetLink = targetLink;
		targetLink = newTargetLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.EDGE_DIRECTION__TARGET_LINK, oldTargetLink, newTargetLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLink(Link newTargetLink) {
		if (newTargetLink != targetLink) {
			NotificationChain msgs = null;
			if (targetLink != null)
				msgs = ((InternalEObject)targetLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.EDGE_DIRECTION__TARGET_LINK, null, msgs);
			if (newTargetLink != null)
				msgs = ((InternalEObject)newTargetLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.EDGE_DIRECTION__TARGET_LINK, null, msgs);
			msgs = basicSetTargetLink(newTargetLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.EDGE_DIRECTION__TARGET_LINK, newTargetLink, newTargetLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.EDGE_DIRECTION__SOURCE_LINK:
				return basicSetSourceLink(null, msgs);
			case Graphic_representationPackage.EDGE_DIRECTION__TARGET_LINK:
				return basicSetTargetLink(null, msgs);
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
			case Graphic_representationPackage.EDGE_DIRECTION__SOURCE_LINK:
				return getSourceLink();
			case Graphic_representationPackage.EDGE_DIRECTION__TARGET_LINK:
				return getTargetLink();
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
			case Graphic_representationPackage.EDGE_DIRECTION__SOURCE_LINK:
				setSourceLink((Link)newValue);
				return;
			case Graphic_representationPackage.EDGE_DIRECTION__TARGET_LINK:
				setTargetLink((Link)newValue);
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
			case Graphic_representationPackage.EDGE_DIRECTION__SOURCE_LINK:
				setSourceLink((Link)null);
				return;
			case Graphic_representationPackage.EDGE_DIRECTION__TARGET_LINK:
				setTargetLink((Link)null);
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
			case Graphic_representationPackage.EDGE_DIRECTION__SOURCE_LINK:
				return sourceLink != null;
			case Graphic_representationPackage.EDGE_DIRECTION__TARGET_LINK:
				return targetLink != null;
		}
		return super.eIsSet(featureID);
	}

} //Edge_DirectionImpl
