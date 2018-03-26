/**
 */
package computer;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link computer.Screen#getName <em>Name</em>}</li>
 *   <li>{@link computer.Screen#getMax_res <em>Max res</em>}</li>
 *   <li>{@link computer.Screen#getResponse_time <em>Response time</em>}</li>
 *   <li>{@link computer.Screen#getMax_freq <em>Max freq</em>}</li>
 *   <li>{@link computer.Screen#getLength <em>Length</em>}</li>
 *   <li>{@link computer.Screen#getWidth <em>Width</em>}</li>
 *   <li>{@link computer.Screen#getHeight <em>Height</em>}</li>
 *   <li>{@link computer.Screen#getPower_consumption <em>Power consumption</em>}</li>
 * </ul>
 *
 * @see computer.ComputerPackage#getScreen()
 * @model
 * @generated
 */
public interface Screen extends EObject {
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
	 * @see computer.ComputerPackage#getScreen_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link computer.Screen#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Max res</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max res</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max res</em>' attribute.
	 * @see #setMax_res(String)
	 * @see computer.ComputerPackage#getScreen_Max_res()
	 * @model required="true"
	 * @generated
	 */
	String getMax_res();

	/**
	 * Sets the value of the '{@link computer.Screen#getMax_res <em>Max res</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max res</em>' attribute.
	 * @see #getMax_res()
	 * @generated
	 */
	void setMax_res(String value);

	/**
	 * Returns the value of the '<em><b>Response time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response time</em>' attribute.
	 * @see #setResponse_time(BigInteger)
	 * @see computer.ComputerPackage#getScreen_Response_time()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getResponse_time();

	/**
	 * Sets the value of the '{@link computer.Screen#getResponse_time <em>Response time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response time</em>' attribute.
	 * @see #getResponse_time()
	 * @generated
	 */
	void setResponse_time(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max freq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max freq</em>' attribute.
	 * @see #setMax_freq(BigInteger)
	 * @see computer.ComputerPackage#getScreen_Max_freq()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getMax_freq();

	/**
	 * Sets the value of the '{@link computer.Screen#getMax_freq <em>Max freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max freq</em>' attribute.
	 * @see #getMax_freq()
	 * @generated
	 */
	void setMax_freq(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(BigInteger)
	 * @see computer.ComputerPackage#getScreen_Length()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getLength();

	/**
	 * Sets the value of the '{@link computer.Screen#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(BigInteger)
	 * @see computer.ComputerPackage#getScreen_Width()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getWidth();

	/**
	 * Sets the value of the '{@link computer.Screen#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(BigInteger)
	 * @see computer.ComputerPackage#getScreen_Height()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getHeight();

	/**
	 * Sets the value of the '{@link computer.Screen#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(BigInteger value);

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
	 * @see computer.ComputerPackage#getScreen_Power_consumption()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getPower_consumption();

	/**
	 * Sets the value of the '{@link computer.Screen#getPower_consumption <em>Power consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power consumption</em>' attribute.
	 * @see #getPower_consumption()
	 * @generated
	 */
	void setPower_consumption(BigInteger value);

} // Screen
