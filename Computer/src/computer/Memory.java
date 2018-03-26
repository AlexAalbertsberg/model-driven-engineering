/**
 */
package computer;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link computer.Memory#getName <em>Name</em>}</li>
 *   <li>{@link computer.Memory#getMemory_size <em>Memory size</em>}</li>
 *   <li>{@link computer.Memory#getMemory_clock_speed <em>Memory clock speed</em>}</li>
 *   <li>{@link computer.Memory#getPower_consumption <em>Power consumption</em>}</li>
 * </ul>
 *
 * @see computer.ComputerPackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends EObject {
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
	 * @see computer.ComputerPackage#getMemory_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link computer.Memory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Memory size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory size</em>' attribute.
	 * @see #setMemory_size(BigInteger)
	 * @see computer.ComputerPackage#getMemory_Memory_size()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getMemory_size();

	/**
	 * Sets the value of the '{@link computer.Memory#getMemory_size <em>Memory size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory size</em>' attribute.
	 * @see #getMemory_size()
	 * @generated
	 */
	void setMemory_size(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Memory clock speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory clock speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory clock speed</em>' attribute.
	 * @see #setMemory_clock_speed(BigInteger)
	 * @see computer.ComputerPackage#getMemory_Memory_clock_speed()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getMemory_clock_speed();

	/**
	 * Sets the value of the '{@link computer.Memory#getMemory_clock_speed <em>Memory clock speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory clock speed</em>' attribute.
	 * @see #getMemory_clock_speed()
	 * @generated
	 */
	void setMemory_clock_speed(BigInteger value);

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
	 * @see computer.ComputerPackage#getMemory_Power_consumption()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getPower_consumption();

	/**
	 * Sets the value of the '{@link computer.Memory#getPower_consumption <em>Power consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power consumption</em>' attribute.
	 * @see #getPower_consumption()
	 * @generated
	 */
	void setPower_consumption(BigInteger value);

} // Memory
