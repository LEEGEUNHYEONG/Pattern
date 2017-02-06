package _4_Decorator.Item;

/**
 * Created by LGH on 2017-02-06.
 */
public class Shot implements ICoffee
{
    protected ICoffee ICoffee;

    private int charge = 1000;

    public Shot (ICoffee ICoffee)
    {
        this.ICoffee = ICoffee;
        System.out.println ("샷 추가 + " + charge);
    }

    @Override
    public int getTotalPrice ()
    {
        return ICoffee.getTotalPrice () + charge;
    }
}
