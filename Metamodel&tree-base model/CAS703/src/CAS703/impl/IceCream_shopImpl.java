/**
 */
package CAS703.impl;

import CAS703.CAS703Package;
import CAS703.Customer;
import CAS703.IceCream_shop;
import CAS703.Kitchen;
import CAS703.Material;
import CAS703.Menu;
import CAS703.Storage;

import CAS703.Transition;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ice Cream shop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CAS703.impl.IceCream_shopImpl#getList <em>List</em>}</li>
 *   <li>{@link CAS703.impl.IceCream_shopImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link CAS703.impl.IceCream_shopImpl#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link CAS703.impl.IceCream_shopImpl#getInventory <em>Inventory</em>}</li>
 *   <li>{@link CAS703.impl.IceCream_shopImpl#getMaterials <em>Materials</em>}</li>
 *   <li>{@link CAS703.impl.IceCream_shopImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IceCream_shopImpl extends EObjectImpl implements IceCream_shop {
	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected Menu list;

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected Customer customers;

	/**
	 * The cached value of the '{@link #getRecipes() <em>Recipes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipes()
	 * @generated
	 * @ordered
	 */
	protected Kitchen recipes;

	/**
	 * The cached value of the '{@link #getInventory() <em>Inventory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventory()
	 * @generated
	 * @ordered
	 */
	protected Storage inventory;

	/**
	 * The cached value of the '{@link #getMaterials() <em>Materials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<Material> materials;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IceCream_shopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAS703Package.Literals.ICE_CREAM_SHOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Menu getList() {
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(Menu newList, NotificationChain msgs) {
		Menu oldList = list;
		list = newList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CAS703Package.ICE_CREAM_SHOP__LIST, oldList, newList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setList(Menu newList) {
		if (newList != list) {
			NotificationChain msgs = null;
			if (list != null)
				msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CAS703Package.ICE_CREAM_SHOP__LIST, null, msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CAS703Package.ICE_CREAM_SHOP__LIST, null, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAS703Package.ICE_CREAM_SHOP__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer getCustomers() {
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomers(Customer newCustomers, NotificationChain msgs) {
		Customer oldCustomers = customers;
		customers = newCustomers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CAS703Package.ICE_CREAM_SHOP__CUSTOMERS, oldCustomers, newCustomers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomers(Customer newCustomers) {
		if (newCustomers != customers) {
			NotificationChain msgs = null;
			if (customers != null)
				msgs = ((InternalEObject)customers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CAS703Package.ICE_CREAM_SHOP__CUSTOMERS, null, msgs);
			if (newCustomers != null)
				msgs = ((InternalEObject)newCustomers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CAS703Package.ICE_CREAM_SHOP__CUSTOMERS, null, msgs);
			msgs = basicSetCustomers(newCustomers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAS703Package.ICE_CREAM_SHOP__CUSTOMERS, newCustomers, newCustomers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kitchen getRecipes() {
		return recipes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipes(Kitchen newRecipes, NotificationChain msgs) {
		Kitchen oldRecipes = recipes;
		recipes = newRecipes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CAS703Package.ICE_CREAM_SHOP__RECIPES, oldRecipes, newRecipes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecipes(Kitchen newRecipes) {
		if (newRecipes != recipes) {
			NotificationChain msgs = null;
			if (recipes != null)
				msgs = ((InternalEObject)recipes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CAS703Package.ICE_CREAM_SHOP__RECIPES, null, msgs);
			if (newRecipes != null)
				msgs = ((InternalEObject)newRecipes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CAS703Package.ICE_CREAM_SHOP__RECIPES, null, msgs);
			msgs = basicSetRecipes(newRecipes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAS703Package.ICE_CREAM_SHOP__RECIPES, newRecipes, newRecipes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Storage getInventory() {
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInventory(Storage newInventory, NotificationChain msgs) {
		Storage oldInventory = inventory;
		inventory = newInventory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CAS703Package.ICE_CREAM_SHOP__INVENTORY, oldInventory, newInventory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventory(Storage newInventory) {
		if (newInventory != inventory) {
			NotificationChain msgs = null;
			if (inventory != null)
				msgs = ((InternalEObject)inventory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CAS703Package.ICE_CREAM_SHOP__INVENTORY, null, msgs);
			if (newInventory != null)
				msgs = ((InternalEObject)newInventory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CAS703Package.ICE_CREAM_SHOP__INVENTORY, null, msgs);
			msgs = basicSetInventory(newInventory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAS703Package.ICE_CREAM_SHOP__INVENTORY, newInventory, newInventory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Material> getMaterials() {
		if (materials == null) {
			materials = new EObjectContainmentEList<Material>(Material.class, this, CAS703Package.ICE_CREAM_SHOP__MATERIALS);
		}
		return materials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, CAS703Package.ICE_CREAM_SHOP__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAS703Package.ICE_CREAM_SHOP__LIST:
				return basicSetList(null, msgs);
			case CAS703Package.ICE_CREAM_SHOP__CUSTOMERS:
				return basicSetCustomers(null, msgs);
			case CAS703Package.ICE_CREAM_SHOP__RECIPES:
				return basicSetRecipes(null, msgs);
			case CAS703Package.ICE_CREAM_SHOP__INVENTORY:
				return basicSetInventory(null, msgs);
			case CAS703Package.ICE_CREAM_SHOP__MATERIALS:
				return ((InternalEList<?>)getMaterials()).basicRemove(otherEnd, msgs);
			case CAS703Package.ICE_CREAM_SHOP__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAS703Package.ICE_CREAM_SHOP__LIST:
				return getList();
			case CAS703Package.ICE_CREAM_SHOP__CUSTOMERS:
				return getCustomers();
			case CAS703Package.ICE_CREAM_SHOP__RECIPES:
				return getRecipes();
			case CAS703Package.ICE_CREAM_SHOP__INVENTORY:
				return getInventory();
			case CAS703Package.ICE_CREAM_SHOP__MATERIALS:
				return getMaterials();
			case CAS703Package.ICE_CREAM_SHOP__TRANSITIONS:
				return getTransitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CAS703Package.ICE_CREAM_SHOP__LIST:
				setList((Menu)newValue);
				return;
			case CAS703Package.ICE_CREAM_SHOP__CUSTOMERS:
				setCustomers((Customer)newValue);
				return;
			case CAS703Package.ICE_CREAM_SHOP__RECIPES:
				setRecipes((Kitchen)newValue);
				return;
			case CAS703Package.ICE_CREAM_SHOP__INVENTORY:
				setInventory((Storage)newValue);
				return;
			case CAS703Package.ICE_CREAM_SHOP__MATERIALS:
				getMaterials().clear();
				getMaterials().addAll((Collection<? extends Material>)newValue);
				return;
			case CAS703Package.ICE_CREAM_SHOP__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CAS703Package.ICE_CREAM_SHOP__LIST:
				setList((Menu)null);
				return;
			case CAS703Package.ICE_CREAM_SHOP__CUSTOMERS:
				setCustomers((Customer)null);
				return;
			case CAS703Package.ICE_CREAM_SHOP__RECIPES:
				setRecipes((Kitchen)null);
				return;
			case CAS703Package.ICE_CREAM_SHOP__INVENTORY:
				setInventory((Storage)null);
				return;
			case CAS703Package.ICE_CREAM_SHOP__MATERIALS:
				getMaterials().clear();
				return;
			case CAS703Package.ICE_CREAM_SHOP__TRANSITIONS:
				getTransitions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CAS703Package.ICE_CREAM_SHOP__LIST:
				return list != null;
			case CAS703Package.ICE_CREAM_SHOP__CUSTOMERS:
				return customers != null;
			case CAS703Package.ICE_CREAM_SHOP__RECIPES:
				return recipes != null;
			case CAS703Package.ICE_CREAM_SHOP__INVENTORY:
				return inventory != null;
			case CAS703Package.ICE_CREAM_SHOP__MATERIALS:
				return materials != null && !materials.isEmpty();
			case CAS703Package.ICE_CREAM_SHOP__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IceCream_shopImpl
