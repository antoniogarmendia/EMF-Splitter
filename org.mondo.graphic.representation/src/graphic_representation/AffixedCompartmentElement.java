/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affixed Compartment Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.AffixedCompartmentElement#getAnEReference <em>An EReference</em>}</li>
 *   <li>{@link graphic_representation.AffixedCompartmentElement#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getAffixedCompartmentElement()
 * @model abstract="true"
 * @generated
 */
public interface AffixedCompartmentElement extends EObject {
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
	 * @see graphic_representation.Graphic_representationPackage#getAffixedCompartmentElement_AnEReference()
	 * @model
	 * @generated
	 */
	EReference getAnEReference();

	/**
	 * Sets the value of the '{@link graphic_representation.AffixedCompartmentElement#getAnEReference <em>An EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An EReference</em>' reference.
	 * @see #getAnEReference()
	 * @generated
	 */
	void setAnEReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link graphic_representation.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see graphic_representation.Graphic_representationPackage#getAffixedCompartmentElement_Nodes()
	 * @model
	 * @generated
	 */
	EList<Node> getNodes();

} // AffixedCompartmentElement
