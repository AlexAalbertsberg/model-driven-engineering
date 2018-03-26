/* ==========================================
 * JGraphT : a free Java graph-theory library
 * ==========================================
 *
 * Project Info:  http://jgrapht.sourceforge.net/
 * Project Creator:  Barak Naveh (http://sourceforge.net/users/barak_naveh)
 *
 * (C) Copyright 2003-2008, by Barak Naveh and Contributors.
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */
/* ----------------------
 * JGraphAdapterDemo.java
 * ----------------------
 * (C) Copyright 2003-2008, by Barak Naveh and Contributors.
 *
 * Original Author:  Barak Naveh
 * Contributor(s):   -
 *
 * $Id$
 *
 * Changes
 * -------
 * 03-Aug-2003 : Initial revision (BN);
 * 07-Nov-2003 : Adaptation to JGraph 3.0 (BN);
 *
 */
package org.jgrapht.demo;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

import org.jgraph.*;
import org.jgraph.graph.*;

import org.jgrapht.*;
import org.jgrapht.ext.*;
import org.jgrapht.graph.*;

// resolve ambiguity
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.demo.LabeledEdges.LabeledEdge;


/**
 * A demo applet that shows how to use JGraph to visualize JGraphT graphs.
 *
 * @author Barak Naveh
 * @since Aug 3, 2003
 */
public class JGraphT_Adapter_RDF
    extends JApplet
{
    

    private static final long serialVersionUID = 3256444702936019250L;
    private static final Color DEFAULT_BG_COLOR = Color.decode("#FAFBFF");
    private static final Dimension DEFAULT_SIZE = new Dimension(530, 320);

    

    //
    private JGraphModelAdapter<String, LabeledEdge> jgAdapter;

    

    /**
     * An alternative starting point for this demo, to also allow running this
     * applet as an application.
     *
     * @param args ignored.
     */
    public static void main(String [] args)
    {
        JGraphT_Adapter_RDF applet = new JGraphT_Adapter_RDF();
        applet.init();

        JFrame frame = new JFrame();
        frame.getContentPane().add(applet);
        frame.setTitle("JGraphT Adapter to JGraph Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * {@inheritDoc}
     */
    public void init()
    {
        // create a JGraphT graph
        ListenableGraph<String, LabeledEdge> g =
            new ListenableDirectedMultigraph<String, LabeledEdge>(
            		LabeledEdge.class);

        // create a visualization using JGraph, via an adapter
        jgAdapter = new JGraphModelAdapter<String, LabeledEdge>(g);

        JGraph jgraph = new JGraph(jgAdapter);

        adjustDisplaySettings(jgraph);
        getContentPane().add(jgraph);
        resize(DEFAULT_SIZE);

        String v1 = "Museum";
        String v2 = "Musée Le Louvre";
        String v3 = "Painting";
        String v4 = "Mona Lisa";
        String v5 = "Raft of the Medusa";
        String v6 = "Person";
        String v7 = "Théodore Géricault";
        String v8 = "Leonardo Da Vinci";
        String v9 = "Bob";
        String v10 = "Alice";
        String v11 = "Statue";
        String v12 = "is a friend of";
        String v13 = "is interested in";
        String v14 = "is painted by";
        String v15 = "owns the painting";
        String v16 = "works for";

        // add some sample data (graph manipulated via JGraphT)
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);
        g.addVertex(v6);
        g.addVertex(v8);
        g.addVertex(v7);
        g.addVertex(v9);
        g.addVertex(v10);
        g.addVertex(v11);
        g.addVertex(v12);
        g.addVertex(v13);
        g.addVertex(v14);
        g.addVertex(v15);
        g.addVertex(v16);
                
        g.addEdge(v2, v1, new LabeledEdge<String>(v10, v1, "type"));
        g.addEdge(v4, v3, new LabeledEdge<String>(v4, v3, "type"));
        g.addEdge(v5, v3, new LabeledEdge<String>(v5, v3, "type"));
        g.addEdge(v7, v6, new LabeledEdge<String>(v7, v6, "type"));
        g.addEdge(v8, v6, new LabeledEdge<String>(v8, v6, "type"));
        g.addEdge(v9, v6, new LabeledEdge<String>(v9, v6, "type"));
        g.addEdge(v10, v6, new LabeledEdge<String>(v10, v6, "type"));
        g.addEdge(v2, v4, new LabeledEdge<String>(v2, v4, "owns the painting"));
        g.addEdge(v2, v5, new LabeledEdge<String>(v2, v5, "owns the painting"));
        g.addEdge(v4, v8, new LabeledEdge<String>(v4, v8, "is painted by"));
        g.addEdge(v5, v7, new LabeledEdge<String>(v5, v7, "is painted by"));
        g.addEdge(v9, v4, new LabeledEdge<String>(v9, v4, "is interested in"));
        g.addEdge(v9, v10, new LabeledEdge<String>(v9, v10, "is a friend of"));
        g.addEdge(v10, v2, new LabeledEdge<String>(v10, v2, "works for"));

        // position vertices nicely within JGraph component
        positionVertexAt(v1, 260, 225);
        positionVertexAt(v2, 260, 145 );
        positionVertexAt(v3, 260, 275);
        positionVertexAt(v4, 10, 145);
        positionVertexAt(v5, 480, 145);
        positionVertexAt(v6, 260, 10);
        positionVertexAt(v7, 480, 10);
        positionVertexAt(v8, 10, 10);
        positionVertexAt(v9, 175, 80);
        positionVertexAt(v10, 350, 80);
        positionVertexAt(v11, 60, 275);
        positionVertexAt(v12, 600, 10);
        positionVertexAt(v13, 600, 70);
        positionVertexAt(v14, 600, 130);
        positionVertexAt(v15, 600, 190);
        positionVertexAt(v16, 600, 250);
        

        // that's all there is to it!...
    }

    private void adjustDisplaySettings(JGraph jg)
    {
        jg.setPreferredSize(DEFAULT_SIZE);

        Color c = DEFAULT_BG_COLOR;
        String colorStr = null;

        try {
            colorStr = getParameter("bgcolor");
        } catch (Exception e) {
        }

        if (colorStr != null) {
            c = Color.decode(colorStr);
        }

        jg.setBackground(c);
    }

    @SuppressWarnings("unchecked") // FIXME hb 28-nov-05: See FIXME below
    private void positionVertexAt(Object vertex, int x, int y)
    {
        DefaultGraphCell cell = jgAdapter.getVertexCell(vertex);
        AttributeMap attr = cell.getAttributes();
        Rectangle2D bounds = GraphConstants.getBounds(attr);

        Rectangle2D newBounds =
            new Rectangle2D.Double(
                x,
                y,
                bounds.getWidth(),
                bounds.getHeight());

        GraphConstants.setBounds(attr, newBounds);

        // TODO: Clean up generics once JGraph goes generic
        AttributeMap cellAttr = new AttributeMap();
        cellAttr.put(cell, attr);
        jgAdapter.edit(cellAttr, null, null, null);
    }

    

    /**
     * a listenable directed multigraph that allows loops and parallel edges.
     */
    private static class ListenableDirectedMultigraph<V, E>
        extends DefaultListenableGraph<V, E>
        implements DirectedGraph<V, E>
    {
        private static final long serialVersionUID = 1L;

        ListenableDirectedMultigraph(Class<E> edgeClass)
        {
            super(new DirectedMultigraph<V, E>(edgeClass));
        }
    }
}

// End JGraphAdapterDemo.java
