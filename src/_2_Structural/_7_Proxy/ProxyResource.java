package _2_Structural._7_Proxy;

/**
 * Created by LGH on 2017-02-20.
 */

/**
 *  Resource 로드에 대한 동작을 대신 수행하는 클래스
 */
public class ProxyResource implements IResource
{
    private String name;    //  로드하고자 하는 resource 이름
    private IResource iResource;

    public ProxyResource (String name)
    {
        this.name = name;
    }

    /**
     *  Display 를 요청 함
     */
    @Override
    public void requestDisplay ()
    {
        if(iResource == null)
        {
            iResource = new LoaderResource (name);     //  생성된 객체가 없다면 생성을 수행
        }
        iResource.requestDisplay ();   //  생성된 객체에 display 를 요청
    }
}
