package _6_Proxy;

/**
 * Created by LGH on 2017-02-20.
 */
public class ProxyRequest implements IRequest
{
    private String msg;
    private IRequest iRequest;

    public ProxyRequest (String msg)
    {
        this.msg = msg;
    }

    @Override
    public void request ()
    {
        if(iRequest == null)
        {
            iRequest = new RequestLoader (msg);
        }
        iRequest.request ();
    }
}
