/**
 */
package CAS703;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAS703.Storage#getInventories <em>Inventories</em>}</li>
 * </ul>
 *
 * @see CAS703.CAS703Package#getStorage()
 * @model
 * @generated
 */
public interface Storage extends Node {
	/**
	 * Returns the value of the '<em><b>Inventories</b></em>' containment reference list.
	 * The list contents are of type {@link CAS703.Inventory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventories</em>' containment reference list.
	 * @see CAS703.CAS703Package#getStorage_Inventories()
	 * @model containment="true" lower="6" upper="6"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Inventory> getInventories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int Cost();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean Alert();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int add();

} // Storage
