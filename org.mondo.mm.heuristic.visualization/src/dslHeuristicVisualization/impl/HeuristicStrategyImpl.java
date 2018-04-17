package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import dslHeuristicVisualization.EcoreMatrixContainment;
import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.HeuristicStrategySettings;
import dslHeuristicVisualization.RepreHeurSS;
import graphic_representation.AffixedElement;
import graphic_representation.AllElements;
import graphic_representation.CompartmentElement;
import graphic_representation.DefaultLayer;
import graphic_representation.DiagramElement;
import graphic_representation.Edge;
import graphic_representation.Edge_Direction;
import graphic_representation.Edge_Style;
import graphic_representation.Ellipse;
import graphic_representation.GraphicRepresentation;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.LabelEAttribute;
import graphic_representation.Node;



import graphic_representation.PaletteDescriptionLink;
import graphic_representation.RepresentationDD;
import graphic_representation.ShapeCompartmentParallelogram;
import graphic_representation.impl.Graphic_representationFactoryImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import javax.annotation.Generated;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import splitterLibrary.EcoreEMF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heuristic Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategyImpl#getGraphic_representation <em>Graphic representation</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategyImpl#getNemf <em>Nemf</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategyImpl#getEcoreContainment <em>Ecore Containment</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategyImpl#getCurrentRepresentation <em>Current Representation</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategyImpl#getCurrentMMGR <em>Current MMGR</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.HeuristicStrategyImpl#getListRepresentation <em>List Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeuristicStrategyImpl extends MinimalEObjectImpl.Container implements HeuristicStrategy {
	/**
	 * The cached value of the '{@link #getGraphic_representation() <em>Graphic representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphic_representation()
	 * @generated
	 * @ordered
	 */
	protected GraphicRepresentation graphic_representation;

	/**
	 * The cached value of the '{@link #getNemf() <em>Nemf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNemf()
	 * @generated
	 * @ordered
	 */
	protected EcoreEMF nemf;

	/**
	 * The cached value of the '{@link #getEcoreContainment() <em>Ecore Containment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreContainment()
	 * @generated
	 * @ordered
	 */
	protected EcoreMatrixContainment ecoreContainment;

	/**
	 * The default value of the '{@link #getCurrentRepresentation() <em>Current Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_REPRESENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentRepresentation() <em>Current Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRepresentation()
	 * @generated
	 * @ordered
	 */
	protected Integer currentRepresentation = CURRENT_REPRESENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentMMGR() <em>Current MMGR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMMGR()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_MMGR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentMMGR() <em>Current MMGR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMMGR()
	 * @generated
	 * @ordered
	 */
	protected Integer currentMMGR = CURRENT_MMGR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListRepresentation() <em>List Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<RepreHeurSS> listRepresentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected HeuristicStrategyImpl() {
		super();
		//Matrix Containment
		ecoreContainment = new EcoreMatrixContainmentImpl();
		currentRepresentation = 0;
		currentMMGR = 0;
		//Graphic Representation
		graphic_representation = Graphic_representationFactory.eINSTANCE.createGraphicRepresentation();		
		//Representation Heuristic Strategies
		listRepresentation = new BasicEList<RepreHeurSS>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.HEURISTIC_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicRepresentation getGraphic_representation() {
		return graphic_representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphic_representation(GraphicRepresentation newGraphic_representation, NotificationChain msgs) {
		GraphicRepresentation oldGraphic_representation = graphic_representation;
		graphic_representation = newGraphic_representation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__GRAPHIC_REPRESENTATION, oldGraphic_representation, newGraphic_representation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphic_representation(GraphicRepresentation newGraphic_representation) {
		if (newGraphic_representation != graphic_representation) {
			NotificationChain msgs = null;
			if (graphic_representation != null)
				msgs = ((InternalEObject)graphic_representation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__GRAPHIC_REPRESENTATION, null, msgs);
			if (newGraphic_representation != null)
				msgs = ((InternalEObject)newGraphic_representation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__GRAPHIC_REPRESENTATION, null, msgs);
			msgs = basicSetGraphic_representation(newGraphic_representation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__GRAPHIC_REPRESENTATION, newGraphic_representation, newGraphic_representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreEMF getNemf() {
		if (nemf != null && nemf.eIsProxy()) {
			InternalEObject oldNemf = (InternalEObject)nemf;
			nemf = (EcoreEMF)eResolveProxy(oldNemf);
			if (nemf != oldNemf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__NEMF, oldNemf, nemf));
			}
		}
		return nemf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreEMF basicGetNemf() {
		return nemf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNemf(EcoreEMF newNemf) {
		EcoreEMF oldNemf = nemf;
		nemf = newNemf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__NEMF, oldNemf, nemf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreMatrixContainment getEcoreContainment() {
		if (ecoreContainment != null && ecoreContainment.eIsProxy()) {
			InternalEObject oldEcoreContainment = (InternalEObject)ecoreContainment;
			ecoreContainment = (EcoreMatrixContainment)eResolveProxy(oldEcoreContainment);
			if (ecoreContainment != oldEcoreContainment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__ECORE_CONTAINMENT, oldEcoreContainment, ecoreContainment));
			}
		}
		return ecoreContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreMatrixContainment basicGetEcoreContainment() {
		return ecoreContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreContainment(EcoreMatrixContainment newEcoreContainment) {
		EcoreMatrixContainment oldEcoreContainment = ecoreContainment;
		ecoreContainment = newEcoreContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__ECORE_CONTAINMENT, oldEcoreContainment, ecoreContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCurrentRepresentation() {
		return currentRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentRepresentation(Integer newCurrentRepresentation) {
		Integer oldCurrentRepresentation = currentRepresentation;
		currentRepresentation = newCurrentRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__CURRENT_REPRESENTATION, oldCurrentRepresentation, currentRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCurrentMMGR() {
		return currentMMGR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentMMGR(Integer newCurrentMMGR) {
		Integer oldCurrentMMGR = currentMMGR;
		currentMMGR = newCurrentMMGR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__CURRENT_MMGR, oldCurrentMMGR, currentMMGR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepreHeurSS> getListRepresentation() {
		if (listRepresentation == null) {
			listRepresentation = new EObjectContainmentEList<RepreHeurSS>(RepreHeurSS.class, this, DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__LIST_REPRESENTATION);
		}
		return listRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ExecuteHeuristics() {
		//Obtain Direct and Path Matrix
		ExecuteDirectPathMatrix();
		//Obtain the Root Element
		Execute_Root_Element();
		//Obtain the rest of graphical elements
		Execute_Graphical_Elements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void Execute_Root_Element() {
		
		((RepresentationDD)graphic_representation.getAllGraphicRepresentation().get(getCurrentMMGR()).getListRepresentations().get(getCurrentRepresentation())).
		setRoot(Graphic_representationFactory.eINSTANCE.createRoot());
		//Get Possible Root Class
		((RepresentationDD)graphic_representation.getAllGraphicRepresentation().get(getCurrentMMGR()).getListRepresentations().get(getCurrentRepresentation())).
			getRoot().setAnEClass(listRepresentation.get(getCurrentMMGR()).getHeuristicStrategySettings().
												get(getCurrentRepresentation()).getStrategy_root().
												Get_Root(ecoreContainment.getPathMatrix(),nemf.getList_classes()));
		//Update the extension
		//EClass anEClass = graphic_representation.getAllGraphicRepresentation().get(getCurrentRepresentation()).getRoot().getAnEClass();
		graphic_representation.getAllGraphicRepresentation().get(getCurrentMMGR()).
				setExtension(nemf.getPackMetamodel().getName().toLowerCase());		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void Execute_Graphical_Elements() {
		
		//Possible Elements
		EList<EClass> list_elements = listRepresentation.get(getCurrentMMGR()).getHeuristicStrategySettings().				
										get(getCurrentRepresentation()).getStrategy_possibleElements().
									PossibleElements(((RepresentationDD)graphic_representation.getAllGraphicRepresentation().
											get(getCurrentMMGR()).getListRepresentations().get(getCurrentRepresentation())).
									getRoot().getAnEClass(),ecoreContainment.getPathMatrix(), nemf.getList_classes());
		
		int count_list_elements = list_elements.size();
		DiagramElement element = null;
		EClass anEClass = null;
		HeuristicStrategySettings currentStrategySettings = listRepresentation.get(getCurrentMMGR()).getHeuristicStrategySettings().
																	get(getCurrentRepresentation());
		((RepresentationDD)graphic_representation.getAllGraphicRepresentation().get(getCurrentMMGR()).getListRepresentations().get(getCurrentRepresentation())).
		getLayers().clear();
		//Create Default Layer
		DefaultLayer defLayer = Graphic_representationFactoryImpl.eINSTANCE.createDefaultLayer();
		defLayer.setName("Default Layer");
		//End		
		EList<Edge_Direction> listDirections = new BasicEList<Edge_Direction>();
		for (int i = 0; i < count_list_elements; i++) {
			anEClass = list_elements.get(i);
			if(currentStrategySettings.getStrategy_arcSelection().IsArc(anEClass)){
				element = Graphic_representationFactory.eINSTANCE.createEdge();
				element.setAnEClass(anEClass);
				Edge_Style edgStyle = Graphic_representationFactory.eINSTANCE.createEdge_Style();
				edgStyle.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
				((Edge)element).setEdge_style(edgStyle);
				//Search for Source and Target
				Edge_Direction edgeDirection = currentStrategySettings.getStrategy_arcSelection().getArc_direction().Get_Direction(anEClass);
				((Edge)element).setDirections(edgeDirection);
				listDirections.add(edgeDirection);				
			}
			else if(currentStrategySettings.getStrategy_node_selection().IsNode(anEClass))
			{
				element = Graphic_representationFactory.eINSTANCE.createNode();
				element.setAnEClass(anEClass);
				Node ele = (Node) element;
				//Heuristic to Choose Links & Compartments
				currentStrategySettings.getStrategy_linkcompartment().ExecuteLinkCompartmentsHeuristics(anEClass);
				ele.setNode_elements(Graphic_representationFactory.eINSTANCE.createNode_Element());
				EList<EReference> list_links = currentStrategySettings.getStrategy_linkcompartment().getListLinks();
				EList<PaletteDescriptionLink> list_linksPalette = new BasicEList<PaletteDescriptionLink>();
				int count_links = list_links.size();
				for (int j = 0; j < count_links; j++){
					PaletteDescriptionLink e = Graphic_representationFactoryImpl.eINSTANCE.createPaletteDescriptionLink();
					e.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
					e.setAnEReference(list_links.get(j));
					e.setPalette_name("Create Link " + list_links.get(j).getName());
					list_linksPalette.add(e);			
				}
				ele.getNode_elements().getLinkPalette().addAll(list_linksPalette);
				//Compartments
				Iterator<EReference> itCompartmentReference = currentStrategySettings.getStrategy_linkcompartment().getListCompartment().iterator();
				while (itCompartmentReference.hasNext()) 
				{
					CompartmentElement compart = Graphic_representationFactory.eINSTANCE.createCompartmentElement();
					compart.setAnEReference(itCompartmentReference.next());
					ele.getNode_elements().getAffixedCompartmentElements().add(compart);				
				}				
				//Affixed
				Iterator<EReference> itAffixedReference = currentStrategySettings.getStrategy_linkcompartment().getListAffixed().iterator();
				while (itAffixedReference.hasNext()) {
					AffixedElement affixed = Graphic_representationFactory.eINSTANCE.createAffixedElement();
					affixed.setAnEReference(itAffixedReference.next());
					ele.getNode_elements().getAffixedCompartmentElements().add(affixed);					
				}				
				//Heuristic to Choose Labels
				EAttribute attr = currentStrategySettings.getStrategy_label().GetLabel(anEClass);
				if(attr!=null)
				{
					LabelEAttribute labelEAttribute = Graphic_representationFactoryImpl.eINSTANCE.createLabelEAttribute();
					labelEAttribute.setAnEAttribute(attr);
					labelEAttribute.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
					ele.getNode_elements().getLabelanEAttribute().add(labelEAttribute);
				}	
				//Default Shape
				if(ele.getNode_elements().isCompartment()==false)
				{
					Ellipse sh = Graphic_representationFactory.eINSTANCE.createEllipse();
					ele.setNode_shape(sh);
					sh.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
					sh.setBorderColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
				}
				else
				{
					ShapeCompartmentParallelogram sh = Graphic_representationFactory.eINSTANCE.createShapeCompartmentParallelogram();
					sh.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
					sh.setBorderColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
					ele.setNode_shape(sh);
				}
				//End Default Shape				
			}
			if(element!=null){
				//Define Palette
				int index = nemf.getList_classes().indexOf(element.getAnEClass());
				//If the index is -1 do it by Name
				if (index == -1)
					index = searchByName(element.getAnEClass(),nemf.getList_classes());				
				EList<Integer> listOfParents = ecoreContainment.getAllParents(index);
				Iterator<Integer> itParents = listOfParents.iterator();
				while (itParents.hasNext()) {
					Integer parentIndex = (Integer) itParents.next();
					element.getContainerReference().add(GetFeatureName(nemf.getList_classes().
									get(parentIndex),element.getAnEClass()));
				}				
				//int getParentIndex = ecoreContainment.GetParent(index);
				//if(getParentIndex!=-1)
				//	element.getContainerReference().add(GetFeatureName(nemf.getList_classes().
				//			get(getParentIndex),element.getAnEClass()));
				//element.setContainerReference(GetFeatureName(nemf.getList_classes().
				//		get(getParentIndex),element.getAnEClass()));					
				element.setDiag_palette(Graphic_representationFactory.eINSTANCE.createPaletteDescription());
				element.getDiag_palette().setPalette_name(currentStrategySettings.getStrategy_palette().Get_Palette(anEClass));
				defLayer.getElements().add(element);			
				element=null;
			}
		}
		//Add to current Representation
		((RepresentationDD)graphic_representation.getAllGraphicRepresentation().get(getCurrentMMGR()).getListRepresentations().get(getCurrentRepresentation())).
			getLayers().add(defLayer);
		
		//Define sourceDiagramElement & targetDiagramElement
		for (int i = 0; i < listDirections.size(); i++) {
			Edge_Direction edge = listDirections.get(i);
			edge.getSourceLink().getAnDiagramElement().addAll
				(GetEListEClassfromEReference(edge.getSourceLink().getAnEReference()));
			edge.getTargetLink().getAnDiagramElement().addAll
			(GetEListEClassfromEReference(edge.getTargetLink().getAnEReference()));			
		}		
		//End
		
		System.out.println("Define Graphical Elements");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EReference GetFeatureName(EClass parentEClass, EClass childEClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<EReference> listReferences = parentEClass.getEAllContainments();
		int listEReferences = listReferences.size();
		//Direct Containments
		for (int i = 0; i < listReferences.size(); i++) {
			if(listReferences.get(i).getEType().equals(childEClass)==true)
				return listReferences.get(i);
		}
		
		EList<EClass> childEClassEAllSuperTypes = childEClass.getEAllSuperTypes();
		int listAllSuperTypes = childEClassEAllSuperTypes.size();
		//Inheritance Containments
		for (int i = 0; i < listAllSuperTypes; i++) {
			for (int j = 0; j < listEReferences; j++) {
				if(listReferences.get(j).getEType().equals(childEClassEAllSuperTypes.get(i)))
					return listReferences.get(j);
			}
		}
		//Didn't find the containment reference
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Node> GetEListEClassfromEReference(EReference anEReference) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Node> listNodes = new BasicEList<Node>();
		EClass anEClass = (EClass)anEReference.getEType();
		EList<AllElements> listElements = ((RepresentationDD)graphic_representation.getAllGraphicRepresentation().get(getCurrentMMGR()).getListRepresentations().
											get(getCurrentRepresentation())).getLayers().get(0).getElements();
		if(anEClass.isAbstract()){		
			for (int i = 0; i < listElements.size(); i++) {
				AllElements objElement = listElements.get(i);
				if(objElement instanceof Node){
					Node objNode = (Node)objElement;
					EList<EClass> listSuperTypes = objNode.getAnEClass().getEAllSuperTypes();
					int indexOf = listSuperTypes.indexOf(anEClass);
					if(indexOf!=-1)
						listNodes.add(objNode);
				}
			}			
		}
		else{
			for (int i = 0; i < listElements.size(); i++) {
				//listElements.get(i)
				if(listElements.get(i) instanceof Node)//DiagramElement
				{
				EClass objEClass = ((DiagramElement)listElements.get(i)).getAnEClass();
				if(objEClass.equals(anEClass)){
					listNodes.add((Node)listElements.get(i));
					return listNodes;
					}
				}
			}			
		} 		
		return listNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ExecuteDirectPathMatrix() {
				
		ecoreContainment.GetDirectMatrixContainment(nemf.getList_classes());
		ecoreContainment.GetPathMatrix();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__GRAPHIC_REPRESENTATION:
				return basicSetGraphic_representation(null, msgs);
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__LIST_REPRESENTATION:
				return ((InternalEList<?>)getListRepresentation()).basicRemove(otherEnd, msgs);
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
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__GRAPHIC_REPRESENTATION:
				return getGraphic_representation();
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__NEMF:
				if (resolve) return getNemf();
				return basicGetNemf();
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__ECORE_CONTAINMENT:
				if (resolve) return getEcoreContainment();
				return basicGetEcoreContainment();
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__CURRENT_REPRESENTATION:
				return getCurrentRepresentation();
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__CURRENT_MMGR:
				return getCurrentMMGR();
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__LIST_REPRESENTATION:
				return getListRepresentation();
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
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__GRAPHIC_REPRESENTATION:
				setGraphic_representation((GraphicRepresentation)newValue);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__NEMF:
				setNemf((EcoreEMF)newValue);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__ECORE_CONTAINMENT:
				setEcoreContainment((EcoreMatrixContainment)newValue);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__CURRENT_REPRESENTATION:
				setCurrentRepresentation((Integer)newValue);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__CURRENT_MMGR:
				setCurrentMMGR((Integer)newValue);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__LIST_REPRESENTATION:
				getListRepresentation().clear();
				getListRepresentation().addAll((Collection<? extends RepreHeurSS>)newValue);
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
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__GRAPHIC_REPRESENTATION:
				setGraphic_representation((GraphicRepresentation)null);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__NEMF:
				setNemf((EcoreEMF)null);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__ECORE_CONTAINMENT:
				setEcoreContainment((EcoreMatrixContainment)null);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__CURRENT_REPRESENTATION:
				setCurrentRepresentation(CURRENT_REPRESENTATION_EDEFAULT);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__CURRENT_MMGR:
				setCurrentMMGR(CURRENT_MMGR_EDEFAULT);
				return;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__LIST_REPRESENTATION:
				getListRepresentation().clear();
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
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__GRAPHIC_REPRESENTATION:
				return graphic_representation != null;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__NEMF:
				return nemf != null;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__ECORE_CONTAINMENT:
				return ecoreContainment != null;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__CURRENT_REPRESENTATION:
				return CURRENT_REPRESENTATION_EDEFAULT == null ? currentRepresentation != null : !CURRENT_REPRESENTATION_EDEFAULT.equals(currentRepresentation);
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__CURRENT_MMGR:
				return CURRENT_MMGR_EDEFAULT == null ? currentMMGR != null : !CURRENT_MMGR_EDEFAULT.equals(currentMMGR);
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY__LIST_REPRESENTATION:
				return listRepresentation != null && !listRepresentation.isEmpty();
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
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY___EXECUTE_HEURISTICS:
				ExecuteHeuristics();
				return null;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY___EXECUTE_ROOT_ELEMENT:
				Execute_Root_Element();
				return null;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY___EXECUTE_GRAPHICAL_ELEMENTS:
				Execute_Graphical_Elements();
				return null;
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY___GET_FEATURE_NAME__ECLASS_ECLASS:
				return GetFeatureName((EClass)arguments.get(0), (EClass)arguments.get(1));
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY___GET_ELIST_ECLASSFROM_EREFERENCE__EREFERENCE:
				return GetEListEClassfromEReference((EReference)arguments.get(0));
			case DslHeuristicVisualizationPackage.HEURISTIC_STRATEGY___EXECUTE_DIRECT_PATH_MATRIX:
				ExecuteDirectPathMatrix();
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
		result.append(" (currentRepresentation: ");
		result.append(currentRepresentation);
		result.append(", currentMMGR: ");
		result.append(currentMMGR);
		result.append(')');
		return result.toString();
	}
	
	/*
	 * @generated NOT
	 */
	public static int searchByName(EClass rootEClass, EList<EClass> listEClass) {
		
		for (int i = 0; i < listEClass.size(); i++) {
			if(listEClass.get(i).getName().equals(rootEClass.getName()))
				return i;
		}
		
		return -1;
	}

} //HeuristicStrategyImpl
