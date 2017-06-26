package _1_Creational._1_AbstractFactory.v2.Framework.Concrete.Mp;

import _1_Creational._1_AbstractFactory.v2.Framework.Abstract.MpPotion;

/**
 * Created by LGH on 2017-06-26.
 */

/**
 *  Concrete Product A2
 */
public class LargeMpPotion implements MpPotion
{
    @Override
    public void use ()
    {
        System.out.println ("많은 마나 회복");
    }
}
