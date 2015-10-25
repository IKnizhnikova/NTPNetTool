package npnets.simulator;

import npnets.simulator.factory.ArcFactory;
import npnets.simulator.factory.PlaceFactory;
import npnets.simulator.factory.TransitionFactory;
import npnets.simulator.tools.CreationAndDirectEditTool;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
 
 
public class NPNGraphicalEditorPalette extends PaletteRoot {
 
  PaletteGroup group;
 
  public NPNGraphicalEditorPalette() {
    addGroup();
    addSelectionTool();
    addPlaceTool();
    addTransitionTool();
    addArcTool();
  }
 
  private void addSelectionTool() {
    SelectionToolEntry entry = new SelectionToolEntry();
    group.add(entry);
    setDefaultEntry(entry);
  }
 
  private void addGroup() {
    group = new PaletteGroup("Toolkit");
    add(group);
  }
 
  private void addPlaceTool() {
    CreationToolEntry entry = new CreationToolEntry("Place", "Create a new Place", new PlaceFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);   
    group.add(entry);
  }
 
  private void addTransitionTool() {
    CreationToolEntry entry = new CreationToolEntry("Transition", "Create a new Transition", new TransitionFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);   
    group.add(entry);
    }
  
  private void addArcTool() {
    ConnectionCreationToolEntry entry = new ConnectionCreationToolEntry("Arc", "Creates a new Arc", new ArcFactory(), null, null);
    group.add(entry);
    }
}

