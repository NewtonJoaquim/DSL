/**
 */
package linhaDeProducao;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotational</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link linhaDeProducao.Rotational#getWidth <em>Width</em>}</li>
 *   <li>{@link linhaDeProducao.Rotational#getDiametroMenor <em>Diametro Menor</em>}</li>
 *   <li>{@link linhaDeProducao.Rotational#getDiametroMaior <em>Diametro Maior</em>}</li>
 * </ul>
 *
 * @see linhaDeProducao.LinhaDeProducaoPackage#getRotational()
 * @model
 * @generated
 */
public interface Rotational extends Feature {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getRotational_Width()
	 * @model required="true"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Rotational#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Diametro Menor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diametro Menor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diametro Menor</em>' attribute.
	 * @see #setDiametroMenor(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getRotational_DiametroMenor()
	 * @model required="true"
	 * @generated
	 */
	double getDiametroMenor();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Rotational#getDiametroMenor <em>Diametro Menor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diametro Menor</em>' attribute.
	 * @see #getDiametroMenor()
	 * @generated
	 */
	void setDiametroMenor(double value);

	/**
	 * Returns the value of the '<em><b>Diametro Maior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diametro Maior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diametro Maior</em>' attribute.
	 * @see #setDiametroMaior(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getRotational_DiametroMaior()
	 * @model required="true"
	 * @generated
	 */
	double getDiametroMaior();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Rotational#getDiametroMaior <em>Diametro Maior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diametro Maior</em>' attribute.
	 * @see #getDiametroMaior()
	 * @generated
	 */
	void setDiametroMaior(double value);

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

} // Rotational
