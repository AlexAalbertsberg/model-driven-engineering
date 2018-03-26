/**
 */
package computer.impl;

import computer.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputerFactoryImpl extends EFactoryImpl implements ComputerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComputerFactory init() {
		try {
			ComputerFactory theComputerFactory = (ComputerFactory)EPackage.Registry.INSTANCE.getEFactory(ComputerPackage.eNS_URI);
			if (theComputerFactory != null) {
				return theComputerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComputerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComputerPackage.COMPUTER: return createComputer();
			case ComputerPackage.MOTHERBOARD: return createMotherboard();
			case ComputerPackage.PROCESSOR: return createProcessor();
			case ComputerPackage.GRAPHICS_CARD: return createGraphicsCard();
			case ComputerPackage.MEMORY: return createMemory();
			case ComputerPackage.HARD_DISK: return createHardDisk();
			case ComputerPackage.CDDVD_DRIVE: return createCDDVDDrive();
			case ComputerPackage.POWER_SUPPLY: return createPowerSupply();
			case ComputerPackage.SCREEN: return createScreen();
			case ComputerPackage.MOUSE: return createMouse();
			case ComputerPackage.KEYBOARD: return createKeyboard();
			case ComputerPackage.PRINTER: return createPrinter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer createComputer() {
		ComputerImpl computer = new ComputerImpl();
		return computer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motherboard createMotherboard() {
		MotherboardImpl motherboard = new MotherboardImpl();
		return motherboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsCard createGraphicsCard() {
		GraphicsCardImpl graphicsCard = new GraphicsCardImpl();
		return graphicsCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardDisk createHardDisk() {
		HardDiskImpl hardDisk = new HardDiskImpl();
		return hardDisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDDVDDrive createCDDVDDrive() {
		CDDVDDriveImpl cddvdDrive = new CDDVDDriveImpl();
		return cddvdDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply createPowerSupply() {
		PowerSupplyImpl powerSupply = new PowerSupplyImpl();
		return powerSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screen createScreen() {
		ScreenImpl screen = new ScreenImpl();
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mouse createMouse() {
		MouseImpl mouse = new MouseImpl();
		return mouse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyboard createKeyboard() {
		KeyboardImpl keyboard = new KeyboardImpl();
		return keyboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Printer createPrinter() {
		PrinterImpl printer = new PrinterImpl();
		return printer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputerPackage getComputerPackage() {
		return (ComputerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComputerPackage getPackage() {
		return ComputerPackage.eINSTANCE;
	}

} //ComputerFactoryImpl
