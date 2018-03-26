/**
 */
package computer;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motherboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link computer.Motherboard#getName <em>Name</em>}</li>
 *   <li>{@link computer.Motherboard#getCPU_socket <em>CPU socket</em>}</li>
 *   <li>{@link computer.Motherboard#isHasOnboardGPU <em>Has Onboard GPU</em>}</li>
 *   <li>{@link computer.Motherboard#getNumPS2Ports <em>Num PS2 Ports</em>}</li>
 *   <li>{@link computer.Motherboard#getNumUSBPorts <em>Num USB Ports</em>}</li>
 *   <li>{@link computer.Motherboard#getPower_consumption <em>Power consumption</em>}</li>
 *   <li>{@link computer.Motherboard#getComputer <em>Computer</em>}</li>
 * </ul>
 *
 * @see computer.ComputerPackage#getMotherboard()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MatchingSocket'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MatchingSocket='\n\t\t\tcomputer.processor.CPU_socket = self.CPU_socket'"
 * @generated
 */
public interface Motherboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see computer.ComputerPackage#getMotherboard_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link computer.Motherboard#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>CPU socket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPU socket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPU socket</em>' attribute.
	 * @see #setCPU_socket(String)
	 * @see computer.ComputerPackage#getMotherboard_CPU_socket()
	 * @model required="true"
	 * @generated
	 */
	String getCPU_socket();

	/**
	 * Sets the value of the '{@link computer.Motherboard#getCPU_socket <em>CPU socket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPU socket</em>' attribute.
	 * @see #getCPU_socket()
	 * @generated
	 */
	void setCPU_socket(String value);

	/**
	 * Returns the value of the '<em><b>Has Onboard GPU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Onboard GPU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Onboard GPU</em>' attribute.
	 * @see #setHasOnboardGPU(boolean)
	 * @see computer.ComputerPackage#getMotherboard_HasOnboardGPU()
	 * @model required="true"
	 * @generated
	 */
	boolean isHasOnboardGPU();

	/**
	 * Sets the value of the '{@link computer.Motherboard#isHasOnboardGPU <em>Has Onboard GPU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Onboard GPU</em>' attribute.
	 * @see #isHasOnboardGPU()
	 * @generated
	 */
	void setHasOnboardGPU(boolean value);

	/**
	 * Returns the value of the '<em><b>Num PS2 Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num PS2 Ports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num PS2 Ports</em>' attribute.
	 * @see #setNumPS2Ports(BigInteger)
	 * @see computer.ComputerPackage#getMotherboard_NumPS2Ports()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getNumPS2Ports();

	/**
	 * Sets the value of the '{@link computer.Motherboard#getNumPS2Ports <em>Num PS2 Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num PS2 Ports</em>' attribute.
	 * @see #getNumPS2Ports()
	 * @generated
	 */
	void setNumPS2Ports(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Num USB Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num USB Ports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num USB Ports</em>' attribute.
	 * @see #setNumUSBPorts(BigInteger)
	 * @see computer.ComputerPackage#getMotherboard_NumUSBPorts()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getNumUSBPorts();

	/**
	 * Sets the value of the '{@link computer.Motherboard#getNumUSBPorts <em>Num USB Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num USB Ports</em>' attribute.
	 * @see #getNumUSBPorts()
	 * @generated
	 */
	void setNumUSBPorts(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Power consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power consumption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power consumption</em>' attribute.
	 * @see #setPower_consumption(BigInteger)
	 * @see computer.ComputerPackage#getMotherboard_Power_consumption()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getPower_consumption();

	/**
	 * Sets the value of the '{@link computer.Motherboard#getPower_consumption <em>Power consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power consumption</em>' attribute.
	 * @see #getPower_consumption()
	 * @generated
	 */
	void setPower_consumption(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Computer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link computer.Computer#getMotherboard <em>Motherboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer</em>' container reference.
	 * @see #setComputer(Computer)
	 * @see computer.ComputerPackage#getMotherboard_Computer()
	 * @see computer.Computer#getMotherboard
	 * @model opposite="motherboard" required="true" transient="false"
	 * @generated
	 */
	Computer getComputer();

	/**
	 * Sets the value of the '{@link computer.Motherboard#getComputer <em>Computer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computer</em>' container reference.
	 * @see #getComputer()
	 * @generated
	 */
	void setComputer(Computer value);

} // Motherboard
