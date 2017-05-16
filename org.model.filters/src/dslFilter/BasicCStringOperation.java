/**
 */
package dslFilter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic CString Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dslFilter.BasicCStringOperation#getAnEnumStringOperation <em>An Enum String Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see dslFilter.DslFilterPackage#getBasicCStringOperation()
 * @model
 * @generated
 */
public interface BasicCStringOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>An Enum String Operation</b></em>' attribute list.
	 * The list contents are of type {@link dslFilter.EnumStringOperation}.
	 * The literals are from the enumeration {@link dslFilter.EnumStringOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Enum String Operation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Enum String Operation</em>' attribute list.
	 * @see dslFilter.EnumStringOperation
	 * @see dslFilter.DslFilterPackage#getBasicCStringOperation_AnEnumStringOperation()
	 * @model
	 * @generated
	 */
	EList<EnumStringOperation> getAnEnumStringOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> EnumToStringArray();

} // BasicCStringOperation
