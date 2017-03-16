package _2_Structural._4_Decorator.Item;

/**
 * Created by LGH on 2017-02-06.
 */

/**
 *  Coffee 에 추가 가능한 Shot 클래스 ( 데코레이터 기능을 수행 )
 *  Shot 추가 시 1000원의 금액을 추가 함
 *  생성 시 전달 받은 ICoffee 의 가격에
 *  추가 금액을 더하는 기능을 수행 함
 */
public class Shot implements ICoffee
{
    protected ICoffee ICoffee;

    private int charge = 1000;

    public Shot (ICoffee ICoffee)
    {
        this.ICoffee = ICoffee;
        System.out.println ("샷 추가 + " + charge);
    }

    @Override
    public int getTotalPrice ()
    {
        return ICoffee.getTotalPrice () + charge;
    }
}
