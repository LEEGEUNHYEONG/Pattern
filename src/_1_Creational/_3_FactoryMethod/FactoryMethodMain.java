package _1_Creational._3_FactoryMethod;

import _1_Creational._3_FactoryMethod.BlackSmith.AllianceBlackSmith;
import _1_Creational._3_FactoryMethod.BlackSmith.HordeBlackSmith;
import _1_Creational._3_FactoryMethod.BlackSmith.IBlackSmith;
import _1_Creational._3_FactoryMethod.Weapon.IWeapon;

/**
 * Created by LGH on 2017-03-16.
 */
public class FactoryMethodMain
{
    public FactoryMethodMain ()
    {
        IBlackSmith blackSmith;

        blackSmith = new HordeBlackSmith ();
        IWeapon hordeWeapon = blackSmith.createWeapon (WeaponType.SWORD);
        System.out.println(hordeWeapon.toString ());


        blackSmith = new AllianceBlackSmith ();
        IWeapon allianceWeapon = blackSmith.createWeapon (WeaponType.STAFF);
        System.out.println(allianceWeapon.toString ());
    }
}
