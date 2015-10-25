package tpnchecker.editors;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class LabelProviderResults extends LabelProvider implements
		ITableLabelProvider {

	public String getColumnText(Object obj, int index) {

		if (index == 0) {
			if (obj instanceof ResultAnalysis) {
				return ((ResultAnalysis) obj).getName();
			}
		}
		
		return "error: unknown type";
	}

	public Image getColumnImage(Object obj, int index) {
		return getImage(obj);
	}

	public Image getImage(Object obj) {
		return PlatformUI.getWorkbench().getSharedImages()
				.getImage(ISharedImages.IMG_OBJ_ELEMENT);
	}

}
