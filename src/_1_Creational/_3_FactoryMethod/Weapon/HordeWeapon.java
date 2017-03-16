package _1_Creational._3_FactoryMethod.Weapon;

import _1_Creational._3_FactoryMethod.WeaponType;

/**
 * Created by LGH on 2017-03-16.
 */
public class HordeWeapon implements IWeapon
{
    private WeaponType weaponType;

    public HordeWeapon (WeaponType weaponType)
    {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType ()
    {
        return weaponType;
    }

    @Override
    public String toString ()
    {
        return "Horde Weapon : " + weaponType;
    }
}