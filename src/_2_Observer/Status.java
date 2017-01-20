package _2_Observer;

import Util.log;

/**
 * Created by LGH on 2017-01-20.
 */
public class Status implements Observer
{
    private Inventory inventory;

    public Status (Inventory inventory)
    {
        this.inventory = inventory;
        inventory.addObserver (this);
    }

    @Override
    public void update (String title)
    {
        log.p (getClass ().getSimpleName (), title);
    }

    public void remove()
    {
        inventory.removeObserver (this);
    }
}
