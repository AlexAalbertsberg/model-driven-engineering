/**
 */
package computer.impl;

import computer.ComputerPackage;
import computer.Printer;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Printer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link computer.impl.PrinterImpl#getName <em>Name</em>}</li>
 *   <li>{@link computer.impl.PrinterImpl#getNumUSB <em>Num USB</em>}</li>
 *   <li>{@link computer.impl.PrinterImpl#getNumPS2 <em>Num PS2</em>}</li>
 *   <li>{@link computer.impl.PrinterImpl#getConnection_type <em>Connection type</em>}</li>
 *   <li>{@link computer.impl.PrinterImpl#getPower_consumption <em>Power consumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrinterImpl extends MinimalEObjectImpl.Container implements Printer {
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
	 * The default value of the '{@link #getConnection_type() <em>Connection type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_type()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnection_type() <em>Connection type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_type()
	 * @generated
	 * @ordered
	 */
	protected String connection_type = CONNECTION_TYPE_EDEFAULT;

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
	protected PrinterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputerPackage.Literals.PRINTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.PRINTER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.PRINTER__NUM_USB, oldNumUSB, numUSB));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.PRINTER__NUM_PS2, oldNumPS2, numPS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnection_type() {
		return connection_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection_type(String newConnection_type) {
		String oldConnection_type = connection_type;
		connection_type = newConnection_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.PRINTER__CONNECTION_TYPE, oldConnection_type, connection_type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.PRINTER__POWER_CONSUMPTION, oldPower_consumption, power_consumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputerPackage.PRINTER__NAME:
				return getName();
			case ComputerPackage.PRINTER__NUM_USB:
				return getNumUSB();
			case ComputerPackage.PRINTER__NUM_PS2:
				return getNumPS2();
			case ComputerPackage.PRINTER__CONNECTION_TYPE:
				return getConnection_type();
			case ComputerPackage.PRINTER__POWER_CONSUMPTION:
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
			case ComputerPackage.PRINTER__NAME:
				setName((String)newValue);
				return;
			case ComputerPackage.PRINTER__NUM_USB:
				setNumUSB((BigInteger)newValue);
				return;
			case ComputerPackage.PRINTER__NUM_PS2:
				setNumPS2((BigInteger)newValue);
				return;
			case ComputerPackage.PRINTER__CONNECTION_TYPE:
				setConnection_type((String)newValue);
				return;
			case ComputerPackage.PRINTER__POWER_CONSUMPTION:
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
			case ComputerPackage.PRINTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComputerPackage.PRINTER__NUM_USB:
				setNumUSB(NUM_USB_EDEFAULT);
				return;
			case ComputerPackage.PRINTER__NUM_PS2:
				setNumPS2(NUM_PS2_EDEFAULT);
				return;
			case ComputerPackage.PRINTER__CONNECTION_TYPE:
				setConnection_type(CONNECTION_TYPE_EDEFAULT);
				return;
			case ComputerPackage.PRINTER__POWER_CONSUMPTION:
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
			case ComputerPackage.PRINTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComputerPackage.PRINTER__NUM_USB:
				return NUM_USB_EDEFAULT == null ? numUSB != null : !NUM_USB_EDEFAULT.equals(numUSB);
			case ComputerPackage.PRINTER__NUM_PS2:
				return NUM_PS2_EDEFAULT == null ? numPS2 != null : !NUM_PS2_EDEFAULT.equals(numPS2);
			case ComputerPackage.PRINTER__CONNECTION_TYPE:
				return CONNECTION_TYPE_EDEFAULT == null ? connection_type != null : !CONNECTION_TYPE_EDEFAULT.equals(connection_type);
			case ComputerPackage.PRINTER__POWER_CONSUMPTION:
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
		result.append(", connection_type: ");
		result.append(connection_type);
		result.append(", power_consumption: ");
		result.append(power_consumption);
		result.append(')');
		return result.toString();
	}

} //PrinterImpl
