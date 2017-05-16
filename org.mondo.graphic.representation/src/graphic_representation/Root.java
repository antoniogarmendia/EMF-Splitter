/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.Root#getAnEClass <em>An EClass</em>}</li>
 *   <li>{@link graphic_representation.Root#getRoot_node_elements <em>Root node elements</em>}</li>
 *   <li>{@link graphic_representation.Root#getRoot_shape <em>Root shape</em>}</li>
 *   <li>{@link graphic_representation.Root#getRootLayer <em>Root Layer</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>An EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An EClass</em>' reference.
	 * @see #setAnEClass(EClass)
	 * @see graphic_representation.Graphic_representationPackage#getRoot_AnEClass()
	 * @model
	 * @generated
	 */
	EClass getAnEClass();

	/**
	 * Sets the value of the '{@link graphic_representation.Root#getAnEClass <em>An EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An EClass</em>' reference.
	 * @see #getAnEClass()
	 * @generated
	 */
	void setAnEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Root node elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root node elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root node elements</em>' containment reference.
	 * @see #setRoot_node_elements(Node_Element)
	 * @see graphic_representation.Graphic_representationPackage#getRoot_Root_node_elements()
	 * @model containment="true"
	 * @generated
	 */
	Node_Element getRoot_node_elements();

	/**
	 * Sets the value of the '{@link graphic_representation.Root#getRoot_node_elements <em>Root node elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root node elements</em>' containment reference.
	 * @see #getRoot_node_elements()
	 * @generated
	 */
	void setRoot_node_elements(Node_Element value);

	/**
	 * Returns the value of the '<em><b>Root shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root shape</em>' containment reference.
	 * @see #setRoot_shape(Shape)
	 * @see graphic_representation.Graphic_representationPackage#getRoot_Root_shape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getRoot_shape();

	/**
	 * Sets the value of the '{@link graphic_representation.Root#getRoot_shape <em>Root shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root shape</em>' containment reference.
	 * @see #getRoot_shape()
	 * @generated
	 */
	void setRoot_shape(Shape value);

	/**
	 * Returns the value of the '<em><b>Root Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Layer</em>' reference.
	 * @see #setRootLayer(Layer)
	 * @see graphic_representation.Graphic_representationPackage#getRoot_RootLayer()
	 * @model
	 * @generated
	 */
	Layer getRootLayer();

	/**
	 * Sets the value of the '{@link graphic_representation.Root#getRootLayer <em>Root Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Layer</em>' reference.
	 * @see #getRootLayer()
	 * @generated
	 */
	void setRootLayer(Layer value);

} // Root
