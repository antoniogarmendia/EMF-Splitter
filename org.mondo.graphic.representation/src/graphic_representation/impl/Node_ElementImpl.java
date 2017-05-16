/**
 */
package graphic_representation.impl;

import graphic_representation.AffixedCompartmentElement;
import graphic_representation.CompartmentElement;
import graphic_representation.ExpandableItem;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.LabelEAttribute;
import graphic_representation.Node_Element;
import graphic_representation.PaletteDescriptionLink;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.Node_ElementImpl#getLabelanEAttribute <em>Labelan EAttribute</em>}</li>
 *   <li>{@link graphic_representation.impl.Node_ElementImpl#getLinkPalette <em>Link Palette</em>}</li>
 *   <li>{@link graphic_representation.impl.Node_ElementImpl#getAffixedCompartmentElements <em>Affixed Compartment Elements</em>}</li>
 *   <li>{@link graphic_representation.impl.Node_ElementImpl#getExpandableItems <em>Expandable Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Node_ElementImpl extends MinimalEObjectImpl.Container implements Node_Element {
	/**
	 * The cached value of the '{@link #getLabelanEAttribute() <em>Labelan EAttribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelanEAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<LabelEAttribute> labelanEAttribute;

	/**
	 * The cached value of the '{@link #getLinkPalette() <em>Link Palette</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkPalette()
	 * @generated
	 * @ordered
	 */
	protected EList<PaletteDescriptionLink> linkPalette;

	/**
	 * The cached value of the '{@link #getAffixedCompartmentElements() <em>Affixed Compartment Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffixedCompartmentElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AffixedCompartmentElement> affixedCompartmentElements;

	/**
	 * The cached value of the '{@link #getExpandableItems() <em>Expandable Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpandableItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpandableItem> expandableItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.NODE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelEAttribute> getLabelanEAttribute() {
		if (labelanEAttribute == null) {
			labelanEAttribute = new EObjectContainmentEList<LabelEAttribute>(LabelEAttribute.class, this, Graphic_representationPackage.NODE_ELEMENT__LABELAN_EATTRIBUTE);
		}
		return labelanEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PaletteDescriptionLink> getLinkPalette() {
		if (linkPalette == null) {
			linkPalette = new EObjectContainmentEList<PaletteDescriptionLink>(PaletteDescriptionLink.class, this, Graphic_representationPackage.NODE_ELEMENT__LINK_PALETTE);
		}
		return linkPalette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AffixedCompartmentElement> getAffixedCompartmentElements() {
		if (affixedCompartmentElements == null) {
			affixedCompartmentElements = new EObjectContainmentEList<AffixedCompartmentElement>(AffixedCompartmentElement.class, this, Graphic_representationPackage.NODE_ELEMENT__AFFIXED_COMPARTMENT_ELEMENTS);
		}
		return affixedCompartmentElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpandableItem> getExpandableItems() {
		if (expandableItems == null) {
			expandableItems = new EObjectContainmentEList<ExpandableItem>(ExpandableItem.class, this, Graphic_representationPackage.NODE_ELEMENT__EXPANDABLE_ITEMS);
		}
		return expandableItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isCompartment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Iterator<AffixedCompartmentElement> itAffixedCompartment = getAffixedCompartmentElements().iterator();
		while (itAffixedCompartment.hasNext()) {
			AffixedCompartmentElement type = (AffixedCompartmentElement) itAffixedCompartment.next();
			if(type instanceof CompartmentElement)
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.NODE_ELEMENT__LABELAN_EATTRIBUTE:
				return ((InternalEList<?>)getLabelanEAttribute()).basicRemove(otherEnd, msgs);
			case Graphic_representationPackage.NODE_ELEMENT__LINK_PALETTE:
				return ((InternalEList<?>)getLinkPalette()).basicRemove(otherEnd, msgs);
			case Graphic_representationPackage.NODE_ELEMENT__AFFIXED_COMPARTMENT_ELEMENTS:
				return ((InternalEList<?>)getAffixedCompartmentElements()).basicRemove(otherEnd, msgs);
			case Graphic_representationPackage.NODE_ELEMENT__EXPANDABLE_ITEMS:
				return ((InternalEList<?>)getExpandableItems()).basicRemove(otherEnd, msgs);
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
			case Graphic_representationPackage.NODE_ELEMENT__LABELAN_EATTRIBUTE:
				return getLabelanEAttribute();
			case Graphic_representationPackage.NODE_ELEMENT__LINK_PALETTE:
				return getLinkPalette();
			case Graphic_representationPackage.NODE_ELEMENT__AFFIXED_COMPARTMENT_ELEMENTS:
				return getAffixedCompartmentElements();
			case Graphic_representationPackage.NODE_ELEMENT__EXPANDABLE_ITEMS:
				return getExpandableItems();
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
			case Graphic_representationPackage.NODE_ELEMENT__LABELAN_EATTRIBUTE:
				getLabelanEAttribute().clear();
				getLabelanEAttribute().addAll((Collection<? extends LabelEAttribute>)newValue);
				return;
			case Graphic_representationPackage.NODE_ELEMENT__LINK_PALETTE:
				getLinkPalette().clear();
				getLinkPalette().addAll((Collection<? extends PaletteDescriptionLink>)newValue);
				return;
			case Graphic_representationPackage.NODE_ELEMENT__AFFIXED_COMPARTMENT_ELEMENTS:
				getAffixedCompartmentElements().clear();
				getAffixedCompartmentElements().addAll((Collection<? extends AffixedCompartmentElement>)newValue);
				return;
			case Graphic_representationPackage.NODE_ELEMENT__EXPANDABLE_ITEMS:
				getExpandableItems().clear();
				getExpandableItems().addAll((Collection<? extends ExpandableItem>)newValue);
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
			case Graphic_representationPackage.NODE_ELEMENT__LABELAN_EATTRIBUTE:
				getLabelanEAttribute().clear();
				return;
			case Graphic_representationPackage.NODE_ELEMENT__LINK_PALETTE:
				getLinkPalette().clear();
				return;
			case Graphic_representationPackage.NODE_ELEMENT__AFFIXED_COMPARTMENT_ELEMENTS:
				getAffixedCompartmentElements().clear();
				return;
			case Graphic_representationPackage.NODE_ELEMENT__EXPANDABLE_ITEMS:
				getExpandableItems().clear();
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
			case Graphic_representationPackage.NODE_ELEMENT__LABELAN_EATTRIBUTE:
				return labelanEAttribute != null && !labelanEAttribute.isEmpty();
			case Graphic_representationPackage.NODE_ELEMENT__LINK_PALETTE:
				return linkPalette != null && !linkPalette.isEmpty();
			case Graphic_representationPackage.NODE_ELEMENT__AFFIXED_COMPARTMENT_ELEMENTS:
				return affixedCompartmentElements != null && !affixedCompartmentElements.isEmpty();
			case Graphic_representationPackage.NODE_ELEMENT__EXPANDABLE_ITEMS:
				return expandableItems != null && !expandableItems.isEmpty();
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
			case Graphic_representationPackage.NODE_ELEMENT___IS_COMPARTMENT:
				return isCompartment();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Node_ElementImpl
