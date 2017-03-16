package _1_Creational._3_FactoryMethod.BlackSmith;

import _1_Creational._3_FactoryMethod.Weapon.AllianceWeapon;
import _1_Creational._3_FactoryMethod.Weapon.IWeapon;
import _1_Creational._3_FactoryMethod.WeaponType;

/**
 * Created by LGH on 2017-03-16.
 */
public class AllianceBlackSmith implements IBlackSmith
{
    public AllianceBlackSmith ()
    {
    }

    @Override
    public IWeapon createWeapon (WeaponType weaponType)
    {
        return new AllianceWeapon (weaponType);
    }
}
