package Util;

/**
 * Created by lkh25 on 2017-01-10.
 */
public class log
{
    public static void p(String tag, String msg)
    {
        System.out.println(tag + " : " + msg);
    }
    public static void p(String msg)
    {
        System.out.println(msg);
    }

    public static void p(int msg)
    {
        System.out.println(String.valueOf (msg));
    }
}
