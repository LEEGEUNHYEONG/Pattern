package _3_Behavioral._3_Interpreter;

import java.util.Map;

import _3_Behavioral._3_Interpreter.Framework.IExpression;

/**
 * Created by LGH on 2017-05-11.
 */
public class Evaluator implements IExpression
{
    private IExpression IExpression;

    public Evaluator (IExpression IExpression)
    {
        this.IExpression = IExpression;
    }

    @Override
    public int interpret (Map<String, IExpression> var)
    {
        return IExpression.interpret (var);
    }
}
