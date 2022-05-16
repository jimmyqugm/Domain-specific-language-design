/**
 */
package CAS703;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ingredients</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CAS703.CAS703Package#getIngredients()
 * @model
 * @generated
 */
public enum Ingredients implements Enumerator {
	/**
	 * The '<em><b>Vanilla</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VANILLA_VALUE
	 * @generated
	 * @ordered
	 */
	VANILLA(0, "Vanilla", "Vanilla"),

	/**
	 * The '<em><b>Matcha</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATCHA_VALUE
	 * @generated
	 * @ordered
	 */
	MATCHA(1, "Matcha", "Matcha"),

	/**
	 * The '<em><b>Chocolate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOCOLATE_VALUE
	 * @generated
	 * @ordered
	 */
	CHOCOLATE(2, "Chocolate", "Chocolate"),

	/**
	 * The '<em><b>Strawberry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAWBERRY_VALUE
	 * @generated
	 * @ordered
	 */
	STRAWBERRY(3, "Strawberry", "Strawberry"),

	/**
	 * The '<em><b>Coffee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COFFEE_VALUE
	 * @generated
	 * @ordered
	 */
	COFFEE(4, "Coffee", "Coffee"),

	/**
	 * The '<em><b>Mango</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANGO_VALUE
	 * @generated
	 * @ordered
	 */
	MANGO(5, "Mango", "Mango");

	/**
	 * The '<em><b>Vanilla</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VANILLA
	 * @model name="Vanilla"
	 * @generated
	 * @ordered
	 */
	public static final int VANILLA_VALUE = 0;

	/**
	 * The '<em><b>Matcha</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATCHA
	 * @model name="Matcha"
	 * @generated
	 * @ordered
	 */
	public static final int MATCHA_VALUE = 1;

	/**
	 * The '<em><b>Chocolate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOCOLATE
	 * @model name="Chocolate"
	 * @generated
	 * @ordered
	 */
	public static final int CHOCOLATE_VALUE = 2;

	/**
	 * The '<em><b>Strawberry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAWBERRY
	 * @model name="Strawberry"
	 * @generated
	 * @ordered
	 */
	public static final int STRAWBERRY_VALUE = 3;

	/**
	 * The '<em><b>Coffee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COFFEE
	 * @model name="Coffee"
	 * @generated
	 * @ordered
	 */
	public static final int COFFEE_VALUE = 4;

	/**
	 * The '<em><b>Mango</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANGO
	 * @model name="Mango"
	 * @generated
	 * @ordered
	 */
	public static final int MANGO_VALUE = 5;

	/**
	 * An array of all the '<em><b>Ingredients</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Ingredients[] VALUES_ARRAY =
		new Ingredients[] {
			VANILLA,
			MATCHA,
			CHOCOLATE,
			STRAWBERRY,
			COFFEE,
			MANGO,
		};

	/**
	 * A public read-only list of all the '<em><b>Ingredients</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Ingredients> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ingredients</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ingredients get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ingredients result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ingredients</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ingredients getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ingredients result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ingredients</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ingredients get(int value) {
		switch (value) {
			case VANILLA_VALUE: return VANILLA;
			case MATCHA_VALUE: return MATCHA;
			case CHOCOLATE_VALUE: return CHOCOLATE;
			case STRAWBERRY_VALUE: return STRAWBERRY;
			case COFFEE_VALUE: return COFFEE;
			case MANGO_VALUE: return MANGO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Ingredients(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Ingredients
