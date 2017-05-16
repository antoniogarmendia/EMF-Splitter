/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.ConcreteStrategyDefaultDirection;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import graphic_representation.Edge_Direction;
import graphic_representation.Graphic_representationFactory;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Strategy Default Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConcreteStrategyDefaultDirectionImpl extends MinimalEObjectImpl.Container implements ConcreteStrategyDefaultDirection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteStrategyDefaultDirectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.CONCRETE_STRATEGY_DEFAULT_DIRECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Edge_Direction Get_Direction(EClass anEClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Edge_Direction dir = Graphic_representationFactory.eINSTANCE.createEdge_Direction();
		dir.setSourceLink(Graphic_representationFactory.eINSTANCE.createLink());
		dir.setTargetLink(Graphic_representationFactory.eINSTANCE.createLink());
		boolean end = false;
		EReference ref = null;
		for (int i = 0; i < anEClass.getEAllReferences().size(); i++) {
			ref = anEClass.getEAllReferences().get(i);
			if(!ref.isContainment())
			{
				if(end==false)
				{
					
					dir.getSourceLink().setAnEReference(ref);
					end=true;
				}
				else
				{
					dir.getTargetLink().setAnEReference(ref);			
					return dir;
				}
			}
		}
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_DEFAULT_DIRECTION___GET_DIRECTION__ECLASS:
				return Get_Direction((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteStrategyDefaultDirectionImpl
