package _1_Creational._3_FactoryMethod.v3.framework;

/**
 * Created by lkh25 on 2017-06-26.
 */

/**
 *  Abstract Creator
 */
public abstract class ItemCreator
{
    //  Factory Method
    public Item create()
    {
        return createItem();
    }

    abstract protected Item createItem();

}
