/**
 */
package splitterLibrary;

import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see splitterLibrary.SplitterLibraryPackage
 * @generated
 */
public interface SplitterLibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SplitterLibraryFactory eINSTANCE = splitterLibrary.impl.SplitterLibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Create Eclipse Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Eclipse Project</em>'.
	 * @generated
	 */
	CreateEclipseProject createCreateEclipseProject();

	/**
	 * Returns a new object of class '<em>Gen Model EMF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Model EMF</em>'.
	 * @generated
	 */
	GenModelEMF createGenModelEMF();

	/**
	 * Returns a new object of class '<em>Ecore EMF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore EMF</em>'.
	 * @generated
	 */
	EcoreEMF createEcoreEMF();

	/**
	 * Returns a new object of class '<em>DT Project Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DT Project Description</em>'.
	 * @generated
	 */
	IProjectDescription createDTProjectDescription();

	/**
	 * Returns a new object of class '<em>Array Index Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Index Comparator</em>'.
	 * @generated
	 */
	ArrayIndexComparator createArrayIndexComparator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SplitterLibraryPackage getSplitterLibraryPackage();

} //SplitterLibraryFactory
