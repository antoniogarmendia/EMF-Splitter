/**
 */
package graphic_representation.impl;

import graphic_representation.Border;
import graphic_representation.Color;
import graphic_representation.Diamond;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.ShapeColor;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diamond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.DiamondImpl#getColor <em>Color</em>}</li>
 *   <li>{@link graphic_representation.impl.DiamondImpl#getBorderStyle <em>Border Style</em>}</li>
 *   <li>{@link graphic_representation.impl.DiamondImpl#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link graphic_representation.impl.DiamondImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link graphic_representation.impl.DiamondImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiamondImpl extends ShapeImpl implements Diamond {
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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_EDEFAULT = new Integer(5);

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Integer size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiamondImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.DIAMOND;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.DIAMOND__COLOR, oldColor, newColor);
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
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.DIAMOND__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.DIAMOND__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.DIAMOND__COLOR, newColor, newColor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.DIAMOND__BORDER_COLOR, oldBorderColor, newBorderColor);
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
				msgs = ((InternalEObject)borderColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.DIAMOND__BORDER_COLOR, null, msgs);
			if (newBorderColor != null)
				msgs = ((InternalEObject)newBorderColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.DIAMOND__BORDER_COLOR, null, msgs);
			msgs = basicSetBorderColor(newBorderColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.DIAMOND__BORDER_COLOR, newBorderColor, newBorderColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.DIAMOND__BORDER_STYLE, oldBorderStyle, borderStyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.DIAMOND__BORDER_WIDTH, oldBorderWidth, borderWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Integer newSize) {
		Integer oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.DIAMOND__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.DIAMOND__COLOR:
				return basicSetColor(null, msgs);
			case Graphic_representationPackage.DIAMOND__BORDER_COLOR:
				return basicSetBorderColor(null, msgs);
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
			case Graphic_representationPackage.DIAMOND__COLOR:
				return getColor();
			case Graphic_representationPackage.DIAMOND__BORDER_STYLE:
				return getBorderStyle();
			case Graphic_representationPackage.DIAMOND__BORDER_WIDTH:
				return getBorderWidth();
			case Graphic_representationPackage.DIAMOND__BORDER_COLOR:
				return getBorderColor();
			case Graphic_representationPackage.DIAMOND__SIZE:
				return getSize();
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
			case Graphic_representationPackage.DIAMOND__COLOR:
				setColor((Color)newValue);
				return;
			case Graphic_representationPackage.DIAMOND__BORDER_STYLE:
				setBorderStyle((String)newValue);
				return;
			case Graphic_representationPackage.DIAMOND__BORDER_WIDTH:
				setBorderWidth((String)newValue);
				return;
			case Graphic_representationPackage.DIAMOND__BORDER_COLOR:
				setBorderColor((Color)newValue);
				return;
			case Graphic_representationPackage.DIAMOND__SIZE:
				setSize((Integer)newValue);
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
			case Graphic_representationPackage.DIAMOND__COLOR:
				setColor((Color)null);
				return;
			case Graphic_representationPackage.DIAMOND__BORDER_STYLE:
				setBorderStyle(BORDER_STYLE_EDEFAULT);
				return;
			case Graphic_representationPackage.DIAMOND__BORDER_WIDTH:
				setBorderWidth(BORDER_WIDTH_EDEFAULT);
				return;
			case Graphic_representationPackage.DIAMOND__BORDER_COLOR:
				setBorderColor((Color)null);
				return;
			case Graphic_representationPackage.DIAMOND__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case Graphic_representationPackage.DIAMOND__COLOR:
				return color != null;
			case Graphic_representationPackage.DIAMOND__BORDER_STYLE:
				return BORDER_STYLE_EDEFAULT == null ? borderStyle != null : !BORDER_STYLE_EDEFAULT.equals(borderStyle);
			case Graphic_representationPackage.DIAMOND__BORDER_WIDTH:
				return BORDER_WIDTH_EDEFAULT == null ? borderWidth != null : !BORDER_WIDTH_EDEFAULT.equals(borderWidth);
			case Graphic_representationPackage.DIAMOND__BORDER_COLOR:
				return borderColor != null;
			case Graphic_representationPackage.DIAMOND__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
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
				case Graphic_representationPackage.DIAMOND__COLOR: return Graphic_representationPackage.SHAPE_COLOR__COLOR;
				default: return -1;
			}
		}
		if (baseClass == Border.class) {
			switch (derivedFeatureID) {
				case Graphic_representationPackage.DIAMOND__BORDER_STYLE: return Graphic_representationPackage.BORDER__BORDER_STYLE;
				case Graphic_representationPackage.DIAMOND__BORDER_WIDTH: return Graphic_representationPackage.BORDER__BORDER_WIDTH;
				case Graphic_representationPackage.DIAMOND__BORDER_COLOR: return Graphic_representationPackage.BORDER__BORDER_COLOR;
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
				case Graphic_representationPackage.SHAPE_COLOR__COLOR: return Graphic_representationPackage.DIAMOND__COLOR;
				default: return -1;
			}
		}
		if (baseClass == Border.class) {
			switch (baseFeatureID) {
				case Graphic_representationPackage.BORDER__BORDER_STYLE: return Graphic_representationPackage.DIAMOND__BORDER_STYLE;
				case Graphic_representationPackage.BORDER__BORDER_WIDTH: return Graphic_representationPackage.DIAMOND__BORDER_WIDTH;
				case Graphic_representationPackage.BORDER__BORDER_COLOR: return Graphic_representationPackage.DIAMOND__BORDER_COLOR;
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
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //DiamondImpl
