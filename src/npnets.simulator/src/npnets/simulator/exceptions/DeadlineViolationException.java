package npnets.simulator.exceptions;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;


public class DeadlineViolationException extends Exception {
	public String message;
		public DeadlineViolationException(Node node)
		{
			message="Deadline violated on node " + node.getName();
		}
}
