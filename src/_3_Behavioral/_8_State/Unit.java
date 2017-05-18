package _3_Behavioral._8_State;

import _3_Behavioral._8_State.Status.UnitAction;

/**
 * Created by LGH on 2017-05-18.
 */

/**
 *  Context 클래스
 */
public class Unit
{
    private UnitAction unitAction;

    /**
     *  Unit 을 생성 하고 초기 Status 를 설정
     * @param unitAction
     */
    public Unit (UnitAction unitAction)
    {
        this.unitAction = unitAction;
    }

    /**
     *  변경된 Unit 의 Status 를 적용
     * @param unitAction
     */
    public void statusChange (UnitAction unitAction)
    {
        System.out.println("\nstatusChange : " + unitAction.getClass ().getSimpleName ());
        this.unitAction = unitAction;
    }

    public void move()
    {
        unitAction.move ();
    }

    public void attack()
    {
        unitAction.attack ();
    }
}
