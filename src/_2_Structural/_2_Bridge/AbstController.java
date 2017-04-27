package _2_Structural._2_Bridge;

/**
 * Created by LGH on 2017-04-27.
 */

/**
 *  Abstract 클래스
 *  Device 인터페이스의 정의 된 기능들을 구현
 */
public abstract class AbstController
{
    private Device device;

    public AbstController (Device device)
    {
        this.device = device;
    }

    public void turnOn()
    {
        device.turnOn ();
    }

    public void turnOff()
    {
        device.turnOff ();
    }
}
