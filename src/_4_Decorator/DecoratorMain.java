package _4_Decorator;

import _4_Decorator.Item.Coffee;
import _4_Decorator.Item.ICoffee;
import _4_Decorator.Item.Milk;
import _4_Decorator.Item.Shot;

/**
 * Created by LGH on 2017-02-06.
 */
public class DecoratorMain
{
    public DecoratorMain ()
    {
        ICoffee iCoffee = new Coffee ();
        System.out.println(Coffee.class.getSimpleName () + " : " + iCoffee.getTotalPrice ());

        iCoffee = new Shot (iCoffee);
        System.out.println (" total : " + iCoffee.getTotalPrice ());

        iCoffee = new Milk (iCoffee);
        System.out.println (" total : " + iCoffee.getTotalPrice ());
    }
}
