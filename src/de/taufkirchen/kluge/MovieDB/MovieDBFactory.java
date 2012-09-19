/**
 */
package de.taufkirchen.kluge.MovieDB;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.taufkirchen.kluge.MovieDB.MovieDBPackage
 * @generated
 */
public interface MovieDBFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MovieDBFactory eINSTANCE = de.taufkirchen.kluge.MovieDB.impl.MovieDBFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Series</em>'.
	 * @generated
	 */
	Series createSeries();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MovieDBPackage getMovieDBPackage();

} //MovieDBFactory
