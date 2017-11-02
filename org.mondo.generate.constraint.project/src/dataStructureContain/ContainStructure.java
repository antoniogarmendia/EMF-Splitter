/**
 */
package dataStructureContain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contain Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataStructureContain.ContainStructure#getPackagesUnits <em>Packages Units</em>}</li>
 * </ul>
 *
 * @see dataStructureContain.DataStructureContainPackage#getContainStructure()
 * @model
 * @generated
 */
public interface ContainStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Packages Units</b></em>' containment reference list.
	 * The list contents are of type {@link dataStructureContain.PackageUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages Units</em>' containment reference list.
	 * @see dataStructureContain.DataStructureContainPackage#getContainStructure_PackagesUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageUnit> getPackagesUnits();

} // ContainStructure
