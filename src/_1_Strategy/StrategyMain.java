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
        //  Weapon을 사용하기 위한 CharacterInv
        characterInv = new CharacterInv();

        //  Fist를 설정
        characterInv.changeWeapon(new Fist());
        characterInv.attack();

        //  Dagger를 설정
        characterInv.changeWeapon(new Dagger());
        characterInv.attack();

        //  Sword를 설정
        characterInv.changeWeapon(new Sword());
        characterInv.attack();

        //  Wand를 설정
        characterInv.changeWeapon(new Wand());
        characterInv.attack();
    }
}
