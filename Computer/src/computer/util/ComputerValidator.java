/**
 */
package computer.util;

import computer.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see computer.ComputerPackage
 * @generated
 */
public class ComputerValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ComputerValidator INSTANCE = new ComputerValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "computer";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputerValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ComputerPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ComputerPackage.COMPUTER:
				return validateComputer((Computer)value, diagnostics, context);
			case ComputerPackage.MOTHERBOARD:
				return validateMotherboard((Motherboard)value, diagnostics, context);
			case ComputerPackage.PROCESSOR:
				return validateProcessor((Processor)value, diagnostics, context);
			case ComputerPackage.GRAPHICS_CARD:
				return validateGraphicsCard((GraphicsCard)value, diagnostics, context);
			case ComputerPackage.MEMORY:
				return validateMemory((Memory)value, diagnostics, context);
			case ComputerPackage.HARD_DISK:
				return validateHardDisk((HardDisk)value, diagnostics, context);
			case ComputerPackage.CDDVD_DRIVE:
				return validateCDDVDDrive((CDDVDDrive)value, diagnostics, context);
			case ComputerPackage.POWER_SUPPLY:
				return validatePowerSupply((PowerSupply)value, diagnostics, context);
			case ComputerPackage.SCREEN:
				return validateScreen((Screen)value, diagnostics, context);
			case ComputerPackage.MOUSE:
				return validateMouse((Mouse)value, diagnostics, context);
			case ComputerPackage.KEYBOARD:
				return validateKeyboard((Keyboard)value, diagnostics, context);
			case ComputerPackage.PRINTER:
				return validatePrinter((Printer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputer(Computer computer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(computer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(computer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(computer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(computer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(computer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(computer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(computer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(computer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(computer, diagnostics, context);
		if (result || diagnostics != null) result &= validateComputer_hasSomeGPU(computer, diagnostics, context);
		if (result || diagnostics != null) result &= validateComputer_enoughUSBPorts(computer, diagnostics, context);
		if (result || diagnostics != null) result &= validateComputer_enoughPS2Ports(computer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasSomeGPU constraint of '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPUTER__HAS_SOME_GPU__EEXPRESSION = "\n" +
		"\t\t\t(motherboard.hasOnboardGPU or self.graphicsCards->size() > 0)";

	/**
	 * Validates the hasSomeGPU constraint of '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputer_hasSomeGPU(Computer computer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComputerPackage.Literals.COMPUTER,
				 computer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasSomeGPU",
				 COMPUTER__HAS_SOME_GPU__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the enoughUSBPorts constraint of '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPUTER__ENOUGH_USB_PORTS__EEXPRESSION = "\n" +
		"\t\t\t(self.mouse.numUSB + self.keyboard.numUSB) + if(self.printer->size() > 0) then self.printer.numUSB else 0 endif <= self.motherboard.numUSBPorts";

	/**
	 * Validates the enoughUSBPorts constraint of '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputer_enoughUSBPorts(Computer computer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComputerPackage.Literals.COMPUTER,
				 computer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "enoughUSBPorts",
				 COMPUTER__ENOUGH_USB_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the enoughPS2Ports constraint of '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPUTER__ENOUGH_PS2_PORTS__EEXPRESSION = "\n" +
		"\t\t\t(self.mouse.numPS2 + self.keyboard.numPS2) + if(self.printer->size() > 0) then self.printer.numPS2 else 0 endif <= self.motherboard.numPS2Ports";

	/**
	 * Validates the enoughPS2Ports constraint of '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputer_enoughPS2Ports(Computer computer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComputerPackage.Literals.COMPUTER,
				 computer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "enoughPS2Ports",
				 COMPUTER__ENOUGH_PS2_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotherboard(Motherboard motherboard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(motherboard, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(motherboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(motherboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(motherboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(motherboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(motherboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(motherboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(motherboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(motherboard, diagnostics, context);
		if (result || diagnostics != null) result &= validateMotherboard_MatchingSocket(motherboard, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MatchingSocket constraint of '<em>Motherboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOTHERBOARD__MATCHING_SOCKET__EEXPRESSION = "\n" +
		"\t\t\tcomputer.processor.CPU_socket = self.CPU_socket";

	/**
	 * Validates the MatchingSocket constraint of '<em>Motherboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotherboard_MatchingSocket(Motherboard motherboard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComputerPackage.Literals.MOTHERBOARD,
				 motherboard,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MatchingSocket",
				 MOTHERBOARD__MATCHING_SOCKET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessor(Processor processor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessor_MatchingSocket2(processor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MatchingSocket2 constraint of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSOR__MATCHING_SOCKET2__EEXPRESSION = "\n" +
		"\t\t\tcomputer.motherboard.CPU_socket = self.CPU_socket";

	/**
	 * Validates the MatchingSocket2 constraint of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessor_MatchingSocket2(Processor processor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComputerPackage.Literals.PROCESSOR,
				 processor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MatchingSocket2",
				 PROCESSOR__MATCHING_SOCKET2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicsCard(GraphicsCard graphicsCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicsCard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardDisk(HardDisk hardDisk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardDisk, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCDDVDDrive(CDDVDDrive cddvdDrive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cddvdDrive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerSupply(PowerSupply powerSupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(powerSupply, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(powerSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(powerSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(powerSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(powerSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(powerSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(powerSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(powerSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(powerSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSupply_notOverCapacity(powerSupply, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the notOverCapacity constraint of '<em>Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POWER_SUPPLY__NOT_OVER_CAPACITY__EEXPRESSION = "computer.totalPowerUsage() <= self.capacity";

	/**
	 * Validates the notOverCapacity constraint of '<em>Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerSupply_notOverCapacity(PowerSupply powerSupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComputerPackage.Literals.POWER_SUPPLY,
				 powerSupply,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "notOverCapacity",
				 POWER_SUPPLY__NOT_OVER_CAPACITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScreen(Screen screen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(screen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMouse(Mouse mouse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mouse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyboard(Keyboard keyboard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyboard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrinter(Printer printer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(printer, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ComputerValidator
