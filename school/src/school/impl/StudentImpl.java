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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import school.Course;
import school.CourseOfStudy;
import school.SchoolPackage;
import school.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link school.impl.StudentImpl#getEnrolledIn <em>Enrolled In</em>}</li>
 *   <li>{@link school.impl.StudentImpl#getName <em>Name</em>}</li>
 *   <li>{@link school.impl.StudentImpl#getStudentNumber <em>Student Number</em>}</li>
 *   <li>{@link school.impl.StudentImpl#getCourseofstudy <em>Courseofstudy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
	/**
	 * The cached value of the '{@link #getEnrolledIn() <em>Enrolled In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolledIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> enrolledIn;

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
	 * The default value of the '{@link #getStudentNumber() <em>Student Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDENT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudentNumber() <em>Student Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentNumber()
	 * @generated
	 * @ordered
	 */
	protected String studentNumber = STUDENT_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseofstudy() <em>Courseofstudy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseofstudy()
	 * @generated
	 * @ordered
	 */
	protected CourseOfStudy courseofstudy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getEnrolledIn() {
		if (enrolledIn == null) {
			enrolledIn = new EObjectWithInverseResolvingEList.ManyInverse<Course>(Course.class, this, SchoolPackage.STUDENT__ENROLLED_IN, SchoolPackage.COURSE__ENROLLED_STUDENT);
		}
		return enrolledIn;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.STUDENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStudentNumber() {
		return studentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudentNumber(String newStudentNumber) {
		String oldStudentNumber = studentNumber;
		studentNumber = newStudentNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.STUDENT__STUDENT_NUMBER, oldStudentNumber, studentNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseOfStudy getCourseofstudy() {
		if (courseofstudy != null && courseofstudy.eIsProxy()) {
			InternalEObject oldCourseofstudy = (InternalEObject)courseofstudy;
			courseofstudy = (CourseOfStudy)eResolveProxy(oldCourseofstudy);
			if (courseofstudy != oldCourseofstudy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchoolPackage.STUDENT__COURSEOFSTUDY, oldCourseofstudy, courseofstudy));
			}
		}
		return courseofstudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseOfStudy basicGetCourseofstudy() {
		return courseofstudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseofstudy(CourseOfStudy newCourseofstudy, NotificationChain msgs) {
		CourseOfStudy oldCourseofstudy = courseofstudy;
		courseofstudy = newCourseofstudy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchoolPackage.STUDENT__COURSEOFSTUDY, oldCourseofstudy, newCourseofstudy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseofstudy(CourseOfStudy newCourseofstudy) {
		if (newCourseofstudy != courseofstudy) {
			NotificationChain msgs = null;
			if (courseofstudy != null)
				msgs = ((InternalEObject)courseofstudy).eInverseRemove(this, SchoolPackage.COURSE_OF_STUDY__STUDENT, CourseOfStudy.class, msgs);
			if (newCourseofstudy != null)
				msgs = ((InternalEObject)newCourseofstudy).eInverseAdd(this, SchoolPackage.COURSE_OF_STUDY__STUDENT, CourseOfStudy.class, msgs);
			msgs = basicSetCourseofstudy(newCourseofstudy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.STUDENT__COURSEOFSTUDY, newCourseofstudy, newCourseofstudy));
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
			case SchoolPackage.STUDENT__ENROLLED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnrolledIn()).basicAdd(otherEnd, msgs);
			case SchoolPackage.STUDENT__COURSEOFSTUDY:
				if (courseofstudy != null)
					msgs = ((InternalEObject)courseofstudy).eInverseRemove(this, SchoolPackage.COURSE_OF_STUDY__STUDENT, CourseOfStudy.class, msgs);
				return basicSetCourseofstudy((CourseOfStudy)otherEnd, msgs);
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
			case SchoolPackage.STUDENT__ENROLLED_IN:
				return ((InternalEList<?>)getEnrolledIn()).basicRemove(otherEnd, msgs);
			case SchoolPackage.STUDENT__COURSEOFSTUDY:
				return basicSetCourseofstudy(null, msgs);
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
			case SchoolPackage.STUDENT__ENROLLED_IN:
				return getEnrolledIn();
			case SchoolPackage.STUDENT__NAME:
				return getName();
			case SchoolPackage.STUDENT__STUDENT_NUMBER:
				return getStudentNumber();
			case SchoolPackage.STUDENT__COURSEOFSTUDY:
				if (resolve) return getCourseofstudy();
				return basicGetCourseofstudy();
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
			case SchoolPackage.STUDENT__ENROLLED_IN:
				getEnrolledIn().clear();
				getEnrolledIn().addAll((Collection<? extends Course>)newValue);
				return;
			case SchoolPackage.STUDENT__NAME:
				setName((String)newValue);
				return;
			case SchoolPackage.STUDENT__STUDENT_NUMBER:
				setStudentNumber((String)newValue);
				return;
			case SchoolPackage.STUDENT__COURSEOFSTUDY:
				setCourseofstudy((CourseOfStudy)newValue);
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
			case SchoolPackage.STUDENT__ENROLLED_IN:
				getEnrolledIn().clear();
				return;
			case SchoolPackage.STUDENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SchoolPackage.STUDENT__STUDENT_NUMBER:
				setStudentNumber(STUDENT_NUMBER_EDEFAULT);
				return;
			case SchoolPackage.STUDENT__COURSEOFSTUDY:
				setCourseofstudy((CourseOfStudy)null);
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
			case SchoolPackage.STUDENT__ENROLLED_IN:
				return enrolledIn != null && !enrolledIn.isEmpty();
			case SchoolPackage.STUDENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SchoolPackage.STUDENT__STUDENT_NUMBER:
				return STUDENT_NUMBER_EDEFAULT == null ? studentNumber != null : !STUDENT_NUMBER_EDEFAULT.equals(studentNumber);
			case SchoolPackage.STUDENT__COURSEOFSTUDY:
				return courseofstudy != null;
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
		result.append(", studentNumber: ");
		result.append(studentNumber);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
