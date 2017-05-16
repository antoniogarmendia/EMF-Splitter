/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.ConcreteStrategyNoParent;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Strategy No Parent</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConcreteStrategyNoParentImpl extends MinimalEObjectImpl.Container implements ConcreteStrategyNoParent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteStrategyNoParentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.CONCRETE_STRATEGY_NO_PARENT;
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
		if(list_roots.size()>0)
			return list_roots.get(0);
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
		EList<EClass> list_root = new BasicEList<EClass>();
		boolean containment = false;//The Node has containment reference
		int list_count = ContainmentMatrix.size();
		boolean [] parents = new boolean[list_count];
		boolean parent = false;	
		//Search the node that contains the other nodes
		for (int i = 0; i < list_count; i++) {
		//List SuperClasses
		for (int j = 0; j < listEClass.get(i).getESuperTypes().size(); j++) {
			/*
			  * Maybe the SuperClass is not defined in this meta-model
			  * I ignored, maybe in the future...
			  * */
			if(listEClass.indexOf(listEClass.get(i).getESuperTypes().get(j))!=-1)
			{
				EClass superEClass = listEClass.get(i).getESuperTypes().get(j);
				parents[listEClass.indexOf(listEClass.get(i).getESuperTypes().get(j))]=true;
			}
			else
			{
				EClass superEClass = listEClass.get(i).getESuperTypes().get(j);
				System.out.println("Cannot found the EClass in the meta-model");
			}
		}
		for (int j = 0; j < list_count; j++) {
			if(ContainmentMatrix.get(i).get(j).equals(true))
				containment = true;
			if(ContainmentMatrix.get(j).get(i).equals(true))
			{
				j = list_count;//If the node has parent don't need to continue traveling the node
				parent = true;
			}
			if(j==(list_count-1))
			{
				if(parent==false && containment==true && listEClass.get(i).isAbstract() == false)//It cannot be an abstract ECLass
					list_root.add(listEClass.get(i));
			}
		}
		parent = false;
		containment=false;			
		}		
		//Delete from list nodes the parent classes
		for (int j = 0; j < listEClass.size(); j++)
		{
			if(parents[j]==true)
			{
				if(list_root.indexOf(listEClass.get(j))!=-1)
					list_root.remove(list_root.indexOf(listEClass.get(j)));
			}
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_NO_PARENT___GET_ROOT__ELIST_ELIST:
				return Get_Root((EList<EList<Boolean>>)arguments.get(0), (EList<EClass>)arguments.get(1));
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_NO_PARENT___LIST_ROOT__ELIST_ELIST:
				return List_Root((EList<EList<Boolean>>)arguments.get(0), (EList<EClass>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteStrategyNoParentImpl
