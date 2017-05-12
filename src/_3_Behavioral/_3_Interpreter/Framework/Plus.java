package _3_Behavioral._3_Interpreter.Framework;

import java.util.Map;

/**
 * Created by LGH on 2017-05-11.
 */

/**
 *  Plus 토큰의 동작을 수행하는 클래스
 */
public class Plus implements IExpression
{
    //  토큰의 왼쪽에 배치 되는 값
    IExpression left;
    //  토큰의 오른쪽에 배치 되는 값
    IExpression right;

    /**
     *  계산되는 값들을 설정
     * @param left  왼쪽에 배치 되는 값
     * @param right 오른쪽에 배치 되는 값
     */
    public Plus (IExpression left, IExpression right)
    {
        this.left = left;
        this.right = right;
    }

    /**
     *  실제 Plus 의 동작을 수행하여 결과 반환
     * @param var
     * @return
     */
    @Override
    public int interpret (Map<String, IExpression> var)
    {
        return left.interpret (var) + right.interpret (var);
    }
}
