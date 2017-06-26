package _1_Creational._1_AbstractFactory.v2.Concrete.Factory;

import _1_Creational._1_AbstractFactory.v2.Abstract.HpPotion;
import _1_Creational._1_AbstractFactory.v2.Abstract.MpPotion;
import _1_Creational._1_AbstractFactory.v2.Abstract.PotionFactory;
import _1_Creational._1_AbstractFactory.v2.Concrete.Hp.SmallHpPotion;
import _1_Creational._1_AbstractFactory.v2.Concrete.Mp.SmallMpPotion;

/**
 * Created by LGH on 2017-06-26.
 */

/**
 *  Concrete Factory
 */
public class SmallPotionFactory implements PotionFactory
{
    @Override
    public HpPotion createHpPotion ()
    {
        return new SmallHpPotion ();
    }

    @Override
    public MpPotion createMpPotion ()
    {
        return new SmallMpPotion ();
    }
}
