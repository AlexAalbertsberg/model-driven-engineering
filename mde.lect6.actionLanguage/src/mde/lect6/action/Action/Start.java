/**
 */
package mde.lect6.action.Action;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.lect6.action.Action.Start#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see mde.lect6.action.Action.ActionPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends Action {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Action)
	 * @see mde.lect6.action.Action.ActionPackage#getStart_Next()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Action getNext();

	/**
	 * Sets the value of the '{@link mde.lect6.action.Action.Start#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Action value);

} // Start
