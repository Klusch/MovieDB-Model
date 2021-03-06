/**
 */
package de.taufkirchen.kluge.MovieDB.impl;

import de.taufkirchen.kluge.MovieDB.MovieDBFactory;
import de.taufkirchen.kluge.MovieDB.MovieDBPackage;
import de.taufkirchen.kluge.MovieDB.Movies;
import de.taufkirchen.kluge.MovieDB.Series;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MovieDBPackageImpl extends EPackageImpl implements MovieDBPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moviesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.taufkirchen.kluge.MovieDB.MovieDBPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MovieDBPackageImpl() {
		super(eNS_URI, MovieDBFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MovieDBPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MovieDBPackage init() {
		if (isInited) return (MovieDBPackage)EPackage.Registry.INSTANCE.getEPackage(MovieDBPackage.eNS_URI);

		// Obtain or create and register package
		MovieDBPackageImpl theMovieDBPackage = (MovieDBPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MovieDBPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MovieDBPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMovieDBPackage.createPackageContents();

		// Initialize created meta-data
		theMovieDBPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMovieDBPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MovieDBPackage.eNS_URI, theMovieDBPackage);
		return theMovieDBPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeries() {
		return seriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeries_ID() {
		return (EAttribute)seriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMovies() {
		return moviesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovies_ID() {
		return (EAttribute)moviesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovies_Title() {
		return (EAttribute)moviesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovies_ThreeD() {
		return (EAttribute)moviesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovieDBFactory getMovieDBFactory() {
		return (MovieDBFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		seriesEClass = createEClass(SERIES);
		createEAttribute(seriesEClass, SERIES__ID);

		moviesEClass = createEClass(MOVIES);
		createEAttribute(moviesEClass, MOVIES__ID);
		createEAttribute(moviesEClass, MOVIES__TITLE);
		createEAttribute(moviesEClass, MOVIES__THREE_D);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(seriesEClass, Series.class, "Series", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeries_ID(), ecorePackage.getEIntegerObject(), "ID", null, 0, 1, Series.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moviesEClass, Movies.class, "Movies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMovies_ID(), ecorePackage.getEIntegerObject(), "ID", null, 0, 1, Movies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMovies_Title(), ecorePackage.getEString(), "Title", null, 0, 1, Movies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMovies_ThreeD(), ecorePackage.getEBooleanObject(), "ThreeD", null, 0, 1, Movies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MovieDBPackageImpl
