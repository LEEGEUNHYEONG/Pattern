package _1_Creational._4_Prototype;

/**
 * Created by LGH on 2017-04-10.
 */
public class PrototypeMain
{
    public PrototypeMain () throws CloneNotSupportedException
    {
        /*
        //  기본 Car 를 Basic 으로 명명함
        Car basicCar = new Car();
        basicCar.setName ("Basic");

        //  Sport Car 를 생성하며 Basic Car 를 복사함
        Car sportsCar = basicCar.copy ();

        //  Sport Car 가 제대로 복사되었다는 것을 이름을 통해 확인
        System.out.println(basicCar.getName () + " > " + sportsCar.getName ());

        //  Sport Car 의 이름을 Sports 로 변경
        sportsCar.setName ("Sports");

        //  Sports Car 의 변경된 이름을 확인
        System.out.println(basicCar.getName () + " > " + sportsCar.getName ());
        */

        Car car = new Car();
        car.setName ("Basic");

        Car racingCar = (Car)car.clone ();
        System.out.println("1 : " + racingCar.getName ());

        racingCar.setName ("Second Car");
        System.out.println("2 : " + racingCar.getName () + " // " + car.getName ());
    }
}

