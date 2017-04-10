package _1_Creational._4_Prototype;

/**
 * Created by LGH on 2017-04-10.
 */
public class Car implements Cloneable
{
    private String name;

    public Car ()
    {

    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Car copy() throws CloneNotSupportedException
    {
        Car copyCar = (Car)this.clone ();
        return copyCar;
    }
}
