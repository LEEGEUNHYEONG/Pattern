package _2_Structural._6_Flyweight;

/**
 *  IVehicle 에서 정의한 기능들을 실제 구현한 클래스
 */
public class Vehicle implements IVehicle
{
    private StringBuilder sb;

    private String name;
    private int number = 0;     //  mount 한 횟수를 카운트

    //  탈것의 이름을 전달 받음
    public Vehicle (String name)
    {
        this.name = name;
    }

    //  탈것에 올라타는 동작을 수행하며, 그 횟수를 계산하여 출력 함
    @Override
    public void mount ()
    {
        sb = new StringBuilder ()
                .append ("\"").append (name).append ("\"에 탑승 : ")
                .append (++number);

        System.out.println(sb.toString ());
    }
}
