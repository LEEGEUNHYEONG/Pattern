package _3_Behavioral._2_Command;

/**
 * Created by LGH on 2017-05-03.
 */

/**
 *  ICommand
 *  execute 명령이 정의되어 있는 인터페이스
 */
public interface ICommand
{
    public void execute();

    public String getName();
    public int getX();
    public int getY();
}
