/**
 */
package mobile_server.impl;

import mobile_server.Mobile_serverPackage;
import mobile_server.Palette;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Palette</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mobile_server.impl.PaletteImpl#getName <em>Name</em>}</li>
 *   <li>{@link mobile_server.impl.PaletteImpl#getContent <em>Content</em>}</li>
 *   <li>{@link mobile_server.impl.PaletteImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mobile_server.impl.PaletteImpl#getEcoreURI <em>Ecore URI</em>}</li>
 *   <li>{@link mobile_server.impl.PaletteImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaletteImpl extends MinimalEObjectImpl.Container implements Palette {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final long VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected long version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEcoreURI() <em>Ecore URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ECORE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcoreURI() <em>Ecore URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreURI()
	 * @generated
	 * @ordered
	 */
	protected String ecoreURI = ECORE_URI_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaletteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mobile_serverPackage.Literals.PALETTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mobile_serverPackage.PALETTE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mobile_serverPackage.PALETTE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(long newVersion) {
		long oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mobile_serverPackage.PALETTE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcoreURI() {
		return ecoreURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreURI(String newEcoreURI) {
		String oldEcoreURI = ecoreURI;
		ecoreURI = newEcoreURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mobile_serverPackage.PALETTE__ECORE_URI, oldEcoreURI, ecoreURI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mobile_serverPackage.PALETTE__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mobile_serverPackage.PALETTE__NAME:
				return getName();
			case Mobile_serverPackage.PALETTE__CONTENT:
				return getContent();
			case Mobile_serverPackage.PALETTE__VERSION:
				return getVersion();
			case Mobile_serverPackage.PALETTE__ECORE_URI:
				return getEcoreURI();
			case Mobile_serverPackage.PALETTE__EXTENSION:
				return getExtension();
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
			case Mobile_serverPackage.PALETTE__NAME:
				setName((String)newValue);
				return;
			case Mobile_serverPackage.PALETTE__CONTENT:
				setContent((String)newValue);
				return;
			case Mobile_serverPackage.PALETTE__VERSION:
				setVersion((Long)newValue);
				return;
			case Mobile_serverPackage.PALETTE__ECORE_URI:
				setEcoreURI((String)newValue);
				return;
			case Mobile_serverPackage.PALETTE__EXTENSION:
				setExtension((String)newValue);
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
			case Mobile_serverPackage.PALETTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mobile_serverPackage.PALETTE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case Mobile_serverPackage.PALETTE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case Mobile_serverPackage.PALETTE__ECORE_URI:
				setEcoreURI(ECORE_URI_EDEFAULT);
				return;
			case Mobile_serverPackage.PALETTE__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
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
			case Mobile_serverPackage.PALETTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Mobile_serverPackage.PALETTE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case Mobile_serverPackage.PALETTE__VERSION:
				return version != VERSION_EDEFAULT;
			case Mobile_serverPackage.PALETTE__ECORE_URI:
				return ECORE_URI_EDEFAULT == null ? ecoreURI != null : !ECORE_URI_EDEFAULT.equals(ecoreURI);
			case Mobile_serverPackage.PALETTE__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
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
		result.append(", content: ");
		result.append(content);
		result.append(", version: ");
		result.append(version);
		result.append(", ecoreURI: ");
		result.append(ecoreURI);
		result.append(", extension: ");
		result.append(extension);
		result.append(')');
		return result.toString();
	}

} //PaletteImpl
