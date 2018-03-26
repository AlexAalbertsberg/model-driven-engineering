/**
 */
package mde.lect6.action.Action;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.lect6.action.Action.Model#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see mde.lect6.action.Action.ActionPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link mde.lect6.action.Action.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see mde.lect6.action.Action.ActionPackage#getModel_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Model
