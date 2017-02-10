package _5_AbstractFactory.Window;

import _5_AbstractFactory.Abs.Button;
import _5_AbstractFactory.Abs.GuiFactory;
import _5_AbstractFactory.Abs.TextArea;

/**
 * Created by LGH on 2017-02-10.
 */
public class WinGuiFactory implements GuiFactory

{
    @Override
    public Button createButton ()
    {
        return new WinButton ();
    }

    @Override
    public TextArea createTextArea ()
    {
        return new WinTextArea ();
    }
}
