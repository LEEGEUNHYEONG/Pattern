package _1_Creational._1_AbstractFactory.v1.Window;

import _1_Creational._1_AbstractFactory.v1.Interface.ITextArea;

/**
 * Created by LGH on 2017-02-10.
 */

/**
 *  ITextArea 의 기능을 구현하는 WinTextArea
 *  getText 호출 시 해당 클래스 이름과 getText 의 문자열 return
 */
public class WinITextArea implements ITextArea
{
    @Override
    public String getText ()
    {
        return getClass ().getSimpleName () + " get Text";
    }
}
