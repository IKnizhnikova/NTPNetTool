package ru.mathtech.npntool.editor.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import ru.mathtech.npntool.editor.commands.NPNSymbolArcPTSNCreateCommand;
import ru.mathtech.npntool.editor.commands.NPNSymbolArcTPSNCreateCommand;
import ru.mathtech.npntool.editor.requests.NPNSymbolArcSNCreateConnectionRequest;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcPTSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolArcTPSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolNodeSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTransitionSN;

public class NPNSymbolNodeGraphicalNodeEditPolicy extends
		GraphicalNodeEditPolicy {

	@Override
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		Command res = null;
		Object model = getHost().getModel();
		Command command = request.getStartCommand();
		if (model instanceof NPNSymbolTransitionSN) {
			NPNSymbolTransitionSN transition = (NPNSymbolTransitionSN) model;
			if (command instanceof NPNSymbolArcPTSNCreateCommand) {
				NPNSymbolArcPTSNCreateCommand symbolArcPTSNCreateCommand = (NPNSymbolArcPTSNCreateCommand) command;
				symbolArcPTSNCreateCommand
						.setSymbolTransitionTarget(transition);
				res = command;
			}
		} else if (model instanceof NPNSymbolPlaceSN) {
			NPNSymbolPlaceSN place = (NPNSymbolPlaceSN) model;
			if (command instanceof NPNSymbolArcTPSNCreateCommand) {
				NPNSymbolArcTPSNCreateCommand symbolArcTPSNCreateCommand = (NPNSymbolArcTPSNCreateCommand) command;
				symbolArcTPSNCreateCommand.setSymbolPlaceTarget(place);
				res = command;
			}
		}
		return res;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		Command res = null;
		Object model = getHost().getModel();
		if (request instanceof NPNSymbolArcSNCreateConnectionRequest) {
			NPNSymbolArcSNCreateConnectionRequest symbolArcCreationRequest =
					(NPNSymbolArcSNCreateConnectionRequest) request;
			if (model instanceof NPNSymbolNodeSN) {
				NPNSymbolNodeSN nodeSource = (NPNSymbolNodeSN) model;
				symbolArcCreationRequest.setNodeSource(nodeSource);
				
				if (nodeSource instanceof NPNSymbolPlaceSN) {
					NPNSymbolPlaceSN nodePlaceSource = (NPNSymbolPlaceSN) nodeSource;
					res = new NPNSymbolArcPTSNCreateCommand(
							nodePlaceSource.getDiagram(),
							(NPNSymbolArcPTSN) request.getNewObject(), nodePlaceSource);
					request.setStartCommand(res);
				} else if (nodeSource instanceof NPNSymbolTransitionSN) {
					NPNSymbolTransitionSN nodeTransitionSource = (NPNSymbolTransitionSN) nodeSource;
					res = new NPNSymbolArcTPSNCreateCommand(
							nodeTransitionSource.getDiagram(),
							(NPNSymbolArcTPSN) request.getNewObject(), nodeTransitionSource);
					request.setStartCommand(res);
				}
			}
		}
		return res;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		return null;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		return null;
	}

}
