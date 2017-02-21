package _6_Proxy;

/**
 * Created by LGH on 2017-02-20.
 */

/**
 *  실제 Resource 를 로드하는 클래스
 */
public class LoaderResource implements IResource
{
    private String name;    //  로드하고자 하는 resource 이름

    public LoaderResource (String name)
    {
        this.name = name;
        load();
    }

    /**
     *  실제 로드 동작 수행
     */
    private void load()
    {
        System.out.println(getClass ().getSimpleName () + " : " + name + " : Loading...");
    }

    /**
     *  Display 를 요청 함
     */
    @Override
    public void requestDisplay ()
    {
        System.out.println(getClass ().getSimpleName () + " : " + name + " : Display " );
    }
}
