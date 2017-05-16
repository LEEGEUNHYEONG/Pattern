package _3_Behavioral._9_Strategy.Item;

/**
 * Fist 무기를 생성하고 IWeapon 인터페이스의 attack 기능을 구현
 */

public class Fist implements IWeapon
{
    @Override
    public void attack()
    {
        System.out.println("Fist attack");
    }
}
