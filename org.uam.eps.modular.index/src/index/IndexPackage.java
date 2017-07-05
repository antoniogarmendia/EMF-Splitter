/**
 */
package index;

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
 * @see index.IndexFactory
 * @model kind="package"
 * @generated
 */
public interface IndexPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "index";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://miso.es/index";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "index";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IndexPackage eINSTANCE = index.impl.IndexPackageImpl.init();

	/**
	 * The meta object id for the '{@link index.impl.MetamodelIndexImpl <em>Metamodel Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see index.impl.MetamodelIndexImpl
	 * @see index.impl.IndexPackageImpl#getMetamodelIndex()
	 * @generated
	 */
	int METAMODEL_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Meta Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_INDEX__META_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_INDEX__INDEXES = 1;

	/**
	 * The number of structural features of the '<em>Metamodel Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_INDEX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metamodel Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_INDEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link index.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see index.impl.IndexImpl
	 * @see index.impl.IndexPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 1;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ECLASS = 0;

	/**
	 * The feature id for the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__EATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link index.MetamodelIndex <em>Metamodel Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Index</em>'.
	 * @see index.MetamodelIndex
	 * @generated
	 */
	EClass getMetamodelIndex();

	/**
	 * Returns the meta object for the attribute '{@link index.MetamodelIndex#getMetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Model</em>'.
	 * @see index.MetamodelIndex#getMetaModel()
	 * @see #getMetamodelIndex()
	 * @generated
	 */
	EAttribute getMetamodelIndex_MetaModel();

	/**
	 * Returns the meta object for the containment reference list '{@link index.MetamodelIndex#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexes</em>'.
	 * @see index.MetamodelIndex#getIndexes()
	 * @see #getMetamodelIndex()
	 * @generated
	 */
	EReference getMetamodelIndex_Indexes();

	/**
	 * Returns the meta object for class '{@link index.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see index.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the reference '{@link index.Index#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see index.Index#getEClass()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_EClass();

	/**
	 * Returns the meta object for the reference '{@link index.Index#getEAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAttribute</em>'.
	 * @see index.Index#getEAttribute()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_EAttribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IndexFactory getIndexFactory();

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
		 * The meta object literal for the '{@link index.impl.MetamodelIndexImpl <em>Metamodel Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see index.impl.MetamodelIndexImpl
		 * @see index.impl.IndexPackageImpl#getMetamodelIndex()
		 * @generated
		 */
		EClass METAMODEL_INDEX = eINSTANCE.getMetamodelIndex();

		/**
		 * The meta object literal for the '<em><b>Meta Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_INDEX__META_MODEL = eINSTANCE.getMetamodelIndex_MetaModel();

		/**
		 * The meta object literal for the '<em><b>Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_INDEX__INDEXES = eINSTANCE.getMetamodelIndex_Indexes();

		/**
		 * The meta object literal for the '{@link index.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see index.impl.IndexImpl
		 * @see index.impl.IndexPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__ECLASS = eINSTANCE.getIndex_EClass();

		/**
		 * The meta object literal for the '<em><b>EAttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__EATTRIBUTE = eINSTANCE.getIndex_EAttribute();

	}

} //IndexPackage
