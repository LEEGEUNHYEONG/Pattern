package _1_Creational._2_Builder;

/**
 * Created by LGH on 2017-03-16.
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

    public Person build()
    {
        return new Person (name, age, sex, tel, address);
    }
}
