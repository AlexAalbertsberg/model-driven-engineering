/**
 */
package com.adsa.emf.sql.model.model.impl;

import com.adsa.emf.sql.model.model.BooleanOperation;
import com.adsa.emf.sql.model.model.Comparison;
import com.adsa.emf.sql.model.model.ComparisonOperator;
import com.adsa.emf.sql.model.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.adsa.emf.sql.model.model.impl.ComparisonImpl#getBooleanoperation <em>Booleanoperation</em>}</li>
 *   <li>{@link com.adsa.emf.sql.model.model.impl.ComparisonImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link com.adsa.emf.sql.model.model.impl.ComparisonImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link com.adsa.emf.sql.model.model.impl.ComparisonImpl#getComparisonoperator <em>Comparisonoperator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonImpl extends MinimalEObjectImpl.Container implements Comparison {
	/**
	 * The cached value of the '{@link #getBooleanoperation() <em>Booleanoperation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanoperation()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperation booleanoperation;

	/**
	 * The default value of the '{@link #getLhs() <em>Lhs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected static final String LHS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected String lhs = LHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRhs() <em>Rhs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected static final String RHS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected String rhs = RHS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComparisonoperator() <em>Comparisonoperator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonoperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator comparisonoperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperation getBooleanoperation() {
		return booleanoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanoperation(BooleanOperation newBooleanoperation, NotificationChain msgs) {
		BooleanOperation oldBooleanoperation = booleanoperation;
		booleanoperation = newBooleanoperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.COMPARISON__BOOLEANOPERATION, oldBooleanoperation, newBooleanoperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanoperation(BooleanOperation newBooleanoperation) {
		if (newBooleanoperation != booleanoperation) {
			NotificationChain msgs = null;
			if (booleanoperation != null)
				msgs = ((InternalEObject)booleanoperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.COMPARISON__BOOLEANOPERATION, null, msgs);
			if (newBooleanoperation != null)
				msgs = ((InternalEObject)newBooleanoperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.COMPARISON__BOOLEANOPERATION, null, msgs);
			msgs = basicSetBooleanoperation(newBooleanoperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPARISON__BOOLEANOPERATION, newBooleanoperation, newBooleanoperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(String newLhs) {
		String oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPARISON__LHS, oldLhs, lhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(String newRhs) {
		String oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPARISON__RHS, oldRhs, rhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator getComparisonoperator() {
		return comparisonoperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparisonoperator(ComparisonOperator newComparisonoperator, NotificationChain msgs) {
		ComparisonOperator oldComparisonoperator = comparisonoperator;
		comparisonoperator = newComparisonoperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.COMPARISON__COMPARISONOPERATOR, oldComparisonoperator, newComparisonoperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonoperator(ComparisonOperator newComparisonoperator) {
		if (newComparisonoperator != comparisonoperator) {
			NotificationChain msgs = null;
			if (comparisonoperator != null)
				msgs = ((InternalEObject)comparisonoperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.COMPARISON__COMPARISONOPERATOR, null, msgs);
			if (newComparisonoperator != null)
				msgs = ((InternalEObject)newComparisonoperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.COMPARISON__COMPARISONOPERATOR, null, msgs);
			msgs = basicSetComparisonoperator(newComparisonoperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPARISON__COMPARISONOPERATOR, newComparisonoperator, newComparisonoperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COMPARISON__BOOLEANOPERATION:
				return basicSetBooleanoperation(null, msgs);
			case ModelPackage.COMPARISON__COMPARISONOPERATOR:
				return basicSetComparisonoperator(null, msgs);
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
			case ModelPackage.COMPARISON__BOOLEANOPERATION:
				return getBooleanoperation();
			case ModelPackage.COMPARISON__LHS:
				return getLhs();
			case ModelPackage.COMPARISON__RHS:
				return getRhs();
			case ModelPackage.COMPARISON__COMPARISONOPERATOR:
				return getComparisonoperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.COMPARISON__BOOLEANOPERATION:
				setBooleanoperation((BooleanOperation)newValue);
				return;
			case ModelPackage.COMPARISON__LHS:
				setLhs((String)newValue);
				return;
			case ModelPackage.COMPARISON__RHS:
				setRhs((String)newValue);
				return;
			case ModelPackage.COMPARISON__COMPARISONOPERATOR:
				setComparisonoperator((ComparisonOperator)newValue);
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
			case ModelPackage.COMPARISON__BOOLEANOPERATION:
				setBooleanoperation((BooleanOperation)null);
				return;
			case ModelPackage.COMPARISON__LHS:
				setLhs(LHS_EDEFAULT);
				return;
			case ModelPackage.COMPARISON__RHS:
				setRhs(RHS_EDEFAULT);
				return;
			case ModelPackage.COMPARISON__COMPARISONOPERATOR:
				setComparisonoperator((ComparisonOperator)null);
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
			case ModelPackage.COMPARISON__BOOLEANOPERATION:
				return booleanoperation != null;
			case ModelPackage.COMPARISON__LHS:
				return LHS_EDEFAULT == null ? lhs != null : !LHS_EDEFAULT.equals(lhs);
			case ModelPackage.COMPARISON__RHS:
				return RHS_EDEFAULT == null ? rhs != null : !RHS_EDEFAULT.equals(rhs);
			case ModelPackage.COMPARISON__COMPARISONOPERATOR:
				return comparisonoperator != null;
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
		result.append(" (lhs: ");
		result.append(lhs);
		result.append(", rhs: ");
		result.append(rhs);
		result.append(')');
		return result.toString();
	}

} //ComparisonImpl
