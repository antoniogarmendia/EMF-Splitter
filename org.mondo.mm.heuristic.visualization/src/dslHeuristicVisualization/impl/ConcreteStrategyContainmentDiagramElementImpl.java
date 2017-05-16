/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.ConcreteStrategyContainmentDiagramElement;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Strategy Containment Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.ConcreteStrategyContainmentDiagramElementImpl#getEClassNoElements <em>EClass No Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteStrategyContainmentDiagramElementImpl extends MinimalEObjectImpl.Container implements ConcreteStrategyContainmentDiagramElement {
	/**
	 * The cached value of the '{@link #getEClassNoElements() <em>EClass No Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassNoElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> eClassNoElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteStrategyContainmentDiagramElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getEClassNoElements() {
		if (eClassNoElements == null) {
			eClassNoElements = new EObjectResolvingEList<EClass>(EClass.class, this, DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT__ECLASS_NO_ELEMENTS);
		}
		return eClassNoElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated NOT
	 */
	public EList<EClass> PossibleElements(EClass rootEClass, EList<EList<Boolean>> pathMatrix, EList<EClass> listEClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<EClass> list_elements = new BasicEList<EClass>();
		eClassNoElements = new BasicEList<EClass>();
		if(rootEClass==null)			
			return listEClass;
		int index = listEClass.indexOf(rootEClass);
		int count_eclasses = listEClass.size();
		for (int i = 0; i < count_eclasses; i++) {
			//if(i!=index){//The Root Class cannot be a Diagram Element
				if(pathMatrix.get(index).get(i).equals(true) && listEClass.get(i).isAbstract()==false)
					list_elements.add(listEClass.get(i));
				else{
					if(listEClass.get(i).isAbstract() == false)
						eClassNoElements.add(listEClass.get(i));
				}
			//}			
		}	
		return list_elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT__ECLASS_NO_ELEMENTS:
				return getEClassNoElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT__ECLASS_NO_ELEMENTS:
				getEClassNoElements().clear();
				getEClassNoElements().addAll((Collection<? extends EClass>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT__ECLASS_NO_ELEMENTS:
				getEClassNoElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT__ECLASS_NO_ELEMENTS:
				return eClassNoElements != null && !eClassNoElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_CONTAINMENT_DIAGRAM_ELEMENT___POSSIBLE_ELEMENTS__ECLASS_ELIST_ELIST:
				return PossibleElements((EClass)arguments.get(0), (EList<EList<Boolean>>)arguments.get(1), (EList<EClass>)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteStrategyContainmentDiagramElementImpl
