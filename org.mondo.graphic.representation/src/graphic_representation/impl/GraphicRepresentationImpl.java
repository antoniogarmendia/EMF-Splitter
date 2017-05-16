/**
 */
package graphic_representation.impl;

import graphic_representation.GRUserColor;
import graphic_representation.GraphicRepresentation;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.MMGraphic_Representation;
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
 * An implementation of the model object '<em><b>Graphic Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.GraphicRepresentationImpl#getAllGraphicRepresentation <em>All Graphic Representation</em>}</li>
 *   <li>{@link graphic_representation.impl.GraphicRepresentationImpl#getName <em>Name</em>}</li>
 *   <li>{@link graphic_representation.impl.GraphicRepresentationImpl#getUserColors <em>User Colors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicRepresentationImpl extends MinimalEObjectImpl.Container implements GraphicRepresentation {
	/**
	 * The cached value of the '{@link #getAllGraphicRepresentation() <em>All Graphic Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllGraphicRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<MMGraphic_Representation> allGraphicRepresentation;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserColors() <em>User Colors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserColors()
	 * @generated
	 * @ordered
	 */
	protected EList<GRUserColor> userColors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected GraphicRepresentationImpl() {
		super();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.GRAPHIC_REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MMGraphic_Representation> getAllGraphicRepresentation() {
		if (allGraphicRepresentation == null) {
			allGraphicRepresentation = new EObjectContainmentEList<MMGraphic_Representation>(MMGraphic_Representation.class, this, Graphic_representationPackage.GRAPHIC_REPRESENTATION__ALL_GRAPHIC_REPRESENTATION);
		}
		return allGraphicRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.GRAPHIC_REPRESENTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GRUserColor> getUserColors() {
		if (userColors == null) {
			userColors = new EObjectContainmentEList<GRUserColor>(GRUserColor.class, this, Graphic_representationPackage.GRAPHIC_REPRESENTATION__USER_COLORS);
		}
		return userColors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__ALL_GRAPHIC_REPRESENTATION:
				return ((InternalEList<?>)getAllGraphicRepresentation()).basicRemove(otherEnd, msgs);
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__USER_COLORS:
				return ((InternalEList<?>)getUserColors()).basicRemove(otherEnd, msgs);
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
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__ALL_GRAPHIC_REPRESENTATION:
				return getAllGraphicRepresentation();
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__NAME:
				return getName();
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__USER_COLORS:
				return getUserColors();
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
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__ALL_GRAPHIC_REPRESENTATION:
				getAllGraphicRepresentation().clear();
				getAllGraphicRepresentation().addAll((Collection<? extends MMGraphic_Representation>)newValue);
				return;
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__NAME:
				setName((String)newValue);
				return;
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__USER_COLORS:
				getUserColors().clear();
				getUserColors().addAll((Collection<? extends GRUserColor>)newValue);
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
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__ALL_GRAPHIC_REPRESENTATION:
				getAllGraphicRepresentation().clear();
				return;
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__USER_COLORS:
				getUserColors().clear();
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
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__ALL_GRAPHIC_REPRESENTATION:
				return allGraphicRepresentation != null && !allGraphicRepresentation.isEmpty();
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Graphic_representationPackage.GRAPHIC_REPRESENTATION__USER_COLORS:
				return userColors != null && !userColors.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	
} //GraphicRepresentationImpl
