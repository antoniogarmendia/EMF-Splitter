package org.mondo.visualization.ui.page.EditingSupport;


import graphic_representation.ConditionalStyle;
import graphic_representation.Diamond;
import graphic_representation.Ellipse;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.IconElement;
import graphic_representation.LabelEAttribute;
import graphic_representation.Link;
import graphic_representation.Node;
import graphic_representation.Node_Element;
import graphic_representation.Note;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Rectangle;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.ShapeCompartmentParallelogram;
import graphic_representation.SiriusSystemColors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.mondo.visualization.ui.page.LabelProvider.CDiagramElementDecorator;
import org.mondo.visualization.ui.wizard.FontDialog;

public class ESDiagramElementDecorator extends EditingSupport{
	
	private ComboBoxCellEditor cell_Editor;
	private ComboBoxCellEditor cell_shape;
	private ComboBoxCellEditor cell_shapeCompartment;
	private DialogCellEditor cell_labelEAttribute;
	
	private static List<String> shapeList = new LinkedList<String>(Arrays.
			asList("Rectangle","Ellipse","File Path", "Diamond","Note"));
	
	private static List<String> shapeCompartment = new LinkedList<String>(Arrays.
			asList("Gradient","Parallelogram","File Path"));
	
	
	public ESDiagramElementDecorator(ColumnViewer viewer) {
		
		super(viewer);		
		cell_Editor = new ComboBoxCellEditor((Composite) getViewer().getControl(),
				CDiagramElementDecorator.getEdgesImages().toArray(new String[0]));
		
		cell_shape = new ComboBoxCellEditor((Composite) getViewer().getControl(),shapeList.toArray(new String[shapeList.size()]));
		cell_shapeCompartment = new ComboBoxCellEditor((Composite) getViewer().getControl(), 
				shapeCompartment.toArray(new String[shapeCompartment.size()]));		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
				
		if (element instanceof Root) {
			
			if(((Root) element).getRoot_node_elements().isCompartment() == true)
				return cell_shapeCompartment;
			return cell_shape;
		}
		if (element instanceof Node) {
			Node nod = (Node)element;
			if(nod.getNode_elements().isCompartment() == true)
				return cell_shapeCompartment;
			return cell_shape;
		}
		if (element instanceof ConditionalStyle) {
			EObject parentEObject = ((ConditionalStyle) element).eContainer();
			if (parentEObject instanceof Node) {
				if(((Node) parentEObject).getNode_elements().isCompartment() == true)
					return cell_shapeCompartment;
				return cell_shape;
			}				
		}	
		
		if(element instanceof Link || element instanceof Object[])
			return cell_Editor;
		if(element instanceof LabelEAttribute)
		{
			cell_labelEAttribute = new DialogCellEditor() {
				
				private Label labelPath;
				
				@Override
				protected Object openDialogBox(Control cellEditorWindow) {
					
					FontDialog fontDialog = new FontDialog(cellEditorWindow.getShell());
					if(element instanceof LabelEAttribute)
					{
						fontDialog.setListOfFontFormat(((LabelEAttribute) element).getLabelFormat());
						fontDialog.setShowIcon(((LabelEAttribute) element).isShowIcon());
					}
					if(fontDialog.open() == Window.OK)
						{
							if(element instanceof LabelEAttribute)
							{
								((LabelEAttribute) element).setShowIcon(fontDialog.getShowIcon());								
							}
							return fontDialog.getListOfFontFormat();
						}
					return "";
				}
				
				@Override
				protected Button createButton(Composite parent) {
					
					Button btn = new Button(parent, SWT.NONE);
					btn.setText("...");
					return btn;
				}
				
				@Override
				protected Control createContents(Composite cell) {
					
					labelPath = new Label(cell, SWT.LEFT);
					labelPath.setFont(cell.getFont());
					labelPath.setBackground(cell.getBackground());
					if(element instanceof LabelEAttribute)
						labelPath.setText("Font format: " + ((LabelEAttribute)element).getLabelFormat().toString());
					return labelPath;				
				}
				
				@Override
				protected void updateContents(Object value) {
					
					if(value==null)
						value = "";
					super.updateContents(value);
				}	
			};
			
			cell_labelEAttribute.create((Composite) getViewer().getControl());
			return cell_labelEAttribute;			
		}
		return null;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		if(element instanceof Link)
		{
			EObject parentLink = ((Link) element).eContainer();
			if(parentLink instanceof Node_Element)
				return false;
		}
		if(element instanceof Object[])
			return true;
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		Shape shape = null;
		Node_Element nodeElements = null;
		
		if(element instanceof Root) {
			
			nodeElements = ((Root)element).getRoot_node_elements();
			shape = ((Root)element).getRoot_shape();			
		} else if (element instanceof ConditionalStyle) {
			
			shape = ((ConditionalStyle) element).getConditionalStyle();
			EObject parentEObject = ((ConditionalStyle) element).eContainer();
			if (parentEObject instanceof Node) {
				
				nodeElements = ((Node) parentEObject).getNode_elements();				
			}				
			
		} else if(element instanceof Node) {
			
			shape = ((Node)element).getNode_shape();
			nodeElements = ((Node)element).getNode_elements();	
			
		} 
		if ( shape != null && nodeElements != null) {
			if (nodeElements.isCompartment() == true)
				return getValueCompartment(shape);
			else
				return getValueIsNotCompartment(shape);
		} else {
			return getValuePaletteDescription(element);
		}		
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		Integer valShape = (Integer)value;
		
		if(element instanceof Link){
			
			String decoratorName = CDiagramElementDecorator.GetDecoratorName((Integer)value);
			Link link = (Link)element;
			link.setDecoratorName(decoratorName);	
			
		} else if (element instanceof ConditionalStyle) {
			
			setValueConditionalStyle((ConditionalStyle) element, valShape);	
			
		} else if (element instanceof Node) {
					
			setValueNode(((Node) element),valShape);			
			
		}	else if (element instanceof Root) {		
			
			setValueRoot(((Root) element), valShape);			
		}		
		
		if(element instanceof Object[])
		{
			Object[] objs = (Object[]) element;
			if(objs [1] instanceof PaletteDescriptionLink)
			{
				String decoratorName = CDiagramElementDecorator.GetDecoratorName((Integer)value);
				String linkString = (String) objs[0];
				if(linkString.equals("Source"))
					((PaletteDescriptionLink)objs [1]).setSourceDecoratorName(decoratorName);
				else
					((PaletteDescriptionLink)objs [1]).setDecoratorName(decoratorName);
				
			}
		}	
		
		getViewer().update(element, null);		
	}
	
