/**
 */
package school;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link school.Where#getBooleanexpr <em>Booleanexpr</em>}</li>
 * </ul>
 *
 * @see school.SchoolPackage#getWhere()
 * @model
 * @generated
 */
public interface Where extends EObject {
	/**
	 * Returns the value of the '<em><b>Booleanexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booleanexpr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanexpr</em>' containment reference.
	 * @see #setBooleanexpr(BooleanExpr)
	 * @see school.SchoolPackage#getWhere_Booleanexpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpr getBooleanexpr();

	/**
	 * Sets the value of the '{@link school.Where#getBooleanexpr <em>Booleanexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booleanexpr</em>' containment reference.
	 * @see #getBooleanexpr()
	 * @generated
	 */
	void setBooleanexpr(BooleanExpr value);

} // Where
