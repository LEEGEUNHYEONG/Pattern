package _1_Creational._1_AbstractFactory.v2.Framework.Concrete.Factory;

import _1_Creational._1_AbstractFactory.v2.Framework.Abstract.HpPotion;
import _1_Creational._1_AbstractFactory.v2.Framework.Abstract.MpPotion;
import _1_Creational._1_AbstractFactory.v2.Framework.Abstract.PotionFactory;
import _1_Creational._1_AbstractFactory.v2.Framework.Concrete.Hp.LargeHpPotion;
import _1_Creational._1_AbstractFactory.v2.Framework.Concrete.Mp.LargeMpPotion;

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
