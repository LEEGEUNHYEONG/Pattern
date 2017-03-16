package _1_Creational._3_FactoryMethod.concreate;

import _1_Creational._3_FactoryMethod.framework.IWeapon;

/**
 * Created by LGH on 2017-03-16.
 */
public class AllianceWeapon implements IWeapon
{
    @Override
    public void use()
    {
        System.out.println("> Alliance Weapon !!! ");
    }
}
