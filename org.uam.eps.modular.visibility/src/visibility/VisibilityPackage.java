/**
 */
package visibility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see visibility.VisibilityFactory
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
	String eNAME = "visibility";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://miso.es/visibility";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisibilityPackage eINSTANCE = visibility.impl.VisibilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link visibility.impl.MetamodelVisibilityImpl <em>Metamodel Visibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visibility.impl.MetamodelVisibilityImpl
	 * @see visibility.impl.VisibilityPackageImpl#getMetamodelVisibility()
	 * @generated
	 */
	int METAMODEL_VISIBILITY = 0;

	/**
	 * The feature id for the '<em><b>Meta Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VISIBILITY__META_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Visibility Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VISIBILITY__VISIBILITY_RULES = 1;

	/**
	 * The number of structural features of the '<em>Metamodel Visibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VISIBILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metamodel Visibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VISIBILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link visibility.impl.VisibilityImpl <em>Visibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visibility.impl.VisibilityImpl
	 * @see visibility.impl.VisibilityPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 1;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__ECLASS = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__VISIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Visibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Visibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link visibility.VisibilityDefinition <em>Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visibility.VisibilityDefinition
	 * @see visibility.impl.VisibilityPackageImpl#getVisibilityDefinition()
	 * @generated
	 */
	int VISIBILITY_DEFINITION = 2;


	/**
	 * Returns the meta object for class '{@link visibility.MetamodelVisibility <em>Metamodel Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Visibility</em>'.
	 * @see visibility.MetamodelVisibility
	 * @generated
	 */
	EClass getMetamodelVisibility();

	/**
	 * Returns the meta object for the attribute '{@link visibility.MetamodelVisibility#getMetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Model</em>'.
	 * @see visibility.MetamodelVisibility#getMetaModel()
	 * @see #getMetamodelVisibility()
	 * @generated
	 */
	EAttribute getMetamodelVisibility_MetaModel();

	/**
	 * Returns the meta object for the containment reference list '{@link visibility.MetamodelVisibility#getVisibilityRules <em>Visibility Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visibility Rules</em>'.
	 * @see visibility.MetamodelVisibility#getVisibilityRules()
	 * @see #getMetamodelVisibility()
	 * @generated
	 */
	EReference getMetamodelVisibility_VisibilityRules();

	/**
	 * Returns the meta object for class '{@link visibility.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility</em>'.
	 * @see visibility.Visibility
	 * @generated
	 */
	EClass getVisibility();

	/**
	 * Returns the meta object for the reference '{@link visibility.Visibility#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see visibility.Visibility#getEClass()
	 * @see #getVisibility()
	 * @generated
	 */
	EReference getVisibility_EClass();

	/**
	 * Returns the meta object for the attribute '{@link visibility.Visibility#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see visibility.Visibility#getVisibility()
	 * @see #getVisibility()
	 * @generated
	 */
	EAttribute getVisibility_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link visibility.Visibility#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see visibility.Visibility#getExpression()
	 * @see #getVisibility()
	 * @generated
	 */
	EAttribute getVisibility_Expression();

	/**
	 * Returns the meta object for enum '{@link visibility.VisibilityDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Definition</em>'.
	 * @see visibility.VisibilityDefinition
	 * @generated
	 */
	EEnum getVisibilityDefinition();

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
		 * The meta object literal for the '{@link visibility.impl.MetamodelVisibilityImpl <em>Metamodel Visibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visibility.impl.MetamodelVisibilityImpl
		 * @see visibility.impl.VisibilityPackageImpl#getMetamodelVisibility()
		 * @generated
		 */
		EClass METAMODEL_VISIBILITY = eINSTANCE.getMetamodelVisibility();

		/**
		 * The meta object literal for the '<em><b>Meta Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_VISIBILITY__META_MODEL = eINSTANCE.getMetamodelVisibility_MetaModel();

		/**
		 * The meta object literal for the '<em><b>Visibility Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_VISIBILITY__VISIBILITY_RULES = eINSTANCE.getMetamodelVisibility_VisibilityRules();

		/**
		 * The meta object literal for the '{@link visibility.impl.VisibilityImpl <em>Visibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visibility.impl.VisibilityImpl
		 * @see visibility.impl.VisibilityPackageImpl#getVisibility()
		 * @generated
		 */
		EClass VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY__ECLASS = eINSTANCE.getVisibility_EClass();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY__VISIBILITY = eINSTANCE.getVisibility_Visibility();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY__EXPRESSION = eINSTANCE.getVisibility_Expression();

		/**
		 * The meta object literal for the '{@link visibility.VisibilityDefinition <em>Definition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visibility.VisibilityDefinition
		 * @see visibility.impl.VisibilityPackageImpl#getVisibilityDefinition()
		 * @generated
		 */
		EEnum VISIBILITY_DEFINITION = eINSTANCE.getVisibilityDefinition();

	}

} //VisibilityPackage
