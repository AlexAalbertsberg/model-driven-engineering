/**
 */
package computer;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hard Disk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link computer.HardDisk#getName <em>Name</em>}</li>
 *   <li>{@link computer.HardDisk#isIsSSD <em>Is SSD</em>}</li>
 *   <li>{@link computer.HardDisk#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link computer.HardDisk#getRead_speed <em>Read speed</em>}</li>
 *   <li>{@link computer.HardDisk#getWrite_speed <em>Write speed</em>}</li>
 *   <li>{@link computer.HardDisk#getPower_consumption <em>Power consumption</em>}</li>
 * </ul>
 *
 * @see computer.ComputerPackage#getHardDisk()
 * @model
 * @generated
 */
public interface HardDisk extends EObject {
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
	 * @see computer.ComputerPackage#getHardDisk_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link computer.HardDisk#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is SSD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is SSD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is SSD</em>' attribute.
	 * @see #setIsSSD(boolean)
	 * @see computer.ComputerPackage#getHardDisk_IsSSD()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSSD();

	/**
	 * Sets the value of the '{@link computer.HardDisk#isIsSSD <em>Is SSD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is SSD</em>' attribute.
	 * @see #isIsSSD()
	 * @generated
	 */
	void setIsSSD(boolean value);

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
	 * @see computer.ComputerPackage#getHardDisk_Capacity()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getCapacity();

	/**
	 * Sets the value of the '{@link computer.HardDisk#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Read speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read speed</em>' attribute.
	 * @see #setRead_speed(BigInteger)
	 * @see computer.ComputerPackage#getHardDisk_Read_speed()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getRead_speed();

	/**
	 * Sets the value of the '{@link computer.HardDisk#getRead_speed <em>Read speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read speed</em>' attribute.
	 * @see #getRead_speed()
	 * @generated
	 */
	void setRead_speed(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Write speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write speed</em>' attribute.
	 * @see #setWrite_speed(BigInteger)
	 * @see computer.ComputerPackage#getHardDisk_Write_speed()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getWrite_speed();

	/**
	 * Sets the value of the '{@link computer.HardDisk#getWrite_speed <em>Write speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write speed</em>' attribute.
	 * @see #getWrite_speed()
	 * @generated
	 */
	void setWrite_speed(BigInteger value);

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
	 * @see computer.ComputerPackage#getHardDisk_Power_consumption()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getPower_consumption();

	/**
	 * Sets the value of the '{@link computer.HardDisk#getPower_consumption <em>Power consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power consumption</em>' attribute.
	 * @see #getPower_consumption()
	 * @generated
	 */
	void setPower_consumption(BigInteger value);

} // HardDisk
