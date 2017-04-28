package _2_Structural._3_Composite;

/**
 * Created by LGH on 2017-04-28.
 */
public class CompositeMain
{
    public CompositeMain ()
    {
        Folder root = new Folder("root");
        Folder main = new Folder("main");
        Folder home = new Folder("home");

        File intelliJ = new File("IntelliJ");

        File wow = new File("wow");
        File lol = new File("lol");

        home.addComponent (wow);
        home.addComponent (lol);

        main.addComponent (intelliJ);
        main.addComponent (home);

        root.addComponent (main);

        print(root);
    }

    private void print(Component component)
    {
        System.out.println(component.getClass ().getName () + " : " + component.getName ());

        if(component instanceof Folder)
        {
            for(Component c : ((Folder)component).getChild ())
            {
                print(c);
            }
        }
    }
}
