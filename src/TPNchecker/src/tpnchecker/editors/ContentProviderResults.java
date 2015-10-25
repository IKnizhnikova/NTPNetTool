package tpnchecker.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ContentProviderResults implements IStructuredContentProvider {
	
	public List<ResultAnalysis> results = new ArrayList<ResultAnalysis>();
	Object target = null;
	
	public void setTarget(Object target) {
		this.target = target;
	}
	
	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return results.toArray();
	}

}
