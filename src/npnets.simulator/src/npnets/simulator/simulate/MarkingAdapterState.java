package npnets.simulator.simulate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MarkingAdapterState {
	public List<MarkingAdapter> adapterStack=new ArrayList<MarkingAdapter>();
	MarkingAdapter currentState;
	public void setCurrentState(MarkingAdapter currentState) {
		this.currentState = currentState;
	}
	int counter=-1;
	public MarkingAdapter getCurrentState(){
		return currentState;
	}
	public void addState(MarkingAdapter ma){
		if(counter>=50){
			adapterStack.remove(0);
			counter--;
		}
		if(counter!=adapterStack.size()-1)
		{
			for(int i=counter;i<adapterStack.size();i++){
				adapterStack.remove(i);
			}
		}
		counter++;
		adapterStack.add(new NetCopyMaker().makeMarkingAdapterCopy(ma));
	}
	public MarkingAdapter getState(int index){
		return adapterStack.get(index);
	}
	public void undo(){
		setCurrentState(adapterStack.get(--counter));
	}
	public void putToFile(String filename) {        
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
			try   
			{
				fos = new FileOutputStream(filename);
				out = new ObjectOutputStream(fos);
				out.writeObject(adapterStack);
				out.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
		    }
		
	}
	@SuppressWarnings("unchecked")
	public void readFromFile(String filename) {        
		FileInputStream fos = null;
		ObjectInputStream out = null;
			try   
			{
        try {
					Class.forName("ru.mathtech.npntool.npnets.highlevelnets.marking.impl.PlaceMarkingImpl");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				fos = new FileInputStream(filename);
				out = new CopyObjectInputStream(fos);
				try {
					Object obj=out.readObject();
					adapterStack=(List<MarkingAdapter>) obj;
					setCurrentState(adapterStack.get(adapterStack.size()-1));
					getCurrentState().clearDiagram();
					getCurrentState().createDiagramMap(getCurrentState().getMarkingMap());

					out.close();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
		    }
		
	}
	
}
