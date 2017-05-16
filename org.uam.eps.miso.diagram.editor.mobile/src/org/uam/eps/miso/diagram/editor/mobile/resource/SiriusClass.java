package org.uam.eps.miso.diagram.editor.mobile.resource;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.helper.SiriusResourceHelper;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionCreationOperation;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallbackWithConfimation;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

@SuppressWarnings("restriction")
public class SiriusClass {

	public SiriusClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Session CreateAirdRepresentation(URI anFileURI,URI sessionResourceURI)
	{
		IProgressMonitor monitor = new NullProgressMonitor();
		//Create Session Operation
		SessionCreationOperation oper = new DefaultLocalSessionCreationOperation(sessionResourceURI, monitor);
		
		try {
			//Create Session
			oper.execute();
			Session createdSession = oper.getCreatedSession();
			//Add Default Representation
			//Adding the resource also to Sirius session
			AddSemanticResourceCommand addCommandToSession = new AddSemanticResourceCommand(createdSession,anFileURI,monitor);
			createdSession.getTransactionalEditingDomain().getCommandStack().execute(addCommandToSession);
			createdSession.save(monitor); 	
			//END
			//Add View
			TransactionalEditingDomain domain = createdSession.getTransactionalEditingDomain();
			final Set<Viewpoint> newSelectedViewpoints = ViewpointSelection.getViewpoints(anFileURI.fileExtension());
			Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
			final ViewpointSelection.Callback callback = new ViewpointSelectionCallbackWithConfimation();
			
			//String name = null;					
			for(Viewpoint p : newSelectedViewpoints){
				viewpoints.add(SiriusResourceHelper.getCorrespondingViewpoint(createdSession, p));
				//name = p.getName();
			}
			
			Command command = new ChangeViewpointSelectionCommand(createdSession, 
					callback, viewpoints , new HashSet<Viewpoint>(), true,
					monitor);
			domain.getCommandStack().execute(command);
			createdSession.save(monitor); 
			//END					
			return createdSession;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}

}
