/**
 */
package de.taufkirchen.kluge.MovieDB;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.taufkirchen.kluge.MovieDB.MovieDBFactory
 * @model kind="package"
 * @generated
 */
public interface MovieDBPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MovieDB";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://moviedb.akluge.de";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.taufkirchen.kluge";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MovieDBPackage eINSTANCE = de.taufkirchen.kluge.MovieDB.impl.MovieDBPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.taufkirchen.kluge.MovieDB.impl.SeriesImpl <em>Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.taufkirchen.kluge.MovieDB.impl.SeriesImpl
	 * @see de.taufkirchen.kluge.MovieDB.impl.MovieDBPackageImpl#getSeries()
	 * @generated
	 */
	int SERIES = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES__ID = 0;

	/**
	 * The number of structural features of the '<em>Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link de.taufkirchen.kluge.MovieDB.impl.MoviesImpl <em>Movies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.taufkirchen.kluge.MovieDB.impl.MoviesImpl
	 * @see de.taufkirchen.kluge.MovieDB.impl.MovieDBPackageImpl#getMovies()
	 * @generated
	 */
	int MOVIES = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIES__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIES__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Three D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIES__THREE_D = 2;

	/**
	 * The number of structural features of the '<em>Movies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIES_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link de.taufkirchen.kluge.MovieDB.Series <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Series</em>'.
	 * @see de.taufkirchen.kluge.MovieDB.Series
	 * @generated
	 */
	EClass getSeries();

	/**
	 * Returns the meta object for the attribute '{@link de.taufkirchen.kluge.MovieDB.Series#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see de.taufkirchen.kluge.MovieDB.Series#getID()
	 * @see #getSeries()
	 * @generated
	 */
	EAttribute getSeries_ID();

	/**
	 * Returns the meta object for class '{@link de.taufkirchen.kluge.MovieDB.Movies <em>Movies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movies</em>'.
	 * @see de.taufkirchen.kluge.MovieDB.Movies
	 * @generated
	 */
	EClass getMovies();

	/**
	 * Returns the meta object for the attribute '{@link de.taufkirchen.kluge.MovieDB.Movies#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see de.taufkirchen.kluge.MovieDB.Movies#getID()
	 * @see #getMovies()
	 * @generated
	 */
	EAttribute getMovies_ID();

	/**
	 * Returns the meta object for the attribute '{@link de.taufkirchen.kluge.MovieDB.Movies#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.taufkirchen.kluge.MovieDB.Movies#getTitle()
	 * @see #getMovies()
	 * @generated
	 */
	EAttribute getMovies_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.taufkirchen.kluge.MovieDB.Movies#getThreeD <em>Three D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Three D</em>'.
	 * @see de.taufkirchen.kluge.MovieDB.Movies#getThreeD()
	 * @see #getMovies()
	 * @generated
	 */
	EAttribute getMovies_ThreeD();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MovieDBFactory getMovieDBFactory();

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
		 * The meta object literal for the '{@link de.taufkirchen.kluge.MovieDB.impl.SeriesImpl <em>Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.taufkirchen.kluge.MovieDB.impl.SeriesImpl
		 * @see de.taufkirchen.kluge.MovieDB.impl.MovieDBPackageImpl#getSeries()
		 * @generated
		 */
		EClass SERIES = eINSTANCE.getSeries();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES__ID = eINSTANCE.getSeries_ID();

		/**
		 * The meta object literal for the '{@link de.taufkirchen.kluge.MovieDB.impl.MoviesImpl <em>Movies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.taufkirchen.kluge.MovieDB.impl.MoviesImpl
		 * @see de.taufkirchen.kluge.MovieDB.impl.MovieDBPackageImpl#getMovies()
		 * @generated
		 */
		EClass MOVIES = eINSTANCE.getMovies();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIES__ID = eINSTANCE.getMovies_ID();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIES__TITLE = eINSTANCE.getMovies_Title();

		/**
		 * The meta object literal for the '<em><b>Three D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIES__THREE_D = eINSTANCE.getMovies_ThreeD();

	}

} //MovieDBPackage
