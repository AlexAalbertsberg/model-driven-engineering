/**
 */
package mde.lect6.action.Action;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.lect6.action.Action.Condition#getExpression <em>Expression</em>}</li>
 *   <li>{@link mde.lect6.action.Action.Condition#getYes <em>Yes</em>}</li>
 *   <li>{@link mde.lect6.action.Action.Condition#getNo <em>No</em>}</li>
 * </ul>
 *
 * @see mde.lect6.action.Action.ActionPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Action {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(BooleanExp)
	 * @see mde.lect6.action.Action.ActionPackage#getCondition_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanExp getExpression();

	/**
	 * Sets the value of the '{@link mde.lect6.action.Action.Condition#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(BooleanExp value);

	/**
	 * Returns the value of the '<em><b>Yes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yes</em>' reference.
	 * @see #setYes(Action)
	 * @see mde.lect6.action.Action.ActionPackage#getCondition_Yes()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Action getYes();

	/**
	 * Sets the value of the '{@link mde.lect6.action.Action.Condition#getYes <em>Yes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yes</em>' reference.
	 * @see #getYes()
	 * @generated
	 */
	void setYes(Action value);

	/**
	 * Returns the value of the '<em><b>No</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No</em>' reference.
	 * @see #setNo(Action)
	 * @see mde.lect6.action.Action.ActionPackage#getCondition_No()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Action getNo();

	/**
	 * Sets the value of the '{@link mde.lect6.action.Action.Condition#getNo <em>No</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No</em>' reference.
	 * @see #getNo()
	 * @generated
	 */
	void setNo(Action value);

} // Condition
