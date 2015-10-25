package npnets.simulator.actions;

import java.util.List;

import npnets.simulator.parts.TransitionEditPart;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

public class TransitionAddSynchronizationAction extends SelectionAction {
	public static final String ADD_SYNC= "Add Syncrhonization";
    public static final String REQ_ADD_SYNC = "Add Synchronization";
    
    Request request;
    
    public TransitionAddSynchronizationAction(IWorkbenchPart part) {
        super(part);
        setId(ADD_SYNC);
        setText("Add synchronization");
        request = new Request(REQ_ADD_SYNC);
    }
    
    @Override
    public void run() {
        @SuppressWarnings("unchecked") List<TransitionEditPart> editParts = getSelectedObjects();
        CompoundCommand compoundCommand = new CompoundCommand();
        for(TransitionEditPart placeEditPart : editParts) {
            compoundCommand.add(placeEditPart.getCommand(request));
        }
        execute(compoundCommand);
    }
    
    @Override
    protected boolean calculateEnabled() {
        if(getSelectedObjects().isEmpty()) {
            return false;
        }
        for(Object selectedObject : getSelectedObjects()) {
            if(!(selectedObject instanceof TransitionEditPart)) {
                return false;
            }
        }
        return true;
    }
}

