/**
 */
package school;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link school.School#getFaculty <em>Faculty</em>}</li>
 *   <li>{@link school.School#getCourseofstudy <em>Courseofstudy</em>}</li>
 *   <li>{@link school.School#getCourse <em>Course</em>}</li>
 *   <li>{@link school.School#getStudent <em>Student</em>}</li>
 *   <li>{@link school.School#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link school.School#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see school.SchoolPackage#getSchool()
 * @model
 * @generated
 */
public interface School extends EObject {
	/**
	 * Returns the value of the '<em><b>Faculty</b></em>' containment reference list.
	 * The list contents are of type {@link school.Faculty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faculty</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculty</em>' containment reference list.
	 * @see school.SchoolPackage#getSchool_Faculty()
	 * @model containment="true"
	 * @generated
	 */
	EList<Faculty> getFaculty();

	/**
	 * Returns the value of the '<em><b>Courseofstudy</b></em>' containment reference list.
	 * The list contents are of type {@link school.CourseOfStudy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courseofstudy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courseofstudy</em>' containment reference list.
	 * @see school.SchoolPackage#getSchool_Courseofstudy()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseOfStudy> getCourseofstudy();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link school.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see school.SchoolPackage#getSchool_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Student</b></em>' containment reference list.
	 * The list contents are of type {@link school.Student}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' containment reference list.
	 * @see school.SchoolPackage#getSchool_Student()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudent();

	/**
	 * Returns the value of the '<em><b>Teacher</b></em>' containment reference list.
	 * The list contents are of type {@link school.Teacher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teacher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacher</em>' containment reference list.
	 * @see school.SchoolPackage#getSchool_Teacher()
	 * @model containment="true"
	 * @generated
	 */
	EList<Teacher> getTeacher();

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
	 * @see school.SchoolPackage#getSchool_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link school.School#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // School
