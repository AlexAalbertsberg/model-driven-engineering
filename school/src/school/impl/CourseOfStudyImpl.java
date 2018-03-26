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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import school.Course;
import school.CourseOfStudy;
import school.Faculty;
import school.SchoolPackage;
import school.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Of Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link school.impl.CourseOfStudyImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link school.impl.CourseOfStudyImpl#getFaculty <em>Faculty</em>}</li>
 *   <li>{@link school.impl.CourseOfStudyImpl#getName <em>Name</em>}</li>
 *   <li>{@link school.impl.CourseOfStudyImpl#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseOfStudyImpl extends MinimalEObjectImpl.Container implements CourseOfStudy {
	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * The cached value of the '{@link #getFaculty() <em>Faculty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaculty()
	 * @generated
	 * @ordered
	 */
	protected Faculty faculty;

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
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> student;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseOfStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.COURSE_OF_STUDY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectResolvingEList<Course>(Course.class, this, SchoolPackage.COURSE_OF_STUDY__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Faculty getFaculty() {
		if (faculty != null && faculty.eIsProxy()) {
			InternalEObject oldFaculty = (InternalEObject)faculty;
			faculty = (Faculty)eResolveProxy(oldFaculty);
			if (faculty != oldFaculty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchoolPackage.COURSE_OF_STUDY__FACULTY, oldFaculty, faculty));
			}
		}
		return faculty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Faculty basicGetFaculty() {
		return faculty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaculty(Faculty newFaculty, NotificationChain msgs) {
		Faculty oldFaculty = faculty;
		faculty = newFaculty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE_OF_STUDY__FACULTY, oldFaculty, newFaculty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaculty(Faculty newFaculty) {
		if (newFaculty != faculty) {
			NotificationChain msgs = null;
			if (faculty != null)
				msgs = ((InternalEObject)faculty).eInverseRemove(this, SchoolPackage.FACULTY__COURSEOFSTUDY, Faculty.class, msgs);
			if (newFaculty != null)
				msgs = ((InternalEObject)newFaculty).eInverseAdd(this, SchoolPackage.FACULTY__COURSEOFSTUDY, Faculty.class, msgs);
			msgs = basicSetFaculty(newFaculty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE_OF_STUDY__FACULTY, newFaculty, newFaculty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE_OF_STUDY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudent() {
		if (student == null) {
			student = new EObjectWithInverseResolvingEList<Student>(Student.class, this, SchoolPackage.COURSE_OF_STUDY__STUDENT, SchoolPackage.STUDENT__COURSEOFSTUDY);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchoolPackage.COURSE_OF_STUDY__FACULTY:
				if (faculty != null)
					msgs = ((InternalEObject)faculty).eInverseRemove(this, SchoolPackage.FACULTY__COURSEOFSTUDY, Faculty.class, msgs);
				return basicSetFaculty((Faculty)otherEnd, msgs);
			case SchoolPackage.COURSE_OF_STUDY__STUDENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudent()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchoolPackage.COURSE_OF_STUDY__FACULTY:
				return basicSetFaculty(null, msgs);
			case SchoolPackage.COURSE_OF_STUDY__STUDENT:
				return ((InternalEList<?>)getStudent()).basicRemove(otherEnd, msgs);
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
			case SchoolPackage.COURSE_OF_STUDY__COURSE:
				return getCourse();
			case SchoolPackage.COURSE_OF_STUDY__FACULTY:
				if (resolve) return getFaculty();
				return basicGetFaculty();
			case SchoolPackage.COURSE_OF_STUDY__NAME:
				return getName();
			case SchoolPackage.COURSE_OF_STUDY__STUDENT:
				return getStudent();
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
			case SchoolPackage.COURSE_OF_STUDY__COURSE:
				getCourse().clear();
				getCourse().addAll((Collection<? extends Course>)newValue);
				return;
			case SchoolPackage.COURSE_OF_STUDY__FACULTY:
				setFaculty((Faculty)newValue);
				return;
			case SchoolPackage.COURSE_OF_STUDY__NAME:
				setName((String)newValue);
				return;
			case SchoolPackage.COURSE_OF_STUDY__STUDENT:
				getStudent().clear();
				getStudent().addAll((Collection<? extends Student>)newValue);
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
			case SchoolPackage.COURSE_OF_STUDY__COURSE:
				getCourse().clear();
				return;
			case SchoolPackage.COURSE_OF_STUDY__FACULTY:
				setFaculty((Faculty)null);
				return;
			case SchoolPackage.COURSE_OF_STUDY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SchoolPackage.COURSE_OF_STUDY__STUDENT:
				getStudent().clear();
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
			case SchoolPackage.COURSE_OF_STUDY__COURSE:
				return course != null && !course.isEmpty();
			case SchoolPackage.COURSE_OF_STUDY__FACULTY:
				return faculty != null;
			case SchoolPackage.COURSE_OF_STUDY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SchoolPackage.COURSE_OF_STUDY__STUDENT:
				return student != null && !student.isEmpty();
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

} //CourseOfStudyImpl
