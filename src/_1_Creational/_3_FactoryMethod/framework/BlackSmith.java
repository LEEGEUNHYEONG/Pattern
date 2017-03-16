package _1_Creational._3_FactoryMethod.framework;

/**
 * Created by LGH on 2017-03-16.
 */
public abstract class BlackSmith
{
    public IWeapon create()
    {
        //  Template Method 와 같이 동작
        IWeapon weapon;
        getItemType();
        weapon = createWeapon();

        return weapon;
    }

    abstract protected void getItemType();
    abstract protected IWeapon createWeapon();
}
