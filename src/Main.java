import java.util.HashMap;
import java.util.Iterator;

import _1_Creational._3_FactoryMethod.FactoryMethodMain;
import _3_Behavioral._10_Template.TemplateMain;
import _3_Behavioral._11_Visitor.VisitorMain;
import _3_Behavioral._3_Interpreter.InterpreterMain;
import _3_Behavioral._4_Iterator.IteratorMain;
import _3_Behavioral._5_Mediator.MediatorMain;
import _3_Behavioral._6_Memento.MementoMain;
import _3_Behavioral._8_State.StateMain;

public class Main
{

    public static void main (String[] args) throws Exception
    {
        /**                 생성 패턴 (Creational Pattern)    */
        /*
         *  Abstract Factory
         *  객체의 집합을 직접 생성하는 것이 아니라 간접적으로 수행하기 위해서 사용
         *  생성 인터페이스만 나타내고 그 구현은 나타나지 않음
         *  여러 객체의 집합 중 원하는 하나의 객체를 생성하고자 하는 경우에 사용 */
        //AbstractFactoryMain abstractFactoryMain = new AbstractFactoryMain ();

        /*
         *  Builder
         *  어떠한 데이터를 이용하여 객체를 생성하는 경우, 그 데이터들을 한꺼번에 입력하는 것이 아니라
         *  그 값들에 맞게 차례대로 입력하여 객체를 생성하고자 하는 경우 사용
         *  객체 생성 시 매개 변수가 많은 경우 사용 ex) StringBuilder   */
        //BuilderMain builderMain = new BuilderMain ();

        /*
         *  FactoryMethod
         *  객체 생성을 상위 클래스에서 하지 않고 하위 클래스에서 결정하여 생성 하는 방법
         *  클래스간의 결합도를 낮추고 효율적인 코드 제어를 위함
         */
        FactoryMethodMain factoryMethodMain = new FactoryMethodMain ();

        /*
         * Singleton
         * 애플리케이션 내에서 오직 하나의 인스턴스만을 가지도록 하는 패턴 
         * 사용하기가 쉽고, 여러 곳에서 데이터를 사용하여야 할 경우 관리하기가 편해짐
         */
        //SingletonMain singletonMain = new SingletonMain();

        /*
         *  Prototype
         *  객체를 복사하고자 할때 사용하며, 인스턴스는 자기자신을 새로운 객체에 복사할 수 있음
         */
        //PrototypeMain prototypeMain = new PrototypeMain ();


        /**                 구조 패턴 (Structural Pattern)    */
        /*
         * Adapter
         * 호환성이 없는 인터페이스의 동작을 사용자가 원하는 다른 인터페이스의 동작으로 수행할 수 있도록
         * 다른 인터페이스로 변환하는 패턴
         */
        //AdapterMain adapterMain = new AdapterMain ();

        /*
         *  Bridge
         *  구현부에서 추상층을 분리하여 각자 독립적으로 변형 가능하게 한 패턴
         *  기능과 구현을 분리해서 사용
         */
        //BridgeMain bridgeMain = new BridgeMain ();

        /*
         *  Composite
         *  객체들의 관계를 트리 구조로 구성
         *  개별 객체 또는 객체들의 잡합을 같은 방법으로 취급
         */
        //CompositeMain compositeMain = new CompositeMain ();

        /*
         *  Decorator
         *  상황에 맞게 객체를 확장시키는 패턴
         *  상속 대신 유연하게 사용할 수 있음
         *  한 객체를 여러 개의 데코레이터로 감쌀 수 있음
         */
        //DecoratorMain decoratorMain = new DecoratorMain ();

        /*
         *  Facade
         *  서브 시스템에 대한 통합된 시스템을 제공하고,
         *  이 통합된 시스템을 통해 서브 시스템에 대한 사용을 손쉽게 만들어 줌
         *  서브 시스템에서의 수정 발생 시, Facade 의 수정을 통해 유연성을 높임
         */
        //FacadeMain facadeMain = new FacadeMain ();

        /*
         *  Flyweight
         *  동일하거나, 유사한 객체들 사이에 많은 데이터를 서로 공유하고,
         *  메모리의 사용량을 최소화 하기 위해 사용 
         */
        //FlyweightMain flyweightMain = new FlyweightMain ();

        /*
         *  Proxy
         *  특정 객체에 대한 접근을 제어하기 위하여 대리자 격인 객체를 이용하는 패턴
         */
        //ProxyMain proxyMain = new ProxyMain ();

        /**                 행동 패턴 (Behavioral Pattern)     */
        /*
         *  Chain of Responsibility ( 책임 연쇄 )
         *  어떠한 연산을 처리할 수 있는 각각의 객체들이 체인과 같이 연결되어 있으며,
         *  해당 객체가 특정 연산을 처리하지 못할 경우 다음 객체로 넘겨 연산을 처리할 수 있도록 하는 패턴
         *  ex) 게임 내 아이템별 스탯에 따른 데미지 계산, Exception 등
         */
        //ChainOfResponsibilityMain chainOfResponsibilityMain = new ChainOfResponsibilityMain ();

        /*
         *  Command
         *  요청을 객체의 형태로 캡슐화, 나중에 이용할 수 있도록 정보를 저장 또는 로깅, 취소 할 수 있게 해주는 패턴
         *  명령 (Command), 수신자(Receiver), 발동자(Invoker), 클라이언트(Client)
         *  ex) Undo, Redo 기능
         *  >>> Memento
         */
        //CommandMain commandMain = new CommandMain();

        /*
         *  Interpreter
         *  문법 규칙을( 심볼 ) 클래스화하여 정의된 언어를 해석하기위해 사용하는 패턴
         *  ex) sql 구문, 통신 프로토콜, ICommand 명령어 등
         */
        //InterpreterMain interpreterMain = new InterpreterMain();

        /*
         *  Iterator
         *  어떠한 목록을 순차적으로 탐색 하는데 사용하는 패턴
         *  ex) 자바 Iterator 인터페이스
         */
        //IteratorMain iteratorMain = new IteratorMain ();

        /*
         *  Mediator
         *  모든 클래스간 로직은 캡슐화 하고 하나의 중재자를 두어 문제를 처리하는 패턴
         *  명령 전달을 위한 인터페이스가 존재하며, 모든 명령은 중재자에서 관리
         *
         *  Observer 와 다른 점으로 Observer 는 각 객체에 업데이트 이벤트를 발생시켜 로직을 처리하지만
          * Mediator 는 Mediator 안에서 모든 로직을 처리 함
         */
        //MediatorMain mediatorMain = new MediatorMain ();

        /*
         *  Memento
         *  객체의 상태 정보를 저장하고 복원하는 역할을 수행할 수 있는 패턴
         *  Originator, Caretaker, Memento
         *  실행 취소
         *  >>> Command
         */
        //MementoMain mementoMain = new MementoMain ();

        /*
         *  Observer
         *  객체의 상태 변화를 관찰하는 옵저버를 등록하여
         *  객체의 상태 변화 발생 시 옵저버에 통지하는 패턴
         */
        //ObserverMain ovObserverMain = new ObserverMain ();

        /*
         *  State
         *  특정한 상태를 캡슐화 한 클래스로 표현 함,
         *  이 클래스를 통해 객체의 상태를 변경할 수 있음
         *
         */
        //StateMain stateMain = new StateMain ();

        /*
         *  Strategy
         *  공통되는 기능을 정의하고 각 클래스 별로 캡슐화하여 교체가 가능 
         *  기능이 정의된 곳과 기능이 구현되는 곳을 분리 
         *  각 클래스의 맞게 기능을 구현하여 사용 가능 
         */
        //StrategyMain strategyMain = new StrategyMain();

        /*
         *  Template Method
         *  상위 클래스에서 처리를 제어하며, 하위 클래스에서는 내용을 구현
         */
        //TemplateMain templateMain = new TemplateMain ();

        /*
         *  Visitor
         *  객체 구조에서 기능을 분리하는 패턴
         *  객체 구조를 돌아다니면서 처리
         *  객체의 구조를 수정하지 않고 새로운 기능을 추가할 수 있음
         *  ex) AnnotationValue, AnnotationValueVisitor
         */
        //VisitorMain visitorMain = new VisitorMain ();


    }
}
