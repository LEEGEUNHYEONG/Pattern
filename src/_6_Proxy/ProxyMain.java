package _6_Proxy;

import Util.log;

/**
 * Created by LGH on 2017-02-20.
 */
public class ProxyMain
{
    public ProxyMain ()
    {
        log.p (getClass ().getSimpleName (), "ProxyMain Start");

        IRequest iRequest1 = new ProxyRequest ("qwerasdfzxcv");
        IRequest iRequest2 = new ProxyRequest ("asdfasdf");
        IRequest iRequest3 = new ProxyRequest ("zxcvzxcv");
        IRequest iRequest4 = new ProxyRequest ("12341234");
        IRequest iRequest5 = new ProxyRequest ("4567890");

        iRequest1.request ();
        iRequest2.request ();
        iRequest3.request ();
        iRequest4.request ();
        iRequest5.request ();



    }
}
