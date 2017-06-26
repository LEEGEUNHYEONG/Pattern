package _1_Creational._1_AbstractFactory.v1.Mac;

import _1_Creational._1_AbstractFactory.v1.Interface.IButton;
import _1_Creational._1_AbstractFactory.v1.Interface.IGuiFactory;
import _1_Creational._1_AbstractFactory.v1.Interface.ITextArea;

/**
 * Created by LGH on 2017-02-10.
 */

/**
 *  IGuiFactory 의 기능을 구현하는 MacIGuiFactory
 */
public class MacIGuiFactory implements IGuiFactory
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