	private void setValueRoot(Root root, Integer valShape) {
		
		Node_Element nodeElements = root.getRoot_node_elements();
		Shape newShape = getShapeByNodeElements(nodeElements, valShape);
		
		Integer shapeValue = getValueShape(root.getRoot_shape());
		if(shapeValue == valShape)
			return;
		
		if (newShape != null)
			root.setRoot_shape(newShape);
	}
	
	private void setValueNode(Node node, Integer valShape) {
		
		Node_Element nodeElements = node.getNode_elements();
		Shape newShape = getShapeByNodeElements(nodeElements, valShape);
		
		Integer shapeValue = getValueShape(node.getNode_shape());
		if(shapeValue == valShape)
			return;
		
		if (newShape != null) {
			if(newShape instanceof IconElement) {
				String filePath = node.getDiag_palette().getIcon_filepath();
				if(filePath!=null)
					((IconElement)newShape).setFilepath(filePath);
			}			
			node.setNode_shape(newShape);
			
		}
	}

	public void setValueConditionalStyle(ConditionalStyle condStyle, Integer valStyle) {
		
		EObject parentEObject = ((ConditionalStyle) condStyle).eContainer();
		
		if (parentEObject instanceof Node) {
			
			Node_Element nodeElements = ((Node) parentEObject).getNode_elements();
			Shape newShape = getShapeByNodeElements(nodeElements, valStyle);
			
			Integer shapeValue = getValueShape(condStyle.getConditionalStyle());
			if(shapeValue == valStyle)
				return;
			
			if (newShape != null)
				condStyle.setConditionalStyle(newShape);
		}
	}
	
	public Integer getValueShape(Shape shape) {
		
		Integer value = getValueCompartment(shape);
		return value==-1?getValueIsNotCompartment(shape):value;
	}
	
	public Integer getValueCompartment(Shape shape) {
		
		if(shape instanceof ShapeCompartmentGradient)
			return getIntegerValueCompartment("Gradient");
		if(shape instanceof ShapeCompartmentParallelogram)
			return getIntegerValueCompartment("Parallelogram");
		if(shape instanceof IconElement)
			return getIntegerValueCompartment("File Path");		
		
		return -1;				
	}
	
