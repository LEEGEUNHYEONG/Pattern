package _3_Behavioral._2_Command;

/**
 * Created by LGH on 2017-05-03.
 */

/**
 *  Receiver 역할 클래스
 *
 */
public class UnitManager
{
    /**
     *  유닛 생성에 대한 실제 동작이 구현되어 있는 메소드
     * @param name
     * @param x
     * @param y
     */
    public void createUnit(String name, int x, int y)
    {
        System.out.println("create : " + name + " : " + x + " , " + y);
    }

    /**
     *  유닛 삭제에 대한 실제 동작이 구현되어 있는 메소드
     * @param name
     * @param x
     * @param y
     */
    public void deleteUnit(String name, int x, int y)
    {
        System.out.println("delete : " + name + " : " + x + " , " + y);
    }
}
