package _2_Structural._5_Facade;

/**
 * Created by LGH on 2017-05-01.
 */
public class FacadeMain
{
    public FacadeMain ()
    {
        //  Computer 객체를 생성 하며, Facade 패턴을 이용한 구조로 이루어져 있음,
        //  현재 클래스, 즉 main 에서는 Computer 객체의 하위 시스템들에 대해서는 관여하지 않음
        Computer computer = new Computer ();

        //  booting 동작은 Facade 패턴을 이용한 Computer 객체에서의 서브 시스템들의 동작에 대한 통합 메소드
        computer.booting ();

        System.out.println();

        //  terminate 동작은 Facade 패턴을 이용한 Computer 객체에서의 서브 시스템들의 동작에 대한 통합 메소드
        computer.terminate ();
    }
}
