/**
 */
package dslFilter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic CLogic Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dslFilter.BasicCLogicOperation#getAnEnumLogicOperation <em>An Enum Logic Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see dslFilter.DslFilterPackage#getBasicCLogicOperation()
 * @model
 * @generated
 */
public interface BasicCLogicOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>An Enum Logic Operation</b></em>' attribute list.
	 * The list contents are of type {@link dslFilter.EnumLogicOperation}.
	 * The literals are from the enumeration {@link dslFilter.EnumLogicOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Enum Logic Operation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Enum Logic Operation</em>' attribute list.
	 * @see dslFilter.EnumLogicOperation
	 * @see dslFilter.DslFilterPackage#getBasicCLogicOperation_AnEnumLogicOperation()
	 * @model
	 * @generated
	 */
	EList<EnumLogicOperation> getAnEnumLogicOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> EnumToStringArray();

} // BasicCLogicOperation
