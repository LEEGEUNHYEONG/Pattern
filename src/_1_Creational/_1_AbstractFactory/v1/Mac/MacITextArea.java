package _1_Creational._1_AbstractFactory.v1.Mac;

import _1_Creational._1_AbstractFactory.v1.Interface.ITextArea;

/**
 * Created by LGH on 2017-02-10.
 */

/**
 *  ITextArea 의 기능을 구현하는 MacTextArea
 *  getText 호출 시 해당 클래스 이름과 getText 의 문자열 return
 */
public class MacITextArea implements ITextArea
{
    @Override
    public String getText ()
    {
        return getClass ().getSimpleName () + " get Text";
    }
}
