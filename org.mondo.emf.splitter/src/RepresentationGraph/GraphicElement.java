/**
 */
package RepresentationGraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RepresentationGraph.GraphicElement#getColor <em>Color</em>}</li>
 *   <li>{@link RepresentationGraph.GraphicElement#getPaletteName <em>Palette Name</em>}</li>
 *   <li>{@link RepresentationGraph.GraphicElement#getPaletteIconPath <em>Palette Icon Path</em>}</li>
 * </ul>
 *
 * @see RepresentationGraph.RepresentationGraphPackage#getGraphicElement()
 * @model abstract="true"
 * @generated
 */
public interface GraphicElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"blue"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see RepresentationGraph.RepresentationGraphPackage#getGraphicElement_Color()
	 * @model default="blue"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link RepresentationGraph.GraphicElement#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Palette Name</b></em>' attribute.
	 * The default value is <code>"palette"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette Name</em>' attribute.
	 * @see #setPaletteName(String)
	 * @see RepresentationGraph.RepresentationGraphPackage#getGraphicElement_PaletteName()
	 * @model default="palette"
	 * @generated
	 */
	String getPaletteName();

	/**
	 * Sets the value of the '{@link RepresentationGraph.GraphicElement#getPaletteName <em>Palette Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette Name</em>' attribute.
	 * @see #getPaletteName()
	 * @generated
	 */
	void setPaletteName(String value);

	/**
	 * Returns the value of the '<em><b>Palette Icon Path</b></em>' attribute.
	 * The default value is <code>"iconPath"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette Icon Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette Icon Path</em>' attribute.
	 * @see #setPaletteIconPath(String)
	 * @see RepresentationGraph.RepresentationGraphPackage#getGraphicElement_PaletteIconPath()
	 * @model default="iconPath"
	 * @generated
	 */
	String getPaletteIconPath();

	/**
	 * Sets the value of the '{@link RepresentationGraph.GraphicElement#getPaletteIconPath <em>Palette Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette Icon Path</em>' attribute.
	 * @see #getPaletteIconPath()
	 * @generated
	 */
	void setPaletteIconPath(String value);

} // GraphicElement
