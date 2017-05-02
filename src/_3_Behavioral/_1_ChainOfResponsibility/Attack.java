package _3_Behavioral._1_ChainOfResponsibility;

/**
 * Created by LGH on 2017-05-02.
 */

/**
 *  Attack 정보를 가지는 클래스
 */
public class Attack
{
    //  Attack 수치 값
    private int amount;

    /**
     *  Attack 수치를 설정
     * @param amount
     */
    public Attack (int amount)
    {
        this.amount = amount;
    }

    public int getAmount ()
    {
        return amount;
    }

    public void setAmount (int amount)
    {
        this.amount = amount;
    }
}
