/**
 */
package mobile_server;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see mobile_server.Mobile_serverFactory
 * @model kind="package"
 * @generated
 */
public interface Mobile_serverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mobile_server";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://miso.org/mobile_server";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mobile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mobile_serverPackage eINSTANCE = mobile_server.impl.Mobile_serverPackageImpl.init();

	/**
	 * The meta object id for the '{@link mobile_server.impl.EcoreMDImpl <em>Ecore MD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mobile_server.impl.EcoreMDImpl
	 * @see mobile_server.impl.Mobile_serverPackageImpl#getEcoreMD()
	 * @generated
	 */
	int ECORE_MD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MD__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MD__URI = 2;

	/**
	 * The feature id for the '<em><b>List Palette</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MD__LIST_PALETTE = 3;

	/**
	 * The number of structural features of the '<em>Ecore MD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ecore MD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_MD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mobile_server.impl.JSONMobileImpl <em>JSON Mobile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mobile_server.impl.JSONMobileImpl
	 * @see mobile_server.impl.Mobile_serverPackageImpl#getJSONMobile()
	 * @generated
	 */
	int JSON_MOBILE = 1;

	/**
	 * The feature id for the '<em><b>List Ecores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_MOBILE__LIST_ECORES = 0;

	/**
	 * The number of structural features of the '<em>JSON Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_MOBILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>JSON Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_MOBILE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link mobile_server.impl.PaletteImpl <em>Palette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mobile_server.impl.PaletteImpl
	 * @see mobile_server.impl.Mobile_serverPackageImpl#getPalette()
	 * @generated
	 */
	int PALETTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Ecore URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__ECORE_URI = 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE__EXTENSION = 4;

	/**
	 * The number of structural features of the '<em>Palette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Palette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALETTE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mobile_server.EcoreMD <em>Ecore MD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore MD</em>'.
	 * @see mobile_server.EcoreMD
	 * @generated
	 */
	EClass getEcoreMD();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.EcoreMD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mobile_server.EcoreMD#getName()
	 * @see #getEcoreMD()
	 * @generated
	 */
	EAttribute getEcoreMD_Name();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.EcoreMD#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see mobile_server.EcoreMD#getContent()
	 * @see #getEcoreMD()
	 * @generated
	 */
	EAttribute getEcoreMD_Content();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.EcoreMD#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see mobile_server.EcoreMD#getUri()
	 * @see #getEcoreMD()
	 * @generated
	 */
	EAttribute getEcoreMD_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link mobile_server.EcoreMD#getListPalette <em>List Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Palette</em>'.
	 * @see mobile_server.EcoreMD#getListPalette()
	 * @see #getEcoreMD()
	 * @generated
	 */
	EReference getEcoreMD_ListPalette();

	/**
	 * Returns the meta object for class '{@link mobile_server.JSONMobile <em>JSON Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Mobile</em>'.
	 * @see mobile_server.JSONMobile
	 * @generated
	 */
	EClass getJSONMobile();

	/**
	 * Returns the meta object for the containment reference list '{@link mobile_server.JSONMobile#getListEcores <em>List Ecores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Ecores</em>'.
	 * @see mobile_server.JSONMobile#getListEcores()
	 * @see #getJSONMobile()
	 * @generated
	 */
	EReference getJSONMobile_ListEcores();

	/**
	 * Returns the meta object for class '{@link mobile_server.Palette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Palette</em>'.
	 * @see mobile_server.Palette
	 * @generated
	 */
	EClass getPalette();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.Palette#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mobile_server.Palette#getName()
	 * @see #getPalette()
	 * @generated
	 */
	EAttribute getPalette_Name();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.Palette#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see mobile_server.Palette#getContent()
	 * @see #getPalette()
	 * @generated
	 */
	EAttribute getPalette_Content();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.Palette#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mobile_server.Palette#getVersion()
	 * @see #getPalette()
	 * @generated
	 */
	EAttribute getPalette_Version();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.Palette#getEcoreURI <em>Ecore URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecore URI</em>'.
	 * @see mobile_server.Palette#getEcoreURI()
	 * @see #getPalette()
	 * @generated
	 */
	EAttribute getPalette_EcoreURI();

	/**
	 * Returns the meta object for the attribute '{@link mobile_server.Palette#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see mobile_server.Palette#getExtension()
	 * @see #getPalette()
	 * @generated
	 */
	EAttribute getPalette_Extension();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mobile_serverFactory getMobile_serverFactory();

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
		 * The meta object literal for the '{@link mobile_server.impl.EcoreMDImpl <em>Ecore MD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mobile_server.impl.EcoreMDImpl
		 * @see mobile_server.impl.Mobile_serverPackageImpl#getEcoreMD()
		 * @generated
		 */
		EClass ECORE_MD = eINSTANCE.getEcoreMD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_MD__NAME = eINSTANCE.getEcoreMD_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_MD__CONTENT = eINSTANCE.getEcoreMD_Content();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECORE_MD__URI = eINSTANCE.getEcoreMD_Uri();

		/**
		 * The meta object literal for the '<em><b>List Palette</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECORE_MD__LIST_PALETTE = eINSTANCE.getEcoreMD_ListPalette();

		/**
		 * The meta object literal for the '{@link mobile_server.impl.JSONMobileImpl <em>JSON Mobile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mobile_server.impl.JSONMobileImpl
		 * @see mobile_server.impl.Mobile_serverPackageImpl#getJSONMobile()
		 * @generated
		 */
		EClass JSON_MOBILE = eINSTANCE.getJSONMobile();

		/**
		 * The meta object literal for the '<em><b>List Ecores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_MOBILE__LIST_ECORES = eINSTANCE.getJSONMobile_ListEcores();

		/**
		 * The meta object literal for the '{@link mobile_server.impl.PaletteImpl <em>Palette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mobile_server.impl.PaletteImpl
		 * @see mobile_server.impl.Mobile_serverPackageImpl#getPalette()
		 * @generated
		 */
		EClass PALETTE = eINSTANCE.getPalette();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PALETTE__NAME = eINSTANCE.getPalette_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PALETTE__CONTENT = eINSTANCE.getPalette_Content();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PALETTE__VERSION = eINSTANCE.getPalette_Version();

		/**
		 * The meta object literal for the '<em><b>Ecore URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PALETTE__ECORE_URI = eINSTANCE.getPalette_EcoreURI();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PALETTE__EXTENSION = eINSTANCE.getPalette_Extension();

	}

} //Mobile_serverPackage
