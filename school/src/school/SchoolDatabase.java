/**
 */
package school;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link school.SchoolDatabase#getSchool <em>School</em>}</li>
 *   <li>{@link school.SchoolDatabase#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see school.SchoolPackage#getSchoolDatabase()
 * @model
 * @generated
 */
public interface SchoolDatabase extends EObject {
	/**
	 * Returns the value of the '<em><b>School</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' containment reference.
	 * @see #setSchool(School)
	 * @see school.SchoolPackage#getSchoolDatabase_School()
	 * @model containment="true" required="true"
	 * @generated
	 */
	School getSchool();

	/**
	 * Sets the value of the '{@link school.SchoolDatabase#getSchool <em>School</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' containment reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(School value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference list.
	 * The list contents are of type {@link school.Query}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference list.
	 * @see school.SchoolPackage#getSchoolDatabase_Query()
	 * @model containment="true"
	 * @generated
	 */
	EList<Query> getQuery();

} // SchoolDatabase
