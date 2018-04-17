package org.mondo.visualization.ui.page;

import graphic_representation.Graphic_representationFactory;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.RepresentationDD;
import graphic_representation.Root;
import graphic_representation.impl.Graphic_representationFactoryImpl;
import runtimePatterns.ClassRoleInstance;
import runtimePatterns.FeatureRoleInstance;
import runtimePatterns.InstanceFeatureRoleInstance;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.mondo.visualization.ui.libraryrtpat.XMIRuntimePatternsImplImpl;
import org.mondo.visualization.ui.page.diagram.decorator.PageDefineDiagramElementDecorator;
import org.mondo.visualization.ui.page.diagram.element.PageDiagramElements;
import org.mondo.visualization.ui.wizard.WizardConcreteVisualization;

import splitterLibrary.EcoreEMF;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import dslHeuristicVisualization.ConcreteContainmentasCompartments;
import dslHeuristicVisualization.ConcreteContainmentasLinks;
import dslHeuristicVisualization.ConcreteStrategyArcDirection;
import dslHeuristicVisualization.ConcreteStrategyDefaultDirection;
import dslHeuristicVisualization.ConcreteStrategyLabelFirstString;
import dslHeuristicVisualization.ConcreteStrategyLabelIdentifier;
import dslHeuristicVisualization.ConcreteStrategyLabelParameter;
import dslHeuristicVisualization.ConcreteStrategyMaxContainment;
import dslHeuristicVisualization.DefaultArcParameter;
import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.HeuristicStrategySettings;
import dslHeuristicVisualization.RepreHeurSS;
import dslHeuristicVisualization.impl.DslHeuristicVisualizationFactoryImpl;

public class PageStrategySettings extends WizardPage{

	private Composite container;
	private String prefix_patterns = runtimePatterns.RuntimePatternsPackage.eINSTANCE.getNsPrefix();
	
	private Group grp_root;	
	private Button btn_modularity;
	//Arc Direction Parameter Source
	private Text txt_source;
	//Arc Direction Parameter Target
	private Text txt_dst;
	//Button Use Default
	private Button btn_param_default;
	private Button btn_param_arc;
	
	private int representation;
	private int currentMMGR;
	
	//Dedicated Wizard
	private EList<ClassRoleInstance> listUnitClassRoleInstance;	

	public PageStrategySettings(String pageName) {
		
		super(pageName);
		representation = 0;
		currentMMGR = 0;
		setTitle("Define MetaModel Visualization");
		setDescription("Different Strategies");
	}

	@Override
	public void createControl(Composite parent) {
				
		//Define Container
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		//End Define Container
			
		if(getRepresentation()==0)
			CreateControlRootStrategy(container);		
		CreateControlArcStrategy(container);
		Heuristic_Label_Selection(container);
		Heuristic_Link_Selection(container);
		
		setControl(container);
		setPageComplete(true);
	}
	
