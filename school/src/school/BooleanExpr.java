/**
 */
package school;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link school.BooleanExpr#getAnd <em>And</em>}</li>
 *   <li>{@link school.BooleanExpr#getOr <em>Or</em>}</li>
 *   <li>{@link school.BooleanExpr#getLhs <em>Lhs</em>}</li>
 *   <li>{@link school.BooleanExpr#getRhs <em>Rhs</em>}</li>
 *   <li>{@link school.BooleanExpr#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see school.SchoolPackage#getBooleanExpr()
 * @model
 * @generated
 */
public interface BooleanExpr extends EObject {
	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference.
	 * @see #setAnd(BooleanExpr)
	 * @see school.SchoolPackage#getBooleanExpr_And()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpr getAnd();

	/**
	 * Sets the value of the '{@link school.BooleanExpr#getAnd <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And</em>' containment reference.
	 * @see #getAnd()
	 * @generated
	 */
	void setAnd(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference.
	 * @see #setOr(BooleanExpr)
	 * @see school.SchoolPackage#getBooleanExpr_Or()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpr getOr();

	/**
	 * Sets the value of the '{@link school.BooleanExpr#getOr <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' containment reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' attribute.
	 * @see #setLhs(String)
	 * @see school.SchoolPackage#getBooleanExpr_Lhs()
	 * @model
	 * @generated
	 */
	String getLhs();

	/**
	 * Sets the value of the '{@link school.BooleanExpr#getLhs <em>Lhs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' attribute.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(String value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' attribute.
	 * @see #setRhs(String)
	 * @see school.SchoolPackage#getBooleanExpr_Rhs()
	 * @model
	 * @generated
	 */
	String getRhs();

	/**
	 * Sets the value of the '{@link school.BooleanExpr#getRhs <em>Rhs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' attribute.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see school.SchoolPackage#getBooleanExpr_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link school.BooleanExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

} // BooleanExpr
