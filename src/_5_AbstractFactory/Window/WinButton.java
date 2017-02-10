package _5_AbstractFactory.Window;

import _5_AbstractFactory.Abs.Button;

/**
 * Created by LGH on 2017-02-10.
 */
public class WinButton implements Button
{
    @Override
    public void click ()
    {
        System.out.println(getClass ().getSimpleName () + " : onClick");
    }
}
