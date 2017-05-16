package _3_Behavioral._9_Strategy.Item;

/**
 * Dagger 무기를 생성하고 IWeapon 인터페이스의 attack 기능을 구현
 */
public class Dagger implements IWeapon
{
    @Override
    public void attack()
    {
        System.out.println("Dagger Attack !!!");
    }
}
