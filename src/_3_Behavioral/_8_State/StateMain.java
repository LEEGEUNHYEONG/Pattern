package _3_Behavioral._8_State;

import _3_Behavioral._8_State.Status.BlindStatus;
import _3_Behavioral._8_State.Status.NormalStatus;
import _3_Behavioral._8_State.Status.SilenceStatus;
import _3_Behavioral._8_State.Status.StunStatus;

/**
 * Created by LGH on 2017-05-17.
 */
public class StateMain
{
    public StateMain ()
    {
        //  Normal Status 상태의 Unit 을 생성 한 뒤 동작 확인
        Unit unit = new Unit (new NormalStatus ());
        unit.move ();
        unit.attack ();

        //  Unit 의 상태를 Stun 상태로 변경 시킨 뒤 동작 확인
        unit.statusChange (new StunStatus ());
        unit.move ();
        unit.attack ();

        //  Unit 의 상태를 Silence 상태로 변경 시킨 뒤 동작 확인
        unit.statusChange (new SilenceStatus ());
        unit.move ();
        unit.attack ();

        //  Unit 의 상태를 Blind 상태로 변경 시킨 뒤 동작 확인
        unit.statusChange (new BlindStatus ());
        unit.move ();
        unit.attack ();
    }
}
