/**
 */
package linhaDeProducao.impl;

import linhaDeProducao.LinhaDeProducaoPackage;
import linhaDeProducao.Rotational;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotational</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link linhaDeProducao.impl.RotationalImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link linhaDeProducao.impl.RotationalImpl#getDiametroMenor <em>Diametro Menor</em>}</li>
 *   <li>{@link linhaDeProducao.impl.RotationalImpl#getDiametroMaior <em>Diametro Maior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotationalImpl extends FeatureImpl implements Rotational {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiametroMenor() <em>Diametro Menor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiametroMenor()
	 * @generated
	 * @ordered
	 */
	protected static final double DIAMETRO_MENOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiametroMenor() <em>Diametro Menor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiametroMenor()
	 * @generated
	 * @ordered
	 */
	protected double diametroMenor = DIAMETRO_MENOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiametroMaior() <em>Diametro Maior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiametroMaior()
	 * @generated
	 * @ordered
	 */
	protected static final double DIAMETRO_MAIOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiametroMaior() <em>Diametro Maior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiametroMaior()
	 * @generated
	 * @ordered
	 */
	protected double diametroMaior = DIAMETRO_MAIOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotationalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinhaDeProducaoPackage.Literals.ROTATIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.ROTATIONAL__WIDTH, oldWidth,
					width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiametroMenor() {
		return diametroMenor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiametroMenor(double newDiametroMenor) {
		double oldDiametroMenor = diametroMenor;
		diametroMenor = newDiametroMenor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.ROTATIONAL__DIAMETRO_MENOR,
					oldDiametroMenor, diametroMenor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiametroMaior() {
		return diametroMaior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiametroMaior(double newDiametroMaior) {
		double oldDiametroMaior = diametroMaior;
		diametroMaior = newDiametroMaior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.ROTATIONAL__DIAMETRO_MAIOR,
					oldDiametroMaior, diametroMaior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LinhaDeProducaoPackage.ROTATIONAL__WIDTH:
			return getWidth();
		case LinhaDeProducaoPackage.ROTATIONAL__DIAMETRO_MENOR:
			return getDiametroMenor();
		case LinhaDeProducaoPackage.ROTATIONAL__DIAMETRO_MAIOR:
			return getDiametroMaior();
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
		case LinhaDeProducaoPackage.ROTATIONAL__WIDTH:
			setWidth((Double) newValue);
			return;
		case LinhaDeProducaoPackage.ROTATIONAL__DIAMETRO_MENOR:
			setDiametroMenor((Double) newValue);
			return;
		case LinhaDeProducaoPackage.ROTATIONAL__DIAMETRO_MAIOR:
			setDiametroMaior((Double) newValue);
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
		case LinhaDeProducaoPackage.ROTATIONAL__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.ROTATIONAL__DIAMETRO_MENOR:
			setDiametroMenor(DIAMETRO_MENOR_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.ROTATIONAL__DIAMETRO_MAIOR:
			setDiametroMaior(DIAMETRO_MAIOR_EDEFAULT);
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
		case LinhaDeProducaoPackage.ROTATIONAL__WIDTH:
			return width != WIDTH_EDEFAULT;
		case LinhaDeProducaoPackage.ROTATIONAL__DIAMETRO_MENOR:
			return diametroMenor != DIAMETRO_MENOR_EDEFAULT;
		case LinhaDeProducaoPackage.ROTATIONAL__DIAMETRO_MAIOR:
			return diametroMaior != DIAMETRO_MAIOR_EDEFAULT;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", diametroMenor: ");
		result.append(diametroMenor);
		result.append(", diametroMaior: ");
		result.append(diametroMaior);
		result.append(')');
		return result.toString();
	}

} //RotationalImpl
