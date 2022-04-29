package com.cea.papyrus.glossary.preference.custom.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class GlossaryMLActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		GlossaryCustomPreferenceInitializer.initializeDefaultPreferences();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}

}
