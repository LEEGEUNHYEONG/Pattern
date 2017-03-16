package _1_Creational._1_AbstractFactory.Mac;

import _1_Creational._1_AbstractFactory.Interface.IButton;
import _1_Creational._1_AbstractFactory.Interface.GuiFactory;
import _1_Creational._1_AbstractFactory.Interface.ITextArea;

/**
 * Created by LGH on 2017-02-10.
 */

/**
 *  GuiFactory 의 기능을 구현하는 MacGuiFactory
 */
public class MacGuiFactory implements GuiFactory
{
    @Override
    public IButton createButton ()
    {
        return new MacIButton ();
    }

    @Override
    public ITextArea createTextArea ()
    {
        return new MacITextArea ();
    }
}
