package _3_Behavioral._5_Mediator;

import java.util.ArrayList;

/**
 * Created by LGH on 2017-05-16.
 */

/**
 *  Concrete Mediator 클래스
 *  IMediator 인터페이스에 정의된 기능을 구현
 *  중재자의 역할을 수행하며 모든 로직들을 처리 함
 */
public class ConcreteMediator implements IMediator
{
    //  클래스의 목록을 저장하는 리스트
    private ArrayList<Colleague> colleagues = new ArrayList<> ();

    public ConcreteMediator ()
    {

    }

    /**
     * 클래스들을 리스트에 추가 함
     * @param colleague
     */
    public void addColleague(Colleague colleague)
    {
        colleagues.add (colleague);
    }


    /**
     *  전달 받은 명령 ( 메시지 전달 )을 수행
     *  발송한 객체와 전달받을 객체가 다를 경우에만 수행
     * @param name
     * @param msg
     */
    @Override
    public void sendMessage (String name, String msg)
    {
        for(Colleague colleague : colleagues)
        {
            if(!colleague.getName ().equals (name))
            {
                colleague.recvMessage (name, msg);
            }
        }
    }
}
