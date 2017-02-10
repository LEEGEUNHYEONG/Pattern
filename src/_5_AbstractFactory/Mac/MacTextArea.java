package _5_AbstractFactory.Mac;

import _5_AbstractFactory.Abs.TextArea;

/**
 * Created by LGH on 2017-02-10.
 */
public class MacTextArea implements TextArea
{
    @Override
    public String getText ()
    {
        return getClass ().getSimpleName () + " get Text";
    }
}
