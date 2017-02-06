package _4_Decorator.Item;

/**
 * Created by LGH on 2017-02-06.
 */
public class Milk implements ICoffee
{
    protected ICoffee ICoffee;

    private int charge = 800;

    public Milk (ICoffee ICoffee)
    {
        this.ICoffee = ICoffee;
        System.out.println ("우유 추가 + " + charge);
    }

    @Override
    public int getTotalPrice ()
    {
        return ICoffee.getTotalPrice () + charge;
    }
}
