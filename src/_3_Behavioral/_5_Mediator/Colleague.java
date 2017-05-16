package _3_Behavioral._5_Mediator;

/**
 * Created by LGH on 2017-05-16.
 */

/**
 *  Colleague 추상화 클래스
 *  Name 을 설정하며, 현재 클래스를 등록 할 Mediator 를 전달받음
 */
public abstract class Colleague
{
    public IMediator iMediator;
    public String name;

    public Colleague (String name, IMediator iMediator)
    {
        this.name = name;
        this.iMediator = iMediator;
    }

    /**
     *  Name 을 설정
     * @return
     */
    public String getName()
    {
        return name;
    }

    public abstract void sendMessage(String msg);
    public abstract void recvMessage(String name, String msg);
}
