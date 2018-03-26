/**
 */
package computer.impl;

import computer.ComputerPackage;
import computer.Screen;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link computer.impl.ScreenImpl#getName <em>Name</em>}</li>
 *   <li>{@link computer.impl.ScreenImpl#getMax_res <em>Max res</em>}</li>
 *   <li>{@link computer.impl.ScreenImpl#getResponse_time <em>Response time</em>}</li>
 *   <li>{@link computer.impl.ScreenImpl#getMax_freq <em>Max freq</em>}</li>
 *   <li>{@link computer.impl.ScreenImpl#getLength <em>Length</em>}</li>
 *   <li>{@link computer.impl.ScreenImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link computer.impl.ScreenImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link computer.impl.ScreenImpl#getPower_consumption <em>Power consumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreenImpl extends MinimalEObjectImpl.Container implements Screen {
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
	 * The default value of the '{@link #getMax_res() <em>Max res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_res()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_RES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax_res() <em>Max res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_res()
	 * @generated
	 * @ordered
	 */
	protected String max_res = MAX_RES_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponse_time() <em>Response time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse_time()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponse_time() <em>Response time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse_time()
	 * @generated
	 * @ordered
	 */
	protected BigInteger response_time = RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_freq() <em>Max freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_freq()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_FREQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax_freq() <em>Max freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_freq()
	 * @generated
	 * @ordered
	 */
	protected BigInteger max_freq = MAX_FREQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected BigInteger length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected BigInteger height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_consumption() <em>Power consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_consumption()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger POWER_CONSUMPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_consumption() <em>Power consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_consumption()
	 * @generated
	 * @ordered
	 */
	protected BigInteger power_consumption = POWER_CONSUMPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputerPackage.Literals.SCREEN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.SCREEN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax_res() {
		return max_res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_res(String newMax_res) {
		String oldMax_res = max_res;
		max_res = newMax_res;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.SCREEN__MAX_RES, oldMax_res, max_res));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getResponse_time() {
		return response_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse_time(BigInteger newResponse_time) {
		BigInteger oldResponse_time = response_time;
		response_time = newResponse_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.SCREEN__RESPONSE_TIME, oldResponse_time, response_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMax_freq() {
		return max_freq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_freq(BigInteger newMax_freq) {
		BigInteger oldMax_freq = max_freq;
		max_freq = newMax_freq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.SCREEN__MAX_FREQ, oldMax_freq, max_freq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(BigInteger newLength) {
		BigInteger oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.SCREEN__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(BigInteger newWidth) {
		BigInteger oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.SCREEN__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(BigInteger newHeight) {
		BigInteger oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.SCREEN__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPower_consumption() {
		return power_consumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_consumption(BigInteger newPower_consumption) {
		BigInteger oldPower_consumption = power_consumption;
		power_consumption = newPower_consumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.SCREEN__POWER_CONSUMPTION, oldPower_consumption, power_consumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputerPackage.SCREEN__NAME:
				return getName();
			case ComputerPackage.SCREEN__MAX_RES:
				return getMax_res();
			case ComputerPackage.SCREEN__RESPONSE_TIME:
				return getResponse_time();
			case ComputerPackage.SCREEN__MAX_FREQ:
				return getMax_freq();
			case ComputerPackage.SCREEN__LENGTH:
				return getLength();
			case ComputerPackage.SCREEN__WIDTH:
				return getWidth();
			case ComputerPackage.SCREEN__HEIGHT:
				return getHeight();
			case ComputerPackage.SCREEN__POWER_CONSUMPTION:
				return getPower_consumption();
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
			case ComputerPackage.SCREEN__NAME:
				setName((String)newValue);
				return;
			case ComputerPackage.SCREEN__MAX_RES:
				setMax_res((String)newValue);
				return;
			case ComputerPackage.SCREEN__RESPONSE_TIME:
				setResponse_time((BigInteger)newValue);
				return;
			case ComputerPackage.SCREEN__MAX_FREQ:
				setMax_freq((BigInteger)newValue);
				return;
			case ComputerPackage.SCREEN__LENGTH:
				setLength((BigInteger)newValue);
				return;
			case ComputerPackage.SCREEN__WIDTH:
				setWidth((BigInteger)newValue);
				return;
			case ComputerPackage.SCREEN__HEIGHT:
				setHeight((BigInteger)newValue);
				return;
			case ComputerPackage.SCREEN__POWER_CONSUMPTION:
				setPower_consumption((BigInteger)newValue);
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
			case ComputerPackage.SCREEN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComputerPackage.SCREEN__MAX_RES:
				setMax_res(MAX_RES_EDEFAULT);
				return;
			case ComputerPackage.SCREEN__RESPONSE_TIME:
				setResponse_time(RESPONSE_TIME_EDEFAULT);
				return;
			case ComputerPackage.SCREEN__MAX_FREQ:
				setMax_freq(MAX_FREQ_EDEFAULT);
				return;
			case ComputerPackage.SCREEN__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case ComputerPackage.SCREEN__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ComputerPackage.SCREEN__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ComputerPackage.SCREEN__POWER_CONSUMPTION:
				setPower_consumption(POWER_CONSUMPTION_EDEFAULT);
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
			case ComputerPackage.SCREEN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComputerPackage.SCREEN__MAX_RES:
				return MAX_RES_EDEFAULT == null ? max_res != null : !MAX_RES_EDEFAULT.equals(max_res);
			case ComputerPackage.SCREEN__RESPONSE_TIME:
				return RESPONSE_TIME_EDEFAULT == null ? response_time != null : !RESPONSE_TIME_EDEFAULT.equals(response_time);
			case ComputerPackage.SCREEN__MAX_FREQ:
				return MAX_FREQ_EDEFAULT == null ? max_freq != null : !MAX_FREQ_EDEFAULT.equals(max_freq);
			case ComputerPackage.SCREEN__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case ComputerPackage.SCREEN__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case ComputerPackage.SCREEN__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case ComputerPackage.SCREEN__POWER_CONSUMPTION:
				return POWER_CONSUMPTION_EDEFAULT == null ? power_consumption != null : !POWER_CONSUMPTION_EDEFAULT.equals(power_consumption);
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
		result.append(", max_res: ");
		result.append(max_res);
		result.append(", response_time: ");
		result.append(response_time);
		result.append(", max_freq: ");
		result.append(max_freq);
		result.append(", length: ");
		result.append(length);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", power_consumption: ");
		result.append(power_consumption);
		result.append(')');
		return result.toString();
	}

} //ScreenImpl
