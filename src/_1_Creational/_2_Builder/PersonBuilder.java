package _1_Creational._2_Builder;

/**
 * Created by LGH on 2017-03-16.
 */

/**
 *  Concrete Builder
 *  Builder 패턴을 사용할 수 있는 클래스
 */
public class PersonBuilder
{
    private String name;
    private int age;
    private Person.Sex sex;
    private String tel;
    private String address;

    public PersonBuilder setName(String name)
    {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(int age)
    {
        this.age = age;
        return this;
    }

    public PersonBuilder setSex(Person.Sex sex)
    {
        this.sex = sex;
        return this;
    }

    public PersonBuilder setTel(String tel)
    {
        this.tel = tel;
        return this;
    }

    public PersonBuilder setAddress(String address)
    {
        this.address = address;
        return this;
    }

    /**
     *  현재 객체에 저장된 값들을 이용하여 Person 객체를 생성하여 return 함
     * @return
     */
    public Person build()
    {
        return new Person (name, age, sex, tel, address);
    }
}