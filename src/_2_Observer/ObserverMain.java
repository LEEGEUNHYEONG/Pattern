package _2_Observer;

/**
 * Created by LGH on 2017-01-20.
 */
public class ObserverMain
{
    public ObserverMain ()
    {
        Inventory inventory = new Inventory ();

        Info info = new Info (inventory);
        Status status = new Status (inventory);

        inventory.setItem ("head");
        inventory.setItem ("neck");
        inventory.removeItem ("ring");
        inventory.setItem ("neck");
        inventory.setItem ("ring");
        inventory.setItem ("weapon");
    }
}
