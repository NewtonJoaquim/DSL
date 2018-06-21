/**
 */
package linhaDeProducao.impl;

import java.lang.reflect.InvocationTargetException;

import linhaDeProducao.Feature;
import linhaDeProducao.LinhaDeProducaoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link linhaDeProducao.impl.FeatureImpl#getId <em>Id</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FeatureImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FeatureImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FeatureImpl#getPositionZ <em>Position Z</em>}</li>
 *   <li>{@link linhaDeProducao.impl.FeatureImpl#getOritentation <em>Oritentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeatureImpl extends MinimalEObjectImpl.Container implements Feature {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final double POSITION_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected double positionX = POSITION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final double POSITION_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected double positionY = POSITION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionZ() <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZ()
	 * @generated
	 * @ordered
	 */
	protected static final double POSITION_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPositionZ() <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZ()
	 * @generated
	 * @ordered
	 */
	protected double positionZ = POSITION_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getOritentation() <em>Oritentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOritentation()
	 * @generated
	 * @ordered
	 */
	protected static final int ORITENTATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOritentation() <em>Oritentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOritentation()
	 * @generated
	 * @ordered
	 */
	protected int oritentation = ORITENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinhaDeProducaoPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FEATURE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FEATURE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionX(double newPositionX) {
		double oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FEATURE__POSITION_X,
					oldPositionX, positionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionY(double newPositionY) {
		double oldPositionY = positionY;
		positionY = newPositionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FEATURE__POSITION_Y,
					oldPositionY, positionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPositionZ() {
		return positionZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionZ(double newPositionZ) {
		double oldPositionZ = positionZ;
		positionZ = newPositionZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FEATURE__POSITION_Z,
					oldPositionZ, positionZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOritentation() {
		return oritentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOritentation(int newOritentation) {
		int oldOritentation = oritentation;
		oritentation = newOritentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinhaDeProducaoPackage.FEATURE__ORITENTATION,
					oldOritentation, oritentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double areaFeature() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double volumeFeature() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LinhaDeProducaoPackage.FEATURE__ID:
			return getId();
		case LinhaDeProducaoPackage.FEATURE__NAME:
			return getName();
		case LinhaDeProducaoPackage.FEATURE__TYPE:
			return getType();
		case LinhaDeProducaoPackage.FEATURE__POSITION_X:
			return getPositionX();
		case LinhaDeProducaoPackage.FEATURE__POSITION_Y:
			return getPositionY();
		case LinhaDeProducaoPackage.FEATURE__POSITION_Z:
			return getPositionZ();
		case LinhaDeProducaoPackage.FEATURE__ORITENTATION:
			return getOritentation();
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
		case LinhaDeProducaoPackage.FEATURE__ID:
			setId((Integer) newValue);
			return;
		case LinhaDeProducaoPackage.FEATURE__NAME:
			setName((String) newValue);
			return;
		case LinhaDeProducaoPackage.FEATURE__TYPE:
			setType((String) newValue);
			return;
		case LinhaDeProducaoPackage.FEATURE__POSITION_X:
			setPositionX((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FEATURE__POSITION_Y:
			setPositionY((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FEATURE__POSITION_Z:
			setPositionZ((Double) newValue);
			return;
		case LinhaDeProducaoPackage.FEATURE__ORITENTATION:
			setOritentation((Integer) newValue);
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
		case LinhaDeProducaoPackage.FEATURE__ID:
			setId(ID_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FEATURE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FEATURE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FEATURE__POSITION_X:
			setPositionX(POSITION_X_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FEATURE__POSITION_Y:
			setPositionY(POSITION_Y_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FEATURE__POSITION_Z:
			setPositionZ(POSITION_Z_EDEFAULT);
			return;
		case LinhaDeProducaoPackage.FEATURE__ORITENTATION:
			setOritentation(ORITENTATION_EDEFAULT);
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
		case LinhaDeProducaoPackage.FEATURE__ID:
			return id != ID_EDEFAULT;
		case LinhaDeProducaoPackage.FEATURE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case LinhaDeProducaoPackage.FEATURE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case LinhaDeProducaoPackage.FEATURE__POSITION_X:
			return positionX != POSITION_X_EDEFAULT;
		case LinhaDeProducaoPackage.FEATURE__POSITION_Y:
			return positionY != POSITION_Y_EDEFAULT;
		case LinhaDeProducaoPackage.FEATURE__POSITION_Z:
			return positionZ != POSITION_Z_EDEFAULT;
		case LinhaDeProducaoPackage.FEATURE__ORITENTATION:
			return oritentation != ORITENTATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case LinhaDeProducaoPackage.FEATURE___AREA_FEATURE:
			return areaFeature();
		case LinhaDeProducaoPackage.FEATURE___VOLUME_FEATURE:
			return volumeFeature();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", positionX: ");
		result.append(positionX);
		result.append(", positionY: ");
		result.append(positionY);
		result.append(", positionZ: ");
		result.append(positionZ);
		result.append(", oritentation: ");
		result.append(oritentation);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
