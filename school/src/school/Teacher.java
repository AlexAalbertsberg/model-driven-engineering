/**
 */
package school;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link school.Teacher#getTeaches <em>Teaches</em>}</li>
 *   <li>{@link school.Teacher#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see school.SchoolPackage#getTeacher()
 * @model
 * @generated
 */
public interface Teacher extends EObject {
	/**
	 * Returns the value of the '<em><b>Teaches</b></em>' reference list.
	 * The list contents are of type {@link school.Course}.
	 * It is bidirectional and its opposite is '{@link school.Course#getTaughtBy <em>Taught By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teaches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teaches</em>' reference list.
	 * @see school.SchoolPackage#getTeacher_Teaches()
	 * @see school.Course#getTaughtBy
	 * @model opposite="taughtBy"
	 * @generated
	 */
	EList<Course> getTeaches();

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
	 * @see school.SchoolPackage#getTeacher_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link school.Teacher#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Teacher
