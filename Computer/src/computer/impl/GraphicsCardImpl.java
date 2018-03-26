/**
 */
package computer.impl;

import computer.ComputerPackage;
import computer.GraphicsCard;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphics Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link computer.impl.GraphicsCardImpl#getName <em>Name</em>}</li>
 *   <li>{@link computer.impl.GraphicsCardImpl#getMemory_size <em>Memory size</em>}</li>
 *   <li>{@link computer.impl.GraphicsCardImpl#getCore_clock <em>Core clock</em>}</li>
 *   <li>{@link computer.impl.GraphicsCardImpl#getMemory_clock <em>Memory clock</em>}</li>
 *   <li>{@link computer.impl.GraphicsCardImpl#getPower_consumption <em>Power consumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicsCardImpl extends MinimalEObjectImpl.Container implements GraphicsCard {
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
	 * The default value of the '{@link #getMemory_size() <em>Memory size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_size()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MEMORY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemory_size() <em>Memory size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_size()
	 * @generated
	 * @ordered
	 */
	protected BigInteger memory_size = MEMORY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCore_clock() <em>Core clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore_clock()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CORE_CLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCore_clock() <em>Core clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore_clock()
	 * @generated
	 * @ordered
	 */
	protected BigInteger core_clock = CORE_CLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory_clock() <em>Memory clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_clock()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MEMORY_CLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemory_clock() <em>Memory clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_clock()
	 * @generated
	 * @ordered
	 */
	protected BigInteger memory_clock = MEMORY_CLOCK_EDEFAULT;

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
	protected GraphicsCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputerPackage.Literals.GRAPHICS_CARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.GRAPHICS_CARD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMemory_size() {
		return memory_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_size(BigInteger newMemory_size) {
		BigInteger oldMemory_size = memory_size;
		memory_size = newMemory_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.GRAPHICS_CARD__MEMORY_SIZE, oldMemory_size, memory_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCore_clock() {
		return core_clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCore_clock(BigInteger newCore_clock) {
		BigInteger oldCore_clock = core_clock;
		core_clock = newCore_clock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.GRAPHICS_CARD__CORE_CLOCK, oldCore_clock, core_clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMemory_clock() {
		return memory_clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_clock(BigInteger newMemory_clock) {
		BigInteger oldMemory_clock = memory_clock;
		memory_clock = newMemory_clock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.GRAPHICS_CARD__MEMORY_CLOCK, oldMemory_clock, memory_clock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.GRAPHICS_CARD__POWER_CONSUMPTION, oldPower_consumption, power_consumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputerPackage.GRAPHICS_CARD__NAME:
				return getName();
			case ComputerPackage.GRAPHICS_CARD__MEMORY_SIZE:
				return getMemory_size();
			case ComputerPackage.GRAPHICS_CARD__CORE_CLOCK:
				return getCore_clock();
			case ComputerPackage.GRAPHICS_CARD__MEMORY_CLOCK:
				return getMemory_clock();
			case ComputerPackage.GRAPHICS_CARD__POWER_CONSUMPTION:
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
			case ComputerPackage.GRAPHICS_CARD__NAME:
				setName((String)newValue);
				return;
			case ComputerPackage.GRAPHICS_CARD__MEMORY_SIZE:
				setMemory_size((BigInteger)newValue);
				return;
			case ComputerPackage.GRAPHICS_CARD__CORE_CLOCK:
				setCore_clock((BigInteger)newValue);
				return;
			case ComputerPackage.GRAPHICS_CARD__MEMORY_CLOCK:
				setMemory_clock((BigInteger)newValue);
				return;
			case ComputerPackage.GRAPHICS_CARD__POWER_CONSUMPTION:
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
			case ComputerPackage.GRAPHICS_CARD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComputerPackage.GRAPHICS_CARD__MEMORY_SIZE:
				setMemory_size(MEMORY_SIZE_EDEFAULT);
				return;
			case ComputerPackage.GRAPHICS_CARD__CORE_CLOCK:
				setCore_clock(CORE_CLOCK_EDEFAULT);
				return;
			case ComputerPackage.GRAPHICS_CARD__MEMORY_CLOCK:
				setMemory_clock(MEMORY_CLOCK_EDEFAULT);
				return;
			case ComputerPackage.GRAPHICS_CARD__POWER_CONSUMPTION:
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
			case ComputerPackage.GRAPHICS_CARD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComputerPackage.GRAPHICS_CARD__MEMORY_SIZE:
				return MEMORY_SIZE_EDEFAULT == null ? memory_size != null : !MEMORY_SIZE_EDEFAULT.equals(memory_size);
			case ComputerPackage.GRAPHICS_CARD__CORE_CLOCK:
				return CORE_CLOCK_EDEFAULT == null ? core_clock != null : !CORE_CLOCK_EDEFAULT.equals(core_clock);
			case ComputerPackage.GRAPHICS_CARD__MEMORY_CLOCK:
				return MEMORY_CLOCK_EDEFAULT == null ? memory_clock != null : !MEMORY_CLOCK_EDEFAULT.equals(memory_clock);
			case ComputerPackage.GRAPHICS_CARD__POWER_CONSUMPTION:
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
		result.append(", memory_size: ");
		result.append(memory_size);
		result.append(", core_clock: ");
		result.append(core_clock);
		result.append(", memory_clock: ");
		result.append(memory_clock);
		result.append(", power_consumption: ");
		result.append(power_consumption);
		result.append(')');
		return result.toString();
	}

} //GraphicsCardImpl
