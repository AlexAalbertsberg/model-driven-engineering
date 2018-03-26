/**
 */
package school;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Of Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link school.CourseOfStudy#getCourse <em>Course</em>}</li>
 *   <li>{@link school.CourseOfStudy#getFaculty <em>Faculty</em>}</li>
 *   <li>{@link school.CourseOfStudy#getName <em>Name</em>}</li>
 *   <li>{@link school.CourseOfStudy#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see school.SchoolPackage#getCourseOfStudy()
 * @model
 * @generated
 */
public interface CourseOfStudy extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference list.
	 * The list contents are of type {@link school.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference list.
	 * @see school.SchoolPackage#getCourseOfStudy_Course()
	 * @model
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Faculty</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link school.Faculty#getCourseofstudy <em>Courseofstudy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faculty</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculty</em>' reference.
	 * @see #setFaculty(Faculty)
	 * @see school.SchoolPackage#getCourseOfStudy_Faculty()
	 * @see school.Faculty#getCourseofstudy
	 * @model opposite="courseofstudy" required="true"
	 * @generated
	 */
	Faculty getFaculty();

	/**
	 * Sets the value of the '{@link school.CourseOfStudy#getFaculty <em>Faculty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faculty</em>' reference.
	 * @see #getFaculty()
	 * @generated
	 */
	void setFaculty(Faculty value);

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
	 * @see school.SchoolPackage#getCourseOfStudy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link school.CourseOfStudy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference list.
	 * The list contents are of type {@link school.Student}.
	 * It is bidirectional and its opposite is '{@link school.Student#getCourseofstudy <em>Courseofstudy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference list.
	 * @see school.SchoolPackage#getCourseOfStudy_Student()
	 * @see school.Student#getCourseofstudy
	 * @model opposite="courseofstudy"
	 * @generated
	 */
	EList<Student> getStudent();

} // CourseOfStudy
