/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.ConcreteStrategyDefaultNodeSelection;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Strategy Default Node Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConcreteStrategyDefaultNodeSelectionImpl extends MinimalEObjectImpl.Container implements ConcreteStrategyDefaultNodeSelection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteStrategyDefaultNodeSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.CONCRETE_STRATEGY_DEFAULT_NODE_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean IsNode(EClass anEClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		if(anEClass.isAbstract())
			return false;
		else
			return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_DEFAULT_NODE_SELECTION___IS_NODE__ECLASS:
				return IsNode((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteStrategyDefaultNodeSelectionImpl
