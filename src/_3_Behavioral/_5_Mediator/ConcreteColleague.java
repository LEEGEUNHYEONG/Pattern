package _3_Behavioral._5_Mediator;

/**
 * Created by LGH on 2017-05-16.
 */

/**
 *  Concrete Colleague 클래스
 *  Colleague 클래스를 상속받으며
 *  Mediator 로 부터 전달받은 명령을 수행
 */
public class ConcreteColleague extends Colleague
{
    public ConcreteColleague (String name, IMediator iMediator)
    {
        super(name, iMediator);
        //  Mediator 의 클래스 리스트에 현재 Colleague 클래스를 등록
        iMediator.addColleague (this);
    }

    /**
     *  메시지 발신을 수행 하며 Mediator 에서 로직을 처리하도록 함
     */
    @Override
    public void sendMessage (String msg)
    {
        System.out.println(name + " send message : " + msg);
        iMediator.sendMessage (name, msg);
    }

    /**
     *  Mediator 에서 각 클래스로 메시지 전달 로직이 처리 되었으며
     *  그 명령을 수행 함
     * @param name
     * @param msg
     */
    @Override
    public void recvMessage (String name, String msg)
    {
        System.out.println(this.name + " recv message from > " + name + " : "  + msg);
    }
}
