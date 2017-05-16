/**
 */
package splitterLibrary;

import java.util.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Index Comparator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link splitterLibrary.ArrayIndexComparator#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see splitterLibrary.SplitterLibraryPackage#getArrayIndexComparator()
 * @model superTypes="splitterLibrary.Comparator<org.eclipse.emf.ecore.EIntegerObject>"
 * @generated
 */
public interface ArrayIndexComparator extends EObject, Comparator<Integer> {

	/**
	 * Returns the value of the '<em><b>Array</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' attribute list.
	 * @see splitterLibrary.SplitterLibraryPackage#getArrayIndexComparator_Array()
	 * @model
	 * @generated
	 */
	EList<Integer> getArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayMany="true"
	 * @generated
	 */
	EList<Integer> createIndexArray(EList<Integer> array);

} // ArrayIndexComparator
