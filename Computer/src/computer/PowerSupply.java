/**
 */
package computer;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link computer.PowerSupply#getName <em>Name</em>}</li>
 *   <li>{@link computer.PowerSupply#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link computer.PowerSupply#getPower_consumption <em>Power consumption</em>}</li>
 *   <li>{@link computer.PowerSupply#getComputer <em>Computer</em>}</li>
 * </ul>
 *
 * @see computer.ComputerPackage#getPowerSupply()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='notOverCapacity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot notOverCapacity='computer.totalPowerUsage() <= self.capacity'"
 * @generated
 */
public interface PowerSupply extends EObject {
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
	 * @see computer.ComputerPackage#getPowerSupply_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link computer.PowerSupply#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(BigInteger)
	 * @see computer.ComputerPackage#getPowerSupply_Capacity()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getCapacity();

	/**
	 * Sets the value of the '{@link computer.PowerSupply#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(BigInteger value);

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
	 * @see computer.ComputerPackage#getPowerSupply_Power_consumption()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getPower_consumption();

	/**
	 * Sets the value of the '{@link computer.PowerSupply#getPower_consumption <em>Power consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power consumption</em>' attribute.
	 * @see #getPower_consumption()
	 * @generated
	 */
	void setPower_consumption(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Computer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link computer.Computer#getPowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer</em>' container reference.
	 * @see #setComputer(Computer)
	 * @see computer.ComputerPackage#getPowerSupply_Computer()
	 * @see computer.Computer#getPowerSupply
	 * @model opposite="powerSupply" transient="false"
	 * @generated
	 */
	Computer getComputer();

	/**
	 * Sets the value of the '{@link computer.PowerSupply#getComputer <em>Computer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computer</em>' container reference.
	 * @see #getComputer()
	 * @generated
	 */
	void setComputer(Computer value);

} // PowerSupply
