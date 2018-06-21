/**
 */
package linhaDeProducao;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revolving</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link linhaDeProducao.Revolving#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link linhaDeProducao.Revolving#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see linhaDeProducao.LinhaDeProducaoPackage#getRevolving()
 * @model
 * @generated
 */
public interface Revolving extends Feature {
	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter</em>' attribute.
	 * @see #setDiameter(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getRevolving_Diameter()
	 * @model required="true"
	 * @generated
	 */
	double getDiameter();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Revolving#getDiameter <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' attribute.
	 * @see #getDiameter()
	 * @generated
	 */
	void setDiameter(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getRevolving_Height()
	 * @model required="true"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Revolving#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

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

} // Revolving
