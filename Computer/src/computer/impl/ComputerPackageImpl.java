/**
 */
package computer.impl;

import computer.CDDVDDrive;
import computer.Computer;
import computer.ComputerFactory;
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

import computer.util.ComputerValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputerPackageImpl extends EPackageImpl implements ComputerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motherboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicsCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardDiskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cddvdDriveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mouseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see computer.ComputerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComputerPackageImpl() {
		super(eNS_URI, ComputerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ComputerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComputerPackage init() {
		if (isInited) return (ComputerPackage)EPackage.Registry.INSTANCE.getEPackage(ComputerPackage.eNS_URI);

		// Obtain or create and register package
		ComputerPackageImpl theComputerPackage = (ComputerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComputerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComputerPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theComputerPackage.createPackageContents();

		// Initialize created meta-data
		theComputerPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theComputerPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ComputerValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theComputerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComputerPackage.eNS_URI, theComputerPackage);
		return theComputerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputer() {
		return computerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Motherboard() {
		return (EReference)computerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Processor() {
		return (EReference)computerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_GraphicsCards() {
		return (EReference)computerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Memory() {
		return (EReference)computerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_HardDisks() {
		return (EReference)computerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_CdDvdDrives() {
		return (EReference)computerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Screens() {
		return (EReference)computerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Mouse() {
		return (EReference)computerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Keyboard() {
		return (EReference)computerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Printer() {
		return (EReference)computerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_PowerSupply() {
		return (EReference)computerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputer__TotalPowerUsage() {
		return computerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotherboard() {
		return motherboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotherboard_Name() {
		return (EAttribute)motherboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotherboard_CPU_socket() {
		return (EAttribute)motherboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotherboard_HasOnboardGPU() {
		return (EAttribute)motherboardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotherboard_NumPS2Ports() {
		return (EAttribute)motherboardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotherboard_NumUSBPorts() {
		return (EAttribute)motherboardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotherboard_Power_consumption() {
		return (EAttribute)motherboardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotherboard_Computer() {
		return (EReference)motherboardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Name() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_CPU_socket() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_NumCores() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_ClockSpeed() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Power_consumption() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_Computer() {
		return (EReference)processorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicsCard() {
		return graphicsCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicsCard_Name() {
		return (EAttribute)graphicsCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicsCard_Memory_size() {
		return (EAttribute)graphicsCardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicsCard_Core_clock() {
		return (EAttribute)graphicsCardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicsCard_Memory_clock() {
		return (EAttribute)graphicsCardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicsCard_Power_consumption() {
		return (EAttribute)graphicsCardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_Name() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_Memory_size() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_Memory_clock_speed() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_Power_consumption() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardDisk() {
		return hardDiskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardDisk_Name() {
		return (EAttribute)hardDiskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardDisk_IsSSD() {
		return (EAttribute)hardDiskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardDisk_Capacity() {
		return (EAttribute)hardDiskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardDisk_Read_speed() {
		return (EAttribute)hardDiskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardDisk_Write_speed() {
		return (EAttribute)hardDiskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardDisk_Power_consumption() {
		return (EAttribute)hardDiskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDDVDDrive() {
		return cddvdDriveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDDVDDrive_Name() {
		return (EAttribute)cddvdDriveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDDVDDrive_Type() {
		return (EAttribute)cddvdDriveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDDVDDrive_Power_consumption() {
		return (EAttribute)cddvdDriveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSupply() {
		return powerSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerSupply_Name() {
		return (EAttribute)powerSupplyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerSupply_Capacity() {
		return (EAttribute)powerSupplyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerSupply_Power_consumption() {
		return (EAttribute)powerSupplyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSupply_Computer() {
		return (EReference)powerSupplyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreen() {
		return screenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_Name() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_Max_res() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_Response_time() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_Max_freq() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_Length() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_Width() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_Height() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_Power_consumption() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMouse() {
		return mouseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMouse_Name() {
		return (EAttribute)mouseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMouse_NumUSB() {
		return (EAttribute)mouseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMouse_NumPS2() {
		return (EAttribute)mouseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMouse_Dpi() {
		return (EAttribute)mouseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMouse_Power_consumption() {
		return (EAttribute)mouseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyboard() {
		return keyboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboard_Name() {
		return (EAttribute)keyboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboard_NumUSB() {
		return (EAttribute)keyboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboard_NumPS2() {
		return (EAttribute)keyboardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboard_Switch_type() {
		return (EAttribute)keyboardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboard_Connection_type() {
		return (EAttribute)keyboardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyboard_Power_consumption() {
		return (EAttribute)keyboardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrinter() {
		return printerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_Name() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_NumUSB() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_NumPS2() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_Connection_type() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinter_Power_consumption() {
		return (EAttribute)printerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputerFactory getComputerFactory() {
		return (ComputerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		computerEClass = createEClass(COMPUTER);
		createEReference(computerEClass, COMPUTER__MOTHERBOARD);
		createEReference(computerEClass, COMPUTER__PROCESSOR);
		createEReference(computerEClass, COMPUTER__GRAPHICS_CARDS);
		createEReference(computerEClass, COMPUTER__MEMORY);
		createEReference(computerEClass, COMPUTER__HARD_DISKS);
		createEReference(computerEClass, COMPUTER__CD_DVD_DRIVES);
		createEReference(computerEClass, COMPUTER__SCREENS);
		createEReference(computerEClass, COMPUTER__MOUSE);
		createEReference(computerEClass, COMPUTER__KEYBOARD);
		createEReference(computerEClass, COMPUTER__PRINTER);
		createEReference(computerEClass, COMPUTER__POWER_SUPPLY);
		createEOperation(computerEClass, COMPUTER___TOTAL_POWER_USAGE);

		motherboardEClass = createEClass(MOTHERBOARD);
		createEAttribute(motherboardEClass, MOTHERBOARD__NAME);
		createEAttribute(motherboardEClass, MOTHERBOARD__CPU_SOCKET);
		createEAttribute(motherboardEClass, MOTHERBOARD__HAS_ONBOARD_GPU);
		createEAttribute(motherboardEClass, MOTHERBOARD__NUM_PS2_PORTS);
		createEAttribute(motherboardEClass, MOTHERBOARD__NUM_USB_PORTS);
		createEAttribute(motherboardEClass, MOTHERBOARD__POWER_CONSUMPTION);
		createEReference(motherboardEClass, MOTHERBOARD__COMPUTER);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__NAME);
		createEAttribute(processorEClass, PROCESSOR__CPU_SOCKET);
		createEAttribute(processorEClass, PROCESSOR__NUM_CORES);
		createEAttribute(processorEClass, PROCESSOR__CLOCK_SPEED);
		createEAttribute(processorEClass, PROCESSOR__POWER_CONSUMPTION);
		createEReference(processorEClass, PROCESSOR__COMPUTER);

		graphicsCardEClass = createEClass(GRAPHICS_CARD);
		createEAttribute(graphicsCardEClass, GRAPHICS_CARD__NAME);
		createEAttribute(graphicsCardEClass, GRAPHICS_CARD__MEMORY_SIZE);
		createEAttribute(graphicsCardEClass, GRAPHICS_CARD__CORE_CLOCK);
		createEAttribute(graphicsCardEClass, GRAPHICS_CARD__MEMORY_CLOCK);
		createEAttribute(graphicsCardEClass, GRAPHICS_CARD__POWER_CONSUMPTION);

		memoryEClass = createEClass(MEMORY);
		createEAttribute(memoryEClass, MEMORY__NAME);
		createEAttribute(memoryEClass, MEMORY__MEMORY_SIZE);
		createEAttribute(memoryEClass, MEMORY__MEMORY_CLOCK_SPEED);
		createEAttribute(memoryEClass, MEMORY__POWER_CONSUMPTION);

		hardDiskEClass = createEClass(HARD_DISK);
		createEAttribute(hardDiskEClass, HARD_DISK__NAME);
		createEAttribute(hardDiskEClass, HARD_DISK__IS_SSD);
		createEAttribute(hardDiskEClass, HARD_DISK__CAPACITY);
		createEAttribute(hardDiskEClass, HARD_DISK__READ_SPEED);
		createEAttribute(hardDiskEClass, HARD_DISK__WRITE_SPEED);
		createEAttribute(hardDiskEClass, HARD_DISK__POWER_CONSUMPTION);

		cddvdDriveEClass = createEClass(CDDVD_DRIVE);
		createEAttribute(cddvdDriveEClass, CDDVD_DRIVE__NAME);
		createEAttribute(cddvdDriveEClass, CDDVD_DRIVE__TYPE);
		createEAttribute(cddvdDriveEClass, CDDVD_DRIVE__POWER_CONSUMPTION);

		powerSupplyEClass = createEClass(POWER_SUPPLY);
		createEAttribute(powerSupplyEClass, POWER_SUPPLY__NAME);
		createEAttribute(powerSupplyEClass, POWER_SUPPLY__CAPACITY);
		createEAttribute(powerSupplyEClass, POWER_SUPPLY__POWER_CONSUMPTION);
		createEReference(powerSupplyEClass, POWER_SUPPLY__COMPUTER);

		screenEClass = createEClass(SCREEN);
		createEAttribute(screenEClass, SCREEN__NAME);
		createEAttribute(screenEClass, SCREEN__MAX_RES);
		createEAttribute(screenEClass, SCREEN__RESPONSE_TIME);
		createEAttribute(screenEClass, SCREEN__MAX_FREQ);
		createEAttribute(screenEClass, SCREEN__LENGTH);
		createEAttribute(screenEClass, SCREEN__WIDTH);
		createEAttribute(screenEClass, SCREEN__HEIGHT);
		createEAttribute(screenEClass, SCREEN__POWER_CONSUMPTION);

		mouseEClass = createEClass(MOUSE);
		createEAttribute(mouseEClass, MOUSE__NAME);
		createEAttribute(mouseEClass, MOUSE__NUM_USB);
		createEAttribute(mouseEClass, MOUSE__NUM_PS2);
		createEAttribute(mouseEClass, MOUSE__DPI);
		createEAttribute(mouseEClass, MOUSE__POWER_CONSUMPTION);

		keyboardEClass = createEClass(KEYBOARD);
		createEAttribute(keyboardEClass, KEYBOARD__NAME);
		createEAttribute(keyboardEClass, KEYBOARD__NUM_USB);
		createEAttribute(keyboardEClass, KEYBOARD__NUM_PS2);
		createEAttribute(keyboardEClass, KEYBOARD__SWITCH_TYPE);
		createEAttribute(keyboardEClass, KEYBOARD__CONNECTION_TYPE);
		createEAttribute(keyboardEClass, KEYBOARD__POWER_CONSUMPTION);

		printerEClass = createEClass(PRINTER);
		createEAttribute(printerEClass, PRINTER__NAME);
		createEAttribute(printerEClass, PRINTER__NUM_USB);
		createEAttribute(printerEClass, PRINTER__NUM_PS2);
		createEAttribute(printerEClass, PRINTER__CONNECTION_TYPE);
		createEAttribute(printerEClass, PRINTER__POWER_CONSUMPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(computerEClass, Computer.class, "Computer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputer_Motherboard(), this.getMotherboard(), this.getMotherboard_Computer(), "motherboard", null, 1, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_Processor(), this.getProcessor(), this.getProcessor_Computer(), "processor", null, 1, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_GraphicsCards(), this.getGraphicsCard(), null, "graphicsCards", null, 0, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputer_Memory(), this.getMemory(), null, "memory", null, 1, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputer_HardDisks(), this.getHardDisk(), null, "hardDisks", null, 1, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputer_CdDvdDrives(), this.getCDDVDDrive(), null, "cdDvdDrives", null, 0, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputer_Screens(), this.getScreen(), null, "screens", null, 1, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputer_Mouse(), this.getMouse(), null, "mouse", null, 1, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_Keyboard(), this.getKeyboard(), null, "keyboard", null, 1, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_Printer(), this.getPrinter(), null, "printer", null, 0, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_PowerSupply(), this.getPowerSupply(), this.getPowerSupply_Computer(), "powerSupply", null, 1, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComputer__TotalPowerUsage(), ecorePackage.getEBigInteger(), "totalPowerUsage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(motherboardEClass, Motherboard.class, "Motherboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotherboard_Name(), ecorePackage.getEString(), "name", null, 1, 1, Motherboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotherboard_CPU_socket(), ecorePackage.getEString(), "CPU_socket", null, 1, 1, Motherboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotherboard_HasOnboardGPU(), ecorePackage.getEBoolean(), "hasOnboardGPU", null, 1, 1, Motherboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotherboard_NumPS2Ports(), ecorePackage.getEBigInteger(), "numPS2Ports", null, 1, 1, Motherboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotherboard_NumUSBPorts(), ecorePackage.getEBigInteger(), "numUSBPorts", null, 1, 1, Motherboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotherboard_Power_consumption(), ecorePackage.getEBigInteger(), "power_consumption", null, 1, 1, Motherboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotherboard_Computer(), this.getComputer(), this.getComputer_Motherboard(), "computer", null, 1, 1, Motherboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Name(), ecorePackage.getEString(), "name", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_CPU_socket(), ecorePackage.getEString(), "CPU_socket", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_NumCores(), ecorePackage.getEBigInteger(), "numCores", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_ClockSpeed(), ecorePackage.getEBigInteger(), "clockSpeed", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Power_consumption(), ecorePackage.getEBigInteger(), "power_consumption", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_Computer(), this.getComputer(), this.getComputer_Processor(), "computer", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicsCardEClass, GraphicsCard.class, "GraphicsCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicsCard_Name(), ecorePackage.getEString(), "name", null, 1, 1, GraphicsCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicsCard_Memory_size(), ecorePackage.getEBigInteger(), "memory_size", null, 1, 1, GraphicsCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicsCard_Core_clock(), ecorePackage.getEBigInteger(), "core_clock", null, 1, 1, GraphicsCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicsCard_Memory_clock(), ecorePackage.getEBigInteger(), "memory_clock", null, 1, 1, GraphicsCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicsCard_Power_consumption(), ecorePackage.getEBigInteger(), "power_consumption", null, 1, 1, GraphicsCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryEClass, Memory.class, "Memory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemory_Name(), ecorePackage.getEString(), "name", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemory_Memory_size(), ecorePackage.getEBigInteger(), "memory_size", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemory_Memory_clock_speed(), ecorePackage.getEBigInteger(), "memory_clock_speed", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemory_Power_consumption(), ecorePackage.getEBigInteger(), "power_consumption", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardDiskEClass, HardDisk.class, "HardDisk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardDisk_Name(), ecorePackage.getEString(), "name", null, 1, 1, HardDisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardDisk_IsSSD(), ecorePackage.getEBoolean(), "isSSD", null, 1, 1, HardDisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardDisk_Capacity(), ecorePackage.getEBigInteger(), "capacity", null, 1, 1, HardDisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardDisk_Read_speed(), ecorePackage.getEBigInteger(), "read_speed", null, 1, 1, HardDisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardDisk_Write_speed(), ecorePackage.getEBigInteger(), "write_speed", null, 1, 1, HardDisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardDisk_Power_consumption(), ecorePackage.getEBigInteger(), "power_consumption", null, 1, 1, HardDisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cddvdDriveEClass, CDDVDDrive.class, "CDDVDDrive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCDDVDDrive_Name(), ecorePackage.getEString(), "name", null, 1, 1, CDDVDDrive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDDVDDrive_Type(), ecorePackage.getEString(), "type", null, 1, 1, CDDVDDrive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDDVDDrive_Power_consumption(), ecorePackage.getEBigInteger(), "power_consumption", null, 1, 1, CDDVDDrive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerSupplyEClass, PowerSupply.class, "PowerSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPowerSupply_Name(), ecorePackage.getEString(), "name", null, 1, 1, PowerSupply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerSupply_Capacity(), ecorePackage.getEBigInteger(), "capacity", null, 1, 1, PowerSupply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerSupply_Power_consumption(), ecorePackage.getEBigInteger(), "power_consumption", null, 1, 1, PowerSupply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerSupply_Computer(), this.getComputer(), this.getComputer_PowerSupply(), "computer", null, 0, 1, PowerSupply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screenEClass, Screen.class, "Screen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScreen_Name(), ecorePackage.getEString(), "name", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_Max_res(), ecorePackage.getEString(), "max_res", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_Response_time(), ecorePackage.getEBigInteger(), "response_time", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_Max_freq(), ecorePackage.getEBigInteger(), "max_freq", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_Length(), ecorePackage.getEBigInteger(), "length", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_Width(), ecorePackage.getEBigInteger(), "width", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_Height(), ecorePackage.getEBigInteger(), "height", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_Power_consumption(), ecorePackage.getEBigInteger(), "power_consumption", null, 1, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mouseEClass, Mouse.class, "Mouse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMouse_Name(), ecorePackage.getEString(), "name", null, 1, 1, Mouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMouse_NumUSB(), ecorePackage.getEBigInteger(), "numUSB", null, 1, 1, Mouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMouse_NumPS2(), ecorePackage.getEBigInteger(), "numPS2", null, 1, 1, Mouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMouse_Dpi(), ecorePackage.getEBigInteger(), "dpi", null, 1, 1, Mouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMouse_Power_consumption(), ecorePackage.getEBigInteger(), "power_consumption", null, 1, 1, Mouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyboardEClass, Keyboard.class, "Keyboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyboard_Name(), ecorePackage.getEString(), "name", null, 1, 1, Keyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyboard_NumUSB(), ecorePackage.getEBigInteger(), "numUSB", null, 1, 1, Keyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyboard_NumPS2(), ecorePackage.getEBigInteger(), "numPS2", null, 1, 1, Keyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyboard_Switch_type(), ecorePackage.getEString(), "switch_type", null, 1, 1, Keyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyboard_Connection_type(), ecorePackage.getEString(), "connection_type", null, 1, 1, Keyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyboard_Power_consumption(), ecorePackage.getEBigInteger(), "power_consumption", null, 1, 1, Keyboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(printerEClass, Printer.class, "Printer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrinter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinter_NumUSB(), ecorePackage.getEBigInteger(), "numUSB", null, 1, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinter_NumPS2(), ecorePackage.getEBigInteger(), "numPS2", null, 1, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinter_Connection_type(), ecorePackage.getEString(), "connection_type", null, 1, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinter_Power_consumption(), ecorePackage.getEBigInteger(), "power_consumption", null, 1, 1, Printer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (computerEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasSomeGPU enoughUSBPorts enoughPS2Ports"
		   });	
		addAnnotation
		  (motherboardEClass, 
		   source, 
		   new String[] {
			 "constraints", "MatchingSocket"
		   });	
		addAnnotation
		  (processorEClass, 
		   source, 
		   new String[] {
			 "constraints", "MatchingSocket2"
		   });	
		addAnnotation
		  (powerSupplyEClass, 
		   source, 
		   new String[] {
			 "constraints", "notOverCapacity"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (computerEClass, 
		   source, 
		   new String[] {
			 "hasSomeGPU", "\n\t\t\t(motherboard.hasOnboardGPU or self.graphicsCards->size() > 0)",
			 "enoughUSBPorts", "\n\t\t\t(self.mouse.numUSB + self.keyboard.numUSB) + if(self.printer->size() > 0) then self.printer.numUSB else 0 endif <= self.motherboard.numUSBPorts",
			 "enoughPS2Ports", "\n\t\t\t(self.mouse.numPS2 + self.keyboard.numPS2) + if(self.printer->size() > 0) then self.printer.numPS2 else 0 endif <= self.motherboard.numPS2Ports"
		   });	
		addAnnotation
		  (getComputer__TotalPowerUsage(), 
		   source, 
		   new String[] {
			 "body", "motherboard.power_consumption +\n\t\t\t\t\t\tprocessor.power_consumption +\n\t\t\t\t\t\tmouse.power_consumption + \n\t\t\t\t\t\tkeyboard.power_consumption +\n\t\t\t\t\t\tprinter->iterate(i : Printer, sum : Integer=0 | sum + i.power_consumption) +\n\t\t\t\t\t\tgraphicsCards->iterate(i : GraphicsCard, sum : Integer=0 | sum + i.power_consumption) +\n\t\t\t\t\t\tcdDvdDrives->iterate(i : CDDVDDrive, sum : Integer = 0 | sum + i.power_consumption) + \n\t\t\t\t\t\tmemory->iterate(i : Memory, sum : Integer = 0 | sum + i.power_consumption) + \n\t\t\t\t\t\thardDisks->iterate(i : HardDisk, sum : Integer = 0 | sum + i.power_consumption) +\n\t\t\t\t\t\tscreens->iterate(i : Screen, sum : Integer = 0 | sum + i.power_consumption)"
		   });	
		addAnnotation
		  (motherboardEClass, 
		   source, 
		   new String[] {
			 "MatchingSocket", "\n\t\t\tcomputer.processor.CPU_socket = self.CPU_socket"
		   });	
		addAnnotation
		  (processorEClass, 
		   source, 
		   new String[] {
			 "MatchingSocket2", "\n\t\t\tcomputer.motherboard.CPU_socket = self.CPU_socket"
		   });	
		addAnnotation
		  (powerSupplyEClass, 
		   source, 
		   new String[] {
			 "notOverCapacity", "computer.totalPowerUsage() <= self.capacity"
		   });
	}

} //ComputerPackageImpl
