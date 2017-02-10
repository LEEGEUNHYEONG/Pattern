package _5_AbstractFactory;

import _5_AbstractFactory.Abs.GuiFactory;
import _5_AbstractFactory.Linux.LinuxGuiFactory;
import _5_AbstractFactory.Mac.MacGuiFactory;
import _5_AbstractFactory.Window.WinGuiFactory;

/**
 * Created by LGH on 2017-02-10.
 */
public class FactoryInstance
{
    public static GuiFactory getFactory (int i)
    {
        switch(i)
        {
            case 0:
                return new LinuxGuiFactory ();
            case 1:
                return new MacGuiFactory ();
            case 2:
                return new WinGuiFactory ();
            default:
                return null;
        }
    }
}
