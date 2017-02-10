package _5_AbstractFactory.Linux;

import _5_AbstractFactory.Abs.TextArea;

/**
 * Created by LGH on 2017-02-10.
 */
public class LinuxTextArea implements TextArea
{
    @Override
    public String getText ()
    {
        return getClass ().getSimpleName () + " get Text";
    }
}
