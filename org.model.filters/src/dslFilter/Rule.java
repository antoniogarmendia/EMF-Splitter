/**
 */
package dslFilter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dslFilter.Rule#getAnExp <em>An Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see dslFilter.DslFilterPackage#getRule()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>An Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Exp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Exp</em>' attribute.
	 * @see #setAnExp(String)
	 * @see dslFilter.DslFilterPackage#getRule_AnExp()
	 * @model
	 * @generated
	 */
	String getAnExp();

	/**
	 * Sets the value of the '{@link dslFilter.Rule#getAnExp <em>An Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An Exp</em>' attribute.
	 * @see #getAnExp()
	 * @generated
	 */
	void setAnExp(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean SatifiesRule(Object value);

} // Rule
