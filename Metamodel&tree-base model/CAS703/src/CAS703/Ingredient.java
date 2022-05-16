/**
 */
package CAS703;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAS703.Ingredient#getLabel <em>Label</em>}</li>
 *   <li>{@link CAS703.Ingredient#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see CAS703.CAS703Package#getIngredient()
 * @model annotation="gmf.node label='label'"
 * @generated
 */
public interface Ingredient extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see CAS703.CAS703Package#getIngredient_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link CAS703.Ingredient#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link CAS703.Ingredients}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see CAS703.Ingredients
	 * @see #setName(Ingredients)
	 * @see CAS703.CAS703Package#getIngredient_Name()
	 * @model
	 * @generated
	 */
	Ingredients getName();

	/**
	 * Sets the value of the '{@link CAS703.Ingredient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see CAS703.Ingredients
	 * @see #getName()
	 * @generated
	 */
	void setName(Ingredients value);

} // Ingredient
