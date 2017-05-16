/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.DefaultArcParameter;
import dslHeuristicVisualization.DslHeuristicVisualizationPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import com.google.common.base.Joiner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Arc Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.DefaultArcParameterImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.DefaultArcParameterImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultArcParameterImpl extends MinimalEObjectImpl.Container implements DefaultArcParameter {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<String> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<String> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DefaultArcParameterImpl() {
		super();
		this.source = new BasicEList<String>();
		this.target = new BasicEList<String>();	
		DefaultParam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.DEFAULT_ARC_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSource() {
		if (source == null) {
			source = new EDataTypeUniqueEList<String>(String.class, this, DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTarget() {
		if (target == null) {
			target = new EDataTypeUniqueEList<String>(String.class, this, DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toCommaSeparatedStringSource() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Joiner joiner = Joiner.on(",").skipNulls();
		return joiner.join(this.source);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toCommaSeparatedStringTarget() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Joiner joiner = Joiner.on( "," ).skipNulls();
		return joiner.join(this.target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void DefaultParam() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		this.source.clear();
		this.target.clear();
		//Default source
		this.source.add("source");	
		this.source.add("src");
		//Default target
		this.target.add("target");
		this.target.add("dst");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER__SOURCE:
				return getSource();
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER__TARGET:
				return getTarget();
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
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends String>)newValue);
				return;
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends String>)newValue);
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
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER__SOURCE:
				getSource().clear();
				return;
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER__TARGET:
				getTarget().clear();
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
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER__SOURCE:
				return source != null && !source.isEmpty();
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER__TARGET:
				return target != null && !target.isEmpty();
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
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER___TO_COMMA_SEPARATED_STRING_SOURCE:
				return toCommaSeparatedStringSource();
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER___TO_COMMA_SEPARATED_STRING_TARGET:
				return toCommaSeparatedStringTarget();
			case DslHeuristicVisualizationPackage.DEFAULT_ARC_PARAMETER___DEFAULT_PARAM:
				DefaultParam();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (source: ");
		result.append(source);
		result.append(", target: ");
		result.append(target);
		result.append(')');
		return result.toString();
	}

} //DefaultArcParameterImpl
