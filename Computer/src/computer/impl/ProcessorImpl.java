/**
 */
package computer.impl;

import computer.Computer;
import computer.ComputerPackage;
import computer.Processor;

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
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link computer.impl.ProcessorImpl#getName <em>Name</em>}</li>
 *   <li>{@link computer.impl.ProcessorImpl#getCPU_socket <em>CPU socket</em>}</li>
 *   <li>{@link computer.impl.ProcessorImpl#getNumCores <em>Num Cores</em>}</li>
 *   <li>{@link computer.impl.ProcessorImpl#getClockSpeed <em>Clock Speed</em>}</li>
 *   <li>{@link computer.impl.ProcessorImpl#getPower_consumption <em>Power consumption</em>}</li>
 *   <li>{@link computer.impl.ProcessorImpl#getComputer <em>Computer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorImpl extends MinimalEObjectImpl.Container implements Processor {
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
	 * The default value of the '{@link #getNumCores() <em>Num Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCores()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUM_CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumCores() <em>Num Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCores()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numCores = NUM_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getClockSpeed() <em>Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CLOCK_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClockSpeed() <em>Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger clockSpeed = CLOCK_SPEED_EDEFAULT;

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
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputerPackage.Literals.PROCESSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.PROCESSOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.PROCESSOR__CPU_SOCKET, oldCPU_socket, cpU_socket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumCores() {
		return numCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumCores(BigInteger newNumCores) {
		BigInteger oldNumCores = numCores;
		numCores = newNumCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.PROCESSOR__NUM_CORES, oldNumCores, numCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getClockSpeed() {
		return clockSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockSpeed(BigInteger newClockSpeed) {
		BigInteger oldClockSpeed = clockSpeed;
		clockSpeed = newClockSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.PROCESSOR__CLOCK_SPEED, oldClockSpeed, clockSpeed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.PROCESSOR__POWER_CONSUMPTION, oldPower_consumption, power_consumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer getComputer() {
		if (eContainerFeatureID() != ComputerPackage.PROCESSOR__COMPUTER) return null;
		return (Computer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputer(Computer newComputer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComputer, ComputerPackage.PROCESSOR__COMPUTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputer(Computer newComputer) {
		if (newComputer != eInternalContainer() || (eContainerFeatureID() != ComputerPackage.PROCESSOR__COMPUTER && newComputer != null)) {
			if (EcoreUtil.isAncestor(this, newComputer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComputer != null)
				msgs = ((InternalEObject)newComputer).eInverseAdd(this, ComputerPackage.COMPUTER__PROCESSOR, Computer.class, msgs);
			msgs = basicSetComputer(newComputer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.PROCESSOR__COMPUTER, newComputer, newComputer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComputerPackage.PROCESSOR__COMPUTER:
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
			case ComputerPackage.PROCESSOR__COMPUTER:
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
			case ComputerPackage.PROCESSOR__COMPUTER:
				return eInternalContainer().eInverseRemove(this, ComputerPackage.COMPUTER__PROCESSOR, Computer.class, msgs);
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
			case ComputerPackage.PROCESSOR__NAME:
				return getName();
			case ComputerPackage.PROCESSOR__CPU_SOCKET:
				return getCPU_socket();
			case ComputerPackage.PROCESSOR__NUM_CORES:
				return getNumCores();
			case ComputerPackage.PROCESSOR__CLOCK_SPEED:
				return getClockSpeed();
			case ComputerPackage.PROCESSOR__POWER_CONSUMPTION:
				return getPower_consumption();
			case ComputerPackage.PROCESSOR__COMPUTER:
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
			case ComputerPackage.PROCESSOR__NAME:
				setName((String)newValue);
				return;
			case ComputerPackage.PROCESSOR__CPU_SOCKET:
				setCPU_socket((String)newValue);
				return;
			case ComputerPackage.PROCESSOR__NUM_CORES:
				setNumCores((BigInteger)newValue);
				return;
			case ComputerPackage.PROCESSOR__CLOCK_SPEED:
				setClockSpeed((BigInteger)newValue);
				return;
			case ComputerPackage.PROCESSOR__POWER_CONSUMPTION:
				setPower_consumption((BigInteger)newValue);
				return;
			case ComputerPackage.PROCESSOR__COMPUTER:
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
			case ComputerPackage.PROCESSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComputerPackage.PROCESSOR__CPU_SOCKET:
				setCPU_socket(CPU_SOCKET_EDEFAULT);
				return;
			case ComputerPackage.PROCESSOR__NUM_CORES:
				setNumCores(NUM_CORES_EDEFAULT);
				return;
			case ComputerPackage.PROCESSOR__CLOCK_SPEED:
				setClockSpeed(CLOCK_SPEED_EDEFAULT);
				return;
			case ComputerPackage.PROCESSOR__POWER_CONSUMPTION:
				setPower_consumption(POWER_CONSUMPTION_EDEFAULT);
				return;
			case ComputerPackage.PROCESSOR__COMPUTER:
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
			case ComputerPackage.PROCESSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComputerPackage.PROCESSOR__CPU_SOCKET:
				return CPU_SOCKET_EDEFAULT == null ? cpU_socket != null : !CPU_SOCKET_EDEFAULT.equals(cpU_socket);
			case ComputerPackage.PROCESSOR__NUM_CORES:
				return NUM_CORES_EDEFAULT == null ? numCores != null : !NUM_CORES_EDEFAULT.equals(numCores);
			case ComputerPackage.PROCESSOR__CLOCK_SPEED:
				return CLOCK_SPEED_EDEFAULT == null ? clockSpeed != null : !CLOCK_SPEED_EDEFAULT.equals(clockSpeed);
			case ComputerPackage.PROCESSOR__POWER_CONSUMPTION:
				return POWER_CONSUMPTION_EDEFAULT == null ? power_consumption != null : !POWER_CONSUMPTION_EDEFAULT.equals(power_consumption);
			case ComputerPackage.PROCESSOR__COMPUTER:
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
		result.append(", numCores: ");
		result.append(numCores);
		result.append(", clockSpeed: ");
		result.append(clockSpeed);
		result.append(", power_consumption: ");
		result.append(power_consumption);
		result.append(')');
		return result.toString();
	}

} //ProcessorImpl
