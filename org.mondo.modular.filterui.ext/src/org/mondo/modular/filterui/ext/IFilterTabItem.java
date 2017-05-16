package org.mondo.modular.filterui.ext;

import org.eclipse.swt.widgets.Control;

public interface IFilterTabItem {
	
	public int AddItemPage(Control control);
	public void SetPageItemText(int pageCount,String name);
	
}
