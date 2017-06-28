/**
 */
package ScopeDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Model Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ScopeDefinition.MetaModelScope#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link ScopeDefinition.MetaModelScope#getScopeRules <em>Scope Rules</em>}</li>
 * </ul>
 *
 * @see ScopeDefinition.ScopeDefinitionPackage#getMetaModelScope()
 * @model
 * @generated
 */
public interface MetaModelScope extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model</em>' attribute.
	 * @see #setMetaModel(String)
	 * @see ScopeDefinition.ScopeDefinitionPackage#getMetaModelScope_MetaModel()
	 * @model
	 * @generated
	 */
	String getMetaModel();

	/**
	 * Sets the value of the '{@link ScopeDefinition.MetaModelScope#getMetaModel <em>Meta Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model</em>' attribute.
	 * @see #getMetaModel()
	 * @generated
	 */
	void setMetaModel(String value);

	/**
	 * Returns the value of the '<em><b>Scope Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ScopeDefinition.ScopeRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Rules</em>' containment reference list.
	 * @see ScopeDefinition.ScopeDefinitionPackage#getMetaModelScope_ScopeRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScopeRule> getScopeRules();

} // MetaModelScope
