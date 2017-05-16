/**
 */
package graphic_representation.impl;

import graphic_representation.Color;
import graphic_representation.Edge_Style;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.Link;
import graphic_representation.Node;
import graphic_representation.PaletteDescriptionLink;

import graphic_representation.ShapeColor;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Palette Description Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.PaletteDescriptionLinkImpl#getAnEReference <em>An EReference</em>}</li>
 *   <li>{@link graphic_representation.impl.PaletteDescriptionLinkImpl#getAnDiagramElement <em>An Diagram Element</em>}</li>
 *   <li>{@link graphic_representation.impl.PaletteDescriptionLinkImpl#getDecoratorName <em>Decorator Name</em>}</li>
 *   <li>{@link graphic_representation.impl.PaletteDescriptionLinkImpl#getColor <em>Color</em>}</li>
 *   <li>{@link graphic_representation.impl.PaletteDescriptionLinkImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link graphic_representation.impl.PaletteDescriptionLinkImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link graphic_representation.impl.PaletteDescriptionLinkImpl#getSourceDecoratorName <em>Source Decorator Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaletteDescriptionLinkImpl extends PaletteDescriptionImpl implements PaletteDescriptionLink {
	/**
	 * The cached value of the '{@link #getAnEReference() <em>An EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnEReference()
	 * @generated
	 * @ordered
	 */
	protected EReference anEReference;

	/**
	 * The cached value of the '{@link #getAnDiagramElement() <em>An Diagram Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> anDiagramElement;

	/**
	 * The default value of the '{@link #getDecoratorName() <em>Decorator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorName()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATOR_NAME_EDEFAULT = "NoDecoration";

	/**
	 * The cached value of the '{@link #getDecoratorName() <em>Decorator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorName()
	 * @generated
	 * @ordered
	 */
	protected String decoratorName = DECORATOR_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_STYLE_EDEFAULT = "solid";

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected String lineStyle = LINE_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_WIDTH_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected String lineWidth = LINE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceDecoratorName() <em>Source Decorator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDecoratorName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DECORATOR_NAME_EDEFAULT = "NoDecoration";

	/**
	 * The cached value of the '{@link #getSourceDecoratorName() <em>Source Decorator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDecoratorName()
	 * @generated
	 * @ordered
	 */
	protected String sourceDecoratorName = SOURCE_DECORATOR_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaletteDescriptionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.PALETTE_DESCRIPTION_LINK;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__COLOR, oldColor, newColor);
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
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__COLOR, newColor, newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(String newLineStyle) {
		String oldLineStyle = lineStyle;
		lineStyle = newLineStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_STYLE, oldLineStyle, lineStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineWidth() {
		return lineWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(String newLineWidth) {
		String oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_WIDTH, oldLineWidth, lineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnEReference() {
		if (anEReference != null && anEReference.eIsProxy()) {
			InternalEObject oldAnEReference = (InternalEObject)anEReference;
			anEReference = (EReference)eResolveProxy(oldAnEReference);
			if (anEReference != oldAnEReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_EREFERENCE, oldAnEReference, anEReference));
			}
		}
		return anEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetAnEReference() {
		return anEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnEReference(EReference newAnEReference) {
		EReference oldAnEReference = anEReference;
		anEReference = newAnEReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_EREFERENCE, oldAnEReference, anEReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getAnDiagramElement() {
		if (anDiagramElement == null) {
			anDiagramElement = new EObjectResolvingEList<Node>(Node.class, this, Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_DIAGRAM_ELEMENT);
		}
		return anDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecoratorName() {
		return decoratorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecoratorName(String newDecoratorName) {
		String oldDecoratorName = decoratorName;
		decoratorName = newDecoratorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__DECORATOR_NAME, oldDecoratorName, decoratorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceDecoratorName() {
		return sourceDecoratorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDecoratorName(String newSourceDecoratorName) {
		String oldSourceDecoratorName = sourceDecoratorName;
		sourceDecoratorName = newSourceDecoratorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__SOURCE_DECORATOR_NAME, oldSourceDecoratorName, sourceDecoratorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__COLOR:
				return basicSetColor(null, msgs);
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
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_EREFERENCE:
				if (resolve) return getAnEReference();
				return basicGetAnEReference();
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_DIAGRAM_ELEMENT:
				return getAnDiagramElement();
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__DECORATOR_NAME:
				return getDecoratorName();
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__COLOR:
				return getColor();
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_STYLE:
				return getLineStyle();
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_WIDTH:
				return getLineWidth();
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__SOURCE_DECORATOR_NAME:
				return getSourceDecoratorName();
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
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_EREFERENCE:
				setAnEReference((EReference)newValue);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_DIAGRAM_ELEMENT:
				getAnDiagramElement().clear();
				getAnDiagramElement().addAll((Collection<? extends Node>)newValue);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__DECORATOR_NAME:
				setDecoratorName((String)newValue);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__COLOR:
				setColor((Color)newValue);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_STYLE:
				setLineStyle((String)newValue);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_WIDTH:
				setLineWidth((String)newValue);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__SOURCE_DECORATOR_NAME:
				setSourceDecoratorName((String)newValue);
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
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_EREFERENCE:
				setAnEReference((EReference)null);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_DIAGRAM_ELEMENT:
				getAnDiagramElement().clear();
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__DECORATOR_NAME:
				setDecoratorName(DECORATOR_NAME_EDEFAULT);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__COLOR:
				setColor((Color)null);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_STYLE:
				setLineStyle(LINE_STYLE_EDEFAULT);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__SOURCE_DECORATOR_NAME:
				setSourceDecoratorName(SOURCE_DECORATOR_NAME_EDEFAULT);
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
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_EREFERENCE:
				return anEReference != null;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_DIAGRAM_ELEMENT:
				return anDiagramElement != null && !anDiagramElement.isEmpty();
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__DECORATOR_NAME:
				return DECORATOR_NAME_EDEFAULT == null ? decoratorName != null : !DECORATOR_NAME_EDEFAULT.equals(decoratorName);
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__COLOR:
				return color != null;
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_STYLE:
				return LINE_STYLE_EDEFAULT == null ? lineStyle != null : !LINE_STYLE_EDEFAULT.equals(lineStyle);
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_WIDTH:
				return LINE_WIDTH_EDEFAULT == null ? lineWidth != null : !LINE_WIDTH_EDEFAULT.equals(lineWidth);
			case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__SOURCE_DECORATOR_NAME:
				return SOURCE_DECORATOR_NAME_EDEFAULT == null ? sourceDecoratorName != null : !SOURCE_DECORATOR_NAME_EDEFAULT.equals(sourceDecoratorName);
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
		if (baseClass == Link.class) {
			switch (derivedFeatureID) {
				case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_EREFERENCE: return Graphic_representationPackage.LINK__AN_EREFERENCE;
				case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_DIAGRAM_ELEMENT: return Graphic_representationPackage.LINK__AN_DIAGRAM_ELEMENT;
				case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__DECORATOR_NAME: return Graphic_representationPackage.LINK__DECORATOR_NAME;
				default: return -1;
			}
		}
		if (baseClass == ShapeColor.class) {
			switch (derivedFeatureID) {
				case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__COLOR: return Graphic_representationPackage.SHAPE_COLOR__COLOR;
				default: return -1;
			}
		}
		if (baseClass == Edge_Style.class) {
			switch (derivedFeatureID) {
				case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_STYLE: return Graphic_representationPackage.EDGE_STYLE__LINE_STYLE;
				case Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_WIDTH: return Graphic_representationPackage.EDGE_STYLE__LINE_WIDTH;
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
		if (baseClass == Link.class) {
			switch (baseFeatureID) {
				case Graphic_representationPackage.LINK__AN_EREFERENCE: return Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_EREFERENCE;
				case Graphic_representationPackage.LINK__AN_DIAGRAM_ELEMENT: return Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__AN_DIAGRAM_ELEMENT;
				case Graphic_representationPackage.LINK__DECORATOR_NAME: return Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__DECORATOR_NAME;
				default: return -1;
			}
		}
		if (baseClass == ShapeColor.class) {
			switch (baseFeatureID) {
				case Graphic_representationPackage.SHAPE_COLOR__COLOR: return Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__COLOR;
				default: return -1;
			}
		}
		if (baseClass == Edge_Style.class) {
			switch (baseFeatureID) {
				case Graphic_representationPackage.EDGE_STYLE__LINE_STYLE: return Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_STYLE;
				case Graphic_representationPackage.EDGE_STYLE__LINE_WIDTH: return Graphic_representationPackage.PALETTE_DESCRIPTION_LINK__LINE_WIDTH;
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
		result.append(" (decoratorName: ");
		result.append(decoratorName);
		result.append(", LineStyle: ");
		result.append(lineStyle);
		result.append(", LineWidth: ");
		result.append(lineWidth);
		result.append(", sourceDecoratorName: ");
		result.append(sourceDecoratorName);
		result.append(')');
		return result.toString();
	}

} //PaletteDescriptionLinkImpl
