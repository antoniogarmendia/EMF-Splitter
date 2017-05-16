package org.miso.wizard.instantiate.modular.pattern.label.provider;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ColumnLabelProvider;

import MetaModelGraph.Composition;
import MetaModelGraph.EnumModular;
import MetaModelGraph.Node;
import MetaModelGraph.SubClass;



public class LabelProviderPackageUnit extends ColumnLabelProvider{
	
	
	@Override
	public String getText(Object element) {
		
		EList<EnumModular> listModularNotation = null;
		
		if(element instanceof Composition)
			listModularNotation =  ((Composition) element).getTarget().getEnumModularNotation();
		
		if(element instanceof SubClass)
			listModularNotation = ((SubClass) element).getTarget().getEnumModularNotation();
		
		if(element instanceof Node)
			listModularNotation = ((Node) element).getEnumModularNotation();
		
		if(listModularNotation!=null){
			
			if(listModularNotation.size()!=0){
				Iterator<EnumModular> itModularNotation = listModularNotation.iterator();
				String notations = "";
				EnumModular enumModular = (EnumModular) itModularNotation.next();
				notations = enumModular.getName();
				
				while (itModularNotation.hasNext()) {
					enumModular = (EnumModular) itModularNotation.next();
					notations = notations + "|" + enumModular.getName();					
				}
				
				return notations;
			}
		}
		
		return "";		
	}

}
