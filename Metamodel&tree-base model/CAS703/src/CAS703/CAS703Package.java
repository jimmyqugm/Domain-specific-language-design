/**
 */
package CAS703;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CAS703.CAS703Factory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface CAS703Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CAS703";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "CAS703";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CAS703";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CAS703Package eINSTANCE = CAS703.impl.CAS703PackageImpl.init();

	/**
	 * The meta object id for the '{@link CAS703.impl.IceCream_shopImpl <em>Ice Cream shop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.IceCream_shopImpl
	 * @see CAS703.impl.CAS703PackageImpl#getIceCream_shop()
	 * @generated
	 */
	int ICE_CREAM_SHOP = 0;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_CREAM_SHOP__LIST = 0;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_CREAM_SHOP__CUSTOMERS = 1;

	/**
	 * The feature id for the '<em><b>Recipes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_CREAM_SHOP__RECIPES = 2;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_CREAM_SHOP__INVENTORY = 3;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_CREAM_SHOP__MATERIALS = 4;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_CREAM_SHOP__TRANSITIONS = 5;

	/**
	 * The number of structural features of the '<em>Ice Cream shop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICE_CREAM_SHOP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link CAS703.impl.IngredientImpl <em>Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.IngredientImpl
	 * @see CAS703.impl.CAS703PackageImpl#getIngredient()
	 * @generated
	 */
	int INGREDIENT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link CAS703.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.NodeImpl
	 * @see CAS703.impl.CAS703PackageImpl#getNode()
	 * @generated
	 */
	int NODE = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link CAS703.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.MenuImpl
	 * @see CAS703.impl.CAS703PackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Ice Cream</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ICE_CREAM = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CAS703.impl.FlavorImpl <em>Flavor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.FlavorImpl
	 * @see CAS703.impl.CAS703PackageImpl#getFlavor()
	 * @generated
	 */
	int FLAVOR = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__LABEL = INGREDIENT__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__NAME = INGREDIENT__NAME;

	/**
	 * The number of structural features of the '<em>Flavor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAS703.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.CustomerImpl
	 * @see CAS703.impl.CAS703PackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ORDERS = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CAS703.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.OrderImpl
	 * @see CAS703.impl.CAS703PackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__LABEL = FLAVOR__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__NAME = FLAVOR__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__NUMBER = FLAVOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = FLAVOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CAS703.impl.KitchenImpl <em>Kitchen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.KitchenImpl
	 * @see CAS703.impl.CAS703PackageImpl#getKitchen()
	 * @generated
	 */
	int KITCHEN = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Recipes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__RECIPES = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kitchen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CAS703.impl.RecipeImpl <em>Recipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.RecipeImpl
	 * @see CAS703.impl.CAS703PackageImpl#getRecipe()
	 * @generated
	 */
	int RECIPE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__LABEL = FLAVOR__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__NAME = FLAVOR__NAME;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__USES = FLAVOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_FEATURE_COUNT = FLAVOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CAS703.impl.UseImpl <em>Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.UseImpl
	 * @see CAS703.impl.CAS703PackageImpl#getUse()
	 * @generated
	 */
	int USE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__LABEL = INGREDIENT__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__NAME = INGREDIENT__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__NUMBER = INGREDIENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CAS703.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.StorageImpl
	 * @see CAS703.impl.CAS703PackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__INCOMING = NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Inventories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__INVENTORIES = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CAS703.impl.InventoryImpl <em>Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.InventoryImpl
	 * @see CAS703.impl.CAS703PackageImpl#getInventory()
	 * @generated
	 */
	int INVENTORY = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__LABEL = INGREDIENT__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__NAME = INGREDIENT__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__NUMBER = INGREDIENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CAS703.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.MaterialImpl
	 * @see CAS703.impl.CAS703PackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link CAS703.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.impl.TransitionImpl
	 * @see CAS703.impl.CAS703PackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link CAS703.Ingredients <em>Ingredients</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAS703.Ingredients
	 * @see CAS703.impl.CAS703PackageImpl#getIngredients()
	 * @generated
	 */
	int INGREDIENTS = 14;


	/**
	 * Returns the meta object for class '{@link CAS703.IceCream_shop <em>Ice Cream shop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ice Cream shop</em>'.
	 * @see CAS703.IceCream_shop
	 * @generated
	 */
	EClass getIceCream_shop();

	/**
	 * Returns the meta object for the containment reference '{@link CAS703.IceCream_shop#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see CAS703.IceCream_shop#getList()
	 * @see #getIceCream_shop()
	 * @generated
	 */
	EReference getIceCream_shop_List();

	/**
	 * Returns the meta object for the containment reference '{@link CAS703.IceCream_shop#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customers</em>'.
	 * @see CAS703.IceCream_shop#getCustomers()
	 * @see #getIceCream_shop()
	 * @generated
	 */
	EReference getIceCream_shop_Customers();

	/**
	 * Returns the meta object for the containment reference '{@link CAS703.IceCream_shop#getRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipes</em>'.
	 * @see CAS703.IceCream_shop#getRecipes()
	 * @see #getIceCream_shop()
	 * @generated
	 */
	EReference getIceCream_shop_Recipes();

	/**
	 * Returns the meta object for the containment reference '{@link CAS703.IceCream_shop#getInventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inventory</em>'.
	 * @see CAS703.IceCream_shop#getInventory()
	 * @see #getIceCream_shop()
	 * @generated
	 */
	EReference getIceCream_shop_Inventory();

	/**
	 * Returns the meta object for the containment reference list '{@link CAS703.IceCream_shop#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Materials</em>'.
	 * @see CAS703.IceCream_shop#getMaterials()
	 * @see #getIceCream_shop()
	 * @generated
	 */
	EReference getIceCream_shop_Materials();

	/**
	 * Returns the meta object for the containment reference list '{@link CAS703.IceCream_shop#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see CAS703.IceCream_shop#getTransitions()
	 * @see #getIceCream_shop()
	 * @generated
	 */
	EReference getIceCream_shop_Transitions();

	/**
	 * Returns the meta object for class '{@link CAS703.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingredient</em>'.
	 * @see CAS703.Ingredient
	 * @generated
	 */
	EClass getIngredient();

	/**
	 * Returns the meta object for the attribute '{@link CAS703.Ingredient#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see CAS703.Ingredient#getLabel()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Label();

	/**
	 * Returns the meta object for the attribute '{@link CAS703.Ingredient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CAS703.Ingredient#getName()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Name();

	/**
	 * Returns the meta object for class '{@link CAS703.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see CAS703.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link CAS703.Menu#getIceCream <em>Ice Cream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ice Cream</em>'.
	 * @see CAS703.Menu#getIceCream()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_IceCream();

	/**
	 * Returns the meta object for class '{@link CAS703.Flavor <em>Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flavor</em>'.
	 * @see CAS703.Flavor
	 * @generated
	 */
	EClass getFlavor();

	/**
	 * Returns the meta object for class '{@link CAS703.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see CAS703.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the containment reference list '{@link CAS703.Customer#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see CAS703.Customer#getOrders()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Orders();

	/**
	 * Returns the meta object for class '{@link CAS703.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see CAS703.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link CAS703.Order#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see CAS703.Order#getNumber()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Number();

	/**
	 * Returns the meta object for class '{@link CAS703.Kitchen <em>Kitchen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kitchen</em>'.
	 * @see CAS703.Kitchen
	 * @generated
	 */
	EClass getKitchen();

	/**
	 * Returns the meta object for the containment reference list '{@link CAS703.Kitchen#getRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recipes</em>'.
	 * @see CAS703.Kitchen#getRecipes()
	 * @see #getKitchen()
	 * @generated
	 */
	EReference getKitchen_Recipes();

	/**
	 * Returns the meta object for class '{@link CAS703.Recipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipe</em>'.
	 * @see CAS703.Recipe
	 * @generated
	 */
	EClass getRecipe();

	/**
	 * Returns the meta object for the containment reference '{@link CAS703.Recipe#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uses</em>'.
	 * @see CAS703.Recipe#getUses()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_Uses();

	/**
	 * Returns the meta object for class '{@link CAS703.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use</em>'.
	 * @see CAS703.Use
	 * @generated
	 */
	EClass getUse();

	/**
	 * Returns the meta object for the attribute '{@link CAS703.Use#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see CAS703.Use#getNumber()
	 * @see #getUse()
	 * @generated
	 */
	EAttribute getUse_Number();

	/**
	 * Returns the meta object for class '{@link CAS703.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see CAS703.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the containment reference list '{@link CAS703.Storage#getInventories <em>Inventories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventories</em>'.
	 * @see CAS703.Storage#getInventories()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Inventories();

	/**
	 * Returns the meta object for class '{@link CAS703.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory</em>'.
	 * @see CAS703.Inventory
	 * @generated
	 */
	EClass getInventory();

	/**
	 * Returns the meta object for the attribute '{@link CAS703.Inventory#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see CAS703.Inventory#getNumber()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_Number();

	/**
	 * Returns the meta object for class '{@link CAS703.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see CAS703.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the meta object for the attribute '{@link CAS703.Material#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see CAS703.Material#getLabel()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Label();

	/**
	 * Returns the meta object for the reference '{@link CAS703.Material#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see CAS703.Material#getSource()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_Source();

	/**
	 * Returns the meta object for the reference '{@link CAS703.Material#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see CAS703.Material#getTarget()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_Target();

	/**
	 * Returns the meta object for class '{@link CAS703.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see CAS703.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link CAS703.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see CAS703.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Label();

	/**
	 * Returns the meta object for the reference '{@link CAS703.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see CAS703.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link CAS703.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see CAS703.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for class '{@link CAS703.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see CAS703.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link CAS703.Node#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see CAS703.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Label();

	/**
	 * Returns the meta object for the reference list '{@link CAS703.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see CAS703.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link CAS703.Node#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see CAS703.Node#getIncoming()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Incoming();

	/**
	 * Returns the meta object for enum '{@link CAS703.Ingredients <em>Ingredients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ingredients</em>'.
	 * @see CAS703.Ingredients
	 * @generated
	 */
	EEnum getIngredients();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CAS703Factory getCAS703Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CAS703.impl.IceCream_shopImpl <em>Ice Cream shop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.IceCream_shopImpl
		 * @see CAS703.impl.CAS703PackageImpl#getIceCream_shop()
		 * @generated
		 */
		EClass ICE_CREAM_SHOP = eINSTANCE.getIceCream_shop();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_CREAM_SHOP__LIST = eINSTANCE.getIceCream_shop_List();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_CREAM_SHOP__CUSTOMERS = eINSTANCE.getIceCream_shop_Customers();

		/**
		 * The meta object literal for the '<em><b>Recipes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_CREAM_SHOP__RECIPES = eINSTANCE.getIceCream_shop_Recipes();

		/**
		 * The meta object literal for the '<em><b>Inventory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_CREAM_SHOP__INVENTORY = eINSTANCE.getIceCream_shop_Inventory();

		/**
		 * The meta object literal for the '<em><b>Materials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_CREAM_SHOP__MATERIALS = eINSTANCE.getIceCream_shop_Materials();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICE_CREAM_SHOP__TRANSITIONS = eINSTANCE.getIceCream_shop_Transitions();

		/**
		 * The meta object literal for the '{@link CAS703.impl.IngredientImpl <em>Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.IngredientImpl
		 * @see CAS703.impl.CAS703PackageImpl#getIngredient()
		 * @generated
		 */
		EClass INGREDIENT = eINSTANCE.getIngredient();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__LABEL = eINSTANCE.getIngredient_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__NAME = eINSTANCE.getIngredient_Name();

		/**
		 * The meta object literal for the '{@link CAS703.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.MenuImpl
		 * @see CAS703.impl.CAS703PackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Ice Cream</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__ICE_CREAM = eINSTANCE.getMenu_IceCream();

		/**
		 * The meta object literal for the '{@link CAS703.impl.FlavorImpl <em>Flavor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.FlavorImpl
		 * @see CAS703.impl.CAS703PackageImpl#getFlavor()
		 * @generated
		 */
		EClass FLAVOR = eINSTANCE.getFlavor();

		/**
		 * The meta object literal for the '{@link CAS703.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.CustomerImpl
		 * @see CAS703.impl.CAS703PackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ORDERS = eINSTANCE.getCustomer_Orders();

		/**
		 * The meta object literal for the '{@link CAS703.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.OrderImpl
		 * @see CAS703.impl.CAS703PackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__NUMBER = eINSTANCE.getOrder_Number();

		/**
		 * The meta object literal for the '{@link CAS703.impl.KitchenImpl <em>Kitchen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.KitchenImpl
		 * @see CAS703.impl.CAS703PackageImpl#getKitchen()
		 * @generated
		 */
		EClass KITCHEN = eINSTANCE.getKitchen();

		/**
		 * The meta object literal for the '<em><b>Recipes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KITCHEN__RECIPES = eINSTANCE.getKitchen_Recipes();

		/**
		 * The meta object literal for the '{@link CAS703.impl.RecipeImpl <em>Recipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.RecipeImpl
		 * @see CAS703.impl.CAS703PackageImpl#getRecipe()
		 * @generated
		 */
		EClass RECIPE = eINSTANCE.getRecipe();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__USES = eINSTANCE.getRecipe_Uses();

		/**
		 * The meta object literal for the '{@link CAS703.impl.UseImpl <em>Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.UseImpl
		 * @see CAS703.impl.CAS703PackageImpl#getUse()
		 * @generated
		 */
		EClass USE = eINSTANCE.getUse();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE__NUMBER = eINSTANCE.getUse_Number();

		/**
		 * The meta object literal for the '{@link CAS703.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.StorageImpl
		 * @see CAS703.impl.CAS703PackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Inventories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__INVENTORIES = eINSTANCE.getStorage_Inventories();

		/**
		 * The meta object literal for the '{@link CAS703.impl.InventoryImpl <em>Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.InventoryImpl
		 * @see CAS703.impl.CAS703PackageImpl#getInventory()
		 * @generated
		 */
		EClass INVENTORY = eINSTANCE.getInventory();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__NUMBER = eINSTANCE.getInventory_Number();

		/**
		 * The meta object literal for the '{@link CAS703.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.MaterialImpl
		 * @see CAS703.impl.CAS703PackageImpl#getMaterial()
		 * @generated
		 */
		EClass MATERIAL = eINSTANCE.getMaterial();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__LABEL = eINSTANCE.getMaterial_Label();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL__SOURCE = eINSTANCE.getMaterial_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL__TARGET = eINSTANCE.getMaterial_Target();

		/**
		 * The meta object literal for the '{@link CAS703.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.TransitionImpl
		 * @see CAS703.impl.CAS703PackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '{@link CAS703.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.impl.NodeImpl
		 * @see CAS703.impl.CAS703PackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

		/**
		 * The meta object literal for the '{@link CAS703.Ingredients <em>Ingredients</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAS703.Ingredients
		 * @see CAS703.impl.CAS703PackageImpl#getIngredients()
		 * @generated
		 */
		EEnum INGREDIENTS = eINSTANCE.getIngredients();

	}

} //CAS703Package
