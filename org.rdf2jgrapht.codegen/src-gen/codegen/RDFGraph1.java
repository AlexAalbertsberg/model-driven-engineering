
package codegen;

import java.awt.*;

import javax.swing.*;

import java.util.*;

import org.jgraph.*;
import org.jgrapht.*;
import org.jgrapht.ext.*;
import org.jgrapht.graph.*;

import com.RDFGraph.example.LabeledEdges.LabeledEdge;
import com.jgraph.layout.*;
import com.jgraph.layout.simple.SimpleGridLayout;

public class RDFGraph1 extends JApplet {
	private static final long serialVersionUID = 3256444702936019250L;
	private static final Dimension DEFAULT_SIZE = new Dimension(400, 300);

	private HashMap<String, String> vertices = new HashMap<String, String>();

	private JGraphModelAdapter<String, LabeledEdge> jgAdapter;

	/**
	 * An alternative starting point for this demo, to also allow running this
	 * applet as an application.
	 *
	 * @param args ignored.
	 */
	public static void main(String[] args) {
		RDFGraph1 applet = new RDFGraph1();
		applet.init();

		JFrame frame = new JFrame();
		frame.getContentPane().add(applet);
		frame.setTitle("JGraphT Adapter RDF");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public void init() {
		// create a JGraphT graph
		ListenableGraph<String, LabeledEdge> g = new ListenableDirectedMultigraph<String, LabeledEdge>(
				LabeledEdge.class);

		int i = 0;
		// vertices are placed in a map for lookup on edges later

		String from, to;

		// create a visualization using JGraph, via an adapter
		jgAdapter = new JGraphModelAdapter<String, LabeledEdge>(g);
		resize(DEFAULT_SIZE);

		JGraph jgraph = new JGraph(jgAdapter);

		// use the simple grid layout
		JGraphFacade facade = new JGraphFacade(jgraph);
		facade.setIgnoresUnconnectedCells(false);
		facade.setIgnoresHiddenCells(false);
		//JGraphLayout layout = new JGraphSimpleLayout(JGraphSimpleLayout.TYPE_CIRCLE, DEFAULT_SIZE.width, DEFAULT_SIZE.height );
		JGraphLayout layout = new SimpleGridLayout();
		// Run the layout on the facade.
		layout.run(facade);

		jgraph.getGraphLayoutCache().edit(facade.createNestedMap(false, false));

		getContentPane().add(jgraph);

	}
	/**
	 * a listenable directed multigraph that allows loops and parallel edges.
	 */
	private static class ListenableDirectedMultigraph<V, E> extends DefaultListenableGraph<V, E>
			implements
				DirectedGraph<V, E> {
		private static final long serialVersionUID = 1L;

		ListenableDirectedMultigraph(Class<E> edgeClass) {
			super(new DirectedMultigraph<V, E>(edgeClass));
		}
	}
}
