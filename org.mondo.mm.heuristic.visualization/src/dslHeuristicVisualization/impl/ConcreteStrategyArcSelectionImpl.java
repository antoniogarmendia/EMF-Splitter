/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.ConcreteStrategyArcSelection;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import dslHeuristicVisualization.StrategyArcDirection;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Strategy Arc Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.ConcreteStrategyArcSelectionImpl#getArc_direction <em>Arc direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteStrategyArcSelectionImpl extends MinimalEObjectImpl.Container implements ConcreteStrategyArcSelection {
	/**
	 * The cached value of the '{@link #getArc_direction() <em>Arc direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArc_direction()
	 * @generated
	 * @ordered
	 */
	protected StrategyArcDirection arc_direction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ConcreteStrategyArcSelectionImpl() {
		super();
		arc_direction = new ConcreteStrategyDefaultDirectionImpl();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.CONCRETE_STRATEGY_ARC_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyArcDirection getArc_direction() {
		if (arc_direction != null && arc_direction.eIsProxy()) {
			InternalEObject oldArc_direction = (InternalEObject)arc_direction;
			arc_direction = (StrategyArcDirection)eResolveProxy(oldArc_direction);
			if (arc_direction != oldArc_direction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_SELECTION__ARC_DIRECTION, oldArc_direction, arc_direction));
			}
		}
		return arc_direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyArcDirection basicGetArc_direction() {
		return arc_direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArc_direction(StrategyArcDirection newArc_direction) {
		StrategyArcDirection oldArc_direction = arc_direction;
		arc_direction = newArc_direction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_SELECTION__ARC_DIRECTION, oldArc_direction, arc_direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean IsArc(EClass anEClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//True if the Class is Arc
		//The EClass is Arc when contains two EReference
		EList<EReference> refer = anEClass.getEAllReferences();
		int count = refer.size();
		int countOfReferences = 0;
		for (int j = 0; j < count; j++) {
				if(refer.get(j).getUpperBound()==1 & refer.get(j).isContainment()==false & (refer.get(j).getLowerBound()==0 || refer.get(j).getUpperBound()==1))
					countOfReferences = countOfReferences + 1;
		}
		if(countOfReferences>=2)
			return true;
		
		return false;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_SELECTION__ARC_DIRECTION:
				if (resolve) return getArc_direction();
				return basicGetArc_direction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_SELECTION__ARC_DIRECTION:
				setArc_direction((StrategyArcDirection)newValue);
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_SELECTION__ARC_DIRECTION:
				setArc_direction((StrategyArcDirection)null);
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
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_SELECTION__ARC_DIRECTION:
				return arc_direction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DslHeuristicVisualizationPackage.CONCRETE_STRATEGY_ARC_SELECTION___IS_ARC__ECLASS:
				return IsArc((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcreteStrategyArcSelectionImpl
