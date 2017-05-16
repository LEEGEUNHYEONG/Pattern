package _2_Structural._2_Bridge;

/**
 * Created by LGH on 2017-04-27.
 */

/**
 *  Abstract Controller 클래스를 상속받은 Concrete 클래스
 *  실제 사용을 하는 부분
 */
public class Controller extends AbstController
{
    public Controller (IDevice IDevice)
    {
        super (IDevice);
    }
}
