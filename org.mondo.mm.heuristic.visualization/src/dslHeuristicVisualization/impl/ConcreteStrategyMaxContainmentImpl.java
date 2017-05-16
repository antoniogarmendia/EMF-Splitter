/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.ConcreteStrategyMaxContainment;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import splitterLibrary.ArrayIndexComparator;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Strategy Max Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConcreteStrategyMaxContainmentImpl extends MinimalEObjectImpl.Container implements ConcreteStrategyMaxContainment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteStrategyMaxContainmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.CONCRETE_STRATEGY_MAX_CONTAINMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EClass Get_Root(EList<EList<Boolean>> ContainmentMatrix, EList<EClass> listEClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<EClass> list_roots = List_Root(ContainmentMatrix,listEClass);
		if(list_roots.size()>0){		
			return list_roots.get(0);
		}
		else
			return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EClass> List_Root(EList<EList<Boolean>> ContainmentMatrix, EList<EClass> listEClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		//Integer[] count_containment = new Integer[ContainmentMatrix.size()];
		int count_matrix = ContainmentMatrix.size();
		EList<Integer> count_containment = new BasicEList<Integer>(count_matrix);
		for (int i = 0; i < count_matrix; i++){
			count_containment.add(0);			
		}		
		
		EList<EClass> list_root = new BasicEList<EClass>();
		int count = 0;
		for (int i = 0; i < ContainmentMatrix.size(); i++) {
			for (int j = 0; j < ContainmentMatrix.size(); j++) {
				if(ContainmentMatrix.get(i).get(j).booleanValue() == true)
					count = count + 1;											
			}
			count_containment.set(i, count);			
			count = 0;				
		}
				
		ArrayIndexComparator comparator = SplitterLibraryFactoryImpl.eINSTANCE.createArrayIndexComparator();
		EList<Integer> indexes = comparator.createIndexArray(count_containment);
		
		Integer[] array_indexes = indexes.toArray(new Integer[0]);
		
		Arrays.sort(array_indexes,comparator);
		
		for (int i = 0; i < array_indexes.length; i++) {			
			list_root.add(listEClass.get(array_indexes[(array_indexes.length-1)-i]));
		}		
		return list_root;
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_MAX_CONTAINMENT___GET_ROOT__ELIST_ELIST:
				return Get_Root((EList<EList<Boolean>>)arguments.get(0), (EList<EClass>)arguments.get(1));
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_MAX_CONTAINMENT___LIST_ROOT__ELIST_ELIST:
				return List_Root((EList<EList<Boolean>>)arguments.get(0), (EList<EClass>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteStrategyMaxContainmentImpl
