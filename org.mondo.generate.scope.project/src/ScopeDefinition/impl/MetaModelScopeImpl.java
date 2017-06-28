/**
 */
package ScopeDefinition.impl;

import ScopeDefinition.MetaModelScope;
import ScopeDefinition.ScopeDefinitionPackage;
import ScopeDefinition.ScopeRule;

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
 * An implementation of the model object '<em><b>Meta Model Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ScopeDefinition.impl.MetaModelScopeImpl#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link ScopeDefinition.impl.MetaModelScopeImpl#getScopeRules <em>Scope Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaModelScopeImpl extends MinimalEObjectImpl.Container implements MetaModelScope {
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
	 * The cached value of the '{@link #getScopeRules() <em>Scope Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeRules()
	 * @generated
	 * @ordered
	 */
	protected EList<ScopeRule> scopeRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModelScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScopeDefinitionPackage.Literals.META_MODEL_SCOPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScopeDefinitionPackage.META_MODEL_SCOPE__META_MODEL, oldMetaModel, metaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScopeRule> getScopeRules() {
		if (scopeRules == null) {
			scopeRules = new EObjectContainmentEList<ScopeRule>(ScopeRule.class, this, ScopeDefinitionPackage.META_MODEL_SCOPE__SCOPE_RULES);
		}
		return scopeRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScopeDefinitionPackage.META_MODEL_SCOPE__SCOPE_RULES:
				return ((InternalEList<?>)getScopeRules()).basicRemove(otherEnd, msgs);
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
			case ScopeDefinitionPackage.META_MODEL_SCOPE__META_MODEL:
				return getMetaModel();
			case ScopeDefinitionPackage.META_MODEL_SCOPE__SCOPE_RULES:
				return getScopeRules();
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
			case ScopeDefinitionPackage.META_MODEL_SCOPE__META_MODEL:
				setMetaModel((String)newValue);
				return;
			case ScopeDefinitionPackage.META_MODEL_SCOPE__SCOPE_RULES:
				getScopeRules().clear();
				getScopeRules().addAll((Collection<? extends ScopeRule>)newValue);
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
			case ScopeDefinitionPackage.META_MODEL_SCOPE__META_MODEL:
				setMetaModel(META_MODEL_EDEFAULT);
				return;
			case ScopeDefinitionPackage.META_MODEL_SCOPE__SCOPE_RULES:
				getScopeRules().clear();
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
			case ScopeDefinitionPackage.META_MODEL_SCOPE__META_MODEL:
				return META_MODEL_EDEFAULT == null ? metaModel != null : !META_MODEL_EDEFAULT.equals(metaModel);
			case ScopeDefinitionPackage.META_MODEL_SCOPE__SCOPE_RULES:
				return scopeRules != null && !scopeRules.isEmpty();
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

} //MetaModelScopeImpl
