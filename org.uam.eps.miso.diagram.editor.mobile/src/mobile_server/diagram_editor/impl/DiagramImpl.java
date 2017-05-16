/**
 */
package mobile_server.diagram_editor.impl;

import mobile_server.Palette;
import mobile_server.diagram_editor.Diagram;
import mobile_server.diagram_editor.Diagram_editorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mobile_server.diagram_editor.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link mobile_server.diagram_editor.impl.DiagramImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mobile_server.diagram_editor.impl.DiagramImpl#getPreviewImageString <em>Preview Image String</em>}</li>
 *   <li>{@link mobile_server.diagram_editor.impl.DiagramImpl#getContent <em>Content</em>}</li>
 *   <li>{@link mobile_server.diagram_editor.impl.DiagramImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link mobile_server.diagram_editor.impl.DiagramImpl#getAnPalette <em>An Palette</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramImpl extends MinimalEObjectImpl.Container implements Diagram {
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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviewImageString() <em>Preview Image String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviewImageString()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIEW_IMAGE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreviewImageString() <em>Preview Image String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviewImageString()
	 * @generated
	 * @ordered
	 */
	protected String previewImageString = PREVIEW_IMAGE_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnPalette() <em>An Palette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnPalette()
	 * @generated
	 * @ordered
	 */
	protected Palette anPalette;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diagram_editorPackage.Literals.DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Diagram_editorPackage.DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagram_editorPackage.DIAGRAM__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreviewImageString() {
		return previewImageString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviewImageString(String newPreviewImageString) {
		String oldPreviewImageString = previewImageString;
		previewImageString = newPreviewImageString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagram_editorPackage.DIAGRAM__PREVIEW_IMAGE_STRING, oldPreviewImageString, previewImageString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagram_editorPackage.DIAGRAM__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagram_editorPackage.DIAGRAM__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette getAnPalette() {
		if (anPalette != null && anPalette.eIsProxy()) {
			InternalEObject oldAnPalette = (InternalEObject)anPalette;
			anPalette = (Palette)eResolveProxy(oldAnPalette);
			if (anPalette != oldAnPalette) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Diagram_editorPackage.DIAGRAM__AN_PALETTE, oldAnPalette, anPalette));
			}
		}
		return anPalette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette basicGetAnPalette() {
		return anPalette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnPalette(Palette newAnPalette) {
		Palette oldAnPalette = anPalette;
		anPalette = newAnPalette;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagram_editorPackage.DIAGRAM__AN_PALETTE, oldAnPalette, anPalette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Diagram_editorPackage.DIAGRAM__NAME:
				return getName();
			case Diagram_editorPackage.DIAGRAM__DATE:
				return getDate();
			case Diagram_editorPackage.DIAGRAM__PREVIEW_IMAGE_STRING:
				return getPreviewImageString();
			case Diagram_editorPackage.DIAGRAM__CONTENT:
				return getContent();
			case Diagram_editorPackage.DIAGRAM__EXTENSION:
				return getExtension();
			case Diagram_editorPackage.DIAGRAM__AN_PALETTE:
				if (resolve) return getAnPalette();
				return basicGetAnPalette();
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
			case Diagram_editorPackage.DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case Diagram_editorPackage.DIAGRAM__DATE:
				setDate((String)newValue);
				return;
			case Diagram_editorPackage.DIAGRAM__PREVIEW_IMAGE_STRING:
				setPreviewImageString((String)newValue);
				return;
			case Diagram_editorPackage.DIAGRAM__CONTENT:
				setContent((String)newValue);
				return;
			case Diagram_editorPackage.DIAGRAM__EXTENSION:
				setExtension((String)newValue);
				return;
			case Diagram_editorPackage.DIAGRAM__AN_PALETTE:
				setAnPalette((Palette)newValue);
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
			case Diagram_editorPackage.DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Diagram_editorPackage.DIAGRAM__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case Diagram_editorPackage.DIAGRAM__PREVIEW_IMAGE_STRING:
				setPreviewImageString(PREVIEW_IMAGE_STRING_EDEFAULT);
				return;
			case Diagram_editorPackage.DIAGRAM__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case Diagram_editorPackage.DIAGRAM__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case Diagram_editorPackage.DIAGRAM__AN_PALETTE:
				setAnPalette((Palette)null);
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
			case Diagram_editorPackage.DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Diagram_editorPackage.DIAGRAM__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case Diagram_editorPackage.DIAGRAM__PREVIEW_IMAGE_STRING:
				return PREVIEW_IMAGE_STRING_EDEFAULT == null ? previewImageString != null : !PREVIEW_IMAGE_STRING_EDEFAULT.equals(previewImageString);
			case Diagram_editorPackage.DIAGRAM__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case Diagram_editorPackage.DIAGRAM__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case Diagram_editorPackage.DIAGRAM__AN_PALETTE:
				return anPalette != null;
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
		result.append(", date: ");
		result.append(date);
		result.append(", previewImageString: ");
		result.append(previewImageString);
		result.append(", content: ");
		result.append(content);
		result.append(", extension: ");
		result.append(extension);
		result.append(')');
		return result.toString();
	}

} //DiagramImpl
