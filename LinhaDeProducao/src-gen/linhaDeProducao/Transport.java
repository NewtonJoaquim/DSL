/**
 */
package linhaDeProducao;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link linhaDeProducao.Transport#getVelMovi <em>Vel Movi</em>}</li>
 *   <li>{@link linhaDeProducao.Transport#getDistMovi <em>Dist Movi</em>}</li>
 *   <li>{@link linhaDeProducao.Transport#getCusMovi <em>Cus Movi</em>}</li>
 *   <li>{@link linhaDeProducao.Transport#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see linhaDeProducao.LinhaDeProducaoPackage#getTransport()
 * @model
 * @generated
 */
public interface Transport extends Resource {
	/**
	 * Returns the value of the '<em><b>Vel Movi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vel Movi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vel Movi</em>' attribute.
	 * @see #setVelMovi(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getTransport_VelMovi()
	 * @model required="true"
	 * @generated
	 */
	double getVelMovi();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Transport#getVelMovi <em>Vel Movi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vel Movi</em>' attribute.
	 * @see #getVelMovi()
	 * @generated
	 */
	void setVelMovi(double value);

	/**
	 * Returns the value of the '<em><b>Dist Movi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dist Movi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dist Movi</em>' attribute.
	 * @see #setDistMovi(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getTransport_DistMovi()
	 * @model required="true"
	 * @generated
	 */
	double getDistMovi();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Transport#getDistMovi <em>Dist Movi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dist Movi</em>' attribute.
	 * @see #getDistMovi()
	 * @generated
	 */
	void setDistMovi(double value);

	/**
	 * Returns the value of the '<em><b>Cus Movi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cus Movi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cus Movi</em>' attribute.
	 * @see #setCusMovi(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getTransport_CusMovi()
	 * @model required="true"
	 * @generated
	 */
	double getCusMovi();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Transport#getCusMovi <em>Cus Movi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cus Movi</em>' attribute.
	 * @see #getCusMovi()
	 * @generated
	 */
	void setCusMovi(double value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link linhaDeProducao.Fabrication#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Fabrication)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getTransport_From()
	 * @see linhaDeProducao.Fabrication#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	Fabrication getFrom();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Transport#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Fabrication value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	double computeTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	double computeCost();

} // Transport
