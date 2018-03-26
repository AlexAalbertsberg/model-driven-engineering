/**
 */
package school;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link school.Course#getEnrolledStudent <em>Enrolled Student</em>}</li>
 *   <li>{@link school.Course#getTaughtBy <em>Taught By</em>}</li>
 *   <li>{@link school.Course#getCourseresult <em>Courseresult</em>}</li>
 *   <li>{@link school.Course#getName <em>Name</em>}</li>
 *   <li>{@link school.Course#getCourseNumber <em>Course Number</em>}</li>
 * </ul>
 *
 * @see school.SchoolPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Enrolled Student</b></em>' reference list.
	 * The list contents are of type {@link school.Student}.
	 * It is bidirectional and its opposite is '{@link school.Student#getEnrolledIn <em>Enrolled In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrolled Student</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled Student</em>' reference list.
	 * @see school.SchoolPackage#getCourse_EnrolledStudent()
	 * @see school.Student#getEnrolledIn
	 * @model opposite="enrolledIn"
	 * @generated
	 */
	EList<Student> getEnrolledStudent();

	/**
	 * Returns the value of the '<em><b>Taught By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link school.Teacher#getTeaches <em>Teaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taught By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taught By</em>' reference.
	 * @see #setTaughtBy(Teacher)
	 * @see school.SchoolPackage#getCourse_TaughtBy()
	 * @see school.Teacher#getTeaches
	 * @model opposite="teaches" required="true"
	 * @generated
	 */
	Teacher getTaughtBy();

	/**
	 * Sets the value of the '{@link school.Course#getTaughtBy <em>Taught By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taught By</em>' reference.
	 * @see #getTaughtBy()
	 * @generated
	 */
	void setTaughtBy(Teacher value);

	/**
	 * Returns the value of the '<em><b>Courseresult</b></em>' containment reference list.
	 * The list contents are of type {@link school.CourseResult}.
	 * It is bidirectional and its opposite is '{@link school.CourseResult#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courseresult</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courseresult</em>' containment reference list.
	 * @see school.SchoolPackage#getCourse_Courseresult()
	 * @see school.CourseResult#getCourse
	 * @model opposite="course" containment="true"
	 * @generated
	 */
	EList<CourseResult> getCourseresult();

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
	 * @see school.SchoolPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link school.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Course Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Number</em>' attribute.
	 * @see #setCourseNumber(String)
	 * @see school.SchoolPackage#getCourse_CourseNumber()
	 * @model
	 * @generated
	 */
	String getCourseNumber();

	/**
	 * Sets the value of the '{@link school.Course#getCourseNumber <em>Course Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Number</em>' attribute.
	 * @see #getCourseNumber()
	 * @generated
	 */
	void setCourseNumber(String value);

} // Course
