package _6_Proxy;

import Util.log;

/**
 * Created by LGH on 2017-02-20.
 */
public class RequestLoader implements IRequest
{
    private String msg;

    public RequestLoader (String msg)
    {
        log.p (getClass ().getSimpleName (), "RequestLoader Create : " + msg);
        this.msg = msg;
    }

    @Override
    public void request ()
    {
        print();
    }

    private void print()
    {
        log.p (getClass ().getSimpleName (), msg);
    }
}
