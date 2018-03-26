/**
 */
package computer.impl;

import computer.Computer;
import computer.ComputerPackage;
import computer.Motherboard;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motherboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link computer.impl.MotherboardImpl#getName <em>Name</em>}</li>
 *   <li>{@link computer.impl.MotherboardImpl#getCPU_socket <em>CPU socket</em>}</li>
 *   <li>{@link computer.impl.MotherboardImpl#isHasOnboardGPU <em>Has Onboard GPU</em>}</li>
 *   <li>{@link computer.impl.MotherboardImpl#getNumPS2Ports <em>Num PS2 Ports</em>}</li>
 *   <li>{@link computer.impl.MotherboardImpl#getNumUSBPorts <em>Num USB Ports</em>}</li>
 *   <li>{@link computer.impl.MotherboardImpl#getPower_consumption <em>Power consumption</em>}</li>
 *   <li>{@link computer.impl.MotherboardImpl#getComputer <em>Computer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MotherboardImpl extends MinimalEObjectImpl.Container implements Motherboard {
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
	 * The default value of the '{@link #getCPU_socket() <em>CPU socket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPU_socket()
	 * @generated
	 * @ordered
	 */
	protected static final String CPU_SOCKET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPU_socket() <em>CPU socket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPU_socket()
	 * @generated
	 * @ordered
	 */
	protected String cpU_socket = CPU_SOCKET_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasOnboardGPU() <em>Has Onboard GPU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasOnboardGPU()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_ONBOARD_GPU_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasOnboardGPU() <em>Has Onboard GPU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasOnboardGPU()
	 * @generated
	 * @ordered
	 */
	protected boolean hasOnboardGPU = HAS_ONBOARD_GPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumPS2Ports() <em>Num PS2 Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPS2Ports()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUM_PS2_PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumPS2Ports() <em>Num PS2 Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPS2Ports()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numPS2Ports = NUM_PS2_PORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumUSBPorts() <em>Num USB Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumUSBPorts()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUM_USB_PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumUSBPorts() <em>Num USB Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumUSBPorts()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numUSBPorts = NUM_USB_PORTS_EDEFAULT;

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
	protected MotherboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputerPackage.Literals.MOTHERBOARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.MOTHERBOARD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCPU_socket() {
		return cpU_socket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPU_socket(String newCPU_socket) {
		String oldCPU_socket = cpU_socket;
		cpU_socket = newCPU_socket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.MOTHERBOARD__CPU_SOCKET, oldCPU_socket, cpU_socket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasOnboardGPU() {
		return hasOnboardGPU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasOnboardGPU(boolean newHasOnboardGPU) {
		boolean oldHasOnboardGPU = hasOnboardGPU;
		hasOnboardGPU = newHasOnboardGPU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.MOTHERBOARD__HAS_ONBOARD_GPU, oldHasOnboardGPU, hasOnboardGPU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumPS2Ports() {
		return numPS2Ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumPS2Ports(BigInteger newNumPS2Ports) {
		BigInteger oldNumPS2Ports = numPS2Ports;
		numPS2Ports = newNumPS2Ports;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.MOTHERBOARD__NUM_PS2_PORTS, oldNumPS2Ports, numPS2Ports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumUSBPorts() {
		return numUSBPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumUSBPorts(BigInteger newNumUSBPorts) {
		BigInteger oldNumUSBPorts = numUSBPorts;
		numUSBPorts = newNumUSBPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.MOTHERBOARD__NUM_USB_PORTS, oldNumUSBPorts, numUSBPorts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.MOTHERBOARD__POWER_CONSUMPTION, oldPower_consumption, power_consumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer getComputer() {
		if (eContainerFeatureID() != ComputerPackage.MOTHERBOARD__COMPUTER) return null;
		return (Computer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputer(Computer newComputer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComputer, ComputerPackage.MOTHERBOARD__COMPUTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputer(Computer newComputer) {
		if (newComputer != eInternalContainer() || (eContainerFeatureID() != ComputerPackage.MOTHERBOARD__COMPUTER && newComputer != null)) {
			if (EcoreUtil.isAncestor(this, newComputer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComputer != null)
				msgs = ((InternalEObject)newComputer).eInverseAdd(this, ComputerPackage.COMPUTER__MOTHERBOARD, Computer.class, msgs);
			msgs = basicSetComputer(newComputer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.MOTHERBOARD__COMPUTER, newComputer, newComputer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComputerPackage.MOTHERBOARD__COMPUTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComputer((Computer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComputerPackage.MOTHERBOARD__COMPUTER:
				return basicSetComputer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ComputerPackage.MOTHERBOARD__COMPUTER:
				return eInternalContainer().eInverseRemove(this, ComputerPackage.COMPUTER__MOTHERBOARD, Computer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputerPackage.MOTHERBOARD__NAME:
				return getName();
			case ComputerPackage.MOTHERBOARD__CPU_SOCKET:
				return getCPU_socket();
			case ComputerPackage.MOTHERBOARD__HAS_ONBOARD_GPU:
				return isHasOnboardGPU();
			case ComputerPackage.MOTHERBOARD__NUM_PS2_PORTS:
				return getNumPS2Ports();
			case ComputerPackage.MOTHERBOARD__NUM_USB_PORTS:
				return getNumUSBPorts();
			case ComputerPackage.MOTHERBOARD__POWER_CONSUMPTION:
				return getPower_consumption();
			case ComputerPackage.MOTHERBOARD__COMPUTER:
				return getComputer();
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
			case ComputerPackage.MOTHERBOARD__NAME:
				setName((String)newValue);
				return;
			case ComputerPackage.MOTHERBOARD__CPU_SOCKET:
				setCPU_socket((String)newValue);
				return;
			case ComputerPackage.MOTHERBOARD__HAS_ONBOARD_GPU:
				setHasOnboardGPU((Boolean)newValue);
				return;
			case ComputerPackage.MOTHERBOARD__NUM_PS2_PORTS:
				setNumPS2Ports((BigInteger)newValue);
				return;
			case ComputerPackage.MOTHERBOARD__NUM_USB_PORTS:
				setNumUSBPorts((BigInteger)newValue);
				return;
			case ComputerPackage.MOTHERBOARD__POWER_CONSUMPTION:
				setPower_consumption((BigInteger)newValue);
				return;
			case ComputerPackage.MOTHERBOARD__COMPUTER:
				setComputer((Computer)newValue);
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
			case ComputerPackage.MOTHERBOARD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComputerPackage.MOTHERBOARD__CPU_SOCKET:
				setCPU_socket(CPU_SOCKET_EDEFAULT);
				return;
			case ComputerPackage.MOTHERBOARD__HAS_ONBOARD_GPU:
				setHasOnboardGPU(HAS_ONBOARD_GPU_EDEFAULT);
				return;
			case ComputerPackage.MOTHERBOARD__NUM_PS2_PORTS:
				setNumPS2Ports(NUM_PS2_PORTS_EDEFAULT);
				return;
			case ComputerPackage.MOTHERBOARD__NUM_USB_PORTS:
				setNumUSBPorts(NUM_USB_PORTS_EDEFAULT);
				return;
			case ComputerPackage.MOTHERBOARD__POWER_CONSUMPTION:
				setPower_consumption(POWER_CONSUMPTION_EDEFAULT);
				return;
			case ComputerPackage.MOTHERBOARD__COMPUTER:
				setComputer((Computer)null);
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
			case ComputerPackage.MOTHERBOARD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComputerPackage.MOTHERBOARD__CPU_SOCKET:
				return CPU_SOCKET_EDEFAULT == null ? cpU_socket != null : !CPU_SOCKET_EDEFAULT.equals(cpU_socket);
			case ComputerPackage.MOTHERBOARD__HAS_ONBOARD_GPU:
				return hasOnboardGPU != HAS_ONBOARD_GPU_EDEFAULT;
			case ComputerPackage.MOTHERBOARD__NUM_PS2_PORTS:
				return NUM_PS2_PORTS_EDEFAULT == null ? numPS2Ports != null : !NUM_PS2_PORTS_EDEFAULT.equals(numPS2Ports);
			case ComputerPackage.MOTHERBOARD__NUM_USB_PORTS:
				return NUM_USB_PORTS_EDEFAULT == null ? numUSBPorts != null : !NUM_USB_PORTS_EDEFAULT.equals(numUSBPorts);
			case ComputerPackage.MOTHERBOARD__POWER_CONSUMPTION:
				return POWER_CONSUMPTION_EDEFAULT == null ? power_consumption != null : !POWER_CONSUMPTION_EDEFAULT.equals(power_consumption);
			case ComputerPackage.MOTHERBOARD__COMPUTER:
				return getComputer() != null;
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
		result.append(", CPU_socket: ");
		result.append(cpU_socket);
		result.append(", hasOnboardGPU: ");
		result.append(hasOnboardGPU);
		result.append(", numPS2Ports: ");
		result.append(numPS2Ports);
		result.append(", numUSBPorts: ");
		result.append(numUSBPorts);
		result.append(", power_consumption: ");
		result.append(power_consumption);
		result.append(')');
		return result.toString();
	}

} //MotherboardImpl
