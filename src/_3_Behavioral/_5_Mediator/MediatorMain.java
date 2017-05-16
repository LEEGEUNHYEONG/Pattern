package _3_Behavioral._5_Mediator;

/**
 * Created by LGH on 2017-05-15.
 */
public class MediatorMain
{
    public MediatorMain ()
    {
        //  Mediator 생성
        IMediator mediator = new ConcreteMediator ();

        //  각각의 Colleague 들을 생성
        ConcreteColleague desktop = new ConcreteColleague ("Desktop", mediator);
        ConcreteColleague smartPhone = new ConcreteColleague ("SmartPhone", mediator);
        ConcreteColleague tablet = new ConcreteColleague ("Tablet", mediator);

        //mediator.addColleague (desktop);
        //mediator.addColleague (smartPhone);
        //mediator.addColleague (tablet);

        //  Mediator 를 통해 수행하고자 하는 명령 호출
        desktop.sendMessage ("Hi");
        System.out.println();
        smartPhone.sendMessage ("Hello");
        System.out.println();
        tablet.sendMessage ("Welcome");

    }
}
