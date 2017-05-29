package _1_Creational._2_Builder;

/**
 * Created by LGH on 2017-03-16.
 */
public class BuilderMain
{
    public BuilderMain ()
    {
        //  기본 객체 생성의 경우, 파라미터를 잘못 입력할 수도 있음
        Person p = new Person (null, 0, null, null, null);
        System.out.println(p.toString ());

        //  PersonBuilder 를 이용하여 Person 객체를 생성
        Person person = new PersonBuilder ()
                .setName ("Lee Geun Hyeong")
                .setAge (29)
                .setSex (Person.Sex.MALE)
                .setTel ("000-0000-0000")
                .setAddress ("Daegu")
                .build ();

        System.out.println(person.toString ());
    }
}
