package _1_Creational._3_FactoryMethod.v2;

/**
 * Created by LGH on 2017-05-30.
 */

/**
 *  Circle 클래스
 *  Shape 의 동작을 Circle 에 맞게 구현
 */
public class Circle implements Shape
{
    @Override
    public void draw ()
    {
        System.out.println(getClass ().getSimpleName () + " draw");
    }
}
