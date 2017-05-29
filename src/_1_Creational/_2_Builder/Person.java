package _1_Creational._2_Builder;

/**
 * Created by LGH on 2017-03-16.
 */

/**
 *  생성하고자 하는 객체
 */
public class Person
{
    enum Sex {MALE, FEMALE}
    private String name;
    private int age;
    private Sex sex;
    private String tel;
    private String address;

    public Person (String name, int age, Sex sex, String tel, String address)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.tel = tel;
        this.address = address;
    }

    @Override
    public String toString ()
    {
        StringBuilder stringBuilder = new StringBuilder ()
                .append ("{\n")
                .append ("\tname : ").append (name).append (", \n")
                .append ("\tage : ").append (age).append (", \n")
                .append ("\tsex : ").append (sex).append (", \n")
                .append ("\ttel : ").append (tel).append (", \n")
                .append ("\taddress : ").append (address).append (", \n")
                .append ("}");
        return stringBuilder.toString ();
    }

    /**
     * 아래의 함수를 이용해서도 사용 가능
     */
    public static PersonBuilder builder()
    {
        return new PersonBuilder ();
    }
}
