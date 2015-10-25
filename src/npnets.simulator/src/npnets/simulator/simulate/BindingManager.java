package npnets.simulator.simulate;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import npnets.simulator.exceptions.NoBindingAvaliableException;
import npnets.simulator.exceptions.NoOutputBindingAvaliableException;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token;

public interface BindingManager {
	public List<Binding> obtainBindings(ArcPT arc,MarkingAdapter ma, Report report, boolean checkOnly) throws NoBindingAvaliableException;


	List<OutputBinding> obtainOutputBindings(ArcTP arc, MarkingAdapter marking,
			Map<Transition, List<Token>> markingTrans,Report report, boolean checkOnly) throws NoOutputBindingAvaliableException;


	public Collection<? extends Binding> obtainBindingsFromSync(ArcPT arc,
			ElementNetMarked value, Report report,boolean checkOnly) throws NoBindingAvaliableException;

}
