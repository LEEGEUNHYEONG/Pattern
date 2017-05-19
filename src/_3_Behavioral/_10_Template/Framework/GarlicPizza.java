package _3_Behavioral._10_Template.Framework;

/**
 * Created by LGH on 2017-05-19.
 */

/**
 *  Concrete Class
 */
public class GarlicPizza extends Pizza
{
    @Override
    public void setSize ()
    {
        System.out.println("Large Size");
    }

    @Override
    public void setDough ()
    {
        System.out.println("고구마 도우");
    }

    @Override
    public void setTopping ()
    {
        System.out.println("쉬림프, 알래스카 크랩스, 갈릭버터 소스, 레몬소스");
    }
}
