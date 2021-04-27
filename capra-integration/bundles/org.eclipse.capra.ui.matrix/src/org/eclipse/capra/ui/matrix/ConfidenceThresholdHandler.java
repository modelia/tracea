/*******************************************************************************
 * Copyright (c) 2016, 2019 Chalmers | University of Gothenburg, rt-labs and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *      Chalmers | University of Gothenburg and rt-labs - initial API and implementation and/or initial documentation
 *      Chalmers | University of Gothenburg - additional features, updated API
 *******************************************************************************/
package org.eclipse.capra.ui.matrix;

import org.eclipse.capra.ui.matrix.views.TraceabilityMatrixView;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * Toggles between showing transitive and direct links
 * 
 * @author Edouard batot
 */
public class ConfidenceThresholdHandler extends AbstractHandler {


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		String initialValue = getConfidenceThreshold();
		InputDialog confidenceInput = new InputDialog(window.getShell(), "Confidence threshold",
				"Input the desired threshold for confidence.", initialValue, null);
		if (confidenceInput.open() == Window.OK) {
			String confidence = confidenceInput.getValue();
			try {
				double d = Double.parseDouble(confidence);
				setConfidenceThreshold(confidence);
				((TraceabilityMatrixView)window.getActivePage().getActivePart()).updateTraceabilityMatrix();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.err.println("Confidence threshold value '"+confidence+"' malformed. Action canceled.\n"+e.getLocalizedMessage());
//				e.printStackTrace();
			}
		}

		return null;
	}

	/**
	 * Gets the depth that was set by the user for transitivity returns 0 in case no
	 * depth was set or no depth limit is wanted
	 * 
	 * @return
	 */
	public static String getConfidenceThreshold() {
		Preferences confidence = getPreference();
		return confidence.get("option", ""+ TraceabilityMatrixView.getConfidenceThreshold());
	}

	private static Preferences getPreference() {
		Preferences preferences = InstanceScope.INSTANCE.getNode("org.eclipse.capra.ui.matrix.confidenceThreshold");
		return preferences.node("confidenceThreshold");
	}

	/**
	 * Sets the confience threshold to colorize cells.
	 * 
	 * @param value indicates confidence threshold
	 */
	public static void setConfidenceThreshold(String threshold) {
		Preferences confidence = getPreference();
		confidence.put("option", threshold);
		TraceabilityMatrixView.setConfidenceThreshold(Double.parseDouble(threshold));
		try {
			// forces the application to save the preferences
			confidence.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}
}
