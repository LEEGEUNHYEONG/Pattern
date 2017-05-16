package _3_Behavioral._1_ChainOfResponsibility;

/**
 * Created by LGH on 2017-05-02.
 */
public class ChainOfResponsibilityMain
{
    public ChainOfResponsibilityMain ()
    {
        //  기본 Attack 정보를 생성하며, 초기값을 설정
        Attack attack = new Attack(100);

        //  Armor1 생성
        Armor armor1 = new Armor (10);
        //  Armor2 생성
        Armor armor2 = new Armor (20);
        //  Armor3 생성
        Armor armor3 = new Armor (15);

        //  Armor1 의 다음으로 Armor2 지정
        armor1.setNextIDefence (armor2);
        //  Armor2 의 다음으로 Armor3 지정
        armor2.setNextIDefence (armor3);

        //  초기 Attack 의 값
        System.out.println(attack.getAmount ());

        //  Attack 값을 Armor 수치와 연산 함
        //  Armor1 에서의 연산 이후, Armor2 와 연산하게 되며 이후 Armor3 과의 연산을 통해 최종 값을 계산
        armor1.defence (attack);

        System.out.println("> " + attack.getAmount ());
    }
}
