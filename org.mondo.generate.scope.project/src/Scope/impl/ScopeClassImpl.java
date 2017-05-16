/**
 */
package Scope.impl;

import Scope.Node;
import Scope.ScopeClass;
import Scope.ScopePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Scope.impl.ScopeClassImpl#getRSamePackage <em>RSame Package</em>}</li>
 *   <li>{@link Scope.impl.ScopeClassImpl#getRSameProject <em>RSame Project</em>}</li>
 *   <li>{@link Scope.impl.ScopeClassImpl#getRSameWorkSpace <em>RSame Work Space</em>}</li>
 *   <li>{@link Scope.impl.ScopeClassImpl#getRSameUnit <em>RSame Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeClassImpl extends MinimalEObjectImpl.Container implements ScopeClass {
	/**
	 * The cached value of the '{@link #getRSamePackage() <em>RSame Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSamePackage()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> rSamePackage;

	/**
	 * The cached value of the '{@link #getRSameProject() <em>RSame Project</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSameProject()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> rSameProject;

	/**
	 * The cached value of the '{@link #getRSameWorkSpace() <em>RSame Work Space</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSameWorkSpace()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> rSameWorkSpace;

	/**
	 * The cached value of the '{@link #getRSameUnit() <em>RSame Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSameUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> rSameUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScopePackage.Literals.SCOPE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getRSamePackage() {
		if (rSamePackage == null) {
			rSamePackage = new EObjectResolvingEList<Node>(Node.class, this, ScopePackage.SCOPE_CLASS__RSAME_PACKAGE);
		}
		return rSamePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getRSameProject() {
		if (rSameProject == null) {
			rSameProject = new EObjectResolvingEList<Node>(Node.class, this, ScopePackage.SCOPE_CLASS__RSAME_PROJECT);
		}
		return rSameProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getRSameWorkSpace() {
		if (rSameWorkSpace == null) {
			rSameWorkSpace = new EObjectResolvingEList<Node>(Node.class, this, ScopePackage.SCOPE_CLASS__RSAME_WORK_SPACE);
		}
		return rSameWorkSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getRSameUnit() {
		if (rSameUnit == null) {
			rSameUnit = new EObjectResolvingEList<Node>(Node.class, this, ScopePackage.SCOPE_CLASS__RSAME_UNIT);
		}
		return rSameUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScopePackage.SCOPE_CLASS__RSAME_PACKAGE:
				return getRSamePackage();
			case ScopePackage.SCOPE_CLASS__RSAME_PROJECT:
				return getRSameProject();
			case ScopePackage.SCOPE_CLASS__RSAME_WORK_SPACE:
				return getRSameWorkSpace();
			case ScopePackage.SCOPE_CLASS__RSAME_UNIT:
				return getRSameUnit();
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
			case ScopePackage.SCOPE_CLASS__RSAME_PACKAGE:
				getRSamePackage().clear();
				getRSamePackage().addAll((Collection<? extends Node>)newValue);
				return;
			case ScopePackage.SCOPE_CLASS__RSAME_PROJECT:
				getRSameProject().clear();
				getRSameProject().addAll((Collection<? extends Node>)newValue);
				return;
			case ScopePackage.SCOPE_CLASS__RSAME_WORK_SPACE:
				getRSameWorkSpace().clear();
				getRSameWorkSpace().addAll((Collection<? extends Node>)newValue);
				return;
			case ScopePackage.SCOPE_CLASS__RSAME_UNIT:
				getRSameUnit().clear();
				getRSameUnit().addAll((Collection<? extends Node>)newValue);
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
			case ScopePackage.SCOPE_CLASS__RSAME_PACKAGE:
				getRSamePackage().clear();
				return;
			case ScopePackage.SCOPE_CLASS__RSAME_PROJECT:
				getRSameProject().clear();
				return;
			case ScopePackage.SCOPE_CLASS__RSAME_WORK_SPACE:
				getRSameWorkSpace().clear();
				return;
			case ScopePackage.SCOPE_CLASS__RSAME_UNIT:
				getRSameUnit().clear();
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
			case ScopePackage.SCOPE_CLASS__RSAME_PACKAGE:
				return rSamePackage != null && !rSamePackage.isEmpty();
			case ScopePackage.SCOPE_CLASS__RSAME_PROJECT:
				return rSameProject != null && !rSameProject.isEmpty();
			case ScopePackage.SCOPE_CLASS__RSAME_WORK_SPACE:
				return rSameWorkSpace != null && !rSameWorkSpace.isEmpty();
			case ScopePackage.SCOPE_CLASS__RSAME_UNIT:
				return rSameUnit != null && !rSameUnit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScopeClassImpl
