import _7_Flyweight.FlyweightMain;

public class Main
{

    public static void main (String[] args)
    {
        //StrategyMain strategyMain = new StrategyMain();
        //ObserverMain ovObserverMain = new ObserverMain ();
        //SingletonMain singletonMain = new SingletonMain();
        //DecoratorMain decoratorMain = new DecoratorMain ();
        //AbstractFactoryMain abstractFactoryMain = new AbstractFactoryMain ();
        //ProxyMain proxyMain = new ProxyMain ();
        FlyweightMain flyweightMain = new FlyweightMain ();

/*
        1. 생성 패턴 (Creational Pattern)
            Abstract Factory
                객체의 집합을  직접 생성하는 것이 아니라 간접적으로 수행하기 위해서 사용
                생성 인터페이스만 나타내고 그 구현은 나타나지 않음
                여러 객체의 집합 중 원하는 하나의 객체를 생성하고자 하는 경우에 사용 
            Builder

            Factory Method

            Prototype

            Singleton
                애플리케이션 내에서 오직 하나의 인스턴스만을 가지도록 하는 패턴 
                사용하기가 쉽고, 여러 곳에서 데이터를 사용하여야 할 경우 관리하기가 편해짐

        2. 구조 패턴 (Structural Pattern)
            Adapter

            Bridge

            Composite

            Decorator
                상황에 맞게 객체를 확장시키는 패턴
                상속 대신 유연하게 사용할 수 있음
                한 객체를 여러 개의 데코레이터로 감쌀 수 있음

            Facade

            Flyweight
                동일하거나, 유사한 객체들 사이에 많은 데이터를 서로 공유하고,
                메모리의 사용량을 최소화 하기 위해 사용 

            Proxy
                특정 객체에 대한 접근을 제어하기 위하여 대리자 격인 객체를 이용하는 패턴

        3. 행동 패턴 (Behavioral Pattern)

            Chain of Responsibility

            Command

            Interpreter

            Iterator

            Mediator

            Memento

            Observer
                객체의 상태 변화를 관찰하는 옵저버를 등록하여
                객체의 상태 변화 발생 시 옵저버에 통지하는 패턴

            State

            Strategy
                공통되는 기능을 정의하고 각 클래스 별로 캡슐화하여 교체가 가능 
                기능이 정의된 곳과 기능이 구현되는 곳을 분리 
                각 클래스의 맞게 기능을 구현하여 사용 가능 

            Template Method

            Visitor
*/


    }
}
