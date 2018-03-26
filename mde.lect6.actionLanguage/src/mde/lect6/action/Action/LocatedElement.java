/**
 */
package mde.lect6.action.Action;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Located Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.lect6.action.Action.LocatedElement#getLocation <em>Location</em>}</li>
 *   <li>{@link mde.lect6.action.Action.LocatedElement#getCommentsBefore <em>Comments Before</em>}</li>
 *   <li>{@link mde.lect6.action.Action.LocatedElement#getCommentsAfter <em>Comments After</em>}</li>
 * </ul>
 *
 * @see mde.lect6.action.Action.ActionPackage#getLocatedElement()
 * @model abstract="true"
 * @generated
 */
public interface LocatedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see mde.lect6.action.Action.ActionPackage#getLocatedElement_Location()
	 * @model unique="false" dataType="mde.lect6.action.PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link mde.lect6.action.Action.LocatedElement#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Comments Before</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments Before</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments Before</em>' attribute list.
	 * @see mde.lect6.action.Action.ActionPackage#getLocatedElement_CommentsBefore()
	 * @model unique="false" dataType="mde.lect6.action.PrimitiveTypes.String"
	 * @generated
	 */
	EList<String> getCommentsBefore();

	/**
	 * Returns the value of the '<em><b>Comments After</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments After</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments After</em>' attribute list.
	 * @see mde.lect6.action.Action.ActionPackage#getLocatedElement_CommentsAfter()
	 * @model unique="false" dataType="mde.lect6.action.PrimitiveTypes.String"
	 * @generated
	 */
	EList<String> getCommentsAfter();

} // LocatedElement
