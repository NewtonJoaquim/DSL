/**
 */
package linhaDeProducao.impl;

import linhaDeProducao.*;

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
public class LinhaDeProducaoFactoryImpl extends EFactoryImpl implements LinhaDeProducaoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LinhaDeProducaoFactory init() {
		try {
			LinhaDeProducaoFactory theLinhaDeProducaoFactory = (LinhaDeProducaoFactory) EPackage.Registry.INSTANCE
					.getEFactory(LinhaDeProducaoPackage.eNS_URI);
			if (theLinhaDeProducaoFactory != null) {
				return theLinhaDeProducaoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LinhaDeProducaoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinhaDeProducaoFactoryImpl() {
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
		case LinhaDeProducaoPackage.PIECE:
			return createPiece();
		case LinhaDeProducaoPackage.PRISMATIC:
			return createPrismatic();
		case LinhaDeProducaoPackage.ROTATIONAL:
			return createRotational();
		case LinhaDeProducaoPackage.REVOLVING:
			return createRevolving();
		case LinhaDeProducaoPackage.SLAB:
			return createSlab();
		case LinhaDeProducaoPackage.TRANSPORT:
			return createTransport();
		case LinhaDeProducaoPackage.FABRICATION:
			return createFabrication();
		case LinhaDeProducaoPackage.SIMULATION:
			return createSimulation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Piece createPiece() {
		PieceImpl piece = new PieceImpl();
		return piece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prismatic createPrismatic() {
		PrismaticImpl prismatic = new PrismaticImpl();
		return prismatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotational createRotational() {
		RotationalImpl rotational = new RotationalImpl();
		return rotational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revolving createRevolving() {
		RevolvingImpl revolving = new RevolvingImpl();
		return revolving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slab createSlab() {
		SlabImpl slab = new SlabImpl();
		return slab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transport createTransport() {
		TransportImpl transport = new TransportImpl();
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fabrication createFabrication() {
		FabricationImpl fabrication = new FabricationImpl();
		return fabrication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simulation createSimulation() {
		SimulationImpl simulation = new SimulationImpl();
		return simulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinhaDeProducaoPackage getLinhaDeProducaoPackage() {
		return (LinhaDeProducaoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LinhaDeProducaoPackage getPackage() {
		return LinhaDeProducaoPackage.eINSTANCE;
	}

} //LinhaDeProducaoFactoryImpl
