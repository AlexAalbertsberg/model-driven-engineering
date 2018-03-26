/**
 */
package computer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see computer.ComputerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ComputerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "computer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "??";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "comp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComputerPackage eINSTANCE = computer.impl.ComputerPackageImpl.init();

	/**
	 * The meta object id for the '{@link computer.impl.ComputerImpl <em>Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see computer.impl.ComputerImpl
	 * @see computer.impl.ComputerPackageImpl#getComputer()
	 * @generated
	 */
	int COMPUTER = 0;

	/**
	 * The feature id for the '<em><b>Motherboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__MOTHERBOARD = 0;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Graphics Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__GRAPHICS_CARDS = 2;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__MEMORY = 3;

	/**
	 * The feature id for the '<em><b>Hard Disks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__HARD_DISKS = 4;

	/**
	 * The feature id for the '<em><b>Cd Dvd Drives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__CD_DVD_DRIVES = 5;

	/**
	 * The feature id for the '<em><b>Screens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__SCREENS = 6;

	/**
	 * The feature id for the '<em><b>Mouse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__MOUSE = 7;

	/**
	 * The feature id for the '<em><b>Keyboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__KEYBOARD = 8;

	/**
	 * The feature id for the '<em><b>Printer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__PRINTER = 9;

	/**
	 * The feature id for the '<em><b>Power Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__POWER_SUPPLY = 10;

	/**
	 * The number of structural features of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Total Power Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER___TOTAL_POWER_USAGE = 0;

	/**
	 * The number of operations of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link computer.impl.MotherboardImpl <em>Motherboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see computer.impl.MotherboardImpl
	 * @see computer.impl.ComputerPackageImpl#getMotherboard()
	 * @generated
	 */
	int MOTHERBOARD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>CPU socket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD__CPU_SOCKET = 1;

	/**
	 * The feature id for the '<em><b>Has Onboard GPU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD__HAS_ONBOARD_GPU = 2;

	/**
	 * The feature id for the '<em><b>Num PS2 Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD__NUM_PS2_PORTS = 3;

	/**
	 * The feature id for the '<em><b>Num USB Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD__NUM_USB_PORTS = 4;

	/**
	 * The feature id for the '<em><b>Power consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD__POWER_CONSUMPTION = 5;

	/**
	 * The feature id for the '<em><b>Computer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD__COMPUTER = 6;

	/**
	 * The number of structural features of the '<em>Motherboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Motherboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHERBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link computer.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see computer.impl.ProcessorImpl
	 * @see computer.impl.ComputerPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>CPU socket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CPU_SOCKET = 1;

	/**
	 * The feature id for the '<em><b>Num Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NUM_CORES = 2;

	/**
	 * The feature id for the '<em><b>Clock Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CLOCK_SPEED = 3;

	/**
	 * The feature id for the '<em><b>Power consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__POWER_CONSUMPTION = 4;

	/**
	 * The feature id for the '<em><b>Computer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__COMPUTER = 5;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link computer.impl.GraphicsCardImpl <em>Graphics Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see computer.impl.GraphicsCardImpl
	 * @see computer.impl.ComputerPackageImpl#getGraphicsCard()
	 * @generated
	 */
	int GRAPHICS_CARD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Memory size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CARD__MEMORY_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Core clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CARD__CORE_CLOCK = 2;

	/**
	 * The feature id for the '<em><b>Memory clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CARD__MEMORY_CLOCK = 3;

	/**
	 * The feature id for the '<em><b>Power consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CARD__POWER_CONSUMPTION = 4;

	/**
	 * The number of structural features of the '<em>Graphics Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CARD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Graphics Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link computer.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see computer.impl.MemoryImpl
	 * @see computer.impl.ComputerPackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Memory size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MEMORY_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Memory clock speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MEMORY_CLOCK_SPEED = 2;

	/**
	 * The feature id for the '<em><b>Power consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__POWER_CONSUMPTION = 3;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link computer.impl.HardDiskImpl <em>Hard Disk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see computer.impl.HardDiskImpl
	 * @see computer.impl.ComputerPackageImpl#getHardDisk()
	 * @generated
	 */
	int HARD_DISK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_DISK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is SSD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_DISK__IS_SSD = 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_DISK__CAPACITY = 2;

	/**
	 * The feature id for the '<em><b>Read speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_DISK__READ_SPEED = 3;

	/**
	 * The feature id for the '<em><b>Write speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_DISK__WRITE_SPEED = 4;

	/**
	 * The feature id for the '<em><b>Power consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_DISK__POWER_CONSUMPTION = 5;

	/**
	 * The number of structural features of the '<em>Hard Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_DISK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Hard Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_DISK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link computer.impl.CDDVDDriveImpl <em>CDDVD Drive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see computer.impl.CDDVDDriveImpl
	 * @see computer.impl.ComputerPackageImpl#getCDDVDDrive()
	 * @generated
	 */
	int CDDVD_DRIVE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDDVD_DRIVE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDDVD_DRIVE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Power consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDDVD_DRIVE__POWER_CONSUMPTION = 2;

	/**
	 * The number of structural features of the '<em>CDDVD Drive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDDVD_DRIVE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>CDDVD Drive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDDVD_DRIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link computer.impl.PowerSupplyImpl <em>Power Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see computer.impl.PowerSupplyImpl
	 * @see computer.impl.ComputerPackageImpl#getPowerSupply()
	 * @generated
	 */
	int POWER_SUPPLY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Power consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__POWER_CONSUMPTION = 2;

	/**
	 * The feature id for the '<em><b>Computer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__COMPUTER = 3;

	/**
	 * The number of structural features of the '<em>Power Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Power Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link computer.impl.ScreenImpl <em>Screen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see computer.impl.ScreenImpl
	 * @see computer.impl.ComputerPackageImpl#getScreen()
	 * @generated
	 */
	int SCREEN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Max res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__MAX_RES = 1;

	/**
	 * The feature id for the '<em><b>Response time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__RESPONSE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Max freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__MAX_FREQ = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__WIDTH = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Power consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__POWER_CONSUMPTION = 7;

	/**
	 * The number of structural features of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link computer.impl.MouseImpl <em>Mouse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see computer.impl.MouseImpl
	 * @see computer.impl.ComputerPackageImpl#getMouse()
	 * @generated
	 */
	int MOUSE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Num USB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__NUM_USB = 1;

	/**
	 * The feature id for the '<em><b>Num PS2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__NUM_PS2 = 2;

	/**
	 * The feature id for the '<em><b>Dpi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__DPI = 3;

	/**
	 * The feature id for the '<em><b>Power consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE__POWER_CONSUMPTION = 4;

	/**
	 * The number of structural features of the '<em>Mouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link computer.impl.KeyboardImpl <em>Keyboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see computer.impl.KeyboardImpl
	 * @see computer.impl.ComputerPackageImpl#getKeyboard()
	 * @generated
	 */
	int KEYBOARD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Num USB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__NUM_USB = 1;

	/**
	 * The feature id for the '<em><b>Num PS2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__NUM_PS2 = 2;

	/**
	 * The feature id for the '<em><b>Switch type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__SWITCH_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Connection type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__CONNECTION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Power consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD__POWER_CONSUMPTION = 5;

	/**
	 * The number of structural features of the '<em>Keyboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Keyboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link computer.impl.PrinterImpl <em>Printer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see computer.impl.PrinterImpl
	 * @see computer.impl.ComputerPackageImpl#getPrinter()
	 * @generated
	 */
	int PRINTER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Num USB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__NUM_USB = 1;

	/**
	 * The feature id for the '<em><b>Num PS2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__NUM_PS2 = 2;

	/**
	 * The feature id for the '<em><b>Connection type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__CONNECTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Power consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__POWER_CONSUMPTION = 4;

	/**
	 * The number of structural features of the '<em>Printer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Printer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link computer.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer</em>'.
	 * @see computer.Computer
	 * @generated
	 */
	EClass getComputer();

	/**
	 * Returns the meta object for the containment reference '{@link computer.Computer#getMotherboard <em>Motherboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Motherboard</em>'.
	 * @see computer.Computer#getMotherboard()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Motherboard();

	/**
	 * Returns the meta object for the containment reference '{@link computer.Computer#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor</em>'.
	 * @see computer.Computer#getProcessor()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Processor();

	/**
	 * Returns the meta object for the containment reference list '{@link computer.Computer#getGraphicsCards <em>Graphics Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graphics Cards</em>'.
	 * @see computer.Computer#getGraphicsCards()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_GraphicsCards();

	/**
	 * Returns the meta object for the containment reference list '{@link computer.Computer#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory</em>'.
	 * @see computer.Computer#getMemory()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Memory();

	/**
	 * Returns the meta object for the containment reference list '{@link computer.Computer#getHardDisks <em>Hard Disks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hard Disks</em>'.
	 * @see computer.Computer#getHardDisks()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_HardDisks();

	/**
	 * Returns the meta object for the containment reference list '{@link computer.Computer#getCdDvdDrives <em>Cd Dvd Drives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd Dvd Drives</em>'.
	 * @see computer.Computer#getCdDvdDrives()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_CdDvdDrives();

	/**
	 * Returns the meta object for the containment reference list '{@link computer.Computer#getScreens <em>Screens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Screens</em>'.
	 * @see computer.Computer#getScreens()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Screens();

	/**
	 * Returns the meta object for the containment reference '{@link computer.Computer#getMouse <em>Mouse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mouse</em>'.
	 * @see computer.Computer#getMouse()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Mouse();

	/**
	 * Returns the meta object for the containment reference '{@link computer.Computer#getKeyboard <em>Keyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keyboard</em>'.
	 * @see computer.Computer#getKeyboard()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Keyboard();

	/**
	 * Returns the meta object for the containment reference '{@link computer.Computer#getPrinter <em>Printer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Printer</em>'.
	 * @see computer.Computer#getPrinter()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Printer();

	/**
	 * Returns the meta object for the containment reference '{@link computer.Computer#getPowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Power Supply</em>'.
	 * @see computer.Computer#getPowerSupply()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_PowerSupply();

	/**
	 * Returns the meta object for the '{@link computer.Computer#totalPowerUsage() <em>Total Power Usage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Total Power Usage</em>' operation.
	 * @see computer.Computer#totalPowerUsage()
	 * @generated
	 */
	EOperation getComputer__TotalPowerUsage();

	/**
	 * Returns the meta object for class '{@link computer.Motherboard <em>Motherboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motherboard</em>'.
	 * @see computer.Motherboard
	 * @generated
	 */
	EClass getMotherboard();

	/**
	 * Returns the meta object for the attribute '{@link computer.Motherboard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see computer.Motherboard#getName()
	 * @see #getMotherboard()
	 * @generated
	 */
	EAttribute getMotherboard_Name();

	/**
	 * Returns the meta object for the attribute '{@link computer.Motherboard#getCPU_socket <em>CPU socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPU socket</em>'.
	 * @see computer.Motherboard#getCPU_socket()
	 * @see #getMotherboard()
	 * @generated
	 */
	EAttribute getMotherboard_CPU_socket();

	/**
	 * Returns the meta object for the attribute '{@link computer.Motherboard#isHasOnboardGPU <em>Has Onboard GPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Onboard GPU</em>'.
	 * @see computer.Motherboard#isHasOnboardGPU()
	 * @see #getMotherboard()
	 * @generated
	 */
	EAttribute getMotherboard_HasOnboardGPU();

	/**
	 * Returns the meta object for the attribute '{@link computer.Motherboard#getNumPS2Ports <em>Num PS2 Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num PS2 Ports</em>'.
	 * @see computer.Motherboard#getNumPS2Ports()
	 * @see #getMotherboard()
	 * @generated
	 */
	EAttribute getMotherboard_NumPS2Ports();

	/**
	 * Returns the meta object for the attribute '{@link computer.Motherboard#getNumUSBPorts <em>Num USB Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num USB Ports</em>'.
	 * @see computer.Motherboard#getNumUSBPorts()
	 * @see #getMotherboard()
	 * @generated
	 */
	EAttribute getMotherboard_NumUSBPorts();

	/**
	 * Returns the meta object for the attribute '{@link computer.Motherboard#getPower_consumption <em>Power consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power consumption</em>'.
	 * @see computer.Motherboard#getPower_consumption()
	 * @see #getMotherboard()
	 * @generated
	 */
	EAttribute getMotherboard_Power_consumption();

	/**
	 * Returns the meta object for the container reference '{@link computer.Motherboard#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Computer</em>'.
	 * @see computer.Motherboard#getComputer()
	 * @see #getMotherboard()
	 * @generated
	 */
	EReference getMotherboard_Computer();

	/**
	 * Returns the meta object for class '{@link computer.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see computer.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link computer.Processor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see computer.Processor#getName()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Name();

	/**
	 * Returns the meta object for the attribute '{@link computer.Processor#getCPU_socket <em>CPU socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPU socket</em>'.
	 * @see computer.Processor#getCPU_socket()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_CPU_socket();

	/**
	 * Returns the meta object for the attribute '{@link computer.Processor#getNumCores <em>Num Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cores</em>'.
	 * @see computer.Processor#getNumCores()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_NumCores();

	/**
	 * Returns the meta object for the attribute '{@link computer.Processor#getClockSpeed <em>Clock Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Speed</em>'.
	 * @see computer.Processor#getClockSpeed()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_ClockSpeed();

	/**
	 * Returns the meta object for the attribute '{@link computer.Processor#getPower_consumption <em>Power consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power consumption</em>'.
	 * @see computer.Processor#getPower_consumption()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Power_consumption();

	/**
	 * Returns the meta object for the container reference '{@link computer.Processor#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Computer</em>'.
	 * @see computer.Processor#getComputer()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Computer();

	/**
	 * Returns the meta object for class '{@link computer.GraphicsCard <em>Graphics Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphics Card</em>'.
	 * @see computer.GraphicsCard
	 * @generated
	 */
	EClass getGraphicsCard();

	/**
	 * Returns the meta object for the attribute '{@link computer.GraphicsCard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see computer.GraphicsCard#getName()
	 * @see #getGraphicsCard()
	 * @generated
	 */
	EAttribute getGraphicsCard_Name();

	/**
	 * Returns the meta object for the attribute '{@link computer.GraphicsCard#getMemory_size <em>Memory size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory size</em>'.
	 * @see computer.GraphicsCard#getMemory_size()
	 * @see #getGraphicsCard()
	 * @generated
	 */
	EAttribute getGraphicsCard_Memory_size();

	/**
	 * Returns the meta object for the attribute '{@link computer.GraphicsCard#getCore_clock <em>Core clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core clock</em>'.
	 * @see computer.GraphicsCard#getCore_clock()
	 * @see #getGraphicsCard()
	 * @generated
	 */
	EAttribute getGraphicsCard_Core_clock();

	/**
	 * Returns the meta object for the attribute '{@link computer.GraphicsCard#getMemory_clock <em>Memory clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory clock</em>'.
	 * @see computer.GraphicsCard#getMemory_clock()
	 * @see #getGraphicsCard()
	 * @generated
	 */
	EAttribute getGraphicsCard_Memory_clock();

	/**
	 * Returns the meta object for the attribute '{@link computer.GraphicsCard#getPower_consumption <em>Power consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power consumption</em>'.
	 * @see computer.GraphicsCard#getPower_consumption()
	 * @see #getGraphicsCard()
	 * @generated
	 */
	EAttribute getGraphicsCard_Power_consumption();

	/**
	 * Returns the meta object for class '{@link computer.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see computer.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the attribute '{@link computer.Memory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see computer.Memory#getName()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Name();

	/**
	 * Returns the meta object for the attribute '{@link computer.Memory#getMemory_size <em>Memory size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory size</em>'.
	 * @see computer.Memory#getMemory_size()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Memory_size();

	/**
	 * Returns the meta object for the attribute '{@link computer.Memory#getMemory_clock_speed <em>Memory clock speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory clock speed</em>'.
	 * @see computer.Memory#getMemory_clock_speed()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Memory_clock_speed();

	/**
	 * Returns the meta object for the attribute '{@link computer.Memory#getPower_consumption <em>Power consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power consumption</em>'.
	 * @see computer.Memory#getPower_consumption()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Power_consumption();

	/**
	 * Returns the meta object for class '{@link computer.HardDisk <em>Hard Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hard Disk</em>'.
	 * @see computer.HardDisk
	 * @generated
	 */
	EClass getHardDisk();

	/**
	 * Returns the meta object for the attribute '{@link computer.HardDisk#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see computer.HardDisk#getName()
	 * @see #getHardDisk()
	 * @generated
	 */
	EAttribute getHardDisk_Name();

	/**
	 * Returns the meta object for the attribute '{@link computer.HardDisk#isIsSSD <em>Is SSD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is SSD</em>'.
	 * @see computer.HardDisk#isIsSSD()
	 * @see #getHardDisk()
	 * @generated
	 */
	EAttribute getHardDisk_IsSSD();

	/**
	 * Returns the meta object for the attribute '{@link computer.HardDisk#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see computer.HardDisk#getCapacity()
	 * @see #getHardDisk()
	 * @generated
	 */
	EAttribute getHardDisk_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link computer.HardDisk#getRead_speed <em>Read speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read speed</em>'.
	 * @see computer.HardDisk#getRead_speed()
	 * @see #getHardDisk()
	 * @generated
	 */
	EAttribute getHardDisk_Read_speed();

	/**
	 * Returns the meta object for the attribute '{@link computer.HardDisk#getWrite_speed <em>Write speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write speed</em>'.
	 * @see computer.HardDisk#getWrite_speed()
	 * @see #getHardDisk()
	 * @generated
	 */
	EAttribute getHardDisk_Write_speed();

	/**
	 * Returns the meta object for the attribute '{@link computer.HardDisk#getPower_consumption <em>Power consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power consumption</em>'.
	 * @see computer.HardDisk#getPower_consumption()
	 * @see #getHardDisk()
	 * @generated
	 */
	EAttribute getHardDisk_Power_consumption();

	/**
	 * Returns the meta object for class '{@link computer.CDDVDDrive <em>CDDVD Drive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDDVD Drive</em>'.
	 * @see computer.CDDVDDrive
	 * @generated
	 */
	EClass getCDDVDDrive();

	/**
	 * Returns the meta object for the attribute '{@link computer.CDDVDDrive#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see computer.CDDVDDrive#getName()
	 * @see #getCDDVDDrive()
	 * @generated
	 */
	EAttribute getCDDVDDrive_Name();

	/**
	 * Returns the meta object for the attribute '{@link computer.CDDVDDrive#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see computer.CDDVDDrive#getType()
	 * @see #getCDDVDDrive()
	 * @generated
	 */
	EAttribute getCDDVDDrive_Type();

	/**
	 * Returns the meta object for the attribute '{@link computer.CDDVDDrive#getPower_consumption <em>Power consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power consumption</em>'.
	 * @see computer.CDDVDDrive#getPower_consumption()
	 * @see #getCDDVDDrive()
	 * @generated
	 */
	EAttribute getCDDVDDrive_Power_consumption();

	/**
	 * Returns the meta object for class '{@link computer.PowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Supply</em>'.
	 * @see computer.PowerSupply
	 * @generated
	 */
	EClass getPowerSupply();

	/**
	 * Returns the meta object for the attribute '{@link computer.PowerSupply#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see computer.PowerSupply#getName()
	 * @see #getPowerSupply()
	 * @generated
	 */
	EAttribute getPowerSupply_Name();

	/**
	 * Returns the meta object for the attribute '{@link computer.PowerSupply#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see computer.PowerSupply#getCapacity()
	 * @see #getPowerSupply()
	 * @generated
	 */
	EAttribute getPowerSupply_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link computer.PowerSupply#getPower_consumption <em>Power consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power consumption</em>'.
	 * @see computer.PowerSupply#getPower_consumption()
	 * @see #getPowerSupply()
	 * @generated
	 */
	EAttribute getPowerSupply_Power_consumption();

	/**
	 * Returns the meta object for the container reference '{@link computer.PowerSupply#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Computer</em>'.
	 * @see computer.PowerSupply#getComputer()
	 * @see #getPowerSupply()
	 * @generated
	 */
	EReference getPowerSupply_Computer();

	/**
	 * Returns the meta object for class '{@link computer.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen</em>'.
	 * @see computer.Screen
	 * @generated
	 */
	EClass getScreen();

	/**
	 * Returns the meta object for the attribute '{@link computer.Screen#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see computer.Screen#getName()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Name();

	/**
	 * Returns the meta object for the attribute '{@link computer.Screen#getMax_res <em>Max res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max res</em>'.
	 * @see computer.Screen#getMax_res()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Max_res();

	/**
	 * Returns the meta object for the attribute '{@link computer.Screen#getResponse_time <em>Response time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response time</em>'.
	 * @see computer.Screen#getResponse_time()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Response_time();

	/**
	 * Returns the meta object for the attribute '{@link computer.Screen#getMax_freq <em>Max freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max freq</em>'.
	 * @see computer.Screen#getMax_freq()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Max_freq();

	/**
	 * Returns the meta object for the attribute '{@link computer.Screen#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see computer.Screen#getLength()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Length();

	/**
	 * Returns the meta object for the attribute '{@link computer.Screen#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see computer.Screen#getWidth()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Width();

	/**
	 * Returns the meta object for the attribute '{@link computer.Screen#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see computer.Screen#getHeight()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Height();

	/**
	 * Returns the meta object for the attribute '{@link computer.Screen#getPower_consumption <em>Power consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power consumption</em>'.
	 * @see computer.Screen#getPower_consumption()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Power_consumption();

	/**
	 * Returns the meta object for class '{@link computer.Mouse <em>Mouse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouse</em>'.
	 * @see computer.Mouse
	 * @generated
	 */
	EClass getMouse();

	/**
	 * Returns the meta object for the attribute '{@link computer.Mouse#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see computer.Mouse#getName()
	 * @see #getMouse()
	 * @generated
	 */
	EAttribute getMouse_Name();

	/**
	 * Returns the meta object for the attribute '{@link computer.Mouse#getNumUSB <em>Num USB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num USB</em>'.
	 * @see computer.Mouse#getNumUSB()
	 * @see #getMouse()
	 * @generated
	 */
	EAttribute getMouse_NumUSB();

	/**
	 * Returns the meta object for the attribute '{@link computer.Mouse#getNumPS2 <em>Num PS2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num PS2</em>'.
	 * @see computer.Mouse#getNumPS2()
	 * @see #getMouse()
	 * @generated
	 */
	EAttribute getMouse_NumPS2();

	/**
	 * Returns the meta object for the attribute '{@link computer.Mouse#getDpi <em>Dpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dpi</em>'.
	 * @see computer.Mouse#getDpi()
	 * @see #getMouse()
	 * @generated
	 */
	EAttribute getMouse_Dpi();

	/**
	 * Returns the meta object for the attribute '{@link computer.Mouse#getPower_consumption <em>Power consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power consumption</em>'.
	 * @see computer.Mouse#getPower_consumption()
	 * @see #getMouse()
	 * @generated
	 */
	EAttribute getMouse_Power_consumption();

	/**
	 * Returns the meta object for class '{@link computer.Keyboard <em>Keyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyboard</em>'.
	 * @see computer.Keyboard
	 * @generated
	 */
	EClass getKeyboard();

	/**
	 * Returns the meta object for the attribute '{@link computer.Keyboard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see computer.Keyboard#getName()
	 * @see #getKeyboard()
	 * @generated
	 */
	EAttribute getKeyboard_Name();

	/**
	 * Returns the meta object for the attribute '{@link computer.Keyboard#getNumUSB <em>Num USB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num USB</em>'.
	 * @see computer.Keyboard#getNumUSB()
	 * @see #getKeyboard()
	 * @generated
	 */
	EAttribute getKeyboard_NumUSB();

	/**
	 * Returns the meta object for the attribute '{@link computer.Keyboard#getNumPS2 <em>Num PS2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num PS2</em>'.
	 * @see computer.Keyboard#getNumPS2()
	 * @see #getKeyboard()
	 * @generated
	 */
	EAttribute getKeyboard_NumPS2();

	/**
	 * Returns the meta object for the attribute '{@link computer.Keyboard#getSwitch_type <em>Switch type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch type</em>'.
	 * @see computer.Keyboard#getSwitch_type()
	 * @see #getKeyboard()
	 * @generated
	 */
	EAttribute getKeyboard_Switch_type();

	/**
	 * Returns the meta object for the attribute '{@link computer.Keyboard#getConnection_type <em>Connection type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection type</em>'.
	 * @see computer.Keyboard#getConnection_type()
	 * @see #getKeyboard()
	 * @generated
	 */
	EAttribute getKeyboard_Connection_type();

	/**
	 * Returns the meta object for the attribute '{@link computer.Keyboard#getPower_consumption <em>Power consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power consumption</em>'.
	 * @see computer.Keyboard#getPower_consumption()
	 * @see #getKeyboard()
	 * @generated
	 */
	EAttribute getKeyboard_Power_consumption();

	/**
	 * Returns the meta object for class '{@link computer.Printer <em>Printer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printer</em>'.
	 * @see computer.Printer
	 * @generated
	 */
	EClass getPrinter();

	/**
	 * Returns the meta object for the attribute '{@link computer.Printer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see computer.Printer#getName()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_Name();

	/**
	 * Returns the meta object for the attribute '{@link computer.Printer#getNumUSB <em>Num USB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num USB</em>'.
	 * @see computer.Printer#getNumUSB()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_NumUSB();

	/**
	 * Returns the meta object for the attribute '{@link computer.Printer#getNumPS2 <em>Num PS2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num PS2</em>'.
	 * @see computer.Printer#getNumPS2()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_NumPS2();

	/**
	 * Returns the meta object for the attribute '{@link computer.Printer#getConnection_type <em>Connection type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection type</em>'.
	 * @see computer.Printer#getConnection_type()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_Connection_type();

	/**
	 * Returns the meta object for the attribute '{@link computer.Printer#getPower_consumption <em>Power consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power consumption</em>'.
	 * @see computer.Printer#getPower_consumption()
	 * @see #getPrinter()
	 * @generated
	 */
	EAttribute getPrinter_Power_consumption();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComputerFactory getComputerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link computer.impl.ComputerImpl <em>Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see computer.impl.ComputerImpl
		 * @see computer.impl.ComputerPackageImpl#getComputer()
		 * @generated
		 */
		EClass COMPUTER = eINSTANCE.getComputer();

		/**
		 * The meta object literal for the '<em><b>Motherboard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__MOTHERBOARD = eINSTANCE.getComputer_Motherboard();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__PROCESSOR = eINSTANCE.getComputer_Processor();

		/**
		 * The meta object literal for the '<em><b>Graphics Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__GRAPHICS_CARDS = eINSTANCE.getComputer_GraphicsCards();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__MEMORY = eINSTANCE.getComputer_Memory();

		/**
		 * The meta object literal for the '<em><b>Hard Disks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__HARD_DISKS = eINSTANCE.getComputer_HardDisks();

		/**
		 * The meta object literal for the '<em><b>Cd Dvd Drives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__CD_DVD_DRIVES = eINSTANCE.getComputer_CdDvdDrives();

		/**
		 * The meta object literal for the '<em><b>Screens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__SCREENS = eINSTANCE.getComputer_Screens();

		/**
		 * The meta object literal for the '<em><b>Mouse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__MOUSE = eINSTANCE.getComputer_Mouse();

		/**
		 * The meta object literal for the '<em><b>Keyboard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__KEYBOARD = eINSTANCE.getComputer_Keyboard();

		/**
		 * The meta object literal for the '<em><b>Printer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__PRINTER = eINSTANCE.getComputer_Printer();

		/**
		 * The meta object literal for the '<em><b>Power Supply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__POWER_SUPPLY = eINSTANCE.getComputer_PowerSupply();

		/**
		 * The meta object literal for the '<em><b>Total Power Usage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTER___TOTAL_POWER_USAGE = eINSTANCE.getComputer__TotalPowerUsage();

		/**
		 * The meta object literal for the '{@link computer.impl.MotherboardImpl <em>Motherboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see computer.impl.MotherboardImpl
		 * @see computer.impl.ComputerPackageImpl#getMotherboard()
		 * @generated
		 */
		EClass MOTHERBOARD = eINSTANCE.getMotherboard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTHERBOARD__NAME = eINSTANCE.getMotherboard_Name();

		/**
		 * The meta object literal for the '<em><b>CPU socket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTHERBOARD__CPU_SOCKET = eINSTANCE.getMotherboard_CPU_socket();

		/**
		 * The meta object literal for the '<em><b>Has Onboard GPU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTHERBOARD__HAS_ONBOARD_GPU = eINSTANCE.getMotherboard_HasOnboardGPU();

		/**
		 * The meta object literal for the '<em><b>Num PS2 Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTHERBOARD__NUM_PS2_PORTS = eINSTANCE.getMotherboard_NumPS2Ports();

		/**
		 * The meta object literal for the '<em><b>Num USB Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTHERBOARD__NUM_USB_PORTS = eINSTANCE.getMotherboard_NumUSBPorts();

		/**
		 * The meta object literal for the '<em><b>Power consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTHERBOARD__POWER_CONSUMPTION = eINSTANCE.getMotherboard_Power_consumption();

		/**
		 * The meta object literal for the '<em><b>Computer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTHERBOARD__COMPUTER = eINSTANCE.getMotherboard_Computer();

		/**
		 * The meta object literal for the '{@link computer.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see computer.impl.ProcessorImpl
		 * @see computer.impl.ComputerPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NAME = eINSTANCE.getProcessor_Name();

		/**
		 * The meta object literal for the '<em><b>CPU socket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__CPU_SOCKET = eINSTANCE.getProcessor_CPU_socket();

		/**
		 * The meta object literal for the '<em><b>Num Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NUM_CORES = eINSTANCE.getProcessor_NumCores();

		/**
		 * The meta object literal for the '<em><b>Clock Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__CLOCK_SPEED = eINSTANCE.getProcessor_ClockSpeed();

		/**
		 * The meta object literal for the '<em><b>Power consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__POWER_CONSUMPTION = eINSTANCE.getProcessor_Power_consumption();

		/**
		 * The meta object literal for the '<em><b>Computer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__COMPUTER = eINSTANCE.getProcessor_Computer();

		/**
		 * The meta object literal for the '{@link computer.impl.GraphicsCardImpl <em>Graphics Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see computer.impl.GraphicsCardImpl
		 * @see computer.impl.ComputerPackageImpl#getGraphicsCard()
		 * @generated
		 */
		EClass GRAPHICS_CARD = eINSTANCE.getGraphicsCard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICS_CARD__NAME = eINSTANCE.getGraphicsCard_Name();

		/**
		 * The meta object literal for the '<em><b>Memory size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICS_CARD__MEMORY_SIZE = eINSTANCE.getGraphicsCard_Memory_size();

		/**
		 * The meta object literal for the '<em><b>Core clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICS_CARD__CORE_CLOCK = eINSTANCE.getGraphicsCard_Core_clock();

		/**
		 * The meta object literal for the '<em><b>Memory clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICS_CARD__MEMORY_CLOCK = eINSTANCE.getGraphicsCard_Memory_clock();

		/**
		 * The meta object literal for the '<em><b>Power consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICS_CARD__POWER_CONSUMPTION = eINSTANCE.getGraphicsCard_Power_consumption();

		/**
		 * The meta object literal for the '{@link computer.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see computer.impl.MemoryImpl
		 * @see computer.impl.ComputerPackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__NAME = eINSTANCE.getMemory_Name();

		/**
		 * The meta object literal for the '<em><b>Memory size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__MEMORY_SIZE = eINSTANCE.getMemory_Memory_size();

		/**
		 * The meta object literal for the '<em><b>Memory clock speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__MEMORY_CLOCK_SPEED = eINSTANCE.getMemory_Memory_clock_speed();

		/**
		 * The meta object literal for the '<em><b>Power consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__POWER_CONSUMPTION = eINSTANCE.getMemory_Power_consumption();

		/**
		 * The meta object literal for the '{@link computer.impl.HardDiskImpl <em>Hard Disk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see computer.impl.HardDiskImpl
		 * @see computer.impl.ComputerPackageImpl#getHardDisk()
		 * @generated
		 */
		EClass HARD_DISK = eINSTANCE.getHardDisk();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARD_DISK__NAME = eINSTANCE.getHardDisk_Name();

		/**
		 * The meta object literal for the '<em><b>Is SSD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARD_DISK__IS_SSD = eINSTANCE.getHardDisk_IsSSD();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARD_DISK__CAPACITY = eINSTANCE.getHardDisk_Capacity();

		/**
		 * The meta object literal for the '<em><b>Read speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARD_DISK__READ_SPEED = eINSTANCE.getHardDisk_Read_speed();

		/**
		 * The meta object literal for the '<em><b>Write speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARD_DISK__WRITE_SPEED = eINSTANCE.getHardDisk_Write_speed();

		/**
		 * The meta object literal for the '<em><b>Power consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARD_DISK__POWER_CONSUMPTION = eINSTANCE.getHardDisk_Power_consumption();

		/**
		 * The meta object literal for the '{@link computer.impl.CDDVDDriveImpl <em>CDDVD Drive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see computer.impl.CDDVDDriveImpl
		 * @see computer.impl.ComputerPackageImpl#getCDDVDDrive()
		 * @generated
		 */
		EClass CDDVD_DRIVE = eINSTANCE.getCDDVDDrive();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDDVD_DRIVE__NAME = eINSTANCE.getCDDVDDrive_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDDVD_DRIVE__TYPE = eINSTANCE.getCDDVDDrive_Type();

		/**
		 * The meta object literal for the '<em><b>Power consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDDVD_DRIVE__POWER_CONSUMPTION = eINSTANCE.getCDDVDDrive_Power_consumption();

		/**
		 * The meta object literal for the '{@link computer.impl.PowerSupplyImpl <em>Power Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see computer.impl.PowerSupplyImpl
		 * @see computer.impl.ComputerPackageImpl#getPowerSupply()
		 * @generated
		 */
		EClass POWER_SUPPLY = eINSTANCE.getPowerSupply();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_SUPPLY__NAME = eINSTANCE.getPowerSupply_Name();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_SUPPLY__CAPACITY = eINSTANCE.getPowerSupply_Capacity();

		/**
		 * The meta object literal for the '<em><b>Power consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_SUPPLY__POWER_CONSUMPTION = eINSTANCE.getPowerSupply_Power_consumption();

		/**
		 * The meta object literal for the '<em><b>Computer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SUPPLY__COMPUTER = eINSTANCE.getPowerSupply_Computer();

		/**
		 * The meta object literal for the '{@link computer.impl.ScreenImpl <em>Screen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see computer.impl.ScreenImpl
		 * @see computer.impl.ComputerPackageImpl#getScreen()
		 * @generated
		 */
		EClass SCREEN = eINSTANCE.getScreen();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__NAME = eINSTANCE.getScreen_Name();

		/**
		 * The meta object literal for the '<em><b>Max res</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__MAX_RES = eINSTANCE.getScreen_Max_res();

		/**
		 * The meta object literal for the '<em><b>Response time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__RESPONSE_TIME = eINSTANCE.getScreen_Response_time();

		/**
		 * The meta object literal for the '<em><b>Max freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__MAX_FREQ = eINSTANCE.getScreen_Max_freq();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__LENGTH = eINSTANCE.getScreen_Length();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__WIDTH = eINSTANCE.getScreen_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__HEIGHT = eINSTANCE.getScreen_Height();

		/**
		 * The meta object literal for the '<em><b>Power consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__POWER_CONSUMPTION = eINSTANCE.getScreen_Power_consumption();

		/**
		 * The meta object literal for the '{@link computer.impl.MouseImpl <em>Mouse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see computer.impl.MouseImpl
		 * @see computer.impl.ComputerPackageImpl#getMouse()
		 * @generated
		 */
		EClass MOUSE = eINSTANCE.getMouse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOUSE__NAME = eINSTANCE.getMouse_Name();

		/**
		 * The meta object literal for the '<em><b>Num USB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOUSE__NUM_USB = eINSTANCE.getMouse_NumUSB();

		/**
		 * The meta object literal for the '<em><b>Num PS2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOUSE__NUM_PS2 = eINSTANCE.getMouse_NumPS2();

		/**
		 * The meta object literal for the '<em><b>Dpi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOUSE__DPI = eINSTANCE.getMouse_Dpi();

		/**
		 * The meta object literal for the '<em><b>Power consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOUSE__POWER_CONSUMPTION = eINSTANCE.getMouse_Power_consumption();

		/**
		 * The meta object literal for the '{@link computer.impl.KeyboardImpl <em>Keyboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see computer.impl.KeyboardImpl
		 * @see computer.impl.ComputerPackageImpl#getKeyboard()
		 * @generated
		 */
		EClass KEYBOARD = eINSTANCE.getKeyboard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD__NAME = eINSTANCE.getKeyboard_Name();

		/**
		 * The meta object literal for the '<em><b>Num USB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD__NUM_USB = eINSTANCE.getKeyboard_NumUSB();

		/**
		 * The meta object literal for the '<em><b>Num PS2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD__NUM_PS2 = eINSTANCE.getKeyboard_NumPS2();

		/**
		 * The meta object literal for the '<em><b>Switch type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD__SWITCH_TYPE = eINSTANCE.getKeyboard_Switch_type();

		/**
		 * The meta object literal for the '<em><b>Connection type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD__CONNECTION_TYPE = eINSTANCE.getKeyboard_Connection_type();

		/**
		 * The meta object literal for the '<em><b>Power consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYBOARD__POWER_CONSUMPTION = eINSTANCE.getKeyboard_Power_consumption();

		/**
		 * The meta object literal for the '{@link computer.impl.PrinterImpl <em>Printer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see computer.impl.PrinterImpl
		 * @see computer.impl.ComputerPackageImpl#getPrinter()
		 * @generated
		 */
		EClass PRINTER = eINSTANCE.getPrinter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__NAME = eINSTANCE.getPrinter_Name();

		/**
		 * The meta object literal for the '<em><b>Num USB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__NUM_USB = eINSTANCE.getPrinter_NumUSB();

		/**
		 * The meta object literal for the '<em><b>Num PS2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__NUM_PS2 = eINSTANCE.getPrinter_NumPS2();

		/**
		 * The meta object literal for the '<em><b>Connection type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__CONNECTION_TYPE = eINSTANCE.getPrinter_Connection_type();

		/**
		 * The meta object literal for the '<em><b>Power consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINTER__POWER_CONSUMPTION = eINSTANCE.getPrinter_Power_consumption();

	}

} //ComputerPackage
