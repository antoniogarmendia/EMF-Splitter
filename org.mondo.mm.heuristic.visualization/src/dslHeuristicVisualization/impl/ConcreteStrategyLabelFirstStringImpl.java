/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.ConcreteStrategyLabelFirstString;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Strategy Label First String</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConcreteStrategyLabelFirstStringImpl extends MinimalEObjectImpl.Container implements ConcreteStrategyLabelFirstString {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteStrategyLabelFirstStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.CONCRETE_STRATEGY_LABEL_FIRST_STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EAttribute GetLabel(EClass anEClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<EAttribute> list_attr = anEClass.getEAllAttributes();
		for (int i = 0; i < list_attr.size(); i++) {
			if(list_attr.get(i).getEType().getInstanceClass().getName().contains("String"))
				return list_attr.get(i);		
		}		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_LABEL_FIRST_STRING___GET_LABEL__ECLASS:
				return GetLabel((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteStrategyLabelFirstStringImpl
