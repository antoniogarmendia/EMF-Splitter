/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphic Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.GraphicRepresentation#getAllGraphicRepresentation <em>All Graphic Representation</em>}</li>
 *   <li>{@link graphic_representation.GraphicRepresentation#getName <em>Name</em>}</li>
 *   <li>{@link graphic_representation.GraphicRepresentation#getUserColors <em>User Colors</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getGraphicRepresentation()
 * @model
 * @generated
 */
public interface GraphicRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>All Graphic Representation</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.MMGraphic_Representation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Graphic Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Graphic Representation</em>' containment reference list.
	 * @see graphic_representation.Graphic_representationPackage#getGraphicRepresentation_AllGraphicRepresentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<MMGraphic_Representation> getAllGraphicRepresentation();

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
	 * @see graphic_representation.Graphic_representationPackage#getGraphicRepresentation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link graphic_representation.GraphicRepresentation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>User Colors</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.GRUserColor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Colors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Colors</em>' containment reference list.
	 * @see graphic_representation.Graphic_representationPackage#getGraphicRepresentation_UserColors()
	 * @model containment="true"
	 * @generated
	 */
	EList<GRUserColor> getUserColors();

} // GraphicRepresentation
