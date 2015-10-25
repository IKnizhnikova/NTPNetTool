package npnets.simulator.simulate;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class CopyObjectInputStream extends ObjectInputStream {

	public CopyObjectInputStream(InputStream in) throws IOException {
		super(in);
	}
	
	/**
     * ƒесериализуютс€ только экземпл€ры ожидаемого класса Bicycle
     */
    @Override
    protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException,
            ClassNotFoundException {
        return super.resolveClass(desc);
    }

}
