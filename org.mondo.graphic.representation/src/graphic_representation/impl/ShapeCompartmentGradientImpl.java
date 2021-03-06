/**
 */
package graphic_representation.impl;

import graphic_representation.Border;
import graphic_representation.Color;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.ShapeColor;
import graphic_representation.ShapeCompartmentGradient;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.description.SystemColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Compartment Gradient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.ShapeCompartmentGradientImpl#getColor <em>Color</em>}</li>
 *   <li>{@link graphic_representation.impl.ShapeCompartmentGradientImpl#getBorderStyle <em>Border Style</em>}</li>
 *   <li>{@link graphic_representation.impl.ShapeCompartmentGradientImpl#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link graphic_representation.impl.ShapeCompartmentGradientImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link graphic_representation.impl.ShapeCompartmentGradientImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link graphic_representation.impl.ShapeCompartmentGradientImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link graphic_representation.impl.ShapeCompartmentGradientImpl#getCornerHeight <em>Corner Height</em>}</li>
 *   <li>{@link graphic_representation.impl.ShapeCompartmentGradientImpl#getCornerWidth <em>Corner Width</em>}</li>
 *   <li>{@link graphic_representation.impl.ShapeCompartmentGradientImpl#getForeGroundColor <em>Fore Ground Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapeCompartmentGradientImpl extends ShapeImpl implements ShapeCompartmentGradient {
	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color;

	/**
	 * The default value of the '{@link #getBorderStyle() <em>Border Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_STYLE_EDEFAULT = "solid";

	/**
	 * The cached value of the '{@link #getBorderStyle() <em>Border Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderStyle()
	 * @generated
	 * @ordered
	 */
	protected String borderStyle = BORDER_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_WIDTH_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected String borderWidth = BORDER_WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected Color borderColor;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WIDTH_EDEFAULT = new Integer(10);

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEIGHT_EDEFAULT = new Integer(10);

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Integer height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCornerHeight() <em>Corner Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CORNER_HEIGHT_EDEFAULT = new Integer(10);

	/**
	 * The cached value of the '{@link #getCornerHeight() <em>Corner Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerHeight()
	 * @generated
	 * @ordered
	 */
	protected Integer cornerHeight = CORNER_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCornerWidth() <em>Corner Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CORNER_WIDTH_EDEFAULT = new Integer(10);

	/**
	 * The cached value of the '{@link #getCornerWidth() <em>Corner Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer cornerWidth = CORNER_WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForeGroundColor() <em>Fore Ground Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeGroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color foreGroundColor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeCompartmentGradientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.SHAPE_COMPARTMENT_GRADIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(Color newColor, NotificationChain msgs) {
		Color oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__COLOR, oldColor, newColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		if (newColor != color) {
			NotificationChain msgs = null;
			if (color != null)
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__COLOR, newColor, newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBorderColor(Color newBorderColor, NotificationChain msgs) {
		Color oldBorderColor = borderColor;
		borderColor = newBorderColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_COLOR, oldBorderColor, newBorderColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderColor(Color newBorderColor) {
		if (newBorderColor != borderColor) {
			NotificationChain msgs = null;
			if (borderColor != null)
				msgs = ((InternalEObject)borderColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_COLOR, null, msgs);
			if (newBorderColor != null)
				msgs = ((InternalEObject)newBorderColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_COLOR, null, msgs);
			msgs = basicSetBorderColor(newBorderColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_COLOR, newBorderColor, newBorderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorderStyle() {
		return borderStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderStyle(String newBorderStyle) {
		String oldBorderStyle = borderStyle;
		borderStyle = newBorderStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_STYLE, oldBorderStyle, borderStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorderWidth() {
		return borderWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderWidth(String newBorderWidth) {
		String oldBorderWidth = borderWidth;
		borderWidth = newBorderWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_WIDTH, oldBorderWidth, borderWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Integer newWidth) {
		Integer oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Integer newHeight) {
		Integer oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCornerHeight() {
		return cornerHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCornerHeight(Integer newCornerHeight) {
		Integer oldCornerHeight = cornerHeight;
		cornerHeight = newCornerHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__CORNER_HEIGHT, oldCornerHeight, cornerHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCornerWidth() {
		return cornerWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCornerWidth(Integer newCornerWidth) {
		Integer oldCornerWidth = cornerWidth;
		cornerWidth = newCornerWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__CORNER_WIDTH, oldCornerWidth, cornerWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getForeGroundColor() {
		return foreGroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeGroundColor(Color newForeGroundColor, NotificationChain msgs) {
		Color oldForeGroundColor = foreGroundColor;
		foreGroundColor = newForeGroundColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__FORE_GROUND_COLOR, oldForeGroundColor, newForeGroundColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeGroundColor(Color newForeGroundColor) {
		if (newForeGroundColor != foreGroundColor) {
			NotificationChain msgs = null;
			if (foreGroundColor != null)
				msgs = ((InternalEObject)foreGroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__FORE_GROUND_COLOR, null, msgs);
			if (newForeGroundColor != null)
				msgs = ((InternalEObject)newForeGroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__FORE_GROUND_COLOR, null, msgs);
			msgs = basicSetForeGroundColor(newForeGroundColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__FORE_GROUND_COLOR, newForeGroundColor, newForeGroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__COLOR:
				return basicSetColor(null, msgs);
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_COLOR:
				return basicSetBorderColor(null, msgs);
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__FORE_GROUND_COLOR:
				return basicSetForeGroundColor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SystemColor getSystemColorDescription(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return EnvironmentSystemColorFactory.getDefault().getSystemColorDescription(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__COLOR:
				return getColor();
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_STYLE:
				return getBorderStyle();
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_WIDTH:
				return getBorderWidth();
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_COLOR:
				return getBorderColor();
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__WIDTH:
				return getWidth();
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__HEIGHT:
				return getHeight();
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__CORNER_HEIGHT:
				return getCornerHeight();
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__CORNER_WIDTH:
				return getCornerWidth();
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__FORE_GROUND_COLOR:
				return getForeGroundColor();
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
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__COLOR:
				setColor((Color)newValue);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_STYLE:
				setBorderStyle((String)newValue);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_WIDTH:
				setBorderWidth((String)newValue);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_COLOR:
				setBorderColor((Color)newValue);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__WIDTH:
				setWidth((Integer)newValue);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__CORNER_HEIGHT:
				setCornerHeight((Integer)newValue);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__CORNER_WIDTH:
				setCornerWidth((Integer)newValue);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__FORE_GROUND_COLOR:
				setForeGroundColor((Color)newValue);
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
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__COLOR:
				setColor((Color)null);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_STYLE:
				setBorderStyle(BORDER_STYLE_EDEFAULT);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_WIDTH:
				setBorderWidth(BORDER_WIDTH_EDEFAULT);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_COLOR:
				setBorderColor((Color)null);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__CORNER_HEIGHT:
				setCornerHeight(CORNER_HEIGHT_EDEFAULT);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__CORNER_WIDTH:
				setCornerWidth(CORNER_WIDTH_EDEFAULT);
				return;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__FORE_GROUND_COLOR:
				setForeGroundColor((Color)null);
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
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__COLOR:
				return color != null;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_STYLE:
				return BORDER_STYLE_EDEFAULT == null ? borderStyle != null : !BORDER_STYLE_EDEFAULT.equals(borderStyle);
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_WIDTH:
				return BORDER_WIDTH_EDEFAULT == null ? borderWidth != null : !BORDER_WIDTH_EDEFAULT.equals(borderWidth);
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_COLOR:
				return borderColor != null;
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__CORNER_HEIGHT:
				return CORNER_HEIGHT_EDEFAULT == null ? cornerHeight != null : !CORNER_HEIGHT_EDEFAULT.equals(cornerHeight);
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__CORNER_WIDTH:
				return CORNER_WIDTH_EDEFAULT == null ? cornerWidth != null : !CORNER_WIDTH_EDEFAULT.equals(cornerWidth);
			case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__FORE_GROUND_COLOR:
				return foreGroundColor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ShapeColor.class) {
			switch (derivedFeatureID) {
				case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__COLOR: return Graphic_representationPackage.SHAPE_COLOR__COLOR;
				default: return -1;
			}
		}
		if (baseClass == Border.class) {
			switch (derivedFeatureID) {
				case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_STYLE: return Graphic_representationPackage.BORDER__BORDER_STYLE;
				case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_WIDTH: return Graphic_representationPackage.BORDER__BORDER_WIDTH;
				case Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_COLOR: return Graphic_representationPackage.BORDER__BORDER_COLOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ShapeColor.class) {
			switch (baseFeatureID) {
				case Graphic_representationPackage.SHAPE_COLOR__COLOR: return Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__COLOR;
				default: return -1;
			}
		}
		if (baseClass == Border.class) {
			switch (baseFeatureID) {
				case Graphic_representationPackage.BORDER__BORDER_STYLE: return Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_STYLE;
				case Graphic_representationPackage.BORDER__BORDER_WIDTH: return Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_WIDTH;
				case Graphic_representationPackage.BORDER__BORDER_COLOR: return Graphic_representationPackage.SHAPE_COMPARTMENT_GRADIENT__BORDER_COLOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (borderStyle: ");
		result.append(borderStyle);
		result.append(", borderWidth: ");
		result.append(borderWidth);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", cornerHeight: ");
		result.append(cornerHeight);
		result.append(", cornerWidth: ");
		result.append(cornerWidth);
		result.append(')');
		return result.toString();
	}

} //ShapeCompartmentGradientImpl
