package _5_AbstractFactory;

import _5_AbstractFactory.Abs.Button;
import _5_AbstractFactory.Abs.GuiFactory;
import _5_AbstractFactory.Abs.TextArea;
import _5_AbstractFactory.Linux.LinuxGuiFactory;
import _5_AbstractFactory.Mac.MacGuiFactory;
import _5_AbstractFactory.Window.WinGuiFactory;

/**
 * Created by LGH on 2017-02-10.
 */
public class AbstractFactoryMain
{
    private GuiFactory guiFactory;
    private Button button;
    private TextArea textArea;

    public AbstractFactoryMain ()
    {
        guiFactory = FactoryInstance.getFactory (0);
        button = guiFactory.createButton ();
        textArea = guiFactory.createTextArea ();
        print();

        guiFactory = FactoryInstance.getFactory (1);
        button = guiFactory.createButton ();
        textArea = guiFactory.createTextArea ();
        print();

        guiFactory = FactoryInstance.getFactory (2);
        button = guiFactory.createButton ();
        textArea = guiFactory.createTextArea ();
        print();
    }

    private void print()
    {
        button.click ();
        System.out.println(textArea.getText ());
    }
}
