package npnets.simulator.handlers;
import java.util.ArrayList;
import java.util.List;

import npnets.simulator.exceptions.NoBindingAvaliableException;
import npnets.simulator.simulate.MarkingAdapter;
import npnets.simulator.simulate.Report;
import npnets.simulator.simulate.Simulator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;




public class NPNGraphicalSimulatorCMMakeStepHandler extends AbstractHandler {
Simulator sim=new Simulator();
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (Simulator.net == null)
		{
			new Report().appendLineToReport("no net loaded!",true);
			return null;
		}
		else{
		if(Simulator.markingHistory.adapterStack.size()!=0){
			sim.setMarking(Simulator.markingHistory.getCurrentState());
		}
		MarkingAdapter ma=null;
		try {
			ma = sim.makeTransitions();
		} catch (NoBindingAvaliableException e) {
			new Report().appendLineToReport("The route caused a deadlock. " + e.message,true);
		}
		if((ma!=null))
		{
			Simulator.markingHistory.addState(ma);
			Simulator.markingHistory.setCurrentState(ma);
		}
		 return null;
		}
	}
	
	

}
