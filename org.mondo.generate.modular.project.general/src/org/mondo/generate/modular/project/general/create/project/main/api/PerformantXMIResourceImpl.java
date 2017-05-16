package org.mondo.generate.modular.project.general.create.project.main.api;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class PerformantXMIResourceImpl extends XMIResourceImpl{
	
	private boolean modelUUIDs;	

	public PerformantXMIResourceImpl() {

		super();
		modelUUIDs = false;		
	}

	public PerformantXMIResourceImpl(URI uri) {
		
		super(uri);		
		modelUUIDs = false;
	}	
	
	@Override
	protected boolean useUUIDs() {
		
		return modelUUIDs;
	}

	public boolean isModelUUIDs() {
		return modelUUIDs;
	}

	public void setModelUUIDs(boolean modelUUIDs) {
		this.modelUUIDs = modelUUIDs;
	}
	
}

