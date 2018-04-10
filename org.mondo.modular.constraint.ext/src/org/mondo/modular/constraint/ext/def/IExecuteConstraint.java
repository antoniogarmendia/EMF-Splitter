package org.mondo.modular.constraint.ext.def;

import java.net.URI;
import java.util.List;

public interface IExecuteConstraint {
	
	public boolean init(List<String> metamodelURIs, String modularNature);
	public Object executeConstraint(String constraint, URI modelURI, URI metaModelURI, boolean isUnit);	
}
