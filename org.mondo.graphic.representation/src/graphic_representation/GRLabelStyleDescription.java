/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GR Label Style Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.GRLabelStyleDescription#getLabelFormat <em>Label Format</em>}</li>
 *   <li>{@link graphic_representation.GRLabelStyleDescription#isShowIcon <em>Show Icon</em>}</li>
 *   <li>{@link graphic_representation.GRLabelStyleDescription#getLabelPosition <em>Label Position</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getGRLabelStyleDescription()
 * @model abstract="true"
 * @generated
 */
public interface GRLabelStyleDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Format</b></em>' attribute list.
	 * The list contents are of type {@link graphic_representation.GRFontFormat}.
	 * The literals are from the enumeration {@link graphic_representation.GRFontFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Format</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Format</em>' attribute list.
	 * @see graphic_representation.GRFontFormat
	 * @see graphic_representation.Graphic_representationPackage#getGRLabelStyleDescription_LabelFormat()
	 * @model
	 * @generated
	 */
	EList<GRFontFormat> getLabelFormat();

	/**
	 * Returns the value of the '<em><b>Show Icon</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Icon</em>' attribute.
	 * @see #setShowIcon(boolean)
	 * @see graphic_representation.Graphic_representationPackage#getGRLabelStyleDescription_ShowIcon()
	 * @model default="false"
	 * @generated
	 */
	boolean isShowIcon();

	/**
	 * Sets the value of the '{@link graphic_representation.GRLabelStyleDescription#isShowIcon <em>Show Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Icon</em>' attribute.
	 * @see #isShowIcon()
	 * @generated
	 */
	void setShowIcon(boolean value);

	/**
	 * Returns the value of the '<em><b>Label Position</b></em>' attribute.
	 * The literals are from the enumeration {@link graphic_representation.LabelPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Position</em>' attribute.
	 * @see graphic_representation.LabelPosition
	 * @see #setLabelPosition(LabelPosition)
	 * @see graphic_representation.Graphic_representationPackage#getGRLabelStyleDescription_LabelPosition()
	 * @model
	 * @generated
	 */
	LabelPosition getLabelPosition();

	/**
	 * Sets the value of the '{@link graphic_representation.GRLabelStyleDescription#getLabelPosition <em>Label Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Position</em>' attribute.
	 * @see graphic_representation.LabelPosition
	 * @see #getLabelPosition()
	 * @generated
	 */
	void setLabelPosition(LabelPosition value);

} // GRLabelStyleDescription
