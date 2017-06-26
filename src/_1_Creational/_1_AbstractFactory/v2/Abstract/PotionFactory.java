package _1_Creational._1_AbstractFactory.v2.Abstract;

/**
 * Created by LGH on 2017-06-26.
 */

/**
 *  Abstract Factory
 */
public interface PotionFactory
{
    public HpPotion createHpPotion();
    public MpPotion createMpPotion();
}
