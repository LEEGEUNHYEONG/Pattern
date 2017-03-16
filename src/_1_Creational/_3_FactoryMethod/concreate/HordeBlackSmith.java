package _1_Creational._3_FactoryMethod.concreate;

import _1_Creational._3_FactoryMethod.framework.BlackSmith;
import _1_Creational._3_FactoryMethod.framework.IWeapon;

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
