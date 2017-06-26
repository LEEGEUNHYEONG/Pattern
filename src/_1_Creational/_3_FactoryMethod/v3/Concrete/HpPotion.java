package _1_Creational._3_FactoryMethod.v3.Concrete;

import _1_Creational._3_FactoryMethod.v3.framework.Item;

/**
 * Created by lkh25 on 2017-06-26.
 */
public class HpPotion implements Item
{
    @Override
    public void use()
    {
        System.out.println("체력 회복");
    }
}
