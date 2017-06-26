package _1_Creational._1_AbstractFactory.v2.Concrete.Factory;

import _1_Creational._1_AbstractFactory.v2.Abstract.HpPotion;
import _1_Creational._1_AbstractFactory.v2.Abstract.MpPotion;
import _1_Creational._1_AbstractFactory.v2.Abstract.PotionFactory;
import _1_Creational._1_AbstractFactory.v2.Concrete.Hp.LargeHpPotion;
import _1_Creational._1_AbstractFactory.v2.Concrete.Mp.LargeMpPotion;

/**
 * Created by LGH on 2017-06-26.
 */

/**
 *  Concrete Factory
 */
public class LargePotionFactory implements PotionFactory
{
    @Override
    public HpPotion createHpPotion ()
    {
        return new LargeHpPotion ();
    }

    @Override
    public MpPotion createMpPotion ()
    {
        return new LargeMpPotion ();
    }
}