	public void CreateControlRootStrategy(Composite parent)
	{
		//Group Root
		GridData gd_grproot = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_grproot.widthHint = 300;
					
		grp_root = new Group(parent, SWT.NONE);
		grp_root.setLayoutData(gd_grproot);
		grp_root.setText("Root Strategies");
		grp_root.setLayout(new GridLayout(1, false));
		
		Button btn_maxroot = new Button(grp_root, SWT.RADIO);
		btn_maxroot.setText("Contains more classes");
		
		btn_maxroot.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				getHeuristicStrategySettings().setStrategy_root(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createConcreteStrategyMaxContainment());						
			}
		});	
				
		Button btn_noparroot = new Button(grp_root, SWT.RADIO);
		btn_noparroot.setText("Class with no parents");
		
		btn_noparroot.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				getHeuristicStrategySettings().setStrategy_root(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createConcreteStrategyNoParent());				
			}
								
		});
		
		btn_modularity = new Button(grp_root, SWT.RADIO);
		btn_modularity.setText("Modularity pattern");
		
		btn_modularity.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				EList<MMGraphic_Representation> mmRepresentation = getHeuristicStrategy().getGraphic_representation().getAllGraphicRepresentation();
				if(btn_modularity.getSelection()){
					
					EList<ClassRoleInstance> listUnits = null;
					//First listUnitClassRoleInstance!=null(Dedicated Wizard)
					if(getListUnitClassRoleInstance()!=null)
						listUnits = getListUnitClassRoleInstance();
					else
					{
						URI fileURI = URI.createURI(getNemf().getFileuri()).trimFileExtension();
						fileURI = fileURI.appendFileExtension(prefix_patterns);
						File f = new File(fileURI.toFileString());
						if(f.exists()){					
							ResourceSet set = getHeuristicStrategy().getNemf().getRes();
							Resource res = set.createResource(fileURI);						
							listUnits = XMIRuntimePatternsImplImpl.GetUnits(res);
							
						}
					}
					if(listUnits==null)
					{
						btn_modularity.setSelection(false);
						btn_noparroot.setSelection(true);
						mmRepresentation.clear();
						mmRepresentation.add(Graphic_representationFactory.eINSTANCE.createMMGraphic_Representation());
						MessageDialog.openInformation(getShell(),"Information about Modularity Pattern",
								"Could not find the pattern associated to the Meta-model");
					}
					else
						ClassRoleInstanceToMMGraphicRepresentation(listUnits, mmRepresentation);
				}
				else
					mmRepresentation.clear();
			}		
			
		});
			
		if(getCurrentMMGR()>=1)
			grp_root.setVisible(false);
		
		if(getListUnitClassRoleInstance()!= null)
		{
			btn_modularity.setSelection(true);			
		}
		else
			if(getHeuristicStrategySettings().getStrategy_root() instanceof ConcreteStrategyMaxContainment)
				btn_maxroot.setSelection(true);
		else
			btn_noparroot.setSelection(true);	
		
		if (((WizardConcreteVisualization)getWizard()).isUpdateGraphicR() == false) {
			EList<MMGraphic_Representation> mmRepresentation = getHeuristicStrategy().getGraphic_representation().getAllGraphicRepresentation();
			ClassRoleInstanceToMMGraphicRepresentation(getListUnitClassRoleInstance(), mmRepresentation);
		}
		//End Group Root		
	}
	
	public void CreateControlArcStrategy(Composite parent)
	{
		//Group Group Arc
		GridData gd_grparc = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_grparc.widthHint = 310;
				
		Group grp_arc = new Group(parent, SWT.NONE);
		grp_arc.setLayoutData(gd_grparc);
		grp_arc.setText("Arc Strategies");
		grp_arc.setLayout(new GridLayout(1, false));
			
		Button btn_simple_arc = new Button(grp_arc, SWT.RADIO);
		btn_simple_arc.setText("Simple direction arc strategy");
		
		//Select Simple Direction Arc Strategy
		btn_simple_arc.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				getHeuristicStrategySettings().getStrategy_arcSelection().setArc_direction(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createConcreteStrategyDefaultDirection());
				txt_source.setText("");
				txt_dst.setText("");
				btn_param_default.setEnabled(false);
				txt_source.setEnabled(false);
				txt_dst.setEnabled(false);				
			}			
			
		});
		
		btn_param_arc = new Button(grp_arc, SWT.RADIO);
		btn_param_arc.setText("Parameter direction arc strategy");
		
		//Select Parameter Direction Arc Strategy
		btn_param_arc.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				getHeuristicStrategySettings().getStrategy_arcSelection().setArc_direction(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createConcreteStrategyArcDirection());
				ConcreteStrategyArcDirection ObjArc = (ConcreteStrategyArcDirection)getHeuristicStrategySettings().getStrategy_arcSelection().getArc_direction();
				if(btn_param_default.getSelection()==true){
					if(ObjArc.getParam() instanceof DefaultArcParameter){
						
						txt_source.setText(((DefaultArcParameter)ObjArc.getParam()).toCommaSeparatedStringSource());
						txt_dst.setText(((DefaultArcParameter)ObjArc.getParam()).toCommaSeparatedStringTarget());						
					}
				}
				btn_param_default.setEnabled(true);
			}		
			
		});		
		
		//Group Arc Parameter
		btn_param_default = new Button(grp_arc, SWT.CHECK);	
		btn_param_default.setText("Use default");
		btn_param_default.setSelection(true);
		
		btn_param_default.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				if(btn_param_default.getSelection()==true){
					txt_source.setEnabled(false);
					txt_dst.setEnabled(false);
					ConcreteStrategyArcDirection ObjArc = (ConcreteStrategyArcDirection)getHeuristicStrategySettings().getStrategy_arcSelection().getArc_direction();
					if(ObjArc.getParam() instanceof DefaultArcParameter){						
						ObjArc.getParam().DefaultParam();
						txt_source.setText(((DefaultArcParameter)ObjArc.getParam()).toCommaSeparatedStringSource());
						txt_dst.setText(((DefaultArcParameter)ObjArc.getParam()).toCommaSeparatedStringTarget());						
					}
				}
				else{
					txt_source.setEnabled(true);
					txt_dst.setEnabled(true);
				}
			}	
			
		});		
		
		Composite arc_composite = new Composite(grp_arc, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginRight = 2;
		layout.marginLeft = 2;
		arc_composite.setLayout(layout);
		
		Label lb_source = new Label(arc_composite,SWT.NONE);
		lb_source.setText("Source.CONTAINS");
		
		txt_source = new Text(arc_composite, SWT.BORDER | SWT.SINGLE);
		txt_source.setLayoutData(GrdSrcDst());
		
		txt_source.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {//Lost Focus Update the Source List
				
				String sourceContains = txt_source.getText();
				List<String> list = Splitter.on(",").omitEmptyStrings().trimResults().splitToList(sourceContains);
				ConcreteStrategyArcDirection ObjArc = (ConcreteStrategyArcDirection)getHeuristicStrategySettings().getStrategy_arcSelection().getArc_direction();
				if(ObjArc.getParam() instanceof DefaultArcParameter){
					DefaultArcParameter obj = (DefaultArcParameter)ObjArc.getParam();
					obj.getSource().clear();
					int count = list.size();
					for (int i = 0; i < count; i++) {
						obj.getSource().add(list.get(i).toLowerCase());
					}					
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
								
			}
		});
		
		Label lb_target = new Label(arc_composite,SWT.NONE);
		lb_target.setText("Target.CONTAINS");
		
		txt_dst = new Text(arc_composite, SWT.BORDER | SWT.SINGLE);
		txt_dst.setLayoutData(GrdSrcDst());
		
		txt_dst.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
				String sourceContains = txt_dst.getText();
				List<String> list = Splitter.on(",").omitEmptyStrings().trimResults().splitToList(sourceContains);
				ConcreteStrategyArcDirection ObjArc = (ConcreteStrategyArcDirection)getHeuristicStrategySettings().getStrategy_arcSelection().getArc_direction();
				if(ObjArc.getParam() instanceof DefaultArcParameter){
					DefaultArcParameter obj = (DefaultArcParameter)ObjArc.getParam();
					obj.getTarget().clear();
					int count = list.size();
					for (int i = 0; i < count; i++) {
						obj.getSource().add(list.get(i).toLowerCase());
					}	
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
								
			}
		});
				
		if(getHeuristicStrategySettings().getStrategy_arcSelection().getArc_direction() instanceof ConcreteStrategyDefaultDirection){
			btn_simple_arc.setSelection(true);
			txt_source.setEnabled(false);
			txt_dst.setEnabled(false);
			btn_param_default.setEnabled(false);
		}
		else
			btn_param_arc.setSelection(true);		
		//End Group Arc
	}
	
	//Method to Display the different label heuristic
	private void Heuristic_Label_Selection(Composite parent)
	{
		//Group Group Label Selection
		GridData gd_labelSel = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_labelSel.widthHint = 300;
						
		Group grp_labelSel = new Group(parent, SWT.NONE);
		grp_labelSel.setLayoutData(gd_labelSel);
		grp_labelSel.setText("Label Selection");
		grp_labelSel.setLayout(new GridLayout(1, false));
		
		Button btn_first_string = new Button(grp_labelSel, SWT.RADIO);
		btn_first_string.setText("First string attribute");
		
		btn_first_string.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				getHeuristicStrategySettings().
					setStrategy_label(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createConcreteStrategyLabelFirstString());
			}			
		});
		
		
		Button btn_id_attr = new Button(grp_labelSel, SWT.RADIO);
		btn_id_attr.setText("Identifier of the class");
		
		btn_id_attr.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				getHeuristicStrategySettings().
					setStrategy_label(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createConcreteStrategyLabelIdentifier());
			}			
		});
				
		Button btn_parameter_string = new Button(grp_labelSel, SWT.RADIO);
		btn_parameter_string.setText("Parameter string attribute");
		
		//Group Arc Parameter
		Button btn_attr_default = new Button(grp_labelSel, SWT.CHECK);	
		btn_attr_default.setText("Use Default");
		btn_attr_default.setSelection(true);	
		btn_attr_default.setEnabled(false);
		
		Composite grp_parameter = new Composite(grp_labelSel, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginRight = 2;
		layout.marginLeft = 2;
		grp_parameter.setLayout(layout);		
		
		Label lb_attr = new Label(grp_parameter,SWT.NONE);
		lb_attr.setText("EAttribute.CONTAINS");
		
		Text txt_contains = new Text(grp_parameter, SWT.BORDER | SWT.SINGLE);
		txt_contains.setLayoutData(GrdLabelDst());
		txt_contains.setEnabled(false);		
		
		btn_parameter_string.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				getHeuristicStrategySettings().
					setStrategy_label(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createConcreteStrategyLabelParameter());
				ConcreteStrategyLabelParameter obj = (ConcreteStrategyLabelParameter) getHeuristicStrategySettings().getStrategy_label();
				txt_contains.setText(obj.getLabel_parameter().toCommaSeparatedStringLabel());
				btn_attr_default.setEnabled(true);
			}			
		});			
				
		btn_attr_default.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if(btn_attr_default.getSelection()==true){
					txt_contains.setEnabled(false);
				}
				else
				{
					txt_contains.setEnabled(true);
				}
			}		
			
		});
		
		txt_contains.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
				String label = txt_contains.getText();
				if(label!="")
				{
					ConcreteStrategyLabelParameter obj = (ConcreteStrategyLabelParameter) getHeuristicStrategySettings().getStrategy_label();
					obj.getLabel_parameter().getList_label().clear();
					Iterable<String> split = Splitter.on( "," ).omitEmptyStrings().trimResults().split(label);
					obj.getLabel_parameter().getList_label().addAll(Lists.newArrayList(split));
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
								
			}
		});
		
		
		if(getHeuristicStrategySettings().getStrategy_label() instanceof ConcreteStrategyLabelFirstString)
			btn_first_string.setSelection(true);
		else if(getHeuristicStrategySettings().getStrategy_label() instanceof ConcreteStrategyLabelIdentifier)
			btn_id_attr.setSelection(true);
		else
			btn_parameter_string.setSelection(true);		
	}
	
	//Method to Display the Different Strategies for defining a link
	private void Heuristic_Link_Selection(Composite parent)
	{
		//Group Group Label Selection
		GridData gd_LinkSelection = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_LinkSelection.widthHint = 310;
		
		Group grp_LinkSelection = new Group(parent, SWT.NONE);
		grp_LinkSelection.setLayoutData(gd_LinkSelection);
		grp_LinkSelection.setText("Link && Compartment && Affixed Selection Strategy");
		grp_LinkSelection.setLayout(new GridLayout(1, false));
		
		Button btn_links = new Button(grp_LinkSelection, SWT.RADIO);
		btn_links.setText("Containment References as Links");
		
		btn_links.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				getHeuristicStrategySettings().setStrategy_linkcompartment(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createConcreteContainmentasLinks());
			}			
			
		});
				
		Button btn_compartments = new Button(grp_LinkSelection, SWT.RADIO);
		btn_compartments.setText("Containment References as Compartments");	
		
		btn_compartments.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				getHeuristicStrategySettings().setStrategy_linkcompartment(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createConcreteContainmentasCompartments());				
			}	
			
		});
		
		Button btn_affixed = new Button(grp_LinkSelection, SWT.RADIO);
		btn_affixed.setText("Containment References as Affixed");	
		
		btn_affixed.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				getHeuristicStrategySettings().setStrategy_linkcompartment(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createConcreteContainmentasAffixed());
			}
			
		});
		
		if(getHeuristicStrategySettings().getStrategy_linkcompartment() instanceof ConcreteContainmentasCompartments)
			btn_compartments.setSelection(true);
		else if(getHeuristicStrategySettings().getStrategy_linkcompartment() instanceof ConcreteContainmentasLinks)
			btn_links.setSelection(true);
		else
			btn_affixed.setSelection(true);		
	}	
	
	public GridData GrdSrcDst()
	{
		//Grid Data
		GridData gd = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd.widthHint = 150;
		return gd;
	}
	
	public GridData GrdLabelDst()
	{
		//Grid Data
		GridData gd = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd.widthHint = 100;
		return gd;
	}
	
	public EcoreEMF getNemf() {
		WizardConcreteVisualization wizard = (WizardConcreteVisualization)getWizard();
		return wizard.getNemf();
	}
		
	public HeuristicStrategy getHeuristicStrategy(){
		
		WizardConcreteVisualization wizard = (WizardConcreteVisualization)getWizard();
		return wizard.getHeuristicStrategy();
	}
	
	public HeuristicStrategySettings getHeuristicStrategySettings() {
		
		return getHeuristicStrategy().getListRepresentation().get(0).
				getHeuristicStrategySettings().get(getRepresentation());
	}
	
	@Override
	public void setVisible(boolean visible) {
		
		super.setVisible(visible);
		if(visible==false)
		{
			if(!(getCurrentMMGR()==0))
			{
				getHeuristicStrategy().setCurrentMMGR(getCurrentMMGR());
				getHeuristicStrategy().setCurrentRepresentation(getRepresentation());
				getHeuristicStrategy().Execute_Graphical_Elements();	
				return;
			}			
			
			if(!(getRepresentation()==0))
			{
				getHeuristicStrategy().setCurrentRepresentation(getRepresentation());
				getHeuristicStrategy().Execute_Graphical_Elements();	
				return;
			}			
			
			if(btn_modularity.getSelection() == true){
				
				getHeuristicStrategy().ExecuteDirectPathMatrix();
				getHeuristicStrategy().setCurrentMMGR(getCurrentMMGR());
				getHeuristicStrategy().setCurrentRepresentation(getRepresentation());
				getHeuristicStrategy().Execute_Graphical_Elements();
				
				if(getWizard().getPages().length > 3)
					return;
				
				//Add additional pages to the wizard
				int countAllRepresentations = getHeuristicStrategy().getGraphic_representation().getAllGraphicRepresentation().size();
				for (int i = 1; i < countAllRepresentations; i++) {
					PageStrategySettings strategy = new PageStrategySettings("Choose the Strategies to Define the Concrete Visualization");
					PageDiagramElements elements = new PageDiagramElements("Choose the Diagram Elements");
					PageDefineDiagramElementDecorator decorator = new PageDefineDiagramElementDecorator("Choose the Decorators for the Nodes, Edges and Links");
					//Set the Integer representation
					strategy.setCurrentMMGR(i);
					elements.setCurrentMMGR(i);
					decorator.setCurrentMMGR(i);
					//Add Pages to the wizard
					((Wizard)getWizard()).addPage(strategy);
					((Wizard)getWizard()).addPage(elements);
					((Wizard)getWizard()).addPage(decorator);
					//Add also the Strategy Settings
					RepreHeurSS repreSS = DslHeuristicVisualizationFactoryImpl.eINSTANCE.createRepreHeurSS();
					repreSS.getHeuristicStrategySettings().add(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createHeuristicStrategySettings());
					getHeuristicStrategy().getListRepresentation().add(repreSS);
					//Add Graphic Representation
					//MMGraphic_Representation mmgraph = Graphic_representationFactoryImpl.eINSTANCE.createMMGraphic_Representation();
					//mmgraph.getListRepresentations().add(Graphic_representationFactoryImpl.eINSTANCE.createRepresentation());
					//getHeuristicStrategy().getGraphic_representation().getAllGraphicRepresentation().add(mmgraph);
					//getHeuristicStrategy().getListRepresentation().get(i).getHeuristicStrategySettings().add(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createHeuristicStrategySettings());
				}				
			}
			else if(getCurrentMMGR()==0){
				getHeuristicStrategy().getGraphic_representation().getAllGraphicRepresentation().clear();
				//Create the Graphic Representation
				MMGraphic_Representation graph = Graphic_representationFactory.eINSTANCE.createMMGraphic_Representation();
				//Create the First Representation
				graph.getListRepresentations().add(Graphic_representationFactory.eINSTANCE.createRepresentationDD());
				getHeuristicStrategy().getGraphic_representation().getAllGraphicRepresentation().
						add(graph);
				getHeuristicStrategy().setCurrentRepresentation(getRepresentation());
				getHeuristicStrategy().setCurrentMMGR(0);
				getHeuristicStrategy().ExecuteHeuristics();
			}
		}		
	}	
	
	public int getRepresentation() {
		return representation;
	}

	public void setRepresentation(int representation) {
		this.representation = representation;
	}
	
	public EList<ClassRoleInstance> getListUnitClassRoleInstance() {
		return listUnitClassRoleInstance;
	}

	public void setListUnitClassRoleInstance(EList<ClassRoleInstance> listUnitClassRoleInstance) {
		this.listUnitClassRoleInstance = listUnitClassRoleInstance;
	}
	
	public void ClassRoleInstanceToMMGraphicRepresentation(EList<ClassRoleInstance> listUnitClassRoleInstance
																	,EList<MMGraphic_Representation> mmRepresentation)
	{
		
		mmRepresentation.clear();
		Iterator<ClassRoleInstance> iteratorlistUnitClassRoleInstance = listUnitClassRoleInstance.iterator();
		
		while (iteratorlistUnitClassRoleInstance.hasNext()) {
			ClassRoleInstance type = (ClassRoleInstance) iteratorlistUnitClassRoleInstance.next();
			Root root = Graphic_representationFactoryImpl.eINSTANCE.createRoot();
			root.setAnEClass(type.getElement());
			MMGraphic_Representation repre = Graphic_representationFactory.eINSTANCE.createMMGraphic_Representation();
			RepresentationDD repreFile = Graphic_representationFactoryImpl.eINSTANCE.createRepresentationDD();
			repreFile.setRoot(root);
			repre.getListRepresentations().add(repreFile);
			repre.setExtension(GetExtensionClassRoleInstance(type));
			mmRepresentation.add(repre);	
		}		
	}
	
	public String GetExtensionClassRoleInstance(ClassRoleInstance eClassRole)
	{
		Iterator<FeatureRoleInstance> feat = eClassRole.getFeatureInstances().iterator();
		while (feat.hasNext()) {
			FeatureRoleInstance type = (FeatureRoleInstance) feat.next();
			if(type instanceof InstanceFeatureRoleInstance)
			{
				InstanceFeatureRoleInstance itype = (InstanceFeatureRoleInstance)type;
				Iterator<EAttribute> eClass = itype.getRole().getRef().iterator();
				while (eClass.hasNext()) {
					EAttribute eAttr = (EAttribute) eClass.next();
					if (eAttr.getName().contains("extension")) {
						return itype.getValue();
					}
				}			
			}		
		}		
		return "unknown";
	}
	
	public int getCurrentMMGR() {
		return currentMMGR;
	}

	public void setCurrentMMGR(int currentMMGR) {
		this.currentMMGR = currentMMGR;
	}
	
}
