/**
 */
package CAS703;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAS703.Menu#getIceCream <em>Ice Cream</em>}</li>
 * </ul>
 *
 * @see CAS703.CAS703Package#getMenu()
 * @model
 * @generated
 */
public interface Menu extends Node {
	/**
	 * Returns the value of the '<em><b>Ice Cream</b></em>' containment reference list.
	 * The list contents are of type {@link CAS703.Flavor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ice Cream</em>' containment reference list.
	 * @see CAS703.CAS703Package#getMenu_IceCream()
	 * @model containment="true" lower="6" upper="6"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Flavor> getIceCream();

} // Menu
