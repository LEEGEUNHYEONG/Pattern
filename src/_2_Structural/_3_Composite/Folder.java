package _2_Structural._3_Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LGH on 2017-04-28.
 */

/**
 *  Component 추상 클래스를 상속 받은 Folder 클래스
 *  하위 폴더 또는 파일을 가질 수 있으므로 Component 의 List 를 가지고 있음
 */
public class Folder extends Component
{
    private List<Component> child = new ArrayList<> ();

    /**
     *  Folder 의 이름을 설정
     * @param name  폴더 명
     */
    public Folder (String name)
    {
        super (name);
    }

    /**
     *  현재 폴더에 Component 를 추가 함
     *  이 Component 는 폴더 또는 파일이 될 수 있음
     * @param component
     * @return  List 에 추가 성공 여부
     */
    public boolean addComponent(Component component)
    {
        return child.add (component);
    }

    /**
     *  현재 폴더에 존재하는 Component 의 목록에서 전달받은 Component를 삭제 함
     * @param component
     * @return  List 에서 삭제 성공 여부
     */
    public boolean removeComponent(Component component)
    {
        return child.remove (component);
    }

    /**
     *  현재 폴더의 List 를 반환
     * @return
     */
    public List<Component> getChild()
    {
        return child;
    }


}
