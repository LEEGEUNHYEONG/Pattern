package _3_Behavioral._10_Template;

import _3_Behavioral._10_Template.Framework.BitePizza;
import _3_Behavioral._10_Template.Framework.CheesePizza;
import _3_Behavioral._10_Template.Framework.GarlicPizza;
import _3_Behavioral._10_Template.Framework.Pizza;

/**
 * Created by LGH on 2017-05-18.
 */
public class TemplateMain
{
    public TemplateMain ()
    {
        Pizza pizza1 = new BitePizza ();
        Pizza pizza2 = new CheesePizza ();
        Pizza pizza3 = new GarlicPizza ();

        pizza1.cook ();
        pizza2.cook ();
        pizza3.cook ();
    }
}
