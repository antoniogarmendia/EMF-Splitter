/**
 */
package graphic_representation.impl;

import graphic_representation.Graphic_representationPackage;
import graphic_representation.PaletteDescription;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Palette Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.PaletteDescriptionImpl#getIcon_filepath <em>Icon filepath</em>}</li>
 *   <li>{@link graphic_representation.impl.PaletteDescriptionImpl#getPalette_name <em>Palette name</em>}</li>
 *   <li>{@link graphic_representation.impl.PaletteDescriptionImpl#isIsDraggable <em>Is Draggable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaletteDescriptionImpl extends MinimalEObjectImpl.Container implements PaletteDescription {
	/**
	 * The default value of the '{@link #getIcon_filepath() <em>Icon filepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon_filepath()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_FILEPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon_filepath() <em>Icon filepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon_filepath()
	 * @generated
	 * @ordered
	 */
	protected String icon_filepath = ICON_FILEPATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPalette_name() <em>Palette name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalette_name()
	 * @generated
	 * @ordered
	 */
	protected static final String PALETTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPalette_name() <em>Palette name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalette_name()
	 * @generated
	 * @ordered
	 */
	protected String palette_name = PALETTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDraggable() <em>Is Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDraggable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DRAGGABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsDraggable() <em>Is Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDraggable()
	 * @generated
	 * @ordered
	 */
	protected boolean isDraggable = IS_DRAGGABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaletteDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.PALETTE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon_filepath() {
		return icon_filepath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon_filepath(String newIcon_filepath) {
		String oldIcon_filepath = icon_filepath;
		icon_filepath = newIcon_filepath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.PALETTE_DESCRIPTION__ICON_FILEPATH, oldIcon_filepath, icon_filepath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPalette_name() {
		return palette_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalette_name(String newPalette_name) {
		String oldPalette_name = palette_name;
		palette_name = newPalette_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.PALETTE_DESCRIPTION__PALETTE_NAME, oldPalette_name, palette_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDraggable() {
		return isDraggable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDraggable(boolean newIsDraggable) {
		boolean oldIsDraggable = isDraggable;
		isDraggable = newIsDraggable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.PALETTE_DESCRIPTION__IS_DRAGGABLE, oldIsDraggable, isDraggable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Graphic_representationPackage.PALETTE_DESCRIPTION__ICON_FILEPATH:
				return getIcon_filepath();
			case Graphic_representationPackage.PALETTE_DESCRIPTION__PALETTE_NAME:
				return getPalette_name();
			case Graphic_representationPackage.PALETTE_DESCRIPTION__IS_DRAGGABLE:
				return isIsDraggable();
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
			case Graphic_representationPackage.PALETTE_DESCRIPTION__ICON_FILEPATH:
				setIcon_filepath((String)newValue);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION__PALETTE_NAME:
				setPalette_name((String)newValue);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION__IS_DRAGGABLE:
				setIsDraggable((Boolean)newValue);
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
			case Graphic_representationPackage.PALETTE_DESCRIPTION__ICON_FILEPATH:
				setIcon_filepath(ICON_FILEPATH_EDEFAULT);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION__PALETTE_NAME:
				setPalette_name(PALETTE_NAME_EDEFAULT);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION__IS_DRAGGABLE:
				setIsDraggable(IS_DRAGGABLE_EDEFAULT);
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
			case Graphic_representationPackage.PALETTE_DESCRIPTION__ICON_FILEPATH:
				return ICON_FILEPATH_EDEFAULT == null ? icon_filepath != null : !ICON_FILEPATH_EDEFAULT.equals(icon_filepath);
			case Graphic_representationPackage.PALETTE_DESCRIPTION__PALETTE_NAME:
				return PALETTE_NAME_EDEFAULT == null ? palette_name != null : !PALETTE_NAME_EDEFAULT.equals(palette_name);
			case Graphic_representationPackage.PALETTE_DESCRIPTION__IS_DRAGGABLE:
				return isDraggable != IS_DRAGGABLE_EDEFAULT;
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
		result.append(" (icon_filepath: ");
		result.append(icon_filepath);
		result.append(", palette_name: ");
		result.append(palette_name);
		result.append(", isDraggable: ");
		result.append(isDraggable);
		result.append(')');
		return result.toString();
	}

} //PaletteDescriptionImpl
