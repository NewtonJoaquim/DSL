/**
 */
package linhaDeProducao.impl;

import linhaDeProducao.Fabrication;
import linhaDeProducao.Feature;
import linhaDeProducao.LinhaDeProducaoFactory;
import linhaDeProducao.LinhaDeProducaoPackage;
import linhaDeProducao.Piece;
import linhaDeProducao.Prismatic;
import linhaDeProducao.Resource;
import linhaDeProducao.Revolving;
import linhaDeProducao.Rotational;
import linhaDeProducao.Simulation;
import linhaDeProducao.Slab;
import linhaDeProducao.Transport;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinhaDeProducaoPackageImpl extends EPackageImpl implements LinhaDeProducaoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pieceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prismaticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revolvingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fabricationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationEClass = null;

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
	 * @see linhaDeProducao.LinhaDeProducaoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LinhaDeProducaoPackageImpl() {
		super(eNS_URI, LinhaDeProducaoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LinhaDeProducaoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LinhaDeProducaoPackage init() {
		if (isInited)
			return (LinhaDeProducaoPackage) EPackage.Registry.INSTANCE.getEPackage(LinhaDeProducaoPackage.eNS_URI);

		// Obtain or create and register package
		LinhaDeProducaoPackageImpl theLinhaDeProducaoPackage = (LinhaDeProducaoPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof LinhaDeProducaoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new LinhaDeProducaoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLinhaDeProducaoPackage.createPackageContents();

		// Initialize created meta-data
		theLinhaDeProducaoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLinhaDeProducaoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LinhaDeProducaoPackage.eNS_URI, theLinhaDeProducaoPackage);
		return theLinhaDeProducaoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Id() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Type() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_PositionX() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_PositionY() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_PositionZ() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Oritentation() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Codigo() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeature__AreaFeature() {
		return featureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeature__VolumeFeature() {
		return featureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPiece() {
		return pieceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPiece_Id() {
		return (EAttribute) pieceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPiece_Name() {
		return (EAttribute) pieceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPiece_Material() {
		return (EAttribute) pieceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPiece_Width() {
		return (EAttribute) pieceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPiece_Length() {
		return (EAttribute) pieceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPiece_Height() {
		return (EAttribute) pieceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPiece_Feature() {
		return (EReference) pieceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPiece__VolumePiece() {
		return pieceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrismatic() {
		return prismaticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrismatic_Width() {
		return (EAttribute) prismaticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrismatic_Heigth() {
		return (EAttribute) prismaticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrismatic_Length() {
		return (EAttribute) prismaticEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrismatic__AreaFeature() {
		return prismaticEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrismatic__VolumeFeature() {
		return prismaticEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotational() {
		return rotationalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotational_Width() {
		return (EAttribute) rotationalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotational_DiametroMenor() {
		return (EAttribute) rotationalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotational_DiametroMaior() {
		return (EAttribute) rotationalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRotational__AreaFeature() {
		return rotationalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRotational__VolumeFeature() {
		return rotationalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevolving() {
		return revolvingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevolving_Diameter() {
		return (EAttribute) revolvingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevolving_Height() {
		return (EAttribute) revolvingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRevolving__AreaFeature() {
		return revolvingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRevolving__VolumeFeature() {
		return revolvingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlab() {
		return slabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlab_Width() {
		return (EAttribute) slabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlab_Heigth() {
		return (EAttribute) slabEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlab_Length() {
		return (EAttribute) slabEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSlab__AreaFeature() {
		return slabEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSlab__VolumeFeature() {
		return slabEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Id() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Type() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResource__ComputeTime() {
		return resourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResource__ComputeCost() {
		return resourceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransport() {
		return transportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransport_VelMovi() {
		return (EAttribute) transportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransport_DistMovi() {
		return (EAttribute) transportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransport_CusMovi() {
		return (EAttribute) transportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransport_From() {
		return (EReference) transportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransport_SendsToFabrication() {
		return (EReference) transportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransport_TempImpr() {
		return (EAttribute) transportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransport__ComputeTime() {
		return transportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransport__ComputeCost() {
		return transportEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFabrication() {
		return fabricationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFabrication_Feature() {
		return (EReference) fabricationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_SalarioOp() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_SalarioMaq() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_CustoFerr() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_DiamCorte() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_ProfCorte() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_CompCorte() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_Avanco() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_VelCorte() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_TempImpr() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_VelAvanco() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_TaxaAcab() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_VidaFerr() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_TrocaFerr() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFabrication_To() {
		return (EReference) fabricationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFabrication_SendsToTransport() {
		return (EReference) fabricationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFabrication_CapBroca() {
		return (EAttribute) fabricationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFabrication__ComputeTime() {
		return fabricationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFabrication__ComputeCost() {
		return fabricationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulation() {
		return simulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulation_Resource() {
		return (EReference) simulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulation_Piece() {
		return (EReference) simulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulation_Name() {
		return (EAttribute) simulationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinhaDeProducaoFactory getLinhaDeProducaoFactory() {
		return (LinhaDeProducaoFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__ID);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEAttribute(featureEClass, FEATURE__TYPE);
		createEAttribute(featureEClass, FEATURE__POSITION_X);
		createEAttribute(featureEClass, FEATURE__POSITION_Y);
		createEAttribute(featureEClass, FEATURE__POSITION_Z);
		createEAttribute(featureEClass, FEATURE__ORITENTATION);
		createEAttribute(featureEClass, FEATURE__CODIGO);
		createEOperation(featureEClass, FEATURE___AREA_FEATURE);
		createEOperation(featureEClass, FEATURE___VOLUME_FEATURE);

		pieceEClass = createEClass(PIECE);
		createEAttribute(pieceEClass, PIECE__ID);
		createEAttribute(pieceEClass, PIECE__NAME);
		createEAttribute(pieceEClass, PIECE__MATERIAL);
		createEAttribute(pieceEClass, PIECE__WIDTH);
		createEAttribute(pieceEClass, PIECE__LENGTH);
		createEAttribute(pieceEClass, PIECE__HEIGHT);
		createEReference(pieceEClass, PIECE__FEATURE);
		createEOperation(pieceEClass, PIECE___VOLUME_PIECE);

		prismaticEClass = createEClass(PRISMATIC);
		createEAttribute(prismaticEClass, PRISMATIC__WIDTH);
		createEAttribute(prismaticEClass, PRISMATIC__HEIGTH);
		createEAttribute(prismaticEClass, PRISMATIC__LENGTH);
		createEOperation(prismaticEClass, PRISMATIC___AREA_FEATURE);
		createEOperation(prismaticEClass, PRISMATIC___VOLUME_FEATURE);

		rotationalEClass = createEClass(ROTATIONAL);
		createEAttribute(rotationalEClass, ROTATIONAL__WIDTH);
		createEAttribute(rotationalEClass, ROTATIONAL__DIAMETRO_MENOR);
		createEAttribute(rotationalEClass, ROTATIONAL__DIAMETRO_MAIOR);
		createEOperation(rotationalEClass, ROTATIONAL___AREA_FEATURE);
		createEOperation(rotationalEClass, ROTATIONAL___VOLUME_FEATURE);

		revolvingEClass = createEClass(REVOLVING);
		createEAttribute(revolvingEClass, REVOLVING__DIAMETER);
		createEAttribute(revolvingEClass, REVOLVING__HEIGHT);
		createEOperation(revolvingEClass, REVOLVING___AREA_FEATURE);
		createEOperation(revolvingEClass, REVOLVING___VOLUME_FEATURE);

		slabEClass = createEClass(SLAB);
		createEAttribute(slabEClass, SLAB__WIDTH);
		createEAttribute(slabEClass, SLAB__HEIGTH);
		createEAttribute(slabEClass, SLAB__LENGTH);
		createEOperation(slabEClass, SLAB___AREA_FEATURE);
		createEOperation(slabEClass, SLAB___VOLUME_FEATURE);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__ID);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEAttribute(resourceEClass, RESOURCE__TYPE);
		createEOperation(resourceEClass, RESOURCE___COMPUTE_TIME);
		createEOperation(resourceEClass, RESOURCE___COMPUTE_COST);

		transportEClass = createEClass(TRANSPORT);
		createEAttribute(transportEClass, TRANSPORT__VEL_MOVI);
		createEAttribute(transportEClass, TRANSPORT__DIST_MOVI);
		createEAttribute(transportEClass, TRANSPORT__CUS_MOVI);
		createEReference(transportEClass, TRANSPORT__FROM);
		createEReference(transportEClass, TRANSPORT__SENDS_TO_FABRICATION);
		createEAttribute(transportEClass, TRANSPORT__TEMP_IMPR);
		createEOperation(transportEClass, TRANSPORT___COMPUTE_TIME);
		createEOperation(transportEClass, TRANSPORT___COMPUTE_COST);

		fabricationEClass = createEClass(FABRICATION);
		createEReference(fabricationEClass, FABRICATION__FEATURE);
		createEAttribute(fabricationEClass, FABRICATION__SALARIO_OP);
		createEAttribute(fabricationEClass, FABRICATION__SALARIO_MAQ);
		createEAttribute(fabricationEClass, FABRICATION__CUSTO_FERR);
		createEAttribute(fabricationEClass, FABRICATION__DIAM_CORTE);
		createEAttribute(fabricationEClass, FABRICATION__PROF_CORTE);
		createEAttribute(fabricationEClass, FABRICATION__COMP_CORTE);
		createEAttribute(fabricationEClass, FABRICATION__AVANCO);
		createEAttribute(fabricationEClass, FABRICATION__VEL_CORTE);
		createEAttribute(fabricationEClass, FABRICATION__TEMP_IMPR);
		createEAttribute(fabricationEClass, FABRICATION__VEL_AVANCO);
		createEAttribute(fabricationEClass, FABRICATION__TAXA_ACAB);
		createEAttribute(fabricationEClass, FABRICATION__VIDA_FERR);
		createEAttribute(fabricationEClass, FABRICATION__TROCA_FERR);
		createEReference(fabricationEClass, FABRICATION__TO);
		createEReference(fabricationEClass, FABRICATION__SENDS_TO_TRANSPORT);
		createEAttribute(fabricationEClass, FABRICATION__CAP_BROCA);
		createEOperation(fabricationEClass, FABRICATION___COMPUTE_TIME);
		createEOperation(fabricationEClass, FABRICATION___COMPUTE_COST);

		simulationEClass = createEClass(SIMULATION);
		createEReference(simulationEClass, SIMULATION__RESOURCE);
		createEReference(simulationEClass, SIMULATION__PIECE);
		createEAttribute(simulationEClass, SIMULATION__NAME);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		prismaticEClass.getESuperTypes().add(this.getFeature());
		rotationalEClass.getESuperTypes().add(this.getFeature());
		revolvingEClass.getESuperTypes().add(this.getFeature());
		slabEClass.getESuperTypes().add(this.getFeature());
		transportEClass.getESuperTypes().add(this.getResource());
		fabricationEClass.getESuperTypes().add(this.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 1, 1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Type(), ecorePackage.getEString(), "type", null, 1, 1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_PositionX(), ecorePackage.getEDouble(), "positionX", null, 1, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_PositionY(), ecorePackage.getEDouble(), "positionY", null, 1, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_PositionZ(), ecorePackage.getEDouble(), "positionZ", null, 1, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Oritentation(), ecorePackage.getEInt(), "oritentation", null, 1, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Codigo(), ecorePackage.getEInt(), "codigo", null, 1, 1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFeature__AreaFeature(), ecorePackage.getEDouble(), "areaFeature", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getFeature__VolumeFeature(), ecorePackage.getEDouble(), "volumeFeature", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(pieceEClass, Piece.class, "Piece", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPiece_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Piece.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPiece_Name(), ecorePackage.getEString(), "name", null, 1, 1, Piece.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPiece_Material(), ecorePackage.getEString(), "material", null, 1, 1, Piece.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPiece_Width(), ecorePackage.getEDouble(), "width", null, 1, 1, Piece.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPiece_Length(), ecorePackage.getEDouble(), "length", null, 1, 1, Piece.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPiece_Height(), ecorePackage.getEDouble(), "height", null, 1, 1, Piece.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPiece_Feature(), this.getFeature(), null, "feature", null, 0, -1, Piece.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getPiece__VolumePiece(), ecorePackage.getEDouble(), "volumePiece", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(prismaticEClass, Prismatic.class, "Prismatic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrismatic_Width(), ecorePackage.getEDouble(), "width", null, 1, 1, Prismatic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrismatic_Heigth(), ecorePackage.getEDouble(), "heigth", null, 1, 1, Prismatic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrismatic_Length(), ecorePackage.getEDouble(), "length", null, 1, 1, Prismatic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPrismatic__AreaFeature(), ecorePackage.getEDouble(), "areaFeature", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getPrismatic__VolumeFeature(), ecorePackage.getEDouble(), "volumeFeature", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(rotationalEClass, Rotational.class, "Rotational", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotational_Width(), ecorePackage.getEDouble(), "width", null, 1, 1, Rotational.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotational_DiametroMenor(), ecorePackage.getEDouble(), "diametroMenor", null, 1, 1,
				Rotational.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotational_DiametroMaior(), ecorePackage.getEDouble(), "diametroMaior", null, 1, 1,
				Rotational.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getRotational__AreaFeature(), ecorePackage.getEDouble(), "areaFeature", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getRotational__VolumeFeature(), ecorePackage.getEDouble(), "volumeFeature", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(revolvingEClass, Revolving.class, "Revolving", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevolving_Diameter(), ecorePackage.getEDouble(), "diameter", null, 1, 1, Revolving.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevolving_Height(), ecorePackage.getEDouble(), "height", null, 1, 1, Revolving.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRevolving__AreaFeature(), ecorePackage.getEDouble(), "areaFeature", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getRevolving__VolumeFeature(), ecorePackage.getEDouble(), "volumeFeature", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(slabEClass, Slab.class, "Slab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlab_Width(), ecorePackage.getEDouble(), "width", null, 1, 1, Slab.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlab_Heigth(), ecorePackage.getEDouble(), "heigth", null, 1, 1, Slab.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlab_Length(), ecorePackage.getEDouble(), "length", null, 1, 1, Slab.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSlab__AreaFeature(), ecorePackage.getEDouble(), "areaFeature", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSlab__VolumeFeature(), ecorePackage.getEDouble(), "volumeFeature", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Resource.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, Resource.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Type(), ecorePackage.getEString(), "type", null, 1, 1, Resource.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getResource__ComputeTime(), ecorePackage.getEDouble(), "computeTime", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getResource__ComputeCost(), ecorePackage.getEDouble(), "computeCost", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(transportEClass, Transport.class, "Transport", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransport_VelMovi(), ecorePackage.getEDouble(), "velMovi", null, 1, 1, Transport.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransport_DistMovi(), ecorePackage.getEDouble(), "distMovi", null, 1, 1, Transport.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransport_CusMovi(), ecorePackage.getEDouble(), "cusMovi", null, 1, 1, Transport.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransport_From(), this.getFabrication(), this.getFabrication_To(), "from", null, 1, 1,
				Transport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransport_SendsToFabrication(), this.getFabrication(), null, "sendsToFabrication", null, 1, 1,
				Transport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransport_TempImpr(), ecorePackage.getEDouble(), "tempImpr", null, 1, 1, Transport.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransport__ComputeTime(), ecorePackage.getEDouble(), "computeTime", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getTransport__ComputeCost(), ecorePackage.getEDouble(), "computeCost", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(fabricationEClass, Fabrication.class, "Fabrication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFabrication_Feature(), this.getFeature(), null, "feature", null, 1, -1, Fabrication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_SalarioOp(), ecorePackage.getEDouble(), "salarioOp", null, 1, 1,
				Fabrication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_SalarioMaq(), ecorePackage.getEDouble(), "salarioMaq", null, 1, 1,
				Fabrication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_CustoFerr(), ecorePackage.getEDouble(), "custoFerr", null, 1, 1,
				Fabrication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_DiamCorte(), ecorePackage.getEDouble(), "diamCorte", null, 1, 1,
				Fabrication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_ProfCorte(), ecorePackage.getEDouble(), "profCorte", null, 1, 1,
				Fabrication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_CompCorte(), ecorePackage.getEDouble(), "compCorte", null, 1, 1,
				Fabrication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_Avanco(), ecorePackage.getEDouble(), "avanco", null, 1, 1, Fabrication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_VelCorte(), ecorePackage.getEDouble(), "velCorte", null, 1, 1, Fabrication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_TempImpr(), ecorePackage.getEDouble(), "tempImpr", null, 1, 1, Fabrication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_VelAvanco(), ecorePackage.getEDouble(), "velAvanco", null, 1, 1,
				Fabrication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_TaxaAcab(), ecorePackage.getEDouble(), "taxaAcab", null, 1, 1, Fabrication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_VidaFerr(), ecorePackage.getEDouble(), "vidaFerr", null, 1, 1, Fabrication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_TrocaFerr(), ecorePackage.getEDouble(), "trocaFerr", null, 1, 1,
				Fabrication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFabrication_To(), this.getTransport(), this.getTransport_From(), "to", null, 0, 1,
				Fabrication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFabrication_SendsToTransport(), this.getTransport(), null, "sendsToTransport", null, 0, 1,
				Fabrication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFabrication_CapBroca(), ecorePackage.getEDouble(), "capBroca", null, 1, 1, Fabrication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFabrication__ComputeTime(), ecorePackage.getEDouble(), "computeTime", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getFabrication__ComputeCost(), ecorePackage.getEDouble(), "computeCost", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(simulationEClass, Simulation.class, "Simulation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulation_Resource(), this.getResource(), null, "resource", null, 0, -1, Simulation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulation_Piece(), this.getPiece(), null, "piece", null, 1, 1, Simulation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Simulation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LinhaDeProducaoPackageImpl
