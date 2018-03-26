/**
 */
package computer.provider;

import computer.util.ComputerAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputerItemProviderAdapterFactory extends ComputerAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputerItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link computer.Computer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputerItemProvider computerItemProvider;

	/**
	 * This creates an adapter for a {@link computer.Computer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComputerAdapter() {
		if (computerItemProvider == null) {
			computerItemProvider = new ComputerItemProvider(this);
		}

		return computerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link computer.Motherboard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotherboardItemProvider motherboardItemProvider;

	/**
	 * This creates an adapter for a {@link computer.Motherboard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMotherboardAdapter() {
		if (motherboardItemProvider == null) {
			motherboardItemProvider = new MotherboardItemProvider(this);
		}

		return motherboardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link computer.Processor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorItemProvider processorItemProvider;

	/**
	 * This creates an adapter for a {@link computer.Processor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessorAdapter() {
		if (processorItemProvider == null) {
			processorItemProvider = new ProcessorItemProvider(this);
		}

		return processorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link computer.GraphicsCard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicsCardItemProvider graphicsCardItemProvider;

	/**
	 * This creates an adapter for a {@link computer.GraphicsCard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphicsCardAdapter() {
		if (graphicsCardItemProvider == null) {
			graphicsCardItemProvider = new GraphicsCardItemProvider(this);
		}

		return graphicsCardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link computer.Memory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryItemProvider memoryItemProvider;

	/**
	 * This creates an adapter for a {@link computer.Memory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemoryAdapter() {
		if (memoryItemProvider == null) {
			memoryItemProvider = new MemoryItemProvider(this);
		}

		return memoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link computer.HardDisk} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardDiskItemProvider hardDiskItemProvider;

	/**
	 * This creates an adapter for a {@link computer.HardDisk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHardDiskAdapter() {
		if (hardDiskItemProvider == null) {
			hardDiskItemProvider = new HardDiskItemProvider(this);
		}

		return hardDiskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link computer.CDDVDDrive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDDVDDriveItemProvider cddvdDriveItemProvider;

	/**
	 * This creates an adapter for a {@link computer.CDDVDDrive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCDDVDDriveAdapter() {
		if (cddvdDriveItemProvider == null) {
			cddvdDriveItemProvider = new CDDVDDriveItemProvider(this);
		}

		return cddvdDriveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link computer.PowerSupply} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSupplyItemProvider powerSupplyItemProvider;

	/**
	 * This creates an adapter for a {@link computer.PowerSupply}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPowerSupplyAdapter() {
		if (powerSupplyItemProvider == null) {
			powerSupplyItemProvider = new PowerSupplyItemProvider(this);
		}

		return powerSupplyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link computer.Screen} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenItemProvider screenItemProvider;

	/**
	 * This creates an adapter for a {@link computer.Screen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScreenAdapter() {
		if (screenItemProvider == null) {
			screenItemProvider = new ScreenItemProvider(this);
		}

		return screenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link computer.Mouse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MouseItemProvider mouseItemProvider;

	/**
	 * This creates an adapter for a {@link computer.Mouse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMouseAdapter() {
		if (mouseItemProvider == null) {
			mouseItemProvider = new MouseItemProvider(this);
		}

		return mouseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link computer.Keyboard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyboardItemProvider keyboardItemProvider;

	/**
	 * This creates an adapter for a {@link computer.Keyboard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKeyboardAdapter() {
		if (keyboardItemProvider == null) {
			keyboardItemProvider = new KeyboardItemProvider(this);
		}

		return keyboardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link computer.Printer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrinterItemProvider printerItemProvider;

	/**
	 * This creates an adapter for a {@link computer.Printer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrinterAdapter() {
		if (printerItemProvider == null) {
			printerItemProvider = new PrinterItemProvider(this);
		}

		return printerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (computerItemProvider != null) computerItemProvider.dispose();
		if (motherboardItemProvider != null) motherboardItemProvider.dispose();
		if (processorItemProvider != null) processorItemProvider.dispose();
		if (graphicsCardItemProvider != null) graphicsCardItemProvider.dispose();
		if (memoryItemProvider != null) memoryItemProvider.dispose();
		if (hardDiskItemProvider != null) hardDiskItemProvider.dispose();
		if (cddvdDriveItemProvider != null) cddvdDriveItemProvider.dispose();
		if (powerSupplyItemProvider != null) powerSupplyItemProvider.dispose();
		if (screenItemProvider != null) screenItemProvider.dispose();
		if (mouseItemProvider != null) mouseItemProvider.dispose();
		if (keyboardItemProvider != null) keyboardItemProvider.dispose();
		if (printerItemProvider != null) printerItemProvider.dispose();
	}

}