/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.ConcreteStrategyLabelIdentifier;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Strategy Label Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConcreteStrategyLabelIdentifierImpl extends MinimalEObjectImpl.Container implements ConcreteStrategyLabelIdentifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteStrategyLabelIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.CONCRETE_STRATEGY_LABEL_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EAttribute GetLabel(EClass anEClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return anEClass.getEIDAttribute();	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_IDENTIFIER___GET_LABEL__ECLASS:
				return GetLabel((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteStrategyLabelIdentifierImpl
