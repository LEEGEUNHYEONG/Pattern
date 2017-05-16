package _3_Behavioral._2_Command;

/**
 * Created by LGH on 2017-05-03.
 */

/**
 *  Concrete 클래스
 *  Create 관련한 execute 기능 구현
 */
public class CreateICommand implements ICommand
{
    private UnitManager unitManager;
    private String name;
    private int x;
    private int y;

    /**
     *  생성할 유닛의 기본 정보를 설정
     * @param unitManager
     * @param name
     * @param x
     * @param y
     */
    public CreateICommand (UnitManager unitManager, String name, int x, int y)
    {
        this.unitManager = unitManager;
        this.name = name;
        this.x = x;
        this.y = y;
    }

    /**
     *  UnitManager 에서 유닛을 생성 함
     */
    @Override
    public void execute ()
    {
        unitManager.createUnit (name, x, y);
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
