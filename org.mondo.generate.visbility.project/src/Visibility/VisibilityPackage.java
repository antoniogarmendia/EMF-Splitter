/**
 */
package Visibility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Visibility.VisibilityFactory
 * @model kind="package"
 * @generated
 */
public interface VisibilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Visibility";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.dsl.org/mmPatterns/visibility";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "visibility";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisibilityPackage eINSTANCE = Visibility.impl.VisibilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link Visibility.impl.VisibilityClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Visibility.impl.VisibilityClassImpl
	 * @see Visibility.impl.VisibilityPackageImpl#getVisibilityClass()
	 * @generated
	 */
	int VISIBILITY_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Eol Expression WS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CLASS__EOL_EXPRESSION_WS = 0;

	/**
	 * The feature id for the '<em><b>Eol Expression Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CLASS__EOL_EXPRESSION_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Eol Expression Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CLASS__EOL_EXPRESSION_PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_CLASS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Visibility.VisibilityClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see Visibility.VisibilityClass
	 * @generated
	 */
	EClass getVisibilityClass();

	/**
	 * Returns the meta object for the attribute '{@link Visibility.VisibilityClass#getEolExpressionWS <em>Eol Expression WS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eol Expression WS</em>'.
	 * @see Visibility.VisibilityClass#getEolExpressionWS()
	 * @see #getVisibilityClass()
	 * @generated
	 */
	EAttribute getVisibilityClass_EolExpressionWS();

	/**
	 * Returns the meta object for the attribute '{@link Visibility.VisibilityClass#getEolExpressionProject <em>Eol Expression Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eol Expression Project</em>'.
	 * @see Visibility.VisibilityClass#getEolExpressionProject()
	 * @see #getVisibilityClass()
	 * @generated
	 */
	EAttribute getVisibilityClass_EolExpressionProject();

	/**
	 * Returns the meta object for the attribute '{@link Visibility.VisibilityClass#getEolExpressionPackage <em>Eol Expression Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eol Expression Package</em>'.
	 * @see Visibility.VisibilityClass#getEolExpressionPackage()
	 * @see #getVisibilityClass()
	 * @generated
	 */
	EAttribute getVisibilityClass_EolExpressionPackage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisibilityFactory getVisibilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Visibility.impl.VisibilityClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Visibility.impl.VisibilityClassImpl
		 * @see Visibility.impl.VisibilityPackageImpl#getVisibilityClass()
		 * @generated
		 */
		EClass VISIBILITY_CLASS = eINSTANCE.getVisibilityClass();

		/**
		 * The meta object literal for the '<em><b>Eol Expression WS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_CLASS__EOL_EXPRESSION_WS = eINSTANCE.getVisibilityClass_EolExpressionWS();

		/**
		 * The meta object literal for the '<em><b>Eol Expression Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_CLASS__EOL_EXPRESSION_PROJECT = eINSTANCE.getVisibilityClass_EolExpressionProject();

		/**
		 * The meta object literal for the '<em><b>Eol Expression Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_CLASS__EOL_EXPRESSION_PACKAGE = eINSTANCE.getVisibilityClass_EolExpressionPackage();

	}

} //VisibilityPackage
