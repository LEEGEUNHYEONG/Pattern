package _1_Creational._3_FactoryMethod.v1.concreate;

import _1_Creational._3_FactoryMethod.v1.framework.BlackSmith;
import _1_Creational._3_FactoryMethod.v1.framework.IWeapon;

/**
 * Created by LGH on 2017-03-16.
 */
public class HordeBlackSmith extends BlackSmith
{
    @Override
    protected void getItemType()
    {
        System.out.println("Horde Item Create");
    }

    @Override
    protected IWeapon createWeapon()
    {
        return new HordeWeapon();
    }
}
