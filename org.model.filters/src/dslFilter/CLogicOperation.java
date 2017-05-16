/**
 */
package dslFilter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLogic Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dslFilter.CLogicOperation#getAnLogicOperation <em>An Logic Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see dslFilter.DslFilterPackage#getCLogicOperation()
 * @model
 * @generated
 */
public interface CLogicOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>An Logic Operation</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link dslFilter.EnumLogicOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Logic Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Logic Operation</em>' attribute.
	 * @see dslFilter.EnumLogicOperation
	 * @see #setAnLogicOperation(EnumLogicOperation)
	 * @see dslFilter.DslFilterPackage#getCLogicOperation_AnLogicOperation()
	 * @model default="AND"
	 * @generated
	 */
	EnumLogicOperation getAnLogicOperation();

	/**
	 * Sets the value of the '{@link dslFilter.CLogicOperation#getAnLogicOperation <em>An Logic Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An Logic Operation</em>' attribute.
	 * @see dslFilter.EnumLogicOperation
	 * @see #getAnLogicOperation()
	 * @generated
	 */
	void setAnLogicOperation(EnumLogicOperation value);

} // CLogicOperation
