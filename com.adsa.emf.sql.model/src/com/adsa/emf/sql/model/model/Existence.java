/**
 */
package com.adsa.emf.sql.model.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Existence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.adsa.emf.sql.model.model.Existence#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see com.adsa.emf.sql.model.model.ModelPackage#getExistence()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Existence extends Condition {
	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference.
	 * @see #setSelect(Select)
	 * @see com.adsa.emf.sql.model.model.ModelPackage#getExistence_Select()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Select getSelect();

	/**
	 * Sets the value of the '{@link com.adsa.emf.sql.model.model.Existence#getSelect <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' containment reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(Select value);

} // Existence
