package _2_Structural._3_Composite;

/**
 * Created by LGH on 2017-04-28.
 */

/**
 *  Component 추상 클래스를 상속받는 File 클래스
 */
public class File extends Component
{
    /**
     *  File 의 이름을 설정
     * @param name  파일 명
     */
    public File (String name)
    {
        super (name);
    }
}
