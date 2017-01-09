package _1_Strategy;

import _1_Strategy.Item.Fist;
import _1_Strategy.Item.Weapon;

/**
 * Created by lkh25 on 2017-01-10.
 */
public class CharacterInv
{
    private Weapon weapon;

    /**
     *  초기 기본은 주먹으로 생성
     */
    public CharacterInv()
    {
        weapon = new Fist();
    }

    public void changeWeapon(Weapon weapon)
    {
        System.out.println("\tchange weapon > " + weapon.getClass().getSimpleName());
        this.weapon = weapon;
    }

    public void attack()
    {
        weapon.attack();
    }
}
