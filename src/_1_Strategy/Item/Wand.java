package _1_Strategy.Item;

/**
 * Wand 무기를 생성하고 Weapon 인터페이스의 attack 기능을 구현
 */
public class Wand implements Weapon
{
    @Override
    public void attack()
    {
        System.out.println("Wand Attack !!!");
    }
}
