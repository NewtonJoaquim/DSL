/**
 */
package linhaDeProducao.impl;

import linhaDeProducao.Fabrication;
import linhaDeProducao.LinhaDeProducaoPackage;
import linhaDeProducao.Transport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link linhaDeProducao.impl.TransportImpl#getVelMovi <em>Vel Movi</em>}</li>
 *   <li>{@link linhaDeProducao.impl.TransportImpl#getDistMovi <em>Dist Movi</em>}</li>
 *   <li>{@link linhaDeProducao.impl.TransportImpl#getCusMovi <em>Cus Movi</em>}</li>
 *   <li>{@link linhaDeProducao.impl.TransportImpl#getSendsToFabrication <em>Sends To Fabrication</em>}</li>
 *   <li>{@link linhaDeProducao.impl.TransportImpl#getTempImpr <em>Temp Impr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportImpl extends ResourceImpl implements Transport {
	/**
	 * The default value of the '{@link #getVelMovi() <em>Vel Movi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelMovi()
	 * @generated
	 * @ordered
	 */
	protected static final double VEL_MOVI_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVelMovi() <em>Vel Movi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelMovi()
	 * @generated
	 * @ordered
	 */
	protected double velMovi = VEL_MOVI_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistMovi() <em>Dist Movi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistMovi()
	 * @generated
	 * @ordered
	 */
	protected static final double DIST_MOVI_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistMovi() <em>Dist Movi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistMovi()
	 * @generated
	 * @ordered
	 */
	protected double distMovi = DIST_MOVI_EDEFAULT;

	/**
	 * The default value of the '{@link #getCusMovi() <em>Cus Movi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCusMovi()
	 * @generated
	 * @ordered
	 */
	protected static final double CUS_MOVI_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCusMovi() <em>Cus Movi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCusMovi()
	 * @generated
	 * @ordered
	 */
	protected double cusMovi = CUS_MOVI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSendsToFabrication() <em>Sends To Fabrication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsToFabrication()
	 * @generated
	 * @ordered
	 */
	protected Fabrication sendsToFabrication;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinhaDeProducaoPackage.Literals.TRANSPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVelMovi() {
		return velMovi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelMovi(double newVelMovi) {
		double oldVelMovi = velMovi;
		velMovi = newVelMovi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.TRANSPORT__VEL_MOVI,
					oldVelMovi, velMovi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistMovi() {
		return distMovi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistMovi(double newDistMovi) {
		double oldDistMovi = distMovi;
		distMovi = newDistMovi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.TRANSPORT__DIST_MOVI,
					oldDistMovi, distMovi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCusMovi() {
		return cusMovi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCusMovi(double newCusMovi) {
		double oldCusMovi = cusMovi;
		cusMovi = newCusMovi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.TRANSPORT__CUS_MOVI,
					oldCusMovi, cusMovi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fabrication getSendsToFabrication() {
		if (sendsToFabrication != null && sendsToFabrication.eIsProxy()) {
			InternalEObject oldSendsToFabrication = (InternalEObject) sendsToFabrication;
			sendsToFabrication = (Fabrication) eResolveProxy(oldSendsToFabrication);
			if (sendsToFabrication != oldSendsToFabrication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							LinhaDeProducaoPackage.TRANSPORT__SENDS_TO_FABRICATION, oldSendsToFabrication,
							sendsToFabrication));
			}
		}
		return sendsToFabrication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fabrication basicGetSendsToFabrication() {
		return sendsToFabrication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendsToFabrication(Fabrication newSendsToFabrication) {
		Fabrication oldSendsToFabrication = sendsToFabrication;
		sendsToFabrication = newSendsToFabrication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					LinhaDeProducaoPackage.TRANSPORT__SENDS_TO_FABRICATION, oldSendsToFabrication, sendsToFabrication));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.TRANSPORT__TEMP_IMPR,
					oldTempImpr, tempImpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LinhaDeProducaoPackage.TRANSPORT__VEL_MOVI:
			return getVelMovi();
		case LinhaDeProducaoPackage.TRANSPORT__DIST_MOVI:
			return getDistMovi();
		case LinhaDeProducaoPackage.TRANSPORT__CUS_MOVI:
			return getCusMovi();
		case LinhaDeProducaoPackage.TRANSPORT__SENDS_TO_FABRICATION:
			if (resolve)
				return getSendsToFabrication();
			return basicGetSendsToFabrication();
		case LinhaDeProducaoPackage.TRANSPORT__TEMP_IMPR:
			return getTempImpr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LinhaDeProducaoPackage.TRANSPORT__VEL_MOVI:
			setVelMovi((Double) newValue);
			return;
		case LinhaDeProducaoPackage.TRANSPORT__DIST_MOVI:
			setDistMovi((Double) newValue);
			return;
		case LinhaDeProducaoPackage.TRANSPORT__CUS_MOVI:
			setCusMovi((Double) newValue);
			return;
		case LinhaDeProducaoPackage.TRANSPORT__SENDS_TO_FABRICATION:
			setSendsToFabrication((Fabrication) newValue);
			return;
		case LinhaDeProducaoPackage.TRANSPORT__TEMP_IMPR:
			setTempImpr((Double) newValue);
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
		case LinhaDeProducaoPackage.TRANSPORT__VEL_MOVI:
			setVelMovi(VEL_MOVI_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.TRANSPORT__DIST_MOVI:
			setDistMovi(DIST_MOVI_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.TRANSPORT__CUS_MOVI:
			setCusMovi(CUS_MOVI_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.TRANSPORT__SENDS_TO_FABRICATION:
			setSendsToFabrication((Fabrication) null);
			return;
		case LinhaDeProducaoPackage.TRANSPORT__TEMP_IMPR:
			setTempImpr(TEMP_IMPR_EDEFAULT);
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
		case LinhaDeProducaoPackage.TRANSPORT__VEL_MOVI:
			return velMovi != VEL_MOVI_EDEFAULT;
		case LinhaDeProducaoPackage.TRANSPORT__DIST_MOVI:
			return distMovi != DIST_MOVI_EDEFAULT;
		case LinhaDeProducaoPackage.TRANSPORT__CUS_MOVI:
			return cusMovi != CUS_MOVI_EDEFAULT;
		case LinhaDeProducaoPackage.TRANSPORT__SENDS_TO_FABRICATION:
			return sendsToFabrication != null;
		case LinhaDeProducaoPackage.TRANSPORT__TEMP_IMPR:
			return tempImpr != TEMP_IMPR_EDEFAULT;
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
		result.append(" (velMovi: ");
		result.append(velMovi);
		result.append(", distMovi: ");
		result.append(distMovi);
		result.append(", cusMovi: ");
		result.append(cusMovi);
		result.append(", tempImpr: ");
		result.append(tempImpr);
		result.append(')');
		return result.toString();
	}

} //TransportImpl
