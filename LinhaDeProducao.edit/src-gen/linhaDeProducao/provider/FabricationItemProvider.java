/**
 */
package linhaDeProducao.provider;

import java.util.Collection;
import java.util.List;

import linhaDeProducao.Fabrication;
import linhaDeProducao.LinhaDeProducaoFactory;
import linhaDeProducao.LinhaDeProducaoPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link linhaDeProducao.Fabrication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FabricationItemProvider extends ResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FabricationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSalarioOpPropertyDescriptor(object);
			addSalarioMaqPropertyDescriptor(object);
			addCustoFerrPropertyDescriptor(object);
			addDiamCortePropertyDescriptor(object);
			addProfCortePropertyDescriptor(object);
			addCompCortePropertyDescriptor(object);
			addAvancoPropertyDescriptor(object);
			addVelCortePropertyDescriptor(object);
			addTempImprPropertyDescriptor(object);
			addVelAvancoPropertyDescriptor(object);
			addTaxaAcabPropertyDescriptor(object);
			addVidaFerrPropertyDescriptor(object);
			addTrocaFerrPropertyDescriptor(object);
			addToPropertyDescriptor(object);
			addSendsToTransportPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Salario Op feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSalarioOpPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_salarioOp_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_salarioOp_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__SALARIO_OP, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Salario Maq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSalarioMaqPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_salarioMaq_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_salarioMaq_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__SALARIO_MAQ, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Custo Ferr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustoFerrPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_custoFerr_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_custoFerr_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__CUSTO_FERR, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Diam Corte feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiamCortePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_diamCorte_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_diamCorte_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__DIAM_CORTE, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prof Corte feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProfCortePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_profCorte_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_profCorte_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__PROF_CORTE, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Comp Corte feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompCortePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_compCorte_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_compCorte_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__COMP_CORTE, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Avanco feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvancoPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_avanco_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_avanco_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__AVANCO, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vel Corte feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVelCortePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_velCorte_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_velCorte_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__VEL_CORTE, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Temp Impr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTempImprPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_tempImpr_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_tempImpr_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__TEMP_IMPR, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vel Avanco feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVelAvancoPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_velAvanco_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_velAvanco_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__VEL_AVANCO, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Taxa Acab feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaxaAcabPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_taxaAcab_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_taxaAcab_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__TAXA_ACAB, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vida Ferr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVidaFerrPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_vidaFerr_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_vidaFerr_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__VIDA_FERR, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Troca Ferr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrocaFerrPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_trocaFerr_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_trocaFerr_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__TROCA_FERR, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Fabrication_to_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_to_feature",
								"_UI_Fabrication_type"),
						LinhaDeProducaoPackage.Literals.FABRICATION__TO, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Sends To Transport feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendsToTransportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Fabrication_sendsToTransport_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Fabrication_sendsToTransport_feature",
						"_UI_Fabrication_type"),
				LinhaDeProducaoPackage.Literals.FABRICATION__SENDS_TO_TRANSPORT, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LinhaDeProducaoPackage.Literals.FABRICATION__FEATURE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Fabrication.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Fabrication"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Fabrication) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Fabrication_type")
				: getString("_UI_Fabrication_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Fabrication.class)) {
		case LinhaDeProducaoPackage.FABRICATION__SALARIO_OP:
		case LinhaDeProducaoPackage.FABRICATION__SALARIO_MAQ:
		case LinhaDeProducaoPackage.FABRICATION__CUSTO_FERR:
		case LinhaDeProducaoPackage.FABRICATION__DIAM_CORTE:
		case LinhaDeProducaoPackage.FABRICATION__PROF_CORTE:
		case LinhaDeProducaoPackage.FABRICATION__COMP_CORTE:
		case LinhaDeProducaoPackage.FABRICATION__AVANCO:
		case LinhaDeProducaoPackage.FABRICATION__VEL_CORTE:
		case LinhaDeProducaoPackage.FABRICATION__TEMP_IMPR:
		case LinhaDeProducaoPackage.FABRICATION__VEL_AVANCO:
		case LinhaDeProducaoPackage.FABRICATION__TAXA_ACAB:
		case LinhaDeProducaoPackage.FABRICATION__VIDA_FERR:
		case LinhaDeProducaoPackage.FABRICATION__TROCA_FERR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case LinhaDeProducaoPackage.FABRICATION__FEATURE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(LinhaDeProducaoPackage.Literals.FABRICATION__FEATURE,
				LinhaDeProducaoFactory.eINSTANCE.createPrismatic()));

		newChildDescriptors.add(createChildParameter(LinhaDeProducaoPackage.Literals.FABRICATION__FEATURE,
				LinhaDeProducaoFactory.eINSTANCE.createRotational()));

		newChildDescriptors.add(createChildParameter(LinhaDeProducaoPackage.Literals.FABRICATION__FEATURE,
				LinhaDeProducaoFactory.eINSTANCE.createRevolving()));

		newChildDescriptors.add(createChildParameter(LinhaDeProducaoPackage.Literals.FABRICATION__FEATURE,
				LinhaDeProducaoFactory.eINSTANCE.createSlab()));
	}

}
