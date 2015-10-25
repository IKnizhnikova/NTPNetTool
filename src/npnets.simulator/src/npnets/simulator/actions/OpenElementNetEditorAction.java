package npnets.simulator.actions;

import java.util.ArrayList;

import npnets.simulator.NPNGraphicalSimulator;
import npnets.simulator.editors.NetSimpleGraphicalEditor;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.actions.OpenInNewWindowAction;
import org.eclipse.ui.part.MultiPageEditorPart;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesFactory;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramNetSystem;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;

public class OpenElementNetEditorAction extends Action {

	private TokenTypeElementNet tten;
	private static NPNGraphicalSimulator parentEditor;
	
	public OpenElementNetEditorAction(TokenTypeElementNet tten, IEditorPart parentEditor) {
		this.tten = tten;
		if(parentEditor!=null)
		OpenElementNetEditorAction.parentEditor = (NPNGraphicalSimulator) parentEditor;
	}
	
	public static void setParentEditor(NPNGraphicalSimulator parentEditor) {
		OpenElementNetEditorAction.parentEditor = parentEditor;
	}

	public void run(){
		ArrayList<NetSimpleGraphicalEditor> editors = new ArrayList<NetSimpleGraphicalEditor>();
		if(tten.getNet()==null){
			tten.setNet(HLPNFactory.eINSTANCE.createHighLevelPetriNet());
		}
		if(tten.getDiagram()==null){
			tten.setDiagram(NPNDiagramsFactory.eINSTANCE.createNPNDiagramNetSystem());
			tten.getDiagram().setModel(tten.getNet());
		}
		NPNDiagramNetSystem netDiagram = tten.getDiagram();
		for (ElementNetMarked enm : tten.getElementNetMarkeds()) {
			editors.add(new NetSimpleGraphicalEditor());
		}
		if (editors.size()==0)
		{
			editors.add(new NetSimpleGraphicalEditor());
			tten.getElementNetMarkeds().add(TokenTypesFactory.eINSTANCE.createElementNetMarked());
		}
		int pageIndex = 0;
		
		pageIndex = parentEditor.addPage(null);
		parentEditor.setPageText(pageIndex, "|");
		
		try {
			for(NetSimpleGraphicalEditor editor : editors) {
				pageIndex = parentEditor.addPage(editor, parentEditor.getEditorInput());
				editor.getAdapter(GraphicalViewer.class);
				parentEditor.setPageText(pageIndex, "EN " + tten.getName() + ", marking " + (editors.indexOf(editor) + 1));
				editor.setInput(netDiagram);
				editor.setMarking(tten.getElementNetMarkeds().get(editors.indexOf(editor)).getMarking());
				editor.setType(tten);
			}
		}
		catch(PartInitException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isEnabled() {
		 return true;
	}
	
	public String getText() {
		return "Open for editing";
	}
}
