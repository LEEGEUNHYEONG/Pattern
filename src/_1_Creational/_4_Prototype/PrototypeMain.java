package _1_Creational._4_Prototype;

/**
 * Created by LGH on 2017-04-10.
 */
public class PrototypeMain
{
    public PrototypeMain () throws CloneNotSupportedException
    {
        //  기본 Car를 Basic으로 명명함
        Car basicCar = new Car();
        basicCar.setName ("Basic");

        //  SprotsCar를 생성하며 Basic Car를 복사함
        Car sportsCar = basicCar.copy ();

        //  SportsCar가 제대로 복사되었다는 것을 이름을 통해 확인
        System.out.printf(sportsCar.getName ());

        //  SportsCar의 이름을 Sports로 변경
        sportsCar.setName ("Sports");

        //  SportsCar의 변경된 이름을 확인
        System.out.printf(" > " + sportsCar.getName ());
    }
}
