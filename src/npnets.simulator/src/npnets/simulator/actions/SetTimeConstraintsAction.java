package npnets.simulator.actions;

import java.util.List;

import npnets.simulator.parts.ArcEditPart;
import npnets.simulator.parts.NodeEditPart;

import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;

public class SetTimeConstraintsAction extends SelectionAction {
	

	public static final String SET_TIME = "Set time constraints";
  public static final String REQ_SET_TIME = "Set time constraints";
  
  Request request;
  
	public SetTimeConstraintsAction(IWorkbenchPart part) {
    super(part);
    setId(SET_TIME);
    setText("Set time constraints");
    request = new Request(REQ_SET_TIME);
	}
	
  @Override
  public void run() {
      @SuppressWarnings("unchecked") List<AbstractEditPart> editParts = getSelectedObjects();
      CompoundCommand compoundCommand = new CompoundCommand();
      for(AbstractEditPart editPart : editParts) {
          compoundCommand.add(editPart.getCommand(request));
      }
      execute(compoundCommand);
  }

	@Override
	protected boolean calculateEnabled() {
		return getSelectedObjects().size()==1 && (getSelectedObjects().get(0) instanceof NodeEditPart || getSelectedObjects().get(0) instanceof ArcEditPart) ;
	}
	
	
  
}
