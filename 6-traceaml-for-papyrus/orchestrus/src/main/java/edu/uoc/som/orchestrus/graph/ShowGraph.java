/*****************************************************************************
* Copyright (c) 2015, 2022 CEA-LIST & SOM-UOC, Edouard Batot
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
* UOC-SOM - Initial API and implementation
*  -> Edouard Batot (UOC SOM) ebatot@uoc.edu 
*****************************************************************************/


package edu.uoc.som.orchestrus.graph;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.jgrapht.Graph;
import org.jgrapht.ext.JGraphXAdapter;

import com.mxgraph.layout.mxFastOrganicLayout;
import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxStylesheet;

import edu.uoc.som.orchestrus.tracemodel.Artefact;

public class ShowGraph {
	TraceGraph graph;
	public ShowGraph(TraceGraph tg) {
		this.graph = tg;
	}
	
	public void createAndShowGui() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Show Trace Graph");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				Graph<Artefact, WeightedEdge> g = graph.getGraph();
				JGraphXAdapter<Artefact, WeightedEdge> graphAdapter = new JGraphPerso(g);
				
				
				mxIGraphLayout layout = new mxFastOrganicLayout(graphAdapter);
				layout.execute(graphAdapter.getDefaultParent());
				
				

				frame.add(new mxGraphComponent(graphAdapter));

				frame.pack();
				frame.setLocationByPlatform(true);
				frame.setVisible(true);
            }
    	});
	
    }
	
	class JGraphPerso extends JGraphXAdapter<Artefact, WeightedEdge> {

		public JGraphPerso(Graph<Artefact, WeightedEdge> graph) {
			super(graph);
		}
		
		@Override
		public String convertValueToString(Object cell) {
			mxCell c = ((mxCell)cell);
			if(c.isEdge()) {
				WeightedEdge we = (WeightedEdge)c.getValue();
				return String.valueOf(we.getWeight());
			} else if(c.isVertex()) {
				Artefact a = (Artefact)c.getValue();
				return a.getName();
			}
			return super.convertValueToString(cell);
		}
		
		@Override
		public void setStylesheet(mxStylesheet value) {
			// TODO Auto-generated method stub
			super.setStylesheet(value);
		}
		
	}
}
