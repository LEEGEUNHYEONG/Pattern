package _1_Strategy.Item;

/**
 * Fist 무기를 생성하고 Weapon 인터페이스의 attack 기능을 구현
 */

public class Fist implements Weapon
{
    @Override
    public void attack()
    {
        System.out.println("Fist attack");
    }
}
