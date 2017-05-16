package org.mondo.visualization.ui.page.LabelProvider;

import graphic_representation.ConditionalStyle;
import graphic_representation.Diamond;
import graphic_representation.Edge;
import graphic_representation.Edge_Direction;
import graphic_representation.Ellipse;
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.sirius.diagram.impl.DiagramPackageImpl;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class CDiagramElementDecorator extends ColumnLabelProvider{
	
	private static final String EANNOTATION_SOURCE = "Sirius";
	private static final String DETAILS_KEY = "imagePath";
	private static final String SIRIUS_PROJECT_ID = "org.eclipse.sirius.editor";
	
	public CDiagramElementDecorator() {		
		super();		
	}

	@Override
	public String getText(Object element) {
	
		if(element instanceof Edge)
			return "Decorator";
		if(element instanceof ConditionalStyle) {
			Shape shape = ((ConditionalStyle) element).getConditionalStyle();
			EObject eObject = ((ConditionalStyle) element).eContainer();		
			if (eObject instanceof Node) {
				
				if (((Node) eObject).getNode_elements().isCompartment() == true) {
					if(shape instanceof IconElement)
						return "File Path";
					if(shape instanceof ShapeCompartmentGradient)
						return "Gradient";
					if(shape instanceof ShapeCompartmentParallelogram)
						return "Parallelogram";
				} else {
					if(shape instanceof Ellipse)
						return "Ellipse";
					if(shape instanceof Rectangle)
						return "Rectangle";
					if(shape instanceof IconElement)
						return "File Path";
					if(shape instanceof Diamond)
						return "Diamond";
					if(shape instanceof Note)
						return "Note";
					return super.getText(element);					
				}				
			}						
		}			
		if(element instanceof Node)
		{
			Node nod = (Node)element;
			Shape shape = nod.getNode_shape();
			if(nod.getNode_elements().isCompartment() == true)
			{
				if(shape instanceof IconElement)
					return "File Path";
				if(shape instanceof ShapeCompartmentGradient)
					return "Gradient";
				if(shape instanceof ShapeCompartmentParallelogram)
					return "Parallelogram";
			}
			else{
				if(shape instanceof Ellipse)
					return "Ellipse";
				if(shape instanceof Rectangle)
					return "Rectangle";
				if(shape instanceof IconElement)
					return "File Path";
				if(shape instanceof Diamond)
					return "Diamond";
				if(shape instanceof Note)
					return "Note";
				return super.getText(element);
				}
		}	
		if(element instanceof Root)
		{
			Shape shape = ((Root) element).getRoot_shape();
			if(((Root) element).getRoot_node_elements().isCompartment() == false)
			{
				if(shape instanceof Ellipse)
					return "Ellipse";
				if(shape instanceof Rectangle)
					return "Rectangle";
				if(shape instanceof IconElement)
					return "File Path";
				if(shape instanceof Diamond)
					return "Diamond";
				if(shape instanceof Note)
					return "Note";
			}
			else
			{	
				if(shape instanceof IconElement)
					return "File Path";
				if(shape instanceof ShapeCompartmentGradient)
					return "Gradient";
				if(shape instanceof ShapeCompartmentParallelogram)
					return "Parallelogram";				
			}
			return super.getText(element);
		}
		
		if(element instanceof Link)
		{
			EObject parentLink = ((Link) element).eContainer();
			if(parentLink instanceof Node_Element)
				return "Decorator";
			else
				return ((Link) element).getDecoratorName();
		}
		
		if(element instanceof Object[])
		{
			Object[] objs = (Object[]) element;
			if(objs [1] instanceof PaletteDescriptionLink)
			{
				String decoratorName = null;
				String linkString = (String) objs[0];
				if(linkString.equals("Source"))
					decoratorName = ((PaletteDescriptionLink)objs [1]).getSourceDecoratorName();
				else
					decoratorName = ((PaletteDescriptionLink)objs [1]).getDecoratorName();
				return decoratorName;
			}
		}		
		
		if(element instanceof LabelEAttribute)
			return ((LabelEAttribute) element).getLabelFormat().size()>0?"Font Format: ".concat(((LabelEAttribute) element).getLabelFormat().toString()):"Font Format: []";
		
		return super.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		
		if(element instanceof Link)
		{
			EObject parentLink = ((Link) element).eContainer();
			if(parentLink instanceof Edge_Direction)	
				return FindDecoratorbyName(((Link) element).getDecoratorName());	
		}
		if(element instanceof Object[])
		{
			Object[] objs = (Object[]) element;
			if(objs [1] instanceof PaletteDescriptionLink)
			{
				String decoratorName = null;
				String linkString = (String) objs[0];
				if(linkString.equals("Source"))
					decoratorName = ((PaletteDescriptionLink)objs [1]).getSourceDecoratorName();
				else
					decoratorName = ((PaletteDescriptionLink)objs [1]).getDecoratorName();
				return FindDecoratorbyName(decoratorName);
			}
		}	
		return null;
	}
	
	public static List<String> getEdgesImages(){
		List<String> result = new ArrayList<String>();
		EEnum edgeArrows = DiagramPackageImpl.eINSTANCE.getEdgeArrows();
		EList<EEnumLiteral> edgeLiterals = edgeArrows.getELiterals();
		for (EEnumLiteral eEnumLiteral : edgeLiterals) {
			result.add(eEnumLiteral.getName());			
		}		
		return result;
	}
	
	public static Image FindDecoratorbyName(String decoratorName)
	{
		EEnum edgeArrows = DiagramPackageImpl.eINSTANCE.getEdgeArrows();
		EList<EEnumLiteral> edgeLiterals = edgeArrows.getELiterals();
		for (EEnumLiteral eEnumLiteral : edgeLiterals) {
			if(eEnumLiteral.getName().endsWith(decoratorName))
			{
				String imagePath = eEnumLiteral.getEAnnotation(EANNOTATION_SOURCE).getDetails().get(DETAILS_KEY);
				return AbstractUIPlugin.imageDescriptorFromPlugin(SIRIUS_PROJECT_ID, imagePath).createImage();
			}
		}
		return null;		
	}
	
	public static String GetDecoratorName(Integer value)
	{
		EEnum edgeArrows = DiagramPackageImpl.eINSTANCE.getEdgeArrows();
		return edgeArrows.getELiterals().get(value).getName();
	}	
	
}
