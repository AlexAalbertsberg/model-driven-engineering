/**
 */
package jgrapht;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jgrapht.Graph#getEdges <em>Edges</em>}</li>
 *   <li>{@link jgrapht.Graph#getVertices <em>Vertices</em>}</li>
 * </ul>
 *
 * @see jgrapht.JgraphtPackage#getGraph()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sufficientEdgeCount minimumTwoVertices minimumOneEdge'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot sufficientEdgeCount='edges->size() >= vertices->size() - 1' minimumTwoVertices='vertices->size() >= 2' minimumOneEdge='edges->size() >= 1'"
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link jgrapht.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see jgrapht.JgraphtPackage#getGraph_Edges()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link jgrapht.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see jgrapht.JgraphtPackage#getGraph_Vertices()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Vertex> getVertices();

} // Graph
