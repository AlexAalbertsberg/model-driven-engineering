/**
 */
package com.adsa.emf.sql.model.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.adsa.emf.sql.model.model.Select#getColumn <em>Column</em>}</li>
 *   <li>{@link com.adsa.emf.sql.model.model.Select#getFrom <em>From</em>}</li>
 *   <li>{@link com.adsa.emf.sql.model.model.Select#getWhere <em>Where</em>}</li>
 *   <li>{@link com.adsa.emf.sql.model.model.Select#getUnion <em>Union</em>}</li>
 * </ul>
 *
 * @see com.adsa.emf.sql.model.model.ModelPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link com.adsa.emf.sql.model.model.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see com.adsa.emf.sql.model.model.ModelPackage#getSelect_Column()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(From)
	 * @see com.adsa.emf.sql.model.model.ModelPackage#getSelect_From()
	 * @model containment="true" required="true"
	 * @generated
	 */
	From getFrom();

	/**
	 * Sets the value of the '{@link com.adsa.emf.sql.model.model.Select#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(From value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Where)
	 * @see com.adsa.emf.sql.model.model.ModelPackage#getSelect_Where()
	 * @model containment="true"
	 * @generated
	 */
	Where getWhere();

	/**
	 * Sets the value of the '{@link com.adsa.emf.sql.model.model.Select#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Where value);

	/**
	 * Returns the value of the '<em><b>Union</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union</em>' containment reference.
	 * @see #setUnion(Union)
	 * @see com.adsa.emf.sql.model.model.ModelPackage#getSelect_Union()
	 * @model containment="true"
	 * @generated
	 */
	Union getUnion();

	/**
	 * Sets the value of the '{@link com.adsa.emf.sql.model.model.Select#getUnion <em>Union</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Union</em>' containment reference.
	 * @see #getUnion()
	 * @generated
	 */
	void setUnion(Union value);

} // Select
