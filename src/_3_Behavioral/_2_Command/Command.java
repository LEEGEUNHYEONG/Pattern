package _3_Behavioral._2_Command;

/**
 * Created by LGH on 2017-05-03.
 */

/**
 *  Command
 *  execute 명령이 정의되어 있는 인터페이스
 */
public interface Command
{
    public void execute();

    public String getName();
    public int getX();
    public int getY();
}
