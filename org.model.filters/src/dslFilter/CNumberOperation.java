/**
 */
package dslFilter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CNumber Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dslFilter.CNumberOperation#getAnNumberOperation <em>An Number Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see dslFilter.DslFilterPackage#getCNumberOperation()
 * @model
 * @generated
 */
public interface CNumberOperation extends Rule {
	/**
	 * Returns the value of the '<em><b>An Number Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link dslFilter.EnumNumberOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Number Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Number Operation</em>' attribute.
	 * @see dslFilter.EnumNumberOperation
	 * @see #setAnNumberOperation(EnumNumberOperation)
	 * @see dslFilter.DslFilterPackage#getCNumberOperation_AnNumberOperation()
	 * @model
	 * @generated
	 */
	EnumNumberOperation getAnNumberOperation();

	/**
	 * Sets the value of the '{@link dslFilter.CNumberOperation#getAnNumberOperation <em>An Number Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An Number Operation</em>' attribute.
	 * @see dslFilter.EnumNumberOperation
	 * @see #getAnNumberOperation()
	 * @generated
	 */
	void setAnNumberOperation(EnumNumberOperation value);

} // CNumberOperation
