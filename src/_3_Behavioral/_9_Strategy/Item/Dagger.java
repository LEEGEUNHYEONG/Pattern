package _3_Behavioral._9_Strategy.Item;

/**
 * Dagger 무기를 생성하고 Weapon 인터페이스의 attack 기능을 구현
 */
public class Dagger implements Weapon
{
    @Override
    public void attack()
    {
        System.out.println("Dagger Attack !!!");
    }
}
