package _3_Behavioral._9_Strategy;

import _3_Behavioral._9_Strategy.Item.IWeapon;

/**
 *  Weapon을 사용할 수 있는 CharacterInv 클래스 구현
 */
public class CharacterInv
{
    private IWeapon IWeapon;

    /**
     *  어느 Weapon을 사용할지 설정함
     * @param IWeapon
     */
    public void changeWeapon(IWeapon IWeapon)
    {
        System.out.println("change IWeapon : " + IWeapon.getClass().getSimpleName());
        this.IWeapon = IWeapon;
    }

    /**
     *  설정된 weapon의 attack 기능을 수행 함
     */
    public void attack()
    {
        IWeapon.attack();
    }
}
