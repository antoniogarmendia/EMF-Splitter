package org.mondo.visualization.ui.page.LabelProvider;

import graphic_representation.ConditionalStyle;
import graphic_representation.DiagramElement;
import graphic_representation.Edge;
import graphic_representation.Edge_Direction;
import graphic_representation.LabelEAttribute;
import graphic_representation.Link;
import graphic_representation.Root;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;

public class CDiagramElement extends ColumnLabelProvider{

	public CDiagramElement() {
		
		super();		
	}

	@Override
	public Image getImage(Object element) {
		
		return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		
		if(element instanceof DiagramElement)
			return ((DiagramElement)element).getAnEClass().getName();
		if(element instanceof Link)
		{
			EObject parentElement = ((Link) element).eContainer();
			if(parentElement instanceof Edge_Direction)
			{
				EObject parentEdgeDirection = parentElement.eContainer();
				if(parentEdgeDirection instanceof Edge)
				{
					Edge edg = (Edge)parentEdgeDirection;
					if(edg.getDirections().getSourceLink().equals(element))
						return edg.getDirections().getSourceLink().getAnEReference().getName().concat("(Source)");
					else
						return edg.getDirections().getTargetLink().getAnEReference().getName().concat("(Target)");
				}				
			}
			else
				return ((Link) element).getAnEReference().getName().concat("(Link)");
		}
		
		if(element instanceof Root)
			return ((Root) element).getAnEClass().getName();
		
		if(element instanceof LabelEAttribute)
			return ((LabelEAttribute) element).getAnEAttribute().getName().concat("(Label)");
		
		if(element instanceof Object[])
		{
			Object[] objs = (Object[])element;
			Object cad = objs[0];
			Object objLink = objs[1];
			if(objLink instanceof Link && cad instanceof String)
				return ((Link) objLink).getAnEReference().getName().concat("(" + ((String)cad) + ")" );
		}
		
		if (element instanceof ConditionalStyle) {
			
			return "Conditional Style: ".concat(((ConditionalStyle) element).getEAttribute().getName() + "=" +
						((ConditionalStyle) element).getValue());						
		}	
		
		return super.getText(element);
	}
	
	

}
