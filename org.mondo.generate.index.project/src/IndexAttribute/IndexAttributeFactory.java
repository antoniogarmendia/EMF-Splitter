/**
 */
package IndexAttribute;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see IndexAttribute.IndexAttributePackage
 * @generated
 */
public interface IndexAttributeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IndexAttributeFactory eINSTANCE = IndexAttribute.impl.IndexAttributeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Index Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Class</em>'.
	 * @generated
	 */
	IndexClass createIndexClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IndexAttributePackage getIndexAttributePackage();

} //IndexAttributeFactory
