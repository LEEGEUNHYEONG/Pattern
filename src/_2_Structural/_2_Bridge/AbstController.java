package _2_Structural._2_Bridge;

/**
 * Created by LGH on 2017-04-27.
 */

/**
 *  Abstract 클래스
 *  IDevice 인터페이스의 정의 된 기능들을 구현
 */
public abstract class AbstController
{
    private IDevice IDevice;

    public AbstController (IDevice IDevice)
    {
        this.IDevice = IDevice;
    }

    public void turnOn()
    {
        IDevice.turnOn ();
    }

    public void turnOff()
    {
        IDevice.turnOff ();
    }
}
