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
        CalculationManager cm1 = CalculationManager.getInstance();
        CalculationManager cm2 = CalculationManager.getInstance();

        //  cm1 의 인스턴스에 10을 더하면 number 값은 10이 됨
        log.p (cm1.plusNumber (10));

        //  cm2 의 인스턴스에 5를 빼줌
        log.p (cm2.minusNumber (5));

        //  CalculationManager는 Singleton 이므로 cm1 과, cm2 의 number 는 같으므로
        //  출력값은 5가 됨
    }
}
