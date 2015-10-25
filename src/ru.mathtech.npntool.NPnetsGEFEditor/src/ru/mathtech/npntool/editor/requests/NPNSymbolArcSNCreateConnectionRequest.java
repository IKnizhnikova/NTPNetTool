package ru.mathtech.npntool.editor.requests;

import org.eclipse.gef.requests.CreateConnectionRequest;

import ru.mathtech.npntool.editor.factories.NPNSymbolArcSNFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;

public class NPNSymbolArcSNCreateConnectionRequest extends
		CreateConnectionRequest {

	NPNSymbolNodeSN nodeSource = null;
	NPNSymbolArcSNFactory factoryArcSN = null;
	Object newObjectOverriden = null;

	public void setNodeSource(NPNSymbolNodeSN nodeSource) {
		if (this.nodeSource != null && newObjectOverriden != null) {
			if ((nodeSource == null)
					|| this.nodeSource.getClass() != nodeSource.getClass()) {
				newObjectOverriden = null;
			}
		}
		this.nodeSource = nodeSource;

		factoryArcSN = (NPNSymbolArcSNFactory) getFactory();
		factoryArcSN.setNodeSource(nodeSource);
	}

	@Override
	public Object getNewObject() {
		// The code is taken from super.getNewObject
		if (newObjectOverriden == null) {
			if (getFactory() == null) {
				throw new IllegalArgumentException(
						"CreateRequest has unspecified CreationFactory"); //$NON-NLS-1$
			}
			newObjectOverriden = getFactory().getNewObject();
		}
		return newObjectOverriden;
	}

}

/*
 * public Object getNewObject() { if (newObject == null) { if (getFactory() ==
 * null) { throw new IllegalArgumentException(
 * "CreateRequest has unspecified CreationFactory"); //$NON-NLS-1$ } newObject =
 * getFactory().getNewObject(); } return newObject; }
 */
