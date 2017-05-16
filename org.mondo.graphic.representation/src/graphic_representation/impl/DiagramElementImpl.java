/**
 */
package graphic_representation.impl;

import graphic_representation.DiagramElement;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.PaletteDescription;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.DiagramElementImpl#getAnEClass <em>An EClass</em>}</li>
 *   <li>{@link graphic_representation.impl.DiagramElementImpl#getDiag_palette <em>Diag palette</em>}</li>
 *   <li>{@link graphic_representation.impl.DiagramElementImpl#getContainerReference <em>Container Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramElementImpl extends AllElementsImpl implements DiagramElement {
	/**
	 * The cached value of the '{@link #getAnEClass() <em>An EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass anEClass;

	/**
	 * The cached value of the '{@link #getDiag_palette() <em>Diag palette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiag_palette()
	 * @generated
	 * @ordered
	 */
	protected PaletteDescription diag_palette;

	/**
	 * The cached value of the '{@link #getContainerReference() <em>Container Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerReference()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> containerReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnEClass() {
		if (anEClass != null && anEClass.eIsProxy()) {
			InternalEObject oldAnEClass = (InternalEObject)anEClass;
			anEClass = (EClass)eResolveProxy(oldAnEClass);
			if (anEClass != oldAnEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.DIAGRAM_ELEMENT__AN_ECLASS, oldAnEClass, anEClass));
			}
		}
		return anEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetAnEClass() {
		return anEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnEClass(EClass newAnEClass) {
		EClass oldAnEClass = anEClass;
		anEClass = newAnEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.DIAGRAM_ELEMENT__AN_ECLASS, oldAnEClass, anEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaletteDescription getDiag_palette() {
		return diag_palette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiag_palette(PaletteDescription newDiag_palette, NotificationChain msgs) {
		PaletteDescription oldDiag_palette = diag_palette;
		diag_palette = newDiag_palette;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.DIAGRAM_ELEMENT__DIAG_PALETTE, oldDiag_palette, newDiag_palette);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiag_palette(PaletteDescription newDiag_palette) {
		if (newDiag_palette != diag_palette) {
			NotificationChain msgs = null;
			if (diag_palette != null)
				msgs = ((InternalEObject)diag_palette).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.DIAGRAM_ELEMENT__DIAG_PALETTE, null, msgs);
			if (newDiag_palette != null)
				msgs = ((InternalEObject)newDiag_palette).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.DIAGRAM_ELEMENT__DIAG_PALETTE, null, msgs);
			msgs = basicSetDiag_palette(newDiag_palette, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.DIAGRAM_ELEMENT__DIAG_PALETTE, newDiag_palette, newDiag_palette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getContainerReference() {
		if (containerReference == null) {
			containerReference = new EObjectResolvingEList<EReference>(EReference.class, this, Graphic_representationPackage.DIAGRAM_ELEMENT__CONTAINER_REFERENCE);
		}
		return containerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.DIAGRAM_ELEMENT__DIAG_PALETTE:
				return basicSetDiag_palette(null, msgs);
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
			case Graphic_representationPackage.DIAGRAM_ELEMENT__AN_ECLASS:
				if (resolve) return getAnEClass();
				return basicGetAnEClass();
			case Graphic_representationPackage.DIAGRAM_ELEMENT__DIAG_PALETTE:
				return getDiag_palette();
			case Graphic_representationPackage.DIAGRAM_ELEMENT__CONTAINER_REFERENCE:
				return getContainerReference();
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
			case Graphic_representationPackage.DIAGRAM_ELEMENT__AN_ECLASS:
				setAnEClass((EClass)newValue);
				return;
			case Graphic_representationPackage.DIAGRAM_ELEMENT__DIAG_PALETTE:
				setDiag_palette((PaletteDescription)newValue);
				return;
			case Graphic_representationPackage.DIAGRAM_ELEMENT__CONTAINER_REFERENCE:
				getContainerReference().clear();
				getContainerReference().addAll((Collection<? extends EReference>)newValue);
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
			case Graphic_representationPackage.DIAGRAM_ELEMENT__AN_ECLASS:
				setAnEClass((EClass)null);
				return;
			case Graphic_representationPackage.DIAGRAM_ELEMENT__DIAG_PALETTE:
				setDiag_palette((PaletteDescription)null);
				return;
			case Graphic_representationPackage.DIAGRAM_ELEMENT__CONTAINER_REFERENCE:
				getContainerReference().clear();
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
			case Graphic_representationPackage.DIAGRAM_ELEMENT__AN_ECLASS:
				return anEClass != null;
			case Graphic_representationPackage.DIAGRAM_ELEMENT__DIAG_PALETTE:
				return diag_palette != null;
			case Graphic_representationPackage.DIAGRAM_ELEMENT__CONTAINER_REFERENCE:
				return containerReference != null && !containerReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramElementImpl
