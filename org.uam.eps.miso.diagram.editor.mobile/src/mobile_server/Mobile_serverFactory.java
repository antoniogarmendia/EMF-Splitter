/**
 */
package mobile_server;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mobile_server.Mobile_serverPackage
 * @generated
 */
public interface Mobile_serverFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mobile_serverFactory eINSTANCE = mobile_server.impl.Mobile_serverFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ecore MD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore MD</em>'.
	 * @generated
	 */
	EcoreMD createEcoreMD();

	/**
	 * Returns a new object of class '<em>JSON Mobile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSON Mobile</em>'.
	 * @generated
	 */
	JSONMobile createJSONMobile();

	/**
	 * Returns a new object of class '<em>Palette</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Palette</em>'.
	 * @generated
	 */
	Palette createPalette();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Mobile_serverPackage getMobile_serverPackage();

} //Mobile_serverFactory
