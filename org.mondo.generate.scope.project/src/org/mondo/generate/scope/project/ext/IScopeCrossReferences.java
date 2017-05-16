package org.mondo.generate.scope.project.ext;

import org.eclipse.emf.ecore.EReference;

import ScopeDefinition.ScopeDefinitionEnum;

public interface IScopeCrossReferences {
	
	public ScopeDefinitionEnum getScopebyReference(EReference ref);

}
