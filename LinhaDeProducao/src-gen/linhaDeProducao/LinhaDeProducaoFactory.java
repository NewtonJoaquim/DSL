/**
 */
package linhaDeProducao;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see linhaDeProducao.LinhaDeProducaoPackage
 * @generated
 */
public interface LinhaDeProducaoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinhaDeProducaoFactory eINSTANCE = linhaDeProducao.impl.LinhaDeProducaoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Piece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Piece</em>'.
	 * @generated
	 */
	Piece createPiece();

	/**
	 * Returns a new object of class '<em>Prismatic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prismatic</em>'.
	 * @generated
	 */
	Prismatic createPrismatic();

	/**
	 * Returns a new object of class '<em>Rotational</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotational</em>'.
	 * @generated
	 */
	Rotational createRotational();

	/**
	 * Returns a new object of class '<em>Revolving</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revolving</em>'.
	 * @generated
	 */
	Revolving createRevolving();

	/**
	 * Returns a new object of class '<em>Slab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slab</em>'.
	 * @generated
	 */
	Slab createSlab();

	/**
	 * Returns a new object of class '<em>Transport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport</em>'.
	 * @generated
	 */
	Transport createTransport();

	/**
	 * Returns a new object of class '<em>Fabrication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fabrication</em>'.
	 * @generated
	 */
	Fabrication createFabrication();

	/**
	 * Returns a new object of class '<em>Simulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation</em>'.
	 * @generated
	 */
	Simulation createSimulation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LinhaDeProducaoPackage getLinhaDeProducaoPackage();

} //LinhaDeProducaoFactory
