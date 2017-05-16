/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation DD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.RepresentationDD#getName <em>Name</em>}</li>
 *   <li>{@link graphic_representation.RepresentationDD#getRoot <em>Root</em>}</li>
 *   <li>{@link graphic_representation.RepresentationDD#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getRepresentationDD()
 * @model
 * @generated
 */
public interface RepresentationDD extends Representation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see graphic_representation.Graphic_representationPackage#getRepresentationDD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link graphic_representation.RepresentationDD#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Root)
	 * @see graphic_representation.Graphic_representationPackage#getRepresentationDD_Root()
	 * @model containment="true"
	 * @generated
	 */
	Root getRoot();

	/**
	 * Sets the value of the '{@link graphic_representation.RepresentationDD#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Root value);

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see graphic_representation.Graphic_representationPackage#getRepresentationDD_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayers();

} // RepresentationDD
