package _2_Structural._3_Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LGH on 2017-04-28.
 */
public class Folder extends Component
{
    private List<Component> child = new ArrayList<> ();

    public Folder (String name)
    {
        super (name);
    }

    public boolean addComponent(Component component)
    {
        return child.add (component);
    }

    public boolean removeComponent(Component component)
    {
        return child.remove (component);
    }

    public List<Component> getChild()
    {
        return child;
    }


}
