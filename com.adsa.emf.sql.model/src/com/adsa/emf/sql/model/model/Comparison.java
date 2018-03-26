/**
 */
package com.adsa.emf.sql.model.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.adsa.emf.sql.model.model.Comparison#getLhs <em>Lhs</em>}</li>
 *   <li>{@link com.adsa.emf.sql.model.model.Comparison#getRhs <em>Rhs</em>}</li>
 *   <li>{@link com.adsa.emf.sql.model.model.Comparison#getComparisonoperator <em>Comparisonoperator</em>}</li>
 * </ul>
 *
 * @see com.adsa.emf.sql.model.model.ModelPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends Condition {
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
	 * @see com.adsa.emf.sql.model.model.ModelPackage#getComparison_Lhs()
	 * @model required="true"
	 * @generated
	 */
	String getLhs();

	/**
	 * Sets the value of the '{@link com.adsa.emf.sql.model.model.Comparison#getLhs <em>Lhs</em>}' attribute.
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
	 * @see com.adsa.emf.sql.model.model.ModelPackage#getComparison_Rhs()
	 * @model required="true"
	 * @generated
	 */
	String getRhs();

	/**
	 * Sets the value of the '{@link com.adsa.emf.sql.model.model.Comparison#getRhs <em>Rhs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' attribute.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(String value);

	/**
	 * Returns the value of the '<em><b>Comparisonoperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparisonoperator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparisonoperator</em>' containment reference.
	 * @see #setComparisonoperator(ComparisonOperator)
	 * @see com.adsa.emf.sql.model.model.ModelPackage#getComparison_Comparisonoperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComparisonOperator getComparisonoperator();

	/**
	 * Sets the value of the '{@link com.adsa.emf.sql.model.model.Comparison#getComparisonoperator <em>Comparisonoperator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparisonoperator</em>' containment reference.
	 * @see #getComparisonoperator()
	 * @generated
	 */
	void setComparisonoperator(ComparisonOperator value);

} // Comparison
