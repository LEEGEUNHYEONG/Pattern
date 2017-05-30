package _1_Creational._3_FactoryMethod.v2;

/**
 * Created by LGH on 2017-05-30.
 */

/**
 *  Factory 클래스
 *  Concrete Class
 */
public class ShapeFactory
{
    public final static int Circle = 1;
    public final static int Rectangle = 2;

    /**
     *  전달받은 type 에 맞는 클래스를 생성하여 return
     * @param type
     * @return
     */
    public Shape createShape(int type)
    {
        switch(type)
        {
            case Circle :
                return new Circle ();
            case Rectangle :
                return new Rectangle ();
            default:
                return null;
        }
    }

    public Shape createShape(Class c)
    {
        if(c == _1_Creational._3_FactoryMethod.v2.Circle.class)
        {
            return new Circle();
        }
        else if (c == _1_Creational._3_FactoryMethod.v2.Rectangle.class)
        {
            return new Rectangle ();
        }
        else
        {
            return null;
        }
    }
}
