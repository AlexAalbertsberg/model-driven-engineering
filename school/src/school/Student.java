/**
 */
package school;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link school.Student#getEnrolledIn <em>Enrolled In</em>}</li>
 *   <li>{@link school.Student#getName <em>Name</em>}</li>
 *   <li>{@link school.Student#getStudentNumber <em>Student Number</em>}</li>
 *   <li>{@link school.Student#getCourseofstudy <em>Courseofstudy</em>}</li>
 * </ul>
 *
 * @see school.SchoolPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Enrolled In</b></em>' reference list.
	 * The list contents are of type {@link school.Course}.
	 * It is bidirectional and its opposite is '{@link school.Course#getEnrolledStudent <em>Enrolled Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrolled In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled In</em>' reference list.
	 * @see school.SchoolPackage#getStudent_EnrolledIn()
	 * @see school.Course#getEnrolledStudent
	 * @model opposite="enrolledStudent"
	 * @generated
	 */
	EList<Course> getEnrolledIn();

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
	 * @see school.SchoolPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link school.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Student Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student Number</em>' attribute.
	 * @see #setStudentNumber(String)
	 * @see school.SchoolPackage#getStudent_StudentNumber()
	 * @model
	 * @generated
	 */
	String getStudentNumber();

	/**
	 * Sets the value of the '{@link school.Student#getStudentNumber <em>Student Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student Number</em>' attribute.
	 * @see #getStudentNumber()
	 * @generated
	 */
	void setStudentNumber(String value);

	/**
	 * Returns the value of the '<em><b>Courseofstudy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link school.CourseOfStudy#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courseofstudy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courseofstudy</em>' reference.
	 * @see #setCourseofstudy(CourseOfStudy)
	 * @see school.SchoolPackage#getStudent_Courseofstudy()
	 * @see school.CourseOfStudy#getStudent
	 * @model opposite="student" required="true"
	 * @generated
	 */
	CourseOfStudy getCourseofstudy();

	/**
	 * Sets the value of the '{@link school.Student#getCourseofstudy <em>Courseofstudy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Courseofstudy</em>' reference.
	 * @see #getCourseofstudy()
	 * @generated
	 */
	void setCourseofstudy(CourseOfStudy value);

} // Student
