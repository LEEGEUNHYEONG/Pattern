package _5_AbstractFactory;

import _5_AbstractFactory.Interface.IButton;
import _5_AbstractFactory.Interface.GuiFactory;
import _5_AbstractFactory.Interface.ITextArea;
import _5_AbstractFactory.Linux.LinuxGuiFactory;
import _5_AbstractFactory.Mac.MacGuiFactory;
import _5_AbstractFactory.Window.WinGuiFactory;

/**
 * Created by LGH on 2017-02-10.
 */
public class AbstractFactoryMain
{
    private GuiFactory guiFactory;
    private IButton IButton;
    private ITextArea ITextArea;

    public AbstractFactoryMain ()
    {
        /*
        guiFactory = FactoryInstance.getFactory (0);
        IButton = guiFactory.createButton ();
        ITextArea = guiFactory.createTextArea ();
        print();

        guiFactory = FactoryInstance.getFactory (1);
        IButton = guiFactory.createButton ();
        ITextArea = guiFactory.createTextArea ();
        print();

        guiFactory = FactoryInstance.getFactory (2);
        IButton = guiFactory.createButton ();
        ITextArea = guiFactory.createTextArea ();
        print();
        */

        //  Linux 용 Gui Factory 를 생성
        guiFactory = new LinuxGuiFactory ();
        print();

        //  Mac 용 Gui Factory 를 생성
        guiFactory = new MacGuiFactory ();
        print();

        //  Window 용 Gui Factory 를 생성
        guiFactory = new WinGuiFactory ();
        print();
    }

    private void print()
    {
        IButton = guiFactory.createButton ();
        ITextArea = guiFactory.createTextArea ();

        IButton.click ();
        System.out.println(ITextArea.getText ());
    }
}
