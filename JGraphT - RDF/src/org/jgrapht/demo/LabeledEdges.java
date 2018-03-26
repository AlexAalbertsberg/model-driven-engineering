package org.jgrapht.demo;
import org.jgrapht.graph.*;

public class LabeledEdges {
       
    
    public static class LabeledEdge<V> extends DefaultEdge {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private V v1;
        private V v2;
        private String label;

        public LabeledEdge(V v1, V v2, String label) {
            this.v1 = v1;
            this.v2 = v2;
            this.label = label;
        }
        public LabeledEdge(V v1, V v2) {
            this.v1 = v1;
            this.v2 = v2;
            this.label = "("+this.v1+" : "+this.v2+")";
        }

        public V getV1() {
            return v1;
        }

        public V getV2() {
            return v2;
        }

        public String toString() {
            return label;
        }
    }
}