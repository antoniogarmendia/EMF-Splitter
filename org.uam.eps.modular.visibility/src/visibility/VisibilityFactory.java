/**
 */
package visibility;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see visibility.VisibilityPackage
 * @generated
 */
public interface VisibilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisibilityFactory eINSTANCE = visibility.impl.VisibilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Metamodel Visibility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Visibility</em>'.
	 * @generated
	 */
	MetamodelVisibility createMetamodelVisibility();

	/**
	 * Returns a new object of class '<em>Visibility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility</em>'.
	 * @generated
	 */
	Visibility createVisibility();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VisibilityPackage getVisibilityPackage();

} //VisibilityFactory
