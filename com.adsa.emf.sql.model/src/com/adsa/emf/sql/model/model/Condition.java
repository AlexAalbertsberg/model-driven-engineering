/**
 */
package com.adsa.emf.sql.model.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.adsa.emf.sql.model.model.Condition#getBooleanoperation <em>Booleanoperation</em>}</li>
 * </ul>
 *
 * @see com.adsa.emf.sql.model.model.ModelPackage#getCondition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Booleanoperation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booleanoperation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanoperation</em>' containment reference.
	 * @see #setBooleanoperation(BooleanOperation)
	 * @see com.adsa.emf.sql.model.model.ModelPackage#getCondition_Booleanoperation()
	 * @model containment="true"
	 * @generated
	 */
	BooleanOperation getBooleanoperation();

	/**
	 * Sets the value of the '{@link com.adsa.emf.sql.model.model.Condition#getBooleanoperation <em>Booleanoperation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booleanoperation</em>' containment reference.
	 * @see #getBooleanoperation()
	 * @generated
	 */
	void setBooleanoperation(BooleanOperation value);

} // Condition
