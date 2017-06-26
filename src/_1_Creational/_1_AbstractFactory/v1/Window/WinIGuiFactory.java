package _1_Creational._1_AbstractFactory.v1.Window;

import _1_Creational._1_AbstractFactory.v1.Interface.IButton;
import _1_Creational._1_AbstractFactory.v1.Interface.IGuiFactory;
import _1_Creational._1_AbstractFactory.v1.Interface.ITextArea;

/**
 * Created by LGH on 2017-02-10.
 */

/**
 *  IGuiFactory 의 기능을 구현하는 WinIGuiFactory
 */
public class WinIGuiFactory implements IGuiFactory

{
    @Override
    public IButton createButton ()
    {
        return new WinIButton ();
    }

    @Override
    public ITextArea createTextArea ()
    {
        return new WinITextArea ();
    }
}
