package _3_Behavioral._2_Command;

/**
 * Created by LGH on 2017-05-03.
 */

/**
 *  Concrete 클래스
 *  Delete 관련한 execute 기능 구현
 */
public class DeleteICommand implements ICommand
{
    private UnitManager unitManager;
    private String name;
    private int x;
    private int y;

    /**
     *  삭제할 유닛의 기본 정보를 설정
     * @param unitManager
     * @param name
     * @param x
     * @param y
     */
    public DeleteICommand (UnitManager unitManager, String name, int x, int y)
    {
        this.unitManager = unitManager;
        this.name = name;
        this.x = x;
        this.y = y;
    }

    /**
     *  UnitManager 에서 유닛을 삭제 함
     */
    @Override
    public void execute ()
    {
        unitManager.deleteUnit (name, x, y);
    }

    @Override
    public String getName ()
    {
        return name;
    }

    @Override
    public int getX ()
    {
        return x;
    }

    @Override
    public int getY ()
    {
        return y;
    }
}

