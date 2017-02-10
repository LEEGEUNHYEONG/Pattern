package _5_AbstractFactory.Linux;

import _5_AbstractFactory.Abs.Button;
import _5_AbstractFactory.Abs.GuiFactory;
import _5_AbstractFactory.Abs.TextArea;

/**
 * Created by LGH on 2017-02-10.
 */
public class LinuxGuiFactory implements GuiFactory
{
    @Override
    public Button createButton ()
    {
        return new LinuxButton ();
    }

    @Override
    public TextArea createTextArea ()
    {
        return new LinuxTextArea ();
    }
}
