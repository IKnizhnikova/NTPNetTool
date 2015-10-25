package npnets.simulator.simulate;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;











import org.eclipse.draw2d.geometry.Rectangle;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.ElementNetMarked;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.npndiagrams.NPNSymbolTokenSN;

public class NetCopyMaker {

	public ElementNetMarked makeNetCopy(ElementNetMarked net){
		try {
			ElementNetMarked netCopy=(ElementNetMarked)deepclone(net);
			netCopy.setUuid(createUuid(net.getUuid()));
			return netCopy;
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public MarkingAdapter makeMarkingAdapterCopy(MarkingAdapter ma){
		try {
			MarkingAdapter newMa= (MarkingAdapter)deepclone(ma);
			newMa.markingMap.clear();
			for(Map.Entry<Place, List<Token>> me:ma.markingMap.entrySet()) {
					List<Token> tokenList=new ArrayList<Token>();
					for(Token token:me.getValue())
					{
						tokenList.add((Token) deepclone(token));
					}
					newMa.getMarkingMap().put((Place) deepclone(me.getKey()), tokenList);
			}
			newMa.elementMarkingMap.putAll(ma.elementMarkingMap);
			return newMa;
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
    static Object deepclone(final Serializable o)
            throws IOException, ClassNotFoundException
    {
        // Создаем пару канальных (pipe) потоков.
        // Будем записывать байты в один из них, а затем читать из другого.
        final PipedOutputStream pipeout = new PipedOutputStream();
        PipedInputStream pipein = new PipedInputStream(pipeout);
 
        // Теперь создаем отдельный поток исполнения для сериализации объекта
        // и записи его байтов в PipedOutputStream
        Thread writer = new Thread() {
            public void run() {
                ObjectOutputStream out = null;
                try {
                    out = new ObjectOutputStream(pipeout);
                    out.writeObject(o);
                }
                catch(IOException e) {}
                finally {
                    try { out.close(); } catch (Exception e) {}
                }
            }
        };
        writer.start();
        Class.forName("ru.mathtech.npntool.npnets.highlevelnets.marking.impl.PlaceMarkingImpl");
        CopyObjectInputStream in = new CopyObjectInputStream(pipein);
        Object obj= in.readObject();
        in.close();
        return obj;
    }
	public Token makeTokenCopy(Token token) {
		try {
			Token clonedtoken=(Token)deepclone(token);
			clonedtoken.setUuid(createUuid(token.getUuid()));
			if(token instanceof TokenNetAdapter){
				((TokenNetAdapter)clonedtoken).setType((TokenTypeElementNet)token.getType());
				((TokenNetAdapter)clonedtoken).setValue(((TokenNetAdapter)token).getValue());
			}
			else{ 
				((TokenAdapter)clonedtoken).setType(token.getType());
			}
			return clonedtoken;
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	private String createUuid(String uuid) {
		return uuid+"_cloned_"+new Random().nextInt(99999);
	}
	public NPNSymbolTokenSN makeDiagramTokenCopy(NPNSymbolTokenSN dToken) {
		try {
			NPNSymbolTokenSN clonedtoken=(NPNSymbolTokenSN)deepclone(dToken);
			clonedtoken.setUuid(createUuid(dToken.getUuid()));
			clonedtoken.getConstraints().x+=randomizer(10);
			clonedtoken.getConstraints().y+=randomizer(10);
			clonedtoken.setModel(dToken.getModel());
			return clonedtoken;
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	private int randomizer(int i) {
		Random rand=new Random();
		return rand.nextBoolean()?rand.nextInt(i):-rand.nextInt(i);
	}
}
