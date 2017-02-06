package _4_Decorator;

import _4_Decorator.Item.Coffee;
import _4_Decorator.Item.ICoffee;
import _4_Decorator.Item.Whipping;
import _4_Decorator.Item.Shot;

/**
 * Created by LGH on 2017-02-06.
 */
public class DecoratorMain
{
    public DecoratorMain ()
    {
        //  기본 Coffee 를 생성한 뒤 가격 확인
        ICoffee iCoffee = new Coffee ();
        System.out.println(Coffee.class.getSimpleName () + " : " + iCoffee.getTotalPrice ());

        //  생성한 Coffee 에 Shot 을 추가 한 뒤, 추가된 가격을 확인
        iCoffee = new Shot (iCoffee);
        System.out.println (" total : " + iCoffee.getTotalPrice ());

        //  생성한 Coffee 에 Whipping 을 추가 한 뒤, 추가된 가격을 확인
        iCoffee = new Whipping (iCoffee);
        System.out.println (" total : " + iCoffee.getTotalPrice ());
    }
}
