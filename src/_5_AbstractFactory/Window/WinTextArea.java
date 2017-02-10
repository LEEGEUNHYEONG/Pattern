package _5_AbstractFactory.Window;

import _5_AbstractFactory.Abs.TextArea;

/**
 * Created by LGH on 2017-02-10.
 */
public class WinTextArea implements TextArea
{
    @Override
    public String getText ()
    {
        return getClass ().getSimpleName () + " get Text";
    }
}
