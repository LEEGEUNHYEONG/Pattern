package _1_Creational._3_FactoryMethod;

import _1_Creational._3_FactoryMethod.v1.concreate.AllianceBlackSmith;
import _1_Creational._3_FactoryMethod.v1.concreate.HordeBlackSmith;
import _1_Creational._3_FactoryMethod.v1.framework.BlackSmith;
import _1_Creational._3_FactoryMethod.v1.framework.IWeapon;
import _1_Creational._3_FactoryMethod.v2.Circle;
import _1_Creational._3_FactoryMethod.v2.Shape;
import _1_Creational._3_FactoryMethod.v2.ShapeFactory;

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
        Shape shape;
        ShapeFactory shapeFactory = new ShapeFactory ();

        shape = shapeFactory.createShape (Circle.class);
        shape.draw ();

        shape = shapeFactory.createShape (ShapeFactory.Circle);
        shape.draw ();

        shape = shapeFactory.createShape (ShapeFactory.Rectangle);
        shape.draw ();
    }
}
