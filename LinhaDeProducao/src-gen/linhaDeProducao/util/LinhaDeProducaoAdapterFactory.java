/**
 */
package linhaDeProducao.util;

import linhaDeProducao.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see linhaDeProducao.LinhaDeProducaoPackage
 * @generated
 */
public class LinhaDeProducaoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LinhaDeProducaoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinhaDeProducaoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LinhaDeProducaoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinhaDeProducaoSwitch<Adapter> modelSwitch = new LinhaDeProducaoSwitch<Adapter>() {
		@Override
		public Adapter caseFeature(Feature object) {
			return createFeatureAdapter();
		}

		@Override
		public Adapter casePiece(Piece object) {
			return createPieceAdapter();
		}

		@Override
		public Adapter casePrismatic(Prismatic object) {
			return createPrismaticAdapter();
		}

		@Override
		public Adapter caseRotational(Rotational object) {
			return createRotationalAdapter();
		}

		@Override
		public Adapter caseRevolving(Revolving object) {
			return createRevolvingAdapter();
		}

		@Override
		public Adapter caseSlab(Slab object) {
			return createSlabAdapter();
		}

		@Override
		public Adapter caseResource(Resource object) {
			return createResourceAdapter();
		}

		@Override
		public Adapter caseTransport(Transport object) {
			return createTransportAdapter();
		}

		@Override
		public Adapter caseFabrication(Fabrication object) {
			return createFabricationAdapter();
		}

		@Override
		public Adapter caseSimulation(Simulation object) {
			return createSimulationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link linhaDeProducao.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linhaDeProducao.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linhaDeProducao.Piece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linhaDeProducao.Piece
	 * @generated
	 */
	public Adapter createPieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linhaDeProducao.Prismatic <em>Prismatic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linhaDeProducao.Prismatic
	 * @generated
	 */
	public Adapter createPrismaticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linhaDeProducao.Rotational <em>Rotational</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linhaDeProducao.Rotational
	 * @generated
	 */
	public Adapter createRotationalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linhaDeProducao.Revolving <em>Revolving</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linhaDeProducao.Revolving
	 * @generated
	 */
	public Adapter createRevolvingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linhaDeProducao.Slab <em>Slab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linhaDeProducao.Slab
	 * @generated
	 */
	public Adapter createSlabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linhaDeProducao.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linhaDeProducao.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linhaDeProducao.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linhaDeProducao.Transport
	 * @generated
	 */
	public Adapter createTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linhaDeProducao.Fabrication <em>Fabrication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linhaDeProducao.Fabrication
	 * @generated
	 */
	public Adapter createFabricationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link linhaDeProducao.Simulation <em>Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see linhaDeProducao.Simulation
	 * @generated
	 */
	public Adapter createSimulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LinhaDeProducaoAdapterFactory
