package _3_Behavioral._10_Template.Framework;

/**
 * Created by LGH on 2017-05-19.
 */

/**
 *  Concrete Class
 */
public class CheesePizza extends Pizza
{
    @Override
    public void setSize ()
    {
        System.out.println("Large Size");
    }

    @Override
    public void setDough ()
    {
        System.out.println("고구마 치즈 도우");
    }

    @Override
    public void setTopping ()
    {
        System.out.println("크림 치즈, 모짜렐라 치즈, 체다 치즈");
    }
}
