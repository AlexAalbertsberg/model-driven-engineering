/**
 */
package school;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link school.Query#getStudent <em>Student</em>}</li>
 *   <li>{@link school.Query#getWhere <em>Where</em>}</li>
 *   <li>{@link school.Query#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see school.SchoolPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference.
	 * @see #setStudent(Student)
	 * @see school.SchoolPackage#getQuery_Student()
	 * @model
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link school.Query#getStudent <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

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
	 * @see school.SchoolPackage#getQuery_Where()
	 * @model containment="true"
	 * @generated
	 */
	Where getWhere();

	/**
	 * Sets the value of the '{@link school.Query#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Where value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link school.SchoolElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see school.SchoolElement
	 * @see #setType(SchoolElement)
	 * @see school.SchoolPackage#getQuery_Type()
	 * @model
	 * @generated
	 */
	SchoolElement getType();

	/**
	 * Sets the value of the '{@link school.Query#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see school.SchoolElement
	 * @see #getType()
	 * @generated
	 */
	void setType(SchoolElement value);

} // Query
