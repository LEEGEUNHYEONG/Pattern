package _1_Creational._1_AbstractFactory.v1.Interface;

/**
 * Created by LGH on 2017-02-10.
 */

/**
 *  Button 과 TextArea 의 생성기능을 담당하는 Factory Interface
 */
public interface IGuiFactory
{
    public IButton createButton();
    public ITextArea createTextArea();
}
