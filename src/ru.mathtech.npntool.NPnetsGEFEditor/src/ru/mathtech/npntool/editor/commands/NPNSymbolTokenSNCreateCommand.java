package ru.mathtech.npntool.editor.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import ru.mathtech.npntool.editor.NPNGraphicalEditorConstants;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolPlaceSN;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

public class NPNSymbolTokenSNCreateCommand extends Command {

	protected NPNSymbolPlaceSN placeSN;
	protected NPNSymbolTokenSN symbolNewToken;
	protected Rectangle newConstraints;

	/*
	protected HighLevelPetriNet hlpnSN = null;
	protected Node newNode = null;
	*/

	public NPNSymbolTokenSNCreateCommand(NPNSymbolPlaceSN placeParent,
			NPNSymbolTokenSN newSymbolToken, Point location) {
		super();
		this.placeSN = placeParent;
		this.symbolNewToken = newSymbolToken;
		this.newConstraints = new Rectangle(location, NPNGraphicalEditorConstants.dimensionTokenSizeDefault);
	}
	
	

	@Override
	public void execute() {
		/*
		Place newPlace = HLPNFactory.eINSTANCE.createPlace();
		newNode = newPlace;
		symbolPlace.setModel(newPlace);
		*/

		/*
		newNode.setName(NPNGraphicalEditorConstants.nameNodeDefault);
		*/
		
		symbolNewToken.setConstraints(newConstraints);

		//hlpnSN = diagramNetSystem.getModel();

		// Connect created token to the place symbol and the place
		symbolNewToken.setPlace(placeSN);
		//newNode.setNet(hlpnSN);
	}


	@Override
	public void redo() {
		symbolNewToken.setPlace(placeSN);
		//newNode.setNet(hlpnSN);
	}

	@Override
	public void undo() {
		symbolNewToken.setPlace(null);
		//newNode.setNet(null);
	}
}
