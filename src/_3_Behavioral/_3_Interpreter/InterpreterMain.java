package _3_Behavioral._3_Interpreter;

import java.util.HashMap;
import java.util.Map;

import _3_Behavioral._3_Interpreter.Framework.IExpression;
import _3_Behavioral._3_Interpreter.Framework.Number;

/**
 * Created by lkh25 on 2017-05-09.
 */
public class InterpreterMain
{
    public InterpreterMain()
    {
        /*  후위 표기식  */
        //  ( x - z ) + w
        String expression = "w x z - +";

        //  Terminal Expression 생성하며 표현식을 설정
        Evaluator evaluator = new Evaluator (expression);

        Map<String, IExpression> variables = new HashMap<String, IExpression> ();
        variables.put ("w", new Number (5));
        variables.put ("x", new Number (10));
        variables.put ("z", new Number (42));

        //  표현식의 결과를 확인
        int result = evaluator.interpret (variables);

        System.out.println(result);
    }
}
