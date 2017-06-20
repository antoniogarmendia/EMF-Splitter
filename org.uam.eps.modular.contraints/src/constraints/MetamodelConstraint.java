/**
 */
package constraints;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link constraints.MetamodelConstraint#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link constraints.MetamodelConstraint#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see constraints.ConstraintsPackage#getMetamodelConstraint()
 * @model
 * @generated
 */
public interface MetamodelConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' attribute.
	 * @see #setMetamodel(String)
	 * @see constraints.ConstraintsPackage#getMetamodelConstraint_Metamodel()
	 * @model
	 * @generated
	 */
	String getMetamodel();

	/**
	 * Sets the value of the '{@link constraints.MetamodelConstraint#getMetamodel <em>Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' attribute.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link constraints.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see constraints.ConstraintsPackage#getMetamodelConstraint_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // MetamodelConstraint
