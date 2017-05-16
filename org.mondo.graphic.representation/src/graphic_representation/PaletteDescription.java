/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Palette Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.PaletteDescription#getIcon_filepath <em>Icon filepath</em>}</li>
 *   <li>{@link graphic_representation.PaletteDescription#getPalette_name <em>Palette name</em>}</li>
 *   <li>{@link graphic_representation.PaletteDescription#isIsDraggable <em>Is Draggable</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getPaletteDescription()
 * @model
 * @generated
 */
public interface PaletteDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Icon filepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon filepath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon filepath</em>' attribute.
	 * @see #setIcon_filepath(String)
	 * @see graphic_representation.Graphic_representationPackage#getPaletteDescription_Icon_filepath()
	 * @model
	 * @generated
	 */
	String getIcon_filepath();

	/**
	 * Sets the value of the '{@link graphic_representation.PaletteDescription#getIcon_filepath <em>Icon filepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon filepath</em>' attribute.
	 * @see #getIcon_filepath()
	 * @generated
	 */
	void setIcon_filepath(String value);

	/**
	 * Returns the value of the '<em><b>Palette name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette name</em>' attribute.
	 * @see #setPalette_name(String)
	 * @see graphic_representation.Graphic_representationPackage#getPaletteDescription_Palette_name()
	 * @model
	 * @generated
	 */
	String getPalette_name();

	/**
	 * Sets the value of the '{@link graphic_representation.PaletteDescription#getPalette_name <em>Palette name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette name</em>' attribute.
	 * @see #getPalette_name()
	 * @generated
	 */
	void setPalette_name(String value);

	/**
	 * Returns the value of the '<em><b>Is Draggable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Draggable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Draggable</em>' attribute.
	 * @see #setIsDraggable(boolean)
	 * @see graphic_representation.Graphic_representationPackage#getPaletteDescription_IsDraggable()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsDraggable();

	/**
	 * Sets the value of the '{@link graphic_representation.PaletteDescription#isIsDraggable <em>Is Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Draggable</em>' attribute.
	 * @see #isIsDraggable()
	 * @generated
	 */
	void setIsDraggable(boolean value);

} // PaletteDescription
