package _1_Creational._3_FactoryMethod.v2;

/**
 * Created by LGH on 2017-05-30.
 */

/**
 *  Rectangle 클래스
 *  Shape 의 동작을 Rectangle 에 맞게 구현
 */
public class Rectangle implements Shape
{
    @Override
    public void draw ()
    {
        System.out.println(getClass ().getSimpleName () + " draw");
    }
}
