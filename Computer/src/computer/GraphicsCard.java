/**
 */
package computer;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphics Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link computer.GraphicsCard#getName <em>Name</em>}</li>
 *   <li>{@link computer.GraphicsCard#getMemory_size <em>Memory size</em>}</li>
 *   <li>{@link computer.GraphicsCard#getCore_clock <em>Core clock</em>}</li>
 *   <li>{@link computer.GraphicsCard#getMemory_clock <em>Memory clock</em>}</li>
 *   <li>{@link computer.GraphicsCard#getPower_consumption <em>Power consumption</em>}</li>
 * </ul>
 *
 * @see computer.ComputerPackage#getGraphicsCard()
 * @model
 * @generated
 */
public interface GraphicsCard extends EObject {
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
	 * @see computer.ComputerPackage#getGraphicsCard_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link computer.GraphicsCard#getName <em>Name</em>}' attribute.
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
	 * @see computer.ComputerPackage#getGraphicsCard_Memory_size()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getMemory_size();

	/**
	 * Sets the value of the '{@link computer.GraphicsCard#getMemory_size <em>Memory size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory size</em>' attribute.
	 * @see #getMemory_size()
	 * @generated
	 */
	void setMemory_size(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Core clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core clock</em>' attribute.
	 * @see #setCore_clock(BigInteger)
	 * @see computer.ComputerPackage#getGraphicsCard_Core_clock()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getCore_clock();

	/**
	 * Sets the value of the '{@link computer.GraphicsCard#getCore_clock <em>Core clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core clock</em>' attribute.
	 * @see #getCore_clock()
	 * @generated
	 */
	void setCore_clock(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Memory clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory clock</em>' attribute.
	 * @see #setMemory_clock(BigInteger)
	 * @see computer.ComputerPackage#getGraphicsCard_Memory_clock()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getMemory_clock();

	/**
	 * Sets the value of the '{@link computer.GraphicsCard#getMemory_clock <em>Memory clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory clock</em>' attribute.
	 * @see #getMemory_clock()
	 * @generated
	 */
	void setMemory_clock(BigInteger value);

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
	 * @see computer.ComputerPackage#getGraphicsCard_Power_consumption()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getPower_consumption();

	/**
	 * Sets the value of the '{@link computer.GraphicsCard#getPower_consumption <em>Power consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power consumption</em>' attribute.
	 * @see #getPower_consumption()
	 * @generated
	 */
	void setPower_consumption(BigInteger value);

} // GraphicsCard
