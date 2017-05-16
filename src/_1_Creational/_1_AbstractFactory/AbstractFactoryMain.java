package _1_Creational._1_AbstractFactory;

import _1_Creational._1_AbstractFactory.Interface.IButton;
import _1_Creational._1_AbstractFactory.Interface.IGuiFactory;
import _1_Creational._1_AbstractFactory.Interface.ITextArea;
import _1_Creational._1_AbstractFactory.Linux.LinuxIGuiFactory;
import _1_Creational._1_AbstractFactory.Mac.MacIGuiFactory;
import _1_Creational._1_AbstractFactory.Window.WinIGuiFactory;

/**
 * Created by LGH on 2017-02-10.
 */
public class AbstractFactoryMain
{
    private IGuiFactory IGuiFactory;
    private IButton IButton;
    private ITextArea ITextArea;

    public AbstractFactoryMain ()
    {
        /*
        IGuiFactory = FactoryInstance.getFactory (0);
        IButton = IGuiFactory.createButton ();
        ITextArea = IGuiFactory.createTextArea ();
        print();

        IGuiFactory = FactoryInstance.getFactory (1);
        IButton = IGuiFactory.createButton ();
        ITextArea = IGuiFactory.createTextArea ();
        print();

        IGuiFactory = FactoryInstance.getFactory (2);
        IButton = IGuiFactory.createButton ();
        ITextArea = IGuiFactory.createTextArea ();
        print();
        */

        //  Linux 용 Gui Factory 를 생성
        IGuiFactory = new LinuxIGuiFactory ();
        print();

        //  Mac 용 Gui Factory 를 생성
        IGuiFactory = new MacIGuiFactory ();
        print();

        //  Window 용 Gui Factory 를 생성
        IGuiFactory = new WinIGuiFactory ();
        print();
    }

    private void print()
    {
        IButton = IGuiFactory.createButton ();
        ITextArea = IGuiFactory.createTextArea ();

        IButton.click ();
        System.out.println(ITextArea.getText ());
    }
}
