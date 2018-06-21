/**
 */
package linhaDeProducao;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fabrication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link linhaDeProducao.Fabrication#getFeature <em>Feature</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getSalarioOp <em>Salario Op</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getSalarioMaq <em>Salario Maq</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getCustoFerr <em>Custo Ferr</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getDiamCorte <em>Diam Corte</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getProfCorte <em>Prof Corte</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getCompCorte <em>Comp Corte</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getAvanco <em>Avanco</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getVelCorte <em>Vel Corte</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getTempImpr <em>Temp Impr</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getVelAvanco <em>Vel Avanco</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getTaxaAcab <em>Taxa Acab</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getVidaFerr <em>Vida Ferr</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getTrocaFerr <em>Troca Ferr</em>}</li>
 *   <li>{@link linhaDeProducao.Fabrication#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication()
 * @model
 * @generated
 */
public interface Fabrication extends Resource {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link linhaDeProducao.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_Feature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Salario Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salario Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salario Op</em>' attribute.
	 * @see #setSalarioOp(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_SalarioOp()
	 * @model required="true"
	 * @generated
	 */
	double getSalarioOp();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getSalarioOp <em>Salario Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salario Op</em>' attribute.
	 * @see #getSalarioOp()
	 * @generated
	 */
	void setSalarioOp(double value);

	/**
	 * Returns the value of the '<em><b>Salario Maq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salario Maq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salario Maq</em>' attribute.
	 * @see #setSalarioMaq(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_SalarioMaq()
	 * @model required="true"
	 * @generated
	 */
	double getSalarioMaq();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getSalarioMaq <em>Salario Maq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salario Maq</em>' attribute.
	 * @see #getSalarioMaq()
	 * @generated
	 */
	void setSalarioMaq(double value);

	/**
	 * Returns the value of the '<em><b>Custo Ferr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custo Ferr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custo Ferr</em>' attribute.
	 * @see #setCustoFerr(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_CustoFerr()
	 * @model required="true"
	 * @generated
	 */
	double getCustoFerr();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getCustoFerr <em>Custo Ferr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custo Ferr</em>' attribute.
	 * @see #getCustoFerr()
	 * @generated
	 */
	void setCustoFerr(double value);

	/**
	 * Returns the value of the '<em><b>Diam Corte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diam Corte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diam Corte</em>' attribute.
	 * @see #setDiamCorte(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_DiamCorte()
	 * @model required="true"
	 * @generated
	 */
	double getDiamCorte();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getDiamCorte <em>Diam Corte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diam Corte</em>' attribute.
	 * @see #getDiamCorte()
	 * @generated
	 */
	void setDiamCorte(double value);

	/**
	 * Returns the value of the '<em><b>Prof Corte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prof Corte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prof Corte</em>' attribute.
	 * @see #setProfCorte(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_ProfCorte()
	 * @model required="true"
	 * @generated
	 */
	double getProfCorte();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getProfCorte <em>Prof Corte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prof Corte</em>' attribute.
	 * @see #getProfCorte()
	 * @generated
	 */
	void setProfCorte(double value);

	/**
	 * Returns the value of the '<em><b>Comp Corte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Corte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Corte</em>' attribute.
	 * @see #setCompCorte(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_CompCorte()
	 * @model required="true"
	 * @generated
	 */
	double getCompCorte();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getCompCorte <em>Comp Corte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Corte</em>' attribute.
	 * @see #getCompCorte()
	 * @generated
	 */
	void setCompCorte(double value);

	/**
	 * Returns the value of the '<em><b>Avanco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avanco</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avanco</em>' attribute.
	 * @see #setAvanco(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_Avanco()
	 * @model required="true"
	 * @generated
	 */
	double getAvanco();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getAvanco <em>Avanco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avanco</em>' attribute.
	 * @see #getAvanco()
	 * @generated
	 */
	void setAvanco(double value);

	/**
	 * Returns the value of the '<em><b>Vel Corte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vel Corte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vel Corte</em>' attribute.
	 * @see #setVelCorte(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_VelCorte()
	 * @model required="true"
	 * @generated
	 */
	double getVelCorte();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getVelCorte <em>Vel Corte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vel Corte</em>' attribute.
	 * @see #getVelCorte()
	 * @generated
	 */
	void setVelCorte(double value);

	/**
	 * Returns the value of the '<em><b>Temp Impr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp Impr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Impr</em>' attribute.
	 * @see #setTempImpr(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_TempImpr()
	 * @model required="true"
	 * @generated
	 */
	double getTempImpr();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getTempImpr <em>Temp Impr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Impr</em>' attribute.
	 * @see #getTempImpr()
	 * @generated
	 */
	void setTempImpr(double value);

	/**
	 * Returns the value of the '<em><b>Vel Avanco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vel Avanco</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vel Avanco</em>' attribute.
	 * @see #setVelAvanco(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_VelAvanco()
	 * @model required="true"
	 * @generated
	 */
	double getVelAvanco();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getVelAvanco <em>Vel Avanco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vel Avanco</em>' attribute.
	 * @see #getVelAvanco()
	 * @generated
	 */
	void setVelAvanco(double value);

	/**
	 * Returns the value of the '<em><b>Taxa Acab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxa Acab</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxa Acab</em>' attribute.
	 * @see #setTaxaAcab(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_TaxaAcab()
	 * @model required="true"
	 * @generated
	 */
	double getTaxaAcab();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getTaxaAcab <em>Taxa Acab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxa Acab</em>' attribute.
	 * @see #getTaxaAcab()
	 * @generated
	 */
	void setTaxaAcab(double value);

	/**
	 * Returns the value of the '<em><b>Vida Ferr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vida Ferr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vida Ferr</em>' attribute.
	 * @see #setVidaFerr(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_VidaFerr()
	 * @model required="true"
	 * @generated
	 */
	double getVidaFerr();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getVidaFerr <em>Vida Ferr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vida Ferr</em>' attribute.
	 * @see #getVidaFerr()
	 * @generated
	 */
	void setVidaFerr(double value);

	/**
	 * Returns the value of the '<em><b>Troca Ferr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Troca Ferr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Troca Ferr</em>' attribute.
	 * @see #setTrocaFerr(double)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_TrocaFerr()
	 * @model required="true"
	 * @generated
	 */
	double getTrocaFerr();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getTrocaFerr <em>Troca Ferr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Troca Ferr</em>' attribute.
	 * @see #getTrocaFerr()
	 * @generated
	 */
	void setTrocaFerr(double value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link linhaDeProducao.Transport#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Transport)
	 * @see linhaDeProducao.LinhaDeProducaoPackage#getFabrication_To()
	 * @see linhaDeProducao.Transport#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	Transport getTo();

	/**
	 * Sets the value of the '{@link linhaDeProducao.Fabrication#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Transport value);

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

} // Fabrication
