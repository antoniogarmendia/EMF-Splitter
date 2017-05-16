package org.mondo.visualization.ui.page;

import org.eclipse.swt.widgets.Shell;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.dialogs.SelectionStatusDialog;

import graphic_representation.Layer;

public class SelectionElementsLayerClasses extends SelectionStatusDialog{

	private EList<Layer> layers;
	private Layer layertoDelete;
	
	private String selec;
			
	public String getSelec() {
		return selec;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		
		Group grp_root = new Group(parent, SWT.NONE);
		grp_root.setText("Options");
		grp_root.setLayout(new GridLayout(2, false));
		
		if(layers != null)
		{
			Iterator<Layer> itLayers = layers.iterator();
			while (itLayers.hasNext()) {
				Layer type = (Layer) itLayers.next();
				if(type.equals(layertoDelete) == false)
				{
					Button btn_lay = new Button(grp_root, SWT.RADIO);
					btn_lay.setText(type.getName());
					btn_lay.addSelectionListener(new SelectionAdapter(){
	
						@Override
						public void widgetSelected(SelectionEvent e) {
							// TODO Auto-generated method stub
							if(btn_lay.getSelection() == true)
								selec = btn_lay.getText();
							}					
						});
				}
			}
		}		
		
		Button btn_classes = new Button(grp_root, SWT.RADIO);
		btn_classes.setText("Without Layer");	
		btn_classes.setSelection(true);
		selec = "Without Layer";
		btn_classes.addSelectionListener(new SelectionAdapter(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				if(btn_classes.getSelection() == true)
					selec = btn_classes.getText();
			}					
		});
		
		return parent;		
	}
	
	public SelectionElementsLayerClasses(Shell parent) {
		super(parent);
		// TODO Auto-generated constructor stub
		layers = null;
		selec = null;
		setTitle("Select where will go the diagram elements");
	}

	@Override
	protected void computeResult() {
		// TODO Auto-generated method stub		
	}	
	
	public EList<Layer> getLayers() {
		return layers;
	}

	public void setLayers(EList<Layer> layers) {
		this.layers = layers;
	}
	
	public Layer getLayertoDelete() {
		return layertoDelete;
	}

	public void setLayertoDelete(Layer layertoDelete) {
		this.layertoDelete = layertoDelete;
	}
}
