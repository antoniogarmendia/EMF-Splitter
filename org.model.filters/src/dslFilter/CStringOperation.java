/**
 */
package dslFilter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CString Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dslFilter.CStringOperation#getAnStringOperation <em>An String Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see dslFilter.DslFilterPackage#getCStringOperation()
 * @model
 * @generated
 */
public interface CStringOperation extends Rule {
	/**
	 * Returns the value of the '<em><b>An String Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link dslFilter.EnumStringOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An String Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An String Operation</em>' attribute.
	 * @see dslFilter.EnumStringOperation
	 * @see #setAnStringOperation(EnumStringOperation)
	 * @see dslFilter.DslFilterPackage#getCStringOperation_AnStringOperation()
	 * @model
	 * @generated
	 */
	EnumStringOperation getAnStringOperation();

	/**
	 * Sets the value of the '{@link dslFilter.CStringOperation#getAnStringOperation <em>An String Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An String Operation</em>' attribute.
	 * @see dslFilter.EnumStringOperation
	 * @see #getAnStringOperation()
	 * @generated
	 */
	void setAnStringOperation(EnumStringOperation value);

} // CStringOperation
