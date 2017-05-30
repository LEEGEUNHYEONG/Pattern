package _1_Creational._3_FactoryMethod.v1.concreate;

import _1_Creational._3_FactoryMethod.v1.framework.IWeapon;

/**
 * Created by LGH on 2017-03-16.
 */
public class AllianceWeapon implements IWeapon
{
    @Override
    public void use()
    {
        System.out.println("> Alliance IWeapon !!! ");
    }
}
