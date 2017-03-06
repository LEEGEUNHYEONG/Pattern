package _7_Flyweight;

/**
 * Created by LGH on 2017-03-06.
 */
public class FlyweightMain
{
    /**
     *  Flyweight
     *  동일하거나, 유사한 객체들 사이에 많은 데이터를 서로 공유하기 위함
     *  메모리의 사용량을 최소화 함
     */
    public FlyweightMain ()
    {
        VehicleFactory vehicleFactory = new VehicleFactory ();
        Vehicle vehicle1 = vehicleFactory.getVehicle ("x-53 관광 로켓");
        Vehicle vehicle2 = vehicleFactory.getVehicle ("순혈 불꽃매");
        Vehicle vehicle3 = vehicleFactory.getVehicle ("x-53 관광 로켓");
        Vehicle vehicle4 = vehicleFactory.getVehicle ("군청색 퀴라지 전차");
        Vehicle vehicle5 = vehicleFactory.getVehicle ("보라색 원시비룡");
        Vehicle vehicle6 = vehicleFactory.getVehicle ("x-53 관광 로켓");
        Vehicle vehicle7 = vehicleFactory.getVehicle ("군청색 퀴라지 전차");

        vehicle1.mount ();
        vehicle2.mount ();
        vehicle3.mount ();
        vehicle4.mount ();
        vehicle5.mount ();
        vehicle6.mount ();
        vehicle7.mount ();

        System.out.println("\ntotal Size : " + vehicleFactory.getSize ());



    }
}
