/**
 */
package graphic_representation.impl;

import graphic_representation.Graphic_representationPackage;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.Representation;
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
 * An implementation of the model object '<em><b>MM Graphic Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.MMGraphic_RepresentationImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link graphic_representation.impl.MMGraphic_RepresentationImpl#getListRepresentations <em>List Representations</em>}</li>
 *   <li>{@link graphic_representation.impl.MMGraphic_RepresentationImpl#isIsGeopalette <em>Is Geopalette</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMGraphic_RepresentationImpl extends MinimalEObjectImpl.Container implements MMGraphic_Representation {
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
	 * The cached value of the '{@link #getListRepresentations() <em>List Representations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListRepresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<Representation> listRepresentations;

	/**
	 * The default value of the '{@link #isIsGeopalette() <em>Is Geopalette</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGeopalette()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GEOPALETTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGeopalette() <em>Is Geopalette</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGeopalette()
	 * @generated
	 * @ordered
	 */
	protected boolean isGeopalette = IS_GEOPALETTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMGraphic_RepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.MM_GRAPHIC_REPRESENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Representation> getListRepresentations() {
		if (listRepresentations == null) {
			listRepresentations = new EObjectContainmentEList<Representation>(Representation.class, this, Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__LIST_REPRESENTATIONS);
		}
		return listRepresentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsGeopalette() {
		return isGeopalette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGeopalette(boolean newIsGeopalette) {
		boolean oldIsGeopalette = isGeopalette;
		isGeopalette = newIsGeopalette;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__IS_GEOPALETTE, oldIsGeopalette, isGeopalette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__LIST_REPRESENTATIONS:
				return ((InternalEList<?>)getListRepresentations()).basicRemove(otherEnd, msgs);
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
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__EXTENSION:
				return getExtension();
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__LIST_REPRESENTATIONS:
				return getListRepresentations();
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__IS_GEOPALETTE:
				return isIsGeopalette();
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
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__EXTENSION:
				setExtension((String)newValue);
				return;
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__LIST_REPRESENTATIONS:
				getListRepresentations().clear();
				getListRepresentations().addAll((Collection<? extends Representation>)newValue);
				return;
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__IS_GEOPALETTE:
				setIsGeopalette((Boolean)newValue);
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
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__LIST_REPRESENTATIONS:
				getListRepresentations().clear();
				return;
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__IS_GEOPALETTE:
				setIsGeopalette(IS_GEOPALETTE_EDEFAULT);
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
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__LIST_REPRESENTATIONS:
				return listRepresentations != null && !listRepresentations.isEmpty();
			case Graphic_representationPackage.MM_GRAPHIC_REPRESENTATION__IS_GEOPALETTE:
				return isGeopalette != IS_GEOPALETTE_EDEFAULT;
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
		result.append(" (extension: ");
		result.append(extension);
		result.append(", isGeopalette: ");
		result.append(isGeopalette);
		result.append(')');
		return result.toString();
	}

} //MMGraphic_RepresentationImpl
