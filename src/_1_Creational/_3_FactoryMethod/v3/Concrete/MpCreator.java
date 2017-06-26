package _1_Creational._3_FactoryMethod.v3.Concrete;

import _1_Creational._3_FactoryMethod.v3.framework.Item;
import _1_Creational._3_FactoryMethod.v3.framework.ItemCreator;

/**
 * Created by lkh25 on 2017-06-26.
 */
public class MpCreator extends ItemCreator
{
    @Override
    protected Item createItem()
    {
        return new MpPotion();
    }
}
