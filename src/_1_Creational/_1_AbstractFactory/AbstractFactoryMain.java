package _1_Creational._1_AbstractFactory;

import _1_Creational._1_AbstractFactory.v1.Interface.IButton;
import _1_Creational._1_AbstractFactory.v1.Interface.IGuiFactory;
import _1_Creational._1_AbstractFactory.v1.Interface.ITextArea;
import _1_Creational._1_AbstractFactory.v2.Framework.Abstract.HpPotion;
import _1_Creational._1_AbstractFactory.v2.Framework.Abstract.MpPotion;
import _1_Creational._1_AbstractFactory.v2.Framework.Abstract.PotionFactory;
import _1_Creational._1_AbstractFactory.v2.Framework.Concrete.Factory.LargePotionFactory;
import _1_Creational._1_AbstractFactory.v2.Framework.Concrete.Factory.SmallPotionFactory;

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

        /*
        //  Linux 용 Gui Factory 를 생성
        IGuiFactory = new LinuxIGuiFactory ();
        print();

        //  Mac 용 Gui Factory 를 생성
        IGuiFactory = new MacIGuiFactory ();
        print();

        //  Window 용 Gui Factory 를 생성
        IGuiFactory = new WinIGuiFactory ();
        print();
        */

        PotionFactory potionFactory;
        HpPotion hpPotion;
        MpPotion mpPotion;

        potionFactory = new LargePotionFactory ();
        hpPotion = potionFactory.createHpPotion ();
        mpPotion = potionFactory.createMpPotion ();

        hpPotion.use ();
        mpPotion.use ();

        potionFactory = new SmallPotionFactory ();
        hpPotion = potionFactory.createHpPotion ();
        mpPotion = potionFactory.createMpPotion ();

        hpPotion.use ();
        mpPotion.use ();

    }

    private void print()
    {
        IButton = IGuiFactory.createButton ();
        ITextArea = IGuiFactory.createTextArea ();

        IButton.click ();
        System.out.println(ITextArea.getText ());
    }
}
