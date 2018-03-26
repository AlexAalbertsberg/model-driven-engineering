
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

public class RDFGraph3 extends JApplet {
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
		RDFGraph3 applet = new RDFGraph3();
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

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Museum");
		i++;
		g.addVertex("Museum");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5df417a7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Musee Le Louvre");
		i++;
		g.addVertex("Musee Le Louvre");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1cb3ec38 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Painting");
		i++;
		g.addVertex("Painting");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2f7a7219 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Mona Lisa");
		i++;
		g.addVertex("Mona Lisa");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Raft of the Medusa");
		i++;
		g.addVertex("Raft of the Medusa");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@664a9613 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Person");
		i++;
		g.addVertex("Person");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4a3e3e8b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Theodore Gericault");
		i++;
		g.addVertex("Theodore Gericault");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72f46e16 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Leonardo Da Vinci");
		i++;
		g.addVertex("Leonardo Da Vinci");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@54361a9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Bob");
		i++;
		g.addVertex("Bob");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@293bb8a5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Alice");
		i++;
		g.addVertex("Alice");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72e34f77 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Statue");
		i++;
		g.addVertex("Statue");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1fc0053e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"is a friend of");
		i++;
		g.addVertex("is a friend of");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2c177f9e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"is interested in");
		i++;
		g.addVertex("is interested in");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@f9b7332 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"is painted by");
		i++;
		g.addVertex("is painted by");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1bdf8190 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"owns the painting");
		i++;
		g.addVertex("owns the painting");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6b5176f2 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"works for");
		i++;
		g.addVertex("works for");

		String from, to;

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5df417a7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2f7a7219 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1cb3ec38 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1cb3ec38 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4a3e3e8b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@664a9613 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72f46e16 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@664a9613 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@54361a9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@664a9613 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@293bb8a5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@664a9613 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5df417a7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2f7a7219 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "owns the painting"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5df417a7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "owns the painting"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2f7a7219 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72f46e16 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is painted by"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4a3e3e8b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is painted by"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@54361a9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2f7a7219 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is interested in"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@54361a9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@293bb8a5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@293bb8a5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5df417a7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "works for"));

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
