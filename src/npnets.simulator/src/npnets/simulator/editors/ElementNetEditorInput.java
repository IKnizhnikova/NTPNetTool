package npnets.simulator.editors;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;

public class ElementNetEditorInput implements IEditorInput {

	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists() { return false; }

	@Override
	public ImageDescriptor getImageDescriptor() { return null; }

	@Override
	public String getName() { return "Token Type Element Net"; }

	@Override
	public IPersistableElement getPersistable() { return null; }

	@Override
	public String getToolTipText() { return "Hello"; }	
	
	private TokenTypeElementNet content;

    public ElementNetEditorInput(TokenTypeElementNet content) {
        this.content = content;
    }
    
    public TokenTypeElementNet getContent() {
        return this.content;
    }
    
    @Override
    public int hashCode() {
        return content.hashCode();
    }
	
	@Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ElementNetEditorInput))
        	return false;
		if (this.content.getUuid() == ((ElementNetEditorInput) obj).getContent().getUuid())
        	return true;
        return false;
        /*
		if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;*/
    }
	
}
