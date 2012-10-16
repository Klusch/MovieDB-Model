/**
 */
package de.taufkirchen.kluge.MovieDB.impl;

import de.taufkirchen.kluge.MovieDB.MovieDBPackage;
import de.taufkirchen.kluge.MovieDB.Movies;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.taufkirchen.kluge.MovieDB.impl.MoviesImpl#getID <em>ID</em>}</li>
 *   <li>{@link de.taufkirchen.kluge.MovieDB.impl.MoviesImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.taufkirchen.kluge.MovieDB.impl.MoviesImpl#getThreeD <em>Three D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoviesImpl extends EObjectImpl implements Movies {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreeD() <em>Three D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreeD()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean THREE_D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreeD() <em>Three D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreeD()
	 * @generated
	 * @ordered
	 */
	protected Boolean threeD = THREE_D_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoviesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MovieDBPackage.Literals.MOVIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(Integer newID) {
		Integer oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MovieDBPackage.MOVIES__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MovieDBPackage.MOVIES__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getThreeD() {
		return threeD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreeD(Boolean newThreeD) {
		Boolean oldThreeD = threeD;
		threeD = newThreeD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MovieDBPackage.MOVIES__THREE_D, oldThreeD, threeD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MovieDBPackage.MOVIES__ID:
				return getID();
			case MovieDBPackage.MOVIES__TITLE:
				return getTitle();
			case MovieDBPackage.MOVIES__THREE_D:
				return getThreeD();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MovieDBPackage.MOVIES__ID:
				setID((Integer)newValue);
				return;
			case MovieDBPackage.MOVIES__TITLE:
				setTitle((String)newValue);
				return;
			case MovieDBPackage.MOVIES__THREE_D:
				setThreeD((Boolean)newValue);
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
			case MovieDBPackage.MOVIES__ID:
				setID(ID_EDEFAULT);
				return;
			case MovieDBPackage.MOVIES__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case MovieDBPackage.MOVIES__THREE_D:
				setThreeD(THREE_D_EDEFAULT);
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
			case MovieDBPackage.MOVIES__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MovieDBPackage.MOVIES__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case MovieDBPackage.MOVIES__THREE_D:
				return THREE_D_EDEFAULT == null ? threeD != null : !THREE_D_EDEFAULT.equals(threeD);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", Title: ");
		result.append(title);
		result.append(", ThreeD: ");
		result.append(threeD);
		result.append(')');
		return result.toString();
	}

} //MoviesImpl
