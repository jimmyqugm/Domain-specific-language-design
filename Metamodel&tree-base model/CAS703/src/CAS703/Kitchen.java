/**
 */
package CAS703;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kitchen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAS703.Kitchen#getRecipes <em>Recipes</em>}</li>
 * </ul>
 *
 * @see CAS703.CAS703Package#getKitchen()
 * @model
 * @generated
 */
public interface Kitchen extends Node {
	/**
	 * Returns the value of the '<em><b>Recipes</b></em>' containment reference list.
	 * The list contents are of type {@link CAS703.Recipe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipes</em>' containment reference list.
	 * @see CAS703.CAS703Package#getKitchen_Recipes()
	 * @model containment="true" lower="6" upper="6"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Recipe> getRecipes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int make();

} // Kitchen
