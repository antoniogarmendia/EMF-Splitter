/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MM Graphic Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.MMGraphic_Representation#getExtension <em>Extension</em>}</li>
 *   <li>{@link graphic_representation.MMGraphic_Representation#getListRepresentations <em>List Representations</em>}</li>
 *   <li>{@link graphic_representation.MMGraphic_Representation#isIsGeopalette <em>Is Geopalette</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getMMGraphic_Representation()
 * @model
 * @generated
 */
public interface MMGraphic_Representation extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see graphic_representation.Graphic_representationPackage#getMMGraphic_Representation_Extension()
	 * @model
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link graphic_representation.MMGraphic_Representation#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>List Representations</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.Representation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Representations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Representations</em>' containment reference list.
	 * @see graphic_representation.Graphic_representationPackage#getMMGraphic_Representation_ListRepresentations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Representation> getListRepresentations();

	/**
	 * Returns the value of the '<em><b>Is Geopalette</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Geopalette</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Geopalette</em>' attribute.
	 * @see #setIsGeopalette(boolean)
	 * @see graphic_representation.Graphic_representationPackage#getMMGraphic_Representation_IsGeopalette()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsGeopalette();

	/**
	 * Sets the value of the '{@link graphic_representation.MMGraphic_Representation#isIsGeopalette <em>Is Geopalette</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Geopalette</em>' attribute.
	 * @see #isIsGeopalette()
	 * @generated
	 */
	void setIsGeopalette(boolean value);

} // MMGraphic_Representation