	public Integer getValueIsNotCompartment(Shape shape){
		
		if(shape instanceof Rectangle)
			return getIntegerValueIsNotCompartment("Rectangle");
		if(shape instanceof Ellipse)
			return getIntegerValueIsNotCompartment("Ellipse");		
		if(shape instanceof IconElement)
			return getIntegerValueIsNotCompartment("File Path");
		if(shape instanceof Diamond)
			return getIntegerValueIsNotCompartment("Diamond");
		if(shape instanceof Note)
			return getIntegerValueIsNotCompartment("Note");
		
		return -1;
	}
	
	public Integer getValuePaletteDescription(Object element) {
		
		if(element instanceof Link) {
			
			Link link = (Link)element;
			String decoratorName = link.getDecoratorName();
			return CDiagramElementDecorator.getEdgesImages().indexOf(decoratorName);
		} else if(element instanceof Object[]) {
			Object[] objs = (Object[]) element;
			if(objs [1] instanceof PaletteDescriptionLink)
			{
				String decoratorName = null;
				String linkString = (String) objs[0];
				if(linkString.equals("Source"))
					decoratorName = ((PaletteDescriptionLink)objs [1]).getSourceDecoratorName();
				else
					decoratorName = ((PaletteDescriptionLink)objs [1]).getDecoratorName();
				return CDiagramElementDecorator.getEdgesImages().indexOf(decoratorName);
			}
		}
		return 0;
	}
	
	
	public Integer getIntegerValueIsNotCompartment(String name) {
		return shapeList.indexOf(name);	
	}
	
	public Integer getIntegerValueCompartment(String name) {
		return shapeCompartment.indexOf(name);
	}
	
	public Shape getShapeByNodeElements(Node_Element nodeElements, Integer valShape) {
		
		Shape newShape = null;		
		if (nodeElements.isCompartment() == true) {
			
			newShape = getCompartmentShapeByValue(valShape);		
		} else {
			
			newShape = getIsNotCompartmentShapeByValue(valShape);
		}	
		
		return newShape;
	}
	
	public Shape getCompartmentShapeByValue(Integer value) {
		
		switch (value) {
		case 0:
			return createGradient();
		case 1: 
			return createParallelogram();
		case 2:
			return createIconElement();

		default:
			return null;
		}
	}
	
	public Shape getIsNotCompartmentShapeByValue(Integer value) {
		
		switch (value) {
		case 0:
			return createRectangle();
		case 1:
			return createEllipse();
		case 2:
			return createIconElement();
		case 3:
			return createDiamond();
		case 4:
			return createNote();

		default:
			return null;
		}		
	}
	
	public Note createNote() {
		
		Note note = Graphic_representationFactory.eINSTANCE.createNote();
		note.setColor(createColor());
		note.setBorderColor(createColor());
		return note;
	}
	
	public Rectangle createRectangle() {
		
		Rectangle rectangle = Graphic_representationFactory.eINSTANCE.createRectangle();
		rectangle.setColor(createColor());
		rectangle.setBorderColor(createColor());
		return rectangle;
	}
	
	public Ellipse createEllipse() {
		
		Ellipse ellipse = Graphic_representationFactory.eINSTANCE.createEllipse();
		ellipse.setColor(createColor());
		ellipse.setBorderColor(createColor());
		ellipse.setBorderStyle("solid");
		return ellipse;
	}
	
	public IconElement createIconElement() {
		IconElement icon = Graphic_representationFactory.eINSTANCE.createIconElement();
		return icon;
	}
	
	public Diamond createDiamond() {
		
		Diamond diamond = Graphic_representationFactory.eINSTANCE.createDiamond();
		diamond.setColor(createColor());
		diamond.setBorderColor(createColor());
		return diamond;
	}
	
	public ShapeCompartmentGradient createGradient() {
		
		ShapeCompartmentGradient gradient = Graphic_representationFactory.eINSTANCE.createShapeCompartmentGradient();
		gradient.setColor(createColor());
		gradient.setBorderColor(createColor());
		gradient.setForeGroundColor(createColor());
		return gradient;
	}
	
	public ShapeCompartmentParallelogram createParallelogram() {
		
		ShapeCompartmentParallelogram parallelogram = Graphic_representationFactory.eINSTANCE.createShapeCompartmentParallelogram();
		parallelogram.setColor(createColor());
		parallelogram.setBorderColor(createColor());
		return parallelogram;
	}
	
	public SiriusSystemColors createColor() {
		
		return Graphic_representationFactory.eINSTANCE.createSiriusSystemColors();
	}
	
	
}
