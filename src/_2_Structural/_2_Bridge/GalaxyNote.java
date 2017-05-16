package _2_Structural._2_Bridge;

/**
 * Created by LGH on 2017-04-27.
 */

/**
 *  IDevice 의 기능을 수행할 수 있는 GalaxyNote 클래스
 */
public class GalaxyNote implements IDevice
{
    @Override
    public void turnOn ()
    {
        System.out.println(getClass ().getSimpleName () + " : turnOn");
    }

    @Override
    public void turnOff ()
    {
        System.out.println(getClass ().getSimpleName () + " : turnOff");
    }
}
