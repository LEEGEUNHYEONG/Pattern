package _1_Creational._4_Prototype;

/**
 * Created by LGH on 2017-04-10.
 */

/**
 *  Clone 을 이용하여 복사할 클래스,
 *  Cloneable 을 implements 함
 */
public class Car implements Cloneable
{
    //  Car 의 이름을 지정
    private String name;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    protected Object clone () throws CloneNotSupportedException
    {
        return super.clone ();
    }

    public Car copy () throws CloneNotSupportedException
    {
        Car copyCar = (Car) super.clone ();
        return copyCar;
    }
}





