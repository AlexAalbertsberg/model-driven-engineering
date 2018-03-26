/**
 */
package mde.lect6.action.PrimitiveTypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mde.lect6.action.PrimitiveTypes.PrimitiveTypesPackage
 * @generated
 */
public interface PrimitiveTypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrimitiveTypesFactory eINSTANCE = mde.lect6.action.PrimitiveTypes.impl.PrimitiveTypesFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PrimitiveTypesPackage getPrimitiveTypesPackage();

} //PrimitiveTypesFactory
