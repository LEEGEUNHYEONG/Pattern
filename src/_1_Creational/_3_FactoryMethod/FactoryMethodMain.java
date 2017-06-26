package _1_Creational._3_FactoryMethod;

import _1_Creational._3_FactoryMethod.v3.Concrete.HpCreator;
import _1_Creational._3_FactoryMethod.v3.Concrete.MpCreator;
import _1_Creational._3_FactoryMethod.v3.framework.Item;
import _1_Creational._3_FactoryMethod.v3.framework.ItemCreator;

/**
 * Created by LGH on 2017-03-16.
 */
public class FactoryMethodMain
{
    public FactoryMethodMain ()
    {
        /*
        //  v1
        BlackSmith blackSmith;
        IWeapon weapon;

        blackSmith = new HordeBlackSmith();
        weapon = blackSmith.create();
        weapon.use();

        blackSmith = new AllianceBlackSmith();
        weapon = blackSmith.create();
        weapon.use();
        */

        //  v2
        /*
        Shape shape;
        ShapeFactory shapeFactory = new ShapeFactory ();

        shape = shapeFactory.createShape (Circle.class);
        shape.draw ();

        shape = shapeFactory.createShape (ShapeFactory.Circle);
        shape.draw ();

        shape = shapeFactory.createShape (ShapeFactory.Rectangle);
        shape.draw ();
        */

        //  v3
        ItemCreator itemCreator;
        Item item;

        itemCreator = new HpCreator ();
        item = itemCreator.create ();
        item.use ();

        itemCreator = new MpCreator ();
        item = itemCreator.create ();
        item.use();

    }
}
