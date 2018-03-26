/**
 */
package computer.impl;

import computer.ComputerPackage;
import computer.Mouse;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mouse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link computer.impl.MouseImpl#getName <em>Name</em>}</li>
 *   <li>{@link computer.impl.MouseImpl#getNumUSB <em>Num USB</em>}</li>
 *   <li>{@link computer.impl.MouseImpl#getNumPS2 <em>Num PS2</em>}</li>
 *   <li>{@link computer.impl.MouseImpl#getDpi <em>Dpi</em>}</li>
 *   <li>{@link computer.impl.MouseImpl#getPower_consumption <em>Power consumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MouseImpl extends MinimalEObjectImpl.Container implements Mouse {
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
	 * The default value of the '{@link #getNumUSB() <em>Num USB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumUSB()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUM_USB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumUSB() <em>Num USB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumUSB()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numUSB = NUM_USB_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumPS2() <em>Num PS2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPS2()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUM_PS2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumPS2() <em>Num PS2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPS2()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numPS2 = NUM_PS2_EDEFAULT;

	/**
	 * The default value of the '{@link #getDpi() <em>Dpi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpi()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DPI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDpi() <em>Dpi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDpi()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dpi = DPI_EDEFAULT;

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
	protected MouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputerPackage.Literals.MOUSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.MOUSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumUSB() {
		return numUSB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumUSB(BigInteger newNumUSB) {
		BigInteger oldNumUSB = numUSB;
		numUSB = newNumUSB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.MOUSE__NUM_USB, oldNumUSB, numUSB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumPS2() {
		return numPS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumPS2(BigInteger newNumPS2) {
		BigInteger oldNumPS2 = numPS2;
		numPS2 = newNumPS2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.MOUSE__NUM_PS2, oldNumPS2, numPS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDpi() {
		return dpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDpi(BigInteger newDpi) {
		BigInteger oldDpi = dpi;
		dpi = newDpi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.MOUSE__DPI, oldDpi, dpi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.MOUSE__POWER_CONSUMPTION, oldPower_consumption, power_consumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputerPackage.MOUSE__NAME:
				return getName();
			case ComputerPackage.MOUSE__NUM_USB:
				return getNumUSB();
			case ComputerPackage.MOUSE__NUM_PS2:
				return getNumPS2();
			case ComputerPackage.MOUSE__DPI:
				return getDpi();
			case ComputerPackage.MOUSE__POWER_CONSUMPTION:
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
			case ComputerPackage.MOUSE__NAME:
				setName((String)newValue);
				return;
			case ComputerPackage.MOUSE__NUM_USB:
				setNumUSB((BigInteger)newValue);
				return;
			case ComputerPackage.MOUSE__NUM_PS2:
				setNumPS2((BigInteger)newValue);
				return;
			case ComputerPackage.MOUSE__DPI:
				setDpi((BigInteger)newValue);
				return;
			case ComputerPackage.MOUSE__POWER_CONSUMPTION:
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
			case ComputerPackage.MOUSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComputerPackage.MOUSE__NUM_USB:
				setNumUSB(NUM_USB_EDEFAULT);
				return;
			case ComputerPackage.MOUSE__NUM_PS2:
				setNumPS2(NUM_PS2_EDEFAULT);
				return;
			case ComputerPackage.MOUSE__DPI:
				setDpi(DPI_EDEFAULT);
				return;
			case ComputerPackage.MOUSE__POWER_CONSUMPTION:
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
			case ComputerPackage.MOUSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComputerPackage.MOUSE__NUM_USB:
				return NUM_USB_EDEFAULT == null ? numUSB != null : !NUM_USB_EDEFAULT.equals(numUSB);
			case ComputerPackage.MOUSE__NUM_PS2:
				return NUM_PS2_EDEFAULT == null ? numPS2 != null : !NUM_PS2_EDEFAULT.equals(numPS2);
			case ComputerPackage.MOUSE__DPI:
				return DPI_EDEFAULT == null ? dpi != null : !DPI_EDEFAULT.equals(dpi);
			case ComputerPackage.MOUSE__POWER_CONSUMPTION:
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
		result.append(", numUSB: ");
		result.append(numUSB);
		result.append(", numPS2: ");
		result.append(numPS2);
		result.append(", dpi: ");
		result.append(dpi);
		result.append(", power_consumption: ");
		result.append(power_consumption);
		result.append(')');
		return result.toString();
	}

} //MouseImpl
