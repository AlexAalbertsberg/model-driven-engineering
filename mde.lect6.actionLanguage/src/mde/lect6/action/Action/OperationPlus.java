/**
 */
package mde.lect6.action.Action;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.lect6.action.Action.OperationPlus#getLeft <em>Left</em>}</li>
 *   <li>{@link mde.lect6.action.Action.OperationPlus#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see mde.lect6.action.Action.ActionPackage#getOperationPlus()
 * @model
 * @generated
 */
public interface OperationPlus extends IntegerExp {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(IntOperand)
	 * @see mde.lect6.action.Action.ActionPackage#getOperationPlus_Left()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	IntOperand getLeft();

	/**
	 * Sets the value of the '{@link mde.lect6.action.Action.OperationPlus#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(IntOperand value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(IntegerExp)
	 * @see mde.lect6.action.Action.ActionPackage#getOperationPlus_Right()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	IntegerExp getRight();

	/**
	 * Sets the value of the '{@link mde.lect6.action.Action.OperationPlus#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(IntegerExp value);

} // OperationPlus
