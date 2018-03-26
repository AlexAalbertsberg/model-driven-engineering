
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

public class RDFGraph4 extends JApplet {
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
		RDFGraph4 applet = new RDFGraph4();
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
				"Person");
		i++;
		g.addVertex("Person");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5df417a7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Alice");
		i++;
		g.addVertex("Alice");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1cb3ec38 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Alex");
		i++;
		g.addVertex("Alex");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2f7a7219 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Aisha");
		i++;
		g.addVertex("Aisha");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Alfred");
		i++;
		g.addVertex("Alfred");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@664a9613 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Amanda");
		i++;
		g.addVertex("Amanda");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4a3e3e8b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Amelia");
		i++;
		g.addVertex("Amelia");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72f46e16 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Arthur");
		i++;
		g.addVertex("Arthur");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@54361a9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Barend");
		i++;
		g.addVertex("Barend");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@293bb8a5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Bianca");
		i++;
		g.addVertex("Bianca");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72e34f77 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Birgit");
		i++;
		g.addVertex("Birgit");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1fc0053e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Bob");
		i++;
		g.addVertex("Bob");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2c177f9e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Carl");
		i++;
		g.addVertex("Carl");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@f9b7332 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Carmen");
		i++;
		g.addVertex("Carmen");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1bdf8190 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Carolina");
		i++;
		g.addVertex("Carolina");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6b5176f2 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Catrina");
		i++;
		g.addVertex("Catrina");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6e46d9f4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Chris");
		i++;
		g.addVertex("Chris");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7997b197 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Daan");
		i++;
		g.addVertex("Daan");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@11acdc30 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Daisy");
		i++;
		g.addVertex("Daisy");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@76a82f33 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Danielle");
		i++;
		g.addVertex("Danielle");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@532a02d9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Daphne");
		i++;
		g.addVertex("Daphne");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7f811d00 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"David");
		i++;
		g.addVertex("David");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7807ac2c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Elisa");
		i++;
		g.addVertex("Elisa");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4fd4cae3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Elsie");
		i++;
		g.addVertex("Elsie");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@523424b5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Emma");
		i++;
		g.addVertex("Emma");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@a7e2d9d (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Eric");
		i++;
		g.addVertex("Eric");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4cc76301 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Fabian");
		i++;
		g.addVertex("Fabian");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@a486d78 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Fedrico");
		i++;
		g.addVertex("Fedrico");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4c36250e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Femke");
		i++;
		g.addVertex("Femke");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5471388b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Fleur");
		i++;
		g.addVertex("Fleur");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@66971f6b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Frank");
		i++;
		g.addVertex("Frank");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4a9cc6cb (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Garry");
		i++;
		g.addVertex("Garry");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1950e8a6 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Gerda");
		i++;
		g.addVertex("Gerda");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@f415a95 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Gert");
		i++;
		g.addVertex("Gert");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@32fe9d0a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Hendrik");
		i++;
		g.addVertex("Hendrik");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@d78795 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Henk");
		i++;
		g.addVertex("Henk");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7caa550 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Ian");
		i++;
		g.addVertex("Ian");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@70fab835 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Ida");
		i++;
		g.addVertex("Ida");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@26be6ca7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Iris");
		i++;
		g.addVertex("Iris");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@53499d85 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Jack");
		i++;
		g.addVertex("Jack");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@59fc684e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Jade");
		i++;
		g.addVertex("Jade");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6063d80a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Joel");
		i++;
		g.addVertex("Joel");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2a2da905 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Johan");
		i++;
		g.addVertex("Johan");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@770d0ea6 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Joshua");
		i++;
		g.addVertex("Joshua");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@476aac9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Kate");
		i++;
		g.addVertex("Kate");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1eba372c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Kim");
		i++;
		g.addVertex("Kim");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1a69561c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Lars");
		i++;
		g.addVertex("Lars");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1b28f282 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Leonardo");
		i++;
		g.addVertex("Leonardo");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@455351c4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Leonie");
		i++;
		g.addVertex("Leonie");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@16423501 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Lindsey");
		i++;
		g.addVertex("Lindsey");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@307765b4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Mabel");
		i++;
		g.addVertex("Mabel");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@459f7aa3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Marit");
		i++;
		g.addVertex("Marit");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7a56812e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Mark");
		i++;
		g.addVertex("Mark");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@61d9efe0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Max");
		i++;
		g.addVertex("Max");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@43ed0ff3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Mia");
		i++;
		g.addVertex("Mia");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6691490c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Muhammad");
		i++;
		g.addVertex("Muhammad");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4de025bf (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Nadine");
		i++;
		g.addVertex("Nadine");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5db99216 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Nico");
		i++;
		g.addVertex("Nico");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@18cc679e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Nicole");
		i++;
		g.addVertex("Nicole");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7df587ef (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Oliver");
		i++;
		g.addVertex("Oliver");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@740abb5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Oscar");
		i++;
		g.addVertex("Oscar");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@578524c3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Phoebe");
		i++;
		g.addVertex("Phoebe");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4cc547a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Poppy");
		i++;
		g.addVertex("Poppy");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5398edd0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Ronnie");
		i++;
		g.addVertex("Ronnie");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@758f4f03 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Rosie");
		i++;
		g.addVertex("Rosie");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@69f63d95 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Ruby");
		i++;
		g.addVertex("Ruby");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6db66836 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Sebastian");
		i++;
		g.addVertex("Sebastian");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@61a002b1 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Sienna");
		i++;
		g.addVertex("Sienna");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6f70f32f (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Sophia");
		i++;
		g.addVertex("Sophia");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1ac85b0c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Sophie");
		i++;
		g.addVertex("Sophie");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@59a67c3a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Theo");
		i++;
		g.addVertex("Theo");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6bc248ed (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Thomas");
		i++;
		g.addVertex("Thomas");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@9573b3b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Tyler");
		i++;
		g.addVertex("Tyler");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64f857e7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Violet");
		i++;
		g.addVertex("Violet");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1b822fcc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"William");
		i++;
		g.addVertex("William");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7927bd9f (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Willow");
		i++;
		g.addVertex("Willow");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@3b366632 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Zachary");
		i++;
		g.addVertex("Zachary");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6970140a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"Zoe");
		i++;
		g.addVertex("Zoe");

		vertices.put(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4d63b624 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))",
				"is a friend of");
		i++;
		g.addVertex("is a friend of");

		String from, to;

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5df417a7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1cb3ec38 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2f7a7219 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@664a9613 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4a3e3e8b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72f46e16 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@54361a9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@293bb8a5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72e34f77 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1fc0053e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2c177f9e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@f9b7332 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1bdf8190 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6b5176f2 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6e46d9f4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7997b197 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@11acdc30 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@76a82f33 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@532a02d9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7f811d00 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7807ac2c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4fd4cae3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@523424b5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@a7e2d9d (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4cc76301 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@a486d78 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4c36250e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5471388b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@66971f6b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4a9cc6cb (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1950e8a6 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@f415a95 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@32fe9d0a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@d78795 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7caa550 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@70fab835 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@26be6ca7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@53499d85 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@59fc684e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6063d80a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2a2da905 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@770d0ea6 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@476aac9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1eba372c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1a69561c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1b28f282 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@455351c4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@16423501 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@307765b4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@459f7aa3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7a56812e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@61d9efe0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@43ed0ff3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6691490c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4de025bf (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5db99216 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@18cc679e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7df587ef (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@740abb5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@578524c3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4cc547a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5398edd0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@758f4f03 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@69f63d95 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6db66836 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@61a002b1 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6f70f32f (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1ac85b0c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@59a67c3a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6bc248ed (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@9573b3b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64f857e7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1b822fcc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7927bd9f (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@3b366632 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6970140a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64bc21ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "type"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2f7a7219 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@32fe9d0a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2f7a7219 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@770d0ea6 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1cb3ec38 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@a7e2d9d (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1cb3ec38 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@740abb5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1fc0053e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6db66836 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2c177f9e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6db66836 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4a3e3e8b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@664a9613 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72f46e16 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@740abb5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72f46e16 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@9573b3b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72f46e16 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@3b366632 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@54361a9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6f70f32f (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@293bb8a5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6b5176f2 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72e34f77 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@53499d85 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1fc0053e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2c177f9e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1bdf8190 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@f9b7332 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@293bb8a5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@f9b7332 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6b5176f2 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@f9b7332 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@69f63d95 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1bdf8190 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@66971f6b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6b5176f2 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6691490c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6e46d9f4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1eba372c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6e46d9f4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4de025bf (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7997b197 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@a486d78 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7997b197 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1950e8a6 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7997b197 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1ac85b0c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@11acdc30 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@59a67c3a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@76a82f33 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@664a9613 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@532a02d9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@455351c4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@532a02d9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6691490c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7f811d00 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@11acdc30 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7f811d00 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@740abb5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7807ac2c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@76a82f33 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7807ac2c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@d78795 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7807ac2c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@f9b7332 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4fd4cae3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1a69561c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@523424b5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1cb3ec38 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@a7e2d9d (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@11acdc30 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4cc76301 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@476aac9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@a486d78 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@70fab835 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4c36250e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1eba372c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4c36250e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@740abb5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5471388b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@43ed0ff3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@66971f6b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4de025bf (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@66971f6b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5398edd0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4a9cc6cb (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4a9cc6cb (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@d78795 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1950e8a6 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7caa550 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@f415a95 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@361c294e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@f415a95 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4c36250e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@f415a95 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4a9cc6cb (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@32fe9d0a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72f46e16 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@d78795 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@758f4f03 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7caa550 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1b28f282 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@26be6ca7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7f811d00 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@26be6ca7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@455351c4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@53499d85 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7807ac2c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@59fc684e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1950e8a6 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6063d80a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@76a82f33 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6063d80a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@26be6ca7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2a2da905 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1a69561c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2a2da905 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7a56812e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@770d0ea6 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7a56812e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@770d0ea6 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@61a002b1 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1a69561c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@26be6ca7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1a69561c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@578524c3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1b28f282 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@66971f6b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@455351c4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4cc547a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@307765b4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1b28f282 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@307765b4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4cc547a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@459f7aa3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@578524c3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7a56812e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@54361a9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7a56812e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72e34f77 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7a56812e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@61d9efe0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@61d9efe0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@16423501 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5db99216 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@664a9613 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@18cc679e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@43ed0ff3 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7df587ef (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2f7a7219 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7df587ef (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6e46d9f4 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4cc547a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7caa550 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5398edd0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@72f46e16 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5398edd0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1b28f282 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5398edd0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1ac85b0c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@758f4f03 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2f7a7219 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@758f4f03 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@32fe9d0a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@758f4f03 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1b822fcc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@69f63d95 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@532a02d9 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6db66836 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2c177f9e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6db66836 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7927bd9f (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@61a002b1 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@293bb8a5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1ac85b0c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4a9cc6cb (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@59a67c3a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7f811d00 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@59a67c3a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@740abb5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6bc248ed (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@18cc679e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@9573b3b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5db99216 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@9573b3b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7df587ef (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@9573b3b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6bc248ed (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64f857e7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2c177f9e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@64f857e7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6b5176f2 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1b822fcc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7f811d00 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1b822fcc (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@59a67c3a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7927bd9f (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@293bb8a5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7927bd9f (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6b5176f2 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@3b366632 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6970140a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

		from = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6970140a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");
		to = vertices.get(
				"org.eclipse.emf.ecore.impl.DynamicEObjectImpl@16423501 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@56c9bbd8 (name: Vertex) (instanceClassName: null) (abstract: false, interface: false))");

		g.addEdge(from, to, new LabeledEdge<String>(from, to, "is a friend of"));

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
