package _3_Singleton;

/**
 * Created by lkh25 on 2017-01-31.
 */
public class CalculationManager
{
    private static CalculationManager calculationManager;

    public static CalculationManager getInstance()
    {
        if(calculationManager == null)
        {
            calculationManager = new CalculationManager();
        }
        return calculationManager;
    }

    private int number = 0;

    public int addNumber(int num)
    {
        return number += num ;
    }


}
