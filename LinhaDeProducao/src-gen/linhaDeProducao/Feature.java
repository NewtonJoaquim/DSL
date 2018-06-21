/**
 */
package linhaDeProducao;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link linhaDeProducao.Feature#getId <em>Id</em>}</li>
 *   <li>{@link linhaDeProducao.Feature#getName <em>Name</em>}</li>
 *   <li>{@link linhaDeProducao.Feature#getType <em>Type</em>}</li>
 *   <li>{@link linhaDeProducao.Feature#getPositionX <em>Position X</em>}</li>
 *   <li>{@link linhaDeProducao.Feature#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link linhaDeProducao.Feature#getPositionZ <em>Position Z</em>}</li>
 *   <li>{@link linhaDeProducao.Feature#getOritentation <em>Oritentation</em>}</li>
 * </ul>
 *
 * @see linhaDeProducao.LinhaDeProducaoPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFeature_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Feature#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFeature_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFeature_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Feature#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position X</em>' attribute.
	 * @see #setPositionX(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFeature_PositionX()
	 * @model required="true"
	 * @generated
	 */
	double getPositionX();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Feature#getPositionX <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position X</em>' attribute.
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(double value);

	/**
	 * Returns the value of the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Y</em>' attribute.
	 * @see #setPositionY(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFeature_PositionY()
	 * @model required="true"
	 * @generated
	 */
	double getPositionY();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Feature#getPositionY <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Y</em>' attribute.
	 * @see #getPositionY()
	 * @generated
	 */
	void setPositionY(double value);

	/**
	 * Returns the value of the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Z</em>' attribute.
	 * @see #setPositionZ(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFeature_PositionZ()
	 * @model required="true"
	 * @generated
	 */
	double getPositionZ();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Feature#getPositionZ <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Z</em>' attribute.
	 * @see #getPositionZ()
	 * @generated
	 */
	void setPositionZ(double value);

	/**
	 * Returns the value of the '<em><b>Oritentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oritentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oritentation</em>' attribute.
	 * @see #setOritentation(int)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFeature_Oritentation()
	 * @model required="true"
	 * @generated
	 */
	int getOritentation();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Feature#getOritentation <em>Oritentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oritentation</em>' attribute.
	 * @see #getOritentation()
	 * @generated
	 */
	void setOritentation(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	double areaFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	double volumeFeature();

} // Feature
