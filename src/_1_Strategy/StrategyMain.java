package _1_Strategy;

import _1_Strategy.Item.Dagger;
import _1_Strategy.Item.Fist;
import _1_Strategy.Item.Sword;
import _1_Strategy.Item.Wand;

/**
 * Created by lkh25 on 2017-01-10.
 */
public class StrategyMain
{
    private CharacterInv characterInv;

    public StrategyMain()
    {
        characterInv = new CharacterInv();

        characterInv.changeWeapon(new Fist());
        characterInv.attack();

        characterInv.changeWeapon(new Dagger());
        characterInv.attack();

        characterInv.changeWeapon(new Sword());
        characterInv.attack();

        characterInv.changeWeapon(new Wand());
        characterInv.attack();
    }
}
