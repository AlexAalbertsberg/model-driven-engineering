/**
 */
package school.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import school.Course;
import school.CourseOfStudy;
import school.Faculty;
import school.School;
import school.SchoolPackage;
import school.Student;
import school.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link school.impl.SchoolImpl#getFaculty <em>Faculty</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getCourseofstudy <em>Courseofstudy</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link school.impl.SchoolImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchoolImpl extends MinimalEObjectImpl.Container implements School {
	/**
	 * The cached value of the '{@link #getFaculty() <em>Faculty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaculty()
	 * @generated
	 * @ordered
	 */
	protected EList<Faculty> faculty;

	/**
	 * The cached value of the '{@link #getCourseofstudy() <em>Courseofstudy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseofstudy()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseOfStudy> courseofstudy;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> student;

	/**
	 * The cached value of the '{@link #getTeacher() <em>Teacher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacher()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> teacher;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.SCHOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Faculty> getFaculty() {
		if (faculty == null) {
			faculty = new EObjectContainmentEList<Faculty>(Faculty.class, this, SchoolPackage.SCHOOL__FACULTY);
		}
		return faculty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseOfStudy> getCourseofstudy() {
		if (courseofstudy == null) {
			courseofstudy = new EObjectContainmentEList<CourseOfStudy>(CourseOfStudy.class, this, SchoolPackage.SCHOOL__COURSEOFSTUDY);
		}
		return courseofstudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectContainmentEList<Course>(Course.class, this, SchoolPackage.SCHOOL__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudent() {
		if (student == null) {
			student = new EObjectContainmentEList<Student>(Student.class, this, SchoolPackage.SCHOOL__STUDENT);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Teacher> getTeacher() {
		if (teacher == null) {
			teacher = new EObjectContainmentEList<Teacher>(Teacher.class, this, SchoolPackage.SCHOOL__TEACHER);
		}
		return teacher;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.SCHOOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchoolPackage.SCHOOL__FACULTY:
				return ((InternalEList<?>)getFaculty()).basicRemove(otherEnd, msgs);
			case SchoolPackage.SCHOOL__COURSEOFSTUDY:
				return ((InternalEList<?>)getCourseofstudy()).basicRemove(otherEnd, msgs);
			case SchoolPackage.SCHOOL__COURSE:
				return ((InternalEList<?>)getCourse()).basicRemove(otherEnd, msgs);
			case SchoolPackage.SCHOOL__STUDENT:
				return ((InternalEList<?>)getStudent()).basicRemove(otherEnd, msgs);
			case SchoolPackage.SCHOOL__TEACHER:
				return ((InternalEList<?>)getTeacher()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchoolPackage.SCHOOL__FACULTY:
				return getFaculty();
			case SchoolPackage.SCHOOL__COURSEOFSTUDY:
				return getCourseofstudy();
			case SchoolPackage.SCHOOL__COURSE:
				return getCourse();
			case SchoolPackage.SCHOOL__STUDENT:
				return getStudent();
			case SchoolPackage.SCHOOL__TEACHER:
				return getTeacher();
			case SchoolPackage.SCHOOL__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchoolPackage.SCHOOL__FACULTY:
				getFaculty().clear();
				getFaculty().addAll((Collection<? extends Faculty>)newValue);
				return;
			case SchoolPackage.SCHOOL__COURSEOFSTUDY:
				getCourseofstudy().clear();
				getCourseofstudy().addAll((Collection<? extends CourseOfStudy>)newValue);
				return;
			case SchoolPackage.SCHOOL__COURSE:
				getCourse().clear();
				getCourse().addAll((Collection<? extends Course>)newValue);
				return;
			case SchoolPackage.SCHOOL__STUDENT:
				getStudent().clear();
				getStudent().addAll((Collection<? extends Student>)newValue);
				return;
			case SchoolPackage.SCHOOL__TEACHER:
				getTeacher().clear();
				getTeacher().addAll((Collection<? extends Teacher>)newValue);
				return;
			case SchoolPackage.SCHOOL__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchoolPackage.SCHOOL__FACULTY:
				getFaculty().clear();
				return;
			case SchoolPackage.SCHOOL__COURSEOFSTUDY:
				getCourseofstudy().clear();
				return;
			case SchoolPackage.SCHOOL__COURSE:
				getCourse().clear();
				return;
			case SchoolPackage.SCHOOL__STUDENT:
				getStudent().clear();
				return;
			case SchoolPackage.SCHOOL__TEACHER:
				getTeacher().clear();
				return;
			case SchoolPackage.SCHOOL__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchoolPackage.SCHOOL__FACULTY:
				return faculty != null && !faculty.isEmpty();
			case SchoolPackage.SCHOOL__COURSEOFSTUDY:
				return courseofstudy != null && !courseofstudy.isEmpty();
			case SchoolPackage.SCHOOL__COURSE:
				return course != null && !course.isEmpty();
			case SchoolPackage.SCHOOL__STUDENT:
				return student != null && !student.isEmpty();
			case SchoolPackage.SCHOOL__TEACHER:
				return teacher != null && !teacher.isEmpty();
			case SchoolPackage.SCHOOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SchoolImpl
