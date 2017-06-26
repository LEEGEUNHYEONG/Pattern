package _1_Creational._1_AbstractFactory.v2.Framework.Concrete.Factory;

import _1_Creational._1_AbstractFactory.v2.Framework.Abstract.HpPotion;
import _1_Creational._1_AbstractFactory.v2.Framework.Abstract.MpPotion;
import _1_Creational._1_AbstractFactory.v2.Framework.Abstract.PotionFactory;
import _1_Creational._1_AbstractFactory.v2.Framework.Concrete.Hp.SmallHpPotion;
import _1_Creational._1_AbstractFactory.v2.Framework.Concrete.Mp.SmallMpPotion;

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
