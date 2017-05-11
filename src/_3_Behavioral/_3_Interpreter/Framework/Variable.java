package _3_Behavioral._3_Interpreter.Framework;

import java.util.Map;

import _3_Behavioral._3_Interpreter.Framework.IExpression;

/**
 * Created by LGH on 2017-05-11.
 */
public class Variable implements IExpression
{
    private String name;

    public Variable (String name)
    {
        this.name = name;
    }

    @Override
    public int interpret (Map<String, IExpression> var)
    {
        if(var.get (name) == null)
        {
            return 0;
        }
        return var.get (name).interpret (var);
    }
}
