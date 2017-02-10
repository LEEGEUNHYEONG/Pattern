package _5_AbstractFactory.Mac;

import _5_AbstractFactory.Abs.Button;
import _5_AbstractFactory.Abs.GuiFactory;
import _5_AbstractFactory.Abs.TextArea;

/**
 * Created by LGH on 2017-02-10.
 */
public class MacGuiFactory implements GuiFactory
{
    @Override
    public Button createButton ()
    {
        return new MacButton ();
    }

    @Override
    public TextArea createTextArea ()
    {
        return new MacTextArea ();
    }
}
