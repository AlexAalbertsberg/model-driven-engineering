/**
 */
package com.adsa.emf.sql.model.model.impl;

import com.adsa.emf.sql.model.model.BooleanOperation;
import com.adsa.emf.sql.model.model.Exists;
import com.adsa.emf.sql.model.model.ModelPackage;
import com.adsa.emf.sql.model.model.Select;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exists</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.adsa.emf.sql.model.model.impl.ExistsImpl#getBooleanoperation <em>Booleanoperation</em>}</li>
 *   <li>{@link com.adsa.emf.sql.model.model.impl.ExistsImpl#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExistsImpl extends MinimalEObjectImpl.Container implements Exists {
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
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected Select select;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXISTS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.EXISTS__BOOLEANOPERATION, oldBooleanoperation, newBooleanoperation);
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
				msgs = ((InternalEObject)booleanoperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.EXISTS__BOOLEANOPERATION, null, msgs);
			if (newBooleanoperation != null)
				msgs = ((InternalEObject)newBooleanoperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.EXISTS__BOOLEANOPERATION, null, msgs);
			msgs = basicSetBooleanoperation(newBooleanoperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXISTS__BOOLEANOPERATION, newBooleanoperation, newBooleanoperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Select getSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelect(Select newSelect, NotificationChain msgs) {
		Select oldSelect = select;
		select = newSelect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.EXISTS__SELECT, oldSelect, newSelect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelect(Select newSelect) {
		if (newSelect != select) {
			NotificationChain msgs = null;
			if (select != null)
				msgs = ((InternalEObject)select).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.EXISTS__SELECT, null, msgs);
			if (newSelect != null)
				msgs = ((InternalEObject)newSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.EXISTS__SELECT, null, msgs);
			msgs = basicSetSelect(newSelect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXISTS__SELECT, newSelect, newSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.EXISTS__BOOLEANOPERATION:
				return basicSetBooleanoperation(null, msgs);
			case ModelPackage.EXISTS__SELECT:
				return basicSetSelect(null, msgs);
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
			case ModelPackage.EXISTS__BOOLEANOPERATION:
				return getBooleanoperation();
			case ModelPackage.EXISTS__SELECT:
				return getSelect();
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
			case ModelPackage.EXISTS__BOOLEANOPERATION:
				setBooleanoperation((BooleanOperation)newValue);
				return;
			case ModelPackage.EXISTS__SELECT:
				setSelect((Select)newValue);
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
			case ModelPackage.EXISTS__BOOLEANOPERATION:
				setBooleanoperation((BooleanOperation)null);
				return;
			case ModelPackage.EXISTS__SELECT:
				setSelect((Select)null);
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
			case ModelPackage.EXISTS__BOOLEANOPERATION:
				return booleanoperation != null;
			case ModelPackage.EXISTS__SELECT:
				return select != null;
		}
		return super.eIsSet(featureID);
	}

} //ExistsImpl
