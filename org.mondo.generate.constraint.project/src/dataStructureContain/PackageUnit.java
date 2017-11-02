/**
 */
package dataStructureContain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataStructureContain.PackageUnit#getAnEClass <em>An EClass</em>}</li>
 *   <li>{@link dataStructureContain.PackageUnit#getContains <em>Contains</em>}</li>
 *   <li>{@link dataStructureContain.PackageUnit#isUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see dataStructureContain.DataStructureContainPackage#getPackageUnit()
 * @model
 * @generated
 */
public interface PackageUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>An EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An EClass</em>' reference.
	 * @see #setAnEClass(EClass)
	 * @see dataStructureContain.DataStructureContainPackage#getPackageUnit_AnEClass()
	 * @model
	 * @generated
	 */
	EClass getAnEClass();

	/**
	 * Sets the value of the '{@link dataStructureContain.PackageUnit#getAnEClass <em>An EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An EClass</em>' reference.
	 * @see #getAnEClass()
	 * @generated
	 */
	void setAnEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see dataStructureContain.DataStructureContainPackage#getPackageUnit_Contains()
	 * @model
	 * @generated
	 */
	EList<EClass> getContains();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(boolean)
	 * @see dataStructureContain.DataStructureContainPackage#getPackageUnit_Unit()
	 * @model default="true"
	 * @generated
	 */
	boolean isUnit();

	/**
	 * Sets the value of the '{@link dataStructureContain.PackageUnit#isUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #isUnit()
	 * @generated
	 */
	void setUnit(boolean value);

} // PackageUnit
