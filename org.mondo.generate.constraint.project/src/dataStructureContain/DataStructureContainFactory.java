/**
 */
package dataStructureContain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dataStructureContain.DataStructureContainPackage
 * @generated
 */
public interface DataStructureContainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataStructureContainFactory eINSTANCE = dataStructureContain.impl.DataStructureContainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contain Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contain Structure</em>'.
	 * @generated
	 */
	ContainStructure createContainStructure();

	/**
	 * Returns a new object of class '<em>Package Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Unit</em>'.
	 * @generated
	 */
	PackageUnit createPackageUnit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataStructureContainPackage getDataStructureContainPackage();

} //DataStructureContainFactory
