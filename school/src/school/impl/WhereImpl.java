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
import school.Where;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link school.impl.WhereImpl#getBooleanexpr <em>Booleanexpr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhereImpl extends MinimalEObjectImpl.Container implements Where {
	/**
	 * The cached value of the '{@link #getBooleanexpr() <em>Booleanexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanexpr()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpr booleanexpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolPackage.Literals.WHERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr getBooleanexpr() {
		return booleanexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanexpr(BooleanExpr newBooleanexpr, NotificationChain msgs) {
		BooleanExpr oldBooleanexpr = booleanexpr;
		booleanexpr = newBooleanexpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchoolPackage.WHERE__BOOLEANEXPR, oldBooleanexpr, newBooleanexpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanexpr(BooleanExpr newBooleanexpr) {
		if (newBooleanexpr != booleanexpr) {
			NotificationChain msgs = null;
			if (booleanexpr != null)
				msgs = ((InternalEObject)booleanexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchoolPackage.WHERE__BOOLEANEXPR, null, msgs);
			if (newBooleanexpr != null)
				msgs = ((InternalEObject)newBooleanexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchoolPackage.WHERE__BOOLEANEXPR, null, msgs);
			msgs = basicSetBooleanexpr(newBooleanexpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolPackage.WHERE__BOOLEANEXPR, newBooleanexpr, newBooleanexpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchoolPackage.WHERE__BOOLEANEXPR:
				return basicSetBooleanexpr(null, msgs);
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
			case SchoolPackage.WHERE__BOOLEANEXPR:
				return getBooleanexpr();
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
			case SchoolPackage.WHERE__BOOLEANEXPR:
				setBooleanexpr((BooleanExpr)newValue);
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
			case SchoolPackage.WHERE__BOOLEANEXPR:
				setBooleanexpr((BooleanExpr)null);
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
			case SchoolPackage.WHERE__BOOLEANEXPR:
				return booleanexpr != null;
		}
		return super.eIsSet(featureID);
	}

} //WhereImpl
