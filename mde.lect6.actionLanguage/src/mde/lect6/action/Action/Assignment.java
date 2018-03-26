/**
 */
package mde.lect6.action.Action;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.lect6.action.Action.Assignment#getName <em>Name</em>}</li>
 *   <li>{@link mde.lect6.action.Action.Assignment#getValue <em>Value</em>}</li>
 *   <li>{@link mde.lect6.action.Action.Assignment#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see mde.lect6.action.Action.ActionPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Action {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mde.lect6.action.Action.ActionPackage#getAssignment_Name()
	 * @model unique="false" dataType="mde.lect6.action.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mde.lect6.action.Action.Assignment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(IntegerExp)
	 * @see mde.lect6.action.Action.ActionPackage#getAssignment_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	IntegerExp getValue();

	/**
	 * Sets the value of the '{@link mde.lect6.action.Action.Assignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(IntegerExp value);

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
	 * @see mde.lect6.action.Action.ActionPackage#getAssignment_Next()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Action getNext();

	/**
	 * Sets the value of the '{@link mde.lect6.action.Action.Assignment#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Action value);

} // Assignment
