package org.uam.eps.modular.constraints.dialog.def.eol;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;

public class EolStandAlone extends EpsilonStandAlone{

	private URI mmURI;
	private URI eolModule;
	private String strEolModule;
	private URI modelURI;
	
	public EolStandAlone(URI mmURI, URI eolModule, URI modelURI) {
		super();
		this.mmURI = mmURI;
		this.eolModule = eolModule;
		this.modelURI = modelURI;
		this.strEolModule = null;
	}
	
	public EolStandAlone(URI mmURI, String strEolModule, URI modelURI) {
		super();
		this.mmURI = mmURI;
		this.eolModule = null;
		this.modelURI = modelURI;
		this.strEolModule = strEolModule;
	}

	@Override
	public IEolModule createModule() {
		
		return new EolModule();
	}
	
	/*
	 * Meta-model URI
	 */
	@Override
	public URI getMMURI() {
		
		return mmURI;
	}
	
	/*
	 * EOL Module
	 */
	
	@Override
	public URI getEolModuleURI() {
		
		return eolModule;
	}
	
	/*
	 *Model URI
	 */
	@Override
	public URI getModelURI() {
		
		return modelURI;
	}
	

	@Override
	public List<IModel> getModels() throws Exception {
		
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel("Model", true, false));		
		return models;
	}
	
	public void addParameters(List<Variable> parameters) {
		
		this.parameters = parameters;	
	}

	@Override
	public String getEolModuleString() {
		
		return strEolModule;
	}

}
