/**
 */
package com.adsa.emf.sql.model.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.adsa.emf.sql.model.model.Column#getName <em>Name</em>}</li>
 *   <li>{@link com.adsa.emf.sql.model.model.Column#getColumnalias <em>Columnalias</em>}</li>
 * </ul>
 *
 * @see com.adsa.emf.sql.model.model.ModelPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
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
	 * @see com.adsa.emf.sql.model.model.ModelPackage#getColumn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.adsa.emf.sql.model.model.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Columnalias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnalias</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnalias</em>' containment reference.
	 * @see #setColumnalias(ColumnAlias)
	 * @see com.adsa.emf.sql.model.model.ModelPackage#getColumn_Columnalias()
	 * @model containment="true"
	 * @generated
	 */
	ColumnAlias getColumnalias();

	/**
	 * Sets the value of the '{@link com.adsa.emf.sql.model.model.Column#getColumnalias <em>Columnalias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnalias</em>' containment reference.
	 * @see #getColumnalias()
	 * @generated
	 */
	void setColumnalias(ColumnAlias value);

} // Column
