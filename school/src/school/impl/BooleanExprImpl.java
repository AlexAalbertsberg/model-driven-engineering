/**
 */
package school.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import school.BooleanExpr;
import school.SchoolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link school.impl.BooleanExprImpl#getAnd <em>And</em>}</li>
 *   <li>{@link school.impl.BooleanExprImpl#getOr <em>Or</em>}</li>
 *   <li>{@link school.impl.BooleanExprImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link school.impl.BooleanExprImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link school.impl.BooleanExprImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanExprImpl extends MinimalEObjectImpl.Container implements BooleanExpr {
	/**
	 * The cached value of the '{@link #getAnd() <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnd()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpr and;

	/**
	 * The cached value of the '{@link #getOr() <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOr()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpr or;

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
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.BOOLEAN_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr getAnd() {
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnd(BooleanExpr newAnd, NotificationChain msgs) {
		BooleanExpr oldAnd = and;
		and = newAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchoolPackage.BOOLEAN_EXPR__AND, oldAnd, newAnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnd(BooleanExpr newAnd) {
		if (newAnd != and) {
			NotificationChain msgs = null;
			if (and != null)
				msgs = ((InternalEObject)and).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchoolPackage.BOOLEAN_EXPR__AND, null, msgs);
			if (newAnd != null)
				msgs = ((InternalEObject)newAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchoolPackage.BOOLEAN_EXPR__AND, null, msgs);
			msgs = basicSetAnd(newAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.BOOLEAN_EXPR__AND, newAnd, newAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr getOr() {
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOr(BooleanExpr newOr, NotificationChain msgs) {
		BooleanExpr oldOr = or;
		or = newOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchoolPackage.BOOLEAN_EXPR__OR, oldOr, newOr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOr(BooleanExpr newOr) {
		if (newOr != or) {
			NotificationChain msgs = null;
			if (or != null)
				msgs = ((InternalEObject)or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchoolPackage.BOOLEAN_EXPR__OR, null, msgs);
			if (newOr != null)
				msgs = ((InternalEObject)newOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchoolPackage.BOOLEAN_EXPR__OR, null, msgs);
			msgs = basicSetOr(newOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.BOOLEAN_EXPR__OR, newOr, newOr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.BOOLEAN_EXPR__LHS, oldLhs, lhs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.BOOLEAN_EXPR__RHS, oldRhs, rhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.BOOLEAN_EXPR__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchoolPackage.BOOLEAN_EXPR__AND:
				return basicSetAnd(null, msgs);
			case SchoolPackage.BOOLEAN_EXPR__OR:
				return basicSetOr(null, msgs);
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
			case SchoolPackage.BOOLEAN_EXPR__AND:
				return getAnd();
			case SchoolPackage.BOOLEAN_EXPR__OR:
				return getOr();
			case SchoolPackage.BOOLEAN_EXPR__LHS:
				return getLhs();
			case SchoolPackage.BOOLEAN_EXPR__RHS:
				return getRhs();
			case SchoolPackage.BOOLEAN_EXPR__OPERATOR:
				return getOperator();
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
			case SchoolPackage.BOOLEAN_EXPR__AND:
				setAnd((BooleanExpr)newValue);
				return;
			case SchoolPackage.BOOLEAN_EXPR__OR:
				setOr((BooleanExpr)newValue);
				return;
			case SchoolPackage.BOOLEAN_EXPR__LHS:
				setLhs((String)newValue);
				return;
			case SchoolPackage.BOOLEAN_EXPR__RHS:
				setRhs((String)newValue);
				return;
			case SchoolPackage.BOOLEAN_EXPR__OPERATOR:
				setOperator((String)newValue);
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
			case SchoolPackage.BOOLEAN_EXPR__AND:
				setAnd((BooleanExpr)null);
				return;
			case SchoolPackage.BOOLEAN_EXPR__OR:
				setOr((BooleanExpr)null);
				return;
			case SchoolPackage.BOOLEAN_EXPR__LHS:
				setLhs(LHS_EDEFAULT);
				return;
			case SchoolPackage.BOOLEAN_EXPR__RHS:
				setRhs(RHS_EDEFAULT);
				return;
			case SchoolPackage.BOOLEAN_EXPR__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case SchoolPackage.BOOLEAN_EXPR__AND:
				return and != null;
			case SchoolPackage.BOOLEAN_EXPR__OR:
				return or != null;
			case SchoolPackage.BOOLEAN_EXPR__LHS:
				return LHS_EDEFAULT == null ? lhs != null : !LHS_EDEFAULT.equals(lhs);
			case SchoolPackage.BOOLEAN_EXPR__RHS:
				return RHS_EDEFAULT == null ? rhs != null : !RHS_EDEFAULT.equals(rhs);
			case SchoolPackage.BOOLEAN_EXPR__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
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
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BooleanExprImpl
