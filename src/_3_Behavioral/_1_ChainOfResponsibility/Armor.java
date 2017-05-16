package _3_Behavioral._1_ChainOfResponsibility;

/**
 * Created by LGH on 2017-05-02.
 */

/**
 *  IDefence 인터페이스를 구현하는 Armor 클래스
 *  각 Armor 클래스는 다음 Armor 에 대한 정보를 가지며,
 *  방어력 수치를 통해 Attack 에 대한 값을 수정 할 수 있음
 *  Armor 에 연쇄 책임 패턴이 적용 됨 ( nextIDefence 를 통해 다음 Armor 를 가지게 됨 )
 */
public class Armor implements IDefence
{
    private IDefence nextIDefence;
    private int def;

    /**
     *  현재 Armor 의 방어력을 설정
     * @param def
     */
    public Armor (int def)
    {
        this.def = def;
    }

    /**
     *  다음 Armor 에 대한 정보를 가짐
     * @param nextIDefence
     */
    public void setNextIDefence (IDefence nextIDefence)
    {
        this.nextIDefence = nextIDefence;
    }

    /**
     *  현재 방어력을 통해 Attack 값을 수정
     * @param attack
     */
    @Override
    public void defence (Attack attack)
    {
        //  전달 받은 Attack 값에서 현재의 Armor 의 방어력을 적용한 수치를 계산 함
        attack.setAmount (attack.getAmount () - def);

        if(nextIDefence != null)
        {
            //  현재 Armor 의 다음 Armor 에 수정 된 Attack 정보를 넘겨 줌
            nextIDefence.defence (attack);
        }
    }
}
