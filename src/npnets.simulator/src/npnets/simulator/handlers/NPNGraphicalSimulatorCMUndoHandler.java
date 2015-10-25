package npnets.simulator.handlers;

import npnets.simulator.simulate.Simulator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class NPNGraphicalSimulatorCMUndoHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Simulator.markingHistory.undo();
		Simulator.markingHistory.getCurrentState().clearDiagram();
		Simulator.markingHistory.getCurrentState().createDiagramMap(Simulator.markingHistory.getCurrentState().getMarkingMap());
		return null;
	}

}
