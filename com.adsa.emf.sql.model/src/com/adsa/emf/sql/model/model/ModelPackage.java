/**
 */
package com.adsa.emf.sql.model.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.adsa.emf.sql.model.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = com.adsa.emf.sql.model.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.SelectImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__FROM = 1;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__WHERE = 2;

	/**
	 * The feature id for the '<em><b>Union</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__UNION = 3;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.ColumnImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Columnalias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMNALIAS = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.FromImpl <em>From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.FromImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getFrom()
	 * @generated
	 */
	int FROM = 2;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__TABLE = 0;

	/**
	 * The number of structural features of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.TableImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tablealias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLEALIAS = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.WhereImpl <em>Where</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.WhereImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getWhere()
	 * @generated
	 */
	int WHERE = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.BooleanOperation <em>Boolean Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.BooleanOperation
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getBooleanOperation()
	 * @generated
	 */
	int BOOLEAN_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Boolean Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Boolean Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.ComparisonOperator <em>Comparison Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.ComparisonOperator
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 6;

	/**
	 * The number of structural features of the '<em>Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.UnionImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 7;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__SELECT = 0;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.EqualsImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 8;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.GreaterThanImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 9;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.LessThanImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 10;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.NotEqualsImpl <em>Not Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.NotEqualsImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getNotEquals()
	 * @generated
	 */
	int NOT_EQUALS = 11;

	/**
	 * The number of structural features of the '<em>Not Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.AndImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 12;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__CONDITION = BOOLEAN_OPERATION__CONDITION;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOLEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BOOLEAN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.OrImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getOr()
	 * @generated
	 */
	int OR = 13;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__CONDITION = BOOLEAN_OPERATION__CONDITION;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOLEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BOOLEAN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.ColumnAliasImpl <em>Column Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.ColumnAliasImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getColumnAlias()
	 * @generated
	 */
	int COLUMN_ALIAS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_ALIAS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Column Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_ALIAS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_ALIAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.TableAliasImpl <em>Table Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.TableAliasImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getTableAlias()
	 * @generated
	 */
	int TABLE_ALIAS = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ALIAS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Table Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ALIAS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ALIAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.Condition <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.Condition
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Booleanoperation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__BOOLEANOPERATION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.ComparisonImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 17;

	/**
	 * The feature id for the '<em><b>Booleanoperation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__BOOLEANOPERATION = CONDITION__BOOLEANOPERATION;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__LHS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__RHS = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparisonoperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__COMPARISONOPERATOR = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.Existence <em>Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.Existence
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getExistence()
	 * @generated
	 */
	int EXISTENCE = 18;

	/**
	 * The feature id for the '<em><b>Booleanoperation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__BOOLEANOPERATION = CONDITION__BOOLEANOPERATION;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__SELECT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.ExistsImpl <em>Exists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.ExistsImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getExists()
	 * @generated
	 */
	int EXISTS = 19;

	/**
	 * The feature id for the '<em><b>Booleanoperation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS__BOOLEANOPERATION = EXISTENCE__BOOLEANOPERATION;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS__SELECT = EXISTENCE__SELECT;

	/**
	 * The number of structural features of the '<em>Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_FEATURE_COUNT = EXISTENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATION_COUNT = EXISTENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.adsa.emf.sql.model.model.impl.NotExistsImpl <em>Not Exists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.adsa.emf.sql.model.model.impl.NotExistsImpl
	 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getNotExists()
	 * @generated
	 */
	int NOT_EXISTS = 20;

	/**
	 * The feature id for the '<em><b>Booleanoperation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXISTS__BOOLEANOPERATION = EXISTENCE__BOOLEANOPERATION;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXISTS__SELECT = EXISTENCE__SELECT;

	/**
	 * The number of structural features of the '<em>Not Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXISTS_FEATURE_COUNT = EXISTENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXISTS_OPERATION_COUNT = EXISTENCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see com.adsa.emf.sql.model.model.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the containment reference list '{@link com.adsa.emf.sql.model.model.Select#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see com.adsa.emf.sql.model.model.Select#getColumn()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Column();

	/**
	 * Returns the meta object for the containment reference '{@link com.adsa.emf.sql.model.model.Select#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see com.adsa.emf.sql.model.model.Select#getFrom()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_From();

	/**
	 * Returns the meta object for the containment reference '{@link com.adsa.emf.sql.model.model.Select#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see com.adsa.emf.sql.model.model.Select#getWhere()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Where();

	/**
	 * Returns the meta object for the containment reference '{@link com.adsa.emf.sql.model.model.Select#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Union</em>'.
	 * @see com.adsa.emf.sql.model.model.Select#getUnion()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Union();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see com.adsa.emf.sql.model.model.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.adsa.emf.sql.model.model.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.adsa.emf.sql.model.model.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.adsa.emf.sql.model.model.Column#getColumnalias <em>Columnalias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Columnalias</em>'.
	 * @see com.adsa.emf.sql.model.model.Column#getColumnalias()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Columnalias();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.From <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From</em>'.
	 * @see com.adsa.emf.sql.model.model.From
	 * @generated
	 */
	EClass getFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link com.adsa.emf.sql.model.model.From#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see com.adsa.emf.sql.model.model.From#getTable()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_Table();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see com.adsa.emf.sql.model.model.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link com.adsa.emf.sql.model.model.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.adsa.emf.sql.model.model.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.adsa.emf.sql.model.model.Table#getTablealias <em>Tablealias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tablealias</em>'.
	 * @see com.adsa.emf.sql.model.model.Table#getTablealias()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Tablealias();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where</em>'.
	 * @see com.adsa.emf.sql.model.model.Where
	 * @generated
	 */
	EClass getWhere();

	/**
	 * Returns the meta object for the containment reference '{@link com.adsa.emf.sql.model.model.Where#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.adsa.emf.sql.model.model.Where#getCondition()
	 * @see #getWhere()
	 * @generated
	 */
	EReference getWhere_Condition();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.BooleanOperation <em>Boolean Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operation</em>'.
	 * @see com.adsa.emf.sql.model.model.BooleanOperation
	 * @generated
	 */
	EClass getBooleanOperation();

	/**
	 * Returns the meta object for the containment reference '{@link com.adsa.emf.sql.model.model.BooleanOperation#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.adsa.emf.sql.model.model.BooleanOperation#getCondition()
	 * @see #getBooleanOperation()
	 * @generated
	 */
	EReference getBooleanOperation_Condition();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Operator</em>'.
	 * @see com.adsa.emf.sql.model.model.ComparisonOperator
	 * @generated
	 */
	EClass getComparisonOperator();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see com.adsa.emf.sql.model.model.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the containment reference '{@link com.adsa.emf.sql.model.model.Union#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see com.adsa.emf.sql.model.model.Union#getSelect()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_Select();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see com.adsa.emf.sql.model.model.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see com.adsa.emf.sql.model.model.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see com.adsa.emf.sql.model.model.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.NotEquals <em>Not Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Equals</em>'.
	 * @see com.adsa.emf.sql.model.model.NotEquals
	 * @generated
	 */
	EClass getNotEquals();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see com.adsa.emf.sql.model.model.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see com.adsa.emf.sql.model.model.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.ColumnAlias <em>Column Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Alias</em>'.
	 * @see com.adsa.emf.sql.model.model.ColumnAlias
	 * @generated
	 */
	EClass getColumnAlias();

	/**
	 * Returns the meta object for the attribute '{@link com.adsa.emf.sql.model.model.ColumnAlias#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.adsa.emf.sql.model.model.ColumnAlias#getName()
	 * @see #getColumnAlias()
	 * @generated
	 */
	EAttribute getColumnAlias_Name();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.TableAlias <em>Table Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Alias</em>'.
	 * @see com.adsa.emf.sql.model.model.TableAlias
	 * @generated
	 */
	EClass getTableAlias();

	/**
	 * Returns the meta object for the attribute '{@link com.adsa.emf.sql.model.model.TableAlias#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.adsa.emf.sql.model.model.TableAlias#getName()
	 * @see #getTableAlias()
	 * @generated
	 */
	EAttribute getTableAlias_Name();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see com.adsa.emf.sql.model.model.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link com.adsa.emf.sql.model.model.Condition#getBooleanoperation <em>Booleanoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Booleanoperation</em>'.
	 * @see com.adsa.emf.sql.model.model.Condition#getBooleanoperation()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Booleanoperation();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see com.adsa.emf.sql.model.model.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the attribute '{@link com.adsa.emf.sql.model.model.Comparison#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lhs</em>'.
	 * @see com.adsa.emf.sql.model.model.Comparison#getLhs()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Lhs();

	/**
	 * Returns the meta object for the attribute '{@link com.adsa.emf.sql.model.model.Comparison#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rhs</em>'.
	 * @see com.adsa.emf.sql.model.model.Comparison#getRhs()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Rhs();

	/**
	 * Returns the meta object for the containment reference '{@link com.adsa.emf.sql.model.model.Comparison#getComparisonoperator <em>Comparisonoperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparisonoperator</em>'.
	 * @see com.adsa.emf.sql.model.model.Comparison#getComparisonoperator()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_Comparisonoperator();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.Existence <em>Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence</em>'.
	 * @see com.adsa.emf.sql.model.model.Existence
	 * @generated
	 */
	EClass getExistence();

	/**
	 * Returns the meta object for the containment reference '{@link com.adsa.emf.sql.model.model.Existence#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see com.adsa.emf.sql.model.model.Existence#getSelect()
	 * @see #getExistence()
	 * @generated
	 */
	EReference getExistence_Select();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.Exists <em>Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exists</em>'.
	 * @see com.adsa.emf.sql.model.model.Exists
	 * @generated
	 */
	EClass getExists();

	/**
	 * Returns the meta object for class '{@link com.adsa.emf.sql.model.model.NotExists <em>Not Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Exists</em>'.
	 * @see com.adsa.emf.sql.model.model.NotExists
	 * @generated
	 */
	EClass getNotExists();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.SelectImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__COLUMN = eINSTANCE.getSelect_Column();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__FROM = eINSTANCE.getSelect_From();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__WHERE = eINSTANCE.getSelect_Where();

		/**
		 * The meta object literal for the '<em><b>Union</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__UNION = eINSTANCE.getSelect_Union();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.ColumnImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Columnalias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__COLUMNALIAS = eINSTANCE.getColumn_Columnalias();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.FromImpl <em>From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.FromImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getFrom()
		 * @generated
		 */
		EClass FROM = eINSTANCE.getFrom();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__TABLE = eINSTANCE.getFrom_Table();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.TableImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Tablealias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLEALIAS = eINSTANCE.getTable_Tablealias();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.WhereImpl <em>Where</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.WhereImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getWhere()
		 * @generated
		 */
		EClass WHERE = eINSTANCE.getWhere();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHERE__CONDITION = eINSTANCE.getWhere_Condition();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.BooleanOperation <em>Boolean Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.BooleanOperation
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getBooleanOperation()
		 * @generated
		 */
		EClass BOOLEAN_OPERATION = eINSTANCE.getBooleanOperation();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_OPERATION__CONDITION = eINSTANCE.getBooleanOperation_Condition();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.ComparisonOperator <em>Comparison Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.ComparisonOperator
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EClass COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.UnionImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getUnion()
		 * @generated
		 */
		EClass UNION = eINSTANCE.getUnion();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION__SELECT = eINSTANCE.getUnion_Select();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.EqualsImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.GreaterThanImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.LessThanImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.NotEqualsImpl <em>Not Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.NotEqualsImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getNotEquals()
		 * @generated
		 */
		EClass NOT_EQUALS = eINSTANCE.getNotEquals();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.AndImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.OrImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.ColumnAliasImpl <em>Column Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.ColumnAliasImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getColumnAlias()
		 * @generated
		 */
		EClass COLUMN_ALIAS = eINSTANCE.getColumnAlias();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_ALIAS__NAME = eINSTANCE.getColumnAlias_Name();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.TableAliasImpl <em>Table Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.TableAliasImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getTableAlias()
		 * @generated
		 */
		EClass TABLE_ALIAS = eINSTANCE.getTableAlias();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ALIAS__NAME = eINSTANCE.getTableAlias_Name();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.Condition <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.Condition
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Booleanoperation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__BOOLEANOPERATION = eINSTANCE.getCondition_Booleanoperation();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.ComparisonImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__LHS = eINSTANCE.getComparison_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__RHS = eINSTANCE.getComparison_Rhs();

		/**
		 * The meta object literal for the '<em><b>Comparisonoperator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__COMPARISONOPERATOR = eINSTANCE.getComparison_Comparisonoperator();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.Existence <em>Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.Existence
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getExistence()
		 * @generated
		 */
		EClass EXISTENCE = eINSTANCE.getExistence();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTENCE__SELECT = eINSTANCE.getExistence_Select();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.ExistsImpl <em>Exists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.ExistsImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getExists()
		 * @generated
		 */
		EClass EXISTS = eINSTANCE.getExists();

		/**
		 * The meta object literal for the '{@link com.adsa.emf.sql.model.model.impl.NotExistsImpl <em>Not Exists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.adsa.emf.sql.model.model.impl.NotExistsImpl
		 * @see com.adsa.emf.sql.model.model.impl.ModelPackageImpl#getNotExists()
		 * @generated
		 */
		EClass NOT_EXISTS = eINSTANCE.getNotExists();

	}

} //ModelPackage
