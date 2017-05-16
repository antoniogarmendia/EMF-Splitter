/**
 */
package dslHeuristicVisualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Strategy Label Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.ConcreteStrategyLabelParameter#getLabel_parameter <em>Label parameter</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getConcreteStrategyLabelParameter()
 * @model
 * @generated
 */
public interface ConcreteStrategyLabelParameter extends StrategyLabel {

	/**
	 * Returns the value of the '<em><b>Label parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label parameter</em>' containment reference.
	 * @see #setLabel_parameter(LabelParameter)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getConcreteStrategyLabelParameter_Label_parameter()
	 * @model containment="true"
	 * @generated
	 */
	LabelParameter getLabel_parameter();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.ConcreteStrategyLabelParameter#getLabel_parameter <em>Label parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label parameter</em>' containment reference.
	 * @see #getLabel_parameter()
	 * @generated
	 */
	void setLabel_parameter(LabelParameter value);
} // ConcreteStrategyLabelParameter
