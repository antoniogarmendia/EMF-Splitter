/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.LabelParameter#getList_label <em>List label</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getLabelParameter()
 * @model
 * @generated
 */
public interface LabelParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>List label</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List label</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List label</em>' attribute list.
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getLabelParameter_List_label()
	 * @model
	 * @generated
	 */
	EList<String> getList_label();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toCommaSeparatedStringLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void DefaultParameters();

} // LabelParameter
