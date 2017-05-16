package _3_Behavioral._5_Mediator;

/**
 * Created by LGH on 2017-05-16.
 */

/**
 *  Mediator 가 명령 전달을 수행하기 위해
 *  기능이 정의된 인터페이스
 */
public interface IMediator
{
    public void sendMessage(String name, String msg);
    public void addColleague(Colleague colleague);
}
