/**
 */
package CAS703;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAS703.Customer#getOrders <em>Orders</em>}</li>
 * </ul>
 *
 * @see CAS703.CAS703Package#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends Node {
	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link CAS703.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see CAS703.CAS703Package#getCustomer_Orders()
	 * @model containment="true" lower="6" upper="6"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int serve();

} // Customer
