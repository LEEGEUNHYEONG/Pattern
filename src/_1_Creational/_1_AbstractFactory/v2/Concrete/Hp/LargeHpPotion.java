package _1_Creational._1_AbstractFactory.v2.Concrete.Hp;

import _1_Creational._1_AbstractFactory.v2.Abstract.HpPotion;

/**
 * Created by LGH on 2017-06-26.
 */

/**
 *  Concrete Product A1
 */
public class LargeHpPotion implements HpPotion
{
    @Override
    public void use ()
    {
        System.out.println("많은 체력 회복");
    }
}
