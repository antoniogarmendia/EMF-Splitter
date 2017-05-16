package org.mondo.visualization.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.mondo.visualization.ui.Activator;

public class GraphicRPreferencesInitializer extends AbstractPreferenceInitializer {

	public GraphicRPreferencesInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences() {
		// TODO Auto-generated method stub
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceOptions.GraphicR_ChoiceEmbedImage, PreferenceOptions.DefaultChoiceEmbedImage);
	}

}
