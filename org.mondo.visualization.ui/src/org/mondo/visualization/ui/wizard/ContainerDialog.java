package org.mondo.visualization.ui.wizard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.sirius.viewpoint.description.SystemColors;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import graphic_representation.ChildrenPresentation;
import graphic_representation.Node;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.SiriusSystemColors;

public class ContainerDialog extends Dialog {
	
	private Node node;
	private ChildrenPresentation presentation;	

	private String fColor;
	private Integer height;
	private Integer width;
	
	//Widgets
	private Combo cmbPresentation;
	
	//Widgets if shape is instanceof Gradient
	private Combo cmbFColor;
	private Text txtCHeight;
	private Text txtCWidth;

	public ContainerDialog(Shell parentShell, Node node) {
		super(parentShell);		
		this.node = node;
		this.cmbFColor = null;
		this.txtCHeight = null;
		this.txtCWidth = null;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);		
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);
		container.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		
		Label lbPresentation = new Label(container, SWT.NONE);
		lbPresentation.setText("Children Presentation");
		
		cmbPresentation = new Combo(container, SWT.NONE);
		List<String> presentationList = getPresentationToList();		
		cmbPresentation.setItems(presentationList.toArray(new String[getPresentationToList().size()]));
		
		if(node.getPresentation() != null)
			cmbPresentation.select(presentationList.indexOf(node.getPresentation().getName()));
		
		
		if(node.getNode_shape() instanceof ShapeCompartmentGradient) {
			
			ShapeCompartmentGradient sh = (ShapeCompartmentGradient) node.getNode_shape();
			//ForegroundColor
			Label labelForeground = new Label(container,SWT.NONE);
			labelForeground.setText("ForegroundColor: ");
			
			cmbFColor = new Combo(container, SWT.BORDER);
			cmbFColor.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			List<String> listOfColors = GetColorsName();
			cmbFColor.setItems(listOfColors.toArray(new String[GetColorsName().size()]));
			cmbFColor.select(listOfColors.indexOf(((SiriusSystemColors)sh.getForeGroundColor()).getName()));
			
			//Corner Height
			Label cornerHeight = new Label(container,SWT.NONE);
			cornerHeight.setText("Corner Height: ");
			
			txtCHeight = new Text(container, SWT.BORDER);
			txtCHeight.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			txtCHeight.setText(sh.getCornerHeight().toString());
			
			//Corner Width
			Label cornerWidth = new Label(container,SWT.NONE);
			cornerWidth.setText("Corner Width: "); 
						
			txtCWidth = new Text(container, SWT.BORDER);
			txtCWidth.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			txtCWidth.setText(sh.getCornerWidth().toString());			
		}		
		return container;
	}
	
	public List<String> getPresentationToList() {
		
		List<String> result = new LinkedList<String>();
		for (int i = 0; i < ChildrenPresentation.values().length; i++) {
			result.add(ChildrenPresentation.get(i).getName());
		}	
		return result;
	}
	
	@Override
	protected void okPressed() {
		
		this.presentation = ChildrenPresentation.get(cmbPresentation.getSelectionIndex());
		if(node.getNode_shape() instanceof ShapeCompartmentGradient) {			
			
			this.fColor = cmbFColor.getText(); 
			this.height = Integer.parseInt(this.txtCHeight.getText());
			this.width = Integer.parseInt(this.txtCWidth.getText());
		}		
		super.okPressed();
	}
	
	public ChildrenPresentation getPresentation() {
		return presentation;
	}
	
	public static List<String> GetColorsName()
	{
		List<String> result = new ArrayList<String>();
		SystemColors[] colors = SystemColors.values();		
		for (SystemColors systemColors : colors) 
			result.add(systemColors.getName());
		return result;		
	}
	
	public String getfColor() {
		return fColor;
	}

	public Integer getHeight() {
		return height;
	}

	public Integer getWidth() {
		return width;
	}
	
}
