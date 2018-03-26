/**
 */
package jgrapht;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jgrapht.Edge#getFrom <em>From</em>}</li>
 *   <li>{@link jgrapht.Edge#getTo <em>To</em>}</li>
 *   <li>{@link jgrapht.Edge#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see jgrapht.JgraphtPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Vertex)
	 * @see jgrapht.JgraphtPackage#getEdge_From()
	 * @model required="true"
	 * @generated
	 */
	Vertex getFrom();

	/**
	 * Sets the value of the '{@link jgrapht.Edge#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Vertex value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Vertex)
	 * @see jgrapht.JgraphtPackage#getEdge_To()
	 * @model required="true"
	 * @generated
	 */
	Vertex getTo();

	/**
	 * Sets the value of the '{@link jgrapht.Edge#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Vertex value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' attribute.
	 * @see #setRelation(String)
	 * @see jgrapht.JgraphtPackage#getEdge_Relation()
	 * @model required="true"
	 * @generated
	 */
	String getRelation();

	/**
	 * Sets the value of the '{@link jgrapht.Edge#getRelation <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' attribute.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(String value);

} // Edge
