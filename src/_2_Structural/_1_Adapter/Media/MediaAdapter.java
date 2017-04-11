package _2_Structural._1_Adapter.Media;

import _2_Structural._1_Adapter.Audio.AudioPlayer;
import _2_Structural._1_Adapter.Audio.IAudioPlay;
import _2_Structural._1_Adapter.Video.IVideoPlay;
import _2_Structural._1_Adapter.Video.VideoPlayer;

/**
 * Created by LGH on 2017-04-11.
 */

/**
 *  Adapter 클래스로 IMediaPlay 의 동작을 실제로 수행
 */
public class MediaAdapter implements IMediaPlay
{
    IAudioPlay iAudioPlay;
    IVideoPlay iVideoPlay;

    /**
     *  전달받은 type 에 맞게 기존의 Player 를 생성
     * @param type
     */
    public MediaAdapter (String type)
    {
        if(type.equalsIgnoreCase ("audio"))
        {
            iAudioPlay = new AudioPlayer ();
        }
        else if(type.equalsIgnoreCase ("video"))
        {
            iVideoPlay = new VideoPlayer ();
        }
    }

    /**
     *  전달받은 type 에 맞게 기존의 Player 에서 Play 를 호출
     * @param type
     * @param name
     */
    @Override
    public void play (String type, String name)
    {
        if(type.equalsIgnoreCase ("audio"))
        {
            iAudioPlay.play (name);
        }
        else if(type.equalsIgnoreCase ("video"))
        {
            iVideoPlay.play (name);
        }
    }
}
