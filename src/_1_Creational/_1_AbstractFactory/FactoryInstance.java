package _1_Creational._1_AbstractFactory;

import _1_Creational._1_AbstractFactory.Interface.GuiFactory;
import _1_Creational._1_AbstractFactory.Linux.LinuxGuiFactory;
import _1_Creational._1_AbstractFactory.Mac.MacGuiFactory;
import _1_Creational._1_AbstractFactory.Window.WinGuiFactory;

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
