package _1_Strategy;

import Util.log;
import _1_Strategy.Item.Weapon;

/**
 *  Weapon을 사용할 수 있는 CharacterInv 클래스 구현
 */
public class CharacterInv
{
    private Weapon weapon;

    /**
     *  어느 Weapon을 사용할지 설정함
     * @param weapon
     */
    public void changeWeapon(Weapon weapon)
    {
        System.out.println("change Weapon : " + weapon.getClass().getSimpleName());
        this.weapon = weapon;
    }

    /**
     *  설정된 weapon의 attack 기능을 수행 함
     */
    public void attack()
    {
        weapon.attack();
    }
}
