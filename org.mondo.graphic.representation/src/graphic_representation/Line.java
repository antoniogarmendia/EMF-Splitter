/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.Line#getFeatureReference <em>Feature Reference</em>}</li>
 *   <li>{@link graphic_representation.Line#getListEClasses <em>List EClasses</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getLine()
 * @model abstract="true"
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Reference</em>' reference.
	 * @see #setFeatureReference(EReference)
	 * @see graphic_representation.Graphic_representationPackage#getLine_FeatureReference()
	 * @model
	 * @generated
	 */
	EReference getFeatureReference();

	/**
	 * Sets the value of the '{@link graphic_representation.Line#getFeatureReference <em>Feature Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Reference</em>' reference.
	 * @see #getFeatureReference()
	 * @generated
	 */
	void setFeatureReference(EReference value);

	/**
	 * Returns the value of the '<em><b>List EClasses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List EClasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List EClasses</em>' reference list.
	 * @see graphic_representation.Graphic_representationPackage#getLine_ListEClasses()
	 * @model
	 * @generated
	 */
	EList<EClass> getListEClasses();

} // Line
