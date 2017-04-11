package _2_Structural._1_Adapter.Video;

/**
 * Created by LGH on 2017-04-11.
 */

/**
 *  기존의 Video 의 Play 를 수행하는 클래스
 */
public class VideoPlayer implements IVideoPlay
{
    @Override
    public void play (String name)
    {
        System.out.println(getClass ().getSimpleName () + " play : " + name);
    }
}
