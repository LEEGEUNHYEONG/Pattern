import _1_Creational._2_Builder.BuilderMain;
import _1_Creational._3_FactoryMethod.FactoryMethodMain;
import _1_Creational._4_Prototype.PrototypeMain;
import _2_Structural._1_Adapter.AdapterMain;
import _2_Structural._2_Bridge.BridgeMain;
import _2_Structural._3_Composite.CompositeMain;

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
        //FactoryMethodMain factoryMethodMain = new FactoryMethodMain ();

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
        CompositeMain compositeMain = new CompositeMain ();

        /*
         *  Decorator
         *  상황에 맞게 객체를 확장시키는 패턴
         *  상속 대신 유연하게 사용할 수 있음
         *  한 객체를 여러 개의 데코레이터로 감쌀 수 있음
         */
        //DecoratorMain decoratorMain = new DecoratorMain ();

        /*
         *  Facade
         */

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
         *  Chain of Responsibility
         */

        /*
         *  Command
         */

        /*
         *  Interpreter
         */

        /*
         *  Iterator
         */

        /*
         *  Mediator
         */

        /*
         *  Memento
         */

        /*
         *  Observer
         *  객체의 상태 변화를 관찰하는 옵저버를 등록하여
         *  객체의 상태 변화 발생 시 옵저버에 통지하는 패턴
         */
        //ObserverMain ovObserverMain = new ObserverMain ();

        /*
         *  State
         */

        /*
         *  Strategy
         *  공통되는 기능을 정의하고 각 클래스 별로 캡슐화하여 교체가 가능 
         *  기능이 정의된 곳과 기능이 구현되는 곳을 분리 
         *  각 클래스의 맞게 기능을 구현하여 사용 가능 
         */
        //StrategyMain strategyMain = new StrategyMain();

        /*
         *  Template Method
         */

        /*
         *  Visitor
         */

    }
}
