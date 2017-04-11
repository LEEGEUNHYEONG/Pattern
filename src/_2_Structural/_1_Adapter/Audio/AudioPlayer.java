package _2_Structural._1_Adapter.Audio;

/**
 * Created by LGH on 2017-04-11.
 */

/**
 *  기존의 Audio 의 Play 를 수행하는 클래스
 */
public class AudioPlayer implements IAudioPlay
{

    @Override
    public void play (String name)
    {
        System.out.println(getClass ().getSimpleName () + " play : " + name);
    }
}
