/**
 */
package computer.provider;


import computer.Computer;
import computer.ComputerFactory;
import computer.ComputerPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link computer.Computer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputerItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputerItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ComputerPackage.Literals.COMPUTER__MOTHERBOARD);
			childrenFeatures.add(ComputerPackage.Literals.COMPUTER__PROCESSOR);
			childrenFeatures.add(ComputerPackage.Literals.COMPUTER__GRAPHICS_CARDS);
			childrenFeatures.add(ComputerPackage.Literals.COMPUTER__MEMORY);
			childrenFeatures.add(ComputerPackage.Literals.COMPUTER__HARD_DISKS);
			childrenFeatures.add(ComputerPackage.Literals.COMPUTER__CD_DVD_DRIVES);
			childrenFeatures.add(ComputerPackage.Literals.COMPUTER__SCREENS);
			childrenFeatures.add(ComputerPackage.Literals.COMPUTER__MOUSE);
			childrenFeatures.add(ComputerPackage.Literals.COMPUTER__KEYBOARD);
			childrenFeatures.add(ComputerPackage.Literals.COMPUTER__PRINTER);
			childrenFeatures.add(ComputerPackage.Literals.COMPUTER__POWER_SUPPLY);
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
	 * This returns Computer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Computer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Computer_type");
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

		switch (notification.getFeatureID(Computer.class)) {
			case ComputerPackage.COMPUTER__MOTHERBOARD:
			case ComputerPackage.COMPUTER__PROCESSOR:
			case ComputerPackage.COMPUTER__GRAPHICS_CARDS:
			case ComputerPackage.COMPUTER__MEMORY:
			case ComputerPackage.COMPUTER__HARD_DISKS:
			case ComputerPackage.COMPUTER__CD_DVD_DRIVES:
			case ComputerPackage.COMPUTER__SCREENS:
			case ComputerPackage.COMPUTER__MOUSE:
			case ComputerPackage.COMPUTER__KEYBOARD:
			case ComputerPackage.COMPUTER__PRINTER:
			case ComputerPackage.COMPUTER__POWER_SUPPLY:
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

		newChildDescriptors.add
			(createChildParameter
				(ComputerPackage.Literals.COMPUTER__MOTHERBOARD,
				 ComputerFactory.eINSTANCE.createMotherboard()));

		newChildDescriptors.add
			(createChildParameter
				(ComputerPackage.Literals.COMPUTER__PROCESSOR,
				 ComputerFactory.eINSTANCE.createProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(ComputerPackage.Literals.COMPUTER__GRAPHICS_CARDS,
				 ComputerFactory.eINSTANCE.createGraphicsCard()));

		newChildDescriptors.add
			(createChildParameter
				(ComputerPackage.Literals.COMPUTER__MEMORY,
				 ComputerFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(ComputerPackage.Literals.COMPUTER__HARD_DISKS,
				 ComputerFactory.eINSTANCE.createHardDisk()));

		newChildDescriptors.add
			(createChildParameter
				(ComputerPackage.Literals.COMPUTER__CD_DVD_DRIVES,
				 ComputerFactory.eINSTANCE.createCDDVDDrive()));

		newChildDescriptors.add
			(createChildParameter
				(ComputerPackage.Literals.COMPUTER__SCREENS,
				 ComputerFactory.eINSTANCE.createScreen()));

		newChildDescriptors.add
			(createChildParameter
				(ComputerPackage.Literals.COMPUTER__MOUSE,
				 ComputerFactory.eINSTANCE.createMouse()));

		newChildDescriptors.add
			(createChildParameter
				(ComputerPackage.Literals.COMPUTER__KEYBOARD,
				 ComputerFactory.eINSTANCE.createKeyboard()));

		newChildDescriptors.add
			(createChildParameter
				(ComputerPackage.Literals.COMPUTER__PRINTER,
				 ComputerFactory.eINSTANCE.createPrinter()));

		newChildDescriptors.add
			(createChildParameter
				(ComputerPackage.Literals.COMPUTER__POWER_SUPPLY,
				 ComputerFactory.eINSTANCE.createPowerSupply()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ComputerEditPlugin.INSTANCE;
	}

}
