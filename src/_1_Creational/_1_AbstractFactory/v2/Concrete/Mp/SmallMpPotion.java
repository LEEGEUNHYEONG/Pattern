package _1_Creational._1_AbstractFactory.v2.Concrete.Mp;

import _1_Creational._1_AbstractFactory.v2.Abstract.MpPotion;

/**
 * Created by LGH on 2017-06-26.
 */

/**
 *  Concrete Product B2
 */
public class SmallMpPotion implements MpPotion
{
    @Override
    public void use ()
    {
        System.out.println("적은 마나 회복");
    }
}
