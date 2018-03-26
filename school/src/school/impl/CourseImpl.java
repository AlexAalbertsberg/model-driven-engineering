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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import school.Course;
import school.CourseResult;
import school.SchoolPackage;
import school.Student;
import school.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link school.impl.CourseImpl#getEnrolledStudent <em>Enrolled Student</em>}</li>
 *   <li>{@link school.impl.CourseImpl#getTaughtBy <em>Taught By</em>}</li>
 *   <li>{@link school.impl.CourseImpl#getCourseresult <em>Courseresult</em>}</li>
 *   <li>{@link school.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link school.impl.CourseImpl#getCourseNumber <em>Course Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The cached value of the '{@link #getEnrolledStudent() <em>Enrolled Student</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolledStudent()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> enrolledStudent;

	/**
	 * The cached value of the '{@link #getTaughtBy() <em>Taught By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaughtBy()
	 * @generated
	 * @ordered
	 */
	protected Teacher taughtBy;

	/**
	 * The cached value of the '{@link #getCourseresult() <em>Courseresult</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseresult()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseResult> courseresult;

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
	 * The default value of the '{@link #getCourseNumber() <em>Course Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseNumber() <em>Course Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseNumber()
	 * @generated
	 * @ordered
	 */
	protected String courseNumber = COURSE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getEnrolledStudent() {
		if (enrolledStudent == null) {
			enrolledStudent = new EObjectWithInverseResolvingEList.ManyInverse<Student>(Student.class, this, SchoolPackage.COURSE__ENROLLED_STUDENT, SchoolPackage.STUDENT__ENROLLED_IN);
		}
		return enrolledStudent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher getTaughtBy() {
		if (taughtBy != null && taughtBy.eIsProxy()) {
			InternalEObject oldTaughtBy = (InternalEObject)taughtBy;
			taughtBy = (Teacher)eResolveProxy(oldTaughtBy);
			if (taughtBy != oldTaughtBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchoolPackage.COURSE__TAUGHT_BY, oldTaughtBy, taughtBy));
			}
		}
		return taughtBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher basicGetTaughtBy() {
		return taughtBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaughtBy(Teacher newTaughtBy, NotificationChain msgs) {
		Teacher oldTaughtBy = taughtBy;
		taughtBy = newTaughtBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE__TAUGHT_BY, oldTaughtBy, newTaughtBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaughtBy(Teacher newTaughtBy) {
		if (newTaughtBy != taughtBy) {
			NotificationChain msgs = null;
			if (taughtBy != null)
				msgs = ((InternalEObject)taughtBy).eInverseRemove(this, SchoolPackage.TEACHER__TEACHES, Teacher.class, msgs);
			if (newTaughtBy != null)
				msgs = ((InternalEObject)newTaughtBy).eInverseAdd(this, SchoolPackage.TEACHER__TEACHES, Teacher.class, msgs);
			msgs = basicSetTaughtBy(newTaughtBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE__TAUGHT_BY, newTaughtBy, newTaughtBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseResult> getCourseresult() {
		if (courseresult == null) {
			courseresult = new EObjectContainmentWithInverseEList<CourseResult>(CourseResult.class, this, SchoolPackage.COURSE__COURSERESULT, SchoolPackage.COURSE_RESULT__COURSE);
		}
		return courseresult;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseNumber() {
		return courseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseNumber(String newCourseNumber) {
		String oldCourseNumber = courseNumber;
		courseNumber = newCourseNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.COURSE__COURSE_NUMBER, oldCourseNumber, courseNumber));
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
			case SchoolPackage.COURSE__ENROLLED_STUDENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnrolledStudent()).basicAdd(otherEnd, msgs);
			case SchoolPackage.COURSE__TAUGHT_BY:
				if (taughtBy != null)
					msgs = ((InternalEObject)taughtBy).eInverseRemove(this, SchoolPackage.TEACHER__TEACHES, Teacher.class, msgs);
				return basicSetTaughtBy((Teacher)otherEnd, msgs);
			case SchoolPackage.COURSE__COURSERESULT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourseresult()).basicAdd(otherEnd, msgs);
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
			case SchoolPackage.COURSE__ENROLLED_STUDENT:
				return ((InternalEList<?>)getEnrolledStudent()).basicRemove(otherEnd, msgs);
			case SchoolPackage.COURSE__TAUGHT_BY:
				return basicSetTaughtBy(null, msgs);
			case SchoolPackage.COURSE__COURSERESULT:
				return ((InternalEList<?>)getCourseresult()).basicRemove(otherEnd, msgs);
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
			case SchoolPackage.COURSE__ENROLLED_STUDENT:
				return getEnrolledStudent();
			case SchoolPackage.COURSE__TAUGHT_BY:
				if (resolve) return getTaughtBy();
				return basicGetTaughtBy();
			case SchoolPackage.COURSE__COURSERESULT:
				return getCourseresult();
			case SchoolPackage.COURSE__NAME:
				return getName();
			case SchoolPackage.COURSE__COURSE_NUMBER:
				return getCourseNumber();
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
			case SchoolPackage.COURSE__ENROLLED_STUDENT:
				getEnrolledStudent().clear();
				getEnrolledStudent().addAll((Collection<? extends Student>)newValue);
				return;
			case SchoolPackage.COURSE__TAUGHT_BY:
				setTaughtBy((Teacher)newValue);
				return;
			case SchoolPackage.COURSE__COURSERESULT:
				getCourseresult().clear();
				getCourseresult().addAll((Collection<? extends CourseResult>)newValue);
				return;
			case SchoolPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case SchoolPackage.COURSE__COURSE_NUMBER:
				setCourseNumber((String)newValue);
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
			case SchoolPackage.COURSE__ENROLLED_STUDENT:
				getEnrolledStudent().clear();
				return;
			case SchoolPackage.COURSE__TAUGHT_BY:
				setTaughtBy((Teacher)null);
				return;
			case SchoolPackage.COURSE__COURSERESULT:
				getCourseresult().clear();
				return;
			case SchoolPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SchoolPackage.COURSE__COURSE_NUMBER:
				setCourseNumber(COURSE_NUMBER_EDEFAULT);
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
			case SchoolPackage.COURSE__ENROLLED_STUDENT:
				return enrolledStudent != null && !enrolledStudent.isEmpty();
			case SchoolPackage.COURSE__TAUGHT_BY:
				return taughtBy != null;
			case SchoolPackage.COURSE__COURSERESULT:
				return courseresult != null && !courseresult.isEmpty();
			case SchoolPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SchoolPackage.COURSE__COURSE_NUMBER:
				return COURSE_NUMBER_EDEFAULT == null ? courseNumber != null : !COURSE_NUMBER_EDEFAULT.equals(courseNumber);
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
		result.append(", courseNumber: ");
		result.append(courseNumber);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
