package _2_Structural._1_Adapter;

import _2_Structural._1_Adapter.Audio.AudioPlayer;
import _2_Structural._1_Adapter.Audio.IAudioPlay;
import _2_Structural._1_Adapter.Media.IMediaPlay;
import _2_Structural._1_Adapter.Media.MediaPlayer;
import _2_Structural._1_Adapter.Video.IVideoPlay;
import _2_Structural._1_Adapter.Video.VideoPlayer;

/**
 * Created by LGH on 2017-04-11.
 */
public class AdapterMain
{
    public AdapterMain ()
    {
        /**
         * 기존에 아래와 같이 사용하던 각각의 Audio & Video Player 를 MediaPlayer 로 합치려고 함
         * 각 Player 는 play 라는 기능을 가지고 있지만, 그 동작을 수행하는 인터페이스는 다름
         */
        IAudioPlay iAudioPlay = new AudioPlayer ();
        iAudioPlay.play ("audio 1");

        IVideoPlay iVideoPlay = new VideoPlayer ();
        iVideoPlay.play ("video 1");

        System.out.println();

        /**
         * Adapter 패턴을 적용하여 MediaPlayer 에서 Audio 와 Video 의 Play 기능을 수행
         */
        IMediaPlay mediaPlay = new MediaPlayer ();

        mediaPlay.play ("audio", "audio 1");
        mediaPlay.play ("video", "video 1");
        mediaPlay.play ("mp3", "music 1");
        mediaPlay.play ("mp4 ", "movie 2");
    }
}
