package _3_Behavioral._3_Interpreter.Framework;

import java.util.Map;

/**
 * Created by LGH on 2017-05-11.
 */

/**
 *  공통된 인터페이스 정의
 */
public interface IExpression
{
    public int interpret(Map<String, IExpression> var);
}
