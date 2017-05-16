/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expandable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.ExpandableItem#getIndex <em>Index</em>}</li>
 *   <li>{@link graphic_representation.ExpandableItem#getAnEReference <em>An EReference</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getExpandableItem()
 * @model
 * @generated
 */
public interface ExpandableItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see graphic_representation.Graphic_representationPackage#getExpandableItem_Index()
	 * @model default="0"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link graphic_representation.ExpandableItem#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

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
	 * @see graphic_representation.Graphic_representationPackage#getExpandableItem_AnEReference()
	 * @model
	 * @generated
	 */
	EReference getAnEReference();

	/**
	 * Sets the value of the '{@link graphic_representation.ExpandableItem#getAnEReference <em>An EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An EReference</em>' reference.
	 * @see #getAnEReference()
	 * @generated
	 */
	void setAnEReference(EReference value);

} // ExpandableItem
