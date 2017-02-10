package _5_AbstractFactory.Linux;

import _5_AbstractFactory.Abs.Button;

/**
 * Created by LGH on 2017-02-10.
 */
public class LinuxButton implements Button
{
    @Override
    public void click ()
    {
        System.out.println(getClass ().getSimpleName () + " : click");
    }
}
