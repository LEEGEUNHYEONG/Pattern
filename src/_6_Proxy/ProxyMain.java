package _6_Proxy;

/**
 * Created by LGH on 2017-02-20.
 */
public class ProxyMain
{
    public ProxyMain ()
    {
        IResource iResource1 = new ProxyResource ("Test1");
        IResource iResource2 = new ProxyResource ("Text2");
        IResource iResource3 = new ProxyResource ("Text3");

        iResource1.requestDisplay ();
        iResource2.requestDisplay ();
        iResource1.requestDisplay ();
        iResource3.requestDisplay ();
        iResource2.requestDisplay ();
    }
}
