/**
 */
package graphic_representation.impl;

import graphic_representation.Graphic_representationPackage;
import graphic_representation.Line;
import graphic_representation.RepresentationTable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.RepresentationTableImpl#getRootTable <em>Root Table</em>}</li>
 *   <li>{@link graphic_representation.impl.RepresentationTableImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link graphic_representation.impl.RepresentationTableImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepresentationTableImpl extends RepresentationImpl implements RepresentationTable {
	/**
	 * The cached value of the '{@link #getRootTable() <em>Root Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootTable()
	 * @generated
	 * @ordered
	 */
	protected EClass rootTable;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.REPRESENTATION_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootTable() {
		if (rootTable != null && rootTable.eIsProxy()) {
			InternalEObject oldRootTable = (InternalEObject)rootTable;
			rootTable = (EClass)eResolveProxy(oldRootTable);
			if (rootTable != oldRootTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.REPRESENTATION_TABLE__ROOT_TABLE, oldRootTable, rootTable));
			}
		}
		return rootTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetRootTable() {
		return rootTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootTable(EClass newRootTable) {
		EClass oldRootTable = rootTable;
		rootTable = newRootTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.REPRESENTATION_TABLE__ROOT_TABLE, oldRootTable, rootTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectContainmentEList<Line>(Line.class, this, Graphic_representationPackage.REPRESENTATION_TABLE__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, Graphic_representationPackage.REPRESENTATION_TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.REPRESENTATION_TABLE__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Graphic_representationPackage.REPRESENTATION_TABLE__ROOT_TABLE:
				if (resolve) return getRootTable();
				return basicGetRootTable();
			case Graphic_representationPackage.REPRESENTATION_TABLE__LINES:
				return getLines();
			case Graphic_representationPackage.REPRESENTATION_TABLE__COLUMNS:
				return getColumns();
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
			case Graphic_representationPackage.REPRESENTATION_TABLE__ROOT_TABLE:
				setRootTable((EClass)newValue);
				return;
			case Graphic_representationPackage.REPRESENTATION_TABLE__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
				return;
			case Graphic_representationPackage.REPRESENTATION_TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends EAttribute>)newValue);
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
			case Graphic_representationPackage.REPRESENTATION_TABLE__ROOT_TABLE:
				setRootTable((EClass)null);
				return;
			case Graphic_representationPackage.REPRESENTATION_TABLE__LINES:
				getLines().clear();
				return;
			case Graphic_representationPackage.REPRESENTATION_TABLE__COLUMNS:
				getColumns().clear();
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
			case Graphic_representationPackage.REPRESENTATION_TABLE__ROOT_TABLE:
				return rootTable != null;
			case Graphic_representationPackage.REPRESENTATION_TABLE__LINES:
				return lines != null && !lines.isEmpty();
			case Graphic_representationPackage.REPRESENTATION_TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepresentationTableImpl
