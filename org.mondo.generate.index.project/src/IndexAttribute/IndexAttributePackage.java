/**
 */
package IndexAttribute;

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
 * @see IndexAttribute.IndexAttributeFactory
 * @model kind="package"
 * @generated
 */
public interface IndexAttributePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IndexAttribute";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.dsl.org/mmPatterns/indexattribute";

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
	IndexAttributePackage eINSTANCE = IndexAttribute.impl.IndexAttributePackageImpl.init();

	/**
	 * The meta object id for the '{@link IndexAttribute.impl.IndexClassImpl <em>Index Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IndexAttribute.impl.IndexClassImpl
	 * @see IndexAttribute.impl.IndexAttributePackageImpl#getIndexClass()
	 * @generated
	 */
	int INDEX_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Index Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CLASS__INDEX_ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Index Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Index Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CLASS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link IndexAttribute.IndexClass <em>Index Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Class</em>'.
	 * @see IndexAttribute.IndexClass
	 * @generated
	 */
	EClass getIndexClass();

	/**
	 * Returns the meta object for the attribute '{@link IndexAttribute.IndexClass#getIndexAttribute <em>Index Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Attribute</em>'.
	 * @see IndexAttribute.IndexClass#getIndexAttribute()
	 * @see #getIndexClass()
	 * @generated
	 */
	EAttribute getIndexClass_IndexAttribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IndexAttributeFactory getIndexAttributeFactory();

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
		 * The meta object literal for the '{@link IndexAttribute.impl.IndexClassImpl <em>Index Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IndexAttribute.impl.IndexClassImpl
		 * @see IndexAttribute.impl.IndexAttributePackageImpl#getIndexClass()
		 * @generated
		 */
		EClass INDEX_CLASS = eINSTANCE.getIndexClass();

		/**
		 * The meta object literal for the '<em><b>Index Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_CLASS__INDEX_ATTRIBUTE = eINSTANCE.getIndexClass_IndexAttribute();

	}

} //IndexAttributePackage
