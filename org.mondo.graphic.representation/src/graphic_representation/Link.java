/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.Link#getAnEReference <em>An EReference</em>}</li>
 *   <li>{@link graphic_representation.Link#getAnDiagramElement <em>An Diagram Element</em>}</li>
 *   <li>{@link graphic_representation.Link#getDecoratorName <em>Decorator Name</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>An EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An EReference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An EReference</em>' reference.
	 * @see #setAnEReference(EReference)
	 * @see graphic_representation.Graphic_representationPackage#getLink_AnEReference()
	 * @model
	 * @generated
	 */
	EReference getAnEReference();

	/**
	 * Sets the value of the '{@link graphic_representation.Link#getAnEReference <em>An EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An EReference</em>' reference.
	 * @see #getAnEReference()
	 * @generated
	 */
	void setAnEReference(EReference value);

	/**
	 * Returns the value of the '<em><b>An Diagram Element</b></em>' reference list.
	 * The list contents are of type {@link graphic_representation.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Diagram Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Diagram Element</em>' reference list.
	 * @see graphic_representation.Graphic_representationPackage#getLink_AnDiagramElement()
	 * @model
	 * @generated
	 */
	EList<Node> getAnDiagramElement();

	/**
	 * Returns the value of the '<em><b>Decorator Name</b></em>' attribute.
	 * The default value is <code>"NoDecoration"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decorator Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorator Name</em>' attribute.
	 * @see #setDecoratorName(String)
	 * @see graphic_representation.Graphic_representationPackage#getLink_DecoratorName()
	 * @model default="NoDecoration"
	 * @generated
	 */
	String getDecoratorName();

	/**
	 * Sets the value of the '{@link graphic_representation.Link#getDecoratorName <em>Decorator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decorator Name</em>' attribute.
	 * @see #getDecoratorName()
	 * @generated
	 */
	void setDecoratorName(String value);

} // Link
