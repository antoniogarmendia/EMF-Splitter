package org.mondo.generate.visibility.project.ext;

import org.eclipse.emf.ecore.EClass;

import ScopeDefinition.ScopeDefinitionEnum;

public interface IVisibilityClass {
	
	public ScopeDefinitionEnum getVisibilitybyEClass(EClass eClass);
	public String getEOLexpressionByEClass(EClass eClass);

}
