/**
 */
package CAS703;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ice Cream shop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAS703.IceCream_shop#getList <em>List</em>}</li>
 *   <li>{@link CAS703.IceCream_shop#getCustomers <em>Customers</em>}</li>
 *   <li>{@link CAS703.IceCream_shop#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link CAS703.IceCream_shop#getInventory <em>Inventory</em>}</li>
 *   <li>{@link CAS703.IceCream_shop#getMaterials <em>Materials</em>}</li>
 *   <li>{@link CAS703.IceCream_shop#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see CAS703.CAS703Package#getIceCream_shop()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface IceCream_shop extends EObject {
	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(Menu)
	 * @see CAS703.CAS703Package#getIceCream_shop_List()
	 * @model containment="true"
	 * @generated
	 */
	Menu getList();

	/**
	 * Sets the value of the '{@link CAS703.IceCream_shop#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(Menu value);

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference.
	 * @see #setCustomers(Customer)
	 * @see CAS703.CAS703Package#getIceCream_shop_Customers()
	 * @model containment="true"
	 * @generated
	 */
	Customer getCustomers();

	/**
	 * Sets the value of the '{@link CAS703.IceCream_shop#getCustomers <em>Customers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customers</em>' containment reference.
	 * @see #getCustomers()
	 * @generated
	 */
	void setCustomers(Customer value);

	/**
	 * Returns the value of the '<em><b>Recipes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipes</em>' containment reference.
	 * @see #setRecipes(Kitchen)
	 * @see CAS703.CAS703Package#getIceCream_shop_Recipes()
	 * @model containment="true"
	 * @generated
	 */
	Kitchen getRecipes();

	/**
	 * Sets the value of the '{@link CAS703.IceCream_shop#getRecipes <em>Recipes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipes</em>' containment reference.
	 * @see #getRecipes()
	 * @generated
	 */
	void setRecipes(Kitchen value);

	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory</em>' containment reference.
	 * @see #setInventory(Storage)
	 * @see CAS703.CAS703Package#getIceCream_shop_Inventory()
	 * @model containment="true"
	 * @generated
	 */
	Storage getInventory();

	/**
	 * Sets the value of the '{@link CAS703.IceCream_shop#getInventory <em>Inventory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory</em>' containment reference.
	 * @see #getInventory()
	 * @generated
	 */
	void setInventory(Storage value);

	/**
	 * Returns the value of the '<em><b>Materials</b></em>' containment reference list.
	 * The list contents are of type {@link CAS703.Material}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materials</em>' containment reference list.
	 * @see CAS703.CAS703Package#getIceCream_shop_Materials()
	 * @model containment="true"
	 * @generated
	 */
	EList<Material> getMaterials();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link CAS703.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see CAS703.CAS703Package#getIceCream_shop_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // IceCream_shop
