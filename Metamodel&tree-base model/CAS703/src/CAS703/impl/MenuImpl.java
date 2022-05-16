/**
 */
package CAS703.impl;

import CAS703.CAS703Package;
import CAS703.Flavor;
import CAS703.Menu;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CAS703.impl.MenuImpl#getIceCream <em>Ice Cream</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuImpl extends NodeImpl implements Menu {
	/**
	 * The cached value of the '{@link #getIceCream() <em>Ice Cream</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIceCream()
	 * @generated
	 * @ordered
	 */
	protected EList<Flavor> iceCream;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAS703Package.Literals.MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Flavor> getIceCream() {
		if (iceCream == null) {
			iceCream = new EObjectContainmentEList<Flavor>(Flavor.class, this, CAS703Package.MENU__ICE_CREAM);
		}
		return iceCream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAS703Package.MENU__ICE_CREAM:
				return ((InternalEList<?>)getIceCream()).basicRemove(otherEnd, msgs);
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
			case CAS703Package.MENU__ICE_CREAM:
				return getIceCream();
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
			case CAS703Package.MENU__ICE_CREAM:
				getIceCream().clear();
				getIceCream().addAll((Collection<? extends Flavor>)newValue);
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
			case CAS703Package.MENU__ICE_CREAM:
				getIceCream().clear();
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
			case CAS703Package.MENU__ICE_CREAM:
				return iceCream != null && !iceCream.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MenuImpl
