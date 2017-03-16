package _2_Structural._4_Decorator.Item;

/**
 * Created by LGH on 2017-02-06.
 */


/**
 *  Coffee 의 기본이 되는 클래스
 *  기본 가격은 2000원으로 설정,
 *  ICoffee 인터페이스를 통해 Coffee 의 가격을 리턴해줌
 */
public class Coffee implements ICoffee
{
    private int charge = 2000;

    @Override
    public int getTotalPrice ()
    {
        return charge;
    }
}
