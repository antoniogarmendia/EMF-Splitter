/**
 */
package splitterLibrary;

import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IComparator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link splitterLibrary.IComparator#getComparator <em>Comparator</em>}</li>
 * </ul>
 * </p>
 *
 * @see splitterLibrary.SplitterLibraryPackage#getIComparator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IComparator extends EObject {

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' reference.
	 * @see #setComparator(Comparator)
	 * @see splitterLibrary.SplitterLibraryPackage#getIComparator_Comparator()
	 * @model type="splitterLibrary.Comparator<org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	Comparator<Integer> getComparator();

	/**
	 * Sets the value of the '{@link splitterLibrary.IComparator#getComparator <em>Comparator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' reference.
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(Comparator<Integer> value);
} // IComparator
