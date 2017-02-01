package _3_Singleton;

import Util.log;

/**
 * Created by lkh25 on 2017-01-31.
 */
public class SingletonMain
{
    private final String tag = getClass().getSimpleName();

    public SingletonMain()
    {
        CalculationManager calculationManager = CalculationManager.getInstance();
        log.p(tag + " 1 : " + calculationManager.addNumber(3));

        CalculationManager cm = CalculationManager.getInstance();
        log.p(tag + " 2 : " + calculationManager.addNumber(5));

    }
}
