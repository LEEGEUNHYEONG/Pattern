package _3_Behavioral._2_Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LGH on 2017-05-03.
 */

/**
 *  Invoker 역할 클래스
 *  명령들이 존재하며 동작을 요구하는 클래스
 */
public class MapEditor
{
    private UnitManager unitManager = new UnitManager ();

    //  명령들을 리스트 관리
    private List<Command> commandList = new ArrayList<> ();

    private int position = 0;

    /**
     *  유닛 생성 명령
     * @param name
     * @param x
     * @param y
     */
    public void create(String name, int x, int y)
    {
        Command command = new CreateCommand(unitManager, name, x, y);
        command.execute ();

        commandList.add (command);
        position++;
    }

    /**
     *  유닛 삭제 명령
     * @param name
     * @param x
     * @param y
     */
    public void delete(String name, int x, int y)
    {
        Command command = new DeleteCommand (unitManager, name, x, y);
        command.execute ();

        commandList.add (command);
        position++;
    }

    /**
     *  이전 동작에서부터 최근 동작으로 재 수행
     * @param step
     */
    public void redo(int step)
    {
        System.out.println("----- Redo " + step + " -----");
        for(int i = 0; i < step; i++)
        {
            if(position <= commandList.size () - 1)
            {
                Command command = commandList.get (position++);
                command.execute ();
            }
        }
        System.out.println();
    }

    /**
     *  최근 동작에서부터 이전동작으로 되돌림
     * @param step
     */
    public void undo(int step)
    {
        System.out.println("----- Undo " + step + " -----");
        for(int i = 0; i < step; i++)
        {
            if(position > 0)
            {
                Command command = commandList.get (--position);

                if(command.getClass ().equals (CreateCommand.class))
                {
                    Command temp = new DeleteCommand(unitManager, command.getName (), command.getX (), command.getY ());
                    temp.execute ();
                }
                else
                {
                    Command temp = new CreateCommand (unitManager, command.getName (), command.getX (), command.getY ());
                    temp.execute ();
                }
            }
        }
        System.out.println();

    }
}
