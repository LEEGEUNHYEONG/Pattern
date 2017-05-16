package _1_Creational._1_AbstractFactory;

import _1_Creational._1_AbstractFactory.Interface.IGuiFactory;
import _1_Creational._1_AbstractFactory.Linux.LinuxIGuiFactory;
import _1_Creational._1_AbstractFactory.Mac.MacIGuiFactory;
import _1_Creational._1_AbstractFactory.Window.WinIGuiFactory;

/**
 * Created by LGH on 2017-02-10.
 */
public class FactoryInstance
{
    public static IGuiFactory getFactory (int i)
    {
        switch(i)
        {
            case 0:
                return new LinuxIGuiFactory ();
            case 1:
                return new MacIGuiFactory ();
            case 2:
                return new WinIGuiFactory ();
            default:
                return null;
        }
    }
}
