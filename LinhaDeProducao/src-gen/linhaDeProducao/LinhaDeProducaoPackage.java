/**
 */
package linhaDeProducao;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see linhaDeProducao.LinhaDeProducaoFactory
 * @model kind="package"
 * @generated
 */
public interface LinhaDeProducaoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "linhaDeProducao";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.com/obeoum/projects/linhaDeProducao";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "linhaDeProducao";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinhaDeProducaoPackage eINSTANCE = linhaDeProducao.impl.LinhaDeProducaoPackageImpl.init();

	/**
	 * The meta object id for the '{@link linhaDeProducao.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linhaDeProducao.impl.FeatureImpl
	 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__POSITION_X = 3;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__POSITION_Y = 4;

	/**
	 * The feature id for the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__POSITION_Z = 5;

	/**
	 * The feature id for the '<em><b>Oritentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ORITENTATION = 6;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CODIGO = 7;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Area Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___AREA_FEATURE = 0;

	/**
	 * The operation id for the '<em>Volume Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___VOLUME_FEATURE = 1;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link linhaDeProducao.impl.PieceImpl <em>Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linhaDeProducao.impl.PieceImpl
	 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getPiece()
	 * @generated
	 */
	int PIECE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__MATERIAL = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__FEATURE = 6;

	/**
	 * The number of structural features of the '<em>Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Volume Piece</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE___VOLUME_PIECE = 0;

	/**
	 * The number of operations of the '<em>Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link linhaDeProducao.impl.PrismaticImpl <em>Prismatic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linhaDeProducao.impl.PrismaticImpl
	 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getPrismatic()
	 * @generated
	 */
	int PRISMATIC = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC__POSITION_X = FEATURE__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC__POSITION_Y = FEATURE__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC__POSITION_Z = FEATURE__POSITION_Z;

	/**
	 * The feature id for the '<em><b>Oritentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC__ORITENTATION = FEATURE__ORITENTATION;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC__CODIGO = FEATURE__CODIGO;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC__WIDTH = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC__HEIGTH = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC__LENGTH = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Prismatic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Area Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC___AREA_FEATURE = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Volume Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC___VOLUME_FEATURE = FEATURE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Prismatic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link linhaDeProducao.impl.RotationalImpl <em>Rotational</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linhaDeProducao.impl.RotationalImpl
	 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getRotational()
	 * @generated
	 */
	int ROTATIONAL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL__POSITION_X = FEATURE__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL__POSITION_Y = FEATURE__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL__POSITION_Z = FEATURE__POSITION_Z;

	/**
	 * The feature id for the '<em><b>Oritentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL__ORITENTATION = FEATURE__ORITENTATION;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL__CODIGO = FEATURE__CODIGO;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL__WIDTH = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diametro Menor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL__DIAMETRO_MENOR = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diametro Maior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL__DIAMETRO_MAIOR = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rotational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Area Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL___AREA_FEATURE = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Volume Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL___VOLUME_FEATURE = FEATURE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rotational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATIONAL_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link linhaDeProducao.impl.RevolvingImpl <em>Revolving</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linhaDeProducao.impl.RevolvingImpl
	 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getRevolving()
	 * @generated
	 */
	int REVOLVING = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING__POSITION_X = FEATURE__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING__POSITION_Y = FEATURE__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING__POSITION_Z = FEATURE__POSITION_Z;

	/**
	 * The feature id for the '<em><b>Oritentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING__ORITENTATION = FEATURE__ORITENTATION;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING__CODIGO = FEATURE__CODIGO;

	/**
	 * The feature id for the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING__DIAMETER = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING__HEIGHT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Revolving</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Area Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING___AREA_FEATURE = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Volume Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING___VOLUME_FEATURE = FEATURE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Revolving</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVOLVING_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link linhaDeProducao.impl.SlabImpl <em>Slab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linhaDeProducao.impl.SlabImpl
	 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getSlab()
	 * @generated
	 */
	int SLAB = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB__POSITION_X = FEATURE__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB__POSITION_Y = FEATURE__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB__POSITION_Z = FEATURE__POSITION_Z;

	/**
	 * The feature id for the '<em><b>Oritentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB__ORITENTATION = FEATURE__ORITENTATION;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB__CODIGO = FEATURE__CODIGO;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB__WIDTH = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB__HEIGTH = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB__LENGTH = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Slab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Area Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB___AREA_FEATURE = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Volume Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB___VOLUME_FEATURE = FEATURE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Slab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAB_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link linhaDeProducao.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linhaDeProducao.impl.ResourceImpl
	 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Compute Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___COMPUTE_TIME = 0;

	/**
	 * The operation id for the '<em>Compute Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___COMPUTE_COST = 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link linhaDeProducao.impl.TransportImpl <em>Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linhaDeProducao.impl.TransportImpl
	 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getTransport()
	 * @generated
	 */
	int TRANSPORT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__TYPE = RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Vel Movi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__VEL_MOVI = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dist Movi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__DIST_MOVI = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cus Movi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__CUS_MOVI = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__FROM = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sends To Fabrication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__SENDS_TO_FABRICATION = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Temp Impr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__TEMP_IMPR = RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Compute Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT___COMPUTE_TIME = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT___COMPUTE_COST = RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link linhaDeProducao.impl.FabricationImpl <em>Fabrication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linhaDeProducao.impl.FabricationImpl
	 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getFabrication()
	 * @generated
	 */
	int FABRICATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__ID = RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__TYPE = RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__FEATURE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Salario Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__SALARIO_OP = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Salario Maq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__SALARIO_MAQ = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Custo Ferr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__CUSTO_FERR = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diam Corte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__DIAM_CORTE = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prof Corte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__PROF_CORTE = RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comp Corte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__COMP_CORTE = RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Avanco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__AVANCO = RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Vel Corte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__VEL_CORTE = RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Temp Impr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__TEMP_IMPR = RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Vel Avanco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__VEL_AVANCO = RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Taxa Acab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__TAXA_ACAB = RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Vida Ferr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__VIDA_FERR = RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Troca Ferr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__TROCA_FERR = RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__TO = RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sends To Transport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__SENDS_TO_TRANSPORT = RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Cap Broca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION__CAP_BROCA = RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Fabrication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The operation id for the '<em>Compute Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION___COMPUTE_TIME = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION___COMPUTE_COST = RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fabrication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FABRICATION_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link linhaDeProducao.impl.SimulationImpl <em>Simulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see linhaDeProducao.impl.SimulationImpl
	 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getSimulation()
	 * @generated
	 */
	int SIMULATION = 9;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Piece</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__PIECE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link linhaDeProducao.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see linhaDeProducao.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Feature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see linhaDeProducao.Feature#getId()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Id();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see linhaDeProducao.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Feature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see linhaDeProducao.Feature#getType()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Type();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Feature#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see linhaDeProducao.Feature#getPositionX()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Feature#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see linhaDeProducao.Feature#getPositionY()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Feature#getPositionZ <em>Position Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Z</em>'.
	 * @see linhaDeProducao.Feature#getPositionZ()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_PositionZ();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Feature#getOritentation <em>Oritentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oritentation</em>'.
	 * @see linhaDeProducao.Feature#getOritentation()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Oritentation();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Feature#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see linhaDeProducao.Feature#getCodigo()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Codigo();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Feature#areaFeature() <em>Area Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Area Feature</em>' operation.
	 * @see linhaDeProducao.Feature#areaFeature()
	 * @generated
	 */
	EOperation getFeature__AreaFeature();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Feature#volumeFeature() <em>Volume Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Volume Feature</em>' operation.
	 * @see linhaDeProducao.Feature#volumeFeature()
	 * @generated
	 */
	EOperation getFeature__VolumeFeature();

	/**
	 * Returns the meta object for class '{@link linhaDeProducao.Piece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piece</em>'.
	 * @see linhaDeProducao.Piece
	 * @generated
	 */
	EClass getPiece();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Piece#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see linhaDeProducao.Piece#getId()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Id();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Piece#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see linhaDeProducao.Piece#getName()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Name();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Piece#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material</em>'.
	 * @see linhaDeProducao.Piece#getMaterial()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Material();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Piece#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see linhaDeProducao.Piece#getWidth()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Width();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Piece#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see linhaDeProducao.Piece#getLength()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Length();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Piece#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see linhaDeProducao.Piece#getHeight()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Height();

	/**
	 * Returns the meta object for the containment reference list '{@link linhaDeProducao.Piece#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see linhaDeProducao.Piece#getFeature()
	 * @see #getPiece()
	 * @generated
	 */
	EReference getPiece_Feature();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Piece#volumePiece() <em>Volume Piece</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Volume Piece</em>' operation.
	 * @see linhaDeProducao.Piece#volumePiece()
	 * @generated
	 */
	EOperation getPiece__VolumePiece();

	/**
	 * Returns the meta object for class '{@link linhaDeProducao.Prismatic <em>Prismatic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prismatic</em>'.
	 * @see linhaDeProducao.Prismatic
	 * @generated
	 */
	EClass getPrismatic();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Prismatic#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see linhaDeProducao.Prismatic#getWidth()
	 * @see #getPrismatic()
	 * @generated
	 */
	EAttribute getPrismatic_Width();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Prismatic#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see linhaDeProducao.Prismatic#getHeigth()
	 * @see #getPrismatic()
	 * @generated
	 */
	EAttribute getPrismatic_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Prismatic#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see linhaDeProducao.Prismatic#getLength()
	 * @see #getPrismatic()
	 * @generated
	 */
	EAttribute getPrismatic_Length();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Prismatic#areaFeature() <em>Area Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Area Feature</em>' operation.
	 * @see linhaDeProducao.Prismatic#areaFeature()
	 * @generated
	 */
	EOperation getPrismatic__AreaFeature();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Prismatic#volumeFeature() <em>Volume Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Volume Feature</em>' operation.
	 * @see linhaDeProducao.Prismatic#volumeFeature()
	 * @generated
	 */
	EOperation getPrismatic__VolumeFeature();

	/**
	 * Returns the meta object for class '{@link linhaDeProducao.Rotational <em>Rotational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotational</em>'.
	 * @see linhaDeProducao.Rotational
	 * @generated
	 */
	EClass getRotational();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Rotational#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see linhaDeProducao.Rotational#getWidth()
	 * @see #getRotational()
	 * @generated
	 */
	EAttribute getRotational_Width();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Rotational#getDiametroMenor <em>Diametro Menor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diametro Menor</em>'.
	 * @see linhaDeProducao.Rotational#getDiametroMenor()
	 * @see #getRotational()
	 * @generated
	 */
	EAttribute getRotational_DiametroMenor();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Rotational#getDiametroMaior <em>Diametro Maior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diametro Maior</em>'.
	 * @see linhaDeProducao.Rotational#getDiametroMaior()
	 * @see #getRotational()
	 * @generated
	 */
	EAttribute getRotational_DiametroMaior();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Rotational#areaFeature() <em>Area Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Area Feature</em>' operation.
	 * @see linhaDeProducao.Rotational#areaFeature()
	 * @generated
	 */
	EOperation getRotational__AreaFeature();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Rotational#volumeFeature() <em>Volume Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Volume Feature</em>' operation.
	 * @see linhaDeProducao.Rotational#volumeFeature()
	 * @generated
	 */
	EOperation getRotational__VolumeFeature();

	/**
	 * Returns the meta object for class '{@link linhaDeProducao.Revolving <em>Revolving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revolving</em>'.
	 * @see linhaDeProducao.Revolving
	 * @generated
	 */
	EClass getRevolving();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Revolving#getDiameter <em>Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter</em>'.
	 * @see linhaDeProducao.Revolving#getDiameter()
	 * @see #getRevolving()
	 * @generated
	 */
	EAttribute getRevolving_Diameter();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Revolving#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see linhaDeProducao.Revolving#getHeight()
	 * @see #getRevolving()
	 * @generated
	 */
	EAttribute getRevolving_Height();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Revolving#areaFeature() <em>Area Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Area Feature</em>' operation.
	 * @see linhaDeProducao.Revolving#areaFeature()
	 * @generated
	 */
	EOperation getRevolving__AreaFeature();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Revolving#volumeFeature() <em>Volume Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Volume Feature</em>' operation.
	 * @see linhaDeProducao.Revolving#volumeFeature()
	 * @generated
	 */
	EOperation getRevolving__VolumeFeature();

	/**
	 * Returns the meta object for class '{@link linhaDeProducao.Slab <em>Slab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slab</em>'.
	 * @see linhaDeProducao.Slab
	 * @generated
	 */
	EClass getSlab();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Slab#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see linhaDeProducao.Slab#getWidth()
	 * @see #getSlab()
	 * @generated
	 */
	EAttribute getSlab_Width();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Slab#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see linhaDeProducao.Slab#getHeigth()
	 * @see #getSlab()
	 * @generated
	 */
	EAttribute getSlab_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Slab#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see linhaDeProducao.Slab#getLength()
	 * @see #getSlab()
	 * @generated
	 */
	EAttribute getSlab_Length();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Slab#areaFeature() <em>Area Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Area Feature</em>' operation.
	 * @see linhaDeProducao.Slab#areaFeature()
	 * @generated
	 */
	EOperation getSlab__AreaFeature();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Slab#volumeFeature() <em>Volume Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Volume Feature</em>' operation.
	 * @see linhaDeProducao.Slab#volumeFeature()
	 * @generated
	 */
	EOperation getSlab__VolumeFeature();

	/**
	 * Returns the meta object for class '{@link linhaDeProducao.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see linhaDeProducao.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Resource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see linhaDeProducao.Resource#getId()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Id();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see linhaDeProducao.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Resource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see linhaDeProducao.Resource#getType()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Type();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Resource#computeTime() <em>Compute Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Time</em>' operation.
	 * @see linhaDeProducao.Resource#computeTime()
	 * @generated
	 */
	EOperation getResource__ComputeTime();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Resource#computeCost() <em>Compute Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Cost</em>' operation.
	 * @see linhaDeProducao.Resource#computeCost()
	 * @generated
	 */
	EOperation getResource__ComputeCost();

	/**
	 * Returns the meta object for class '{@link linhaDeProducao.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport</em>'.
	 * @see linhaDeProducao.Transport
	 * @generated
	 */
	EClass getTransport();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Transport#getVelMovi <em>Vel Movi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vel Movi</em>'.
	 * @see linhaDeProducao.Transport#getVelMovi()
	 * @see #getTransport()
	 * @generated
	 */
	EAttribute getTransport_VelMovi();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Transport#getDistMovi <em>Dist Movi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dist Movi</em>'.
	 * @see linhaDeProducao.Transport#getDistMovi()
	 * @see #getTransport()
	 * @generated
	 */
	EAttribute getTransport_DistMovi();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Transport#getCusMovi <em>Cus Movi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cus Movi</em>'.
	 * @see linhaDeProducao.Transport#getCusMovi()
	 * @see #getTransport()
	 * @generated
	 */
	EAttribute getTransport_CusMovi();

	/**
	 * Returns the meta object for the reference '{@link linhaDeProducao.Transport#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see linhaDeProducao.Transport#getFrom()
	 * @see #getTransport()
	 * @generated
	 */
	EReference getTransport_From();

	/**
	 * Returns the meta object for the reference '{@link linhaDeProducao.Transport#getSendsToFabrication <em>Sends To Fabrication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sends To Fabrication</em>'.
	 * @see linhaDeProducao.Transport#getSendsToFabrication()
	 * @see #getTransport()
	 * @generated
	 */
	EReference getTransport_SendsToFabrication();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Transport#getTempImpr <em>Temp Impr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Impr</em>'.
	 * @see linhaDeProducao.Transport#getTempImpr()
	 * @see #getTransport()
	 * @generated
	 */
	EAttribute getTransport_TempImpr();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Transport#computeTime() <em>Compute Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Time</em>' operation.
	 * @see linhaDeProducao.Transport#computeTime()
	 * @generated
	 */
	EOperation getTransport__ComputeTime();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Transport#computeCost() <em>Compute Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Cost</em>' operation.
	 * @see linhaDeProducao.Transport#computeCost()
	 * @generated
	 */
	EOperation getTransport__ComputeCost();

	/**
	 * Returns the meta object for class '{@link linhaDeProducao.Fabrication <em>Fabrication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fabrication</em>'.
	 * @see linhaDeProducao.Fabrication
	 * @generated
	 */
	EClass getFabrication();

	/**
	 * Returns the meta object for the containment reference list '{@link linhaDeProducao.Fabrication#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see linhaDeProducao.Fabrication#getFeature()
	 * @see #getFabrication()
	 * @generated
	 */
	EReference getFabrication_Feature();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getSalarioOp <em>Salario Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salario Op</em>'.
	 * @see linhaDeProducao.Fabrication#getSalarioOp()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_SalarioOp();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getSalarioMaq <em>Salario Maq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salario Maq</em>'.
	 * @see linhaDeProducao.Fabrication#getSalarioMaq()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_SalarioMaq();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getCustoFerr <em>Custo Ferr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custo Ferr</em>'.
	 * @see linhaDeProducao.Fabrication#getCustoFerr()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_CustoFerr();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getDiamCorte <em>Diam Corte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diam Corte</em>'.
	 * @see linhaDeProducao.Fabrication#getDiamCorte()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_DiamCorte();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getProfCorte <em>Prof Corte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prof Corte</em>'.
	 * @see linhaDeProducao.Fabrication#getProfCorte()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_ProfCorte();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getCompCorte <em>Comp Corte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp Corte</em>'.
	 * @see linhaDeProducao.Fabrication#getCompCorte()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_CompCorte();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getAvanco <em>Avanco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avanco</em>'.
	 * @see linhaDeProducao.Fabrication#getAvanco()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_Avanco();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getVelCorte <em>Vel Corte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vel Corte</em>'.
	 * @see linhaDeProducao.Fabrication#getVelCorte()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_VelCorte();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getTempImpr <em>Temp Impr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp Impr</em>'.
	 * @see linhaDeProducao.Fabrication#getTempImpr()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_TempImpr();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getVelAvanco <em>Vel Avanco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vel Avanco</em>'.
	 * @see linhaDeProducao.Fabrication#getVelAvanco()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_VelAvanco();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getTaxaAcab <em>Taxa Acab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxa Acab</em>'.
	 * @see linhaDeProducao.Fabrication#getTaxaAcab()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_TaxaAcab();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getVidaFerr <em>Vida Ferr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vida Ferr</em>'.
	 * @see linhaDeProducao.Fabrication#getVidaFerr()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_VidaFerr();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getTrocaFerr <em>Troca Ferr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Troca Ferr</em>'.
	 * @see linhaDeProducao.Fabrication#getTrocaFerr()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_TrocaFerr();

	/**
	 * Returns the meta object for the reference '{@link linhaDeProducao.Fabrication#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see linhaDeProducao.Fabrication#getTo()
	 * @see #getFabrication()
	 * @generated
	 */
	EReference getFabrication_To();

	/**
	 * Returns the meta object for the reference '{@link linhaDeProducao.Fabrication#getSendsToTransport <em>Sends To Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sends To Transport</em>'.
	 * @see linhaDeProducao.Fabrication#getSendsToTransport()
	 * @see #getFabrication()
	 * @generated
	 */
	EReference getFabrication_SendsToTransport();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Fabrication#getCapBroca <em>Cap Broca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap Broca</em>'.
	 * @see linhaDeProducao.Fabrication#getCapBroca()
	 * @see #getFabrication()
	 * @generated
	 */
	EAttribute getFabrication_CapBroca();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Fabrication#computeTime() <em>Compute Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Time</em>' operation.
	 * @see linhaDeProducao.Fabrication#computeTime()
	 * @generated
	 */
	EOperation getFabrication__ComputeTime();

	/**
	 * Returns the meta object for the '{@link linhaDeProducao.Fabrication#computeCost() <em>Compute Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Cost</em>' operation.
	 * @see linhaDeProducao.Fabrication#computeCost()
	 * @generated
	 */
	EOperation getFabrication__ComputeCost();

	/**
	 * Returns the meta object for class '{@link linhaDeProducao.Simulation <em>Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation</em>'.
	 * @see linhaDeProducao.Simulation
	 * @generated
	 */
	EClass getSimulation();

	/**
	 * Returns the meta object for the containment reference list '{@link linhaDeProducao.Simulation#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see linhaDeProducao.Simulation#getResource()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link linhaDeProducao.Simulation#getPiece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Piece</em>'.
	 * @see linhaDeProducao.Simulation#getPiece()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_Piece();

	/**
	 * Returns the meta object for the attribute '{@link linhaDeProducao.Simulation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see linhaDeProducao.Simulation#getName()
	 * @see #getSimulation()
	 * @generated
	 */
	EAttribute getSimulation_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LinhaDeProducaoFactory getLinhaDeProducaoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link linhaDeProducao.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linhaDeProducao.impl.FeatureImpl
		 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ID = eINSTANCE.getFeature_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__TYPE = eINSTANCE.getFeature_Type();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__POSITION_X = eINSTANCE.getFeature_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__POSITION_Y = eINSTANCE.getFeature_PositionY();

		/**
		 * The meta object literal for the '<em><b>Position Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__POSITION_Z = eINSTANCE.getFeature_PositionZ();

		/**
		 * The meta object literal for the '<em><b>Oritentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ORITENTATION = eINSTANCE.getFeature_Oritentation();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__CODIGO = eINSTANCE.getFeature_Codigo();

		/**
		 * The meta object literal for the '<em><b>Area Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE___AREA_FEATURE = eINSTANCE.getFeature__AreaFeature();

		/**
		 * The meta object literal for the '<em><b>Volume Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE___VOLUME_FEATURE = eINSTANCE.getFeature__VolumeFeature();

		/**
		 * The meta object literal for the '{@link linhaDeProducao.impl.PieceImpl <em>Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linhaDeProducao.impl.PieceImpl
		 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getPiece()
		 * @generated
		 */
		EClass PIECE = eINSTANCE.getPiece();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__ID = eINSTANCE.getPiece_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__NAME = eINSTANCE.getPiece_Name();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__MATERIAL = eINSTANCE.getPiece_Material();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__WIDTH = eINSTANCE.getPiece_Width();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__LENGTH = eINSTANCE.getPiece_Length();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__HEIGHT = eINSTANCE.getPiece_Height();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECE__FEATURE = eINSTANCE.getPiece_Feature();

		/**
		 * The meta object literal for the '<em><b>Volume Piece</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PIECE___VOLUME_PIECE = eINSTANCE.getPiece__VolumePiece();

		/**
		 * The meta object literal for the '{@link linhaDeProducao.impl.PrismaticImpl <em>Prismatic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linhaDeProducao.impl.PrismaticImpl
		 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getPrismatic()
		 * @generated
		 */
		EClass PRISMATIC = eINSTANCE.getPrismatic();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRISMATIC__WIDTH = eINSTANCE.getPrismatic_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRISMATIC__HEIGTH = eINSTANCE.getPrismatic_Heigth();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRISMATIC__LENGTH = eINSTANCE.getPrismatic_Length();

		/**
		 * The meta object literal for the '<em><b>Area Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRISMATIC___AREA_FEATURE = eINSTANCE.getPrismatic__AreaFeature();

		/**
		 * The meta object literal for the '<em><b>Volume Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRISMATIC___VOLUME_FEATURE = eINSTANCE.getPrismatic__VolumeFeature();

		/**
		 * The meta object literal for the '{@link linhaDeProducao.impl.RotationalImpl <em>Rotational</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linhaDeProducao.impl.RotationalImpl
		 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getRotational()
		 * @generated
		 */
		EClass ROTATIONAL = eINSTANCE.getRotational();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATIONAL__WIDTH = eINSTANCE.getRotational_Width();

		/**
		 * The meta object literal for the '<em><b>Diametro Menor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATIONAL__DIAMETRO_MENOR = eINSTANCE.getRotational_DiametroMenor();

		/**
		 * The meta object literal for the '<em><b>Diametro Maior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATIONAL__DIAMETRO_MAIOR = eINSTANCE.getRotational_DiametroMaior();

		/**
		 * The meta object literal for the '<em><b>Area Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROTATIONAL___AREA_FEATURE = eINSTANCE.getRotational__AreaFeature();

		/**
		 * The meta object literal for the '<em><b>Volume Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROTATIONAL___VOLUME_FEATURE = eINSTANCE.getRotational__VolumeFeature();

		/**
		 * The meta object literal for the '{@link linhaDeProducao.impl.RevolvingImpl <em>Revolving</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linhaDeProducao.impl.RevolvingImpl
		 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getRevolving()
		 * @generated
		 */
		EClass REVOLVING = eINSTANCE.getRevolving();

		/**
		 * The meta object literal for the '<em><b>Diameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVOLVING__DIAMETER = eINSTANCE.getRevolving_Diameter();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVOLVING__HEIGHT = eINSTANCE.getRevolving_Height();

		/**
		 * The meta object literal for the '<em><b>Area Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REVOLVING___AREA_FEATURE = eINSTANCE.getRevolving__AreaFeature();

		/**
		 * The meta object literal for the '<em><b>Volume Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REVOLVING___VOLUME_FEATURE = eINSTANCE.getRevolving__VolumeFeature();

		/**
		 * The meta object literal for the '{@link linhaDeProducao.impl.SlabImpl <em>Slab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linhaDeProducao.impl.SlabImpl
		 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getSlab()
		 * @generated
		 */
		EClass SLAB = eINSTANCE.getSlab();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLAB__WIDTH = eINSTANCE.getSlab_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLAB__HEIGTH = eINSTANCE.getSlab_Heigth();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLAB__LENGTH = eINSTANCE.getSlab_Length();

		/**
		 * The meta object literal for the '<em><b>Area Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLAB___AREA_FEATURE = eINSTANCE.getSlab__AreaFeature();

		/**
		 * The meta object literal for the '<em><b>Volume Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLAB___VOLUME_FEATURE = eINSTANCE.getSlab__VolumeFeature();

		/**
		 * The meta object literal for the '{@link linhaDeProducao.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linhaDeProducao.impl.ResourceImpl
		 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__ID = eINSTANCE.getResource_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TYPE = eINSTANCE.getResource_Type();

		/**
		 * The meta object literal for the '<em><b>Compute Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___COMPUTE_TIME = eINSTANCE.getResource__ComputeTime();

		/**
		 * The meta object literal for the '<em><b>Compute Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___COMPUTE_COST = eINSTANCE.getResource__ComputeCost();

		/**
		 * The meta object literal for the '{@link linhaDeProducao.impl.TransportImpl <em>Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linhaDeProducao.impl.TransportImpl
		 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getTransport()
		 * @generated
		 */
		EClass TRANSPORT = eINSTANCE.getTransport();

		/**
		 * The meta object literal for the '<em><b>Vel Movi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT__VEL_MOVI = eINSTANCE.getTransport_VelMovi();

		/**
		 * The meta object literal for the '<em><b>Dist Movi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT__DIST_MOVI = eINSTANCE.getTransport_DistMovi();

		/**
		 * The meta object literal for the '<em><b>Cus Movi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT__CUS_MOVI = eINSTANCE.getTransport_CusMovi();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT__FROM = eINSTANCE.getTransport_From();

		/**
		 * The meta object literal for the '<em><b>Sends To Fabrication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT__SENDS_TO_FABRICATION = eINSTANCE.getTransport_SendsToFabrication();

		/**
		 * The meta object literal for the '<em><b>Temp Impr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT__TEMP_IMPR = eINSTANCE.getTransport_TempImpr();

		/**
		 * The meta object literal for the '<em><b>Compute Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSPORT___COMPUTE_TIME = eINSTANCE.getTransport__ComputeTime();

		/**
		 * The meta object literal for the '<em><b>Compute Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSPORT___COMPUTE_COST = eINSTANCE.getTransport__ComputeCost();

		/**
		 * The meta object literal for the '{@link linhaDeProducao.impl.FabricationImpl <em>Fabrication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linhaDeProducao.impl.FabricationImpl
		 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getFabrication()
		 * @generated
		 */
		EClass FABRICATION = eINSTANCE.getFabrication();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FABRICATION__FEATURE = eINSTANCE.getFabrication_Feature();

		/**
		 * The meta object literal for the '<em><b>Salario Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__SALARIO_OP = eINSTANCE.getFabrication_SalarioOp();

		/**
		 * The meta object literal for the '<em><b>Salario Maq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__SALARIO_MAQ = eINSTANCE.getFabrication_SalarioMaq();

		/**
		 * The meta object literal for the '<em><b>Custo Ferr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__CUSTO_FERR = eINSTANCE.getFabrication_CustoFerr();

		/**
		 * The meta object literal for the '<em><b>Diam Corte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__DIAM_CORTE = eINSTANCE.getFabrication_DiamCorte();

		/**
		 * The meta object literal for the '<em><b>Prof Corte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__PROF_CORTE = eINSTANCE.getFabrication_ProfCorte();

		/**
		 * The meta object literal for the '<em><b>Comp Corte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__COMP_CORTE = eINSTANCE.getFabrication_CompCorte();

		/**
		 * The meta object literal for the '<em><b>Avanco</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__AVANCO = eINSTANCE.getFabrication_Avanco();

		/**
		 * The meta object literal for the '<em><b>Vel Corte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__VEL_CORTE = eINSTANCE.getFabrication_VelCorte();

		/**
		 * The meta object literal for the '<em><b>Temp Impr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__TEMP_IMPR = eINSTANCE.getFabrication_TempImpr();

		/**
		 * The meta object literal for the '<em><b>Vel Avanco</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__VEL_AVANCO = eINSTANCE.getFabrication_VelAvanco();

		/**
		 * The meta object literal for the '<em><b>Taxa Acab</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__TAXA_ACAB = eINSTANCE.getFabrication_TaxaAcab();

		/**
		 * The meta object literal for the '<em><b>Vida Ferr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__VIDA_FERR = eINSTANCE.getFabrication_VidaFerr();

		/**
		 * The meta object literal for the '<em><b>Troca Ferr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__TROCA_FERR = eINSTANCE.getFabrication_TrocaFerr();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FABRICATION__TO = eINSTANCE.getFabrication_To();

		/**
		 * The meta object literal for the '<em><b>Sends To Transport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FABRICATION__SENDS_TO_TRANSPORT = eINSTANCE.getFabrication_SendsToTransport();

		/**
		 * The meta object literal for the '<em><b>Cap Broca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FABRICATION__CAP_BROCA = eINSTANCE.getFabrication_CapBroca();

		/**
		 * The meta object literal for the '<em><b>Compute Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FABRICATION___COMPUTE_TIME = eINSTANCE.getFabrication__ComputeTime();

		/**
		 * The meta object literal for the '<em><b>Compute Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FABRICATION___COMPUTE_COST = eINSTANCE.getFabrication__ComputeCost();

		/**
		 * The meta object literal for the '{@link linhaDeProducao.impl.SimulationImpl <em>Simulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see linhaDeProducao.impl.SimulationImpl
		 * @see linhaDeProducao.impl.LinhaDeProducaoPackageImpl#getSimulation()
		 * @generated
		 */
		EClass SIMULATION = eINSTANCE.getSimulation();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__RESOURCE = eINSTANCE.getSimulation_Resource();

		/**
		 * The meta object literal for the '<em><b>Piece</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__PIECE = eINSTANCE.getSimulation_Piece();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION__NAME = eINSTANCE.getSimulation_Name();

	}

} //LinhaDeProducaoPackage
