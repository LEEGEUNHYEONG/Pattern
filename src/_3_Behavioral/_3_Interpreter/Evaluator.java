package _3_Behavioral._3_Interpreter;

import java.util.Map;
import java.util.Stack;

import _3_Behavioral._3_Interpreter.Framework.IExpression;
import _3_Behavioral._3_Interpreter.Framework.Minus;
import _3_Behavioral._3_Interpreter.Framework.Plus;
import _3_Behavioral._3_Interpreter.Framework.Variable;

/**
 * Created by LGH on 2017-05-11.
 */

/**
 *  Terminal Expression 클래스
 */
public class Evaluator implements IExpression
{
    private IExpression expression;

    public Evaluator (String exp)
    {
        //  Stack 생성
        Stack<IExpression> expressionStack = new Stack<> ();

        //  공백을 기준으로 문자열을 구분 함
        for(String token : exp.split (" "))
        {
            //  문자열이 + 인 경우
            if(token.equals ("+"))
            {
                //  Stack 에 저장된 두 값을 pop 하여
            //  Plus 표현식을 생성한뒤 Stack 에 추가
            IExpression subExpression = new Plus (expressionStack.pop (), expressionStack.pop ());
            expressionStack.push (subExpression);
        }
        //  문자열이 - 인 경우
            else if(token.equals ("-"))
            {
                //  Stack 에 저장된 두 값을 pop 한뒤
                //  Minus 표현식을 생성한뒤 Stack 에 추가
                IExpression right = expressionStack.pop ();
                IExpression left = expressionStack.pop ();
                IExpression subExpression = new Minus (left, right);
                expressionStack.push (subExpression);
            }
            //  문자열이 토큰 외의 숫자인 경우
            else
            {
                //  숫자를(String 형식) Stack 에 push 함
                expressionStack.push (new Variable (token));
            }
        }
        //  모든 연산이 끝났으므로 Stack 에 저장된 최종 표현식을 expression 에 저장
        expression = expressionStack.pop ();
    }

    @Override
    public int interpret (Map<String, IExpression> var)
    {
        return expression.interpret (var);
    }
}
