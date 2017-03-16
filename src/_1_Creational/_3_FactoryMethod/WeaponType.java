package _1_Creational._3_FactoryMethod;

/**
 * Created by LGH on 2017-03-16.
 */
public enum WeaponType
{
    STAFF("지팡이"), SWORD("한손 검"), DOUBLE_SWORD("양손 검"), NONE("");

    private String title;

    WeaponType (String title)
    {
        this.title = title;
    }

    @Override
    public String toString ()
    {
        return title;
    }
}
