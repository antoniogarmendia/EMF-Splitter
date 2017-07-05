/**
 */
package ScopeDefinition.impl;

import ScopeDefinition.ScopeDefinitionEnum;
import ScopeDefinition.ScopeDefinitionPackage;
import ScopeDefinition.ScopeRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ScopeDefinition.impl.ScopeRuleImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link ScopeDefinition.impl.ScopeRuleImpl#getScopeDefinition <em>Scope Definition</em>}</li>
 *   <li>{@link ScopeDefinition.impl.ScopeRuleImpl#getEReference <em>EReference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeRuleImpl extends MinimalEObjectImpl.Container implements ScopeRule {
	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * The default value of the '{@link #getScopeDefinition() <em>Scope Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeDefinitionEnum SCOPE_DEFINITION_EDEFAULT = ScopeDefinitionEnum.SAME_WORKSPACE;

	/**
	 * The cached value of the '{@link #getScopeDefinition() <em>Scope Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeDefinition()
	 * @generated
	 * @ordered
	 */
	protected ScopeDefinitionEnum scopeDefinition = SCOPE_DEFINITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEReference() <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference()
	 * @generated
	 * @ordered
	 */
	protected EReference eReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScopeDefinitionPackage.Literals.SCOPE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject)eClass;
			eClass = (EClass)eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScopeDefinitionPackage.SCOPE_RULE__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopeDefinitionPackage.SCOPE_RULE__ECLASS, oldEClass, eClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDefinitionEnum getScopeDefinition() {
		return scopeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeDefinition(ScopeDefinitionEnum newScopeDefinition) {
		ScopeDefinitionEnum oldScopeDefinition = scopeDefinition;
		scopeDefinition = newScopeDefinition == null ? SCOPE_DEFINITION_EDEFAULT : newScopeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopeDefinitionPackage.SCOPE_RULE__SCOPE_DEFINITION, oldScopeDefinition, scopeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference() {
		if (eReference != null && eReference.eIsProxy()) {
			InternalEObject oldEReference = (InternalEObject)eReference;
			eReference = (EReference)eResolveProxy(oldEReference);
			if (eReference != oldEReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScopeDefinitionPackage.SCOPE_RULE__EREFERENCE, oldEReference, eReference));
			}
		}
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetEReference() {
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference(EReference newEReference) {
		EReference oldEReference = eReference;
		eReference = newEReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopeDefinitionPackage.SCOPE_RULE__EREFERENCE, oldEReference, eReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScopeDefinitionPackage.SCOPE_RULE__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case ScopeDefinitionPackage.SCOPE_RULE__SCOPE_DEFINITION:
				return getScopeDefinition();
			case ScopeDefinitionPackage.SCOPE_RULE__EREFERENCE:
				if (resolve) return getEReference();
				return basicGetEReference();
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
			case ScopeDefinitionPackage.SCOPE_RULE__ECLASS:
				setEClass((EClass)newValue);
				return;
			case ScopeDefinitionPackage.SCOPE_RULE__SCOPE_DEFINITION:
				setScopeDefinition((ScopeDefinitionEnum)newValue);
				return;
			case ScopeDefinitionPackage.SCOPE_RULE__EREFERENCE:
				setEReference((EReference)newValue);
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
			case ScopeDefinitionPackage.SCOPE_RULE__ECLASS:
				setEClass((EClass)null);
				return;
			case ScopeDefinitionPackage.SCOPE_RULE__SCOPE_DEFINITION:
				setScopeDefinition(SCOPE_DEFINITION_EDEFAULT);
				return;
			case ScopeDefinitionPackage.SCOPE_RULE__EREFERENCE:
				setEReference((EReference)null);
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
			case ScopeDefinitionPackage.SCOPE_RULE__ECLASS:
				return eClass != null;
			case ScopeDefinitionPackage.SCOPE_RULE__SCOPE_DEFINITION:
				return scopeDefinition != SCOPE_DEFINITION_EDEFAULT;
			case ScopeDefinitionPackage.SCOPE_RULE__EREFERENCE:
				return eReference != null;
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
		result.append(" (scopeDefinition: ");
		result.append(scopeDefinition);
		result.append(')');
		return result.toString();
	}

} //ScopeRuleImpl
