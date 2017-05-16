/**
 */
package Visualization.impl;

import Visualization.GraphicElement;
import Visualization.VisualizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphic Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Visualization.impl.GraphicElementImpl#getColor <em>Color</em>}</li>
 *   <li>{@link Visualization.impl.GraphicElementImpl#getPaletteName <em>Palette Name</em>}</li>
 *   <li>{@link Visualization.impl.GraphicElementImpl#getPaletteIconPath <em>Palette Icon Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GraphicElementImpl extends MinimalEObjectImpl.Container implements GraphicElement {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaletteName() <em>Palette Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteName()
	 * @generated
	 * @ordered
	 */
	protected static final String PALETTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaletteName() <em>Palette Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteName()
	 * @generated
	 * @ordered
	 */
	protected String paletteName = PALETTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaletteIconPath() <em>Palette Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteIconPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PALETTE_ICON_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaletteIconPath() <em>Palette Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteIconPath()
	 * @generated
	 * @ordered
	 */
	protected String paletteIconPath = PALETTE_ICON_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.GRAPHIC_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.GRAPHIC_ELEMENT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaletteName() {
		return paletteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaletteName(String newPaletteName) {
		String oldPaletteName = paletteName;
		paletteName = newPaletteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.GRAPHIC_ELEMENT__PALETTE_NAME, oldPaletteName, paletteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaletteIconPath() {
		return paletteIconPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaletteIconPath(String newPaletteIconPath) {
		String oldPaletteIconPath = paletteIconPath;
		paletteIconPath = newPaletteIconPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.GRAPHIC_ELEMENT__PALETTE_ICON_PATH, oldPaletteIconPath, paletteIconPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.GRAPHIC_ELEMENT__COLOR:
				return getColor();
			case VisualizationPackage.GRAPHIC_ELEMENT__PALETTE_NAME:
				return getPaletteName();
			case VisualizationPackage.GRAPHIC_ELEMENT__PALETTE_ICON_PATH:
				return getPaletteIconPath();
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
			case VisualizationPackage.GRAPHIC_ELEMENT__COLOR:
				setColor((String)newValue);
				return;
			case VisualizationPackage.GRAPHIC_ELEMENT__PALETTE_NAME:
				setPaletteName((String)newValue);
				return;
			case VisualizationPackage.GRAPHIC_ELEMENT__PALETTE_ICON_PATH:
				setPaletteIconPath((String)newValue);
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
			case VisualizationPackage.GRAPHIC_ELEMENT__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case VisualizationPackage.GRAPHIC_ELEMENT__PALETTE_NAME:
				setPaletteName(PALETTE_NAME_EDEFAULT);
				return;
			case VisualizationPackage.GRAPHIC_ELEMENT__PALETTE_ICON_PATH:
				setPaletteIconPath(PALETTE_ICON_PATH_EDEFAULT);
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
			case VisualizationPackage.GRAPHIC_ELEMENT__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case VisualizationPackage.GRAPHIC_ELEMENT__PALETTE_NAME:
				return PALETTE_NAME_EDEFAULT == null ? paletteName != null : !PALETTE_NAME_EDEFAULT.equals(paletteName);
			case VisualizationPackage.GRAPHIC_ELEMENT__PALETTE_ICON_PATH:
				return PALETTE_ICON_PATH_EDEFAULT == null ? paletteIconPath != null : !PALETTE_ICON_PATH_EDEFAULT.equals(paletteIconPath);
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
		result.append(" (color: ");
		result.append(color);
		result.append(", paletteName: ");
		result.append(paletteName);
		result.append(", paletteIconPath: ");
		result.append(paletteIconPath);
		result.append(')');
		return result.toString();
	}

} //GraphicElementImpl
