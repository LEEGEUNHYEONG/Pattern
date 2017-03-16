package _1_Creational._1_AbstractFactory.Mac;

import _1_Creational._1_AbstractFactory.Interface.IButton;

/**
 * Created by LGH on 2017-02-10.
 */

/**
 *  IButton 의 기능을 구현하는 MacButton
 *  click 호출 시 클래스 명과 onClick 텍스트 출력
 */
public class MacIButton implements IButton
{
    @Override
    public void click ()
    {
        System.out.println(getClass ().getSimpleName () + " : onClick");
    }
}
