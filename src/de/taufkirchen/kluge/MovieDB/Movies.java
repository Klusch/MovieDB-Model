/**
 */
package de.taufkirchen.kluge.MovieDB;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.taufkirchen.kluge.MovieDB.Movies#getID <em>ID</em>}</li>
 *   <li>{@link de.taufkirchen.kluge.MovieDB.Movies#getTitle <em>Title</em>}</li>
 *   <li>{@link de.taufkirchen.kluge.MovieDB.Movies#getThreeD <em>Three D</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.taufkirchen.kluge.MovieDB.MovieDBPackage#getMovies()
 * @model
 * @generated
 */
public interface Movies extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(Integer)
	 * @see de.taufkirchen.kluge.MovieDB.MovieDBPackage#getMovies_ID()
	 * @model
	 * @generated
	 */
	Integer getID();

	/**
	 * Sets the value of the '{@link de.taufkirchen.kluge.MovieDB.Movies#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(Integer value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.taufkirchen.kluge.MovieDB.MovieDBPackage#getMovies_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.taufkirchen.kluge.MovieDB.Movies#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Three D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Three D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Three D</em>' attribute.
	 * @see #setThreeD(Boolean)
	 * @see de.taufkirchen.kluge.MovieDB.MovieDBPackage#getMovies_ThreeD()
	 * @model
	 * @generated
	 */
	Boolean getThreeD();

	/**
	 * Sets the value of the '{@link de.taufkirchen.kluge.MovieDB.Movies#getThreeD <em>Three D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Three D</em>' attribute.
	 * @see #getThreeD()
	 * @generated
	 */
	void setThreeD(Boolean value);

} // Movies
