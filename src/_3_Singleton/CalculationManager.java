package _3_Singleton;

import java.util.Calendar;

/**
 * Created by lkh25 on 2017-01-31.
 */
public class CalculationManager
{
    /**
     * CalculationManager를 선언하며
     * 생성자를 private로 지정하여 내부에서만 생성가능하게 ( 외부에서 new 로 생성 불가 )
     * static 으로 선언하여 클래스 변수로 지정
     */
    private static CalculationManager calculationManager;

    /**
     * 외부에서 CalculationManager에서 생성된 객체를 받을 수 있도록 해줌
     *
     * @return CalculationManager  -   생성된 단 하나의 유일한 객체
     */
    public static CalculationManager getInstance ()
    {
        //  만약 클래스 내에서 생성된 인스턴스가 없다면 새롭게 생성을 하며
        //  존재하는 경우에는 생성되어 있는 인스턴스를 반환해줌

        if(calculationManager == null)
        {
            calculationManager = new CalculationManager ();
        }

        return calculationManager;
    }


    /**
     *  이와 같은 방법을 통해 초기에 생성을 하며
     *  중복 생성의 위험과, 생성시간의 단축을 꾀함
     */
    //private static CalculationManager calculationManager = new CalculationManager ();

    /**
     *  이와 같은 방법을 통해 외부에서 getInstance 호출 시 동기화 과정을 거치며
     *  여러 Thread 사용시 발생할 수 있는 문제를 줄임,
     *  단 synchronized 적용 시 동기화 과정으로 인한 성능의 저하가 발생하게 됨

     * @return CalculationManager  -   생성된 단 하나의 유일한 객체
     */
    //public static synchronized  CalculationManager getInstance()


    private int number = 0;

    //  전달받은 숫자만큼 number 값에 더함
    public int plusNumber (int num)
    {
        return number += num ;
    }

    //  전달받은 숫자만큼 number 값에서 뺌
    public int minusNumber(int num)
    {
        return number -= num;
    }
}
