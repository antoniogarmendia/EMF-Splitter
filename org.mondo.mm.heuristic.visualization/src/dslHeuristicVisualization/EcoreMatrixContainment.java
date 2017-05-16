/**
 */
package dslHeuristicVisualization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecore Matrix Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.EcoreMatrixContainment#getDirect_MatrixContainment <em>Direct Matrix Containment</em>}</li>
 *   <li>{@link dslHeuristicVisualization.EcoreMatrixContainment#getPathMatrix <em>Path Matrix</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getEcoreMatrixContainment()
 * @model
 * @generated
 */
public interface EcoreMatrixContainment extends EObject {
	/**
	 * Returns the value of the '<em><b>Direct Matrix Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Matrix Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Matrix Containment</em>' attribute.
	 * @see #setDirect_MatrixContainment(EList)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getEcoreMatrixContainment_Direct_MatrixContainment()
	 * @model unique="false" many="false" transient="true"
	 * @generated
	 */
	EList<EList<Boolean>> getDirect_MatrixContainment();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.EcoreMatrixContainment#getDirect_MatrixContainment <em>Direct Matrix Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Matrix Containment</em>' attribute.
	 * @see #getDirect_MatrixContainment()
	 * @generated
	 */
	void setDirect_MatrixContainment(EList<EList<Boolean>> value);

	/**
	 * Returns the value of the '<em><b>Path Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Matrix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Matrix</em>' attribute.
	 * @see #setPathMatrix(EList)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getEcoreMatrixContainment_PathMatrix()
	 * @model unique="false" many="false" transient="true"
	 * @generated
	 */
	EList<EList<Boolean>> getPathMatrix();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.EcoreMatrixContainment#getPathMatrix <em>Path Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Matrix</em>' attribute.
	 * @see #getPathMatrix()
	 * @generated
	 */
	void setPathMatrix(EList<EList<Boolean>> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Integer GetParent(Integer index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listEClassMany="true"
	 * @generated
	 */
	Boolean GetDirectMatrixContainment(EList<EClass> listEClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean GetPathMatrix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CopyMatrix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listEClassMany="true"
	 * @generated
	 */
	void PrintDirectMatrixContainment(EList<EClass> listEClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listEClassMany="true"
	 * @generated
	 */
	EList<EClass> getEAllChilds(EClass eClass, EList<EClass> listEClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Integer> getAllParents(Integer index);

} // EcoreMatrixContainment
