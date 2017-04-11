package _2_Structural._1_Adapter.Media;

/**
 * Created by LGH on 2017-04-11.
 */

/**
 *  Adapter 를 사용할 수 있는 클래스
 */
public class MediaPlayer implements IMediaPlay
{
    MediaAdapter mediaAdapter;

    /**
     *  Type 에 맞게 MediaAdapter 를 설정 한뒤 Play 동작을 수행 함
     * @param type
     * @param name
     */
    @Override
    public void play (String type, String name)
    {
        if(type.equalsIgnoreCase ("audio"))
        {
            mediaAdapter = new MediaAdapter (type);
            mediaAdapter.play (type, name);
        }
        else if(type.equalsIgnoreCase ("video"))
        {
            mediaAdapter = new MediaAdapter (type);
            mediaAdapter.play (type, name);
        }
        else
        {
            System.out.println("Invalid media type : " + type + " : " + name) ;
        }
    }
}
