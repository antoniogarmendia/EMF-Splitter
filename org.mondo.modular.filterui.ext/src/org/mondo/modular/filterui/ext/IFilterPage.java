package org.mondo.modular.filterui.ext;

import org.eclipse.swt.widgets.Control;

public interface IFilterPage {
	
	//Attributes
	public FilterAttribute getfilterattributes();
	public void setFilterAttribute(FilterAttribute anFilterAttribute);
	
	//Methods
	public void CreateControl();
	public Control getControl();
	public IObtainClassFeatures GetEClassFeat();

}
