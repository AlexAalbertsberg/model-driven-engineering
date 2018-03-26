/**
 */
package computer;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link computer.Keyboard#getName <em>Name</em>}</li>
 *   <li>{@link computer.Keyboard#getNumUSB <em>Num USB</em>}</li>
 *   <li>{@link computer.Keyboard#getNumPS2 <em>Num PS2</em>}</li>
 *   <li>{@link computer.Keyboard#getSwitch_type <em>Switch type</em>}</li>
 *   <li>{@link computer.Keyboard#getConnection_type <em>Connection type</em>}</li>
 *   <li>{@link computer.Keyboard#getPower_consumption <em>Power consumption</em>}</li>
 * </ul>
 *
 * @see computer.ComputerPackage#getKeyboard()
 * @model
 * @generated
 */
public interface Keyboard extends EObject {
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
	 * @see computer.ComputerPackage#getKeyboard_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link computer.Keyboard#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Num USB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num USB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num USB</em>' attribute.
	 * @see #setNumUSB(BigInteger)
	 * @see computer.ComputerPackage#getKeyboard_NumUSB()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getNumUSB();

	/**
	 * Sets the value of the '{@link computer.Keyboard#getNumUSB <em>Num USB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num USB</em>' attribute.
	 * @see #getNumUSB()
	 * @generated
	 */
	void setNumUSB(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Num PS2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num PS2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num PS2</em>' attribute.
	 * @see #setNumPS2(BigInteger)
	 * @see computer.ComputerPackage#getKeyboard_NumPS2()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getNumPS2();

	/**
	 * Sets the value of the '{@link computer.Keyboard#getNumPS2 <em>Num PS2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num PS2</em>' attribute.
	 * @see #getNumPS2()
	 * @generated
	 */
	void setNumPS2(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Switch type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch type</em>' attribute.
	 * @see #setSwitch_type(String)
	 * @see computer.ComputerPackage#getKeyboard_Switch_type()
	 * @model required="true"
	 * @generated
	 */
	String getSwitch_type();

	/**
	 * Sets the value of the '{@link computer.Keyboard#getSwitch_type <em>Switch type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch type</em>' attribute.
	 * @see #getSwitch_type()
	 * @generated
	 */
	void setSwitch_type(String value);

	/**
	 * Returns the value of the '<em><b>Connection type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection type</em>' attribute.
	 * @see #setConnection_type(String)
	 * @see computer.ComputerPackage#getKeyboard_Connection_type()
	 * @model required="true"
	 * @generated
	 */
	String getConnection_type();

	/**
	 * Sets the value of the '{@link computer.Keyboard#getConnection_type <em>Connection type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection type</em>' attribute.
	 * @see #getConnection_type()
	 * @generated
	 */
	void setConnection_type(String value);

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
	 * @see computer.ComputerPackage#getKeyboard_Power_consumption()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getPower_consumption();

	/**
	 * Sets the value of the '{@link computer.Keyboard#getPower_consumption <em>Power consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power consumption</em>' attribute.
	 * @see #getPower_consumption()
	 * @generated
	 */
	void setPower_consumption(BigInteger value);

} // Keyboard
