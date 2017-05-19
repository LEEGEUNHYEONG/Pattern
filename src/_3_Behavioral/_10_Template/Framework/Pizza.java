package _3_Behavioral._10_Template.Framework;

/**
 * Created by LGH on 2017-05-19.
 */

/**
 *  Abstract Class
 */
public abstract class Pizza
{
    public void cook()
    {
        System.out.println(getClass ().getSimpleName () + " 요리 시작");
        setSize();
        setDough ();
        setTopping ();
        System.out.println(getClass ().getSimpleName () + " 요리 끝\n");
    }

    protected abstract void setSize();
    protected abstract void setDough();
    protected abstract void setTopping();
}
