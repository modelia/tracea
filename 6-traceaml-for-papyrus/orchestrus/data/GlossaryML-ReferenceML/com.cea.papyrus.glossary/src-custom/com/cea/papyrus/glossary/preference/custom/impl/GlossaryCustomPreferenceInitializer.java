package com.cea.papyrus.glossary.preference.custom.impl;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.infra.nattable.preferences.pages.CellPreferencePage;


/**
* @author Sébastien Gérard (CEA LIST) <sebastien.grerard@cea.fr>
*
*/

public class GlossaryCustomPreferenceInitializer {
    /**
    * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
    */
    public static void initializeDefaultPreferences() {
           IPreferenceStore store = getPreferenceStore();
           store.setValue(CellPreferencePage.UNSUPPORTED_COLUMN_CELL_TEXT, "-");
    }

    /**
    * Get the preference store.
    */
    protected static IPreferenceStore getPreferenceStore() {
           return org.eclipse.papyrus.infra.nattable.Activator.getDefault().getPreferenceStore();
    }

}
