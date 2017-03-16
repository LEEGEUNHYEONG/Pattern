package _2_Structural._6_Flyweight;


import java.util.Hashtable;

public class VehicleFactory
{
    //  탈것들의 정보를 저장하는 HashTable
    private Hashtable<String, Vehicle> vehicleHashtable = new Hashtable<> ();

    /**
     *  Hashtable 에서 탈것을 가져 오거나 추가함
     * @param name  탈것의 이름
     * @return  해당 탈것의 객체
     */
    public Vehicle getVehicle(String name)
    {
        //  전달받은 name의 탈것이 hashtable에 존재하는지 확인 함
        Vehicle vehicle = vehicleHashtable.get (name);

        //  존재하지 않는다면 hashtable에 추가 함
        if(vehicle == null)
        {
            vehicle = new Vehicle (name);
            vehicleHashtable.put (name, vehicle);
        }
        return vehicle;
    }

    /**
     *  Hashtable에 저장되어 있는 탈것의 전체 갯수
     * @return size
     */
    public int getSize()
    {
        return vehicleHashtable.size ();
    }
}
