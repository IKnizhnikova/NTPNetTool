package npnets.simulator.simulate;

import npnets.simulator.exceptions.WrongModelException;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPnetMarked;

public class SystemMarkingAdapter extends MarkingAdapter {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 574114327650228274L;

	public SystemMarkingAdapter(NPnetMarked np) throws WrongModelException{
		super(np);
	}
}
