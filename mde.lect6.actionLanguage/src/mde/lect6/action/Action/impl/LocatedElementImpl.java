/**
 */
package mde.lect6.action.Action.impl;

import java.util.Collection;

import mde.lect6.action.Action.ActionPackage;
import mde.lect6.action.Action.LocatedElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Located Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mde.lect6.action.Action.impl.LocatedElementImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link mde.lect6.action.Action.impl.LocatedElementImpl#getCommentsBefore <em>Comments Before</em>}</li>
 *   <li>{@link mde.lect6.action.Action.impl.LocatedElementImpl#getCommentsAfter <em>Comments After</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LocatedElementImpl extends MinimalEObjectImpl.Container implements LocatedElement {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommentsBefore() <em>Comments Before</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<String> commentsBefore;

	/**
	 * The cached value of the '{@link #getCommentsAfter() <em>Comments After</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<String> commentsAfter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.LOCATED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.LOCATED_ELEMENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCommentsBefore() {
		if (commentsBefore == null) {
			commentsBefore = new EDataTypeEList<String>(String.class, this, ActionPackage.LOCATED_ELEMENT__COMMENTS_BEFORE);
		}
		return commentsBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCommentsAfter() {
		if (commentsAfter == null) {
			commentsAfter = new EDataTypeEList<String>(String.class, this, ActionPackage.LOCATED_ELEMENT__COMMENTS_AFTER);
		}
		return commentsAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionPackage.LOCATED_ELEMENT__LOCATION:
				return getLocation();
			case ActionPackage.LOCATED_ELEMENT__COMMENTS_BEFORE:
				return getCommentsBefore();
			case ActionPackage.LOCATED_ELEMENT__COMMENTS_AFTER:
				return getCommentsAfter();
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
			case ActionPackage.LOCATED_ELEMENT__LOCATION:
				setLocation((String)newValue);
				return;
			case ActionPackage.LOCATED_ELEMENT__COMMENTS_BEFORE:
				getCommentsBefore().clear();
				getCommentsBefore().addAll((Collection<? extends String>)newValue);
				return;
			case ActionPackage.LOCATED_ELEMENT__COMMENTS_AFTER:
				getCommentsAfter().clear();
				getCommentsAfter().addAll((Collection<? extends String>)newValue);
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
			case ActionPackage.LOCATED_ELEMENT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ActionPackage.LOCATED_ELEMENT__COMMENTS_BEFORE:
				getCommentsBefore().clear();
				return;
			case ActionPackage.LOCATED_ELEMENT__COMMENTS_AFTER:
				getCommentsAfter().clear();
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
			case ActionPackage.LOCATED_ELEMENT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ActionPackage.LOCATED_ELEMENT__COMMENTS_BEFORE:
				return commentsBefore != null && !commentsBefore.isEmpty();
			case ActionPackage.LOCATED_ELEMENT__COMMENTS_AFTER:
				return commentsAfter != null && !commentsAfter.isEmpty();
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
		result.append(" (location: ");
		result.append(location);
		result.append(", commentsBefore: ");
		result.append(commentsBefore);
		result.append(", commentsAfter: ");
		result.append(commentsAfter);
		result.append(')');
		return result.toString();
	}

} //LocatedElementImpl
