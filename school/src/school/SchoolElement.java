/**
 */
package school;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Element</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see school.SchoolPackage#getSchoolElement()
 * @model
 * @generated
 */
public enum SchoolElement implements Enumerator {
	/**
	 * The '<em><b>School</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_VALUE
	 * @generated
	 * @ordered
	 */
	SCHOOL(0, "School", "School"),

	/**
	 * The '<em><b>Student</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDENT_VALUE
	 * @generated
	 * @ordered
	 */
	STUDENT(1, "Student", "Student"),

	/**
	 * The '<em><b>Teacher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEACHER_VALUE
	 * @generated
	 * @ordered
	 */
	TEACHER(2, "Teacher", "Teacher"),

	/**
	 * The '<em><b>Faculty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACULTY_VALUE
	 * @generated
	 * @ordered
	 */
	FACULTY(3, "Faculty", "Faculty"),

	/**
	 * The '<em><b>Course Of Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COURSE_OF_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	COURSE_OF_STUDY(4, "CourseOfStudy", "CourseOfStudy"),

	/**
	 * The '<em><b>Course</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COURSE_VALUE
	 * @generated
	 * @ordered
	 */
	COURSE(5, "Course", "Course");

	/**
	 * The '<em><b>School</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>School</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHOOL
	 * @model name="School"
	 * @generated
	 * @ordered
	 */
	public static final int SCHOOL_VALUE = 0;

	/**
	 * The '<em><b>Student</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Student</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STUDENT
	 * @model name="Student"
	 * @generated
	 * @ordered
	 */
	public static final int STUDENT_VALUE = 1;

	/**
	 * The '<em><b>Teacher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Teacher</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEACHER
	 * @model name="Teacher"
	 * @generated
	 * @ordered
	 */
	public static final int TEACHER_VALUE = 2;

	/**
	 * The '<em><b>Faculty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Faculty</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACULTY
	 * @model name="Faculty"
	 * @generated
	 * @ordered
	 */
	public static final int FACULTY_VALUE = 3;

	/**
	 * The '<em><b>Course Of Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Course Of Study</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COURSE_OF_STUDY
	 * @model name="CourseOfStudy"
	 * @generated
	 * @ordered
	 */
	public static final int COURSE_OF_STUDY_VALUE = 4;

	/**
	 * The '<em><b>Course</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Course</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COURSE
	 * @model name="Course"
	 * @generated
	 * @ordered
	 */
	public static final int COURSE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Element</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SchoolElement[] VALUES_ARRAY =
		new SchoolElement[] {
			SCHOOL,
			STUDENT,
			TEACHER,
			FACULTY,
			COURSE_OF_STUDY,
			COURSE,
		};

	/**
	 * A public read-only list of all the '<em><b>Element</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SchoolElement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Element</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchoolElement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchoolElement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchoolElement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchoolElement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchoolElement get(int value) {
		switch (value) {
			case SCHOOL_VALUE: return SCHOOL;
			case STUDENT_VALUE: return STUDENT;
			case TEACHER_VALUE: return TEACHER;
			case FACULTY_VALUE: return FACULTY;
			case COURSE_OF_STUDY_VALUE: return COURSE_OF_STUDY;
			case COURSE_VALUE: return COURSE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SchoolElement(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SchoolElement
