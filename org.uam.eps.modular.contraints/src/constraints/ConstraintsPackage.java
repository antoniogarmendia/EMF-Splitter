/**
 */
package constraints;

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
 * @see constraints.ConstraintsFactory
 * @model kind="package"
 * @generated
 */
public interface ConstraintsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constraints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://miso.es/constraints";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cons";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintsPackage eINSTANCE = constraints.impl.ConstraintsPackageImpl.init();

	/**
	 * The meta object id for the '{@link constraints.impl.MetamodelConstraintImpl <em>Metamodel Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constraints.impl.MetamodelConstraintImpl
	 * @see constraints.impl.ConstraintsPackageImpl#getMetamodelConstraint()
	 * @generated
	 */
	int METAMODEL_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CONSTRAINT__METAMODEL = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CONSTRAINT__CONSTRAINTS = 1;

	/**
	 * The number of structural features of the '<em>Metamodel Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metamodel Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link constraints.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constraints.impl.ConstraintImpl
	 * @see constraints.impl.ConstraintsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ERROR_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ECLASS = 3;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__RESULT = 4;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DEFINITION = 5;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link constraints.ConstraintDefinition <em>Constraint Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see constraints.ConstraintDefinition
	 * @see constraints.impl.ConstraintsPackageImpl#getConstraintDefinition()
	 * @generated
	 */
	int CONSTRAINT_DEFINITION = 2;


	/**
	 * Returns the meta object for class '{@link constraints.MetamodelConstraint <em>Metamodel Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Constraint</em>'.
	 * @see constraints.MetamodelConstraint
	 * @generated
	 */
	EClass getMetamodelConstraint();

	/**
	 * Returns the meta object for the attribute '{@link constraints.MetamodelConstraint#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel</em>'.
	 * @see constraints.MetamodelConstraint#getMetamodel()
	 * @see #getMetamodelConstraint()
	 * @generated
	 */
	EAttribute getMetamodelConstraint_Metamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link constraints.MetamodelConstraint#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see constraints.MetamodelConstraint#getConstraints()
	 * @see #getMetamodelConstraint()
	 * @generated
	 */
	EReference getMetamodelConstraint_Constraints();

	/**
	 * Returns the meta object for class '{@link constraints.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see constraints.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link constraints.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see constraints.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link constraints.Constraint#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see constraints.Constraint#getStatement()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Statement();

	/**
	 * Returns the meta object for the attribute '{@link constraints.Constraint#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see constraints.Constraint#getErrorMessage()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_ErrorMessage();

	/**
	 * Returns the meta object for the reference '{@link constraints.Constraint#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see constraints.Constraint#getEClass()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_EClass();

	/**
	 * Returns the meta object for the attribute '{@link constraints.Constraint#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see constraints.Constraint#getResult()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Result();

	/**
	 * Returns the meta object for the attribute '{@link constraints.Constraint#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see constraints.Constraint#getDefinition()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Definition();

	/**
	 * Returns the meta object for enum '{@link constraints.ConstraintDefinition <em>Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Definition</em>'.
	 * @see constraints.ConstraintDefinition
	 * @generated
	 */
	EEnum getConstraintDefinition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintsFactory getConstraintsFactory();

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
		 * The meta object literal for the '{@link constraints.impl.MetamodelConstraintImpl <em>Metamodel Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constraints.impl.MetamodelConstraintImpl
		 * @see constraints.impl.ConstraintsPackageImpl#getMetamodelConstraint()
		 * @generated
		 */
		EClass METAMODEL_CONSTRAINT = eINSTANCE.getMetamodelConstraint();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_CONSTRAINT__METAMODEL = eINSTANCE.getMetamodelConstraint_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_CONSTRAINT__CONSTRAINTS = eINSTANCE.getMetamodelConstraint_Constraints();

		/**
		 * The meta object literal for the '{@link constraints.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constraints.impl.ConstraintImpl
		 * @see constraints.impl.ConstraintsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__STATEMENT = eINSTANCE.getConstraint_Statement();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__ERROR_MESSAGE = eINSTANCE.getConstraint_ErrorMessage();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__ECLASS = eINSTANCE.getConstraint_EClass();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__RESULT = eINSTANCE.getConstraint_Result();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__DEFINITION = eINSTANCE.getConstraint_Definition();

		/**
		 * The meta object literal for the '{@link constraints.ConstraintDefinition <em>Constraint Definition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see constraints.ConstraintDefinition
		 * @see constraints.impl.ConstraintsPackageImpl#getConstraintDefinition()
		 * @generated
		 */
		EEnum CONSTRAINT_DEFINITION = eINSTANCE.getConstraintDefinition();

	}

} //ConstraintsPackage
