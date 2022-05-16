/**
 */
package CAS703;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAS703.Material#getLabel <em>Label</em>}</li>
 *   <li>{@link CAS703.Material#getSource <em>Source</em>}</li>
 *   <li>{@link CAS703.Material#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see CAS703.CAS703Package#getMaterial()
 * @model annotation="gmf.link source='source' target='target' label='label' target.decoration='arrow'"
 * @generated
 */
public interface Material extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see CAS703.CAS703Package#getMaterial_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link CAS703.Material#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Ingredient)
	 * @see CAS703.CAS703Package#getMaterial_Source()
	 * @model
	 * @generated
	 */
	Ingredient getSource();

	/**
	 * Sets the value of the '{@link CAS703.Material#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Ingredient value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Ingredient)
	 * @see CAS703.CAS703Package#getMaterial_Target()
	 * @model
	 * @generated
	 */
	Ingredient getTarget();

	/**
	 * Sets the value of the '{@link CAS703.Material#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Ingredient value);

} // Material
