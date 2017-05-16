/**
 */
package dslFilter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dslFilter.FilterContent#isNegative <em>Negative</em>}</li>
 *   <li>{@link dslFilter.FilterContent#isExecute <em>Execute</em>}</li>
 * </ul>
 * </p>
 *
 * @see dslFilter.DslFilterPackage#getFilterContent()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FilterContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative</em>' attribute.
	 * @see #setNegative(boolean)
	 * @see dslFilter.DslFilterPackage#getFilterContent_Negative()
	 * @model
	 * @generated
	 */
	boolean isNegative();

	/**
	 * Sets the value of the '{@link dslFilter.FilterContent#isNegative <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative</em>' attribute.
	 * @see #isNegative()
	 * @generated
	 */
	void setNegative(boolean value);

	/**
	 * Returns the value of the '<em><b>Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' attribute.
	 * @see #setExecute(boolean)
	 * @see dslFilter.DslFilterPackage#getFilterContent_Execute()
	 * @model
	 * @generated
	 */
	boolean isExecute();

	/**
	 * Sets the value of the '{@link dslFilter.FilterContent#isExecute <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute</em>' attribute.
	 * @see #isExecute()
	 * @generated
	 */
	void setExecute(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean Execute(EObject anEObject);

} // FilterContent
