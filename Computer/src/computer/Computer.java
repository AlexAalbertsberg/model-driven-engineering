/**
 */
package computer;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link computer.Computer#getMotherboard <em>Motherboard</em>}</li>
 *   <li>{@link computer.Computer#getProcessor <em>Processor</em>}</li>
 *   <li>{@link computer.Computer#getGraphicsCards <em>Graphics Cards</em>}</li>
 *   <li>{@link computer.Computer#getMemory <em>Memory</em>}</li>
 *   <li>{@link computer.Computer#getHardDisks <em>Hard Disks</em>}</li>
 *   <li>{@link computer.Computer#getCdDvdDrives <em>Cd Dvd Drives</em>}</li>
 *   <li>{@link computer.Computer#getScreens <em>Screens</em>}</li>
 *   <li>{@link computer.Computer#getMouse <em>Mouse</em>}</li>
 *   <li>{@link computer.Computer#getKeyboard <em>Keyboard</em>}</li>
 *   <li>{@link computer.Computer#getPrinter <em>Printer</em>}</li>
 *   <li>{@link computer.Computer#getPowerSupply <em>Power Supply</em>}</li>
 * </ul>
 *
 * @see computer.ComputerPackage#getComputer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasSomeGPU enoughUSBPorts enoughPS2Ports'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hasSomeGPU='\n\t\t\t(motherboard.hasOnboardGPU or self.graphicsCards->size() > 0)' enoughUSBPorts='\n\t\t\t(self.mouse.numUSB + self.keyboard.numUSB) + if(self.printer->size() > 0) then self.printer.numUSB else 0 endif <= self.motherboard.numUSBPorts' enoughPS2Ports='\n\t\t\t(self.mouse.numPS2 + self.keyboard.numPS2) + if(self.printer->size() > 0) then self.printer.numPS2 else 0 endif <= self.motherboard.numPS2Ports'"
 * @generated
 */
public interface Computer extends EObject {
	/**
	 * Returns the value of the '<em><b>Motherboard</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link computer.Motherboard#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motherboard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motherboard</em>' containment reference.
	 * @see #setMotherboard(Motherboard)
	 * @see computer.ComputerPackage#getComputer_Motherboard()
	 * @see computer.Motherboard#getComputer
	 * @model opposite="computer" containment="true" required="true"
	 * @generated
	 */
	Motherboard getMotherboard();

	/**
	 * Sets the value of the '{@link computer.Computer#getMotherboard <em>Motherboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motherboard</em>' containment reference.
	 * @see #getMotherboard()
	 * @generated
	 */
	void setMotherboard(Motherboard value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link computer.Processor#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference.
	 * @see #setProcessor(Processor)
	 * @see computer.ComputerPackage#getComputer_Processor()
	 * @see computer.Processor#getComputer
	 * @model opposite="computer" containment="true" required="true"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link computer.Computer#getProcessor <em>Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' containment reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

	/**
	 * Returns the value of the '<em><b>Graphics Cards</b></em>' containment reference list.
	 * The list contents are of type {@link computer.GraphicsCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphics Cards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphics Cards</em>' containment reference list.
	 * @see computer.ComputerPackage#getComputer_GraphicsCards()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<GraphicsCard> getGraphicsCards();

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' containment reference list.
	 * The list contents are of type {@link computer.Memory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' containment reference list.
	 * @see computer.ComputerPackage#getComputer_Memory()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Memory> getMemory();

	/**
	 * Returns the value of the '<em><b>Hard Disks</b></em>' containment reference list.
	 * The list contents are of type {@link computer.HardDisk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hard Disks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hard Disks</em>' containment reference list.
	 * @see computer.ComputerPackage#getComputer_HardDisks()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<HardDisk> getHardDisks();

	/**
	 * Returns the value of the '<em><b>Cd Dvd Drives</b></em>' containment reference list.
	 * The list contents are of type {@link computer.CDDVDDrive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cd Dvd Drives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cd Dvd Drives</em>' containment reference list.
	 * @see computer.ComputerPackage#getComputer_CdDvdDrives()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CDDVDDrive> getCdDvdDrives();

	/**
	 * Returns the value of the '<em><b>Screens</b></em>' containment reference list.
	 * The list contents are of type {@link computer.Screen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screens</em>' containment reference list.
	 * @see computer.ComputerPackage#getComputer_Screens()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Screen> getScreens();

	/**
	 * Returns the value of the '<em><b>Mouse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouse</em>' containment reference.
	 * @see #setMouse(Mouse)
	 * @see computer.ComputerPackage#getComputer_Mouse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Mouse getMouse();

	/**
	 * Sets the value of the '{@link computer.Computer#getMouse <em>Mouse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mouse</em>' containment reference.
	 * @see #getMouse()
	 * @generated
	 */
	void setMouse(Mouse value);

	/**
	 * Returns the value of the '<em><b>Keyboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyboard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyboard</em>' containment reference.
	 * @see #setKeyboard(Keyboard)
	 * @see computer.ComputerPackage#getComputer_Keyboard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Keyboard getKeyboard();

	/**
	 * Sets the value of the '{@link computer.Computer#getKeyboard <em>Keyboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyboard</em>' containment reference.
	 * @see #getKeyboard()
	 * @generated
	 */
	void setKeyboard(Keyboard value);

	/**
	 * Returns the value of the '<em><b>Printer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printer</em>' containment reference.
	 * @see #setPrinter(Printer)
	 * @see computer.ComputerPackage#getComputer_Printer()
	 * @model containment="true"
	 * @generated
	 */
	Printer getPrinter();

	/**
	 * Sets the value of the '{@link computer.Computer#getPrinter <em>Printer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printer</em>' containment reference.
	 * @see #getPrinter()
	 * @generated
	 */
	void setPrinter(Printer value);

	/**
	 * Returns the value of the '<em><b>Power Supply</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link computer.PowerSupply#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Supply</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Supply</em>' containment reference.
	 * @see #setPowerSupply(PowerSupply)
	 * @see computer.ComputerPackage#getComputer_PowerSupply()
	 * @see computer.PowerSupply#getComputer
	 * @model opposite="computer" containment="true" required="true"
	 * @generated
	 */
	PowerSupply getPowerSupply();

	/**
	 * Sets the value of the '{@link computer.Computer#getPowerSupply <em>Power Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Supply</em>' containment reference.
	 * @see #getPowerSupply()
	 * @generated
	 */
	void setPowerSupply(PowerSupply value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='motherboard.power_consumption +\n\t\t\t\t\t\tprocessor.power_consumption +\n\t\t\t\t\t\tmouse.power_consumption + \n\t\t\t\t\t\tkeyboard.power_consumption +\n\t\t\t\t\t\tprinter->iterate(i : Printer, sum : Integer=0 | sum + i.power_consumption) +\n\t\t\t\t\t\tgraphicsCards->iterate(i : GraphicsCard, sum : Integer=0 | sum + i.power_consumption) +\n\t\t\t\t\t\tcdDvdDrives->iterate(i : CDDVDDrive, sum : Integer = 0 | sum + i.power_consumption) + \n\t\t\t\t\t\tmemory->iterate(i : Memory, sum : Integer = 0 | sum + i.power_consumption) + \n\t\t\t\t\t\thardDisks->iterate(i : HardDisk, sum : Integer = 0 | sum + i.power_consumption) +\n\t\t\t\t\t\tscreens->iterate(i : Screen, sum : Integer = 0 | sum + i.power_consumption)'"
	 * @generated
	 */
	BigInteger totalPowerUsage();

} // Computer
