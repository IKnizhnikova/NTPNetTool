package npnets.simulator.simulate;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenAttribute;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenImpl;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.impl.TokenNetImpl;

public class TokenNetAdapter extends TokenAdapter {

	private ElementNetMarked value;
	
	public ElementNetMarked getValue() {
		return value;
	}

	public void setValue(ElementNetMarked value) {
		this.value = value;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 4874975210490991218L;

}
