/*****************************************************************************

* Copyright (c) 2015, 2018 CEA LIST, Edouard Batot

*

* All rights reserved. This program and the accompanying materials

* are made available under the terms of the Eclipse Public License 2.0

* which accompanies this distribution, and is available at

* https://www.eclipse.org/legal/epl-2.0/

*

* SPDX-License-Identifier: EPL-2.0

*

* Contributors:

* CEA LIST - Initial API and implementation

* Edouard Batot (UOC SOM) ebatot@uoc.edu 

*****************************************************************************/


/**
 */
package tracea.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracea.core.NodeTraceLink#getSuccessors <em>Successors</em>}</li>
 * </ul>
 *
 * @see tracea.core.CorePackage#getNodeTraceLink()
 * @model
 * @generated
 */
public interface NodeTraceLink extends TraceLink {
	/**
	 * Returns the value of the '<em><b>Successors</b></em>' containment reference list.
	 * The list contents are of type {@link tracea.core.TraceLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' containment reference list.
	 * @see tracea.core.CorePackage#getNodeTraceLink_Successors()
	 * @model type="tracea.core.TraceLink" containment="true"
	 * @generated
	 */
	EList getSuccessors();

} // NodeTraceLink
