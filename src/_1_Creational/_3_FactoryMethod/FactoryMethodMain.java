package _1_Creational._3_FactoryMethod;

import _1_Creational._3_FactoryMethod.concreate.AllianceBlackSmith;
import _1_Creational._3_FactoryMethod.concreate.HordeBlackSmith;
import _1_Creational._3_FactoryMethod.framework.BlackSmith;
import _1_Creational._3_FactoryMethod.framework.IWeapon;

/**
 * Created by LGH on 2017-03-16.
 */
public class FactoryMethodMain
{
    public FactoryMethodMain ()
    {
        BlackSmith blackSmith;
        IWeapon weapon;

        blackSmith = new HordeBlackSmith();
        weapon = blackSmith.create();
        weapon.use();

        blackSmith = new AllianceBlackSmith();
        weapon = blackSmith.create();
        weapon.use();


    }
}
