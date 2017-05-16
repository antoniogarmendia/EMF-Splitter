package org.miso.wizard.instantiate.modular.pattern.editing.support;

import java.util.List;

import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Control;

import MetaModelGraph.EnumModular;

public class ModularDialogCellEditor extends DialogCellEditor {

	private List<EnumModular> listModularSettings; 
	private boolean isProject;
	
	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		
		ModularDialog modularDialog = new ModularDialog(cellEditorWindow.getShell());
		modularDialog.setListModularSettings(getListModularSettings());
		modularDialog.setProject(isProject());
		
		if(modularDialog.open() == Window.OK){
			
			setListModularSettings(modularDialog.getListModularSettings());			
		}	
		
		return getListModularSettings();		
	}

	public List<EnumModular> getListModularSettings() {
		return listModularSettings;
	}

	public void setListModularSettings(List<EnumModular> listModularSettings) {
		this.listModularSettings = listModularSettings;
	}	
	
	public boolean isProject() {
		return isProject;
	}

	public void setProject(boolean isProject) {
		this.isProject = isProject;
	}
}
