/**
 */
package computer;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link computer.Processor#getName <em>Name</em>}</li>
 *   <li>{@link computer.Processor#getCPU_socket <em>CPU socket</em>}</li>
 *   <li>{@link computer.Processor#getNumCores <em>Num Cores</em>}</li>
 *   <li>{@link computer.Processor#getClockSpeed <em>Clock Speed</em>}</li>
 *   <li>{@link computer.Processor#getPower_consumption <em>Power consumption</em>}</li>
 *   <li>{@link computer.Processor#getComputer <em>Computer</em>}</li>
 * </ul>
 *
 * @see computer.ComputerPackage#getProcessor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MatchingSocket2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MatchingSocket2='\n\t\t\tcomputer.motherboard.CPU_socket = self.CPU_socket'"
 * @generated
 */
public interface Processor extends EObject {
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
	 * @see computer.ComputerPackage#getProcessor_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link computer.Processor#getName <em>Name</em>}' attribute.
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
	 * @see computer.ComputerPackage#getProcessor_CPU_socket()
	 * @model required="true"
	 * @generated
	 */
	String getCPU_socket();

	/**
	 * Sets the value of the '{@link computer.Processor#getCPU_socket <em>CPU socket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPU socket</em>' attribute.
	 * @see #getCPU_socket()
	 * @generated
	 */
	void setCPU_socket(String value);

	/**
	 * Returns the value of the '<em><b>Num Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Cores</em>' attribute.
	 * @see #setNumCores(BigInteger)
	 * @see computer.ComputerPackage#getProcessor_NumCores()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getNumCores();

	/**
	 * Sets the value of the '{@link computer.Processor#getNumCores <em>Num Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cores</em>' attribute.
	 * @see #getNumCores()
	 * @generated
	 */
	void setNumCores(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Clock Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Speed</em>' attribute.
	 * @see #setClockSpeed(BigInteger)
	 * @see computer.ComputerPackage#getProcessor_ClockSpeed()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getClockSpeed();

	/**
	 * Sets the value of the '{@link computer.Processor#getClockSpeed <em>Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Speed</em>' attribute.
	 * @see #getClockSpeed()
	 * @generated
	 */
	void setClockSpeed(BigInteger value);

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
	 * @see computer.ComputerPackage#getProcessor_Power_consumption()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getPower_consumption();

	/**
	 * Sets the value of the '{@link computer.Processor#getPower_consumption <em>Power consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power consumption</em>' attribute.
	 * @see #getPower_consumption()
	 * @generated
	 */
	void setPower_consumption(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Computer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link computer.Computer#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer</em>' container reference.
	 * @see #setComputer(Computer)
	 * @see computer.ComputerPackage#getProcessor_Computer()
	 * @see computer.Computer#getProcessor
	 * @model opposite="processor" transient="false"
	 * @generated
	 */
	Computer getComputer();

	/**
	 * Sets the value of the '{@link computer.Processor#getComputer <em>Computer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computer</em>' container reference.
	 * @see #getComputer()
	 * @generated
	 */
	void setComputer(Computer value);

} // Processor
