package npnets.simulator;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

public class UnwrapPropertySource implements IPropertySource {

	private IPropertySource propertySource;
	boolean good = false;

	public UnwrapPropertySource(IPropertySource propertySource) {
		this.propertySource = propertySource;
	}

	@Override
	public Object getEditableValue() {
		Object res = propertySource.getEditableValue();
		res = unwrapValueIfNeeded(res);
		return res;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return propertySource.getPropertyDescriptors();
	}

	@Override
	public Object getPropertyValue(Object id) {
		Object res = propertySource.getPropertyValue(id);
		res = unwrapValueIfNeeded(res);
		return res;
	}

	private Object unwrapValueIfNeeded(Object value) {
		if (value instanceof PropertyValueWrapper) {
			return ((PropertyValueWrapper)value).getEditableValue(null);
		}
		return value;
	}

	@Override
	public boolean isPropertySet(Object id) {
		return propertySource.isPropertySet(id);
	}

	@Override
	public void resetPropertyValue(Object id) {
		propertySource.resetPropertyValue(id);
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		propertySource.setPropertyValue(id, value);
	}
}
