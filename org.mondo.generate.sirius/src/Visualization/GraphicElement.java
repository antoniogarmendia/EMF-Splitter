/**
 */
package Visualization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Visualization.GraphicElement#getColor <em>Color</em>}</li>
 *   <li>{@link Visualization.GraphicElement#getPaletteName <em>Palette Name</em>}</li>
 *   <li>{@link Visualization.GraphicElement#getPaletteIconPath <em>Palette Icon Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see Visualization.VisualizationPackage#getGraphicElement()
 * @model abstract="true"
 * @generated
 */
public interface GraphicElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see Visualization.VisualizationPackage#getGraphicElement_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link Visualization.GraphicElement#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Palette Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette Name</em>' attribute.
	 * @see #setPaletteName(String)
	 * @see Visualization.VisualizationPackage#getGraphicElement_PaletteName()
	 * @model
	 * @generated
	 */
	String getPaletteName();

	/**
	 * Sets the value of the '{@link Visualization.GraphicElement#getPaletteName <em>Palette Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette Name</em>' attribute.
	 * @see #getPaletteName()
	 * @generated
	 */
	void setPaletteName(String value);

	/**
	 * Returns the value of the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette Icon Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette Icon Path</em>' attribute.
	 * @see #setPaletteIconPath(String)
	 * @see Visualization.VisualizationPackage#getGraphicElement_PaletteIconPath()
	 * @model
	 * @generated
	 */
	String getPaletteIconPath();

	/**
	 * Sets the value of the '{@link Visualization.GraphicElement#getPaletteIconPath <em>Palette Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette Icon Path</em>' attribute.
	 * @see #getPaletteIconPath()
	 * @generated
	 */
	void setPaletteIconPath(String value);

} // GraphicElement
