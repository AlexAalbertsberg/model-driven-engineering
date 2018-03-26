/**
 */
package com.adsa.emf.sql.model.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.adsa.emf.sql.model.model.From#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see com.adsa.emf.sql.model.model.ModelPackage#getFrom()
 * @model
 * @generated
 */
public interface From extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link com.adsa.emf.sql.model.model.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see com.adsa.emf.sql.model.model.ModelPackage#getFrom_Table()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Table> getTable();

} // From
