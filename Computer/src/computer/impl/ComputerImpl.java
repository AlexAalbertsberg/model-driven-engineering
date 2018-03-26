/**
 */
package computer.impl;

import computer.CDDVDDrive;
import computer.Computer;
import computer.ComputerPackage;
import computer.GraphicsCard;
import computer.HardDisk;
import computer.Keyboard;
import computer.Memory;
import computer.Motherboard;
import computer.Mouse;
import computer.PowerSupply;
import computer.Printer;
import computer.Processor;
import computer.Screen;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link computer.impl.ComputerImpl#getMotherboard <em>Motherboard</em>}</li>
 *   <li>{@link computer.impl.ComputerImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link computer.impl.ComputerImpl#getGraphicsCards <em>Graphics Cards</em>}</li>
 *   <li>{@link computer.impl.ComputerImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link computer.impl.ComputerImpl#getHardDisks <em>Hard Disks</em>}</li>
 *   <li>{@link computer.impl.ComputerImpl#getCdDvdDrives <em>Cd Dvd Drives</em>}</li>
 *   <li>{@link computer.impl.ComputerImpl#getScreens <em>Screens</em>}</li>
 *   <li>{@link computer.impl.ComputerImpl#getMouse <em>Mouse</em>}</li>
 *   <li>{@link computer.impl.ComputerImpl#getKeyboard <em>Keyboard</em>}</li>
 *   <li>{@link computer.impl.ComputerImpl#getPrinter <em>Printer</em>}</li>
 *   <li>{@link computer.impl.ComputerImpl#getPowerSupply <em>Power Supply</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputerImpl extends MinimalEObjectImpl.Container implements Computer {
	/**
	 * The cached value of the '{@link #getMotherboard() <em>Motherboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotherboard()
	 * @generated
	 * @ordered
	 */
	protected Motherboard motherboard;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected Processor processor;

	/**
	 * The cached value of the '{@link #getGraphicsCards() <em>Graphics Cards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicsCards()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicsCard> graphicsCards;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<Memory> memory;

	/**
	 * The cached value of the '{@link #getHardDisks() <em>Hard Disks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardDisks()
	 * @generated
	 * @ordered
	 */
	protected EList<HardDisk> hardDisks;

	/**
	 * The cached value of the '{@link #getCdDvdDrives() <em>Cd Dvd Drives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdDvdDrives()
	 * @generated
	 * @ordered
	 */
	protected EList<CDDVDDrive> cdDvdDrives;

	/**
	 * The cached value of the '{@link #getScreens() <em>Screens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreens()
	 * @generated
	 * @ordered
	 */
	protected EList<Screen> screens;

	/**
	 * The cached value of the '{@link #getMouse() <em>Mouse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouse()
	 * @generated
	 * @ordered
	 */
	protected Mouse mouse;

	/**
	 * The cached value of the '{@link #getKeyboard() <em>Keyboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyboard()
	 * @generated
	 * @ordered
	 */
	protected Keyboard keyboard;

	/**
	 * The cached value of the '{@link #getPrinter() <em>Printer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrinter()
	 * @generated
	 * @ordered
	 */
	protected Printer printer;

	/**
	 * The cached value of the '{@link #getPowerSupply() <em>Power Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSupply()
	 * @generated
	 * @ordered
	 */
	protected PowerSupply powerSupply;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputerPackage.Literals.COMPUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motherboard getMotherboard() {
		return motherboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMotherboard(Motherboard newMotherboard, NotificationChain msgs) {
		Motherboard oldMotherboard = motherboard;
		motherboard = newMotherboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputerPackage.COMPUTER__MOTHERBOARD, oldMotherboard, newMotherboard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotherboard(Motherboard newMotherboard) {
		if (newMotherboard != motherboard) {
			NotificationChain msgs = null;
			if (motherboard != null)
				msgs = ((InternalEObject)motherboard).eInverseRemove(this, ComputerPackage.MOTHERBOARD__COMPUTER, Motherboard.class, msgs);
			if (newMotherboard != null)
				msgs = ((InternalEObject)newMotherboard).eInverseAdd(this, ComputerPackage.MOTHERBOARD__COMPUTER, Motherboard.class, msgs);
			msgs = basicSetMotherboard(newMotherboard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.COMPUTER__MOTHERBOARD, newMotherboard, newMotherboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor getProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessor(Processor newProcessor, NotificationChain msgs) {
		Processor oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputerPackage.COMPUTER__PROCESSOR, oldProcessor, newProcessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(Processor newProcessor) {
		if (newProcessor != processor) {
			NotificationChain msgs = null;
			if (processor != null)
				msgs = ((InternalEObject)processor).eInverseRemove(this, ComputerPackage.PROCESSOR__COMPUTER, Processor.class, msgs);
			if (newProcessor != null)
				msgs = ((InternalEObject)newProcessor).eInverseAdd(this, ComputerPackage.PROCESSOR__COMPUTER, Processor.class, msgs);
			msgs = basicSetProcessor(newProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.COMPUTER__PROCESSOR, newProcessor, newProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphicsCard> getGraphicsCards() {
		if (graphicsCards == null) {
			graphicsCards = new EObjectContainmentEList<GraphicsCard>(GraphicsCard.class, this, ComputerPackage.COMPUTER__GRAPHICS_CARDS);
		}
		return graphicsCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memory> getMemory() {
		if (memory == null) {
			memory = new EObjectContainmentEList<Memory>(Memory.class, this, ComputerPackage.COMPUTER__MEMORY);
		}
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardDisk> getHardDisks() {
		if (hardDisks == null) {
			hardDisks = new EObjectContainmentEList<HardDisk>(HardDisk.class, this, ComputerPackage.COMPUTER__HARD_DISKS);
		}
		return hardDisks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CDDVDDrive> getCdDvdDrives() {
		if (cdDvdDrives == null) {
			cdDvdDrives = new EObjectContainmentEList<CDDVDDrive>(CDDVDDrive.class, this, ComputerPackage.COMPUTER__CD_DVD_DRIVES);
		}
		return cdDvdDrives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Screen> getScreens() {
		if (screens == null) {
			screens = new EObjectContainmentEList<Screen>(Screen.class, this, ComputerPackage.COMPUTER__SCREENS);
		}
		return screens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mouse getMouse() {
		return mouse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMouse(Mouse newMouse, NotificationChain msgs) {
		Mouse oldMouse = mouse;
		mouse = newMouse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputerPackage.COMPUTER__MOUSE, oldMouse, newMouse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMouse(Mouse newMouse) {
		if (newMouse != mouse) {
			NotificationChain msgs = null;
			if (mouse != null)
				msgs = ((InternalEObject)mouse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputerPackage.COMPUTER__MOUSE, null, msgs);
			if (newMouse != null)
				msgs = ((InternalEObject)newMouse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComputerPackage.COMPUTER__MOUSE, null, msgs);
			msgs = basicSetMouse(newMouse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.COMPUTER__MOUSE, newMouse, newMouse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyboard getKeyboard() {
		return keyboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyboard(Keyboard newKeyboard, NotificationChain msgs) {
		Keyboard oldKeyboard = keyboard;
		keyboard = newKeyboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputerPackage.COMPUTER__KEYBOARD, oldKeyboard, newKeyboard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyboard(Keyboard newKeyboard) {
		if (newKeyboard != keyboard) {
			NotificationChain msgs = null;
			if (keyboard != null)
				msgs = ((InternalEObject)keyboard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputerPackage.COMPUTER__KEYBOARD, null, msgs);
			if (newKeyboard != null)
				msgs = ((InternalEObject)newKeyboard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComputerPackage.COMPUTER__KEYBOARD, null, msgs);
			msgs = basicSetKeyboard(newKeyboard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.COMPUTER__KEYBOARD, newKeyboard, newKeyboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Printer getPrinter() {
		return printer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrinter(Printer newPrinter, NotificationChain msgs) {
		Printer oldPrinter = printer;
		printer = newPrinter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputerPackage.COMPUTER__PRINTER, oldPrinter, newPrinter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrinter(Printer newPrinter) {
		if (newPrinter != printer) {
			NotificationChain msgs = null;
			if (printer != null)
				msgs = ((InternalEObject)printer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputerPackage.COMPUTER__PRINTER, null, msgs);
			if (newPrinter != null)
				msgs = ((InternalEObject)newPrinter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComputerPackage.COMPUTER__PRINTER, null, msgs);
			msgs = basicSetPrinter(newPrinter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.COMPUTER__PRINTER, newPrinter, newPrinter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply getPowerSupply() {
		return powerSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerSupply(PowerSupply newPowerSupply, NotificationChain msgs) {
		PowerSupply oldPowerSupply = powerSupply;
		powerSupply = newPowerSupply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputerPackage.COMPUTER__POWER_SUPPLY, oldPowerSupply, newPowerSupply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerSupply(PowerSupply newPowerSupply) {
		if (newPowerSupply != powerSupply) {
			NotificationChain msgs = null;
			if (powerSupply != null)
				msgs = ((InternalEObject)powerSupply).eInverseRemove(this, ComputerPackage.POWER_SUPPLY__COMPUTER, PowerSupply.class, msgs);
			if (newPowerSupply != null)
				msgs = ((InternalEObject)newPowerSupply).eInverseAdd(this, ComputerPackage.POWER_SUPPLY__COMPUTER, PowerSupply.class, msgs);
			msgs = basicSetPowerSupply(newPowerSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputerPackage.COMPUTER__POWER_SUPPLY, newPowerSupply, newPowerSupply));
	}

	/**
	 * The cached invocation delegate for the '{@link #totalPowerUsage() <em>Total Power Usage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #totalPowerUsage()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate TOTAL_POWER_USAGE__EINVOCATION_DELEGATE = ((EOperation.Internal)ComputerPackage.Literals.COMPUTER___TOTAL_POWER_USAGE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger totalPowerUsage() {
		try {
			return (BigInteger)TOTAL_POWER_USAGE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComputerPackage.COMPUTER__MOTHERBOARD:
				if (motherboard != null)
					msgs = ((InternalEObject)motherboard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputerPackage.COMPUTER__MOTHERBOARD, null, msgs);
				return basicSetMotherboard((Motherboard)otherEnd, msgs);
			case ComputerPackage.COMPUTER__PROCESSOR:
				if (processor != null)
					msgs = ((InternalEObject)processor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputerPackage.COMPUTER__PROCESSOR, null, msgs);
				return basicSetProcessor((Processor)otherEnd, msgs);
			case ComputerPackage.COMPUTER__POWER_SUPPLY:
				if (powerSupply != null)
					msgs = ((InternalEObject)powerSupply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputerPackage.COMPUTER__POWER_SUPPLY, null, msgs);
				return basicSetPowerSupply((PowerSupply)otherEnd, msgs);
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
			case ComputerPackage.COMPUTER__MOTHERBOARD:
				return basicSetMotherboard(null, msgs);
			case ComputerPackage.COMPUTER__PROCESSOR:
				return basicSetProcessor(null, msgs);
			case ComputerPackage.COMPUTER__GRAPHICS_CARDS:
				return ((InternalEList<?>)getGraphicsCards()).basicRemove(otherEnd, msgs);
			case ComputerPackage.COMPUTER__MEMORY:
				return ((InternalEList<?>)getMemory()).basicRemove(otherEnd, msgs);
			case ComputerPackage.COMPUTER__HARD_DISKS:
				return ((InternalEList<?>)getHardDisks()).basicRemove(otherEnd, msgs);
			case ComputerPackage.COMPUTER__CD_DVD_DRIVES:
				return ((InternalEList<?>)getCdDvdDrives()).basicRemove(otherEnd, msgs);
			case ComputerPackage.COMPUTER__SCREENS:
				return ((InternalEList<?>)getScreens()).basicRemove(otherEnd, msgs);
			case ComputerPackage.COMPUTER__MOUSE:
				return basicSetMouse(null, msgs);
			case ComputerPackage.COMPUTER__KEYBOARD:
				return basicSetKeyboard(null, msgs);
			case ComputerPackage.COMPUTER__PRINTER:
				return basicSetPrinter(null, msgs);
			case ComputerPackage.COMPUTER__POWER_SUPPLY:
				return basicSetPowerSupply(null, msgs);
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
			case ComputerPackage.COMPUTER__MOTHERBOARD:
				return getMotherboard();
			case ComputerPackage.COMPUTER__PROCESSOR:
				return getProcessor();
			case ComputerPackage.COMPUTER__GRAPHICS_CARDS:
				return getGraphicsCards();
			case ComputerPackage.COMPUTER__MEMORY:
				return getMemory();
			case ComputerPackage.COMPUTER__HARD_DISKS:
				return getHardDisks();
			case ComputerPackage.COMPUTER__CD_DVD_DRIVES:
				return getCdDvdDrives();
			case ComputerPackage.COMPUTER__SCREENS:
				return getScreens();
			case ComputerPackage.COMPUTER__MOUSE:
				return getMouse();
			case ComputerPackage.COMPUTER__KEYBOARD:
				return getKeyboard();
			case ComputerPackage.COMPUTER__PRINTER:
				return getPrinter();
			case ComputerPackage.COMPUTER__POWER_SUPPLY:
				return getPowerSupply();
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
			case ComputerPackage.COMPUTER__MOTHERBOARD:
				setMotherboard((Motherboard)newValue);
				return;
			case ComputerPackage.COMPUTER__PROCESSOR:
				setProcessor((Processor)newValue);
				return;
			case ComputerPackage.COMPUTER__GRAPHICS_CARDS:
				getGraphicsCards().clear();
				getGraphicsCards().addAll((Collection<? extends GraphicsCard>)newValue);
				return;
			case ComputerPackage.COMPUTER__MEMORY:
				getMemory().clear();
				getMemory().addAll((Collection<? extends Memory>)newValue);
				return;
			case ComputerPackage.COMPUTER__HARD_DISKS:
				getHardDisks().clear();
				getHardDisks().addAll((Collection<? extends HardDisk>)newValue);
				return;
			case ComputerPackage.COMPUTER__CD_DVD_DRIVES:
				getCdDvdDrives().clear();
				getCdDvdDrives().addAll((Collection<? extends CDDVDDrive>)newValue);
				return;
			case ComputerPackage.COMPUTER__SCREENS:
				getScreens().clear();
				getScreens().addAll((Collection<? extends Screen>)newValue);
				return;
			case ComputerPackage.COMPUTER__MOUSE:
				setMouse((Mouse)newValue);
				return;
			case ComputerPackage.COMPUTER__KEYBOARD:
				setKeyboard((Keyboard)newValue);
				return;
			case ComputerPackage.COMPUTER__PRINTER:
				setPrinter((Printer)newValue);
				return;
			case ComputerPackage.COMPUTER__POWER_SUPPLY:
				setPowerSupply((PowerSupply)newValue);
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
			case ComputerPackage.COMPUTER__MOTHERBOARD:
				setMotherboard((Motherboard)null);
				return;
			case ComputerPackage.COMPUTER__PROCESSOR:
				setProcessor((Processor)null);
				return;
			case ComputerPackage.COMPUTER__GRAPHICS_CARDS:
				getGraphicsCards().clear();
				return;
			case ComputerPackage.COMPUTER__MEMORY:
				getMemory().clear();
				return;
			case ComputerPackage.COMPUTER__HARD_DISKS:
				getHardDisks().clear();
				return;
			case ComputerPackage.COMPUTER__CD_DVD_DRIVES:
				getCdDvdDrives().clear();
				return;
			case ComputerPackage.COMPUTER__SCREENS:
				getScreens().clear();
				return;
			case ComputerPackage.COMPUTER__MOUSE:
				setMouse((Mouse)null);
				return;
			case ComputerPackage.COMPUTER__KEYBOARD:
				setKeyboard((Keyboard)null);
				return;
			case ComputerPackage.COMPUTER__PRINTER:
				setPrinter((Printer)null);
				return;
			case ComputerPackage.COMPUTER__POWER_SUPPLY:
				setPowerSupply((PowerSupply)null);
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
			case ComputerPackage.COMPUTER__MOTHERBOARD:
				return motherboard != null;
			case ComputerPackage.COMPUTER__PROCESSOR:
				return processor != null;
			case ComputerPackage.COMPUTER__GRAPHICS_CARDS:
				return graphicsCards != null && !graphicsCards.isEmpty();
			case ComputerPackage.COMPUTER__MEMORY:
				return memory != null && !memory.isEmpty();
			case ComputerPackage.COMPUTER__HARD_DISKS:
				return hardDisks != null && !hardDisks.isEmpty();
			case ComputerPackage.COMPUTER__CD_DVD_DRIVES:
				return cdDvdDrives != null && !cdDvdDrives.isEmpty();
			case ComputerPackage.COMPUTER__SCREENS:
				return screens != null && !screens.isEmpty();
			case ComputerPackage.COMPUTER__MOUSE:
				return mouse != null;
			case ComputerPackage.COMPUTER__KEYBOARD:
				return keyboard != null;
			case ComputerPackage.COMPUTER__PRINTER:
				return printer != null;
			case ComputerPackage.COMPUTER__POWER_SUPPLY:
				return powerSupply != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ComputerPackage.COMPUTER___TOTAL_POWER_USAGE:
				return totalPowerUsage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComputerImpl
