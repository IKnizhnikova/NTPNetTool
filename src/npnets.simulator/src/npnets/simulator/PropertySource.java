package npnets.simulator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;

public class PropertySource implements IPropertySource {

	Object target;

	IPropertySource propsrcVisual;
	IPropertySource propsrcModel;

	public PropertySource(Object target,
			IPropertySource propsrcVisual, IPropertySource propsrcModel) {
		this.target = target;
		this.propsrcVisual = propsrcVisual;
		this.propsrcModel = propsrcModel;
	}

	@Override
	public Object getEditableValue() {
		return target;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		List<IPropertyDescriptor> res = new ArrayList<IPropertyDescriptor>();

		for (IPropertyDescriptor descriptor : propsrcVisual
				.getPropertyDescriptors()) {
			if (isDescriptorObservable(descriptor)) {
				res.add(descriptor);
			}
		}

		for (IPropertyDescriptor descriptor : propsrcModel
				.getPropertyDescriptors()) {
			if (isDescriptorObservable(descriptor)) {
				res.add(descriptor);
			}
		}

		return res.toArray(new IPropertyDescriptor[res.size()]);
	}

	private class PairClassStrings {
		public PairClassStrings(Class<?> clazz, String[] strings) {
			this.clazz = clazz;
			this.strings = strings;
		}

		public Class<?> clazz;
		public String[] strings;
	};

	private PairClassStrings[] pairClassStrings = new PairClassStrings[] {
			new PairClassStrings(NPNSymbolNodeSN.class, new String[] { "uuid",
					"model", "inArcs", "outArcs" }),
			new PairClassStrings(NPNSymbolArcSN.class, new String[] { "uuid",
					"model", "source", "target", "bendpoints" })
			};

	private boolean isDescriptorObservable(IPropertyDescriptor descriptor) {
		String idDescriptor = (String) descriptor.getId();

		for (PairClassStrings pair : pairClassStrings) {
			if (pair.clazz.isAssignableFrom(target.getClass())) {
				String[] hidden = pair.strings;
				for (String idHidden : hidden) {
					if (idDescriptor.equals(idHidden)) {
						return false;
					}
				}
			}
		}

		return true;
	}

	@Override
	public Object getPropertyValue(Object id) {
		Object res = null;
		if (sourceContainsProperty(propsrcVisual, id)) {
			res = propsrcVisual.getPropertyValue(id);
		} else if (sourceContainsProperty(propsrcModel, id)) {
			res = propsrcModel.getPropertyValue(id);
		}
		return res;
	}

	boolean sourceContainsProperty(IPropertySource sourceProperty, Object id) {
		for (IPropertyDescriptor descriptionProperty : sourceProperty
				.getPropertyDescriptors()) {
			if (id.equals(descriptionProperty.getId())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isPropertySet(Object id) {
		boolean res = false;
		if (sourceContainsProperty(propsrcVisual, id)) {
			res = propsrcVisual.isPropertySet(id);
		} else if (sourceContainsProperty(propsrcModel, id)) {
			res = propsrcModel.isPropertySet(id);
		}
		return res;
	}

	@Override
	public void resetPropertyValue(Object id) {
		if (sourceContainsProperty(propsrcVisual, id)) {
			propsrcVisual.resetPropertyValue(id);
		} else if (sourceContainsProperty(propsrcModel, id)) {
			propsrcModel.resetPropertyValue(id);
		}
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		if (sourceContainsProperty(propsrcVisual, id)) {
			propsrcVisual.setPropertyValue(id, value);
		} else if (sourceContainsProperty(propsrcModel, id)) {
			propsrcModel.setPropertyValue(id, value);
		}
	}

}

