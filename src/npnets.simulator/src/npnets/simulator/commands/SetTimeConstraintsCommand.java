package npnets.simulator.commands;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import npnets.simulator.simulate.Simulator;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class SetTimeConstraintsCommand extends Command {

	Object model;

	@Override
	public void execute() {

		Node node = null;
		ArcTP arc = null;
		if (model instanceof NPNSymbolPlaceSN || model instanceof NPNSymbolTransitionSN)
		{
			NPNSymbolNodeSN symbol = (NPNSymbolNodeSN)model;
			node=symbol.getModel();
		}
		else
		{
			NPNSymbolArcTPSN symbol = (NPNSymbolArcTPSN)model;
			arc=(ArcTP)symbol.getModel();
		}

		ListDialog sd = new ListDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		sd.setContentProvider(new ArrayContentProvider());
		sd.setLabelProvider(new LabelProvider());
		sd.setInput(getPool());
		sd.setTitle("Choose the Type of constraint");
		if (sd.open() == Window.OK) {
			if (sd.getResult()[0].equals("Duration")) {
				InputDialog id = new InputDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), "Set value", "Duration:", "1", null);
				if (id.open() == Window.OK) {
					if (id.getValue() == null || id.getValue() == "0")
						return;
					if (node != null) {
						node.setSecondTimeConstraint(-2);
						node.setFirstTimeConstraint(new Integer(id.getValue()));
					} else {
						arc.setSecondTimeConstraint(-2);
						arc.setFirstTimeConstraint(new Integer(id.getValue()));
					}
				}
			} else {
				InputDialog id = new InputDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), "Set value",
						"Input bounds in format: lower bound;upper bound. Type inf for infinity:", "1", null);
				if (id.open() == Window.OK) {
					if (id.getValue() == null || !(id.getValue().matches("[0-9]+;(([0-9]+)|inf)" ) ))
						return;
					if (node != null) {
						String res = id.getValue();
						int divider = res.indexOf(';');
						int first = new Integer(res.substring(0, divider));
						int second;
						if(res.substring(divider + 1).equals("inf"))
						{
							second=-1;
							node.setSecondTimeConstraint(second);
							node.setFirstTimeConstraint(first);
						}
						else
						{
								second = new Integer(res.substring(divider + 1));
								if(first<=second)
								{
									node.setSecondTimeConstraint(second);
									node.setFirstTimeConstraint(first);
								}
						}
						node.setSecondTimeConstraint(second);
						node.setFirstTimeConstraint(first);
					} else {
						String res = id.getValue();
						int divider = res.indexOf(';');
						int first = new Integer(res.substring(0, divider));
						int second;
						if(res.substring(divider + 1).equals("inf"))
						{
							second=-1;
							arc.setSecondTimeConstraint(second);
							arc.setFirstTimeConstraint(first);
						}
						else
						{
								second = new Integer(res.substring(divider + 1));
								if(first<=second)
								{
									arc.setSecondTimeConstraint(second);
									arc.setFirstTimeConstraint(first);
								}
						}

					}
				}
			}
		}
	}

	private List<String> getPool() {
		List<String> opt = new ArrayList<String>();
		opt.add("Duration");
		opt.add("Interval");
		return opt;
	}

	public void setModel(Object model2) {
		model=model2;
		
	}

}
