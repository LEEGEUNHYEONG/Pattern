package _1_Creational._1_AbstractFactory.v1.Linux;

import _1_Creational._1_AbstractFactory.v1.Interface.IButton;
import _1_Creational._1_AbstractFactory.v1.Interface.IGuiFactory;
import _1_Creational._1_AbstractFactory.v1.Interface.ITextArea;

/**
 * Created by LGH on 2017-02-10.
 */

/**
 *  IGuiFactory 의 기능을 구현하는 LinuxIGuiFactory
 */
public class LinuxIGuiFactory implements IGuiFactory
{
    @Override
    public IButton createButton ()
    {
        return new LinuxIButton ();
    }

    @Override
    public ITextArea createTextArea ()
    {
        return new LinuxITextArea ();
    }
}
