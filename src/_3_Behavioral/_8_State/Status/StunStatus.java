package _3_Behavioral._8_State.Status;

/**
 * Created by LGH on 2017-05-18.
 */

/**
 *  ConcreteState 클래스
 *  유닛이 Stun 상태에 빠지게 되었을때의
 *  취할 수 있는 Action 을 구현한 클래스
 */
public class StunStatus implements UnitAction
{
    @Override
    public void move ()
    {
        System.out.println("이동 불가");
    }

    @Override
    public void attack ()
    {
        System.out.println("공격 불가");
    }
}
