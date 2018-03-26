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

import school.Query;
import school.School;
import school.SchoolDatabase;
import school.SchoolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link school.impl.SchoolDatabaseImpl#getSchool <em>School</em>}</li>
 *   <li>{@link school.impl.SchoolDatabaseImpl#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchoolDatabaseImpl extends MinimalEObjectImpl.Container implements SchoolDatabase {
	/**
	 * The cached value of the '{@link #getSchool() <em>School</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchool()
	 * @generated
	 * @ordered
	 */
	protected School school;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> query;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.SCHOOL_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public School getSchool() {
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchool(School newSchool, NotificationChain msgs) {
		School oldSchool = school;
		school = newSchool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchoolPackage.SCHOOL_DATABASE__SCHOOL, oldSchool, newSchool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchool(School newSchool) {
		if (newSchool != school) {
			NotificationChain msgs = null;
			if (school != null)
				msgs = ((InternalEObject)school).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchoolPackage.SCHOOL_DATABASE__SCHOOL, null, msgs);
			if (newSchool != null)
				msgs = ((InternalEObject)newSchool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchoolPackage.SCHOOL_DATABASE__SCHOOL, null, msgs);
			msgs = basicSetSchool(newSchool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.SCHOOL_DATABASE__SCHOOL, newSchool, newSchool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQuery() {
		if (query == null) {
			query = new EObjectContainmentEList<Query>(Query.class, this, SchoolPackage.SCHOOL_DATABASE__QUERY);
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchoolPackage.SCHOOL_DATABASE__SCHOOL:
				return basicSetSchool(null, msgs);
			case SchoolPackage.SCHOOL_DATABASE__QUERY:
				return ((InternalEList<?>)getQuery()).basicRemove(otherEnd, msgs);
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
			case SchoolPackage.SCHOOL_DATABASE__SCHOOL:
				return getSchool();
			case SchoolPackage.SCHOOL_DATABASE__QUERY:
				return getQuery();
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
			case SchoolPackage.SCHOOL_DATABASE__SCHOOL:
				setSchool((School)newValue);
				return;
			case SchoolPackage.SCHOOL_DATABASE__QUERY:
				getQuery().clear();
				getQuery().addAll((Collection<? extends Query>)newValue);
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
			case SchoolPackage.SCHOOL_DATABASE__SCHOOL:
				setSchool((School)null);
				return;
			case SchoolPackage.SCHOOL_DATABASE__QUERY:
				getQuery().clear();
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
			case SchoolPackage.SCHOOL_DATABASE__SCHOOL:
				return school != null;
			case SchoolPackage.SCHOOL_DATABASE__QUERY:
				return query != null && !query.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchoolDatabaseImpl
