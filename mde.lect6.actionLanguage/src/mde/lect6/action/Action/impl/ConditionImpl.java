/**
 */
package mde.lect6.action.Action.impl;

import mde.lect6.action.Action.Action;
import mde.lect6.action.Action.ActionPackage;
import mde.lect6.action.Action.BooleanExp;
import mde.lect6.action.Action.Condition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mde.lect6.action.Action.impl.ConditionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link mde.lect6.action.Action.impl.ConditionImpl#getYes <em>Yes</em>}</li>
 *   <li>{@link mde.lect6.action.Action.impl.ConditionImpl#getNo <em>No</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends ActionImpl implements Condition {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanExp expression;

	/**
	 * The cached value of the '{@link #getYes() <em>Yes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYes()
	 * @generated
	 * @ordered
	 */
	protected Action yes;

	/**
	 * The cached value of the '{@link #getNo() <em>No</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo()
	 * @generated
	 * @ordered
	 */
	protected Action no;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExp getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(BooleanExp newExpression, NotificationChain msgs) {
		BooleanExp oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionPackage.CONDITION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(BooleanExp newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionPackage.CONDITION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionPackage.CONDITION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.CONDITION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getYes() {
		if (yes != null && yes.eIsProxy()) {
			InternalEObject oldYes = (InternalEObject)yes;
			yes = (Action)eResolveProxy(oldYes);
			if (yes != oldYes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.CONDITION__YES, oldYes, yes));
			}
		}
		return yes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetYes() {
		return yes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYes(Action newYes) {
		Action oldYes = yes;
		yes = newYes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.CONDITION__YES, oldYes, yes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getNo() {
		if (no != null && no.eIsProxy()) {
			InternalEObject oldNo = (InternalEObject)no;
			no = (Action)eResolveProxy(oldNo);
			if (no != oldNo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.CONDITION__NO, oldNo, no));
			}
		}
		return no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetNo() {
		return no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNo(Action newNo) {
		Action oldNo = no;
		no = newNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.CONDITION__NO, oldNo, no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionPackage.CONDITION__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case ActionPackage.CONDITION__EXPRESSION:
				return getExpression();
			case ActionPackage.CONDITION__YES:
				if (resolve) return getYes();
				return basicGetYes();
			case ActionPackage.CONDITION__NO:
				if (resolve) return getNo();
				return basicGetNo();
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
			case ActionPackage.CONDITION__EXPRESSION:
				setExpression((BooleanExp)newValue);
				return;
			case ActionPackage.CONDITION__YES:
				setYes((Action)newValue);
				return;
			case ActionPackage.CONDITION__NO:
				setNo((Action)newValue);
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
			case ActionPackage.CONDITION__EXPRESSION:
				setExpression((BooleanExp)null);
				return;
			case ActionPackage.CONDITION__YES:
				setYes((Action)null);
				return;
			case ActionPackage.CONDITION__NO:
				setNo((Action)null);
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
			case ActionPackage.CONDITION__EXPRESSION:
				return expression != null;
			case ActionPackage.CONDITION__YES:
				return yes != null;
			case ActionPackage.CONDITION__NO:
				return no != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
