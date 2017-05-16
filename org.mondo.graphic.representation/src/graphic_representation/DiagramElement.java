/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.DiagramElement#getAnEClass <em>An EClass</em>}</li>
 *   <li>{@link graphic_representation.DiagramElement#getDiag_palette <em>Diag palette</em>}</li>
 *   <li>{@link graphic_representation.DiagramElement#getContainerReference <em>Container Reference</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getDiagramElement()
 * @model
 * @generated
 */
public interface DiagramElement extends AllElements {
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
	 * @see graphic_representation.Graphic_representationPackage#getDiagramElement_AnEClass()
	 * @model
	 * @generated
	 */
	EClass getAnEClass();

	/**
	 * Sets the value of the '{@link graphic_representation.DiagramElement#getAnEClass <em>An EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An EClass</em>' reference.
	 * @see #getAnEClass()
	 * @generated
	 */
	void setAnEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Diag palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diag palette</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diag palette</em>' containment reference.
	 * @see #setDiag_palette(PaletteDescription)
	 * @see graphic_representation.Graphic_representationPackage#getDiagramElement_Diag_palette()
	 * @model containment="true"
	 * @generated
	 */
	PaletteDescription getDiag_palette();

	/**
	 * Sets the value of the '{@link graphic_representation.DiagramElement#getDiag_palette <em>Diag palette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diag palette</em>' containment reference.
	 * @see #getDiag_palette()
	 * @generated
	 */
	void setDiag_palette(PaletteDescription value);

	/**
	 * Returns the value of the '<em><b>Container Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Reference</em>' reference list.
	 * @see graphic_representation.Graphic_representationPackage#getDiagramElement_ContainerReference()
	 * @model
	 * @generated
	 */
	EList<EReference> getContainerReference();

} // DiagramElement
