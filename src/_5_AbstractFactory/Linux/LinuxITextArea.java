package _5_AbstractFactory.Linux;

import _5_AbstractFactory.Interface.ITextArea;

/**
 * Created by LGH on 2017-02-10.
 */

/**
 *  ITextArea 의 기능을 구현하는 LinuxTextArea
 *  getText 호출 시 해당 클래스 이름과 getText 의 문자열 return
 */
public class LinuxITextArea implements ITextArea
{
    @Override
    public String getText ()
    {
        return getClass ().getSimpleName () + " get Text";
    }
}
