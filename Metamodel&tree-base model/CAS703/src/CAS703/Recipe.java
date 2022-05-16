/**
 */
package CAS703;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAS703.Recipe#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @see CAS703.CAS703Package#getRecipe()
 * @model
 * @generated
 */
public interface Recipe extends Flavor {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference.
	 * @see #setUses(Use)
	 * @see CAS703.CAS703Package#getRecipe_Uses()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	Use getUses();

	/**
	 * Sets the value of the '{@link CAS703.Recipe#getUses <em>Uses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' containment reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(Use value);

} // Recipe
