package _3_Behavioral._3_Interpreter.Framework;

import java.util.Map;

/**
 * Created by LGH on 2017-05-11.
 */
public class Plus implements IExpression
{
    IExpression left;
    IExpression right;

    public Plus (IExpression left, IExpression right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret (Map<String, IExpression> var)
    {
        return left.interpret (var) + right.interpret (var);
    }
}
