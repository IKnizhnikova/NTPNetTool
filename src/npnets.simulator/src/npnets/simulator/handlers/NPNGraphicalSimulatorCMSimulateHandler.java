package npnets.simulator.handlers;

import npnets.simulator.exceptions.NoBindingAvaliableException;
import npnets.simulator.simulate.MarkingAdapter;
import npnets.simulator.simulate.Report;
import npnets.simulator.simulate.Simulator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;

public class NPNGraphicalSimulatorCMSimulateHandler extends AbstractHandler implements IHandler {
	Simulator sim = new Simulator();
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		sim.userBindings=false;
		Simulator.userDriven=false;
		InputDialog sd = new InputDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), "Steps count", "How many steps do you want to simulate", "10",
				null);
		if (sd.open() == Window.OK) {
			if (sd.getValue() != null) {
				int steps = new Integer(sd.getValue());
				for (int i = 0; i < steps; i++)
					try {
						MarkingAdapter ma = sim.makeTransitions();
						sim.setMarking(ma);
					} catch (NoBindingAvaliableException e) {
						new Report().appendLineToReport("Deadlock appeared on step " + i +e.message);
						e.printStackTrace();
					}
			}
		}
		return null;
	}

}
