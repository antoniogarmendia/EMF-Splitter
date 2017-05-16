/**
 */
package dslFilter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic CNumber Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dslFilter.BasicCNumberOperation#getAnEnumNumberOperation <em>An Enum Number Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see dslFilter.DslFilterPackage#getBasicCNumberOperation()
 * @model
 * @generated
 */
public interface BasicCNumberOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>An Enum Number Operation</b></em>' attribute list.
	 * The list contents are of type {@link dslFilter.EnumNumberOperation}.
	 * The literals are from the enumeration {@link dslFilter.EnumNumberOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Enum Number Operation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Enum Number Operation</em>' attribute list.
	 * @see dslFilter.EnumNumberOperation
	 * @see dslFilter.DslFilterPackage#getBasicCNumberOperation_AnEnumNumberOperation()
	 * @model
	 * @generated
	 */
	EList<EnumNumberOperation> getAnEnumNumberOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> EnumToStringArray();

} // BasicCNumberOperation
