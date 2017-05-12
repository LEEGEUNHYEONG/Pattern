package _3_Behavioral._3_Interpreter.Framework;

import java.util.Map;

/**
 * Created by LGH on 2017-05-11.
 */
public class Number implements IExpression
{
    private int number;

    public Number (int number)
    {
        this.number = number;
    }

    @Override
    public int interpret (Map<String, IExpression> var)
    {
        return number;
    }
}
