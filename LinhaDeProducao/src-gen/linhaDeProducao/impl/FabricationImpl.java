/**
 */
package linhaDeProducao.impl;

import java.util.Collection;

import linhaDeProducao.Fabrication;
import linhaDeProducao.Feature;
import linhaDeProducao.LinhaDeProducaoPackage;

import linhaDeProducao.Transport;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fabrication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getSalarioOp <em>Salario Op</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getSalarioMaq <em>Salario Maq</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getCustoFerr <em>Custo Ferr</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getDiamCorte <em>Diam Corte</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getProfCorte <em>Prof Corte</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getCompCorte <em>Comp Corte</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getAvanco <em>Avanco</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getVelCorte <em>Vel Corte</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getTempImpr <em>Temp Impr</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getVelAvanco <em>Vel Avanco</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getTaxaAcab <em>Taxa Acab</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getVidaFerr <em>Vida Ferr</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getTrocaFerr <em>Troca Ferr</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FabricationImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FabricationImpl extends ResourceImpl implements Fabrication {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * The default value of the '{@link #getSalarioOp() <em>Salario Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalarioOp()
	 * @generated
	 * @ordered
	 */
	protected static final double SALARIO_OP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSalarioOp() <em>Salario Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalarioOp()
	 * @generated
	 * @ordered
	 */
	protected double salarioOp = SALARIO_OP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalarioMaq() <em>Salario Maq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalarioMaq()
	 * @generated
	 * @ordered
	 */
	protected static final double SALARIO_MAQ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSalarioMaq() <em>Salario Maq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalarioMaq()
	 * @generated
	 * @ordered
	 */
	protected double salarioMaq = SALARIO_MAQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustoFerr() <em>Custo Ferr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustoFerr()
	 * @generated
	 * @ordered
	 */
	protected static final double CUSTO_FERR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCustoFerr() <em>Custo Ferr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustoFerr()
	 * @generated
	 * @ordered
	 */
	protected double custoFerr = CUSTO_FERR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiamCorte() <em>Diam Corte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiamCorte()
	 * @generated
	 * @ordered
	 */
	protected static final double DIAM_CORTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiamCorte() <em>Diam Corte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiamCorte()
	 * @generated
	 * @ordered
	 */
	protected double diamCorte = DIAM_CORTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfCorte() <em>Prof Corte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfCorte()
	 * @generated
	 * @ordered
	 */
	protected static final double PROF_CORTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProfCorte() <em>Prof Corte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfCorte()
	 * @generated
	 * @ordered
	 */
	protected double profCorte = PROF_CORTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompCorte() <em>Comp Corte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompCorte()
	 * @generated
	 * @ordered
	 */
	protected static final double COMP_CORTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompCorte() <em>Comp Corte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompCorte()
	 * @generated
	 * @ordered
	 */
	protected double compCorte = COMP_CORTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvanco() <em>Avanco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvanco()
	 * @generated
	 * @ordered
	 */
	protected static final double AVANCO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvanco() <em>Avanco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvanco()
	 * @generated
	 * @ordered
	 */
	protected double avanco = AVANCO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVelCorte() <em>Vel Corte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelCorte()
	 * @generated
	 * @ordered
	 */
	protected static final double VEL_CORTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVelCorte() <em>Vel Corte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelCorte()
	 * @generated
	 * @ordered
	 */
	protected double velCorte = VEL_CORTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempImpr() <em>Temp Impr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempImpr()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMP_IMPR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTempImpr() <em>Temp Impr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempImpr()
	 * @generated
	 * @ordered
	 */
	protected double tempImpr = TEMP_IMPR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVelAvanco() <em>Vel Avanco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelAvanco()
	 * @generated
	 * @ordered
	 */
	protected static final double VEL_AVANCO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVelAvanco() <em>Vel Avanco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelAvanco()
	 * @generated
	 * @ordered
	 */
	protected double velAvanco = VEL_AVANCO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxaAcab() <em>Taxa Acab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxaAcab()
	 * @generated
	 * @ordered
	 */
	protected static final double TAXA_ACAB_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTaxaAcab() <em>Taxa Acab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxaAcab()
	 * @generated
	 * @ordered
	 */
	protected double taxaAcab = TAXA_ACAB_EDEFAULT;

	/**
	 * The default value of the '{@link #getVidaFerr() <em>Vida Ferr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVidaFerr()
	 * @generated
	 * @ordered
	 */
	protected static final double VIDA_FERR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVidaFerr() <em>Vida Ferr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVidaFerr()
	 * @generated
	 * @ordered
	 */
	protected double vidaFerr = VIDA_FERR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrocaFerr() <em>Troca Ferr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrocaFerr()
	 * @generated
	 * @ordered
	 */
	protected static final double TROCA_FERR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTrocaFerr() <em>Troca Ferr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrocaFerr()
	 * @generated
	 * @ordered
	 */
	protected double trocaFerr = TROCA_FERR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Transport to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FabricationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinhaDeProducaoPackage.Literals.FABRICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectContainmentEList<Feature>(Feature.class, this,
					LinhaDeProducaoPackage.FABRICATION__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSalarioOp() {
		return salarioOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalarioOp(double newSalarioOp) {
		double oldSalarioOp = salarioOp;
		salarioOp = newSalarioOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__SALARIO_OP,
					oldSalarioOp, salarioOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSalarioMaq() {
		return salarioMaq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalarioMaq(double newSalarioMaq) {
		double oldSalarioMaq = salarioMaq;
		salarioMaq = newSalarioMaq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__SALARIO_MAQ,
					oldSalarioMaq, salarioMaq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCustoFerr() {
		return custoFerr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustoFerr(double newCustoFerr) {
		double oldCustoFerr = custoFerr;
		custoFerr = newCustoFerr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__CUSTO_FERR,
					oldCustoFerr, custoFerr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiamCorte() {
		return diamCorte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiamCorte(double newDiamCorte) {
		double oldDiamCorte = diamCorte;
		diamCorte = newDiamCorte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__DIAM_CORTE,
					oldDiamCorte, diamCorte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProfCorte() {
		return profCorte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfCorte(double newProfCorte) {
		double oldProfCorte = profCorte;
		profCorte = newProfCorte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__PROF_CORTE,
					oldProfCorte, profCorte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompCorte() {
		return compCorte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompCorte(double newCompCorte) {
		double oldCompCorte = compCorte;
		compCorte = newCompCorte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__COMP_CORTE,
					oldCompCorte, compCorte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvanco() {
		return avanco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvanco(double newAvanco) {
		double oldAvanco = avanco;
		avanco = newAvanco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__AVANCO, oldAvanco,
					avanco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVelCorte() {
		return velCorte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelCorte(double newVelCorte) {
		double oldVelCorte = velCorte;
		velCorte = newVelCorte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__VEL_CORTE,
					oldVelCorte, velCorte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTempImpr() {
		return tempImpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempImpr(double newTempImpr) {
		double oldTempImpr = tempImpr;
		tempImpr = newTempImpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__TEMP_IMPR,
					oldTempImpr, tempImpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVelAvanco() {
		return velAvanco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelAvanco(double newVelAvanco) {
		double oldVelAvanco = velAvanco;
		velAvanco = newVelAvanco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__VEL_AVANCO,
					oldVelAvanco, velAvanco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTaxaAcab() {
		return taxaAcab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxaAcab(double newTaxaAcab) {
		double oldTaxaAcab = taxaAcab;
		taxaAcab = newTaxaAcab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__TAXA_ACAB,
					oldTaxaAcab, taxaAcab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVidaFerr() {
		return vidaFerr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVidaFerr(double newVidaFerr) {
		double oldVidaFerr = vidaFerr;
		vidaFerr = newVidaFerr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__VIDA_FERR,
					oldVidaFerr, vidaFerr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTrocaFerr() {
		return trocaFerr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrocaFerr(double newTrocaFerr) {
		double oldTrocaFerr = trocaFerr;
		trocaFerr = newTrocaFerr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__TROCA_FERR,
					oldTrocaFerr, trocaFerr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transport getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject) to;
			to = (Transport) eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinhaDeProducaoPackage.FABRICATION__TO,
							oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transport basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Transport newTo, NotificationChain msgs) {
		Transport oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LinhaDeProducaoPackage.FABRICATION__TO, oldTo, newTo);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Transport newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject) to).eInverseRemove(this, LinhaDeProducaoPackage.TRANSPORT__FROM,
						Transport.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject) newTo).eInverseAdd(this, LinhaDeProducaoPackage.TRANSPORT__FROM,
						Transport.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FABRICATION__TO, newTo,
					newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LinhaDeProducaoPackage.FABRICATION__TO:
			if (to != null)
				msgs = ((InternalEObject) to).eInverseRemove(this, LinhaDeProducaoPackage.TRANSPORT__FROM,
						Transport.class, msgs);
			return basicSetTo((Transport) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LinhaDeProducaoPackage.FABRICATION__FEATURE:
			return ((InternalEList<?>) getFeature()).basicRemove(otherEnd, msgs);
		case LinhaDeProducaoPackage.FABRICATION__TO:
			return basicSetTo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LinhaDeProducaoPackage.FABRICATION__FEATURE:
			return getFeature();
		case LinhaDeProducaoPackage.FABRICATION__SALARIO_OP:
			return getSalarioOp();
		case LinhaDeProducaoPackage.FABRICATION__SALARIO_MAQ:
			return getSalarioMaq();
		case LinhaDeProducaoPackage.FABRICATION__CUSTO_FERR:
			return getCustoFerr();
		case LinhaDeProducaoPackage.FABRICATION__DIAM_CORTE:
			return getDiamCorte();
		case LinhaDeProducaoPackage.FABRICATION__PROF_CORTE:
			return getProfCorte();
		case LinhaDeProducaoPackage.FABRICATION__COMP_CORTE:
			return getCompCorte();
		case LinhaDeProducaoPackage.FABRICATION__AVANCO:
			return getAvanco();
		case LinhaDeProducaoPackage.FABRICATION__VEL_CORTE:
			return getVelCorte();
		case LinhaDeProducaoPackage.FABRICATION__TEMP_IMPR:
			return getTempImpr();
		case LinhaDeProducaoPackage.FABRICATION__VEL_AVANCO:
			return getVelAvanco();
		case LinhaDeProducaoPackage.FABRICATION__TAXA_ACAB:
			return getTaxaAcab();
		case LinhaDeProducaoPackage.FABRICATION__VIDA_FERR:
			return getVidaFerr();
		case LinhaDeProducaoPackage.FABRICATION__TROCA_FERR:
			return getTrocaFerr();
		case LinhaDeProducaoPackage.FABRICATION__TO:
			if (resolve)
				return getTo();
			return basicGetTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LinhaDeProducaoPackage.FABRICATION__FEATURE:
			getFeature().clear();
			getFeature().addAll((Collection<? extends Feature>) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__SALARIO_OP:
			setSalarioOp((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__SALARIO_MAQ:
			setSalarioMaq((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__CUSTO_FERR:
			setCustoFerr((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__DIAM_CORTE:
			setDiamCorte((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__PROF_CORTE:
			setProfCorte((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__COMP_CORTE:
			setCompCorte((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__AVANCO:
			setAvanco((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__VEL_CORTE:
			setVelCorte((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__TEMP_IMPR:
			setTempImpr((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__VEL_AVANCO:
			setVelAvanco((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__TAXA_ACAB:
			setTaxaAcab((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__VIDA_FERR:
			setVidaFerr((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__TROCA_FERR:
			setTrocaFerr((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FABRICATION__TO:
			setTo((Transport) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case LinhaDeProducaoPackage.FABRICATION__FEATURE:
			getFeature().clear();
			return;
		case LinhaDeProducaoPackage.FABRICATION__SALARIO_OP:
			setSalarioOp(SALARIO_OP_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__SALARIO_MAQ:
			setSalarioMaq(SALARIO_MAQ_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__CUSTO_FERR:
			setCustoFerr(CUSTO_FERR_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__DIAM_CORTE:
			setDiamCorte(DIAM_CORTE_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__PROF_CORTE:
			setProfCorte(PROF_CORTE_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__COMP_CORTE:
			setCompCorte(COMP_CORTE_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__AVANCO:
			setAvanco(AVANCO_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__VEL_CORTE:
			setVelCorte(VEL_CORTE_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__TEMP_IMPR:
			setTempImpr(TEMP_IMPR_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__VEL_AVANCO:
			setVelAvanco(VEL_AVANCO_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__TAXA_ACAB:
			setTaxaAcab(TAXA_ACAB_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__VIDA_FERR:
			setVidaFerr(VIDA_FERR_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__TROCA_FERR:
			setTrocaFerr(TROCA_FERR_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FABRICATION__TO:
			setTo((Transport) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LinhaDeProducaoPackage.FABRICATION__FEATURE:
			return feature != null && !feature.isEmpty();
		case LinhaDeProducaoPackage.FABRICATION__SALARIO_OP:
			return salarioOp != SALARIO_OP_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__SALARIO_MAQ:
			return salarioMaq != SALARIO_MAQ_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__CUSTO_FERR:
			return custoFerr != CUSTO_FERR_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__DIAM_CORTE:
			return diamCorte != DIAM_CORTE_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__PROF_CORTE:
			return profCorte != PROF_CORTE_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__COMP_CORTE:
			return compCorte != COMP_CORTE_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__AVANCO:
			return avanco != AVANCO_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__VEL_CORTE:
			return velCorte != VEL_CORTE_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__TEMP_IMPR:
			return tempImpr != TEMP_IMPR_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__VEL_AVANCO:
			return velAvanco != VEL_AVANCO_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__TAXA_ACAB:
			return taxaAcab != TAXA_ACAB_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__VIDA_FERR:
			return vidaFerr != VIDA_FERR_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__TROCA_FERR:
			return trocaFerr != TROCA_FERR_EDEFAULT;
		case LinhaDeProducaoPackage.FABRICATION__TO:
			return to != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (salarioOp: ");
		result.append(salarioOp);
		result.append(", salarioMaq: ");
		result.append(salarioMaq);
		result.append(", custoFerr: ");
		result.append(custoFerr);
		result.append(", diamCorte: ");
		result.append(diamCorte);
		result.append(", profCorte: ");
		result.append(profCorte);
		result.append(", compCorte: ");
		result.append(compCorte);
		result.append(", avanco: ");
		result.append(avanco);
		result.append(", velCorte: ");
		result.append(velCorte);
		result.append(", tempImpr: ");
		result.append(tempImpr);
		result.append(", velAvanco: ");
		result.append(velAvanco);
		result.append(", taxaAcab: ");
		result.append(taxaAcab);
		result.append(", vidaFerr: ");
		result.append(vidaFerr);
		result.append(", trocaFerr: ");
		result.append(trocaFerr);
		result.append(')');
		return result.toString();
	}

} //FabricationImpl
