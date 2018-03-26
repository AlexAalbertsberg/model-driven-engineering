/**
 */
package computer.impl;

import computer.ComputerPackage;
import computer.HardDisk;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hard Disk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link computer.impl.HardDiskImpl#getName <em>Name</em>}</li>
 *   <li>{@link computer.impl.HardDiskImpl#isIsSSD <em>Is SSD</em>}</li>
 *   <li>{@link computer.impl.HardDiskImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link computer.impl.HardDiskImpl#getRead_speed <em>Read speed</em>}</li>
 *   <li>{@link computer.impl.HardDiskImpl#getWrite_speed <em>Write speed</em>}</li>
 *   <li>{@link computer.impl.HardDiskImpl#getPower_consumption <em>Power consumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardDiskImpl extends MinimalEObjectImpl.Container implements HardDisk {
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
	 * The default value of the '{@link #isIsSSD() <em>Is SSD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSSD()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SSD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSSD() <em>Is SSD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSSD()
	 * @generated
	 * @ordered
	 */
	protected boolean isSSD = IS_SSD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRead_speed() <em>Read speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRead_speed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger READ_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRead_speed() <em>Read speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRead_speed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger read_speed = READ_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrite_speed() <em>Write speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite_speed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WRITE_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrite_speed() <em>Write speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite_speed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger write_speed = WRITE_SPEED_EDEFAULT;

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
	protected HardDiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputerPackage.Literals.HARD_DISK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.HARD_DISK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSSD() {
		return isSSD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSSD(boolean newIsSSD) {
		boolean oldIsSSD = isSSD;
		isSSD = newIsSSD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.HARD_DISK__IS_SSD, oldIsSSD, isSSD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(BigInteger newCapacity) {
		BigInteger oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.HARD_DISK__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRead_speed() {
		return read_speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRead_speed(BigInteger newRead_speed) {
		BigInteger oldRead_speed = read_speed;
		read_speed = newRead_speed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.HARD_DISK__READ_SPEED, oldRead_speed, read_speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWrite_speed() {
		return write_speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrite_speed(BigInteger newWrite_speed) {
		BigInteger oldWrite_speed = write_speed;
		write_speed = newWrite_speed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.HARD_DISK__WRITE_SPEED, oldWrite_speed, write_speed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.HARD_DISK__POWER_CONSUMPTION, oldPower_consumption, power_consumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputerPackage.HARD_DISK__NAME:
				return getName();
			case ComputerPackage.HARD_DISK__IS_SSD:
				return isIsSSD();
			case ComputerPackage.HARD_DISK__CAPACITY:
				return getCapacity();
			case ComputerPackage.HARD_DISK__READ_SPEED:
				return getRead_speed();
			case ComputerPackage.HARD_DISK__WRITE_SPEED:
				return getWrite_speed();
			case ComputerPackage.HARD_DISK__POWER_CONSUMPTION:
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
			case ComputerPackage.HARD_DISK__NAME:
				setName((String)newValue);
				return;
			case ComputerPackage.HARD_DISK__IS_SSD:
				setIsSSD((Boolean)newValue);
				return;
			case ComputerPackage.HARD_DISK__CAPACITY:
				setCapacity((BigInteger)newValue);
				return;
			case ComputerPackage.HARD_DISK__READ_SPEED:
				setRead_speed((BigInteger)newValue);
				return;
			case ComputerPackage.HARD_DISK__WRITE_SPEED:
				setWrite_speed((BigInteger)newValue);
				return;
			case ComputerPackage.HARD_DISK__POWER_CONSUMPTION:
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
			case ComputerPackage.HARD_DISK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComputerPackage.HARD_DISK__IS_SSD:
				setIsSSD(IS_SSD_EDEFAULT);
				return;
			case ComputerPackage.HARD_DISK__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case ComputerPackage.HARD_DISK__READ_SPEED:
				setRead_speed(READ_SPEED_EDEFAULT);
				return;
			case ComputerPackage.HARD_DISK__WRITE_SPEED:
				setWrite_speed(WRITE_SPEED_EDEFAULT);
				return;
			case ComputerPackage.HARD_DISK__POWER_CONSUMPTION:
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
			case ComputerPackage.HARD_DISK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComputerPackage.HARD_DISK__IS_SSD:
				return isSSD != IS_SSD_EDEFAULT;
			case ComputerPackage.HARD_DISK__CAPACITY:
				return CAPACITY_EDEFAULT == null ? capacity != null : !CAPACITY_EDEFAULT.equals(capacity);
			case ComputerPackage.HARD_DISK__READ_SPEED:
				return READ_SPEED_EDEFAULT == null ? read_speed != null : !READ_SPEED_EDEFAULT.equals(read_speed);
			case ComputerPackage.HARD_DISK__WRITE_SPEED:
				return WRITE_SPEED_EDEFAULT == null ? write_speed != null : !WRITE_SPEED_EDEFAULT.equals(write_speed);
			case ComputerPackage.HARD_DISK__POWER_CONSUMPTION:
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
		result.append(", isSSD: ");
		result.append(isSSD);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", read_speed: ");
		result.append(read_speed);
		result.append(", write_speed: ");
		result.append(write_speed);
		result.append(", power_consumption: ");
		result.append(power_consumption);
		result.append(')');
		return result.toString();
	}

} //HardDiskImpl
