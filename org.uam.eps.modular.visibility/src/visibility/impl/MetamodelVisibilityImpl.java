/**
 */
package visibility.impl;

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

import visibility.MetamodelVisibility;
import visibility.Visibility;
import visibility.VisibilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel Visibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link visibility.impl.MetamodelVisibilityImpl#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link visibility.impl.MetamodelVisibilityImpl#getVisibilityRules <em>Visibility Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetamodelVisibilityImpl extends MinimalEObjectImpl.Container implements MetamodelVisibility {
	/**
	 * The default value of the '{@link #getMetaModel() <em>Meta Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModel()
	 * @generated
	 * @ordered
	 */
	protected static final String META_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaModel() <em>Meta Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModel()
	 * @generated
	 * @ordered
	 */
	protected String metaModel = META_MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisibilityRules() <em>Visibility Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Visibility> visibilityRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelVisibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisibilityPackage.Literals.METAMODEL_VISIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaModel() {
		return metaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModel(String newMetaModel) {
		String oldMetaModel = metaModel;
		metaModel = newMetaModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.METAMODEL_VISIBILITY__META_MODEL, oldMetaModel, metaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Visibility> getVisibilityRules() {
		if (visibilityRules == null) {
			visibilityRules = new EObjectContainmentEList<Visibility>(Visibility.class, this, VisibilityPackage.METAMODEL_VISIBILITY__VISIBILITY_RULES);
		}
		return visibilityRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisibilityPackage.METAMODEL_VISIBILITY__VISIBILITY_RULES:
				return ((InternalEList<?>)getVisibilityRules()).basicRemove(otherEnd, msgs);
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
			case VisibilityPackage.METAMODEL_VISIBILITY__META_MODEL:
				return getMetaModel();
			case VisibilityPackage.METAMODEL_VISIBILITY__VISIBILITY_RULES:
				return getVisibilityRules();
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
			case VisibilityPackage.METAMODEL_VISIBILITY__META_MODEL:
				setMetaModel((String)newValue);
				return;
			case VisibilityPackage.METAMODEL_VISIBILITY__VISIBILITY_RULES:
				getVisibilityRules().clear();
				getVisibilityRules().addAll((Collection<? extends Visibility>)newValue);
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
			case VisibilityPackage.METAMODEL_VISIBILITY__META_MODEL:
				setMetaModel(META_MODEL_EDEFAULT);
				return;
			case VisibilityPackage.METAMODEL_VISIBILITY__VISIBILITY_RULES:
				getVisibilityRules().clear();
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
			case VisibilityPackage.METAMODEL_VISIBILITY__META_MODEL:
				return META_MODEL_EDEFAULT == null ? metaModel != null : !META_MODEL_EDEFAULT.equals(metaModel);
			case VisibilityPackage.METAMODEL_VISIBILITY__VISIBILITY_RULES:
				return visibilityRules != null && !visibilityRules.isEmpty();
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
		result.append(" (metaModel: ");
		result.append(metaModel);
		result.append(')');
		return result.toString();
	}

} //MetamodelVisibilityImpl
