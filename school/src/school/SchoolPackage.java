/**
 */
package school;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see school.SchoolFactory
 * @model kind="package"
 * @generated
 */
public interface SchoolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "school";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/school";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "school";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchoolPackage eINSTANCE = school.impl.SchoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link school.impl.SchoolImpl <em>School</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.SchoolImpl
	 * @see school.impl.SchoolPackageImpl#getSchool()
	 * @generated
	 */
	int SCHOOL = 0;

	/**
	 * The feature id for the '<em><b>Faculty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__FACULTY = 0;

	/**
	 * The feature id for the '<em><b>Courseofstudy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__COURSEOFSTUDY = 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__COURSE = 2;

	/**
	 * The feature id for the '<em><b>Student</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__STUDENT = 3;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__TEACHER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__NAME = 5;

	/**
	 * The number of structural features of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.impl.FacultyImpl <em>Faculty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.FacultyImpl
	 * @see school.impl.SchoolPackageImpl#getFaculty()
	 * @generated
	 */
	int FACULTY = 1;

	/**
	 * The feature id for the '<em><b>Courseofstudy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__COURSEOFSTUDY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Faculty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Faculty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.impl.CourseOfStudyImpl <em>Course Of Study</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.CourseOfStudyImpl
	 * @see school.impl.SchoolPackageImpl#getCourseOfStudy()
	 * @generated
	 */
	int COURSE_OF_STUDY = 2;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_STUDY__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Faculty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_STUDY__FACULTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_STUDY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_STUDY__STUDENT = 3;

	/**
	 * The number of structural features of the '<em>Course Of Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_STUDY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course Of Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_STUDY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.CourseImpl
	 * @see school.impl.SchoolPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 3;

	/**
	 * The feature id for the '<em><b>Enrolled Student</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ENROLLED_STUDENT = 0;

	/**
	 * The feature id for the '<em><b>Taught By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TAUGHT_BY = 1;

	/**
	 * The feature id for the '<em><b>Courseresult</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSERESULT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Course Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_NUMBER = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.StudentImpl
	 * @see school.impl.SchoolPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 4;

	/**
	 * The feature id for the '<em><b>Enrolled In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ENROLLED_IN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Student Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STUDENT_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Courseofstudy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__COURSEOFSTUDY = 3;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.impl.TeacherImpl <em>Teacher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.TeacherImpl
	 * @see school.impl.SchoolPackageImpl#getTeacher()
	 * @generated
	 */
	int TEACHER = 5;

	/**
	 * The feature id for the '<em><b>Teaches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__TEACHES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.impl.CourseResultImpl <em>Course Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.CourseResultImpl
	 * @see school.impl.SchoolPackageImpl#getCourseResult()
	 * @generated
	 */
	int COURSE_RESULT = 6;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_RESULT__STUDENT = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_RESULT__COURSE = 1;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_RESULT__GRADE = 2;

	/**
	 * The number of structural features of the '<em>Course Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.QueryImpl
	 * @see school.impl.SchoolPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 7;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__STUDENT = 0;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__WHERE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.impl.WhereImpl <em>Where</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.WhereImpl
	 * @see school.impl.SchoolPackageImpl#getWhere()
	 * @generated
	 */
	int WHERE = 8;

	/**
	 * The feature id for the '<em><b>Booleanexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE__BOOLEANEXPR = 0;

	/**
	 * The number of structural features of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.BooleanExprImpl
	 * @see school.impl.SchoolPackageImpl#getBooleanExpr()
	 * @generated
	 */
	int BOOLEAN_EXPR = 9;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__AND = 0;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__OR = 1;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__LHS = 2;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__RHS = 3;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR__OPERATOR = 4;

	/**
	 * The number of structural features of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Boolean Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.impl.SchoolDatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.impl.SchoolDatabaseImpl
	 * @see school.impl.SchoolPackageImpl#getSchoolDatabase()
	 * @generated
	 */
	int SCHOOL_DATABASE = 10;

	/**
	 * The feature id for the '<em><b>School</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_DATABASE__SCHOOL = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_DATABASE__QUERY = 1;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_DATABASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link school.SchoolElement <em>Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see school.SchoolElement
	 * @see school.impl.SchoolPackageImpl#getSchoolElement()
	 * @generated
	 */
	int SCHOOL_ELEMENT = 11;


	/**
	 * Returns the meta object for class '{@link school.School <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>School</em>'.
	 * @see school.School
	 * @generated
	 */
	EClass getSchool();

	/**
	 * Returns the meta object for the containment reference list '{@link school.School#getFaculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faculty</em>'.
	 * @see school.School#getFaculty()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Faculty();

	/**
	 * Returns the meta object for the containment reference list '{@link school.School#getCourseofstudy <em>Courseofstudy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courseofstudy</em>'.
	 * @see school.School#getCourseofstudy()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Courseofstudy();

	/**
	 * Returns the meta object for the containment reference list '{@link school.School#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see school.School#getCourse()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Course();

	/**
	 * Returns the meta object for the containment reference list '{@link school.School#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Student</em>'.
	 * @see school.School#getStudent()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Student();

	/**
	 * Returns the meta object for the containment reference list '{@link school.School#getTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teacher</em>'.
	 * @see school.School#getTeacher()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Teacher();

	/**
	 * Returns the meta object for the attribute '{@link school.School#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see school.School#getName()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_Name();

	/**
	 * Returns the meta object for class '{@link school.Faculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Faculty</em>'.
	 * @see school.Faculty
	 * @generated
	 */
	EClass getFaculty();

	/**
	 * Returns the meta object for the reference list '{@link school.Faculty#getCourseofstudy <em>Courseofstudy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courseofstudy</em>'.
	 * @see school.Faculty#getCourseofstudy()
	 * @see #getFaculty()
	 * @generated
	 */
	EReference getFaculty_Courseofstudy();

	/**
	 * Returns the meta object for the attribute '{@link school.Faculty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see school.Faculty#getName()
	 * @see #getFaculty()
	 * @generated
	 */
	EAttribute getFaculty_Name();

	/**
	 * Returns the meta object for class '{@link school.CourseOfStudy <em>Course Of Study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Of Study</em>'.
	 * @see school.CourseOfStudy
	 * @generated
	 */
	EClass getCourseOfStudy();

	/**
	 * Returns the meta object for the reference list '{@link school.CourseOfStudy#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course</em>'.
	 * @see school.CourseOfStudy#getCourse()
	 * @see #getCourseOfStudy()
	 * @generated
	 */
	EReference getCourseOfStudy_Course();

	/**
	 * Returns the meta object for the reference '{@link school.CourseOfStudy#getFaculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Faculty</em>'.
	 * @see school.CourseOfStudy#getFaculty()
	 * @see #getCourseOfStudy()
	 * @generated
	 */
	EReference getCourseOfStudy_Faculty();

	/**
	 * Returns the meta object for the attribute '{@link school.CourseOfStudy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see school.CourseOfStudy#getName()
	 * @see #getCourseOfStudy()
	 * @generated
	 */
	EAttribute getCourseOfStudy_Name();

	/**
	 * Returns the meta object for the reference list '{@link school.CourseOfStudy#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Student</em>'.
	 * @see school.CourseOfStudy#getStudent()
	 * @see #getCourseOfStudy()
	 * @generated
	 */
	EReference getCourseOfStudy_Student();

	/**
	 * Returns the meta object for class '{@link school.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see school.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the reference list '{@link school.Course#getEnrolledStudent <em>Enrolled Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enrolled Student</em>'.
	 * @see school.Course#getEnrolledStudent()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_EnrolledStudent();

	/**
	 * Returns the meta object for the reference '{@link school.Course#getTaughtBy <em>Taught By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Taught By</em>'.
	 * @see school.Course#getTaughtBy()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_TaughtBy();

	/**
	 * Returns the meta object for the containment reference list '{@link school.Course#getCourseresult <em>Courseresult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courseresult</em>'.
	 * @see school.Course#getCourseresult()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Courseresult();

	/**
	 * Returns the meta object for the attribute '{@link school.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see school.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link school.Course#getCourseNumber <em>Course Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Number</em>'.
	 * @see school.Course#getCourseNumber()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseNumber();

	/**
	 * Returns the meta object for class '{@link school.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see school.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the reference list '{@link school.Student#getEnrolledIn <em>Enrolled In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enrolled In</em>'.
	 * @see school.Student#getEnrolledIn()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_EnrolledIn();

	/**
	 * Returns the meta object for the attribute '{@link school.Student#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see school.Student#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the attribute '{@link school.Student#getStudentNumber <em>Student Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Student Number</em>'.
	 * @see school.Student#getStudentNumber()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_StudentNumber();

	/**
	 * Returns the meta object for the reference '{@link school.Student#getCourseofstudy <em>Courseofstudy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Courseofstudy</em>'.
	 * @see school.Student#getCourseofstudy()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Courseofstudy();

	/**
	 * Returns the meta object for class '{@link school.Teacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teacher</em>'.
	 * @see school.Teacher
	 * @generated
	 */
	EClass getTeacher();

	/**
	 * Returns the meta object for the reference list '{@link school.Teacher#getTeaches <em>Teaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teaches</em>'.
	 * @see school.Teacher#getTeaches()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_Teaches();

	/**
	 * Returns the meta object for the attribute '{@link school.Teacher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see school.Teacher#getName()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Name();

	/**
	 * Returns the meta object for class '{@link school.CourseResult <em>Course Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Result</em>'.
	 * @see school.CourseResult
	 * @generated
	 */
	EClass getCourseResult();

	/**
	 * Returns the meta object for the reference '{@link school.CourseResult#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Student</em>'.
	 * @see school.CourseResult#getStudent()
	 * @see #getCourseResult()
	 * @generated
	 */
	EReference getCourseResult_Student();

	/**
	 * Returns the meta object for the container reference '{@link school.CourseResult#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course</em>'.
	 * @see school.CourseResult#getCourse()
	 * @see #getCourseResult()
	 * @generated
	 */
	EReference getCourseResult_Course();

	/**
	 * Returns the meta object for the attribute '{@link school.CourseResult#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see school.CourseResult#getGrade()
	 * @see #getCourseResult()
	 * @generated
	 */
	EAttribute getCourseResult_Grade();

	/**
	 * Returns the meta object for class '{@link school.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see school.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the reference '{@link school.Query#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Student</em>'.
	 * @see school.Query#getStudent()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Student();

	/**
	 * Returns the meta object for the containment reference '{@link school.Query#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see school.Query#getWhere()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Where();

	/**
	 * Returns the meta object for the attribute '{@link school.Query#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see school.Query#getType()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Type();

	/**
	 * Returns the meta object for class '{@link school.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where</em>'.
	 * @see school.Where
	 * @generated
	 */
	EClass getWhere();

	/**
	 * Returns the meta object for the containment reference '{@link school.Where#getBooleanexpr <em>Booleanexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Booleanexpr</em>'.
	 * @see school.Where#getBooleanexpr()
	 * @see #getWhere()
	 * @generated
	 */
	EReference getWhere_Booleanexpr();

	/**
	 * Returns the meta object for class '{@link school.BooleanExpr <em>Boolean Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expr</em>'.
	 * @see school.BooleanExpr
	 * @generated
	 */
	EClass getBooleanExpr();

	/**
	 * Returns the meta object for the containment reference '{@link school.BooleanExpr#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And</em>'.
	 * @see school.BooleanExpr#getAnd()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EReference getBooleanExpr_And();

	/**
	 * Returns the meta object for the containment reference '{@link school.BooleanExpr#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or</em>'.
	 * @see school.BooleanExpr#getOr()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EReference getBooleanExpr_Or();

	/**
	 * Returns the meta object for the attribute '{@link school.BooleanExpr#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lhs</em>'.
	 * @see school.BooleanExpr#getLhs()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EAttribute getBooleanExpr_Lhs();

	/**
	 * Returns the meta object for the attribute '{@link school.BooleanExpr#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rhs</em>'.
	 * @see school.BooleanExpr#getRhs()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EAttribute getBooleanExpr_Rhs();

	/**
	 * Returns the meta object for the attribute '{@link school.BooleanExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see school.BooleanExpr#getOperator()
	 * @see #getBooleanExpr()
	 * @generated
	 */
	EAttribute getBooleanExpr_Operator();

	/**
	 * Returns the meta object for class '{@link school.SchoolDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see school.SchoolDatabase
	 * @generated
	 */
	EClass getSchoolDatabase();

	/**
	 * Returns the meta object for the containment reference '{@link school.SchoolDatabase#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>School</em>'.
	 * @see school.SchoolDatabase#getSchool()
	 * @see #getSchoolDatabase()
	 * @generated
	 */
	EReference getSchoolDatabase_School();

	/**
	 * Returns the meta object for the containment reference list '{@link school.SchoolDatabase#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see school.SchoolDatabase#getQuery()
	 * @see #getSchoolDatabase()
	 * @generated
	 */
	EReference getSchoolDatabase_Query();

	/**
	 * Returns the meta object for enum '{@link school.SchoolElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element</em>'.
	 * @see school.SchoolElement
	 * @generated
	 */
	EEnum getSchoolElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchoolFactory getSchoolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link school.impl.SchoolImpl <em>School</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.SchoolImpl
		 * @see school.impl.SchoolPackageImpl#getSchool()
		 * @generated
		 */
		EClass SCHOOL = eINSTANCE.getSchool();

		/**
		 * The meta object literal for the '<em><b>Faculty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__FACULTY = eINSTANCE.getSchool_Faculty();

		/**
		 * The meta object literal for the '<em><b>Courseofstudy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__COURSEOFSTUDY = eINSTANCE.getSchool_Courseofstudy();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__COURSE = eINSTANCE.getSchool_Course();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__STUDENT = eINSTANCE.getSchool_Student();

		/**
		 * The meta object literal for the '<em><b>Teacher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__TEACHER = eINSTANCE.getSchool_Teacher();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__NAME = eINSTANCE.getSchool_Name();

		/**
		 * The meta object literal for the '{@link school.impl.FacultyImpl <em>Faculty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.FacultyImpl
		 * @see school.impl.SchoolPackageImpl#getFaculty()
		 * @generated
		 */
		EClass FACULTY = eINSTANCE.getFaculty();

		/**
		 * The meta object literal for the '<em><b>Courseofstudy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTY__COURSEOFSTUDY = eINSTANCE.getFaculty_Courseofstudy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACULTY__NAME = eINSTANCE.getFaculty_Name();

		/**
		 * The meta object literal for the '{@link school.impl.CourseOfStudyImpl <em>Course Of Study</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.CourseOfStudyImpl
		 * @see school.impl.SchoolPackageImpl#getCourseOfStudy()
		 * @generated
		 */
		EClass COURSE_OF_STUDY = eINSTANCE.getCourseOfStudy();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_OF_STUDY__COURSE = eINSTANCE.getCourseOfStudy_Course();

		/**
		 * The meta object literal for the '<em><b>Faculty</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_OF_STUDY__FACULTY = eINSTANCE.getCourseOfStudy_Faculty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_OF_STUDY__NAME = eINSTANCE.getCourseOfStudy_Name();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_OF_STUDY__STUDENT = eINSTANCE.getCourseOfStudy_Student();

		/**
		 * The meta object literal for the '{@link school.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.CourseImpl
		 * @see school.impl.SchoolPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Enrolled Student</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__ENROLLED_STUDENT = eINSTANCE.getCourse_EnrolledStudent();

		/**
		 * The meta object literal for the '<em><b>Taught By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__TAUGHT_BY = eINSTANCE.getCourse_TaughtBy();

		/**
		 * The meta object literal for the '<em><b>Courseresult</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSERESULT = eINSTANCE.getCourse_Courseresult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Course Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_NUMBER = eINSTANCE.getCourse_CourseNumber();

		/**
		 * The meta object literal for the '{@link school.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.StudentImpl
		 * @see school.impl.SchoolPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Enrolled In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__ENROLLED_IN = eINSTANCE.getStudent_EnrolledIn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>Student Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__STUDENT_NUMBER = eINSTANCE.getStudent_StudentNumber();

		/**
		 * The meta object literal for the '<em><b>Courseofstudy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__COURSEOFSTUDY = eINSTANCE.getStudent_Courseofstudy();

		/**
		 * The meta object literal for the '{@link school.impl.TeacherImpl <em>Teacher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.TeacherImpl
		 * @see school.impl.SchoolPackageImpl#getTeacher()
		 * @generated
		 */
		EClass TEACHER = eINSTANCE.getTeacher();

		/**
		 * The meta object literal for the '<em><b>Teaches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__TEACHES = eINSTANCE.getTeacher_Teaches();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__NAME = eINSTANCE.getTeacher_Name();

		/**
		 * The meta object literal for the '{@link school.impl.CourseResultImpl <em>Course Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.CourseResultImpl
		 * @see school.impl.SchoolPackageImpl#getCourseResult()
		 * @generated
		 */
		EClass COURSE_RESULT = eINSTANCE.getCourseResult();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_RESULT__STUDENT = eINSTANCE.getCourseResult_Student();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_RESULT__COURSE = eINSTANCE.getCourseResult_Course();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_RESULT__GRADE = eINSTANCE.getCourseResult_Grade();

		/**
		 * The meta object literal for the '{@link school.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.QueryImpl
		 * @see school.impl.SchoolPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__STUDENT = eINSTANCE.getQuery_Student();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__WHERE = eINSTANCE.getQuery_Where();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__TYPE = eINSTANCE.getQuery_Type();

		/**
		 * The meta object literal for the '{@link school.impl.WhereImpl <em>Where</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.WhereImpl
		 * @see school.impl.SchoolPackageImpl#getWhere()
		 * @generated
		 */
		EClass WHERE = eINSTANCE.getWhere();

		/**
		 * The meta object literal for the '<em><b>Booleanexpr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHERE__BOOLEANEXPR = eINSTANCE.getWhere_Booleanexpr();

		/**
		 * The meta object literal for the '{@link school.impl.BooleanExprImpl <em>Boolean Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.BooleanExprImpl
		 * @see school.impl.SchoolPackageImpl#getBooleanExpr()
		 * @generated
		 */
		EClass BOOLEAN_EXPR = eINSTANCE.getBooleanExpr();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPR__AND = eINSTANCE.getBooleanExpr_And();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPR__OR = eINSTANCE.getBooleanExpr_Or();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPR__LHS = eINSTANCE.getBooleanExpr_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPR__RHS = eINSTANCE.getBooleanExpr_Rhs();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPR__OPERATOR = eINSTANCE.getBooleanExpr_Operator();

		/**
		 * The meta object literal for the '{@link school.impl.SchoolDatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.impl.SchoolDatabaseImpl
		 * @see school.impl.SchoolPackageImpl#getSchoolDatabase()
		 * @generated
		 */
		EClass SCHOOL_DATABASE = eINSTANCE.getSchoolDatabase();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL_DATABASE__SCHOOL = eINSTANCE.getSchoolDatabase_School();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL_DATABASE__QUERY = eINSTANCE.getSchoolDatabase_Query();

		/**
		 * The meta object literal for the '{@link school.SchoolElement <em>Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see school.SchoolElement
		 * @see school.impl.SchoolPackageImpl#getSchoolElement()
		 * @generated
		 */
		EEnum SCHOOL_ELEMENT = eINSTANCE.getSchoolElement();

	}

} //SchoolPackage
