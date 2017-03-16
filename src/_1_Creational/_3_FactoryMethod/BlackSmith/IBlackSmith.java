package _1_Creational._3_FactoryMethod.BlackSmith;

import _1_Creational._3_FactoryMethod.Weapon.IWeapon;
import _1_Creational._3_FactoryMethod.WeaponType;

/**
 * Created by LGH on 2017-03-16.
 */
public interface IBlackSmith
{
    IWeapon createWeapon(WeaponType weaponType);
}
