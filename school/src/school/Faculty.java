/**
 */
package school;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faculty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link school.Faculty#getCourseofstudy <em>Courseofstudy</em>}</li>
 *   <li>{@link school.Faculty#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see school.SchoolPackage#getFaculty()
 * @model
 * @generated
 */
public interface Faculty extends EObject {
	/**
	 * Returns the value of the '<em><b>Courseofstudy</b></em>' reference list.
	 * The list contents are of type {@link school.CourseOfStudy}.
	 * It is bidirectional and its opposite is '{@link school.CourseOfStudy#getFaculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courseofstudy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courseofstudy</em>' reference list.
	 * @see school.SchoolPackage#getFaculty_Courseofstudy()
	 * @see school.CourseOfStudy#getFaculty
	 * @model opposite="faculty"
	 * @generated
	 */
	EList<CourseOfStudy> getCourseofstudy();

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
	 * @see school.SchoolPackage#getFaculty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link school.Faculty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Faculty
