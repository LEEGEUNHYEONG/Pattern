package _5_AbstractFactory.Linux;

import _5_AbstractFactory.Interface.IButton;
import _5_AbstractFactory.Interface.GuiFactory;
import _5_AbstractFactory.Interface.ITextArea;

/**
 * Created by LGH on 2017-02-10.
 */

/**
 *  GuiFactory 의 기능을 구현하는 LinuxGuiFactory
 */
public class LinuxGuiFactory implements GuiFactory
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
