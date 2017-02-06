package _4_Decorator.Item;

/**
 * Created by LGH on 2017-02-06.
 */
public class Coffee implements ICoffee
{
    private int charge = 2000;

    @Override
    public int getTotalPrice ()
    {
        return charge;
    }
}
