package _3_Behavioral._10_Template.Framework;

/**
 * Created by LGH on 2017-05-19.
 */

/**
 *  Concrete Class
 */
public class BitePizza extends Pizza
{
    @Override
    public void setSize ()
    {
        System.out.println("Medium Size");
    }

    @Override
    public void setDough ()
    {
        System.out.println("바이트 버거패티 도우");
    }

    @Override
    public void setTopping ()
    {
        System.out.println("양배추, 브로콜리, 타르타르 소스, 브라운 소스 ");
    }
}
