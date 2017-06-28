/**
 */
package ScopeDefinition;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ScopeDefinition.ScopeRule#getEClass <em>EClass</em>}</li>
 *   <li>{@link ScopeDefinition.ScopeRule#getScopeDefinition <em>Scope Definition</em>}</li>
 *   <li>{@link ScopeDefinition.ScopeRule#getEReference <em>EReference</em>}</li>
 * </ul>
 *
 * @see ScopeDefinition.ScopeDefinitionPackage#getScopeRule()
 * @model
 * @generated
 */
public interface ScopeRule extends EObject {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see ScopeDefinition.ScopeDefinitionPackage#getScopeRule_EClass()
	 * @model
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link ScopeDefinition.ScopeRule#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Scope Definition</b></em>' attribute.
	 * The literals are from the enumeration {@link ScopeDefinition.ScopeDefinitionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Definition</em>' attribute.
	 * @see ScopeDefinition.ScopeDefinitionEnum
	 * @see #setScopeDefinition(ScopeDefinitionEnum)
	 * @see ScopeDefinition.ScopeDefinitionPackage#getScopeRule_ScopeDefinition()
	 * @model
	 * @generated
	 */
	ScopeDefinitionEnum getScopeDefinition();

	/**
	 * Sets the value of the '{@link ScopeDefinition.ScopeRule#getScopeDefinition <em>Scope Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Definition</em>' attribute.
	 * @see ScopeDefinition.ScopeDefinitionEnum
	 * @see #getScopeDefinition()
	 * @generated
	 */
	void setScopeDefinition(ScopeDefinitionEnum value);

	/**
	 * Returns the value of the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference</em>' reference.
	 * @see #setEReference(EReference)
	 * @see ScopeDefinition.ScopeDefinitionPackage#getScopeRule_EReference()
	 * @model
	 * @generated
	 */
	EReference getEReference();

	/**
	 * Sets the value of the '{@link ScopeDefinition.ScopeRule#getEReference <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference</em>' reference.
	 * @see #getEReference()
	 * @generated
	 */
	void setEReference(EReference value);

} // ScopeRule
