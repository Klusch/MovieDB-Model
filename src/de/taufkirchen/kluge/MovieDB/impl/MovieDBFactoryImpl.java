/**
 */
package de.taufkirchen.kluge.MovieDB.impl;

import de.taufkirchen.kluge.MovieDB.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MovieDBFactoryImpl extends EFactoryImpl implements MovieDBFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MovieDBFactory init() {
		try {
			MovieDBFactory theMovieDBFactory = (MovieDBFactory)EPackage.Registry.INSTANCE.getEFactory("http://moviedb.akluge.de"); 
			if (theMovieDBFactory != null) {
				return theMovieDBFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MovieDBFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovieDBFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MovieDBPackage.SERIES: return createSeries();
			case MovieDBPackage.MOVIES: return createMovies();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Series createSeries() {
		SeriesImpl series = new SeriesImpl();
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Movies createMovies() {
		MoviesImpl movies = new MoviesImpl();
		return movies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovieDBPackage getMovieDBPackage() {
		return (MovieDBPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MovieDBPackage getPackage() {
		return MovieDBPackage.eINSTANCE;
	}

} //MovieDBFactoryImpl
